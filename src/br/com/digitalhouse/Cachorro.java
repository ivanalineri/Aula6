package br.com.digitalhouse;

public class Cachorro extends Animal {
    private String nome;

    public Cachorro(String novoNome, String novoTamanho, String novaRaca) {
        super(novoTamanho, novaRaca);
        nome = novoNome;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nuevoNome) {
        nome = nuevoNome;
        setNome("Bidu");
    }


    @Override
    public boolean ehMamifero() {
        return true;
    }
}
