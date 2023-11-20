package TreinandoVetor;

import java.util.Locale;
import java.util.Scanner;

public class mainNegativos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Exercicio01Negativos ex = new Exercicio01Negativos();
        ex.quantNumeros();
        System.out.println(ex);

     ex.numeros();





        sc.close();
    }
}
