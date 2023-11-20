package JavaFundamentos;
import java.util.Scanner;

public class ConsoleScanner {
    public static void main(String[] ars) {

        Scanner entrada= new Scanner(System.in);

        System.out.print("informe seu nome: ".toUpperCase());
        String nome = entrada.nextLine();
        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt();

        System.out.printf("Meu nome é %s \n",nome);
        System.out.printf("Minha idade é %d %n",idade);

        entrada.close();

    }
}
