package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.InvoiceQueryOpenModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.invoice.info.applyid.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 09:21:41
 */
public class AlipayEbppInvoiceInfoApplyidQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5285134657728684464L;

	/** 
	 * 发票信息
	 */
	@ApiListField("invoice_info")
	@ApiField("invoice_query_open_model")
	private List<InvoiceQueryOpenModel> invoiceInfo;

	public void setInvoiceInfo(List<InvoiceQueryOpenModel> invoiceInfo) {
		this.invoiceInfo = invoiceInfo;
	}
	public List<InvoiceQueryOpenModel> getInvoiceInfo( ) {
		return this.invoiceInfo;
	}

}
