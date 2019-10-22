package com.optum;

public class DoublyLinkedList {
	Node head;
	
	static class Node{
		Node next;
		int data;
		Node prev;
		Node(int data){
			this.data = data;
		}
	}
	
	public void insertFirst(int data){
		Node n = new Node(head.data);
		n.next = head.next;
		n.prev = head;
		head.data = data;
		head.next = n;
	}
	
	public void insertLast(int data){
		Node last = new Node(data);
		if(head == null)
			head = last;
		else{
			Node n = head.next;
			while(n != null){
				n = n.next;
			}
		}
		
	}
	
	public void insertAfter(Node n, int data){
		Node nextNode = new Node(data);
		nextNode.next = n.next;
		nextNode.prev = n;
		n.next = nextNode;
	}
	
	public void insertBefore(Node n, int data){
		Node prevNode = new Node(data);
		prevNode.next = n;
		prevNode.prev = n.prev;
		n.prev = prevNode;
	}
	
	public void printLst(){
		Node n = head;
		do{
			System.out.println(n.data);
			n = n.next;
		}while(n != null);
	}
	
	/*public static void main(String[] args) {
		DoublyLinkedList dll = new DoublyLinkedList();
		Node thr = new Node(3);
		Node sec = new Node(2);
		dll.head = new Node(1);
		dll.head.next = sec;
		sec.next = thr;
		sec.prev = dll.head;
		dll.insertFirst(0);
		dll.printLst();

	}*/

}
