package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.itask.process.detail.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 04:28:19
 */
public class AlipayIserviceItaskProcessDetailSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 3447355965157742353L;

	/** 
	 * 蚂蚁工单编号
	 */
	@ApiField("alipay_process_id")
	private String alipayProcessId;

	public void setAlipayProcessId(String alipayProcessId) {
		this.alipayProcessId = alipayProcessId;
	}
	public String getAlipayProcessId( ) {
		return this.alipayProcessId;
	}

}
