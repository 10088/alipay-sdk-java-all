package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: mybank.credit.supplychain.wf.openstatus.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 08:03:20
 */
public class MybankCreditSupplychainWfOpenstatusQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7731752982747199436L;

	/** 
	 * 开通状态
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
