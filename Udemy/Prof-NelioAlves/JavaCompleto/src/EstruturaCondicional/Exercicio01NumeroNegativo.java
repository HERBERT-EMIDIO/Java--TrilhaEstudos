package EstruturaCondicional;

import javax.swing.*;
import java.util.Scanner;

public class Exercicio01NumeroNegativo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.");

        String string = JOptionPane.showInputDialog("Digite um número: ");
        int value = Integer.parseInt(string);

        if(value > 0){
            System.out.println("O valor digitado é positivo!");
        }else{
            System.out.println("O valor digitado é negativo");
        }

        System.out.println("Fim");

        sc.close();



    }
}
