package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.lottery.camp.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-10 22:53:24
 */
public class AlipayOpenLotteryCampBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4642953846413691617L;

	/** 
	 * 抽奖活动搜索列表
	 */
	@ApiField("data")
	private String data;

	public void setData(String data) {
		this.data = data;
	}
	public String getData( ) {
		return this.data;
	}

}
