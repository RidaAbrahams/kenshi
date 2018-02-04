package za.co.rssa.kenshi.util;

import java.math.BigDecimal;

public class ThisAmount {
	
	private BigDecimal bigDecimalValue;
	
	public static ThisAmount of(BigDecimal bigDecimalValue) {
		return new ThisAmount(bigDecimalValue);
	}
	
	private ThisAmount(BigDecimal bigDecimalValue) {
		super();
		this.bigDecimalValue = bigDecimalValue;
	}
	
	public boolean isGreaterThan(BigDecimal otherBigDecimalValue) {
		return bigDecimalValue.compareTo(otherBigDecimalValue) > 0;
	}

	public boolean isLessThan(BigDecimal otherBigDecimalValue) {
		return bigDecimalValue.compareTo(otherBigDecimalValue) < 0;
	}
	
	public boolean isEqualTo(BigDecimal otherBigDecimalValue) {
		return bigDecimalValue.compareTo(otherBigDecimalValue) == 0;
	}
}
