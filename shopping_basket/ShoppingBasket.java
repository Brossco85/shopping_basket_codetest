package shopping_basket;
import java.util.*;

public class ShoppingBasket{

  Customer customer;
  HashMap<Item, Integer> basket;
  Item bogofPromotion;

  public ShoppingBasket(Customer customer){
    this.customer = customer;
    basket = new HashMap<Item, Integer>();
    bogofPromotion = null;
  }

  public ShoppingBasket(Customer customer, Item bogofItem){
    this.customer = customer;
    basket = new HashMap<Item, Integer>();
    bogofPromotion = bogofItem;
  }

  public Customer getCustomer(){
    return this.customer;
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

 public double bogofDiscount(){
  double bogof = 0;
  for (Item item : basket.keySet()){
    if (item == bogofPromotion){ 
      bogof -= item.getPrice() * (basket.get(item) - (basket.get(item) % 2)) * 0.5;
    }
  }
  return bogof;
}

public boolean basketOverMinimumSpend(){
 return (getBasketTotal() + bogofDiscount() > 20);
}

public boolean customerHasLoyaltyCard(){
  return (customer.isLoyaltyCustomer());
}

public double totalAfterPromotionalDiscounts(){
  double total = getBasketTotal() + bogofDiscount();
  total *= (basketOverMinimumSpend()) ? 0.8 : 1;
  total *= (customerHasLoyaltyCard()) ? 0.98 : 1;
  return total;
}




}