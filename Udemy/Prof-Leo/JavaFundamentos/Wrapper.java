package JavaFundamentos;

import java.util.Scanner;

public class Wrapper {
    public static void main(String[] args) {
        Scanner entradaDados = new Scanner(System.in);
        //byte
        Byte b = 100;
        Short s = 1000;
        Integer i = 10000;
        Long l = 100000L;

        System.out.println(b.byteValue());
        System.out.println(s.toString());

//converter de int para String
        Integer valorEntrada = Integer.parseInt(entradaDados.next());
        System.out.println(valorEntrada);

//converter de boolean para String
        Boolean boo = true;
        System.out.println(boo.toString().toUpperCase());

//converter de String para boolean

        Boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo);




        entradaDados.close();
    }
}
