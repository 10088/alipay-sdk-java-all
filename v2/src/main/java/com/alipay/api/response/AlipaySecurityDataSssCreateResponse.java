package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.data.sss.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-31 18:36:38
 */
public class AlipaySecurityDataSssCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1776995331913188925L;

	/** 
	 * 区
	 */
	@ApiField("c")
	private String c;

	/** 
	 * 区
	 */
	@ApiField("c_open_id")
	private String cOpenId;

	public void setC(String c) {
		this.c = c;
	}
	public String getC( ) {
		return this.c;
	}

	public void setcOpenId(String cOpenId) {
		this.cOpenId = cOpenId;
	}
	public String getcOpenId( ) {
		return this.cOpenId;
	}

}
