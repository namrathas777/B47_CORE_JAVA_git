package projectjunit5;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeFalse;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;

public class lifecycle {
@BeforeAll
static void hello(){
	System.out.println("Init...");
}
@BeforeAll
static void initializeExternalResources() {
	System.out.println("Initializing external resources");
}
@BeforeEach
void initializeMockObjects() {
	System.out.println("Initializing mock objects.....");

}
@Test
void sometest() {
	System.out.println("running some test");
	assertTrue(true);
	
}

@Test
@Disabled
void disabledtest() {
	System.exit(1);
}

@Test
void otherTest() {
	assumeFalse(false);
	System.out.println("Running some test...");
	//assertNotEquals(1,4,"why would these be the same?");
	}
}
