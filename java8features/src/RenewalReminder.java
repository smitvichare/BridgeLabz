public class RenewalReminder {

    String policyId;
    String policyHolderId;
    long remainingDaysUntilExpiry;

    @Override
    public String toString() {
        return "RenewalReminder{" +
                "policyId='" + policyId + '\'' +
                ", policyHolderId='" + policyHolderId + '\'' +
                ", remainingDaysUntilExpiry=" + remainingDaysUntilExpiry +
                '}';
    }

    public String getPolicyId() {
        return policyId;
    }

    public String getPolicyHolderId() {
        return policyHolderId;
    }

    public long getRemainingDaysUntilExpiry() {
        return remainingDaysUntilExpiry;
    }

    public RenewalReminder(String policyId, String policyHolderId, long remainingDaysUntilExpiry) {
        this.policyId = policyId;
        this.policyHolderId = policyHolderId;
        this.remainingDaysUntilExpiry = remainingDaysUntilExpiry;
    }
}
