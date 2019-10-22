package com.optum;

import com.optum.LinkedList.Node;

public class CircularLinkedList {
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
		}
	}
	
	public void printLst(Node firstNode){
		if(firstNode != null){
			Node nextNode = firstNode;		
			do{
				System.out.println(nextNode.data);
				nextNode = nextNode.next;
			}while(nextNode != firstNode);
		}
	}
	
	/*public static void main(String a[]){
		CircularLinkedList cLst = new CircularLinkedList();
		cLst.head = new Node(1);
		Node sec = new Node(2);
		Node thr = new Node(3);
		cLst.head.next = sec;
		sec.next = thr;
		thr.next = cLst.head;
		
		cLst.printLst(cLst.head);
	}*/
}
