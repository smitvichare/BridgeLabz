import java.util.*;
import java.util.stream.Collectors;

public class FraudMain {

    public static void main(String[] args) {

        List<Transaction> transactions = Arrays.asList(
                new Transaction("T1", "P100", 12000, new Date(), true),
                new Transaction("T2", "P100", 30000, new Date(), true),
                new Transaction("T3", "P100", 5000, new Date(), false),
                new Transaction("T4", "P200", 11000, new Date(), true),
                new Transaction("T5", "P200", 40000, new Date(), true),
                new Transaction("T6", "P300", 1000, new Date(), true)
        );

        List<Transaction> q1=transactions.stream().filter(a->a.isFraudulent() && a.getAmount()>10000).collect(Collectors.toUnmodifiableList());
        System.out.println(q1);
        Map<String,List<Transaction>> q2=transactions.stream().collect(Collectors.groupingBy(e->e.getPolicyNumber()));
        System.out.println(q2);
        Map<String,List<Transaction>> q3=transactions.stream().filter(e->e.isFraudulent()).collect(Collectors.groupingBy(e->e.getPolicyNumber()));
        Map<String, Map<String, Double>> q3f = q3.entrySet().stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        entry -> {
                            List<Transaction> policyTransactions = entry.getValue();
                            int fraudCount = policyTransactions.size();
                            double totalFraudAmount = policyTransactions.stream()
                                    .mapToDouble(Transaction::getAmount)
                                    .sum();
                            Map<String, Double> summary = new HashMap<>();
                            summary.put("Fraud Count",(double)  fraudCount);
                            summary.put("Total Fraud Amount", totalFraudAmount);
                            return summary;
                        }
                ));
        System.out.println(q3f);
        System.out.println("Alerted Policies:");
        q3f.forEach((policyNumber, summary) -> {
            double fraudCount = summary.get("Fraud Count");
            double totalFraudAmount = summary.get("Total Fraud Amount");
            if (fraudCount > 5 || totalFraudAmount > 50000) {
                System.out.println("Policy Number: " + policyNumber + ", Fraud Count: " + (int)fraudCount + ", Total Fraud Amount: $" + totalFraudAmount);
            }
        });
    }
}
