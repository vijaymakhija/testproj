package com.optum;

public class BinaryTree {
	Node root;
	
	static class Node{
		int key;
		Node left, right;
		Node(int key){
			this.key = key;
		}
	}
	
	public static void main(String[] args) 
    {
		BinaryTree bt = new BinaryTree();
		bt.root = new Node(1);
		Node left = new Node(2);
		Node right = new Node(3);
		bt.root.left = left;
		bt.root.right = right;
		Node leftChld = new Node(4);
		bt.root.left.left = leftChld;
    }
}
