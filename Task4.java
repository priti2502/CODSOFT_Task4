package codesoft;

import java.util.Scanner;

public class Task4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Currency Converter");
        System.out.println("Supported currencies: USD, EUR, GBP, INR");

        System.out.print("Enter the amount: ");
        double amount = scanner.nextDouble();

        System.out.print("Enter the source currency (e.g., USD): ");
        String sourceCurrency = scanner.next().toUpperCase();

        System.out.print("Enter the target currency (e.g., EUR): ");
        String targetCurrency = scanner.next().toUpperCase();

        double convertedAmount = convertCurrency(amount, sourceCurrency, targetCurrency);

        System.out.println(amount + " " + sourceCurrency + " is equal to " + convertedAmount + " " + targetCurrency);

        scanner.close();
    }

    private static double convertCurrency(double amount, String sourceCurrency, String targetCurrency) {
        // Simple conversion rates for demonstration purposes
        double usdToEurRate = 0.92;
        double usdToGbpRate = 0.79;
        double usdToInrRate = 82.91;
        double eurToUsdRate = 1.08;
        double gbpToUsdRate = 1.26;
        double inrToUsdRate = 1 / usdToInrRate;

        if (sourceCurrency.equals("USD") && targetCurrency.equals("EUR")) {
            return amount * usdToEurRate;
        } else if (sourceCurrency.equals("USD") && targetCurrency.equals("GBP")) {
            return amount * usdToGbpRate;
        } else if (sourceCurrency.equals("USD") && targetCurrency.equals("INR")) {
            return amount * usdToInrRate;
        } else if (sourceCurrency.equals("EUR") && targetCurrency.equals("USD")) {
            return amount * eurToUsdRate;
        } else if (sourceCurrency.equals("GBP") && targetCurrency.equals("USD")) {
            return amount * gbpToUsdRate;
        } else if (sourceCurrency.equals("INR") && targetCurrency.equals("USD")) {
            return amount * inrToUsdRate;
        } else {
            System.out.println("Unsupported conversion");
            return 0.0;
        }
    }
}
