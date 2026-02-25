
   public class Payment extends BaseEntity implements Taxable {
    private double baseFee;
    private String paymentStatus;

    public Payment(String paymentId, double baseFee) {
        super(paymentId); 
        this.baseFee = baseFee;
        this.paymentStatus = "Pending";
    }

    @Override
    public double calculateTotal(double amount) {
        return amount + (amount * TAX_RATE);
    }
    public void processPayment() {
        this.paymentStatus = "Completed";
        System.out.println("Payment " + getEntityId() + " has been processed.");
    }

    @Override
    public void showDetails() {
        double total = calculateTotal(baseFee);
        System.out.println("--- Payment Transaction ---");
        System.out.println("Transaction ID: " + getEntityId());
        System.out.println("Status: " + paymentStatus);
        System.out.println("Base Fee: KES " + baseFee);
        System.out.println("Total (incl. 15% Tax): KES " + total);
    }
} 
}
