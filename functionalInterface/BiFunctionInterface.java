package functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiFunction<String,String,String> res=(a,b)->a+" "+b;
		String s1="Hello";
		String s2="World";
		System.out.println(res.apply(s1,s2));

	}

}
