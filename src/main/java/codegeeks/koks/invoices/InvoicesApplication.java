package codegeeks.koks.invoices;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.integration.config.EnableIntegration;

//@EnableIntegration
public class InvoicesApplication {
	public static void main(String[] args) {
		new ClassPathXmlApplicationContext("/invoices-context.xml");

	}
}
