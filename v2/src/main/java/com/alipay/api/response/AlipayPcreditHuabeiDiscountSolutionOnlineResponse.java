package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.discount.solution.online response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-07 16:43:31
 */
public class AlipayPcreditHuabeiDiscountSolutionOnlineResponse extends AlipayResponse {

	private static final long serialVersionUID = 7734827556311171523L;

	/** 
	 * 贴息方案实例id
	 */
	@ApiField("solution_id")
	private String solutionId;

	/** 
	 * 贴息方案是否生效，true生效，false没有生效
	 */
	@ApiField("success")
	private Boolean success;

	public void setSolutionId(String solutionId) {
		this.solutionId = solutionId;
	}
	public String getSolutionId( ) {
		return this.solutionId;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
