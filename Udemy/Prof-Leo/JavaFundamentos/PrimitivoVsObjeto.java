package JavaFundamentos;

public class PrimitivoVsObjeto {

    //JAVA POSSUI 8 TIPOS PRIMITIVOS (BYTE,SHORT, INT, LONG, FLOAT, DOUBLE, BOOLEAN, CHAR)

    public static void main(String[] args){
        String s = new String("texto");
        s = s.toUpperCase();

        System.out.println(s);


        //WRAPPERS SAO A VERSÃO OBJETOS DOS TIPOS PRIMITIVOS!
        int a = 123;
        System.out.println(a);

    }
}
