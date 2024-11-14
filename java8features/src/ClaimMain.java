

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;

import java.util.List;

public class ClaimMain {

    public static void main(String args[]) {

        List<Claim> claims = Arrays.asList(
                new Claim("C1", "P1", 6000.0, new Date(), "Approved"),
                new Claim("C2", "P1", 3000.0, new Date(), "Denied"),
                new Claim("C3", "P2", 7000.0, new Date(), "Approved"),
                new Claim("C4", "P2", 2000.0, new Date(), "Approved"),
                new Claim("C5", "P3", 15000.0, new Date(), "Approved"),
                new Claim("C6", "P4", 8000.0, new Date(), "Approved"),
                new Claim("C7", "P5", 4000.0, new Date(), "Approved")

        );
        List<Claim> q1=claims.stream().filter(a->a.getStatus().equals("Approved") && a.claimAmount>5000.0).collect(Collectors.toUnmodifiableList());
        System.out.println(q1);
        Map<String,List<Claim>> q2=claims.stream().collect(Collectors.groupingBy(a->a.getPolicyNumber()));
        System.out.println(q2);
        Map<String, Double> q3a = claims.stream()
                .collect(Collectors.groupingBy(
                        Claim::getPolicyNumber,Collectors.summingDouble(Claim::getClaimAmount)));
        System.out.println(q3a);

    }
}
