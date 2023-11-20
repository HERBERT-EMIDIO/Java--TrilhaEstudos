package EstruturasRepetitivas;

import javax.swing.*;
import java.util.Scanner;

public class EstruturaFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Fazer um Programa que leia 3 numeros inteiros");

        String stringQuantNum = JOptionPane.showInputDialog("Digite a quantidade de números: ");
        int qunatNum = Integer.parseInt(stringQuantNum);

        int soma = 0;
        for (int i = 0; i < qunatNum; i++) {
            String stringNumA = JOptionPane.showInputDialog("Digite um número: ");
            int num = Integer.parseInt(stringNumA);
            soma += num;

        }

        System.out.println(soma);


    }
}
