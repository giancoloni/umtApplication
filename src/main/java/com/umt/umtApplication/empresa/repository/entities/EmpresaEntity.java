package com.umt.umtApplication.empresa.repository.entities;

import jakarta.persistence.*;
import lombok.*;

@ToString
@EqualsAndHashCode
@Setter
@Getter
@Entity
@NoArgsConstructor
@Table(name = "empresa", schema = "orcamento")
public class EmpresaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empresa")
    private Integer idEmpresa;

    @Column(name = "nome")
    private String nome;

    @Column(name = "instagram")
    private String instagram;

    public EmpresaEntity(String nome, String instagram) {
        this.nome = nome;
        this.instagram = instagram;
    }
}
