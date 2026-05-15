import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class SumOfDigitRecursion {
  public static void main(String[] args) {
//    System.out.println("Sum of number: "+876+", value: "+sumOfDigit(876));
//
//    Queue<Integer> queue = new LinkedList<>();
//    queue.add(6);
//    queue.add(5);
//    System.out.println(queue);
//    queue.offer(7);
//    System.out.println(queue.remove());
  }

  public static int sumOfDigit(int number) {
    if(number/10 == 0) {
      return number%10;
    }

    return (number%10)+sumOfDigit(number/10);
  }
}
