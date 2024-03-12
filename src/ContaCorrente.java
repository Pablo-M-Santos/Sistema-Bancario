class Conta {
    private int numero;
    private String agencia;
    private double saldo;
    private Cliente cliente;

    public Conta(int numero, String agencia) {
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = 0.0;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void debitar(double valor) {
        saldo -= valor;
    }

    public void creditar(double valor) {
        saldo += valor;
    }
}