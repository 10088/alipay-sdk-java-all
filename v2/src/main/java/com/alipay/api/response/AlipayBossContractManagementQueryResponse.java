package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ContractBatchInfoOpenApiResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.contract.management.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 05:38:45
 */
public class AlipayBossContractManagementQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1796235762734713738L;

	/** 
	 * 查询结果
	 */
	@ApiField("result_set")
	private ContractBatchInfoOpenApiResult resultSet;

	public void setResultSet(ContractBatchInfoOpenApiResult resultSet) {
		this.resultSet = resultSet;
	}
	public ContractBatchInfoOpenApiResult getResultSet( ) {
		return this.resultSet;
	}

}
