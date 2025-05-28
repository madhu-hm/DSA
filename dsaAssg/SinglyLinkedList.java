package dsaAssg;

class LinkedList<T> {
	Node head;

	class Node {
		T data;
		Node next;
		
		Node(T val) {
			data = val;
			next = null;
		}
	}
	
	LinkedList() {
		head = null;
	}
	
	public void insertAtBeginning(T val) {
		Node newNode = new Node(val);
		if(head == null) {
			head = newNode;
		}
		else {
			newNode.next	= head;
			head = newNode;
		}
	}
	
	public void display() {
		 Node temp = head;
		 while(temp!=null) {
			 System.out.print(temp.data+"  ");
			 temp = temp.next;
		 }
	}
	
	public void insertAtPosition(int pos,T val) {
		if(pos==0) {
			insertAtBeginning(val);
			return;
		}
		
		Node newNode = new Node(val);
		Node temp = head;
		
		for(int i=1; i<=pos-1; i++) {
			temp = temp.next;
			if(temp == null) throw new IndexOutOfBoundsException("Invalid position : " +pos);
		}
		newNode.next = temp.next;
		temp.next = newNode;
	}
	
	public void deleteAtPosition(int pos) {
		if(head == null) {
			throw new IndexOutOfBoundsException("Deletion attempted on empty list");
		}
		if(pos==0) {
			head = head.next;
			return;
		}
		Node temp = head;
		Node prev = null;
		
		for(int i=1; i<=pos; i++) {
			prev = temp;
			temp = temp.next;
		}
		prev.next = temp.next;
		
	}
	
//	public void deleteAtBeginning() {
//		if(head == null) {
//			throw new IndexOutOfBoundsException("Deletion attempted on empty list");
//		}
//		head = head.next;
//		
//	}
	
	public int size() {
	int count = 0;
	Node current = head;
	while (current != null) {
		  count++;
		  current = current.next;
	}
	return count;
	}
	
	public boolean contains(T val) {
		if(head==null) return false;
		Node current = head;
		while(current != null) {
			if (current.data.equals(val)) return true;
			current = current.next;
		}
		return false;
	}

}

public class SinglyLinkedList {
	public static void main(String[] args) {
		LinkedList<Integer> list  = new LinkedList<>();
		
		list.insertAtBeginning(10); 
		list.insertAtBeginning(20);
		System.out.println("After insert at beginning");
		list.display();
		
		System.out.println();
		System.out.println("After insert at position");
		list.insertAtPosition(0, 5);
		list.display();
		
		System.out.println();
		System.out.println("After delete at position");
		list.deleteAtPosition(1);
		list.display();
		
		System.out.println();
		System.out.println();
		System.out.println("Size : " +list.size());
		
		System.out.println();
		System.out.println("list contains '15' ? : " +list.contains(15));
	}
	
}

