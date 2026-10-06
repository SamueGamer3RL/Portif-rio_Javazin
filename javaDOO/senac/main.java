package javaDOO.senac;

public class main {
    public static void main(String[] args){
     lampada lampada = new lampada();
     lampada.cor = "Branca";
     lampada.marca = "Philips";
     lampada.modelo = "frost";
     lampada.voltagem = 5;
     lampada.tipo = "Almoled";

     System.out.println("COR -" + lampada.cor);
     System.out.println("MARCA -" + lampada.marca);
     System.out.println("MODELO -" + lampada.modelo);
     System.out.println("VOLTAGEM -" + lampada.voltagem);
     System.out.println("TIPO -" + lampada.tipo);    



    }
}
