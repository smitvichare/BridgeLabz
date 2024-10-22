package setCollections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionSets {

	public static void main(String[] args) {
		
		List<Set<Integer>> ls = new ArrayList<>();
        ls.add(new HashSet<>(Arrays.asList(1, 2, 3,4)));
        ls.add(new HashSet<>(Arrays.asList(2, 3, 4)));
        ls.add(new HashSet<>(Arrays.asList(3, 4, 5)));
        Set<Integer> res = new HashSet<>();
        for(int i=0;i<ls.size();i++)
        {
        	for(int s:ls.get(i))
        	{
        		if(ls.get(0).contains(s) && ls.get(1).contains(s) && ls.get(2).contains(s))
        		{
        			res.add(s);
        		}
        	}
        }
		System.out.println(res);
		
		
		
		
		
		
		
		
		
	}

}
