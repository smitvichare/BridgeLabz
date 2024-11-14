import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.*;
import java.util.stream.Collectors;

public class FraudPolicyMain {

    public static void main(String[] args) {

        List<Transaction2> transactions = Arrays.asList(
                new Transaction2("T1", "P1", 15000, LocalDate.now().minusMonths(1)),
                new Transaction2("T2", "P1", 12000, LocalDate.now().minusMonths(3)),
                new Transaction2("T3", "P1", 18000, LocalDate.now().minusMonths(5)),
                new Transaction2("T8", "P1", 20000, LocalDate.now().minusMonths(2)),
                new Transaction2("T9", "P1", 13000, LocalDate.now().minusMonths(1)),
                new Transaction2("T4", "P2", 11000, LocalDate.now().minusMonths(2)),
                new Transaction2("T5", "P2", 25000, LocalDate.now().minusMonths(4)),
                new Transaction2("T10", "P2", 5000, LocalDate.now().minusMonths(1)),
                new Transaction2("T6", "P3", 9000, LocalDate.now().minusMonths(6)),
                new Transaction2("T7", "P3", 11000, LocalDate.now().minusMonths(1)),
                new Transaction2("T11", "P4", 15000, LocalDate.now().minusMonths(7)),
                new Transaction2("T12", "P4", 17000, LocalDate.now().minusMonths(8)),
                new Transaction2("T13", "P4", 14000, LocalDate.now().minusMonths(6)),
                new Transaction2("T14", "P4", 16000, LocalDate.now().minusMonths(6)),
                new Transaction2("T15", "P5", 12000, LocalDate.now().minusMonths(1)),
                new Transaction2("T16", "P5", 12500, LocalDate.now().minusMonths(2)),
                new Transaction2("T17", "P5", 18000, LocalDate.now().minusMonths(3)),
                new Transaction2("T18", "P5", 15500, LocalDate.now().minusMonths(4)),
                new Transaction2("T19", "P5", 21000, LocalDate.now().minusMonths(5))

        );

        // Sample policies
        List<Policy2> policies = Arrays.asList(
                new Policy2("P1", "H1"),
                new Policy2("P2", "H2"),
                new Policy2("P3", "H3"),
                new Policy2("P4", "H4"),
                new Policy2("P5", "H1")
        );

        Map<String, List<Transaction2>> q1a = transactions.stream()
                .filter(t -> t.getAmount() > 10000 && t.getTransactionDate().isAfter(LocalDate.now().minus(6, ChronoUnit.MONTHS)))
                .collect(Collectors.groupingBy(Transaction2::getPolicyId));
        List<String> q1=q1a.entrySet().stream()
                .filter(entry -> entry.getValue().size() > 3) // More than 3 high-value transactions
                .map(Map.Entry::getKey) // Retrieve policyId
                .collect(Collectors.toList());

        System.out.println(q1);
        Map<String, List<Policy2>> q2=policies.stream()
                .filter(p -> q1.contains(p.getPolicyId())) // Filter high-value policies
                .collect(Collectors.groupingBy(Policy2::getPolicyHolderId));
        System.out.println(q2);

        Map<String, Double> q3 = q1a.entrySet().stream()
                .filter(entry -> q1.contains(entry.getKey()))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        entry -> entry.getValue().stream().mapToDouble(Transaction2::getAmount).sum()
                ));
        System.out.println(q3);
        List<Policy2> q4 = policies.stream()
                .filter(policy -> q3.getOrDefault(policy.getPolicyId(), 0.0) > 50000)
                .collect(Collectors.toList());
        System.out.println(q4);

    }
}
