package JavaFundamentos;

public class MathPow {
    public static void main(String[]args){
        System.out.println("Usando o Método Math.pow(num, potencia) retorna um double");

        //EX;

        int a = 12;
        int b =2;
        //Ex1 com cast
        int calc = (int)Math.pow(a,b);
        System.out.println(calc); //144


        //EX2
        double c = 3 * 4 -10;
        double calc2 = Math.pow(c,2);
        System.out.println(calc2);//4.0


    }
}
