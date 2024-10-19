package linkedList;

import java.util.LinkedList;
import java.util.Scanner;

import linkedList.CycleInLL.Node;



public class SplitLL {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		SplitLL l=new SplitLL();
		l.addNodes(10);
		l.addNodes(40);
		l.addNodes(678);
		l.addNodes(10);
		l.addNodes(697);
		l.addNodes(40);
		l.addNodes(35);
		l.display(l.head);
		l.split();
		

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
	public void split() 
	{
		if(head==null || head.next==null)
		{
			System.out.println("List is too small");
			return;
		}
		Node slow=head;
		Node fast=head;
		Node p=null;
		while(fast!=null && fast.next!=null)
		{
			p=slow;
			slow=slow.next;
			fast=fast.next.next;
		}
		Node n2=slow;
		p.next=null;
		System.out.println("First Half:");
		display(head);
		System.out.println("Second Half:");
		display(n2);
		

	}
}
