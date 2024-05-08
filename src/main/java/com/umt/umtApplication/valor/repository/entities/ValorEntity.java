package com.umt.umtApplication.valor.repository.entities;

import com.umt.umtApplication.valor.repository.dto.ValorDTO;
import jakarta.persistence.*;
import lombok.*;

@ToString
@EqualsAndHashCode
@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "valor")
public class ValorEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_valor")
    private Integer idValor;

    @Column(name = "percen_empresa")
    private Integer percenEmpresa;

    @Column(name = "percen_cartao")
    private Integer percenCartao;

    @Column(name = "rt_indicacao")
    private Integer rtIndicacao;

    @Column(name = "selo")
    private Integer selo;

    public ValorEntity(Integer percenEmpresa, Integer percenCartao, Integer rtIndicacao, Integer selo) {
        this.percenEmpresa = percenEmpresa;
        this.percenCartao = percenCartao;
        this.rtIndicacao = rtIndicacao;
        this.selo = selo;
    }

    public ValorEntity(ValorDTO valorDTO){
        this.percenEmpresa = valorDTO.getPercenEmpresa();
        this.percenCartao = valorDTO.getPercenCartao();
        this.rtIndicacao = valorDTO.getRtIndicacao();
        this.selo = valorDTO.getSelo();
    }
}
