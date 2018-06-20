import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromeProgramTest {
    
	@Test
	public  void scannerInputTest(){
		//Arrange
		PalindroneProgram pp=new PalindroneProgram();
		int expectedInput=242;
		//Act
		int actualInput=pp.scannerInput();
		//Assert
		assertEquals(expectedInput,actualInput);
		
	}
	@Test
	public void whetherPalindromeTest() {
		//Arrange
		PalindroneProgram pp=new PalindroneProgram();
		String expectedInput = "The number is a palondrome and sum of even digits is less than 25 i.e. : ";
		//Act
		String actualInput =pp.whetherPalindrome(242);
		//Assert
		assertEquals(expectedInput,actualInput);
		
	}
	@Test
	public  void checkSumOfEvenTest() {
		//Arrange
		PalindroneProgram pp=new PalindroneProgram();
		int expectedSum=8;
		//Act
		int actualSum=pp.checkSumOfEven(242);
		//Assert
		assertEquals(expectedSum,actualSum);
		
	}
	 
}
