package tente.java;

import java.util.Scanner; 

public class calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
       
        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble(); 
       
        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble(); 

        
        double soma = numero1 + numero2;
        System.out.println("A soma é: " + soma);

        
        double multiplicacao = numero1 * numero2;
        System.out.println("A multiplicação é: " + multiplicacao);
        
        double divisao = numero1 / numero2;
        System.out.println("a divisão dos dois fatores é: " + divisao);
        
        double subtraçao = numero1 - numero2;
        System.out.println("a subtração é: " + subtraçao);

        scanner.close();
}
}
