package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.campaign.commonevent.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 06:09:53
 */
public class AlipayMarketingCampaignCommoneventApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3527875566376784746L;

	/** 
	 * 与event关联的返回结果
	 */
	@ApiField("data")
	private String data;

	public void setData(String data) {
		this.data = data;
	}
	public String getData( ) {
		return this.data;
	}

}
