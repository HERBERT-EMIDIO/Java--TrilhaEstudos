package VetoresExercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioVetor05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();
        int[] numeros = new int[n];


        for (int i = 0; i < numeros.length; i++) {
            sc.nextLine();
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextInt();
        }


        System.out.println("NUMEROS NEGATIVOS:");

        for (int i = 0; i < numeros.length; i++) {

            if (numeros[i] < 0) {
                System.out.println(numeros[i]);
            }
        }


        sc.close();
    }
}
