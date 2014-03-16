package edu.java.chap2;

/*
 * write code to partition a linked list arond a value x, such that all nodes less than x come
 * before all nodes greater than or eauql to x.
 */
public class PartList {

	
	
	public static Node part(Node node, int x){
		Node head = node;
		
		//find out the first node data is smaller than x, if there is no such node, return
		while(node.data>x){
			if(node.next == null){
				System.out.println("the");
				return node;
			}
			else{
				node = node.next;
			}
		}
		
		//n is first node data smaller than x
		Node n = node;
		node = node.deleteNode(node, node.data);
		//go through 
		while(node.next!=null){
			node = node.next;
			
			if(n.data<x){
				n.appendToTail(node.next.data);
				head = head.deleteNode(head, node.next.data);
			}
			node = node.next;
		}
		Node result = n;
		while(n.next !=null){
			n = n.next;
		}
		n.next = head;
		return result;
	}
	
	public static void print(Node node){
		while(node.next != null){
			System.out.print(node.data+ " ");
			node = node.next;
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Node node = new Node(0);
		node.appendToTail(4);
		node.appendToTail(6);
		node.appendToTail(3);
		node.appendToTail(1);
		node.appendToTail(9);
		node.appendToTail(4);
		
		
		print(node);
		Node result = part(node,5);
		//print(result);
		System.out.print(node.data);
		System.out.print(node.next.data);
		System.out.print(node.next.next.data);
	}

}
