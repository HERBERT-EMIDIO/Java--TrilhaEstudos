package bank;

public class App {
    public static void main(String[] args) {

        System.out.println("Meu Bank");

        // LIMITAR O NOME = 12 CARACTERES
        // NAO PODER SACAR MAIS DO QUE TEM NA CONTA
        // DEPOSITAR
        // INFROMAR PARA O USUARIO AS OPERAÇÕES (SAQUE, DEPOSITO)

        // CRIAR UMA CONTA(AGENCIA, CONTA, NOME)
        Account account = new Account("0001", "1212", "Herbert Felipe Emidio");

        // SACAR VALORES
        account.sacar(1.00);
    
        account.deposito(200);

        account.sacar(200.00);

        account.mostrarSaldo();

        account.deposito(70000.00);

        account.mostrarSaldo();


    }

}
