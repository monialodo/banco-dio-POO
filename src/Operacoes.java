import java.util.Scanner;

public class Operacoes extends Conta {


    public Operacoes(Cliente cliente) {
        super(cliente);
    }


    public void sacar() {
        Scanner scan = new Scanner(System.in);
        System.out.println(" --- Sacar de conta corrente ---");
        System.out.println("Qual o valor do saque? ");
        int saque = scan.nextInt();

        if (saldo < saque) {
            System.out.println("Saque não permitido");
        }else {
            saldo -= saque;
        System.out.printf("Você sacou: %d%n", saque);
        }
        System.out.printf("Seu saldo em conta corrente é de:  %.2f%n", saldo);

    }


    public void depositar() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o valor do depósito? ");
        int depositar = scan.nextInt();

        saldo += depositar;

        System.out.printf("Você depositou: %d%n", depositar);
        System.out.printf("Seu saldo em conta corrente agora é de:  %.2f%n", saldo);

    }


    public void transferir(ContaPoupanca contaDestino ) {

       Scanner scan = new Scanner(System.in);
        System.out.println(" --- Transferir para a poupança ---");
        System.out.println("Qual o valor da transferencia? ");
        double valor = scan.nextInt();
        contaDestino.saldo += valor;
        saldo -= contaDestino.saldo;



        System.out.printf("Você transferiu:  %.2f%n", valor);
        System.out.printf("Seu saldo em conta poupança agora é de: %.2f%n", contaDestino.saldo);
        System.out.printf("Seu rendimento mensal é de: %.2f%n", (contaDestino.saldo * 0.05));

    }



    public void imprimirInfoConta() {
        System.out.printf("Titular: %s%n", this.cliente.getNome());
        System.out.printf("Agencia: %d%n", this.agencia);
        System.out.printf("Numero: %d%n", this.numero);
        System.out.printf("Saldo: %.2f%n", this.saldo);

    }

    public void imprimirExtrato() {

    }






}





