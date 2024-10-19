package linkedList;


public class NthLastLL {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		NthLastLL l=new NthLastLL();
		l.addNodes(10);
		l.addNodes(40);
		l.addNodes(678);
		l.addNodes(10);
		l.addNodes(697);
		l.addNodes(40);
		l.addNodes(35);
		l.display();
		l.pos(4);
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
	public void pos(int n)
	{
		int count=1;
		Node temp=head;
		while(temp.next!=null)
		{
			count++;
			temp=temp.next;
		}
		int f=count-n;
		temp=head;
		for(int i=0;i<f;i++)
		{
			temp=temp.next;
		}
		System.out.println(temp.data);
	}

}
