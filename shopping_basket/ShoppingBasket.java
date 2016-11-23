package shopping_basket;
import java.util.*;

public class ShoppingBasket{

HashMap<Item, Integer> basket = new HashMap<Item, Integer>();

public ShoppingBasket(){
}

public HashMap<Item, Integer> getBasket(){
  return this.basket;
}

// ask about using an integer here
public int getBasketSize(){
  int sum = 0;
  for (int quantity : basket.values()){
    sum += quantity;
  }
  return sum;
}

// public double getBasketTotal(){


public void addItemToBasket(Item item, Integer quantity){
  basket.put(item, quantity);
}

public void clearBasket(){
  basket.clear();
}






}