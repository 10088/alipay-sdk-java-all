package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.instservice.order.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 01:56:42
 */
public class AlipayEbppInstserviceOrderCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 8149217214328942153L;

	/** 
	 * 机构传入的流水号
	 */
	@ApiField("flow_id")
	private String flowId;

	/** 
	 * 落地结果
	 */
	@ApiField("result")
	private String result;

	public void setFlowId(String flowId) {
		this.flowId = flowId;
	}
	public String getFlowId( ) {
		return this.flowId;
	}

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

}
