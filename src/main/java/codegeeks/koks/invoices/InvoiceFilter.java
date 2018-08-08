package codegeeks.koks.invoices;

import org.springframework.integration.annotation.Filter;
import org.springframework.stereotype.Component;

@Component
public class InvoiceFilter {

	public static final int LOW_ENOUGH_THRESHOLD = 10000;

	@Filter
	public boolean accept(Invoice invoice) {
		boolean lowEnough = invoice.getDollars().intValue() < LOW_ENOUGH_THRESHOLD;
		System.out.println("Amount of $ " + invoice.getDollars() + (lowEnough ? " can " : " can not ")
				+ "be automatically processed bt system");
		//az to return jest custom 
		if(!invoice.getKraj().equals("Polska")) {
			invoice.setWartosc(invoice.getWartosc()+" To nie nasi...");
		}
		return lowEnough;
	}
}
