package com.umt.umtApplication.venda.repository.entities;

import com.umt.umtApplication.venda.repository.dto.VendaDTO;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@ToString
@EqualsAndHashCode
@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "venda")
public class VendaEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_venda")
    private Integer idVenda;

    @Column(name = "valor_venda")
    private Double valorVenda;

    @Column(name = "dt_venda")
    private Date dtVenda;

    public VendaEntity(Double valorVenda, Date dtVenda) {
        this.valorVenda = valorVenda;
        this.dtVenda = dtVenda;
    }

    public VendaEntity(VendaDTO vendaDTO){
        this.valorVenda = vendaDTO.getValorVenda();
        this.dtVenda = vendaDTO.getDtVenda();
    }

}
