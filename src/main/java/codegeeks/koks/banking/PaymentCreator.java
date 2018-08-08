package codegeeks.koks.banking;

import codegeeks.koks.invoices.Invoice;

public interface PaymentCreator {
	Payment createPayment(Invoice invoice) throws PaymentException;
}
