package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.schoolcard.order.sync response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-16 17:21:38
 */
public class AlipayCommerceEducateSchoolcardOrderSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5331447325882958282L;

	/** 
	 * 订单号
	 */
	@ApiField("order_id")
	private String orderId;

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

}
