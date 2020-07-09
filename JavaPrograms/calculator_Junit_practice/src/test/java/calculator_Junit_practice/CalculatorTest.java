package calculator_Junit_practice;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void additionTest() {
		int actual = Runner.addition(4, 6);
		assertEquals(10, actual);
	}

	@Test
	public void multiplicationTest() {
		int actual = Runner.multiplication(4, 6);
		assertEquals(24, actual);
	}
}
