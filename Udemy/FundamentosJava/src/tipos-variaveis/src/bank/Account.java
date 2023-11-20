package bank;

public class Account {

    private static final int MAX_LENGTH = 16;

    private String agencia;
    private String conta;
    private String nome;

    private double balenace = 0;

    private Log logger = new Log();

    public Account(String agencia, String conta, String nome) {
        this.agencia = agencia;
        this.conta = conta;
        this.steName(nome);

    }

    public void steName(String nome) {
        logger.out("Nome Titular\n");
        if (nome.length() > MAX_LENGTH) {
            this.nome = nome.substring(0, MAX_LENGTH);
        } else {
            this.nome = nome;
        }
        System.out.println(this.nome);
        System.out.println();
    }

    public void deposito(double value) {
        logger.out("Deposito\n");
        balenace += value;
        System.out.printf("Você realizou um Deposito de R$%.2f%nSeu Saldo atual é: R$%.2f%n", value, balenace);
        System.out.println();
    }

    public void sacar(double value) {

        if (balenace < value) {
            logger.out("Seu saldo está Negativo!\n");
            System.out.printf("Seu saldo é: R$%.2f%n", balenace);
            System.out.println();
        }

        else {
            balenace -= value;

            System.out.println("O valor do seu Saque foi: " + value + ". \nO valor atua de sua Conta é: " + balenace);
            System.out.println();
        }

    }

    public void mostrarSaldo() {
        logger.out("Saldo da conta: R$" + balenace);
        System.out.println();
    }

}
