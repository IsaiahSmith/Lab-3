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
		  ArrayList answ2 = new ArrayList();
		  answ2.add(2);
		  answ2.add(3);
		  answ2.add(5);
		  ArrayList answ3 = new ArrayList();
		  answ3.add(2);
		  answ3.add(3);
		  answ3.add(5);
		  answ3.add(7);
		  answ3.add(11);
		  ArrayList answ4 = new ArrayList();
		  answ4.add(2);
		  answ4.add(3);
		  answ4.add(5);
		  answ4.add(7);
		  answ4.add(11);
		  answ4.add(13);
		  answ4.add(17);
		  answ4.add(19);
		  ArrayList answ5 = new ArrayList();
		  answ5.add(2);
		  answ5.add(3);
		  answ5.add(5);
		  answ5.add(7);
		  answ5.add(11);
		  answ5.add(13);
		  answ5.add(17);
		  answ5.add(19);
		  answ5.add(23);
		  ArrayList answ6 = new ArrayList();
		  answ6.add(2);
		  answ6.add(3);
		  answ6.add(5);
		  answ6.add(7);
		  answ6.add(11);
		  answ6.add(13);
		  answ6.add(17);
		  answ6.add(19);
		  answ6.add(23);
		  answ6.add(29);
		  return Arrays.asList(new Object[][] {
	         { 2, answ1 },
	         { 6, answ2 },
	         { 13, answ3 },
	         { 22, answ4 },
	         { 23, answ4 },
	         { 24, answ5},
	         { 30, answ6}
	         });
	   }

	@Test
	public void test_generate() {
		assertEquals(expectedResult, generator.generate(inputNumber));
	}
}
