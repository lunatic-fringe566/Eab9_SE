package JUnitPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestaddNumbers {

	@Test
	void test() 
	{
		JUnitFunction obj = new JUnitFunction();
		int conclusion = obj.addNumbers(210, 190);
		assertEquals (400,conclusion);
	}

}
