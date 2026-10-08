package aulascoh;

import java.util.Scanner;
//import java.util.InputMismatchException;

public class AulaTryCatch2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //try {
            System.out.print("Digite sua idade: ");
            int idade = sc.nextInt();
            System.out.println("Idade: " + idade);
       // } catch (InputMismatchException e) {
        //    System.out.println("Digite apenas números inteiros!");
       //}
        sc.close();
    }
}