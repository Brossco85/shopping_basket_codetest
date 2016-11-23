package shopping_basket;
import java.util.*;

public class ShoppingBasket{

HashMap<Item, Integer> basket;

public ShoppingBasket(){
basket = new HashMap<Item, Integer>();
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

public double getBasketTotal(){
  double total = 0;
  for (Item item : basket.keySet()){
    total += item.getPrice() * basket.get(item);
  }
  return total;
  }

public void addItemToBasket(Item item, Integer quantity){
  basket.put(item, quantity);
}

public void removeItemFromBasket(Item item){
  basket.put(item, basket.get(item) -1);
}

public void clearBasket(){
  basket.clear();
}

public double buyOneGetOneFree(Item itemOnOffer){
  double bogof = 0;
  for (Item item : basket.keySet()){
      if (item == itemOnOffer){
        if (basket.get(item) % 2 == 0){
          bogof -= (item.getPrice() * basket.get(item)) * 0.5;
        }
        else {
          bogof -= item.getPrice() * (basket.get(item) - (basket.get(item) % 2)) * 0.5;
        }
      }
  }
  return bogof;
}




}