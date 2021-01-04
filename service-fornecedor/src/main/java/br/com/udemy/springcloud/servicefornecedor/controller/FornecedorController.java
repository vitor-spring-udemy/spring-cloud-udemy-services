package br.com.udemy.springcloud.servicefornecedor.controller;

import br.com.udemy.springcloud.servicefornecedor.controller.dto.FornecedorDTO;
import br.com.udemy.springcloud.servicefornecedor.controller.dto.PedidoDTO;
import br.com.udemy.springcloud.servicefornecedor.controller.dto.ReservaDTO;
import br.com.udemy.springcloud.servicefornecedor.controller.form.ItemDoPedidoForm;
import br.com.udemy.springcloud.servicefornecedor.service.FornecedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/fornecedor")
public class FornecedorController {

    @Autowired
    private FornecedorService service;

    @GetMapping("/{estado}")
    public FornecedorDTO infoFornecedor(@PathVariable String estado) {
        return service.getInfoPorEstado(estado);
    }

    @PostMapping
    public ReservaDTO realizaPedido(@RequestBody List<ItemDoPedidoForm> itens) {
        return service.realizaPedido(itens);
    }

    @GetMapping("/pedido/{id}")
    public ReservaDTO getPedidoPorId(@PathVariable Long id) {
        return service.getPedidoPorId(id);
    }

}
