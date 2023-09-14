package contador;

import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
        int numero1, numero2;
        System.out.println("Digite o primeiro número");
	numero1 = input.nextInt();
	System.out.println("Digite o segundo numero");
	numero2 = input.nextInt();
		
	try {
            //chamando o método contendo a lógica de contagem
            contar(numero1, numero2);
		
	}catch (ParametrosInvalidosException e) {
            System.out.println("O segundo número deve ser maior que o primeiro");
	}
		
    }
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois) {
            throw new ParametrosInvalidosException("O segundo número deve ser maior que o primeiro.");
        }
	
        int contagem = parametroDois - parametroUm;
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
