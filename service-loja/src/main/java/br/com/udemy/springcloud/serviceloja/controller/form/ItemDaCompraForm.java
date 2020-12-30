package br.com.udemy.springcloud.serviceloja.controller.form;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ItemDaCompraForm {

    private long id;
    private int quantidade;

}
