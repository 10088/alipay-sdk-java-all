package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.operation.bizfee.aftech.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 05:45:11
 */
public class AlipayOpenOperationBizfeeAftechApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2163468699719374846L;

	/** 
	 * 结果码
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 结果信息
	 */
	@ApiField("result_message")
	private String resultMessage;

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}
	public String getResultMessage( ) {
		return this.resultMessage;
	}

}
