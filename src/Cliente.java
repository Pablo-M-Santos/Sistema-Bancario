class Cliente {
    private String nome;
    private Banco banco;
    private Conta conta;

    public Cliente(String nome, Banco banco, Conta conta) {
        this.nome = nome;
        this.banco = banco;
        this.conta = conta;
        this.conta.setCliente(this);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }
    
    public String getBancoNome() {
        return banco.getNome();
    }
}