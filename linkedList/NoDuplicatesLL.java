package linkedList;




public class NoDuplicatesLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		NoDuplicatesLL l=new NoDuplicatesLL();
				l.addNodes(10);
				l.addNodes(40);
				l.addNodes(678);
				l.addNodes(10);
				l.addNodes(697);
				l.addNodes(40);
				l.addNodes(35);
				l.display();
				l.remdup();
				l.display();
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
	public void remdup() 
	{
		if(head==null || head.next==null)
		{
			return;
		}
		Node c=head;
		while(c.next!=null && c!=null)
		{
			Node t=c;
			while(t.next!=null)
			{
				if(t.next.data==c.data)
				{
					t.next=t.next.next;
				}
				else
				{
					t=t.next;
				}
			}
			c=c.next;
		}

	}

}
