package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.FulfillmentResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.ep.scene.fulfillmentlist.sync response.
 * 
 * @author auto create
 * @since 1.0, 2021-03-30 16:59:48
 */
public class ZhimaCreditEpSceneFulfillmentlistSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 3124295196869617863L;

	/** 
	 * 履约同步结果列表
	 */
	@ApiListField("fulfillment_result_list")
	@ApiField("fulfillment_result")
	private List<FulfillmentResult> fulfillmentResultList;

	public void setFulfillmentResultList(List<FulfillmentResult> fulfillmentResultList) {
		this.fulfillmentResultList = fulfillmentResultList;
	}
	public List<FulfillmentResult> getFulfillmentResultList( ) {
		return this.fulfillmentResultList;
	}

}
