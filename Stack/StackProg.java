import java.util.Scanner;

public class StackProg {

	public static Node head;

	class Node {
		int data ; 
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	private void addElement(int data) {
		Node node = new Node(data);
		if(head == null) {
			head = node;
		} else {
			node.next = head;
			head = node;
		}
	}

	private void removeElement() {
		if(head == null) {
			System.out.println("Stack already empty");
		} else {
			System.out.println("Removed Element: "+ head.data);
			head = head.next;
		}
	}

	private void printStack() {
		if(head == null) {
			System.out.println("Stack is already empty");
		} else {
			Node top =head ;
			while(top != null){
				System.out.print(top.data+ " ");
				top = top.next;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		StackProg st = new StackProg();
		
		while(true) {

			System.out.println("1: Add element");
			System.out.println("2: Remove element");
			System.out.println("3: Print element");
			System.out.print("Please select operation: ");
			
			Scanner sc = new Scanner(System.in);
			int operation = sc.nextInt();

			switch(operation) {
				case 1: 
					System.out.print("Please select element for addition: ");
					st.addElement(sc.nextInt());
					break; 
				
				case 2:
					st.removeElement();
					break; 
				
				case 3: 
					st.printStack();
					break; 
				
				default: 
					System.exit(0);
				
			}	
		}
	}
}