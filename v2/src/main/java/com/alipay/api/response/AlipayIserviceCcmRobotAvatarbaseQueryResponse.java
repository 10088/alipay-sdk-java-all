package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.ccm.robot.avatarbase.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-05 00:46:42
 */
public class AlipayIserviceCcmRobotAvatarbaseQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5585151544437982225L;

	/** 
	 * result:方法调用返回值响应 k-v map
	 */
	@ApiField("result")
	private String result;

	public void setResult(String result) {
		this.result = result;
	}
	public String getResult( ) {
		return this.result;
	}

}
