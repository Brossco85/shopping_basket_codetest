import static org.junit.Assert.assertEquals;
import org.junit.*;
import shopping_basket.*;

public class ShoppingBasketTest{

  Customer customer1;
  Customer customer2;
  ShoppingBasket basket1;
  Item item1;
  Item item2;
  Item item3;
  ShoppingBasket basket2;


  @Before
  public void before(){
    customer1 = new Customer("Bertie");
    customer2 = new Customer("Joanne");
    basket1 = new ShoppingBasket(customer2);
    customer1.setLoyaltyCustomer(true);
    item1 = new Item("Apple", "Iphone", 300.50);
    item2 = new Item("Apple", "Macbook", 500.50);
    item3 = new Item("MicroSoft", "SurfacePro", 700.50);
    basket2 = new ShoppingBasket(customer1, item1);
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
    assertEquals(-601.00, basket1.bogofDiscount(), 0.01);
  }

  @Test
  public void testSetBogofPromotionalItem(){
    assertEquals("Iphone", basket2.getBogofPromotionalItem());
  }

  @Test
  public void testBasketOverMinimumSpend(){
    assertEquals(false, basket1.basketOverMinimumSpend());
    basket1.addItemToBasket(item1, 2);
    assertEquals(true, basket1.basketOverMinimumSpend());
  }

  @Test
  public void testCustomerHasLoyaltyCard(){
    assertEquals(true, basket2.customerHasLoyaltyCard());
  }

  @Test
  public void testTotalAfterPromotionalDiscounts(){
    basket2.addItemToBasket(item1, 5);
    assertEquals(706.78, basket2.totalAfterPromotionalDiscounts(), 0.01);
    basket1.addItemToBasket(item1, 9);
    assertEquals(2163.60, basket1.totalAfterPromotionalDiscounts(), 0.01);

  }

}