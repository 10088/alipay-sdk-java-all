package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.ocr.idcard.identify response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-04 22:13:19
 */
public class AntOcrIdcardIdentifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3778682137636875362L;

	/** 
	 * 识别结果
	 */
	@ApiField("result")
	private String result;

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

}
