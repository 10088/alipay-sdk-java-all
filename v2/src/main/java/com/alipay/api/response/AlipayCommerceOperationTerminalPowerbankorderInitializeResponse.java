package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.terminal.powerbankorder.initialize response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-05 01:01:38
 */
public class AlipayCommerceOperationTerminalPowerbankorderInitializeResponse extends AlipayResponse {

	private static final long serialVersionUID = 3156865656953798223L;

	/** 
	 * 同步订单记录初始化后返回的唯一Id。
	 */
	@ApiField("record_id")
	private String recordId;

	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}
	public String getRecordId( ) {
		return this.recordId;
	}

}
