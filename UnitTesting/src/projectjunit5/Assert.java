package projectjunit5;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class Assert {
	@ParameterizedTest
	@ValueSource(strings= {"cali","bali"})
	void endsWithI(String str) {
		assertTrue(str.endsWith("i"));
	}

}
