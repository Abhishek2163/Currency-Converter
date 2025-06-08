import java.util.Scanner;

public class CurrencyConverter {

    // Exchange rates relative to INR
    static double USD_RATE = 83.10;
    static double EUR_RATE = 89.75;
    static double GBP_RATE = 105.30;
    static double JPY_RATE = 0.57;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do {
            try {
                System.out.println("\n===== Currency Converter =====");
                System.out.println("1. INR to USD");
                System.out.println("2. INR to EUR");
                System.out.println("3. INR to GBP");
                System.out.println("4. INR to JPY");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: ");
                choice = Integer.parseInt(scanner.nextLine());

                if (choice >= 1 && choice <= 4) {
                    System.out.print("Enter amount in INR: ");
                    double amount = Double.parseDouble(scanner.nextLine());
                    double converted = 0.0;
                    String currency = "";

                    switch (choice) {
                        case 1:
                            converted = amount / USD_RATE;
                            currency = "USD";
                            break;
                        case 2:
                            converted = amount / EUR_RATE;
                            currency = "EUR";
                            break;
                        case 3:
                            converted = amount / GBP_RATE;
                            currency = "GBP";
                            break;
                        case 4:
                            converted = amount / JPY_RATE;
                            currency = "JPY";
                            break;
                    }

                    System.out.printf("Converted Amount: %.2f %s\n", converted, currency);

                } else if (choice != 5) {
                    System.out.println("❌ Invalid choice. Please select from 1 to 5.");
                }

            } catch (NumberFormatException e) {
                System.out.println("⚠️ Invalid input! Please enter numeric values only.");
            } catch (Exception e) {
                System.out.println("⚠️ An unexpected error occurred: " + e.getMessage());
            }

        } while (choice != 5);

        System.out.println("👋 Thank you for using the Currency Converter!");
        scanner.close();
    }
}
