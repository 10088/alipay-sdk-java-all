package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.sports.venue.order.confirm response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 00:22:44
 */
public class AlipayCommerceSportsVenueOrderConfirmResponse extends AlipayResponse {

	private static final long serialVersionUID = 4744651166265687813L;

	/** 
	 * 支付宝业务订单唯一ID
	 */
	@ApiField("order_id")
	private String orderId;

	/** 
	 * 订单状态
pay_proc - 待支付
pay_succ - 已支付
refund_succ - 已退款
closed - 已关闭
	 */
	@ApiField("order_status")
	private String orderStatus;

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getOrderId( ) {
		return this.orderId;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public String getOrderStatus( ) {
		return this.orderStatus;
	}

}
