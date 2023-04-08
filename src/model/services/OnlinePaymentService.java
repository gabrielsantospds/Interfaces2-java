package model.services;

public interface OnlinePaymentService {

	double paymentFee(Double amount);
	double interes(Double amount, Integer month);
	
}
