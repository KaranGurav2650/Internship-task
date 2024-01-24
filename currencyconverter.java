import java.util.Scanner;
public class currency {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the base currency code:");
            String baseCurrency = sc.nextLine();

            System.out.print("Enter the target currency code:");
            String targetCurrency = sc.nextLine();

            System.out.print("Enter the amount to convert: ");
            double amount = sc.nextDouble();

            double exchangeRate = getExchangeRate(baseCurrency, targetCurrency);

            if (exchangeRate != -1) {
                double convertedAmount = amount * exchangeRate;
                System.out.printf("%.2f %s is equal to %.2f %s", amount, baseCurrency, convertedAmount, targetCurrency);
            } else {
                System.out.println("Sorry Failed to convert.");
            }

            sc.close();
        }private static double getExchangeRate(String baseCurrency, String targetCurrency) {
            return 0.2;
        }
}

