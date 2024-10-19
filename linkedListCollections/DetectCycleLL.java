package linkedListCollections;

import java.util.LinkedList;
import java.util.ListIterator;

public class DetectCycleLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list = new LinkedList<>();
		list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        boolean flag=false;
        ListIterator<Integer> slow=list.listIterator();
        ListIterator<Integer> fast=list.listIterator();
        if (fast.hasNext()) {
            fast.next();
        }

        
        while (slow.hasNext() && fast.hasNext()) {
            slow.next(); 

            
            if (fast.hasNext()) {
                fast.next();
            }
            if (fast.hasNext()) {
                fast.next();
            } else {
                break; 
            }

            
            if (slow.nextIndex() == fast.nextIndex()) {
                flag=true;
            }
        }
        if(flag=true)
        {
        	System.out.println("Cyclic LinkedList");
        }
        else
        {
        	System.out.println("Non Cyclic LinkedList");
        }
        

	}

}
