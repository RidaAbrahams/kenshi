package kenshi;

import static org.junit.Assert.*;

import java.math.BigDecimal;

import org.junit.Test;

import za.co.rssa.kenshi.util.ThisAmount;

public class ThisValueTest {

	@Test
	public void testIsGreaterThan() {
		BigDecimal amount = new BigDecimal("5.00");
		BigDecimal limit = new BigDecimal("3.00");
		assertTrue(ThisAmount.of(amount).isGreaterThan(limit));
	}

	@Test
	public void testIsLessThan() {
		BigDecimal amount = new BigDecimal("5.00");
		BigDecimal limit = new BigDecimal("6.00");
		assertTrue(ThisAmount.of(amount).isLessThan(limit));
	}
	
	@Test
	public void testIsEqualTo() {
		BigDecimal amount = new BigDecimal("5.00");
		BigDecimal limit = new BigDecimal("5.00");
		assertTrue(ThisAmount.of(amount).isEqualTo(limit));
	}
}
