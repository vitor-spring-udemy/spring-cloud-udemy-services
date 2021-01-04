package br.com.udemy.springcloud.servicefornecedor.repository;

import br.com.udemy.springcloud.servicefornecedor.entity.Fornecedor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface FornecedorRepository extends JpaRepository<Fornecedor, Long> {
    Optional<Fornecedor> findByEstado(String estado);
}
