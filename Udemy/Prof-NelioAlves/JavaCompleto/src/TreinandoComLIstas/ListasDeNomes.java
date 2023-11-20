package TreinandoComLIstas;

import java.util.*;

public class ListasDeNomes {
    public static void main(String[] args) {
        Scanner leitorTeclado = new Scanner(System.in);

        List<String> nomes = new ArrayList<String>();

        int sairLaco = 0;

        do {
            System.out.println("Digite um nome:");
            nomes.add(leitorTeclado.next());
            System.out.println("Deseja sair? SIM(1)");
            sairLaco = leitorTeclado.nextInt();
        } while (sairLaco != 1);

        Collections.sort(nomes);

        for (String nomesDigitados : nomes) {
            System.out.println(nomesDigitados);
        }


        leitorTeclado.close();
    }
}
