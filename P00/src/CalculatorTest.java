import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		//fail("Not yet implemented");
		int a = 1234;
		int b = 8765;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		
		int expected = 9999;
		assertEquals (expected,actual);
	}
	@Test
	public void testSubstract() {
		int a = 12;
		int b = 10;
		
		Calculator cal = new Calculator();
		int actual = cal.substract(a,b);
		
		int expected = 2;
		assertEquals(expected, actual);
	
	}
	@Test
	public void testMultiple() {
		int a = 2;
		int b = 10;
		
		Calculator cal = new Calculator();
		int actual = cal.multiple(a,b);
		
		int expected = 20;
		assertEquals(expected, actual);
		
	}public void testDevide() {
		int a = 10;
		int b = 2;
		
		Calculator cal = new Calculator();
		int actual = cal.devide(a,b);
		
		int expected = 5;
		assertEquals(expected, actual);
	

}
}
