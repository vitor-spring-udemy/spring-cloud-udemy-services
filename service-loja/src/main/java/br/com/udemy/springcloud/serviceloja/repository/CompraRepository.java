package br.com.udemy.springcloud.serviceloja.repository;

import br.com.udemy.springcloud.serviceloja.entity.CompraEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CompraRepository extends JpaRepository<CompraEntity, Long> {
    Optional<CompraEntity> findByIdPedido(Long idPedido);
}
