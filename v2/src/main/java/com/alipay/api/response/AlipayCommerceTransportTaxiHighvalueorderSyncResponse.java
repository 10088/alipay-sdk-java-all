package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.taxi.highvalueorder.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 02:41:40
 */
public class AlipayCommerceTransportTaxiHighvalueorderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 2523836611699271642L;

	/** 
	 * 状态码
	 */
	@ApiField("error_code")
	private String errorCode;

	/** 
	 * 状态描述
	 */
	@ApiField("error_msg")
	private String errorMsg;

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	public String getErrorCode( ) {
		return this.errorCode;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
	public String getErrorMsg( ) {
		return this.errorMsg;
	}

}
