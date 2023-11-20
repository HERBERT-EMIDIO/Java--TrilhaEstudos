package JavaFundamentos;

public class Temperatura {

    public static void main(String[]args){
        System.out.println("Informe a temperatura em Fahrenheit:");
        final double F = 85;

        final double fator = 5.0/9.0;
        double valor =32;

        double temperaturaEmC = (F - valor) * fator;
        System.out.println("A Temperatura em Celsius é de: " + temperaturaEmC + "°C.");



    }
}
