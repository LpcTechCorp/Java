package aulascoh;

import java.util.Scanner;

public class AulaTryCatch1 {
	
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        //try {
            System.out.print("Numerador: ");
            int a = sc.nextInt();
            System.out.print("Denominador: ");
            int b = sc.nextInt();
            int resultado = a / b;
            System.out.println("Resultado: " + resultado);
        //} catch (ArithmeticException e) {
        //    System.out.println("Erro: divisão por zero!");
       // }
        sc.close();
    }
}
