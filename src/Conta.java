class Banco {
    private String nome;
    private List<Cliente> clientes;

    public Banco(String nome) {
        this.clientes = new ArrayList<>();
        this.nome = nome;
    }

    public void adicionarCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public String getNome() {
        return nome;
    }
}