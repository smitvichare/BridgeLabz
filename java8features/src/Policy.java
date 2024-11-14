import java.time.LocalDate;

public class Policy {

    String policyId;
    String policyHolderId;
    LocalDate expiryDate;
    double premiumAmount;
    String status;

    public Policy(String policyId, String policyHolderId, LocalDate expiryDate, double premiumAmount, String status) {
        this.policyId = policyId;
        this.policyHolderId = policyHolderId;
        this.expiryDate = expiryDate;
        this.premiumAmount = premiumAmount;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Policy{" +
                "policyId='" + policyId + '\'' +
                ", policyHolderId='" + policyHolderId + '\'' +
                ", expiryDate=" + expiryDate +
                ", premiumAmount=" + premiumAmount +
                ", status='" + status + '\'' +
                '}';
    }

    public String getPolicyId() {
        return policyId;
    }

    public String getPolicyHolderId() {
        return policyHolderId;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public double getPremiumAmount() {
        return premiumAmount;
    }

    public String getStatus() {
        return status;
    }
}
