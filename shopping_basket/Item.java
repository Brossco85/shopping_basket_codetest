package shopping_basket;
import java.util.*;

public class Item {

String brand;
String product;
int price;

public Item (String brand, String product, int price){
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

public int getPrice(){
  return this.price;
}


}