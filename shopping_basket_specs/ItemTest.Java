import static org.junit.Assert.assertEquals;
import org.junit.*;
import shopping_basket.*;

public class ItemTest{

  Item item1;

  @Before
  public void before(){
    item1 = new Item("Apple", "Iphone", 400.49);
  }

  @Test
  public void testGetBrand(){
    assertEquals("Apple", item1.getBrand());
  }

  @Test
  public void testGetProduct(){
    assertEquals("Iphone", item1.getProduct());
  }

  @Test
  public void testGetPrice(){
    assertEquals(400.49, item1.getPrice(), 0.01);
  }




}