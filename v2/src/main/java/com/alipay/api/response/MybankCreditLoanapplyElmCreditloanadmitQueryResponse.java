package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loanapply.elm.creditloanadmit.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 16:49:24
 */
public class MybankCreditLoanapplyElmCreditloanadmitQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1691518774119526149L;

	/** 
	 * 可贷额度标签
	 */
	@ApiField("admit_label")
	private String admitLabel;

	public void setAdmitLabel(String admitLabel) {
		this.admitLabel = admitLabel;
	}
	public String getAdmitLabel( ) {
		return this.admitLabel;
	}

}
