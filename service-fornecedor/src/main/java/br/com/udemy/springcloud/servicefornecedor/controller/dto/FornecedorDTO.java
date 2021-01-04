package br.com.udemy.springcloud.servicefornecedor.controller.dto;

import br.com.udemy.springcloud.servicefornecedor.entity.Fornecedor;
import lombok.Data;
import lombok.Value;

@Value
public class FornecedorDTO {

    private String endereco;
    private String nome;

    public FornecedorDTO(Fornecedor fornecedor) {
        endereco = fornecedor.getEndereco();
        nome = fornecedor.getNome();
    }
    
}
