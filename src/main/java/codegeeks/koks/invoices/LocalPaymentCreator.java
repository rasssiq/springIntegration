package codegeeks.koks.invoices;

import codegeeks.koks.banking.Payment;
import codegeeks.koks.banking.PaymentCreator;
import codegeeks.koks.banking.PaymentException;
import org.springframework.integration.annotation.Transformer;
import org.springframework.stereotype.Component;

@Component
public class LocalPaymentCreator implements PaymentCreator {

	private static final String CURRENT_LOCAL_ACC = "current-local-acc";

	@Override
	@Transformer
	public Payment createPayment(Invoice invoice) throws PaymentException {
		if (null == invoice.getAccount()) {
			throw new PaymentException("Account can not be empty when creating local payment!");
		}
		return new Payment(CURRENT_LOCAL_ACC, invoice.getAccount(), invoice.getDollars(), invoice.getKraj(), invoice.getWartosc());
	}

}
