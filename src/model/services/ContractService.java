package model.services;

import java.time.LocalDate;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {

	OnlinePaymentService service;
	
	public ContractService(OnlinePaymentService service) {
		this.service = service;
	}

	public void processContract(Contract contract, Integer month) {
		
		Installment[] instalVect = new Installment[month];
		
		for(int i = 0; i < instalVect.length; i++) {
			double instalValue = contract.getTotalValue() / month;
			double result = service.paymentFee(service.interes(instalValue, i+1));
			LocalDate dueDate = contract.getDate().plusMonths(i+1);
			contract.setInstallment(instalVect[i] = new Installment(dueDate, result));
			System.out.println(instalVect[i]);
		}
		
	}
}
