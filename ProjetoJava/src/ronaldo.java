package ProjetoJava.src;

public class ronaldo extends banco{
    
    void depositar(double valor, ContaCorrente minhaConta){
         if(valor <= 5000 && valor > 0){
           saldo = saldo + valor;
           System.out.println("Deposito de R$" + valor + " realizado");
         } else{
            System.out.println("Operação Negada: valor de deposito indisponível");
         }

        }
   
    void sacar(double valor, ContaCorrente minhaConta){
        if (saldo >= valor){
            saldo = saldo - valor;
            System.out.println("Saque de R$" + valor + " realizado");
        } else {
            System.out.println("\nOperação negada: saldo insuficiente\n");
        }
        
    }
}
