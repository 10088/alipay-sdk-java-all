package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.dish.virtualcategory.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 07:29:14
 */
public class KoubeiCateringDishVirtualcategorySyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5788782678828393191L;

	/** 
	 * 是否需要重试，true：需要重试；false：不需要
	 */
	@ApiField("retry")
	private Boolean retry;

	public void setRetry(Boolean retry) {
		this.retry = retry;
	}
	public Boolean getRetry( ) {
		return this.retry;
	}

}
