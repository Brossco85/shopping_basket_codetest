package shopping_basket;
import java.util.*;

public class Customer{


  String name;
  Boolean loyaltyCustomer;

  public Customer(String name){
    this.name = name;
    this.loyaltyCustomer = false;
  }

    public String getName(){
      return this.name;
    }

}