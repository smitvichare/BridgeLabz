import java.util.Date;

public class Transaction {

    String transactionId;
    String policyNumber;
    double amount;
    Date transactionDate;
    boolean isFraudulent;

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionId='" + transactionId + '\'' +
                ", policyNumber='" + policyNumber + '\'' +
                ", amount=" + amount +
                ", transactionDate=" + transactionDate +
                ", isFraudulent=" + isFraudulent +
                '}';
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public boolean isFraudulent() {
        return isFraudulent;
    }

    public void setFraudulent(boolean fraudulent) {
        isFraudulent = fraudulent;
    }

    public Transaction(String transactionId, String policyNumber, double amount, Date transactionDate, boolean isFraudulent) {
        this.transactionId = transactionId;
        this.policyNumber = policyNumber;
        this.amount = amount;
        this.transactionDate = transactionDate;
        this.isFraudulent = isFraudulent;
    }
}
