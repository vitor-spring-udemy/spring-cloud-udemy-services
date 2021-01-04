package br.com.udemy.springcloud.servicefornecedor.entity;

import br.com.udemy.springcloud.servicefornecedor.controller.form.ItemDoPedidoForm;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Entity
@Getter
@RequiredArgsConstructor
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer tempoDePreparo;
    private String dataDisponibilidade;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "pedidoId")
    private List<PedidoItem> itens;

    @Enumerated(value = EnumType.STRING)
    private PedidoStatus status;

    public Pedido(List<ItemDoPedidoForm> produtos) {

        Random random = new Random();
        tempoDePreparo = random.nextInt(7) + 1;
        status = PedidoStatus.RECEBIDO;
        dataDisponibilidade = LocalDateTime.now().plusDays(tempoDePreparo).format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));


        itens = produtos.stream().map(produto -> {
            PedidoItem item = new PedidoItem(produto);
            return item;
        }).collect(Collectors.toList());

    }

    public void estaPreparado() {
        status = PedidoStatus.PREPARADO;
    }
}
