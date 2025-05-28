package dsaAssg;

class CircularLinkedList<T> {
	Node last;
	
	class Node {
		T data;
		Node next;
		
		Node(T val) {
			data = val;
			next = null;
		}
	}
	
	CircularLinkedList() {
		last =  null;
	}
	
	public void insertAtBeginning(T val) {
		Node newNode = new Node(val);
		if(last == null) {
			newNode.next = newNode;
			last = newNode;
		}
		else {
			newNode.next = last.next;
			last.next = newNode;
		}
	}
	
	public void insertAtEnd(T val) {
		Node newNode = new Node(val);
		if(last == null) {
			newNode.next = newNode;
			last = newNode;
		}
		else {
			newNode.next = last.next;
			last.next = newNode;
			last = newNode;
		}
	}
	
	public void display() {
		Node temp = last.next;
		do {
			System.out.print(temp.data+ "  ");
			temp = temp.next;
		}while(temp != last.next);
	}
	
	public void deleteAtBeginning() {
		if(last == null) {
			throw new IndexOutOfBoundsException("Deletion attempted on empty list");
		}
		if(last.next == last ) {
			last = null;
		}
		else {
			last.next = last.next.next;
		}
	}
	
	public void deleteAtEnd() {
		if(last == null) {
			throw new IndexOutOfBoundsException("Deletion attempted on empty list");
		}
		if(last.next == last) {
			last = null;
		}
		else {
			Node temp = last.next;
			while(temp.next != last) {
				temp = temp.next;
			}
			temp.next = last.next;
			last = temp;
		}
	}
	
	public int size() {
		if (last == null) return 0;
		int count = 0;
		Node current = last.next;
		do {
			count++;
			current = current.next;
		} while (current != last.next);
		return count;
	}
	
	public boolean contains(T val) {
		if (last == null) return false;
		Node current = last.next;
		do {
			if (current.data.equals(val)) return true;
			current = current.next;
		} while (current != last.next);
		return false;
	}
	
	
}
public class CircularLinkedListExample{
	public static void main(String[] args) {
		CircularLinkedList<String> list = new CircularLinkedList<>();
		
		list.insertAtBeginning("Hello");
		list.insertAtBeginning("Hii");
		
		System.out.println("After insert at beginning");
		list.display();
		System.out.println();
		
		list.insertAtEnd("Welcome");
		System.out.println();
		System.out.println("After insert at end");
		list.display();
		System.out.println();
		
		list.deleteAtBeginning();
		System.out.println();
		System.out.println("After delete at beginning");
		list.display();
		System.out.println();
		System.out.println();
		
		System.out.println("Size: " +list.size());
		System.out.println("Contains ' welcome' ? : " +list.contains("Welcome"));
	}
}