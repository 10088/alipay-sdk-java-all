package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fincore.fundds.account.witness.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-04 19:11:50
 */
public class AlipayFincoreFunddsAccountWitnessModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7146731894241489237L;

	/** 
	 * 账号
	 */
	@ApiField("account_no")
	private String accountNo;

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountNo( ) {
		return this.accountNo;
	}

}
