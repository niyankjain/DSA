import java.io.Serializable;

public class Singleton implements Serializable, Cloneable {

  private Singleton() {
    if(INSTANCE != null) {
      throw new RuntimeException("Duplicate object is not possible");
    }
  }

  private static volatile Singleton INSTANCE=null;

  public static Singleton getInstance() {
    if(INSTANCE == null) {
      synchronized (Singleton.class) {
        if(INSTANCE == null) {
          INSTANCE = new Singleton();
        }
      }
    }
    return INSTANCE;
  }

  protected Object readResolve() {
    return INSTANCE;
  }

  protected Object clone() throws CloneNotSupportedException {
    throw new CloneNotSupportedException();
  }
}

class Main1 {
  public static void main(String[] args) {

    //Singleton instance creation
//    Singleton instance = Singleton.getInstance();
//    System.out.println("Instance: "+instance);
//
//    Singleton instance1 = Singleton.getInstance();
//    System.out.println("Instance: "+instance1);

    // instance created via builder DP.
    Profile build = new Profile.ProfileBuilder()
        .name("Niyank")
        .gender("Male")
        .address("Pune")
        .rollno(12)
        .build();



  }
}

// private constructor
//