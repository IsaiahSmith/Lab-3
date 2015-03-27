import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class GeneratorTests {
	   private int inputNumber;
	   private ArrayList expectedResult;
	   private PrimeNumberGenerator generator;

	   @Before
	   public void initialize() {
		   generator = new PrimeNumberGenerator();
	   }

	   // Each parameter should be placed as an argument here
	   // Every time runner triggers, it will pass the arguments
	   // from parameters we defined in primeNumbers() method
	   public GeneratorTests(Integer inputNumber, ArrayList expectedResult) {
	      this.inputNumber = inputNumber;
	      this.expectedResult = expectedResult;
	   }

	   @Parameterized.Parameters
	   public static Collection primeNumbers() {
		  ArrayList answ1 = new ArrayList();
	      return Arrays.asList(new Object[][] {
	         { 2, answ1 }
	         });
	   }

	@Test
	public void test_generate() {
		assertEquals(expectedResult, generator.generate(inputNumber));
	}
}
