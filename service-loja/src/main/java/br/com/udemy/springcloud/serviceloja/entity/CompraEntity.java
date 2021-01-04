package br.com.udemy.springcloud.serviceloja.entity;

import br.com.udemy.springcloud.serviceloja.controller.form.CompraForm;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Getter
@RequiredArgsConstructor
public class CompraEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPedido;
    private String enderecoDestino;
    private String estadoDestino;
    private LocalDate previsaoParaEntrega;
    @Enumerated(EnumType.STRING)
    private CompraState state;

    public CompraEntity(CompraForm formCompra) {

        enderecoDestino = formCompra.getEnderecoDestino();
        state = CompraState.PEDIDO_FEITO;
        estadoDestino = formCompra.getEstadoDestino();

    }


}
