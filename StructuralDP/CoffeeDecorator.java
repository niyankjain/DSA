public class CoffeeDecorator {

  public static void main(String[] args) {
    Coffee coffee = new SugarCoffee(new BasicCoffee());
    System.out.println(coffee.getDescription());
    System.out.println(coffee.getPrice());
  }
}

interface Coffee {
  public String getDescription();
  public Double getPrice();
}

class BasicCoffee implements Coffee {

  @Override
  public String getDescription() {
    return "Basic Coffee";
  }

  @Override
  public Double getPrice() {
    return 100.0;
  }
}

abstract class Decorators implements Coffee {
  protected Coffee coffee;

  public Decorators(Coffee coffee) {
    this.coffee = coffee;
  }
}

class MilkCoffee extends Decorators {

  public MilkCoffee(Coffee coffee) {
    super(coffee);
  }

  @Override
  public String getDescription() {
    return coffee.getDescription() +" Milk";
  }

  @Override
  public Double getPrice() {
    return coffee.getPrice() + 20.0;
  }
}

class SugarCoffee extends Decorators {

  public SugarCoffee(Coffee coffee) {
    super(coffee);
  }

  @Override
  public String getDescription() {
    return coffee.getDescription()+" Sugar";
  }

  @Override
  public Double getPrice() {
    return coffee.getPrice() + 10.0;
  }
}