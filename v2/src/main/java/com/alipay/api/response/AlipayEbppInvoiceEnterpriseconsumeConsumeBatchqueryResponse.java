package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ExpenseConsumeInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.enterpriseconsume.consume.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-04 23:25:17
 */
public class AlipayEbppInvoiceEnterpriseconsumeConsumeBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5527416922416996445L;

	/** 
	 * 企业查询到的员工账单列表
	 */
	@ApiListField("expense_consume_info_list")
	@ApiField("expense_consume_info")
	private List<ExpenseConsumeInfo> expenseConsumeInfoList;

	public void setExpenseConsumeInfoList(List<ExpenseConsumeInfo> expenseConsumeInfoList) {
		this.expenseConsumeInfoList = expenseConsumeInfoList;
	}
	public List<ExpenseConsumeInfo> getExpenseConsumeInfoList( ) {
		return this.expenseConsumeInfoList;
	}

}
