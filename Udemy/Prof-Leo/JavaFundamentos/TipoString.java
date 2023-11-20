package JavaFundamentos;

public class TipoString {
    public static void main(String[] args) {

        System.out.println("Olá pessoal".charAt(2)); //á

        String s = "Boa tarde";

        s = "bola bonita";//substituição do valor boa tarde

        System.out.println("=============== Acrescentando com Concat ==================");
        System.out.println(s.concat("!!!!"));// não muda o original

        System.out.println("=============== modificando a String concatenação ==================");

        System.out.println(s + "!!!!");//muda o original


        //s =bola bonita
        System.out.println("============ Inicia com?=====================");

        System.out.println(s.startsWith("b"));//true inicia com b?

        System.out.println("=================================");


        String u = "olá";
        System.out.println(u.toUpperCase().startsWith("O"));//true-> transfomei e comparei

        System.out.println("============== Tranformo e Termina com? ===================");
        System.out.println(u.toUpperCase().endsWith("Á"));//termina com Á?

        System.out.println("================ Tamanho com length =================");
        System.out.println(u.length());//3


        System.out.println("==================================");
        var nome = "Herbert";
        var sobrenome = "Emidio";
        var idade = 40;
        var salario = 12250.250;

        System.out.println("== %s = String, %d = int, %f = float ==, %n = quebra de linha");
        System.out.printf("\nO Senhor %s %s possui %d anos de idade e seu salario é de R$%f"
                , nome, sobrenome, idade, salario, "\n\n");

        System.out.println("\n====== Usando o String.Format ============================");

        String frase = String.format("\nO Senhor %s %s possui %d anos de idade e seu salario é de R$%.2f %n", nome, sobrenome, idade, salario);
        System.out.println(frase);


    }
}
