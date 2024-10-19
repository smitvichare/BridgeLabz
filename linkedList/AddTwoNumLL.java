package linkedList;



public class AddTwoNumLL {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		AddTwoNumLL l1=new AddTwoNumLL();
		AddTwoNumLL l2=new AddTwoNumLL();
				l1.addNodes(1);
				l1.addNodes(4);
				l1.addNodes(6);
				l2.addNodes(2);
				l2.addNodes(9);
				l2.addNodes(5);
				l1.display();
				l2.display();
				Node c=l1.head;
				Node d=l2.head;
				int n1=0,n2=0;
				while(c!=null)
				{
					n1=(n1*10)+c.data;
					c=c.next;
				}
				while(d!=null)
				{
					n2=(n2*10)+d.data;
					d=d.next;
				}
				System.out.println("Addition of both numbers: "+(n1+n2));
				
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
	

}

