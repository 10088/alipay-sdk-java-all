package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: datadigital.fincloud.finsaas.putplan.pause response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 01:24:42
 */
public class DatadigitalFincloudFinsaasPutplanPauseResponse extends AlipayResponse {

	private static final long serialVersionUID = 7245996777397719277L;

	/** 
	 * 描述信息
	 */
	@ApiField("message")
	private String message;

	/** 
	 * 暂停操作结果
	 */
	@ApiField("result")
	private Boolean result;

	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessage( ) {
		return this.message;
	}

	public void setResult(Boolean result) {
		this.result = result;
	}
	public Boolean getResult( ) {
		return this.result;
	}

}
