package br.com.udemy.springcloud.serviceloja.entity;

import br.com.udemy.springcloud.serviceloja.controller.form.CompraForm;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Getter
@RequiredArgsConstructor
public class CompraEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPedido;
    private String enderecoDestino;
    private String estadoDestino;
    private LocalDate previsaoParaEntrega;
    private CompraState state;

    public CompraEntity(CompraForm formCompra) {

        enderecoDestino = formCompra.getEnderecoDestino();
        state = CompraState.PEDIDO_FEITO;
        estadoDestino = formCompra.getEstadoDestino();

    }


}
