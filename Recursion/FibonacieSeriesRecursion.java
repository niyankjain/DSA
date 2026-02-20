import java.util.LinkedList;
import java.util.List;

public class FibonacieSeriesRecursion {

  public static void main(String[] args) {
    List<Integer> list = new LinkedList<>();
    list.add(0);
    list.add(1);
    fibonacie(8, 0, 1, list);
    list.stream().forEach(number -> System.out.print(number+", "));
  }

  public static void fibonacie(int count, int prev, int next, List<Integer> list ) {
    if (count == 0) {
      return ;
    }
    int number = prev+next;
    list.add(number);
    fibonacie(count-1, next, number, list);
  }
}
