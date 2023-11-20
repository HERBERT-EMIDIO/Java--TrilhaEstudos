public class Caneta {

    //Atributos ou Caracteristicas
    public String modelo;
    private String cor;
    private double ponta;
    protected int carga;
    protected boolean tampa;

    //Métodos ou Comportamentos

    public void status() {
        System.out.printf("Caneta do modelo : %s %n", modelo);
        System.out.printf("Caneta da cor: %s %n", cor);
        System.out.println("Caneta com a pota: " + ponta);
        System.out.println("Caneta com a carga: " + carga);
        System.out.println("A Caneta está com tampa? " + tampa);
    }


    public void rabiscar() {
        if (this.tampa == false) {
            System.out.println("A caneta está destampada, é possível escrever!");
        } else {
            System.out.println("Erro: Não se escreve com a Caneta tampada! obs: Retire a tampa. ");
        }
    }

    private void destampar() {
        this.tampa = false;
    }

    private void tampar() {
        this.tampa = true;
    }


    //Criação de Método publico para mudar o Atributo que é private
    protected void mudarPonta(double value) {
        this.ponta = value;
        System.out.println("Agora a ponta é : " + ponta);
    }

    void alterarCor(String cor) {
        this.cor = cor;
        System.out.printf("A cor da Caneta escolhida foi %s %n", cor);
    }

}
