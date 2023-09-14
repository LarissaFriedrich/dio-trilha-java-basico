package contabanco;

import java.util.Scanner;

public class ContaBanco {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        
        int numero;
        double saldo;
        String nomeCliente, agencia;
        
        System.out.println("Por favor, digite o número da Agência: ");
        agencia = input.next();
        
        System.out.println("Por favor, digite o número da conta: ");
        numero = input.nextInt();
        
        System.out.println("Por favor, digite o seu nome: ");
        nomeCliente = input.next();
        
        System.out.println("Por favor, digite o saldo: ");
        saldo = input.nextInt();
        
        ContaTerminal contaTerminal = new ContaTerminal(numero, agencia, nomeCliente, saldo);
        
        contaTerminal.mostrarDados();
    }
    
}
