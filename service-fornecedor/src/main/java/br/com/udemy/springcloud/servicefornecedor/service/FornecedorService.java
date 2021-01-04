package br.com.udemy.springcloud.servicefornecedor.service;

import br.com.udemy.springcloud.servicefornecedor.controller.dto.FornecedorDTO;
import br.com.udemy.springcloud.servicefornecedor.controller.dto.ReservaDTO;
import br.com.udemy.springcloud.servicefornecedor.controller.form.ItemDoPedidoForm;

import java.util.List;

public interface FornecedorService {
    FornecedorDTO getInfoPorEstado(String estado);

    ReservaDTO realizaPedido(List<ItemDoPedidoForm> produtos);

    ReservaDTO getPedidoPorId(Long id);
}
