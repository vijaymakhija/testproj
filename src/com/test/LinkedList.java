package com.optum;

public class LinkedList {
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
		}
	}
	
	public void printLst(){
		Node n = head;
		while(n!=null){
			System.out.println(n.data);
			n = n.next;
		}
	}
	
	public void insertFirst(int d){
		int headData = head.data;
		Node headNext = head.next;
		Node newNode = new Node(headData);
		newNode.next = headNext;
		head.next = newNode;
		head.data = d;
	}
	
	public void insertAfter(Node prevNode, int d){
		Node newNode = new Node(d);
		Node nextToPrevNode = prevNode.next;
		prevNode.next = newNode;
		newNode.next = nextToPrevNode;
	}
	
	public void insertLast(int d){
		Node newNode = new Node(d);
		Node n = head;
		while(n != null){
			if(n.next == null){
				n.next = newNode;
				break;
			}
			n = n.next;
		}
	}
	
/*	public static void main(String a[]){
		LinkedList lst = new LinkedList();
		lst.head = new Node(1);
		Node sec = new Node(2);
		Node third = new Node(3);
		lst.head.next = sec;
		sec.next = third;
		//lst.printLst();
		lst.insertFirst(0);
		//lst.printLst();
		lst.insertAfter(sec, 5);
		lst.insertLast(6);
		lst.printLst();
	}*/
}
