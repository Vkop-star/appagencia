package br.com.senai.enuns;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor

public enum Estado {
    AC("ACRE"),
    AL("ALAGOAS"),
    AP("AMAPA"),
    AM("AMAZONAS"),
    BA("BAHIA"),
    CE("CEARA"),
    DF("DESTRITO FEDERAL"),
    ES("ESPIRITO SANTO"),
    GO("GOIAS"),
    MA("MARANHAO"),
    MT("MATO GROSSO"),
    MS("MATO GROSSO DO SUL"),
    MG("MINAS GERAIS"),
    PA("PARÁ"),
    PB("PARAIBA"),
    PR("PARANÁ"),
    PE("PERNAMBUCO"),
    PI("PIAUI"),
    RJ("RIO DE JANEIRO"),
    RN("RIO GRANDE DO NORTE"),
    RS("RIO GRANDE DO SUL"),
    RO("RONDONIA"),
    RR("RORAIMA"), 
    SC("SANTA CATARINA"),
    SP("SÃO PAULO"),
    SE("SERGIPE"),
    TO("TOCANTINS");

    private String nome;

}
