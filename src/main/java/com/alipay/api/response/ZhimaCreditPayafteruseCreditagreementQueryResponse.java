package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.payafteruse.creditagreement.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-07-14 14:11:46
 */
public class ZhimaCreditPayafteruseCreditagreementQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5786552916494828412L;

	/** 
	 * 开通/授权状态，VALID: 有效，INVALID: 无效
	 */
	@ApiField("agreement_status")
	private String agreementStatus;

	/** 
	 * 开通/授权时间，agreement_status为VALID时消费
	 */
	@ApiField("biz_time")
	private Date bizTime;

	/** 
	 * 芝麻开通/授权协议号
	 */
	@ApiField("credit_agreement_id")
	private String creditAgreementId;

	/** 
	 * 商户外部协议号
	 */
	@ApiField("out_agreement_no")
	private String outAgreementNo;

	public void setAgreementStatus(String agreementStatus) {
		this.agreementStatus = agreementStatus;
	}
	public String getAgreementStatus( ) {
		return this.agreementStatus;
	}

	public void setBizTime(Date bizTime) {
		this.bizTime = bizTime;
	}
	public Date getBizTime( ) {
		return this.bizTime;
	}

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
