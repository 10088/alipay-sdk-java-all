package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.transfer.payment.notify response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 06:37:25
 */
public class AlipayOverseasTransferPaymentNotifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 5367786822575847244L;

	/** 
	 * 扩展字段
	 */
	@ApiField("pass_through_info")
	private String passThroughInfo;

	public void setPassThroughInfo(String passThroughInfo) {
		this.passThroughInfo = passThroughInfo;
	}
	public String getPassThroughInfo( ) {
		return this.passThroughInfo;
	}

}
