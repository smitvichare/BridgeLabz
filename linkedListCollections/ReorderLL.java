package linkedListCollections;



public class ReorderLL  
{

	
		static class Node
		{
			int data;
			Node next;
			Node(int data)
			{
				this.data=data;
				this.next=null;
			}
		}
		private Node head;
		
		public void addNodes(int data)
		{
			Node newNode=new Node(data);
			if(head==null)
			{
				head=newNode;
			}
			else
			{
				Node temp=head;
				while(temp.next!=null)
				{
					temp=temp.next;
				}
				temp.next=newNode;
			}
			System.out.println("Node created with data:"+data);
		}
		public static void display(Node head)
		{
			if(head==null)
			{
				System.out.println("Linked list is empty.");
			}
			else
			{

				Node temp=head;
				System.out.println("Linked List:");
				while(temp!=null)
				{
					System.out.print(temp.data+" -> ");
					temp=temp.next;
				}
				System.out.println("null");
			}
		}
		private static void merge(Node first, Node second) 
		{
	        while (first != null && second != null) {
	            Node temp1 = first.next;
	            Node temp2 = second.next;

	            first.next = second;
	            if (temp1 == null) break; 
	            second.next = temp1;

	            first = temp1;
	            second = temp2;
	        }
	    }
		private static Node reverse(Node head) {
	        Node prev = null;
	        Node current = head;
	        while (current != null) {
	            Node next = current.next;
	            current.next = prev;
	            prev = current;
	            current = next;
	        }
	        return prev;
	    }
		public static void reorderList(Node head) {
	        	        
	        Node slow = head;
	        Node fast = head;
	        while (fast != null && fast.next != null) {
	            slow = slow.next;
	            fast = fast.next.next;
	        }

	        
	        Node secondHalf = reverse(slow.next);
	        slow.next = null; 

	        
	        Node firstHalf = head;
	        merge(firstHalf, secondHalf);
	    }
		public static void main(String[] args) {
	        
	        Node head = new Node(1);
	        head.next = new Node(2);
	        head.next.next = new Node(3);
	        head.next.next.next = new Node(4);
	        head.next.next.next.next = new Node(5);

	        System.out.println("Original Linked List:");
	        display(head);

	        // Reorder the list
	        reorderList(head);

	        System.out.println("Reordered Linked List:");
	        display(head);
	    }

	

}
