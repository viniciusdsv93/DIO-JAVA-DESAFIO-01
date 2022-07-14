import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in).useLocale(Locale.US);

    System.out.println("Enter your account's number:");
    int accountNumber = sc.nextInt();

    System.out.println("Enter your account's agency:");
    String accountAgency = sc.next();

    System.out.println("Enter your account's number:");
    String clientName = sc.next();

    System.out.println("Enter your total amount:");
    double amount = sc.nextDouble();

    System.out.println("Olá " + clientName + ", obrigado por criar uma conta em nosso banco, sua agência é " + accountAgency + ", conta " + accountNumber + " e seu saldo " + amount + " já está disponível para saque");


  }
}
