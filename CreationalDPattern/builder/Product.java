package builder;

import java.time.LocalDate;

public class Product {

  private String itemName;

  private String price;

  private String quantity;

  private String category;

  private LocalDate expiry;


  public static class ProductBuilder {

    public void itemName(String itemName) {

    }

  }
}
