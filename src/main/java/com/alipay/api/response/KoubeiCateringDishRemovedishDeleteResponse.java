package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.dish.removedish.delete response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 01:23:53
 */
public class KoubeiCateringDishRemovedishDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 1616366648469615328L;

	/** 
	 * 失败是否需要重试，true：需要重试；false：不需要重试。
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
