package com.umt.umtApplication.empresa.repository.entities;

import com.umt.umtApplication.empresa.repository.dto.EmpresaDTO;
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
    private Integer id_empresa;

    @Column(name = "nome")
    private String nome;
    @Column(name = "instagram")
    private String instagram;

    public EmpresaEntity(String nome, String instagram) {
        this.nome = nome;
        this.instagram = instagram;
    }
}
