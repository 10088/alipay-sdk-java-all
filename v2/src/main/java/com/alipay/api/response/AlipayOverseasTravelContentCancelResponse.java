package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.travel.content.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-05 10:36:33
 */
public class AlipayOverseasTravelContentCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 7112285882366771139L;

	/** 
	 * 结果描述，仅当撤回已处于撤回状态的内容，且请求中的modified_date等于已落地内容的modified_date，认为幂等成功，返回Success
	 */
	@ApiField("result_msg")
	private String resultMsg;

	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
	public String getResultMsg( ) {
		return this.resultMsg;
	}

}
