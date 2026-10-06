package Metedos;

public class main {
    public static void main(String[] args) {
    
    luffy luffy = new luffy();
    luffy.nome = "Luffy";
    luffy.recompensa = 3000000000L;
    luffy.tesouro = "Thounsand_Sunny";
    luffy.sonho = "Se tornar o Rei dos Piratas";
    
    sanji sanji = new sanji();
    sanji.nome = "Sanji";
    sanji.recompensa = 1032000000L;
    sanji.tesouro = "Nami";
    sanji.sonho = "Ser o maior cozinheiro";

    zoro zoro = new zoro();
    zoro.nome = "Zoro";
    zoro.recompensa = 1111000000L;
    zoro.tesouro = "Thounsand_Sunny";
    zoro.sonho = "Ser o maior Espadashin";

    nicorobin nicorobin = new nicorobin();
    nicorobin.nome = "Nico Robin";
    nicorobin.recompensa = 930000000L;
    nicorobin.tesouro = "chopper";

    pirata pirata = new pirata();
    
    System.out.println("Nome - " + nicorobin.nome);
    System.out.println("\n --- Polimorfismo");

    luffy.atacar();
    pirata.atacar();
    nicorobin.atacar();
    }
}
