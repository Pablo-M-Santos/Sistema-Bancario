import java.util.ArrayList;
import java.util.List;

// Classe principal
public class Main {
    public static void main(String[] args) {
        // Criação de um objeto do tipo Banco com o nome "Caixa"
        Banco banco = new Banco("Caixa");

        // Criação de uma conta com número 12345 e agência "001"
        Conta conta1 = new Conta(12345, "001");

        // Criação de um cliente com nome "Pablo Moreria Santos", associado ao banco e à conta criados anteriormente
        Cliente cliente1 = new Cliente("Pablo Moreria Santos", banco, conta1);

        // Adicionando o cliente criado ao banco
        banco.adicionarCliente(cliente1);

        // Creditando R$ 1000.0 na conta do cliente
        cliente1.getConta().creditar(1000.0);

        // Iterando sobre a lista de clientes do banco e exibindo informações de cada um
        for (Cliente cliente : banco.getClientes()) {
            System.out.println("Cliente: " + cliente1.getNome());
            System.out.println("Banco: " + cliente1.getBanco().getNome());
            System.out.println("Agência: " + cliente1.getConta().getAgencia());
            System.out.println("Saldo: " + cliente1.getConta().getSaldo());
            System.out.println();
        }
    }
}

// Feito por Pablo Santos
