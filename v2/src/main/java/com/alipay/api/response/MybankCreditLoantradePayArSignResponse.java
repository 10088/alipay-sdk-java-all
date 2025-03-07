package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.loantrade.pay.ar.sign response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-12 14:24:25
 */
public class MybankCreditLoantradePayArSignResponse extends AlipayResponse {

	private static final long serialVersionUID = 7187445331565414916L;

	/** 
	 * 错误码，表示请求失败出错
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 引导模型，是一个JSON形式字符串，内部key是引导key，value是引导内容。另外根据key的不同，引导内容本身也是一个JSON形式的字符串或者是一个普通的字符串
	 */
	@ApiField("guide_param")
	private String guideParam;

	/** 
	 * 签约拒绝码，表示政策或者其它原因不准入，相比于error_code，拒绝码更加动态，原因多变
	 */
	@ApiField("refuse_code")
	private String refuseCode;

	/** 
	 * 签约结果，合约类型-合约号，不涉及敏感信息
	 */
	@ApiField("signed_ar")
	private String signedAr;

	/** 
	 * 是否签约成功
	 */
	@ApiField("success")
	private Boolean success;

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorCode( ) {
		return this.errorCode;
	}

	public void setGuideParam(String guideParam) {
		this.guideParam = guideParam;
	}
	public String getGuideParam( ) {
		return this.guideParam;
	}

	public void setRefuseCode(String refuseCode) {
		this.refuseCode = refuseCode;
	}
	public String getRefuseCode( ) {
		return this.refuseCode;
	}

	public void setSignedAr(String signedAr) {
		this.signedAr = signedAr;
	}
	public String getSignedAr( ) {
		return this.signedAr;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
