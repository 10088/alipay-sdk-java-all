package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.customer.jobworth.scene.use response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-04 19:28:24
 */
public class ZhimaCustomerJobworthSceneUseResponse extends AlipayResponse {

	private static final long serialVersionUID = 6587311293815659743L;

	/** 
	 * 业务编码
	 */
	@ApiField("sub_code")
	private String subCode;

	/** 
	 * 业务中文结果信息
	 */
	@ApiField("sub_msg")
	private String subMsg;

	public void setSubCode(String subCode) {
		this.subCode = subCode;
	}
	public String getSubCode( ) {
		return this.subCode;
	}

	public void setSubMsg(String subMsg) {
		this.subMsg = subMsg;
	}
	public String getSubMsg( ) {
		return this.subMsg;
	}

}
