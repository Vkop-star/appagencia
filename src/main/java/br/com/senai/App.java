package br.com.senai;

import java.time.LocalDate;
//import java.time.Period;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;

import br.com.senai.enuns.Estado;
import br.com.senai.enuns.Genero;
import br.com.senai.models.Candidato;
import br.com.senai.models.Endereco;
//import br.com.senai.models.Escolaridade;

/**
 * HMeu primeiro App em java!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        Endereco endereco = new Endereco();
        endereco.cep = "64000000";
        endereco.logradouro = "RUA PORTO, 3555";
        endereco.cidade = "teresina";
        endereco.estado = Estado.PI;

        Endereco endereco2 = new Endereco();
        endereco2.cep = "64000000";
        endereco2.logradouro = "RUA GOIAN, 2544";
        endereco2.cidade = "teresina";
        endereco2.estado = Estado.PI;

        Candidato yasmin = new Candidato();
        yasmin.nomeCompleto = "yasmin carvalho da silva";
        yasmin.dataNascimento = LocalDate.of(2007, 10, 16);
        yasmin.email = "yasmincarvalho@gmail.com";
        yasmin.genero = Genero.F;
        yasmin.naturalidade = Estado.PI.toString();
        yasmin.nacionalidade = "Brasil";
        yasmin.endereco = endereco;

        Candidato cleiton = new Candidato();
        cleiton.nomeCompleto = "Cleiton costa cunha";
        cleiton.dataNascimento = LocalDate.of(2001, 12, 3);
        cleiton.email = "cleitoncosta@gmail.com";
        cleiton.genero = Genero.M;
        cleiton.naturalidade = Estado.PI.toString();
        cleiton.nacionalidade = "Brasil";
        cleiton.endereco = endereco;

        System.out.println("Nome Completo: "+yasmin.nomeCompleto);
        System.out.println("Idade: "+yasmin.calcularIdade()+" anos"); 
        System.out.println("E maior de idade: "+yasmin.eMaiorDeIdade());
        System.out.println("Nome Completo: "+cleiton.nomeCompleto);
        System.out.println("Idade: "+cleiton.calcularIdade()+" anos");
        System.out.println("E maior de idade: "+cleiton.eMaiorDeIdade());

        //Escolaridade e1 = new Escolaridade();
        //e1.nomeCurso = "Sistema de redes";
        //e1.nomeInstituicao = "Senai";
        //e1.dataInicio = LocalDate.of(2022, 10, 01);
        //e1.dataFim = LocalDate.of(2023, 8, 10);

        //Escolaridade e2 = new Escolaridade();
        //e2.nomeCurso = "Programação";
        //e2.nomeInstituicao = "UFPI - Universidade Federal do Estado do Piauí";
        //e2.dataInicio = LocalDate.of(202, 10, 01);
        //e2.dataFim = LocalDate.of(2023, 8, 10);

        //List<Escolaridade> list = new ArrayList<>();
        //list.add(e1);
        //list.add(e2);

        //yasmin.escolaridade = Arrays.asList(e1,e2);

        //System.out.println("Nome Completo: "+yasmin.nomeCompleto);
        //System.out.println("Idade: "+);
        //System.out.println("Endereço: "+yasmin.endereco.logradouro);

        //for (Escolaridade escolaridade : yasmin.escolaridade) {
            //System.out.println(escolaridade.nomeCurso+" "+escolaridade.nomeInstituicao);
        //}
    }
}
// copia do meu teste em java