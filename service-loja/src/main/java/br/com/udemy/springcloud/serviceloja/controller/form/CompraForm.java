package br.com.udemy.springcloud.serviceloja.controller.form;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class CompraForm {

    private List<ItemDaCompraForm> itens;
    private String enderecoDestino;
    private String estadoDestino;

}
