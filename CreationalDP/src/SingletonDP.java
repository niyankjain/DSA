import java.io.ObjectStreamException;
import java.io.Serializable;

public final class SingletonDP implements Cloneable, Serializable {

  private static volatile SingletonDP INSTANCE = null;

  // 1. Class should be have private constructor.
  private SingletonDP() {
    if(INSTANCE != null) {
      throw new RuntimeException("Use getInstance()");
    }
  }

  public static SingletonDP getInstance() {
    Object resource = new Object();
    if(INSTANCE == null) {
      synchronized (resource) {
        if(INSTANCE == null) {
          INSTANCE = new SingletonDP();
        }
      }
    }
    return INSTANCE;
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    throw new CloneNotSupportedException("Clone not supported for Singleton class");
  }

  // Prevent Serialization breaking
  protected Object readResolve() throws ObjectStreamException {
    return getInstance();
  }
}
