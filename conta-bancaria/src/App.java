import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome da agencia: ");
        String nomeAgencia = sc.next();

        System.out.println("Digite o número da agencia: ");
        Integer numero = sc.nextInt();

        System.out.println("Digite o nome do cliente: ");
        String nomeCliente = sc.next();

        System.out.println("Digite saldo inicial do cliente: ");
        Double saldo = sc.nextDouble();

        ContaTerminal conta = new ContaTerminal(numero, nomeAgencia, nomeCliente, saldo);

        System.out.println("Olá "+ conta.getNomeCliente() +", obrigado por criar uma conta em nosso banco, sua agência é " + conta.getAgencia() + ", conta " + conta.getNumero() + " e seu saldo "+ conta.getSaldo() +" já está disponível para saque");

        sc.close();
    }
}
