package codegeeks.koks.invoices;

import org.springframework.stereotype.Component;
import codegeeks.koks.banking.Payment;
import codegeeks.koks.banking.PaymentCreator;
import codegeeks.koks.banking.PaymentException;
import org.springframework.integration.annotation.Transformer;

@Component
public class ForeginPaymentCreator implements PaymentCreator {

	private static final String CURRENT_IBAN_ACC = "current-iban-acc";

	@Override
	@Transformer
	public Payment createPayment(Invoice invoice) throws PaymentException{

		if (null == invoice.getIban()) {
			throw new PaymentException("IBAN musn't be null when creating foregin ayment!");
		}
		return new Payment(CURRENT_IBAN_ACC, invoice.getIban(), invoice.getDollars(), invoice.getKraj(), invoice.getWartosc());
	}

}
