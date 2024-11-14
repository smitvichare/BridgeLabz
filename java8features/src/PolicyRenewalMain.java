import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PolicyRenewalMain {


    public static void main(String[] args) {
        // Sample data
        LocalDate today = LocalDate.now();
        LocalDate cutoffDate = today.plusDays(30);

        List<Policy> policies = List.of(
                new Policy("P001", "H001", LocalDate.now().plusDays(10), 1000, "Active"),
                new Policy("P002", "H002", LocalDate.now().plusDays(25), 1200, "Active"),
                new Policy("P003", "H001", LocalDate.now().plusDays(5), 900, "Active"),
                new Policy("P004", "H003", LocalDate.now().plusDays(15), 1500, "Expired")
        );

        List<Policy> q1=policies.stream().filter(e->e.getStatus().equals("Active") && !e.getExpiryDate().isAfter(cutoffDate)).collect(Collectors.toUnmodifiableList());
        System.out.println(q1);
        List<RenewalReminder> q2=policies.stream().map(p->new RenewalReminder(p.getPolicyId(),p.getPolicyHolderId(), ChronoUnit.DAYS.between(today,p.getExpiryDate()))).collect(Collectors.toUnmodifiableList());
        System.out.println(q2);
        List<RenewalReminder> q3=q2.stream().sorted((a, b) -> Long.compare(a.remainingDaysUntilExpiry, b.remainingDaysUntilExpiry)).collect(Collectors.toUnmodifiableList());
        System.out.println(q3);
        Map<String,List<RenewalReminder>> q4=q3.stream().collect(Collectors.groupingBy(a->a.getPolicyHolderId()));
        System.out.println(q4);


    }
}

