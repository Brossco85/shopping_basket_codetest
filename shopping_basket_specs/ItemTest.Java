import static org.junit.Assert.assertEquals;
import org.junit.*;
import shopping_basket.*;

public class ItemTest{

  Item item1;

  @Before
  public void before(){
    item1 = new Item("Apple", "Iphone", 400.00);
  }

  @Test
  public void testGetBrand(){
    assertEquals("Apple", item1.getBrand());
  }


}