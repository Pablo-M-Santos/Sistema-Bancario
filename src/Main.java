import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("Caixa");

        Conta conta1 = new Conta(12345, "001");
        Cliente cliente1 = new Cliente("Pablo Moreria Santos", banco, conta1);
        banco.adicionarCliente(cliente1);

        cliente1.getConta().creditar(1000.0);

        for (Cliente cliente : banco.getClientes()) {
            System.out.println("Cliente: " + cliente.getNome());
            System.out.println("Banco: " + cliente.getBanco().getNome());
            System.out.println("Agência: " + cliente.getConta().getAgencia());
            System.out.println("Saldo: " + cliente.getConta().getSaldo());
            System.out.println();
        }
    }
}