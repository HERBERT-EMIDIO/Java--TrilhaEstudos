public class MainCaneta {

    public static void main(String[] args) {

        Caneta c1 = new Caneta();
        c1.status();
        c1.modelo = "bic estrela";
        c1.carga = 100;
        c1.alterarCor("red");
        c1.rabiscar();
        c1.mudarPonta(18.0);
        c1.status();
    }

}
