import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.stream.Collectors;

public class CustomerValueMain {

    public static void main(String[] args) {

        List<CustomerTransaction> transactions = Arrays.asList(
                new CustomerTransaction("C001", LocalDate.now().minusMonths(3), 1200),
                new CustomerTransaction("C001", LocalDate.now().minusMonths(6), 800),
                new CustomerTransaction("C002", LocalDate.now().minusMonths(1), 2000),
                new CustomerTransaction("C002", LocalDate.now().minusMonths(8), 1500),
                new CustomerTransaction("C003", LocalDate.now().minusMonths(9), 750),
                new CustomerTransaction("C004", LocalDate.now().minusMonths(11), 1000),
                new CustomerTransaction("C005", LocalDate.now().minusMonths(2), 3000),
                new CustomerTransaction("C006", LocalDate.now().minusMonths(4), 2500),
                new CustomerTransaction("C006", LocalDate.now().minusMonths(10), 1000),
                new CustomerTransaction("C007", LocalDate.now().minusMonths(1), 4500),
                new CustomerTransaction("C007", LocalDate.now().minusMonths(3), 200),
                new CustomerTransaction("C008", LocalDate.now().minusMonths(2), 3200),
                new CustomerTransaction("C008", LocalDate.now().minusMonths(6), 1800),
                new CustomerTransaction("C009", LocalDate.now().minusMonths(5), 2750),
                new CustomerTransaction("C009", LocalDate.now().minusMonths(7), 1250),
                new CustomerTransaction("C010", LocalDate.now().minusMonths(8), 900),
                new CustomerTransaction("C010", LocalDate.now().minusMonths(9), 1100),
                new CustomerTransaction("C011", LocalDate.now().minusMonths(11), 6000),
                new CustomerTransaction("C011", LocalDate.now().minusMonths(10), 1000)
        );
        LocalDate oneYearAgo = LocalDate.now().minus(1, ChronoUnit.YEARS);
        List<CustomerTransaction> q1=transactions.stream().filter(a->a.getTransactionDate().isAfter(oneYearAgo)).collect(Collectors.toUnmodifiableList());
        System.out.println(q1);
        Map<String, Double> totalAmounts = transactions.stream()
                .collect(Collectors.groupingBy(
                        CustomerTransaction::getCustomerId,
                        Collectors.summingDouble(CustomerTransaction::getTransactionAmount)
                ));

        Map<String, Double> averageAmounts = transactions.stream()
                .collect(Collectors.groupingBy(
                        CustomerTransaction::getCustomerId,
                        Collectors.averagingDouble(CustomerTransaction::getTransactionAmount)
                ));
        System.out.println("Total Transaction Amount per Customer:");
        totalAmounts.forEach((customerId, total) ->
                System.out.println("Customer ID: " + customerId + ", Total: $" + total)
        );

        System.out.println("\nAverage Transaction Amount per Customer:");
        averageAmounts.forEach((customerId, average) ->
                System.out.println("Customer ID: " + customerId + ", Average: $" + average)
        );
        List<Map.Entry<String, Double>> q3 = totalAmounts.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
                .collect(Collectors.toList());

        System.out.println(q3);
        List<Map.Entry<String, Double>> q4=q3.stream().limit(8).collect(Collectors.toUnmodifiableList());
        System.out.println(q4);


    }
}
