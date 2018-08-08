package codegeeks.koks.invoices;

import java.util.Collection;

public interface InvoiceCollectorGateway {
	void collectInvoices(Collection<Invoice> invoices);
}
