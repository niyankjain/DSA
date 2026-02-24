import java.util.ArrayList;
import java.util.List;

import com.sun.tools.javac.Main;

public class VirtualThreadExample {

  private static final int NUMBER_OF_THREAD = 1000;

  public static void main(String[] args) throws InterruptedException {
    long start = System.currentTimeMillis();
    Runnable runnable = VirtualThreadExample::run;
    List<Thread> list = new ArrayList();

    for(int i = 0; i < NUMBER_OF_THREAD; ++i) {
      Thread thread = Thread.ofVirtual().unstarted(runnable);
      list.add(thread);
    }

    for(Thread th : list) {
      th.start();
    }

    for(Thread th : list) {
      th.join();
    }

    System.out.println("Total time: " + (System.currentTimeMillis() - start));
  }

  private static void run() {
    try {
      Thread.sleep(1000L);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
  }
}
