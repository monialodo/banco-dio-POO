import java.util.Objects;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Cliente novoCliente = new Cliente();

        System.out.println("Qual o nome do cliente?");
        novoCliente.setNome(scan.next());

        System.out.printf("Olá %s%n", novoCliente.getNome());


        Operacoes cc = new ContaCorrente(novoCliente);
        ContaPoupanca poupanca = new ContaPoupanca(novoCliente);

        System.out.printf("Seu saldo em conta corrente é de %.2f%n", cc.saldo);

        cc.depositar();
        cc.transferir(poupanca);
        cc.sacar();


        System.out.println(" --- Deseja Imprimir Extrato ---");
        String resp = scan.next();


        while (resp.equals("s") || (resp.equals("S")) || (resp.equals("sim"))) {

            System.out.println("Qual extrato deseja imprimir? cc ou cp?");
            String extrato = scan.next();



            if (Objects.equals(extrato, "cc")) {
                cc.imprimirExtrato();
            } else poupanca.imprimirExtrato();
            System.out.println(" --- Deseja Imprimir Extrato ---");
            resp = scan.next();
        }

        System.out.println("Até logo");


    }
}
