public class CarFactory {
  public static Car createObj(String className) {
    if(className.equals("BMW")) {
      return new BMW();
    }else {
      return new Honda();
    }
  }
}

class FactoryMain {
  public static void main(String[] args) {
    Car car = CarFactory.createObj("Honda");
    car.drive();
  }
}

interface Car {
  public void drive();
}

class BMW implements Car {

  @Override
  public void drive() {
    System.out.println("BMW instance created");
  }
}

class Honda implements Car {

  @Override
  public void drive() {
    System.out.println("Honda instance created");
  }
}

