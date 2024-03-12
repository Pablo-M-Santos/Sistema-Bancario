public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        ContaCorrente conta1 = new ContaCorrente(12345, "001");
        Cliente cliente1 = new Cliente("Pablo Moreria Santos", banco, conta1);
        banco.adicionarCliente(cliente1);

        cliente1.getContaCorrente().creditar(1000.0);

        for (Cliente cliente : banco.getClientes()) {
            System.out.println("Cliente: " + cliente.getNome());
            System.out.println("Número da Conta: " + cliente.getContaCorrente().getNumero());
            System.out.println("Agência: " + cliente.getContaCorrente().getAgencia());
            System.out.println("Banco: " + cliente.getBanco());
            System.out.println("Saldo: " + cliente.getContaCorrente().getSaldo());
            System.out.println();
        }
    }
}