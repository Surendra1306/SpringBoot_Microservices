package in.surendra.entity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
	
	
	@Test
	public void addTest() {
		Calculator c = new Calculator();
		int actualResult=c.add(10, 20);
		int expectedResult= 30;
		
		assertEquals(expectedResult,actualResult);
		//run as junit - if it shows in red color test was failed ,if its in green tests was passed
	}
	
	@Test
	public void subtractTest() {
		Calculator c1=new Calculator(); 
		int actualResult1=c1.subtract(50, 25);
		int expectedResult1=25;
		assertEquals(expectedResult1, actualResult1);
	}

}
