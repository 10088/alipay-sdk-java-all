package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.campus.examine.query response.
 * 
 * @author auto create
 * @since 1.0, 2021-12-21 23:00:14
 */
public class AlipayCommerceEducateCampusExamineQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8724878762294563221L;

	/** 
	 * 审核未通过原因
	 */
	@ApiField("reason")
	private String reason;

	/** 
	 * 审核状态
	 */
	@ApiField("status")
	private String status;

	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getReason( ) {
		return this.reason;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	public String getStatus( ) {
		return this.status;
	}

}
