public class RegularSubscription extends Subscription {
    private int sub_rate; //How many months 

    public RegularSubscription(String journal_name, String subscriber_name, String delivery_address, Double monthly_price, int sub_rate) {
        super(journal_name, subscriber_name, delivery_address, monthly_price);
        setSub_rate(sub_rate);
    }

    public int getSub_rate() {
        return this.sub_rate;
    }

    public void setSub_rate(int sub_rate) {
        this.sub_rate = sub_rate;
    }
    
    // super.printInvoice() takes the information from Subscription.java
    @Override
    public String printInvoice() {
        return "\nType of subscription: Regular" + super.printInvoice() + "\nRate (in months) = " + getSub_rate() + "\nPrice = " + getSub_rate()*super.getMonthly_price() + "\n";
    }
}
