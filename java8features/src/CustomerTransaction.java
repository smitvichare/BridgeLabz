import java.time.LocalDate;

public class CustomerTransaction {

    String customerId;
    LocalDate transactionDate;
    double transactionAmount;

    @Override
    public String toString() {
        return "CustomerTransaction{" +
                "customerId='" + customerId + '\'' +
                ", transactionDate=" + transactionDate +
                ", transactionAmount=" + transactionAmount +
                '}';
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public LocalDate getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(LocalDate transactionDate) {
        this.transactionDate = transactionDate;
    }

    public double getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(double transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public CustomerTransaction(String customerId, LocalDate transactionDate, double transactionAmount) {
        this.customerId = customerId;
        this.transactionDate = transactionDate;
        this.transactionAmount = transactionAmount;
    }
}
