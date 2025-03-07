package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.pos.spec.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 04:36:20
 */
public class KoubeiCateringPosSpecSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 2682331421872123779L;

	/** 
	 * 返回ID
	 */
	@ApiField("id")
	private String id;

	public void setId(String id) {
		this.id = id;
	}
	public String getId( ) {
		return this.id;
	}

}
