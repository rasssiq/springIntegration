package codegeeks.koks.banking;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class MockBankingService implements BankingService {

	private final Random random = new Random();

	// @Override
	public void pay(Payment payment) throws PaymentException {
		if (random.nextDouble() > 0.9) {
			throw new PaymentException("Banking services are offline, try again later!");
		}
		System.out.println("Processing payment " + payment);
	}

}
