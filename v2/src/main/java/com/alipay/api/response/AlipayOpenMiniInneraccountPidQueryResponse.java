package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.inneraccount.pid.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-05 10:39:31
 */
public class AlipayOpenMiniInneraccountPidQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7131782255286818812L;

	/** 
	 * 虚拟PID
	 */
	@ApiField("pid")
	private String pid;

	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getPid( ) {
		return this.pid;
	}

}
