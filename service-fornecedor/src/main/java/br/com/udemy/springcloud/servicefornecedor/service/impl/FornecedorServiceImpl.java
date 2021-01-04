package br.com.udemy.springcloud.servicefornecedor.service.impl;

import br.com.udemy.springcloud.servicefornecedor.controller.dto.FornecedorDTO;
import br.com.udemy.springcloud.servicefornecedor.controller.dto.ReservaDTO;
import br.com.udemy.springcloud.servicefornecedor.controller.form.ItemDoPedidoForm;
import br.com.udemy.springcloud.servicefornecedor.entity.Pedido;
import br.com.udemy.springcloud.servicefornecedor.repository.FornecedorRepository;
import br.com.udemy.springcloud.servicefornecedor.repository.PedidoRepository;
import br.com.udemy.springcloud.servicefornecedor.service.FornecedorService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@AllArgsConstructor
public class FornecedorServiceImpl implements FornecedorService {

    private final FornecedorRepository fornecedorRepository;
    private final PedidoRepository pedidoRepository;

    @Override
    public FornecedorDTO getInfoPorEstado(String estado) {

        final var optEstado = fornecedorRepository.findByEstado(estado);

        if(optEstado.isPresent())
            return new FornecedorDTO(optEstado.get());

        return null;
    }

    @Override
    @Transactional
    public ReservaDTO realizaPedido(List<ItemDoPedidoForm> itens) {

        Pedido pedido = new Pedido(itens);

        pedidoRepository.save(pedido);

        //simulando que passou o tempo de preparo e o pedido está pronto para o fornecedor retirar.
        pedido.estaPreparado();
        pedidoRepository.save(pedido);

        return new ReservaDTO(pedido);
    }

    @Override
    public ReservaDTO getPedidoPorId(Long id) {

        final var optPedido = pedidoRepository.findById(id);

        if(optPedido.isPresent()){
            return new ReservaDTO(optPedido.get());
        }

        return null;
    }

}
