package LinkedList;

public class DoublyLinkedList {
	public static void main(String[] args) {
		
	}
	
	class LinkedList {
		int data;
		LinkedList prev;
		LinkedList next;
		
		public LinkedList(int data) {
			this.data = data;
		}
	}
	
	LinkedList head;
	
	/*
	 * INSERTION
	 */
	void insertAtFirst(int data) {
		LinkedList newNode = new LinkedList(data);
		
		newNode.next = head;
		head = newNode;
	}
	
	void insertAtEnd(int data) {
		LinkedList newNode = new LinkedList(data);
		
		if (head == null) {
			head = newNode;
			return;
		}
		
		LinkedList tmp = head;
		while(tmp.next != null) {
			tmp = tmp.next;
		}
		tmp.next = newNode;
	}
	
	void insertAtPosition(int data, int position) {
		LinkedList newNode = new LinkedList(data);
		
		// Empty List 
		if (head == null) {
			head = newNode;
			return;
		}
		
		// Insert at starting
		if (position == 1) {
			newNode.next = head;
			head = newNode;
			return;
		}
		
		// Traverse and insert
		// position is greater than the number of elements then insert at the end
		LinkedList p = head;
		LinkedList q = head;
		for (int i=1; i<position & p!=null; i++) {
			q = p;
			p = p.next;
		}
		newNode.next = p;
		q.next = newNode;
	}
}