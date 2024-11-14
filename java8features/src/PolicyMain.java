

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.*;
import java.util.stream.Collectors;

public class PolicyMain {

    public static void main(String[] args) {

        List<PolicyHolder> policyHolders = Arrays.asList(
                new PolicyHolder("H1", "Alice", 65, "Life", 40),
                new PolicyHolder("H2", "Bob", 70, "Life", 60),
                new PolicyHolder("H3", "Carol", 85, "Health", 30),
                new PolicyHolder("H4", "Dave", 62, "Life", 50)
        );

        List<PolicyHolder> q1 = policyHolders.stream().filter(e -> e.getPolicyType().equals("Life") && e.getAge() > 60).collect(Collectors.toUnmodifiableList());
        System.out.println(q1);
        List<RiskAssessment> q2=policyHolders.stream().map(p -> new RiskAssessment(p.getHolderId(), p.getName(), p.getPremiumAmount() / p.getAge())).collect(Collectors.toUnmodifiableList());
        System.out.println(q2);
        List<RiskAssessment> q3=q2.stream().sorted((a,b)->Double.compare(b.riskScore,a.riskScore)).collect(Collectors.toUnmodifiableList());
        System.out.println(q3);
        Map <String,List<RiskAssessment>> q4=q2.stream().collect(Collectors.groupingBy(a->a.getRiskScore()>0.5?"High Risk":"LowRisk"));
        System.out.println(q4);
    }

}
