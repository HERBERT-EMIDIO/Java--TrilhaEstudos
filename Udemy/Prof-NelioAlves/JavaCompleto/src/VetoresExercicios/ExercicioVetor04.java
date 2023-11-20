package VetoresExercicios;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioVetor04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numeros;
        System.out.print("Quantos numeros voce vai digitar? ");
        numeros = sc.nextInt();

        int[] listaNumeros = new int[numeros];


        for (int i = 0; i < listaNumeros.length; i++) {
            sc.nextLine();
            System.out.print("Digite um numero: ");
            listaNumeros[i]= sc.nextInt();
        }

        System.out.println("\nNUMEROS PARES:");

        int quantPares = 0;
        for (int i = 0; i < listaNumeros.length; i++) {
            if (listaNumeros[i] % 2 == 0) {
                System.out.printf("%d ", listaNumeros[i]);
                quantPares++;
            }
        }

        System.out.printf("\n\nQUANTIDADE DE PARES = %d\n", quantPares);


        sc.close();
    }
}
