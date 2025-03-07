package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.activity.ordervoucher.settle response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-05 00:51:39
 */
public class AlipayMarketingActivityOrdervoucherSettleResponse extends AlipayResponse {

	private static final long serialVersionUID = 7281172169442699994L;

	/** 
	 * 用于查询结算单号
	 */
	@ApiField("settle_no")
	private String settleNo;

	public void setSettleNo(String settleNo) {
		this.settleNo = settleNo;
	}
	public String getSettleNo( ) {
		return this.settleNo;
	}

}
