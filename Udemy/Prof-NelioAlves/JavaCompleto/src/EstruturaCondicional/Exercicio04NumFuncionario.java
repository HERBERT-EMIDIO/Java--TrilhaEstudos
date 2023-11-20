package EstruturaCondicional;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio04NumFuncionario {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.println("Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por \n" +
                "hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas \n" +
                "decimais.");

        String func = JOptionPane.showInputDialog("Digite a Qunatidade de Funcionários: ");
        int quantFunc = Integer.parseInt(func);

        String horasTrab = JOptionPane.showInputDialog("Digite o número de horas Trabalhadas: ");
        double h = Double.parseDouble(horasTrab);

        String valorPorHora = JOptionPane.showInputDialog("Digite o valor que recebe por hora: ");
        double valorPorH = Double.parseDouble(valorPorHora);


        double salary = valorPorH * h;
        System.out.println("Number: " + quantFunc);
        System.out.printf("SALARY: %.2f", salary);


        sc.close();
    }
}
