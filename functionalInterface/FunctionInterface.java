package functionalInterface;

import java.util.function.Function;

public class FunctionInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=3;
		Function<Integer,Double> res=i->i*i*3.14;
		System.out.println(res.apply(a));
	}

}
