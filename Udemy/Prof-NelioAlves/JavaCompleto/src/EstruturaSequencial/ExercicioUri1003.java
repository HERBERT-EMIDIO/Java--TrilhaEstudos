package EstruturaSequencial;

import java.util.Scanner;

public class ExercicioUri1003 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma \n" +
                "mensagem explicativa, conforme exemplos");

        System.out.print("Digite um nùmero: ");
        int fristValue = sc.nextInt();
        System.out.print("Digite outro nùmero: ");
        int secondValue = sc.nextInt();
        System.out.println();
        int sum = fristValue + secondValue;

        System.out.println("Soma = "+ sum);

        System.out.println("Fim");
        sc.close();


    }
}
