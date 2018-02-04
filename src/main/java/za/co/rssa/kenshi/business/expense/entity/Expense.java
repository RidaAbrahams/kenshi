package za.co.rssa.kenshi.business.expense.entity;

import java.math.BigDecimal;

public class Expense {

	private String name;
	private BigDecimal amount;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	
}
