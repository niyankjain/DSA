class Main2 {
  public static void main(String[] args) {
    VehicleFactory vehicleFactory;
    String company = "Honda";
    if(company.equals("Honda")) {
      vehicleFactory = new HondaCompany();
    } else {
      vehicleFactory = new BMWCompany();
    }

    ClientCode clientCode = new ClientCode(vehicleFactory);
    clientCode.enjoy();
  }
}

class ClientCode {
  private final Car car;
  private final Bike bike;

  public ClientCode(VehicleFactory factory) {
    car = factory.createCar();
    bike = factory.createBike();
  }

  public void enjoy() {
    car.drive();
    bike.ride();
  }
}

public interface VehicleFactory{
  Car createCar();
  Bike createBike();
}

class BMWCompany implements VehicleFactory {

  @Override
  public Car createCar() {
    return new BMW();
  }

  @Override
  public Bike createBike() {
    return new BMWBike();
  }
}

class HondaCompany implements VehicleFactory {

  @Override
  public Car createCar() {
    return new Honda();
  }

  @Override
  public Bike createBike() {
    return new HondaBike();
  }
}

interface Bike {
  public void ride();
}

class BMWBike implements Bike {

  @Override
  public void ride() {
    System.out.println("BMW bike Instance");
  }
}

class HondaBike implements Bike {

  @Override
  public void ride() {
    System.out.println("Honda bike Instance");
  }
}