package br.com.senai.enuns;

public enum Genero {
    M("MASCULINO"), 
    F("FEMININO"), 
    O("OUTROS");

    private String Tipo;

    Genero( String Tipo) {
        this.Tipo = Tipo;
    }

    public String getTipo() {
        return Tipo;
    }

    //teste
}
