package codegeeks.koks.invoices;

import org.springframework.stereotype.Component;
import org.springframework.integration.annotation.ServiceActivator;

@Component
public class FailedPaymentHandler {
	@ServiceActivator
	public void handlerFailedPayment(Exception e) {
		System.out.println("Payment failed: " + e);
		// here should be some retry attempt
	}
}
