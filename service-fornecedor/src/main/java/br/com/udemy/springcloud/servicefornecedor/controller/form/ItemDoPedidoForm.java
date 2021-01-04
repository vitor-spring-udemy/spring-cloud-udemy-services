package br.com.udemy.springcloud.servicefornecedor.controller.form;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ItemDoPedidoForm {

    private Long idProduto;
    private Integer quantidade;

}
