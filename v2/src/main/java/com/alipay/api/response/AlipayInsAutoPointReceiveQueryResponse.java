package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.auto.point.receive.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-10 20:49:09
 */
public class AlipayInsAutoPointReceiveQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7868341891574545831L;

	/** 
	 * 本次可攒积分。
例如，攒油活动，返回本次可攒油量，单位ml
	 */
	@ApiField("save_amount")
	private Long saveAmount;

	public void setSaveAmount(Long saveAmount) {
		this.saveAmount = saveAmount;
	}
	public Long getSaveAmount( ) {
		return this.saveAmount;
	}

}
