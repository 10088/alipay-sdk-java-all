package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.inspetprod.subscribe.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-07 17:41:15
 */
public class AlipayInsSceneInspetprodSubscribeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6194579277729371737L;

	/** 
	 * 是否订阅公众号
	 */
	@ApiField("subscribe")
	private Boolean subscribe;

	public void setSubscribe(Boolean subscribe) {
		this.subscribe = subscribe;
	}
	public Boolean getSubscribe( ) {
		return this.subscribe;
	}

}
