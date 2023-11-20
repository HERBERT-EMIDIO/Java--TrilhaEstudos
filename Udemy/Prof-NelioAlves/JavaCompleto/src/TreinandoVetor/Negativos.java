package TreinandoVetor;

import java.util.Locale;
import java.util.Scanner;

public class Negativos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos números você vai digitar? ");
        int quantidade = sc.nextInt();
        int[] vect = new int[quantidade];


        for (int i = 0; i < vect.length; i++) {
            sc.nextLine();
            System.out.print("Digite um numero: ");
            vect[i] = sc.nextInt();
        }

        System.out.println("NÚMEROS NEGATIVOS:");
        for (int i = 0; i < vect.length; i++) {
            if(vect[i]<0){
                System.out.println(vect[i]);
            }
        }


        sc.close();
    }
}
