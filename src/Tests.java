import static org.junit.Assert.*;

import org.junit.Test;


public class Tests {

	@Test
	public void test_factorizeForEmpty() {
		PrimeFactorization pf = new PrimeFactorization(1);
		assertEquals(0,pf.factorize().size());
	}

}
