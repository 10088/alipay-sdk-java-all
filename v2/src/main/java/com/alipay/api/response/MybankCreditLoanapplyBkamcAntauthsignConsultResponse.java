package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loanapply.bkamc.antauthsign.consult response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 01:22:49
 */
public class MybankCreditLoanapplyBkamcAntauthsignConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 7343295335381813231L;

	/** 
	 * 是否有授权
	 */
	@ApiField("authed")
	private Boolean authed;

	public void setAuthed(Boolean authed) {
		this.authed = authed;
	}
	public Boolean getAuthed( ) {
		return this.authed;
	}

}
