package com.greenbackchallenge.GreenbackChallenge.entity;



	public class Input {
	
	private String ref;
	private String date;
	private String currency;
	private String amount;
	
	public Input() {
		
	}

	

	public Input(String ref, String date, String currency, String amount) {
		super();
		this.ref = ref;
		this.date = date;
		this.currency = currency;
		this.amount = amount;
	}



	public String getRef() {
		return ref;
	}



	public void setRef(String ref) {
		this.ref = ref;
	}



	public String getDate() {
		return date;
	}



	public void setDate(String date) {
		this.date = date;
	}



	public String getCurrency() {
		return currency;
	}



	public void setCurrency(String currency) {
		this.currency = currency;
	}



	public String getAmount() {
		return amount;
	}



	public void setAmount(String amount) {
		this.amount = amount;
	}



	@Override
	public String toString() {
		return "Input [ref=" + ref + ", date=" + date + ", currency=" + currency + ", amount=" + amount + "]";
	}
	
	


	
	
	
	


	
	
	

}
