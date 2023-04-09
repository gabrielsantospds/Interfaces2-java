package model.services;

public class PaypalService implements OnlinePaymentService {

	@Override
	public double paymentFee(Double amount) {
		return amount * (1 + 0.02);
	}

	@Override
	public double interes(Double amount, Integer month) {
		return amount * (1 + 0.01 * month);
	}

	
}
