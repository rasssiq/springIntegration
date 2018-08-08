package codegeeks.koks.invoices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.integration.annotation.ServiceActivator;

import codegeeks.koks.banking.BankingService;
import codegeeks.koks.banking.Payment;
import codegeeks.koks.banking.PaymentException;

@Component
public class PaymentProcessor {
	@Autowired
	BankingService bankingService;

	@ServiceActivator
	public void processPayment(Payment payment) throws PaymentException {
		bankingService.pay(payment);
	}
}
