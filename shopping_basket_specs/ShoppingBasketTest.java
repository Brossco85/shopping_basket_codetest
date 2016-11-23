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
  item1 = new Item("Apple", "Iphone", 300);
  item2 = new Item("Apple", "Macbook", 500);
  item3 = new Item("MicroSoft", "SurfacePro", 700);
}

@Test
public void testStartBasketEmpty(){
  assertEquals(0, basket1.getBasketSize());
}

@Test
public void testAddItemToBasket(){
  basket1.addItemToBasket(item1);
  assertEquals(1, basket1.getBasketSize());
}

// @Test
// public void testClearBasket(){

//   assertEquals(0, basket1.getBasketSize());
// }


}