import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Por favor, digite o número da conta:");
    int accountNumber = sc.nextInt();

    System.out.println("Por favor, digite o número da agência:");
    String accountAgency = sc.next();

    System.out.println("Por favor, digite o nome do cliente:");
    String clientName = sc.next();

    System.out.println("Por favor, digite o saldo:");
    double amount = sc.nextDouble();

    System.out.println("Olá " + clientName + ", obrigado por criar uma conta em nosso banco, sua agência é " + accountAgency + ", conta " + accountNumber + " e seu saldo " + amount + " já está disponível para saque");
    sc.close();

  }
}
