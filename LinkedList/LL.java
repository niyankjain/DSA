public class LL {

	public Node head;
	public Node tail;
	public int size = 0;

	class Node {
		int data;
		Node next;

		public Node (int data) {
			this.data = data;
			this.next = null;
		}
	}

	public void addFirst(int data) {

		Node node = new Node(data);
		if(head == null) {
			head = node;
			tail = node;
			size++;
			return ;
		}

		node.next = head;
		size++;
		head = node ;
	}

	public void addLast(int data) {

		Node node = new Node(data);
		if(head == null) {
			head = node;
			tail = node;
			size ++;
			return ;
		}

		Node currentNode = head;  
		while (currentNode.next != null) {
			currentNode = currentNode.next;
		}

		currentNode.next = node;
		size++;
		tail = node;
	}

	public void addNodeAtParticularPosition(int position, int data) {
		if(head == null) {
			head = new Node(data);
			tail = head ; 
			size++;
		} else {
			node currentNode = head ;			// x0
			int len = 1;						// len = 1
			while(currentNode.next != null) { 	// true, true
				len++;							// len = 2, 3, 4
				if(len >= position) {			// false, false, 
					break;						// Skip, skip
				}	
				currentNode = currentNode.next; //x1, x2
			}

			Node temp = currentNode.next ;
			currentNode.next = node;
			node.next = temp;
		}
	}

	public void deleteFromStart() {
		if(head == null) {
			System.out.println("Linked List is already empty");
		}

		head = head.next;
		size--;
	}

	public void deleteFromEnd() {
		if(head == null) {
			System.out.println("Linked List is already empty");
		}

		if(head.next ==null) {
			head = null;
			tail = null;
			size--;
		}

		currentNode = head ;
		while(currentNode.next != tail) {
			currentNode = currentNode.next;
		}

		tail = currentNode;
		tail.next =null;
		size--;
	}

	public void ShowData() {
		if(head == null) {
			System.out.print("No data available in Linked List");
			return ;
		}

		Node currentNode = head ;
		while (currentNode != null) { 
			System.out.print(currentNode.data +"->" );
			currentNode = currentNode.next;
		}
	}

	public static void main(String[] args){
		LL linkedList1 = new LL();
		linkedList1.ShowData();
		System.out.println("Size: "+linkedList1.size+", head: "+(linkedList1.size>0?linkedList1.head.data:null)+", tail: "+(linkedList1.size>0?linkedList1.tail.data:null));
		
		linkedList1.addFirst(2);
		linkedList1.ShowData();
		System.out.println("Size: "+linkedList1.size+", head: "+linkedList1.head.data+", tail: "+linkedList1.tail.data);
		
		linkedList1.addFirst(1);
		linkedList1.ShowData();
		System.out.println("Size: "+linkedList1.size+", head: "+linkedList1.head.data+", tail: "+linkedList1.tail.data);
		
		linkedList1.addLast(3);
		linkedList1.ShowData();
		System.out.println("Size: "+linkedList1.size+", head: "+linkedList1.head.data+", tail: "+linkedList1.tail.data);
		
		linkedList1.addLast(4);
		linkedList1.ShowData();
		System.out.println("Size: "+linkedList1.size+", head: "+linkedList1.head.data+", tail: "+linkedList1.tail.data);
		
		linkedList1.addLast(5);
		linkedList1.ShowData();
		System.out.println("Size: "+linkedList1.size+", head: "+linkedList1.head.data+", tail: "+linkedList1.tail.data);
		
		linkedList1.addFirst(0);
		linkedList1.ShowData(); 
		System.out.println("Size: "+linkedList1.size+", head: "+linkedList1.head.data+", tail: "+linkedList1.tail.data);
	}	
}