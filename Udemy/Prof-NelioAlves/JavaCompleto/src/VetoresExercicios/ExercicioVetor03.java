package VetoresExercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioVetor03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int quantPessoa, menores;


        System.out.print("Quantas pessoas serao digitadas? ");
        quantPessoa = sc.nextInt();


        String[] nome = new String[quantPessoa];
        int[] idade = new int[quantPessoa];
        double[] altura = new double[quantPessoa];


        for (int i = 0; i < quantPessoa; i++) {
            System.out.printf("Dados da %da pessoa:\n", i + 1);
            sc.nextLine();
            System.out.print("Nome: ");
            nome[i] = sc.nextLine();
            System.out.print("Idade: ");
            idade[i] = sc.nextInt();
            System.out.print("Altura: ");
            altura[i] = sc.nextDouble();
        }


        menores = 0;
        double alturaTotatl = 0.0;

        for (int i = 0; i < quantPessoa; i++) {
            if (idade[i] < 16) {
                menores++;
            }

            alturaTotatl += altura[i];
        }

        double alturaMedia = alturaTotatl / quantPessoa;
        double percIdade = ((double) menores / quantPessoa) * 100.0;

        System.out.printf("\nAltura media = %.2f\n", alturaMedia);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percIdade);


        for (int i = 0; i < idade.length; i++) {
            if (idade[i] < 16) {
                System.out.printf("%s\n", nome[i]);
            }
        }


        sc.close();
    }
}
