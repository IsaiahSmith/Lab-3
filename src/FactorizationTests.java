import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class FactorizationTests {

	@Test
	public void test_factorizeFor1() {
		PrimeFactorization pf = new PrimeFactorization(1);
		assertEquals(0, pf.factorize().size());
	}
	
	@Test
	public void test_factorizeFor2() {
		PrimeFactorization pf = new PrimeFactorization(2);
		ArrayList answ = new ArrayList();
		answ.add(2);
		assertEquals(answ, pf.factorize());
	}
	
	@Test
	public void test_factorizeFor3() {
		PrimeFactorization pf = new PrimeFactorization(3);
		ArrayList answ = new ArrayList();
		answ.add(3);
		assertEquals(answ, pf.factorize());
	}

	@Test
	public void test_factorizeFor4() {
		PrimeFactorization pf = new PrimeFactorization(4);
		ArrayList answ = new ArrayList();
		answ.add(2);
		answ.add(2);
		assertEquals(answ, pf.factorize());
	}
	
	@Test
	public void test_factorizeFor6() {
		PrimeFactorization pf = new PrimeFactorization(6);
		ArrayList answ = new ArrayList();
		answ.add(2);
		answ.add(3);
		assertEquals(answ, pf.factorize());
	}
	
	@Test
	public void test_factorizeFor8() {
		PrimeFactorization pf = new PrimeFactorization(8);
		ArrayList answ = new ArrayList();
		answ.add(2);
		answ.add(2);
		answ.add(2);
		assertEquals(answ, pf.factorize());
	}
	
	@Test
	public void test_factorizeFor9() {
		PrimeFactorization pf = new PrimeFactorization(9);
		ArrayList answ = new ArrayList();
		answ.add(3);
		answ.add(3);
		assertEquals(answ, pf.factorize());
	}
	
	@Test
	public void test_factorizeFor325115() {
		PrimeFactorization pf = new PrimeFactorization(325115);
		ArrayList answ = new ArrayList();
		answ.add(5);
		answ.add(7);
		answ.add(7);
		answ.add(1327);
		assertEquals(answ, pf.factorize());
	}
}
