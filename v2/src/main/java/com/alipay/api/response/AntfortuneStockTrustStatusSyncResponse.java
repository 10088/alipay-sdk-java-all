package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: antfortune.stock.trust.status.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 07:52:35
 */
public class AntfortuneStockTrustStatusSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 5652783676879831948L;

	/** 
	 * traceId，用来唯一定位某次调用，方便问题排查
	 */
	@ApiField("trace_id")
	private String traceId;

	public void setTraceId(String traceId) {
		this.traceId = traceId;
	}
	public String getTraceId( ) {
		return this.traceId;
	}

}
