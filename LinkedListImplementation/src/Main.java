
public class Main {

	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		
		ll.insert(9);
		ll.insert(8);
		ll.insert(14);
		ll.insertAt(2, 2);
		ll.insertAtStart(7);
		ll.delete(0);
		ll.insertAtStart(25);
		ll.delete(2);
		
		ll.print();
		
	}

}
