package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.qipan.crowdwithtag.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-17 15:56:38
 */
public class AlipayMarketingQipanCrowdwithtagCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 6486545841689231389L;

	/** 
	 * 人群id
	 */
	@ApiField("crowd_id")
	private String crowdId;

	public void setCrowdId(String crowdId) {
		this.crowdId = crowdId;
	}
	public String getCrowdId( ) {
		return this.crowdId;
	}

}
