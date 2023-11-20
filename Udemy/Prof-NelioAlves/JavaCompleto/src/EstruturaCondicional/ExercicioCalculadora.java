package EstruturaCondicional;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioCalculadora {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        boolean continuar;


        do {
            String um = JOptionPane.showInputDialog("Digite um número: ");
            double valorUm = Double.parseDouble(um);
            String dois = JOptionPane.showInputDialog("Digite outro número: ");
            double valorDois = Double.parseDouble(dois);
            String operacao = JOptionPane.showInputDialog("Digite a operação que deseja realizar: +, -, /, * ");

            System.out.println("Resultado: " + calculo(valorUm, valorDois, operacao));

            continuar = verificarNovaOperacao();
        } while (continuar);


    }

    public static boolean verificarNovaOperacao() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Deseja continuar essa operação? S/N");
        String valor = sc.nextLine().toUpperCase();
        return !valor.equals("N");
    }

    public static Double calculo(double valorUm, double valorDois, String operacao) {
        double resposta = 0.0;

        switch (operacao) {
            case "+":
                resposta = valorUm + valorDois;
                System.out.println("Adição; " + resposta);
                break;
            case "-":
                resposta = valorUm - valorDois;
                System.out.println("Subtração; " + resposta);
                break;
            case "/":
                resposta = valorUm / valorDois;
                System.out.println("Divisão; " + resposta);
                break;
            case "*":
                resposta = valorUm * valorDois;
                System.out.println("Multipicação; " + resposta);
                break;
            default:
                System.out.println("Operação invalida");
                JOptionPane.showConfirmDialog(null, "Valor inválido");
                break;
        }
        return resposta;
    }


}
