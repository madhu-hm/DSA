package dsaAssg;

class DoublyLinkedList<T> {
	Node head;
	Node tail;
	
	class Node {
		T data;
		Node next;
		Node prev;
		
		Node(T val) {
			data = val;
			next = null;
			prev = null;
		}
	}
	
	DoublyLinkedList() {
		head = null;
		tail = null;
	}
	
	 public void insertAtBeginning(T val) {
		 Node newNode = new Node(val);
		 if(head == null) {
			 head = newNode;
			 tail = newNode;
		 }
		 else {
			 head.prev = newNode;
			 newNode.next = head;
			 head = newNode;
		 }
	 }
	 
	 public void display() {
		 if(head == null) {
			 System.out.println("List is empty");
		 }
		 Node temp = head;
		 while(temp!=null) {
			 System.out.print(temp.data+ "  ");
			 temp = temp.next;
		 }
	 }
	 
	 public void displayReverse() {
		 if(head == null) {
			 System.out.println("List is empty");
		 }
		 Node temp = tail;
		 while(temp!=null) {
			 System.out.print(temp.data+"  ");
			 temp = temp.prev;
		 }
	 }
	 
	 public void insertAtPosition(int pos, T val) {
		 if(pos == 0) {
			 insertAtBeginning(val);
			 return;
		 }
		 Node newNode = new Node(val);
		 Node temp = head;
		 for(int i=1; i<pos; i++) {
			 if(temp == null) {
				 throw new IndexOutOfBoundsException("Invalid Position");
			 }
			 temp = temp.next;
		 }
		 newNode.next = temp.next;
		 newNode.prev = temp;
		 temp.next = newNode;
		 if(temp==tail) {
			 tail = newNode;
		}
		else {
			temp.next.prev = newNode;
			temp.next = newNode;
		}
	
	 }
	 
	 
	 public void deleteAtBeginning() {
		 if(head == null) {
			 throw new IndexOutOfBoundsException("deletion attempted on empty list");
		 }
		 head  = head.next;
		 if(head == null) {
			 tail = null;
		 }
		 else {
			 head.prev = null;
		 }
	 }
	 
	 public void deleteAtPosition(int pos) {
		 if(head == null) {
			 throw new IndexOutOfBoundsException("deletion attempted on empty list");
		 }
		 if(pos==0) {
			 deleteAtBeginning();
			 return;
		 }
		 Node temp = head;
		 Node prev = null;
		 for(int i=1; i<=pos; i++) {
			 if (temp.next == null) {
				 throw new IndexOutOfBoundsException("Invalid position");
		     }
			 prev = temp;
			 temp = temp.next;
		 }
		 prev.next = temp.next;
		 
		 if(temp.next==null) {
			 tail = prev;
		 }
		 else {
			 temp.next.prev = prev; 
		 }
	 }
	
}

public class DoublyLinkedListExample {

	public static void main(String[] args) {
		DoublyLinkedList<Integer> list = new DoublyLinkedList<>();
		
		list.insertAtBeginning(3);
		list.insertAtBeginning(5);
		list.insertAtBeginning(10);
		
		System.out.println("After insert at beginning");
		list.display();		
		System.out.println(); 
		System.out.println("Display reverse");
		list.displayReverse();
		System.out.println();
		System.out.println();
		
		list.insertAtPosition(3, 18);
		
		System.out.println("After insert at position");
		list.display();
		System.out.println();
		System.out.println();
		
		list.deleteAtBeginning();
		
		System.out.println("After delete at beginning");
		list.display();
		System.out.println();
		System.out.println();
		
		list.deleteAtPosition(2);
		
		System.out.println("After delete at position");
		list.display();
	}

}