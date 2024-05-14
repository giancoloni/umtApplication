package com.umt.umtApplication.endereco.repository.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class EnderecoDTO {
    private String logradouro;
    private String cidade;
    private String estado;
    private String pais;
    private String cep;

    public EnderecoDTO(String logradouro, String cidade, String estado, String pais, String cep) {
        this.logradouro = logradouro;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.cep = cep;
    }

    public String toString(){
        return "EnderecoDTO{"
                + "logradouro=" + logradouro
                + ", cidade=" + cidade
                + ", estado=" + estado
                + ", pais=" + pais
                + ", cep=" + cep
            + '}';
    }
}
