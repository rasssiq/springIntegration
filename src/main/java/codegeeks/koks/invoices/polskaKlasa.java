package codegeeks.koks.invoices;

import org.springframework.integration.annotation.Filter;
//import org.codehaus.plexus.component.annotations.Component;
import org.springframework.stereotype.Component;

@Component
public class polskaKlasa {

	@Filter
	public boolean accept(Invoice invoice) {
		boolean ujdzie;
		if(invoice.getKraj().equals("Polska")) {
			ujdzie=true ;
		}
		else {
			ujdzie=false;
		}
		if(ujdzie==false) {
			System.out.println("System musial odrzucic invoice: "+ invoice.toString()+ " z powodu braku polskosci");
			return false;
		}
		return true;
	}
}
