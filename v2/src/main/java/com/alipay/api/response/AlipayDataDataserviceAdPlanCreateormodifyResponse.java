package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.ad.plan.createormodify response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-04 18:40:33
 */
public class AlipayDataDataserviceAdPlanCreateormodifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6353291494665416649L;

	/** 
	 * 计划id
	 */
	@ApiField("plan_id")
	private Long planId;

	/** 
	 * 外部计划编号。同入参的同名字段。
	 */
	@ApiField("plan_outer_id")
	private String planOuterId;

	public void setPlanId(Long planId) {
		this.planId = planId;
	}
	public Long getPlanId( ) {
		return this.planId;
	}

	public void setPlanOuterId(String planOuterId) {
		this.planOuterId = planOuterId;
	}
	public String getPlanOuterId( ) {
		return this.planOuterId;
	}

}
