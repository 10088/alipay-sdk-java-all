package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.invoice.statementbill.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 05:31:47
 */
public class AlipayBossFncInvoiceStatementbillApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4768999487765894219L;

	/** 
	 * 开票申请ID，唯一性ID
	 */
	@ApiField("result_set")
	private String resultSet;

	public void setResultSet(String resultSet) {
		this.resultSet = resultSet;
	}
	public String getResultSet( ) {
		return this.resultSet;
	}

}
