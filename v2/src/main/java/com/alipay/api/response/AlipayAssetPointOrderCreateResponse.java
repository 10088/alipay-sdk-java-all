package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.asset.point.order.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-04 21:33:11
 */
public class AlipayAssetPointOrderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4493714194349915256L;

	/** 
	 * 支付宝集分宝发放流水号
	 */
	@ApiField("alipay_order_no")
	private String alipayOrderNo;

	public void setAlipayOrderNo(String alipayOrderNo) {
		this.alipayOrderNo = alipayOrderNo;
	}
	public String getAlipayOrderNo( ) {
		return this.alipayOrderNo;
	}

}
