package br.com.udemy.springcloud.servicefornecedor.entity;

import br.com.udemy.springcloud.servicefornecedor.controller.form.ItemDoPedidoForm;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@RequiredArgsConstructor
public class PedidoItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer quantidade;
    private Long idProduto;

    public PedidoItem(ItemDoPedidoForm produto) {
        idProduto = produto.getIdProduto();
        quantidade = produto.getQuantidade();
    }
}
