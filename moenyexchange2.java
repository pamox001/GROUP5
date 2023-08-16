import java.util.*;
import java.io.*;

public class MoneyExchange {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner console = new Scanner(new File("USD.txt"));
        Scanner scanner = new Scanner(System.in);

        System.out.println("WELCOME!");

        while (true) {
            System.out.println("What currency would you like to exchange today: USD, EUR, GBP, or JPY?");
            String choice = scanner.nextLine();

            if (choice.equals("USD") || choice.equals("EUR") || choice.equals("GBP") || choice.equals("JPY")) {
                System.out.println("Do you want to exchange it to 1-USD, 2-EUR, 3-GBP, 4-JPY, or 5-All?");
                int currency = scanner.nextInt();
                System.out.println("How much would you like to exchange today?");
                double amount = scanner.nextDouble();

                if (choice.equals("USD")) {
                    exUSD(console, currency, amount);
                } else if (choice.equals("EUR")) {
                    exEUR(console, currency, amount);
                } else if (choice.equals("JPY")) {
                    exJPY(console, currency, amount);
                } else if (choice.equals("GBP")) {
                    exGBP(console, currency, amount);
                }

                System.out.println("Do you want to exchange money again? Y or N");
                scanner.nextLine(); // Consume the newline left by nextDouble()
                String go = scanner.nextLine();
                if (go.equalsIgnoreCase("N")) {
                    break;
                }
            } else {
                System.out.println("Please input a valid choice!");
            }
        }
    }

    public static void exUSD(Scanner console, int currency, double amount) {
        double p = 0.00;
        double n = 0.00;
        double d = 0.00;

        while (console.hasNext()) {
            String coin = console.next();
            double count = console.nextDouble();
            if (coin.equals("EUR")) {
                p = amount * count; // 0.91
            } else if (coin.equals("GBP")) {
                n = amount * count; // 0.78
            } else if (coin.equals("JPY")) {
                d = amount * count; // 142.48
            }
        }

        if (currency == 1) {
            System.out.println("USD to EUR: " + p);
        } else if (currency == 2) {
            System.out.println("USD to GBP: " + n);
        } else if (currency == 3) {
            System.out.println("USD to JPY: " + d);
        } else if (currency == 4) {
            System.out.println("USD to EUR: " + p + "  GBP: " + n + "  JPY: " + d);
        }
    }

    public static void exEUR(Scanner console, int currency, double amount) {
        double p = 0.00;
        double n = 0.00;
        double d = 0.00;
        double x = 0.00;

        while (console.hasNext()) {
            String coin = console.next();
            double count = console.nextDouble();
            if (coin.equals("EUR")) {
                x = (1 / count);
                p = amount * x; // 1.10
                if (coin.equals("GBP")) {
                    n = amount * count * x; // 0.86
                } else if (coin.equals("JPY")) {
                    d = amount * count * x; // 156.74
                }
            }
        }

        if (currency == 1) {
            System.out.println("EUR to USD: " + p);
        } else if (currency == 2) {
            System.out.println("EUR to GBP: " + n);
        } else if (currency == 3) {
            System.out.println("EUR to JPY: " + d);
        } else if (currency == 4) {
            System.out.println("EUR to USD: " + p + "  GBP: " + n + "  JPY: " + d);
        }
    }

    public static void exGBP(Scanner console, int currency, double amount) {
        double p = 0.00;
        double n = 0.00;
        double d = 0.00;
        double x = 0.00;

        while (console.hasNext()) {
            String coin = console.next();
            double count = console.nextDouble();
            if (coin.equals("GBP")) {
                x = (1 / count);
                p = amount * x; // 1.27
                if (coin.equals("EUR")) {
                    n = amount * count * x; // 1.16
                } else if (coin.equals("JPY")) {
                    d = amount * count * x; // 182.85
                }
            }
        }

        if (currency == 1) {
            System.out.println("GBP to USD: " + p);
        } else if (currency == 2) {
            System.out.println("GBP to EUR: " + n);
        } else if (currency == 3) {
            System.out.println("GBP to JPY: " + d);
        } else if (currency == 4) {
            System.out.println("GBP to USD: " + p + "  EUR: " + n + "  JPY: " + d);
        }
    }

    public static void exJPY(Scanner console, int currency, double amount) {
        double p = 0.00;
        double n = 0.00;
        double d = 0.00;
        double x = 0.00;

        while (console.hasNext()) {
            String coin = console.next();
            double count = console.nextDouble();
            if (coin.equals("JPY")) {
                x = (1 / count);
                p = amount * x; // 0.007
                if (coin.equals("EUR")) {
                    n = amount * count * x; // 0.0064
                } else if (coin.equals("GBP")) {
                    d = amount * count * x; // 0.0055
                }
            }
        }

        if (currency == 1) {
            System.out.println("JPY to USD: " + p);
        } else if (currency == 2) {
            System.out.println("JPY to EUR: " + n);
        } else if (currency == 3) {
            System.out.println("JPY to GBP: " + d);
        } else if (currency == 4) {
            System.out.println("JPY to USD: " + p + "  EUR: " + n + "  GBP: " + d);
        }
    }
}
