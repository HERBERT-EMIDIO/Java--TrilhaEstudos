public class FuncoesParaString {
    public static void main(String[] args) {


        String original = "abcde FGHIJ Klmn     ";

        //1.FORMATAR: toLowerCase(); e toUpperCase();

        String format01 = original.toLowerCase();
        System.out.println(format01); //   abcde fghij klmn
        String format02 = original.toUpperCase();
        System.out.println(format02); // ABCDE FGHIJ KLMN
        System.out.println("====================================");

        //2.RECORTAR: substring(2); / substring(2, 9); / original.replace("a","Herbert" );/
        String format03 = original.substring(2);
        System.out.println(format03); // cde FGHIJ Klmn
        String format04 = original.substring(1, 10);
        System.out.println(format04); // bcde FGHI
        String formart05 = original.replace("a", "Herbert");
        System.out.println(formart05); // Herbertbcde FGHIJ Klmn
        int format06 = original.indexOf("FG");
        System.out.println("primeira ocorencia do FG: " + format06); // 6

        System.out.println("==========================================");

        //3.SPLIT

        String caixaDeVerduras ="potato-apple-lemon-alface-tomate-pepino";
        String[] vect = caixaDeVerduras.split("-");
        String caixaCompras = vect[0];
        caixaCompras = vect[1];
        caixaCompras = vect[2];
        System.out.println(caixaDeVerduras);
        System.out.println(caixaCompras);

        for(int i=0; i< vect.length;i++){
            System.out.println(vect[i]);
        }



        //3.SUSTITUIR:
        //4.BUSCAR:


    }
}
