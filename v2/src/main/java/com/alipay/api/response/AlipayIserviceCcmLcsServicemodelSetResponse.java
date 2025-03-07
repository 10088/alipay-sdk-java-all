package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.ccm.lcs.servicemodel.set response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-04 21:11:38
 */
public class AlipayIserviceCcmLcsServicemodelSetResponse extends AlipayResponse {

	private static final long serialVersionUID = 4467614855299239245L;

	/** 
	 * 操作返回结果
	 */
	@ApiField("success")
	private Boolean success;

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
