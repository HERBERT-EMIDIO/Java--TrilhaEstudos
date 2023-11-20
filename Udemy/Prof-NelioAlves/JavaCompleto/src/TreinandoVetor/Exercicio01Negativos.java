package TreinandoVetor;

import javax.security.sasl.SaslClient;
import java.util.Scanner;

public class Exercicio01Negativos {


    private int numero;


    public Exercicio01Negativos() {

    }

    public Exercicio01Negativos(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }


    int[] vect = new int[0];


    public void quantNumeros() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos números você vai digitar? ");
        vect = new int[sc.nextInt()];

        for (int i = 0; i < vect.length; i++) {
            System.out.print("Digite um número: ");
            vect[i] = sc.nextInt();
            if (vect[i] < 0) {
                System.out.println("Números Negativos: " + vect[i]);
            } else {
                System.out.println("Números positivos: " + vect[i]);
            }
        }


    }

    public void numeros() {
        System.out.print("Os números Positivos: ");
        System.out.println();
        for (int i = 0; i < vect.length; i++) {
            if (vect[i] > 0) {
                System.out.println(vect[i]);
            }else
                System.out.println(vect[i]);
        }
    }


    @Override
    public String toString() {
        return "Exercicio01Negativos{" +
                "vect =" + vect
                + '}';
    }
}


