package br.com.udemy.springcloud.servicefornecedor.repository;

import br.com.udemy.springcloud.servicefornecedor.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
