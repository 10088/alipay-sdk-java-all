package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.PointRankingInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.promoter.ranking.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-04 23:07:11
 */
public class AlipayCommerceOperationPromoterRankingQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1376432859953747449L;

	/** 
	 * 排名信息
	 */
	@ApiField("ranking_info")
	private PointRankingInfo rankingInfo;

	public void setRankingInfo(PointRankingInfo rankingInfo) {
		this.rankingInfo = rankingInfo;
	}
	public PointRankingInfo getRankingInfo( ) {
		return this.rankingInfo;
	}

}
