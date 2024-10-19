package linkedList;



public class CycleInLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CycleInLL l=new CycleInLL();
		l.addNodes(10);
		l.addNodes(40);
		l.addNodes(678);
		l.addNodes(345);
		l.addNodes(697);
		l.addNodes(47729);
		l.addNodes(35);
		l.display();
		System.out.println("Cycle present: " + l.hasCycle());
		l.createCycle(4);
		System.out.println("Cycle present: " + l.hasCycle());
	}
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
		public void display()
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
		public void createCycle(int p) {
	        if (head == null) 
	        {
	            return;
	        }
	        
	        Node temp = head;
	        Node cycleNode = null;
	        int counter = 1;
	        while (temp.next != null) 
	        {
	            if (counter == p) 
	            {
	                cycleNode = temp;
	            }
	            temp = temp.next;
	            counter++;
	        }
	        temp.next = cycleNode;
	    }
		public boolean hasCycle()
		{
			Node slow=head;
			Node fast=head;
			while(fast!=null && fast.next!=null)
			{
				slow=slow.next;
				fast=fast.next.next;
				if(slow==fast)
				{
					return true;
				}
			}
			return false;
		}

}
