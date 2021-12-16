import java.util.Locale;
import java.util.Scanner;
import util.CurrencyConverter;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price? ");
        double price = sc.nextDouble();

        System.out.print("How many dollars will be bought? ");
        double quantity = sc.nextDouble();

        System.out.printf("Amount to be paid in BRL = US$ %.2f\n", CurrencyConverter.dollarToReal(price, quantity));

        sc.close();
    }
}
