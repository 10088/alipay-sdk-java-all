package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.renthouse.renter.idinfo.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-05 10:44:22
 */
public class AlipayEcoRenthouseRenterIdinfoQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6154776793631363784L;

	/** 
	 * 状态值（已授权、未授权、未知）
	 */
	@ApiField("status_value")
	private String statusValue;

	public void setStatusValue(String statusValue) {
		this.statusValue = statusValue;
	}
	public String getStatusValue( ) {
		return this.statusValue;
	}

}
