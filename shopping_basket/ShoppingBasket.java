package shopping_basket;
import java.util.*;

public class ShoppingBasket{

ArrayList<Item> basket = new ArrayList<Item>();

public ShoppingBasket(){
}

public ArrayList<Item> getBasket(){
  return this.basket;
}

public int getBasketSize(){
  return basket.size();
}

public void addItemToBasket(Item item){
  basket.add(item);
}

public void clearBasket(){
  basket.clear();
}


}