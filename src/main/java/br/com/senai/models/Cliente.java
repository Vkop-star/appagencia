package br.com.senai.models;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Cliente {
    private String nome;
    private String cpf;
    private String responsavel;
    private String contato;
    private String numCliente;
    private List<Vagas> vagas = new ArrayList<>();
}
