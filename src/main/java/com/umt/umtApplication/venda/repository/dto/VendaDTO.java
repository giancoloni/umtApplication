package com.umt.umtApplication.venda.repository.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@NoArgsConstructor(force = true)
@Getter
@Setter
public class VendaDTO {
    private final Double valorVenda;
    private final Date dtVenda;

    public VendaDTO(Double valorVenda, Date dtVenda) {
        this.valorVenda = valorVenda;
        this.dtVenda = dtVenda;
    }

    @Override
    public String toString() {
        return "VendaDTO{" +
                "valorVenda=" + valorVenda +
                ", dtVenda='" + dtVenda + '\'' +
                '}';
    }
}
