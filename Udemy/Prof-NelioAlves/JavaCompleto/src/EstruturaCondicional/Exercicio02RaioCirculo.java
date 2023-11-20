package EstruturaCondicional;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio02RaioCirculo {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro \n" +
                "casas decimais conforme exemplos.");

        System.out.println("Fórmula da área: area = π . raio2");
        System.out.println("Considere o valor de π = 3.14159");


        String stringRaio = JOptionPane.showInputDialog("Digite o valor do Raio do Circulo: ");
        double raio = Double.parseDouble(stringRaio);

        JOptionPane.showMessageDialog(null, "Valor digitado corretamente - Clique em Ok para continuar");

        final double PI = 3.14159;
        double area = Math.pow(2, raio) * PI;

        System.out.printf("Area do Círculo: %.4f", area);

        sc.close();


    }
}
