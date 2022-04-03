public class Subscription {
    private String journal_name;
    private String subscriber_name;
    private String delivery_address;
    private Double monthly_price;

    public Subscription(String journal_name, String subscriber_name, String delivery_address, Double monthly_price) {
        setJournal_name(journal_name);
        setSubscriber_name(subscriber_name);
        setDelivery_address(delivery_address);
        setMonthly_price(monthly_price);
    }

    public String getJournal_name() {
        return this.journal_name;
    }

    public void setJournal_name(String journal_name) {
        this.journal_name = journal_name;
    }

    public String getSubscriber_name() {
        return this.subscriber_name;
    }

    public void setSubscriber_name(String subscriber_name) {
        this.subscriber_name = subscriber_name;
    }

    public String getDelivery_address() {
        return this.delivery_address;
    }

    public void setDelivery_address(String delivery_address) {
        this.delivery_address = delivery_address;
    }

    public Double getMonthly_price() {
        return this.monthly_price;
    }

    public void setMonthly_price(Double monthly_price) {
        this.monthly_price = monthly_price;
    }

    public String printInvoice() {
        return "\nJournal name = " + getJournal_name() + "\nSubscriber name = " + getSubscriber_name()
                + "\nDelivery address = " + getDelivery_address() +
                "\nMonthly price = " + getMonthly_price();
    }

}
