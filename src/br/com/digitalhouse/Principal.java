package br.com.digitalhouse;

public class Principal {
    public static void main(String[] args) {

        Cachorro cachorro = new Cachorro("Bidu","20", "vira-lata");
        System.out.println("Esse cachorro " + cachorro.getNome()+ " " +  cachorro.getRaca() +" é mamifero ?" + " " + cachorro.ehMamifero());
    }
}
