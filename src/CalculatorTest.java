import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testAdd() {
		assertEquals(8, Calculator.add(3, 5));
	}

	@Test
	public void testSubtract() {
		assertEquals(2, Calculator.subtract(5, 3));
	}

	@Test
	public void testMultiply() {
		assertEquals(8, Calculator.multiply(4, 2));
	}

	@Test
	public void testDivide() {
		assertEquals(8, Calculator.divide(16, 2));
	}

}
