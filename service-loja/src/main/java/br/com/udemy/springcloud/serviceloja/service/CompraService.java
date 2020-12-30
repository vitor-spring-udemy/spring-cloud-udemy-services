package br.com.udemy.springcloud.serviceloja.service;

import br.com.udemy.springcloud.serviceloja.controller.dto.CompraDTO;
import br.com.udemy.springcloud.serviceloja.controller.form.CompraForm;
import javassist.NotFoundException;

public interface CompraService {

    CompraDTO realizaCompra(CompraForm formCompra);

    CompraDTO getByIdPedido(Long id) throws NotFoundException;
}
