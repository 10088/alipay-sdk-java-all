package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.finance.account.rysenterprise.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-05 11:17:58
 */
public class MybankFinanceAccountRysenterpriseQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3692726815647624328L;

	/** 
	 * 融易收账户Id
	 */
	@ApiField("account_no")
	private String accountNo;

	/** 
	 * 融易收账户可用余额
	 */
	@ApiField("amount")
	private String amount;

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public String getAccountNo( ) {
		return this.accountNo;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getAmount( ) {
		return this.amount;
	}

}
