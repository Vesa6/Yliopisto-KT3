public class StandingSubscription extends Subscription {
    private int sub_discount;

    public StandingSubscription(String journal_name, String subscriber_name, String delivery_address, Double monthly_price, int sub_discount) {
        super(journal_name, subscriber_name, delivery_address, monthly_price);
        setSub_discount(sub_discount);
    }

    public int getSub_discount() {
        return this.sub_discount;
    }

    public void setSub_discount(int sub_discount) {
        this.sub_discount = sub_discount;
    }

    // super.printInvoice() takes the information from Subscription.java
    @Override
    public String printInvoice() {
        return "\nType of subscription: Standing" + super.printInvoice() + "\nDiscount % = " + getSub_discount() + "\nPrice = " + 12 * (super.getMonthly_price() * (100 - getSub_discount()) / 100) + " per year";
    }
}

