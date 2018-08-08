package codegeeks.koks.invoices;

import com.google.common.base.MoreObjects;
//import com.google.common.base.Objects;

import java.math.BigDecimal;
//import java.util.Objects;

public class Invoice {
	private final String iban;
	private String address;
	private String account;
	private final BigDecimal dollars;
	private String kraj;
	private String wartosc;
//pododaje tez wartosc aby moc ja edytowac - najpier w filter a potem dodam cos od siebie
	public Invoice(String iban, String address, String account, BigDecimal dollars, String kraj,String wartosc) {
		super();
		this.iban = iban;
		this.address = address;
		this.account = account;
		this.dollars = dollars;//ttuaj musialem dodac to moje g chyba
		this.kraj=kraj;
		this.wartosc=wartosc;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getIban() {
		return iban;
	}

	public BigDecimal getDollars() {
		return dollars;
	}

	// custom
	public boolean isForeign() {
		return null != iban && !iban.isEmpty();
	}
	public boolean isPolska() {
		return (kraj.equals("Polska")) ? true : false;
	}

	public String getKraj() {
		return kraj;
	}

	public void setKraj(String kraj) {
		this.kraj = kraj;
	}

	public String getWartosc() {
		return wartosc;
	}

	public void setWartosc(String wartosc) {
		this.wartosc = wartosc;
	}

	@Override
	public String toString() {
		return MoreObjects.toStringHelper(this).add("iban", iban).add("address", address).add("account", account)
				.add("dollars", dollars).add("kraj", kraj).toString();
		//return "IBAN: "+iban+" | " +" Address: "+address+" | "+"Account: "+account+" | dollars: "+dollars;
	}
}
