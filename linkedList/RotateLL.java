package linkedList;



public class RotateLL {
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		RotateLL l=new RotateLL();
		l.addNodes(10);
		l.addNodes(40);
		l.addNodes(678);
		l.addNodes(19);
		l.addNodes(697);
		l.addNodes(54);
		l.addNodes(35);
		l.display(l.head);
		l.rotate(3,l.head);
		

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
	public void display(Node head)
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
	public void rotate(int k,Node head) 
	{
		if (head == null || head.next == null || k == 0) {
            System.out.println("No rotation needed.");
            return;
        }
		Node temp = head;
        int len = 1;
        while (temp.next != null) 
        {
            temp = temp.next;
            len++;
        }
        temp.next = head;
        Node temp2=head;
        for(int i=1;i<k;i++)
        {
        	temp2=temp2.next;
        }
        head=temp2.next;
        temp2.next=null;
        display(head);

	}

}
