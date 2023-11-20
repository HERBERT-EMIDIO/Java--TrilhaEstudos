package Desafio_01;

public class DesafioMathPow {

    public static void main(String[] args) {

        int a = 2;
        int b = 3;

        double calcSup1 = (6 * (b + a));
        double calcPow1 = Math.pow(calcSup1, 2);
        double calcSUpInf = calcPow1 / (b*a);
        System.out.println(calcSUpInf);

        System.out.println("===========================================");

        double calcSup2 = ((1 - 5) * (2 - 7) )/ 2.0;
        double calcPow2 = Math.pow(calcSup2,2);
        System.out.println(calcPow2);
        System.out.println("===========================================");



        double umMenosOutro = calcSUpInf - calcPow2;
        double powGeral3 = Math.pow(umMenosOutro,3) / 1000;


        System.out.println(powGeral3);


    }
}
