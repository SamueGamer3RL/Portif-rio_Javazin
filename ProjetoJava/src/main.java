package ProjetoJava.src;

public class main {
    public static void main(String[] args){
      // 1

      ronaldo ronaldo = new ronaldo();
      ronaldo.numConta = 13;
      ronaldo.nomeUser = "Ronaldo";
      ronaldo.banco = "Caixa";
      ronaldo.unidade = 104;
      ronaldo.saldo = 500.0;
      ronaldo.depositar(500, ronaldo);
      ronaldo.sacar(600, ronaldo);
      

      System.out.println("Depositamos e somamos a variavel " + ronaldo.saldo);
     
      
    }
}
