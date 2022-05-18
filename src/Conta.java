import java.util.Random;

public abstract class Conta {

    protected static final int AGENCIA_PADRAO = 001;
    protected int agencia;
    protected final int numero;
    protected double saldo;
    protected Cliente cliente;

    Random random = new Random();



    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = random.nextInt(10000);
        this.cliente = cliente;
        this.saldo = 0.0;

    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {

        return numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }



}
