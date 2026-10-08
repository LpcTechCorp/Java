package aulascoh;

import java.util.Scanner;
import java.util.InputMismatchException;

public class AulaTryCatch4 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try {
            System.out.print("Digite dois inteiros: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            System.out.println(a / b);
        } catch (ArithmeticException e) {
            System.out.println("Não divida por zero!");
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida!");
        } finally {
            System.out.println("Fim da tentativa.");
            sc.close();
        }
    }
}
