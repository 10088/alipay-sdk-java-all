package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CreditBankCredit;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.creditbank.credit.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 07:11:15
 */
public class AlipayCommerceEducateCreditbankCreditQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6596881869233832793L;

	/** 
	 * 学分信息
	 */
	@ApiListField("credit")
	@ApiField("credit_bank_credit")
	private List<CreditBankCredit> credit;

	public void setCredit(List<CreditBankCredit> credit) {
		this.credit = credit;
	}
	public List<CreditBankCredit> getCredit( ) {
		return this.credit;
	}

}
