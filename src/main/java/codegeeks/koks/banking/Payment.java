package codegeeks.koks.banking;

import java.math.BigDecimal;

import com.google.common.base.MoreObjects;

public class Payment {
	private final String senderAccount;
	private final String receiverAccount;
	private final BigDecimal dollars;
	private final String kraj;
	private final String wartosc;

	public Payment(String senderAccount, String receiverAccount, BigDecimal dollars, String kraj, String wartosc) {
		super();
		this.senderAccount = senderAccount;
		this.receiverAccount = receiverAccount;
		this.dollars = dollars;
		this.kraj=kraj;
		this.wartosc=wartosc;
	}

	public String getSenderAccount() {
		return senderAccount;
	}

	public String getReceiverAccount() {
		return receiverAccount;
	}

	public BigDecimal getDollars() {
		return dollars;
	}
	

	public String getKraj() {
		return kraj;
	}
	public String getWartosc() {
		return wartosc;
	}

	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this).add("senderAccount", senderAccount).add("receiverAccount", receiverAccount)
				.add("dollars", dollars).add("kraj", kraj).add("wartosc", wartosc).toString();
		//return "senderAccount: "+senderAccount+" | receiverAccount: "+receiverAccount+" | dollars: "+dollars;
	}

}
