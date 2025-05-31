import java.util.Scanner;

public class Currency_convertor{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Example exchange rates (you can update them)
        double usdToInr = 83.10;
        double eurToInr = 90.15;
        double gbpToInr = 105.20;
        double inrToUsd = 1 / usdToInr;
        double inrToEur = 1 / eurToInr;
        double inrToGbp = 1 / gbpToInr;

        System.out.println("=== Currency Converter ===");
        System.out.println("Supported currencies: INR, USD, EUR, GBP");

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();
        sc.nextLine();  // consume newline

        System.out.print("From currency (e.g., INR): ");
        String from = sc.nextLine().toUpperCase();

        System.out.print("To currency (e.g., USD): ");
        String to = sc.nextLine().toUpperCase();

        double result = 0;

        if (from.equals("INR") && to.equals("USD")) {
            result = amount * inrToUsd;
        } else if (from.equals("INR") && to.equals("EUR")) {
            result = amount * inrToEur;
        } else if (from.equals("INR") && to.equals("GBP")) {
            result = amount * inrToGbp;
        } else if (from.equals("USD") && to.equals("INR")) {
            result = amount * usdToInr;
        } else if (from.equals("EUR") && to.equals("INR")) {
            result = amount * eurToInr;
        } else if (from.equals("GBP") && to.equals("INR")) {
            result = amount * gbpToInr;
        } else {
            System.out.println("Conversion for " + from + " to " + to + " not supported.");
            return;
        }

        System.out.printf("Converted amount: %.2f %s\n", result, to);
    }
}