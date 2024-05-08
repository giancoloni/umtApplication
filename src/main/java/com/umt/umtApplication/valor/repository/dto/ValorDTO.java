package com.umt.umtApplication.valor.repository.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor(force = true)
@Getter
@Setter
public class ValorDTO{
    private final Integer percenEmpresa;
    private final Integer percenCartao;
    private final Integer rtIndicacao;
    private final Integer selo;

    public ValorDTO(Integer percenEmpresa, Integer percenCartao, Integer rtIndicacao, Integer selo) {
        this.percenEmpresa = percenEmpresa;
        this.percenCartao = percenCartao;
        this.rtIndicacao = rtIndicacao;
        this.selo = selo;
    }

    @Override
    public String toString() {
        return "ValorDTO{" +
                "percenEmpresa=" + percenEmpresa +
                ", percenCartao='" + percenCartao + '\'' +
                ", rtIndicacao='" + rtIndicacao + '\'' +
                ", selo='" + selo + '\'' +
                '}';
    }
}
