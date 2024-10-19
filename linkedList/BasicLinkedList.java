package linkedList;

public class BasicLinkedList {

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
	
	public void addNode(int data)
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
	public void deleteNode()
	{
		if(head==null)
		{
			System.out.println("Linked list is already empty.");
		}
		else
		{
			System.out.println("Deleted head node with data"+head.data);
			head=head.next;
		}
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
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicLinkedList l=new BasicLinkedList();
		l.addNode(10);
		l.addNode(40);
		l.addNode(678);
		l.addNode(345);
		l.addNode(697);
		l.addNode(47729);
		l.addNode(35);
		l.display();
		l.deleteNode();
		l.addNode(76);
		l.display();
	}

}
