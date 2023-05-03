package projectjunit5;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;

class Calculator
{
	public int multiply(int a, int b) {
		return a*b;
	}
}
public class CalculatorTest 
{
	Calculator calculator;
	@BeforeEach
	void setup() 
	{
		calculator = new Calculator();
		System.out.println("objective created");
	}
	@Test
	@DisplayName("Simple multiplicationshould work")
	void testMultiply() 
	{
		//assertEquals(20,calculator.multiply(4, 3),
				//"Regular multiplication should work");
		//@RepeatedTest(5)
		//@Test
		//@DisplayName("Ensure correct handling of zero")
		//void testMultiplyWithZero() 
		{
			//assertNotEquals(1,calculator.multiply(1,1),"Multiply with zero should ");
			//assertEquals(0, calculator.multiply(5,2),"Multiple witrh zero");
		}	
	}
}
