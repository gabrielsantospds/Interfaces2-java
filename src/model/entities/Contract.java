package model.entities;

import java.time.LocalDate;

public class Contract {

	private int number;
	private LocalDate date;
	private Double totalValue;
	
	private Installment installment;

	public Contract(int number, LocalDate date, Double totalValue) {
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

	public LocalDate getDate() {
		return date;
	}

	public Installment getInstallment() {
		return installment;
	}
	
	public void setInstallment(Installment installment) {
		this.installment = installment;
	}
	
}
