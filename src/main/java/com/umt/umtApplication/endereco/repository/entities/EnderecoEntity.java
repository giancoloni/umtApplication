package com.umt.umtApplication.endereco.repository.entities;

import com.umt.umtApplication.endereco.repository.dto.EnderecoDTO;
import jakarta.persistence.*;
import lombok.*;

@ToString
@EqualsAndHashCode
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "endereco")
public class EnderecoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_endereco")
    private Integer idEndereco;

    @Column(name = "logradouro")
    private String logradouro;

    @Column(name = "cidade")
    private String cidade;

    @Column(name = "estado")
    private String estado;

    @Column(name = "pais")
    private String pais;

    @Column(name = "cep")
    private String cep;

    public EnderecoEntity(String logradouro, String cidade, String estado, String pais, String cep) {
        this.logradouro = logradouro;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.cep = cep;
    }

    public EnderecoEntity(EnderecoDTO enderecoDTO){
        this.logradouro = enderecoDTO.getLogradouro();
        this.cidade = enderecoDTO.getCidade();
        this.estado = enderecoDTO.getEstado();
        this.pais = enderecoDTO.getPais();
        this.cep = enderecoDTO.getCep();
    }
}
