package junitproject;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {

	Calculator calculator = new Calculator();
	@Test
	public void addTest() {
		int s = calculator.add(20, 10);
		assertEquals(30,s);
		//fail("Not yet implemented");
	}
	
	@Test
	public void subTest() {
		int r = calculator.sub(20, 10);
		assertEquals(10,r);
	}
	
	@Test
	public void multTest(){
		int r= calculator.mult(3, 4);
		assertEquals(12,r);
		
	}

}
