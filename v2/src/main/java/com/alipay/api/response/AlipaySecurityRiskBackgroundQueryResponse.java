package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.risk.background.query response.
 * 
 * @author auto create
 * @since 1.0, 2020-02-01 11:36:03
 */
public class AlipaySecurityRiskBackgroundQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2673656291936685781L;

	/** 
	 * 背景详细信息：查询到的人物背景信息，包括学历信息、是否涉及诉讼、商业冲突等。
	 */
	@ApiField("detail_info")
	private String detailInfo;

	public void setDetailInfo(String detailInfo) {
		this.detailInfo = detailInfo;
	}
	public String getDetailInfo( ) {
		return this.detailInfo;
	}

}
