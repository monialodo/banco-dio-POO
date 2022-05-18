public class ContaCorrente extends Operacoes{

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }


    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfoConta();
    }
}
