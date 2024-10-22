package setCollections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Subsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = Arrays.asList(4, 2, 8, 3, 7, 8, 5, 3, 2, 1, 9);
		List<Integer> list1 = Arrays.asList(4, 2, 8, 3, 7, 8, 5);
		Set<Integer> setA = new TreeSet<>(list1);
		Set<Integer> setB = new TreeSet<>(list);
		Iterator<Integer> iterator = setA.iterator();
		boolean flag=true;
		while (iterator.hasNext()) {
		    int num=iterator.next();
		    if(!setB.contains(num))
		    {
		    	flag=false;
		    }
		}
		if(flag)
		{
			System.out.println("SetA is a subset");
		}
		else
		{
			System.out.println("SetA is not a subset");
		}

	}

}
