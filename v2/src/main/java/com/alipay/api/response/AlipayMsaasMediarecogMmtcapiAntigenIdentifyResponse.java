package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.msaas.mediarecog.mmtcapi.antigen.identify response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 08:51:44
 */
public class AlipayMsaasMediarecogMmtcapiAntigenIdentifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8368128516729224572L;

	/** 
	 * 算法返回结果，json字符串，无敏感信息
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
