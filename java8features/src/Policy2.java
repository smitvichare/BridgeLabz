public class Policy2 {

    private String policyId;
    private String policyHolderId;

    @Override
    public String toString() {
        return "Policy2{" +
                "policyId='" + policyId + '\'' +
                ", policyHolderId='" + policyHolderId + '\'' +
                '}';
    }

    public String getPolicyId() {
        return policyId;
    }

    public String getPolicyHolderId() {
        return policyHolderId;
    }

    public Policy2(String policyId, String policyHolderId) {
        this.policyId = policyId;
        this.policyHolderId = policyHolderId;
    }
}
