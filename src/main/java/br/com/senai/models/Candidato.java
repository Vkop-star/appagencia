package br.com.senai.models;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;

import br.com.senai.enuns.Genero;

public class Candidato {
    public String nomeCompleto;
    public LocalDate dataNascimento;
    public String cpf;
    public String email;
    public Genero genero;
    public String naturalidade;
    public Endereco endereco;
    public String nacionalidade;
    public List<Escolaridade> escolaridade = new ArrayList<>();
    public String calcularIdade;

    public int calcularIdade() {
        return Period.between(this.dataNascimento, LocalDate.now()).getYears();
    }

    /* preciso de um metodo para validar o candidato sendo maior de idade 14 */
        
    public String eMaiorDeIdade() {
        return calcularIdade() >= 18 ? "sim" : "nao"; //ternario

        /*if (calcularIdade() >= 18) {
            return "sim";
        } else {
            return "nao";
        } */
 
 //teste
   } 
}
