import static org.junit.Assert.assertEquals;
import org.junit.*;
import shopping_basket.*;

public class ShoppingBasketTest{

ShoppingBasket basket1;
Item item1;
Item item2;
Item item3;

@Before
public void before(){
  basket1 = new ShoppingBasket();
  item1 = new Item("Apple", "Iphone", 300.50);
  item2 = new Item("Apple", "Macbook", 500.50);
  item3 = new Item("MicroSoft", "SurfacePro", 700.50);
}

@Test
public void testStartBasketEmpty(){
  assertEquals(0, basket1.getBasketSize());
}

@Test
public void testAddItemToBasket(){
  basket1.addItemToBasket(item1, 5);
  assertEquals(5, basket1.getBasketSize());
}

@Test
public void testClearBasket(){
  basket1.addItemToBasket(item1, 5);
  assertEquals(5, basket1.getBasketSize());
  basket1.clearBasket();
  assertEquals(0, basket1.getBasketSize());
}

@Test
public void testGetBasketTotal(){
  basket1.addItemToBasket(item1, 2);
  basket1.addItemToBasket(item2, 3);
  basket1.addItemToBasket(item3, 4);
assertEquals(4904.50, basket1.getBasketTotal(), 0.01);
}

@Test
public void testRemoveItemFromBasket(){
  basket1.addItemToBasket(item1, 2);
  basket1.removeItemFromBasket(item1);
  assertEquals(1, basket1.getBasketSize());
}

@Test
public void testBuyOneGetOneFree(){
  basket1.addItemToBasket(item1, 5);
  basket1.setBogofPromotionalItem(item1);
  assertEquals(-601.00, basket1.buyOneGetOneFree(), 0.01);
}

@Test
public void testSetBogofPromotionalItem(){
  basket1.setBogofPromotionalItem(item1);
  assertEquals("Iphone", basket1.getBogofPromotionalItem());
}

// @Test
// public void testBasketOverMinimumSpend(){
//   assertEquals(false, bask)
// }

}