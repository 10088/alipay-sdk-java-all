package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MActivityDetailInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.marketing.campaign.merchant.activity.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-05 11:22:51
 */
public class KoubeiMarketingCampaignMerchantActivityBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6685714251374142732L;

	/** 
	 * 活动详细信息
	 */
	@ApiListField("activity_detail_info_list")
	@ApiField("m_activity_detail_info")
	private List<MActivityDetailInfo> activityDetailInfoList;

	public void setActivityDetailInfoList(List<MActivityDetailInfo> activityDetailInfoList) {
		this.activityDetailInfoList = activityDetailInfoList;
	}
	public List<MActivityDetailInfo> getActivityDetailInfoList( ) {
		return this.activityDetailInfoList;
	}

}
