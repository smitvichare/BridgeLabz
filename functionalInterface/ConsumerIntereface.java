package functionalInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerIntereface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> str=new ArrayList<>();
		str.add("dfghjgf");
		str.add("afdgfgvhg");
		str.add("asxdcnbnv");
		str.add("asdd");
		str.add("qwertyuiop");
		
		 Consumer<String> res=s->System.out.println(s.toUpperCase());
		 str.forEach(res);
	}

}
