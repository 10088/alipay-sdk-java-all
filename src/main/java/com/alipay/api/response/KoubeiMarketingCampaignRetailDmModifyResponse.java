package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.retail.dm.modify response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 04:33:11
 */
public class KoubeiMarketingCampaignRetailDmModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3513828614792791363L;

	/** 
	 * 内容id：该活动/商品入库成功之后，会将该活动/商品的id返回，作为商品/活动的内容id
	 */
	@ApiField("content_id")
	private String contentId;

	public void setContentId(String contentId) {
		this.contentId = contentId;
	}
	public String getContentId( ) {
		return this.contentId;
	}

}
