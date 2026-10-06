package jogo.src;

public class PersonaViloes {
    String nomevilao;
    private int vidavilao;
    int danovilao;

    public PersonaViloes(String nomeEscolhido){
       this.nomevilao = nomeEscolhido;
       this.vidavilao = 1000; // vida fixada
       System.out.println("....");
    }
}
