package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InterTradeCompanyConsultOpenApiResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.related.company.consult response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 01:09:06
 */
public class AlipayBossRelatedCompanyConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 8455752275655884752L;

	/** 
	 * 关联交易公司甄别结果
	 */
	@ApiField("result_set")
	private InterTradeCompanyConsultOpenApiResult resultSet;

	public void setResultSet(InterTradeCompanyConsultOpenApiResult resultSet) {
		this.resultSet = resultSet;
	}
	public InterTradeCompanyConsultOpenApiResult getResultSet( ) {
		return this.resultSet;
	}

}
