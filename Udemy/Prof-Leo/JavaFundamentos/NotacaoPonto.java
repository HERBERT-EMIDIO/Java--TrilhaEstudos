package JavaFundamentos;

import java.util.Locale;

public class NotacaoPonto {

    public static void main(String[]args){
        String nome = "herbert";
        nome=nome.toUpperCase(Locale.ROOT);

        System.out.println(nome);

        String saudacao = "Bom dia X";
        saudacao=saudacao.replace("X",nome);

        System.out.println(saudacao);

        saudacao=saudacao.concat("!!!");
        System.out.println(saudacao);
        System.out.println("oi".toUpperCase());


        String x = "Como vai você X".replace("X", "Felipe").toUpperCase().concat("!!!");
        System.out.println(x);
    }
}
