package br.com.udemy.springcloud.serviceloja.service.impl;

import br.com.udemy.springcloud.serviceloja.controller.dto.CompraDTO;
import br.com.udemy.springcloud.serviceloja.controller.form.CompraForm;
import br.com.udemy.springcloud.serviceloja.entity.CompraEntity;
import br.com.udemy.springcloud.serviceloja.repository.CompraRepository;
import br.com.udemy.springcloud.serviceloja.service.CompraService;
import javassist.NotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class CompraServiceImpl implements CompraService {

    private final CompraRepository compraRepository;

    @Override
    public CompraDTO realizaCompra(CompraForm formCompra) {

        CompraEntity entity = new CompraEntity(formCompra);
        compraRepository.save(entity);
        return new CompraDTO(entity);
    }

    @Override
    public CompraDTO getByIdPedido(Long idPedido) throws NotFoundException {

        final var entityOpt = compraRepository.findByIdPedido(idPedido);

        if(entityOpt.isPresent()){

            return new CompraDTO(entityOpt.get());

        }
        return null;
    }

}
