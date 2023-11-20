package TreinandoVetor;

import java.util.Locale;
import java.util.Scanner;

public class Altura {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int quantidadePessoas = sc.nextInt();
        String[] vectNome = new String[quantidadePessoas];
        int[] vectIdade = new int[quantidadePessoas];
        Double[] vectAltura = new Double[quantidadePessoas];

        for (int i = 0; i < quantidadePessoas; i++) {
            sc.nextLine();
            System.out.println("Dados da " + (i +1) + "a pessoa:");
            System.out.print("Nome: ");
            vectNome[i] = sc.nextLine();
            System.out.print("Idade: ");
            vectIdade[i] = sc.nextInt();
            System.out.print("Altura: ");
            vectAltura[i] = sc.nextDouble();
        }


        double mediaAltura = 0.0;
        for (int i = 0; i < quantidadePessoas; i++) {
            mediaAltura += vectAltura[i];

        }
        System.out.printf("Altura média: %.2f%n", mediaAltura);


        int totalMaiorIdade = 0;
        for (int i = 0; i < quantidadePessoas; i++) {
            if (vectIdade[i] > 16) {
                totalMaiorIdade += vectIdade[i];
            }
        }


        sc.close();
    }
}
