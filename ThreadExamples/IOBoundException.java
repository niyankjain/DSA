import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class IOBoundException {

  private final static int NUMBER_OF_THREAD = 10_000;
  public static void main(String[] args) {

    System.out.printf("Running %d tasks \n", NUMBER_OF_THREAD);
    long start = System.currentTimeMillis();
    performTask();
    System.out.printf("Tasks took %dms to complete: ", (System.currentTimeMillis()-start));

  }

  private static void performTask() {
    try(ExecutorService executorService = Executors.newVirtualThreadPerTaskExecutor()) {
      for(int i=0; i<NUMBER_OF_THREAD ; i++) {
        executorService.submit(() -> blockingOperation());
      }
    }
  }

  private static void blockingOperation() {
    System.out.println("Executing a blocking task from thread: "+Thread.currentThread());
    try{
      Thread.sleep(500);
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
  }


}
