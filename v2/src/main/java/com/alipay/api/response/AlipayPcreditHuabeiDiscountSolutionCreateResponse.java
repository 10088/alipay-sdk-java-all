package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.discount.solution.create response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-07 17:59:25
 */
public class AlipayPcreditHuabeiDiscountSolutionCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4822761469757449748L;

	/** 
	 * solution_id，创建成功后返回的贴息活动方案id
	 */
	@ApiField("solution_id")
	private String solutionId;

	public void setSolutionId(String solutionId) {
		this.solutionId = solutionId;
	}
	public String getSolutionId( ) {
		return this.solutionId;
	}

}
