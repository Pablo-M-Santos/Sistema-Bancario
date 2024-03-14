import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Classe principal
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Criação de um objeto do tipo Banco com o nome "Caixa"

        System.out.println("Digite o nome do banco: ");
        Banco banco = new Banco(scanner.nextLine());

        // Criação de uma conta com número 12345 e agência "001"

        Conta conta1 = new Conta();

        System.out.println("Digite o numero da conta:");
        conta1.setNumero(scanner.nextInt());

        scanner.nextLine();

        System.out.println("Digite o nome da agência: ");
        conta1.setAgencia(scanner.nextLine());

        // Criação de um cliente com nome "Pablo Moreria Santos", associado ao banco e à conta criados anteriormente
        Cliente cliente1 = new Cliente("Pablo Moreria Santos", banco, conta1);

        // Adicionando o cliente criado ao banco
        banco.adicionarCliente(cliente1);

        // Creditando R$ 1000.0 na conta do cliente
        cliente1.getConta().creditar(1000.0);

        scanner.close();

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
