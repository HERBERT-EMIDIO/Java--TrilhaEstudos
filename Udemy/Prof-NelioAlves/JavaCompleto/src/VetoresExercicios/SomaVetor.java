package VetoresExercicios;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o tamanho do vetor: ");
        int tamanho = sc.nextInt();
        int[] vet1 = new int[tamanho];
        int[] vet2 = new int[tamanho];


        for (int v1 = 0, v2 = 0; v1 < tamanho; v1++, v2++) {
            vet1[v1] = v1;
            vet2[v2] = v2;

            if (v1 == v2) {
                System.out.println(vet1[v1] + vet2[v2]);
            }
        }


        sc.close();
    }
}
