package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.advertiser.material.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-10 22:24:25
 */
public class AlipayCommerceIotAdvertiserMaterialCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2625763197767258531L;

	/** 
	 * 物料id
	 */
	@ApiField("id")
	private Long id;

	/** 
	 * 物料http地址
	 */
	@ApiField("material_url")
	private String materialUrl;

	public void setId(Long id) {
		this.id = id;
	}
	public Long getId( ) {
		return this.id;
	}

	public void setMaterialUrl(String materialUrl) {
		this.materialUrl = materialUrl;
	}
	public String getMaterialUrl( ) {
		return this.materialUrl;
	}

}
