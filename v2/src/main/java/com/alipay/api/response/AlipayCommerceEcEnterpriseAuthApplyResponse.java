package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.ec.enterprise.auth.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-16 20:21:37
 */
public class AlipayCommerceEcEnterpriseAuthApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7469248284273643591L;

	/** 
	 * 企业认证申请记录ID
	 */
	@ApiField("auth_apply_id")
	private String authApplyId;

	public void setAuthApplyId(String authApplyId) {
		this.authApplyId = authApplyId;
	}
	public String getAuthApplyId( ) {
		return this.authApplyId;
	}

}
