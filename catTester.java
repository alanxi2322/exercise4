import org.junit.Test;
import static org.junit.Assert.*;

public class catTester{
	@Test
	public void TestInitial(){
		Cat testCat = new Cat("Cat", 100.00); 
		String newName = "Fat Cat"; 
		testCat.setName(newName); 
		assertEquals(testCat.getName(), newName); 
	}
}