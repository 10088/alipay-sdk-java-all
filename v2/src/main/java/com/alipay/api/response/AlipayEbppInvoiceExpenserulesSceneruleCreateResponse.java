package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.expenserules.scenerule.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-05 00:26:40
 */
public class AlipayEbppInvoiceExpenserulesSceneruleCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1198971942476954364L;

	/** 
	 * 费控规则ID
	 */
	@ApiField("standard_id")
	private String standardId;

	public void setStandardId(String standardId) {
		this.standardId = standardId;
	}
	public String getStandardId( ) {
		return this.standardId;
	}

}
