package com.umt.umtApplication.moldura.repository.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class MolduraDTO {
    private String tipoMadeira;
    private String cor;
    private String largura;
    private String altura;
    private String fornecedor;

    public MolduraDTO(Integer idMoldura, String tipoMadeira, String cor, String largura, String altura, String fornecedor) {
        this.tipoMadeira = tipoMadeira;
        this.cor = cor;
        this.largura = largura;
        this.altura = altura;
        this.fornecedor = fornecedor;
    }

    public String toString() {
        return "MolduraDTO{" +
                "tipoMadeira=" + tipoMadeira +
                ", cor='" + cor + '\'' +
                ", largura='" + largura + '\'' +
                ", altura='" + altura + '\'' +
                ", fornecedor='" + fornecedor + '\'' +
                '}';
    }
}
