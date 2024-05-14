package com.umt.umtApplication.moldura.repository.entities;

import com.umt.umtApplication.moldura.repository.dto.MolduraDTO;
import jakarta.persistence.*;
import lombok.*;

@ToString
@NoArgsConstructor
@EqualsAndHashCode
@Getter
@Setter
@Entity
@Table(name = "moldura")
public class MolduraEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_moldura")
    private Integer idMoldura;

    @Column(name = "tipo_madeira")
    private String tipoMadeira;

    @Column(name = "cor")
    private String cor;

    @Column(name = "largura")
    private String largura;

    @Column(name = "altura")
    private String altura;

    @Column(name = "fornecedor")
    private String fornecedor;

    public MolduraEntity(String tipoMadeira, String cor, String largura, String altura, String fornecedor) {
        this.tipoMadeira = tipoMadeira;
        this.cor = cor;
        this.largura = largura;
        this.altura = altura;
        this.fornecedor = fornecedor;
    }

    public MolduraEntity(MolduraDTO molduraDTO) {
        this.tipoMadeira = molduraDTO.getTipoMadeira();
        this.cor = molduraDTO.getCor();
        this.largura = molduraDTO.getLargura();
        this.altura = molduraDTO.getAltura();
        this.fornecedor = molduraDTO.getFornecedor();
    }
}
