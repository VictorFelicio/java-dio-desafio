import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numeroDaConta;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Por favor, digite o nome do Cliente!");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência!");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta!");
        numeroDaConta = scanner.nextInt();

        System.out.println("Por favor, digite o saldo da conta!");
        saldo = scanner.nextFloat();

        String saldoEmReal = String.format("%.2f", saldo);

        scanner.close();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + " conta " + numeroDaConta + " e seu saldo de R$" + saldoEmReal
                + " já está disponível para saque.");

    }
}