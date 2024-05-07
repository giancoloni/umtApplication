package com.umt.umtApplication.empresa.repository.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor(force = true)
@Getter
@Setter
public class EmpresaDTO{
    private final String nome;
    private final String instagram;

    public EmpresaDTO(String nome, String instagram) {
        this.nome = nome;
        this.instagram = instagram;
    }

    @Override
    public String toString() {
        return "EmpresaDTO{" +
                "nome='" + nome + '\'' +
                ", instagram='" + instagram + '\'' +
                '}';
    }

}
