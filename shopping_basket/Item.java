package shopping_basket;
import java.util.*;

public class Item {

  String brand;
  String product;
  double price;

  public Item (String brand, String product, double price){
    this.brand = brand;
    this.product = product;
    this.price = price;
  }

  public String getBrand(){
    return this.brand;
  }

  public String getProduct(){
    return this.product;
  }

  public double getPrice(){
    return this.price;
  }


}