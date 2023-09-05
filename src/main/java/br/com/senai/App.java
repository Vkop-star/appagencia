package br.com.senai;

import java.time.LocalDate;
import java.util.Arrays;

import br.com.senai.enuns.Genero;
import br.com.senai.models.Candidato;
import br.com.senai.models.Cliente;
import br.com.senai.models.Vagas;

public class App 
{
    public static void main( String[] args ) {
        
        //instanciar uma vaga

        Vagas ti = new Vagas();
        ti.setTitulo("Suporte tecnico");
        ti.setNumeroVagas(2);
        ti.setDecricao("Deverá ter conhecimento em montagem e "+"manutenção de computadores");
        ti.setSalario(1900.0);
        ti.setInicioPublicacao(LocalDate.of(2023, 8, 20));
        ti.setFimPublicacao(LocalDate.of(2023, 9, 4));

        //instanciar um cliente

        Cliente senai = new Cliente();
        senai.setNome("senai");
        senai.setNumCliente("86 9 9888 4445");
        senai.setCpf("00011122203");

        ti.setCliente(senai); //associar o cliente a vaga

        //instanciar 02 candidatos

        Candidato joao = new Candidato();
        joao.setNomeCompleto("joao henrique");
        joao.setDataNascimento(LocalDate.of(1993, 10, 1));
        joao.setGenero(Genero.M);

        Candidato maria = new Candidato();
        maria.setNomeCompleto("maria helena");
        maria.setDataNascimento(LocalDate.of(1995, 10, 1));
        maria.setGenero(Genero.F);

        ti.getCandidatos().addAll(Arrays.asList(joao, maria));
        
        System.out.println("nome da vaga: "+ti.getTitulo()+
        "\nSalario: "+ti.getSalario()+
        "\nInicio: "+ti.getInicioPublicacao()+
        "\nEntregar até: "+ti.getFimPublicacao()+
        "\nEmpresa: "+ti.getCliente().getNome());

        for (Candidato candidato: ti.getCandidatos()) {
            System.out.println("nome: "+candidato.getNomeCompleto());
        }
    }
}
