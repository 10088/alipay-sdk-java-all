package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.financialnet.auth.pbcname.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 01:41:45
 */
public class AlipayFinancialnetAuthPbcnameQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6145471428985772364L;

	/** 
	 * 联行号查询结果
	 */
	@ApiField("pbc_query_result")
	private String pbcQueryResult;

	public void setPbcQueryResult(String pbcQueryResult) {
		this.pbcQueryResult = pbcQueryResult;
	}
	public String getPbcQueryResult( ) {
		return this.pbcQueryResult;
	}

}
