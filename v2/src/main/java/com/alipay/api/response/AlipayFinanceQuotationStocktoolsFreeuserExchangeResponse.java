package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.finance.quotation.stocktools.freeuser.exchange response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 02:56:37
 */
public class AlipayFinanceQuotationStocktoolsFreeuserExchangeResponse extends AlipayResponse {

	private static final long serialVersionUID = 3516834374139617651L;

	/** 
	 * 领取成功/失败，此处为false时，或者接口本身报错时，均意味着失败
	 */
	@ApiField("result")
	private Boolean result;

	public void setResult(Boolean result) {
		this.result = result;
	}
	public Boolean getResult( ) {
		return this.result;
	}

}
