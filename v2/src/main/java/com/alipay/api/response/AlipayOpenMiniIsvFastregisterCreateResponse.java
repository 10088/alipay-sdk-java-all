package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.isv.fastregister.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-04 21:26:38
 */
public class AlipayOpenMiniIsvFastregisterCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3898882314114143412L;

	/** 
	 * 授权确认跳转url
	 */
	@ApiField("authorize_url")
	private String authorizeUrl;

	/** 
	 * 代创建试用小程序单号
	 */
	@ApiField("order_no")
	private String orderNo;

	public void setAuthorizeUrl(String authorizeUrl) {
		this.authorizeUrl = authorizeUrl;
	}
	public String getAuthorizeUrl( ) {
		return this.authorizeUrl;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
	public String getOrderNo( ) {
		return this.orderNo;
	}

}
