package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.bpaas.contract.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 07:12:03
 */
public class AlipayOpenBpaasContractQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7896386415393896885L;

	/** 
	 * 签约状态
	 */
	@ApiField("status")
	private String status;

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
