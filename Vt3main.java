import java.util.Scanner;

public class Vt3main {

    static void printSubscriptionInvoice(Subscription subs) {
        System.out.print(subs.printInvoice());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Initialize the variables because of the while loops
        int sub_discount = 0;
        int sub_rate = 0;
        Double monthly_price = 0.00;

        System.out.println("Journal name: ");
        String journal_name = scanner.nextLine();
        System.out.println("Subscriber name: ");
        String subscriber_name = scanner.nextLine();
        System.out.println("Delivery address: ");
        String delivery_address = scanner.nextLine();
        //Prevent negative input
        while (true) {
            System.out.println("Monthly price: ");
            monthly_price = scanner.nextDouble();
            if (monthly_price > 0) {
                break;
            } else {
                System.out.println("The price can't be negative.");
                continue;
            }
        }
        //Prevent negative inputs, and a discount exceeding 100 %
        while (true) {
            System.out.println("Discount %: ");
            sub_discount = scanner.nextInt();
            if (sub_discount > 0 && sub_discount < 100) {
                break;
            } else {
                System.out.println("The discount can't be negative or greater than 100 %");
                continue;
            }
        }
        //Prevent negative input
        while (true) {
            System.out.println("Rate (number of months): ");
            sub_rate = scanner.nextInt();
            if (sub_rate > 0) {
                break;
            } else {
                System.out.println("The rate needs to be higher than 0.");
                continue;
            }
        }
        //Create the objects
        StandingSubscription StaSub = new StandingSubscription(journal_name, subscriber_name, delivery_address, monthly_price, sub_discount);
        RegularSubscription RegSub = new RegularSubscription(journal_name, subscriber_name, delivery_address, monthly_price, sub_rate);
        
        printSubscriptionInvoice(RegSub);
        printSubscriptionInvoice(StaSub);

        scanner.close();

    }
}
