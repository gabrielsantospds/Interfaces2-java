package model.entities;

import java.util.Date;

public class Contract {

	private int number;
	private Date date;
	private Double totalValue;
	
	private Installment installment;

	public Contract(int number, Date date, Double totalValue) {
		this.number = number;
		this.date = date;
		this.totalValue = totalValue;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}

	public int getNumber() {
		return number;
	}

	public Date getDate() {
		return date;
	}

	public Installment getInstallment() {
		return installment;
	}
	
}
