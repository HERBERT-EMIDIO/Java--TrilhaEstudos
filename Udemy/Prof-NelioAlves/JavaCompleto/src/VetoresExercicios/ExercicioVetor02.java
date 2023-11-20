package VetoresExercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioVetor02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int tamanho = sc.nextInt();

        double[] vect = new double[tamanho];

        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextDouble();
        }

        System.out.print("VALORES = ");
        for (int i = 0; i < vect.length; i++) {
            System.out.printf("%.1f ",vect[i]);
        }

        double sum = 0;
        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            sum += vect[i];

        }
        System.out.print("SOMA = " + sum);


        double media = sum / tamanho;
        System.out.println("MEDIA = " + media);


        sc.close();
    }
}
