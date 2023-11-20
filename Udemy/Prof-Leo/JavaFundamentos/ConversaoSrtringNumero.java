package JavaFundamentos;

import javax.swing.*;

public class ConversaoSrtringNumero {
    public static void main(String[] args) {
        String valor1 = JOptionPane.showInputDialog(
                "Digite o primerio número");
        String valor2 = JOptionPane.showInputDialog(
                "Digite o segundo número");
        System.out.println(valor1);
        System.out.println(valor2);

        double num1 = Double.parseDouble(valor1);
        double num2 = Double.parseDouble(valor2);
        System.out.println(num2 + num1);


    }
}
