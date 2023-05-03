package projectjunit5;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class NumberTestCase {
@Test
void factorialTest1() {
	int expected = 120;
	int actual = Numberfunctions.factorial(5);
	assertEquals(expected, actual);
	
}
@Test
void factorialTest2() {
	long expected=1;
	long actual;
	actual= Numberfunctions.factorial(0);
	assertEquals(expected, actual);
}

@Test
void factorialTest3() {
	long expected = -120;
	long actual;
	actual=Numberfunctions.factorial(-5);
	assertEquals(expected, actual);
	
}
@ParameterizedTest
@ValueSource(ints = {6,-6})
void factorialTest2(int no) {
	long expected =720;
	long actual;
	actual = Numberfunctions.factorial(no);
	assertEquals(expected, actual);
}
@Test
void palindromeTest() {
	int actual =Numberfunctions.isPalindrome(1221);
	int expected=1;
	assertEquals(expected , actual);
}
@Test
void palindromeTest2() {
	int actual =Numberfunctions.isPalindrome(115);
	int expected=0;
	assertEquals(expected , actual);
}
@Test
void palindromeTest3() {
	int actual = Numberfunctions.isPalindrome(12321);
	int expected =1;
	assertEquals(expected, actual);
	}
}
