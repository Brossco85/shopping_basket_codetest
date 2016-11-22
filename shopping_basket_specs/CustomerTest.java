import static org.junit.Assert.assertEquals;
import org.junit.*;
import shopping_basket.*;

public class CustomerTest{

Customer customer1;

@Before
public void before(){

customer1 = new Customer("Bertie");
}

@Test
public void testCustomerName(){
  assertEquals("Bertie", customer1.getName());
}

}