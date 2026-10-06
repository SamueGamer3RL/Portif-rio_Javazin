package jogo.src;

public class main {
    public static void main(String[] args){
        Persona Joker = new Persona("Joker Java Edition");
        Persona Ann = new Persona("Ann Takamaki");
        
        System.out.println("Iniciar batalha\n");

        PersonaViloes Akechi = new PersonaViloes("Akechi");
        PersonaViloes Igor = new PersonaViloes("Igor");
    }
}
