package br.com.udemy.springcloud.serviceloja.controller.dto;

import br.com.udemy.springcloud.serviceloja.entity.CompraEntity;
import br.com.udemy.springcloud.serviceloja.entity.CompraState;
import lombok.Data;

import java.time.LocalDate;

@Data
public class CompraDTO {

    private Long idPedido;
    private String enderecoDestino;
    private String estadoDestino;
    private LocalDate previsaoParaEntrega;
    private CompraState state;


    public CompraDTO(CompraEntity entity) {
        idPedido = entity.getIdPedido();
        enderecoDestino = entity.getEnderecoDestino();
        estadoDestino = entity.getEstadoDestino();
        previsaoParaEntrega = getPrevisaoParaEntrega();
        state = entity.getState();
    }
}
