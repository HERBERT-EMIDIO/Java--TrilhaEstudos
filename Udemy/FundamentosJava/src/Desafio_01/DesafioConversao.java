package Desafio_01;

import java.util.Scanner;

public class DesafioConversao {

    public static void main(String[]args) {
        Scanner ent = new Scanner(System.in);
        String ponto = ".";
        System.out.print("Digite o valor do primeiro salário: ");
        String valor1 = ent.nextLine().replace(",", ponto);
        double valorInt1 = Double.parseDouble(valor1);

        System.out.print("Digite o valor do segundo salário: ");
        String valor2 = ent.nextLine().replace(",", ponto);
        double valorInt2 = Double.parseDouble(valor2);

        System.out.print("Digite o valor do terceiro salário: ");
        String valor3 = ent.nextLine().replace(",", ponto);
        double valorInt3 = Double.parseDouble(valor3);


        double media = (valorInt1 + valorInt2 + valorInt3) / 3;

        System.out.printf("Média: R$%.2f", media);


        ent.close();
    }


}
