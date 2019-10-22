package com.optum;

public class Queue {
	int front,rear,size,capacity;
	int[] arr;
	
	public Queue(int capacity){
		arr = new int[capacity];
		this.size = 0;
		int front = 0;
		this.capacity = capacity;
		int rear = capacity-1;
		
	}
	
	public boolean isFull(){
		if(size == capacity)
			return true;
		return false;
	}
	
	public boolean isEmpty(){
		if(size == 0)
			return true;
		return false;
	}
	
	public void enqueue(int data){
		if(!isFull()){
			rear = (rear+1)%capacity;
			arr[rear] = data;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
