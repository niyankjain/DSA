import java.util.LinkedList;
import java.util.Queue;

public class FormBinaryTree {
  static int idx = -1;
  public static void main(String[] args) {
    int[] arr = {1,2,-1,-1,3,4,-1,-1,5,-1,-1};

    Node<Integer> root = buildBinaryTree(arr);
    System.out.println("Pre order traversal: ");
    preOrderTraversal(root);
    System.out.println();
    System.out.println("In order traversal: ");
    inOrderTraversal(root);

    System.out.println();
    System.out.println("Post order traversal: ");
    postOrderTraversal(root);

    System.out.println();
    System.out.println("Level order traversal: ");
    levelOrderTraversal(root);
  }

//  root > left > right
  private static void preOrderTraversal(Node<Integer> root) {
    if(root == null) {
      return;
    }
    System.out.print(root.val+ " ");
    preOrderTraversal(root.left);
    preOrderTraversal(root.right);
  }

//  left > root > right
  private static void inOrderTraversal(Node<Integer> root) {
    if(root == null) {
      return;
    }
    inOrderTraversal(root.left);
    System.out.print(root.val+ " ");
    inOrderTraversal(root.right);
  }

  //  left > right > right
  private static void postOrderTraversal(Node<Integer> root) {
    if(root == null) {
      return;
    }
    inOrderTraversal(root.left);
    inOrderTraversal(root.right);
    System.out.print(root.val+ " ");

  }

  private static void levelOrderTraversal(Node<Integer> root) {
    Queue<Node> queue = new LinkedList<>();
    queue.add(root);
    queue.add(null);
    while (queue.size() > 0) {
      Node<Integer> node = queue.peek();
      queue.poll();

      if(node == null) {
        if(queue.isEmpty()) {
          break;
        }else {
          queue.add(null);
          System.out.println();
          continue;
        }
      }

      System.out.print(node.val+" ");
      if (node.left != null) {
        queue.add(node.left);
      }
      if (node.right != null) {
        queue.add(node.right);
      }


    }
  }

  private static Node<Integer> buildBinaryTree(int[] arr) {
    idx++;
    if(arr[idx] == -1) {
      return null;
    }
    Node<Integer> node = new Node(arr[idx]);       //1, null, null
    node.left = buildBinaryTree(arr);
    node.right = buildBinaryTree(arr);
    return node;
  }
}

class Node<T> {
  T val;
  Node<T> left;
  Node<T> right;

  public Node(T val) {
    this.val = val;
    this.left = null;
    this.right = null;
  }
}
