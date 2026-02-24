import java.util.concurrent.atomic.AtomicReference;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  public static void main(String[] args) {

    String oldName="Old Value";
    String newName="New Value";
    AtomicReference<String> reference = new AtomicReference<>(oldName);
    reference.set("Unexpected");
    if(reference.compareAndSet(oldName, newName)) {
      System.out.println("New value is assigned: "+reference.get());
    } else {
      System.out.println("Old value is: "+reference.get());
    }

  }

  // Singleton Design pattern is a form of creating object once entire JVM life cycle.
  // @Component, @Service, @Repository, @Controller is an example of Singleton Object.

}