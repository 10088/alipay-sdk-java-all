package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.open.app.risktag.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 08:23:22
 */
public class ZhimaOpenAppRisktagQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5847955489316618731L;

	/** 
	 * 响应参数
	 */
	@ApiField("resp")
	private String resp;

	public void setResp(String resp) {
		this.resp = resp;
	}
	public String getResp( ) {
		return this.resp;
	}

}
