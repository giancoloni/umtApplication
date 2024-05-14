package com.umt.umtApplication.impressao.repository.entities;

import com.umt.umtApplication.impressao.repository.dto.ImpressaoDTO;
import jakarta.persistence.*;
import lombok.*;

@ToString
@EqualsAndHashCode
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "impressao")
public class ImpressaoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_impressao")
    private Integer idImpressao;

    @Column(name = "papel")
    private String papel;

    @Column(name = "largura")
    private Integer largura;

    @Column(name = "altura")
    private Integer altura;

    @Column(name = "fornecedor")
    private String fornecedor;

    public ImpressaoEntity(String papel, Integer largura, Integer altura, String fornecedor) {
        this.papel = papel;
        this.largura = largura;
        this.altura = altura;
        this.fornecedor = fornecedor;
    }

    public ImpressaoEntity(ImpressaoDTO impressaoDTO){
        this.papel = impressaoDTO.getPapel();
        this.largura = impressaoDTO.getLargura();
        this.altura = impressaoDTO.getAltura();
        this.fornecedor = impressaoDTO.getFornecedor();
    }
}
