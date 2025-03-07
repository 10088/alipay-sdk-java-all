package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.advertising.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 03:53:03
 */
public class KoubeiMarketingAdvertisingModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8656398628793642485L;

	/** 
	 * 正常操作返回当前操作的广告id。如果操作失败，返回的广告id为空
	 */
	@ApiField("ad_id")
	private String adId;

	public void setAdId(String adId) {
		this.adId = adId;
	}
	public String getAdId( ) {
		return this.adId;
	}

}
