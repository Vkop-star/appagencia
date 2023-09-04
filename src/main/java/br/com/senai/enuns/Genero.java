package br.com.senai.enuns;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor

public enum Genero {
    M("MASCULINO"), 
    F("FEMININO"), 
    O("OUTROS");

    private String Tipo;


}
