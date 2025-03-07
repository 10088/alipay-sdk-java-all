package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.scene.agreement.use response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-04 18:14:25
 */
public class ZhimaCreditEpSceneAgreementUseResponse extends AlipayResponse {

	private static final long serialVersionUID = 4532889561363461419L;

	/** 
	 * 信用订单号
	 */
	@ApiField("credit_order_no")
	private String creditOrderNo;

	public void setCreditOrderNo(String creditOrderNo) {
		this.creditOrderNo = creditOrderNo;
	}
	public String getCreditOrderNo( ) {
		return this.creditOrderNo;
	}

}
