package com.currencyfair.transaction.dto;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class TransactionRequest {
	
	private int userId;
	
	private String currencyFrom;
	
	private String currencyTo;
	
	private double amountSell;
	
	private double amountBuy;
	
	private double rate;
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date timePlaced;
	
	private String orginatingCountry;
	
	public TransactionRequest(int userId, String currencyFrom, String currencyTo, double amountSell, double amountBuy, double rate,
			Date timePlaced, String orginatingCountry) {
		super();
		this.userId = userId;
		this.currencyFrom = currencyFrom;
		this.currencyTo = currencyTo;
		this.amountSell = amountSell;
		this.amountBuy = amountBuy;
		this.rate = rate;
		this.timePlaced = timePlaced;
		this.orginatingCountry = orginatingCountry;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getCurrencyFrom() {
		return currencyFrom;
	}

	public void setCurrencyFrom(String currencyFrom) {
		this.currencyFrom = currencyFrom;
	}

	public String getCurrencyTo() {
		return currencyTo;
	}

	public void setCurrencyTo(String currencyTo) {
		this.currencyTo = currencyTo;
	}

	public double getAmountSell() {
		return amountSell;
	}

	public void setAmountSell(double amountSell) {
		this.amountSell = amountSell;
	}

	public double getAmountBuy() {
		return amountBuy;
	}

	public void setAmountBuy(double amountBuy) {
		this.amountBuy = amountBuy;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}

	public Date getTimePlaced() {
		return timePlaced;
	}

	public void setTimePlaced(Date timePlaced) {
		this.timePlaced = timePlaced;
	}

	public String getOrginatingCountry() {
		return orginatingCountry;
	}

	public void setOrginatingCountry(String orginatingCountry) {
		this.orginatingCountry = orginatingCountry;
	}

}
