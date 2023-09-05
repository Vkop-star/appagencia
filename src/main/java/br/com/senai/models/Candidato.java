package br.com.senai.models;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

import br.com.senai.enuns.Genero;
import lombok.Getter;
import lombok.Setter;

    @Getter
    @Setter

public class Candidato {
    private String nomeCompleto;
    private LocalDate dataNascimento;
    private String cpf;
    private String email;
    private Genero genero;
    private String naturalidade;
    private Endereco endereco;
    private String nacionalidade;
    private List<Escolaridade> escolaridade = new ArrayList<>();
    private String calcularIdade;
    
    /*metodo de calcular idade */

    public int calcularIdade() {
        return Period.between(this.dataNascimento, LocalDate.now()).getYears();
    }

    /* preciso de um metodo para validar o candidato sendo maior de idade 18 */
        
    public String eMaiorDeIdade() {
        return calcularIdade() >= 18 ? "sim" : "nao"; //ternario
   }
    
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    } 

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento() {
        this.dataNascimento = dataNascimento;
    }

}
