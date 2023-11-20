package VetoresExercicios;

import java.sql.SQLOutput;
import java.util.Locale;
import java.util.Scanner;

public class VetoresIntercalado {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int[] vect1 = new int[10];
        int[] vect2 = new int[10];
        int[] vect3 = new int[20];

        int i = 0;
        int j = 0;

        for (i = 0; i < 10; i++) {
            System.out.println("Informe o valor para a posição " + (i + 1) + " do vetor 1");
            vect1[i] = Integer.parseInt(sc.nextLine());
        }

        for (i = 0; i < 10; i++) {
            System.out.println("Informe o valor para a posição " + (i + 1) + " do vetor 2");
            vect2[i] = Integer.parseInt(sc.nextLine());
        }


        for (i = 0; i < 10; i++) {
            vect3[j] = vect1[i];
            j++;
            vect3[j] = vect2[i];
            j++;
        }

        sc.close();
    }
}
