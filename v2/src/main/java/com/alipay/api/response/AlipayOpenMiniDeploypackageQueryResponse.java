package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.deploypackage.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 08:56:39
 */
public class AlipayOpenMiniDeploypackageQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6125535784945115852L;

	/** 
	 * 包数据
	 */
	@ApiField("pack_json")
	private String packJson;

	public void setPackJson(String packJson) {
		this.packJson = packJson;
	}
	public String getPackJson( ) {
		return this.packJson;
	}

}
