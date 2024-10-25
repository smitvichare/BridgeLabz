package functionalInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Policy {
	String pnum;
	String name;
	double premium;

	public Policy(String pnum, String name, double premium) {

		this.pnum = pnum;
		this.name = name;
		this.premium = premium;

	}

	public double getPremium() {
		return premium;

	}

	public String getPolicyNumber() {
		return pnum;
	}

	public String getHolderName() {
		return name;
	}

	public String toString() {
		return "PolicyNumber: " + pnum + ", HolderName: " + name + ", PremiumAmount: " + premium;
	}
}

public class InsuranceSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Policy> p = new ArrayList<>();
		p.add(new Policy("123", "Aghbas", 167));
		p.add(new Policy("345", "Gfghj", 1600));
		p.add(new Policy("567", "Drtfgyh", 1200));
		p.add(new Policy("890", "Afggyutf", 2100));
		p.add(new Policy("189", "Afggyutf", 1300));
		List<Policy> q1 = p.stream().filter(a -> a.getPremium() > 1200).collect(Collectors.toList());
		System.out.println("list of policies with a premium amount greater than $1,200:");
		q1.forEach(System.out::println);
		List<Policy> q2 = p.stream().sorted((a, b) -> a.getHolderName().compareTo(b.getHolderName()))
				.collect(Collectors.toList());
		System.out.println("sort the policies alphabetically by the holder's name.");
		q2.forEach(System.out::println);
		double q3 = p.stream().mapToDouble(Policy::getPremium).sum();
		System.out.println("the total premium amount of all policies. " + q3);
		p.forEach(a -> System.out.printf("Policy Number: %s, Holder: %s, Premium: %.2f%n", a.getPolicyNumber(),
				a.getHolderName(), a.getPremium()));
		List<Policy> q4 = p.stream().filter(a -> a.getPremium() > 1000 && a.getPremium() < 2000)
				.collect(Collectors.toList());
		System.out.println("premium amount is between $1,000 and $2,000.");
		q4.forEach(System.out::println);
		Optional<Policy> q5 = p.stream().max(Comparator.comparingDouble(Policy::getPremium));
		System.out.println("the policy with the highest premium amount from a list of insurance policies:");
		q5.ifPresent(a -> System.out.println(a));
		Map<Character, List<Policy>> q6 = p.stream()
				.collect(Collectors.groupingBy(policy -> policy.getHolderName().charAt(0)));
		q6.forEach((initial, policyList) -> {
			System.out.println("Initial: " + initial);
			policyList.forEach(System.out::println);
		});
		double q7 = p.stream().mapToDouble(Policy::getPremium).average().orElse(0.0);
		System.out.println("Average Premium: " + q7);
		List<Policy> q8 = p.stream().sorted((a, b) -> Double.compare(a.getPremium(), b.getPremium()))
				.collect(Collectors.toList());
		System.out.println("sort insurance policies by premium amount in ascending order and print their details");
		q8.forEach(System.out::println);
		List<Policy> q9 = p.stream().filter(a -> a.getPremium() > 2000).collect(Collectors.toList());
		System.out.println("is any policy with a premium amount greater than $2,000.");
		q9.forEach(System.out::println);
		
		 Map<String, Long> q10 = p.stream()
		            .collect(Collectors.groupingBy(a -> {
		                double premium = a.getPremium();
		                if (premium <= 1000) return "$0-$1,000";
		                else if (premium <= 2000) return "$1,001-$2,000";
		                else return ">$2,000";
		            }, Collectors.counting()));
		 q10.forEach((r,c)->
		 System.out.println("Range:"+r+"Count:"+c));
		 
		 List<String> q11 = p.stream().map(Policy::getHolderName).distinct().collect(Collectors.toList());
		 System.out.println("Unique Names:");
		 q11.forEach(System.out::println);
		 String str="A";
		 List<Policy> q12 = p.stream().filter(a -> a.getHolderName().contains(str)).collect(Collectors.toList());
		 System.out.println("Custom substring:"+str);
		 q12.forEach(System.out::println);
		 Map<String, Double> q13=p.stream()
		            .collect(Collectors.toMap(Policy::getPolicyNumber,Policy::getPremium));
		 q13.forEach((r,c)->
		 System.out.println("Policy Number:"+r+" Premium:"+c));
		 
            	
	                
		
	}

}
