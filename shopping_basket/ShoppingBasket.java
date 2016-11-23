package shopping_basket;
import java.util.*;

public class ShoppingBasket{

Customer customer;
HashMap<Item, Integer> basket;
Item bogofPromotion;

public ShoppingBasket(Customer customer){
customer = customer;
basket = new HashMap<Item, Integer>();
bogofPromotion = null;
}


public ShoppingBasket(Customer customer, Item bogofItem){
customer = customer;

basket = new HashMap<Item, Integer>();
bogofPromotion = bogofItem;
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

public void setBogofPromotionalItem(Item item){
  bogofPromotion = item;
}

public String getBogofPromotionalItem(){
 return bogofPromotion.getProduct();
}

public double buyOneGetOneFree(){
  double bogof = 0;
  for (Item item : basket.keySet()){
      if (item == bogofPromotion){
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

public boolean basketOverMinimumSpend(){
 return (getBasketTotal() + buyOneGetOneFree() > 20);
}

// public double tenPercentOffTwentySpent(){

// }




}