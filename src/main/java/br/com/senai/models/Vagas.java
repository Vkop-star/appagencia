package br.com.senai.models;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Vagas {
    private String titulo;
    private String decricao;
    private int numeroVagas;
    private Double salario;
    private LocalDate inicioPublicacao;
    private LocalDate fimPublicacao;
    private String imagemPublicacao;
    private boolean publicado;
    private Cliente cliente;
    private List<Candidato> candidatos = new ArrayList<>();
}
