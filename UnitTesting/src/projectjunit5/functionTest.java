package projectjunit5;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class functionTest {
	@Test
	void armstrongTest1() {
		int expected = 123;
		int actual= functions.armstrong(123);
		assertEquals(expected ,actual);
	}
	@Test
	void armstrongTest2() {
		int expected = 1643;
		int actual = functions.armstrong(1643);
		assertEquals(expected, actual);
	}
	@Test
	void armstrongTest3() {
		int expected= 153;
		int actual = functions.armstrong(153);
		assertEquals(expected, actual);
	}
 @Test 
 void armstrongTest4() {
	 int expected= 370;
	 int actual =functions.armstrong(371);
	 assertEquals(expected,actual);
 }
}
