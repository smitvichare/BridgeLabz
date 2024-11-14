import java.time.LocalDate;

public class Transaction2 {

    private String transactionId;
    private String policyId;
    private double amount;

    @Override
    public String toString() {
        return "Transaction2{" +
                "transactionId='" + transactionId + '\'' +
                ", policyId='" + policyId + '\'' +
                ", amount=" + amount +
                ", transactionDate=" + transactionDate +
                '}';
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDate transactionDate) {
        this.transactionDate = transactionDate;
    }

    public Transaction2(String transactionId, String policyId, double amount, LocalDate transactionDate) {
        this.transactionId = transactionId;
        this.policyId = policyId;
        this.amount = amount;
        this.transactionDate = transactionDate;
    }

    private LocalDate transactionDate;
}
