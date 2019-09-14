package LinkedList;

public class SinglyLinkedList {
	public static void main(String[] args) {
		SinglyLinkedList impl = new SinglyLinkedList();
		
		// Insertion in List
		impl.insertAtFirst(2);
		impl.insertAtEnd(3);
		impl.insertAtPosition(4, 1);
		impl.insertAtFirst(5);
		impl.insertAtFirst(6);
		impl.insertAtFirst(7);
		impl.insertAtEnd(8);
		impl.insertAtFirst(9);
		impl.insertAtPosition(10, 3);
		
		impl.print();
		
		// Deletion in List
		impl.deleteAtEnd();
		impl.deleteAtFirst();
		impl.deleteAtPosition(2);
		impl.deleteAtEnd();
		
		impl.print();
	}
	
	class LinkedList {
		int data;
		LinkedList next;
		
		public LinkedList(int data) {
			this.data = data;
			next = null;
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
	
	/*
	 * DELETION
	 */
	void deleteAtFirst() {
		if (head == null)
			return;
		head = head.next;
	}
	
	void deleteAtEnd() {
		if (head == null) 
			return;
		
		if (head.next == null) {
			head = null;
			return;
		}
		
		LinkedList p = head;
		LinkedList q = head;
		while (p.next != null) {
			q = p;
			p = p.next;
		}
		q.next = null;
	}
	
	void deleteAtPosition(int position) {
		if (head == null)
			return;
		
		if (position == 1) {
			head = head.next;
			return;
		}
		
		LinkedList p = head;
		LinkedList q = head;
		for (int i=1; i<position && p.next!=null; i++) {
			q = p;
			p = p.next;
		}
		q.next = p.next;
	}
	
	/*
	 * PRINT
	 */
	void print() {
		System.out.print("Linked List: ");
		LinkedList tmp = head;
		while (tmp != null) {
			System.out.print(tmp.data + " ");
			tmp = tmp.next;
		}
		System.out.println();
	}
}
