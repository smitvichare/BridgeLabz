package linkedListCollections;
class RandomNode {
    int data;
    RandomNode next;
    RandomNode random;

    public RandomNode(int data) {
        this.data = data;
        this.next = null;
        this.random = null;
    }
}
public class RandomPointersLL {

	
	public static RandomNode clone(RandomNode head)
	{
		 RandomNode current = head;
	        while (current != null) {
	            RandomNode newNode = new RandomNode(current.data);
	            newNode.next = current.next;
	            current.next = newNode;
	            current = current.next.next;
	        }
	        current = head;
	        while (current != null) {
	            if (current.random != null) {
	                current.next.random = current.random.next;
	            }
	            current = current.next.next;
	        }
	        current = head;
	        RandomNode cloneHead = head.next;
	        RandomNode cloneCurrent = cloneHead;

	        while (current != null) {
	            current.next = current.next.next;
	            if (cloneCurrent.next != null) {
	                cloneCurrent.next = cloneCurrent.next.next;
	            }
	            current = current.next;
	            cloneCurrent = cloneCurrent.next;
	        }

	        return cloneHead;
	}
	public static void printList(RandomNode head) {
        RandomNode temp = head;
        while (temp != null) {
            System.out.print("Node: " + temp.data);
            if (temp.random != null) {
                System.out.print(", Random: " + temp.random.data);
            }
            System.out.println();
            temp = temp.next;
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RandomNode head = new RandomNode(1);
        head.next = new RandomNode(2);
        head.next.next = new RandomNode(3);
        System.out.println("Original list:");
        printList(head);
        
        head.random = head.next.next;  
        head.next.random = head;       
        head.next.next.random = head.next; 

        
        RandomNode clonedList = clone(head);
        System.out.println("\nCloned list:");
        printList(clonedList);
	}

}
