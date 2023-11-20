package JavaFundamentos;

public class ConversaoTiposPrimitivoNumerico {

    public static void main(String[]args){


        double a = 1;


        //Conversao explicita = cast forçando que a conversão podendo perder dados

        float valor1 = (float) 12.90;

        //usa-se o F no final por menor valor que seja
        //float valor2 = 12.2F;


        // Fazendo outro cast com byte

        int c =256;
        byte d = (byte)c;
        System.out.println(d);//0






    }
}
