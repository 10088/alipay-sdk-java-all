package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.terminal.powerbank.create response.
 * 
 * @author auto create
 * @since 1.0, 2021-08-20 13:06:29
 */
public class AlipayCommerceTerminalPowerbankCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3523632412482187293L;

	/** 
	 * 同步订单记录初始化后返回的唯一Id,后续用于订单状态更新
	 */
	@ApiField("terminal_id")
	private String terminalId;

	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}
	public String getTerminalId( ) {
		return this.terminalId;
	}

}
