package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loanapply.amount.get response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 07:43:32
 */
public class MybankCreditLoanapplyAmountGetResponse extends AlipayResponse {

	private static final long serialVersionUID = 7218456996193791751L;

	/** 
	 * 提额失败原因
	 */
	@ApiField("reason")
	private String reason;

	/** 
	 * 提额成功或失败
	 */
	@ApiField("success")
	private Boolean success;

	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getReason( ) {
		return this.reason;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
