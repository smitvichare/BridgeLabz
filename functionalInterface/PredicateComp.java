package functionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateComp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> str=new ArrayList<>();
		str.add("dfghjgf");
		str.add("afdgfgvhg");
		str.add("asxdcnbnv");
		str.add("asdd");
		str.add("qwertyuiop");
		Predicate<String> c1=s->s.length()>5;
		Predicate<String> c2=s->s.contains("a");
		
		List<String> res=str.stream().filter(c1.and(c2)).collect(Collectors.toList());
		System.out.println(res);

	}

}
