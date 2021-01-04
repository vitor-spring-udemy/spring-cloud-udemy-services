package br.com.udemy.springcloud.servicefornecedor.controller.dto;

import br.com.udemy.springcloud.servicefornecedor.entity.Pedido;
import br.com.udemy.springcloud.servicefornecedor.entity.PedidoStatus;
import lombok.Getter;

@Getter
public class ReservaDTO {


    private String dataDisponibilidade;
    private PedidoStatus status;
    private Long idReserva;

    public ReservaDTO(Pedido pedido) {
        idReserva = pedido.getId();
        status = pedido.getStatus();
        dataDisponibilidade = pedido.getDataDisponibilidade();
    }
}
