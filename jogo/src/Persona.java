package jogo.src;

public class Persona {
    // Atributos desprotegidos;
    String nome;
    private int vida;
    int dano;


    public Persona(String nomeEscolhido){
       this.nome = nomeEscolhido;
       this.vida = 100; // vida fixada
       System.out.println("Eu espero grandes coisas de você...");
    }
    

    // Método que tenta impor uma regra.

    void tomarPocaoCurativa(int cura){
        vida = vida + cura;
        if (vida > 100){
            vida = 100;
        }
        System.out.println("Vida " + vida);
    }

    void receberDano(int dano){
        vida = vida - dano;
        if ( vida <= 0){
            vida = 0;
            System.out.println("Infelismente você perdeu a resenha!");
        } else{
            System.out.println("Sofreu dano de: " + dano);
        }
    }
}
