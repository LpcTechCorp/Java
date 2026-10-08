package aulascoh;
import java.util.Scanner;
import java.util.InputMismatchException;

public class AulaMetodosTryCatch {

	static double somar(double a, double b) {
        return a + b;
    }

	static double subtrair(double a, double b) {
        return a - b;
    }

	static double multiplicar(double a, double b) {
        return a * b;
    }

	static double dividir(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero");
        }
        return a / b;
    }

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Primeiro número: ");
            double n1 = sc.nextDouble();
            System.out.print("Segundo número: ");
            double n2 = sc.nextDouble();

            System.out.print("Operação (+, -, *, /): ");
            String op = sc.next();
            double resultado;
            switch (op) {
                case "+":
                    resultado = somar(n1, n2);
                    break;
                case "-":
                    resultado = subtrair(n1, n2);
                    break;
                case "*":
                    resultado = multiplicar(n1, n2);
                    break;
                case "/":
                    resultado = dividir(n1, n2);
                    break;
                default:
                    System.out.println("Operação inválida!");
                    return;
            }
            System.out.println("Resultado: " + resultado);
        } catch (InputMismatchException e) {
            System.out.println("Digite números válidos!");
        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        } finally {
        	System.out.println("Fim...");
            sc.close();
        }
    }
}
