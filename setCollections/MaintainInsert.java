package setCollections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class MaintainInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = Arrays.asList("Apple","Banana","Apple","Orange","Kiwi");

        Set<String> hashSet = new LinkedHashSet<>(list);
        System.out.println("HashSet: " + hashSet);

	}

}
