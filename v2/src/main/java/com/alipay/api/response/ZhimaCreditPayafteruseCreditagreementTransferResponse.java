package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.payafteruse.creditagreement.transfer response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-04 23:33:57
 */
public class ZhimaCreditPayafteruseCreditagreementTransferResponse extends AlipayResponse {

	private static final long serialVersionUID = 7645829597686577336L;

	/** 
	 * 芝麻开通协议号
	 */
	@ApiField("credit_agreement_id")
	private String creditAgreementId;

	/** 
	 * 商户外部协议号
	 */
	@ApiField("out_agreement_no")
	private String outAgreementNo;

	public void setCreditAgreementId(String creditAgreementId) {
		this.creditAgreementId = creditAgreementId;
	}
	public String getCreditAgreementId( ) {
		return this.creditAgreementId;
	}

	public void setOutAgreementNo(String outAgreementNo) {
		this.outAgreementNo = outAgreementNo;
	}
	public String getOutAgreementNo( ) {
		return this.outAgreementNo;
	}

}
