package br.com.udemy.springcloud.serviceloja.controller;

import br.com.udemy.springcloud.serviceloja.controller.dto.CompraDTO;
import br.com.udemy.springcloud.serviceloja.controller.form.CompraForm;
import br.com.udemy.springcloud.serviceloja.service.CompraService;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/compra")
public class LojaController {

    @Autowired
    private CompraService service;

    @PostMapping
    public CompraDTO compra(@RequestBody CompraForm formCompra) {
        return service.realizaCompra(formCompra);
    }

    @GetMapping("/{idPedido}")
    public CompraDTO buscarCompra(@PathVariable("idPedido") Long idPedido) throws NotFoundException {
        return service.getByIdPedido(idPedido);
    }

}
