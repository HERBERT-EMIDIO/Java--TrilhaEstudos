package EstruturaCondicional;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio03DifProduto {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto \n" +
                "de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).");

        String a = JOptionPane.showInputDialog("Digite o valor para a variavel A: ");
        int aA = Integer.parseInt(a);
        String b = JOptionPane.showInputDialog("Digite o valor para a variavel B: ");
        int bB = Integer.parseInt(b);
        String c = JOptionPane.showInputDialog("Digite o valor para a variavel C: ");
        int cC = Integer.parseInt(c);
        String d = JOptionPane.showInputDialog("Digite o valor para a variavel D: ");
        int dD = Integer.parseInt(c);

        int difProd = cC * dD - aA * bB;

        System.out.println("O Calculo da Diferença dos produtos: " + difProd);


    }
}
