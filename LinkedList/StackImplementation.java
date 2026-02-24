import java.util.Scanner;
import java.util.Stack;

public class StackImplementation<T> {

  private static class StackNode<T> {
    T data;
    StackNode<T> next;

    StackNode(T data) {
      this.data = data;
      this.next = null;
    }
  }

  private StackNode<T> head = null;

  public void push(T value) {
    StackNode<T> stackNode = new StackNode<>(value);
    if (head != null) {
      StackNode<T> tempNode = head;
      stackNode.next = tempNode;
    }
    head = stackNode;
  }

  public void pop() {
    StackNode<T> tempNode = head;
    head = tempNode.next;
  }

  public void printStack() {
    if (head == null) {
      System.out.println("Stack is empty");
      return;
    }
    StackNode<T> tempNode = head;
    while (tempNode.next != null) {
      System.out.print(tempNode.data + "->");
      tempNode = tempNode.next;
    }
    System.out.println(tempNode.data);
  }

  public static void main(String[] args) {
    Stack<Integer> st = new Stack<>();
    Scanner sc = new Scanner(System.in);
    StackImplementation<Integer> stackImpl = new StackImplementation<>();
    System.out.println("What operation you want to perform stack");

    while (true) {
      System.out.println("press 0: for terminate");
      System.out.println("press 1: push element");
      System.out.println("press 2: pop element");
      System.out.println("press 3: print elements");
      int i = sc.nextInt();
      switch (i) {
        case 1 -> {
          System.out.println("Please provide element");
          int element = sc.nextInt();
          stackImpl.push(element);
        }
        case 2 -> stackImpl.pop();
        case 3 -> stackImpl.printStack();
        case 0 -> System.exit(1);
      }
    }
  }

}


