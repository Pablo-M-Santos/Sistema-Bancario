public class Cliente {
    private String nome;
    private Banco banco;
    private ContaCorrente contaCorrente;
    public Cliente(String nome, Banco banco, ContaCorrente contaCorrente) {
        this.nome = nome;
        this.banco = banco;
        this.contaCorrente = contaCorrente;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public Banco getBanco() {
        return banco;
    }

    public ContaCorrente getContaCorrente() {
        return contaCorrente;
    }
    public void setContaCorrente(ContaCorrente contaCorrente) {
        this.contaCorrente = contaCorrente;
    }
}