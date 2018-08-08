package codegeeks.koks.banking;

public interface BankingService {

	void pay(Payment payment) throws PaymentException;
}
