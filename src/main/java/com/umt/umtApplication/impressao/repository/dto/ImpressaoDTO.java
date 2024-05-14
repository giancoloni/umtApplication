package com.umt.umtApplication.impressao.repository.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ImpressaoDTO {
    private String papel;
    private Integer largura;
    private Integer altura;
    private String fornecedor;

    public ImpressaoDTO(String papel, Integer largura, Integer altura, String fornecedor) {
        this.papel = papel;
        this.largura = largura;
        this.altura = altura;
        this.fornecedor = fornecedor;
    }

    public String toString() {
        return "ImpressaoDTO{" +
                "papel=" + papel +
                ", largura='" + largura + '\'' +
                ", altura='" + altura + '\'' +
                ", fornecedor='" + fornecedor + '\'' +
                '}';
    }
}
