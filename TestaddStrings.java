package JUnitPackage;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestaddStrings {

	@Test
	void test() 
	{
		JUnitFunction obj = new JUnitFunction();
		String conclusion = obj.addStrings("Chennai", " Super Kings");
		assertEquals ("Chennai Super Kings",conclusion);
	}

}
