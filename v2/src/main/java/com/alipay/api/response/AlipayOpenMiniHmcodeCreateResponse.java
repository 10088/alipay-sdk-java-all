package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.hmcode.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-04 18:50:47
 */
public class AlipayOpenMiniHmcodeCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 1151189277615742268L;

	/** 
	 * 异形码图片链接地址
	 */
	@ApiField("hm_code_url")
	private String hmCodeUrl;

	public void setHmCodeUrl(String hmCodeUrl) {
		this.hmCodeUrl = hmCodeUrl;
	}
	public String getHmCodeUrl( ) {
		return this.hmCodeUrl;
	}

}
