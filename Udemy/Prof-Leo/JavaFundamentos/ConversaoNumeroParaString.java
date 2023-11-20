package JavaFundamentos;

public class ConversaoNumeroParaString {



    public static void main(String[]args){
        Integer num1 = 10000;

        System.out.println(num1.toString());

        System.out.println(num1.toString().length());//tranf em String e conto


        int num2 = 100000;
        System.out.println(Integer.toString(num2).length());

    }
}
