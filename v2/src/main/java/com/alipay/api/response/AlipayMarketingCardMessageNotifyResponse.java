package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.card.message.notify response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-04 20:16:40
 */
public class AlipayMarketingCardMessageNotifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3578829578352226247L;

	/** 
	 * 二级错误处理结果（如果公用返回结果为false，则可以看这个接口判断明细原因） 如果公用返回为true，则该字段为空
	 */
	@ApiField("result_code")
	private String resultCode;

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

}
