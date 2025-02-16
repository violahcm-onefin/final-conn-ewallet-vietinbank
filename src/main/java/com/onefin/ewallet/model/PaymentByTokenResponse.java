package com.onefin.ewallet.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
public class PaymentByTokenResponse {
	
	@JsonIgnore
	private String signature;

	private String providerId;

	private String merchantId;

	private String requestId;

	private Status status;

	private String bankTransactionId;

	private String description;

}
