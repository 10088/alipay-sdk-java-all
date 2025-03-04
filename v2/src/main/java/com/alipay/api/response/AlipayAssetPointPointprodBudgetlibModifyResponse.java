package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.asset.point.pointprod.budgetlib.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-10 22:25:13
 */
public class AlipayAssetPointPointprodBudgetlibModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4488661531936793691L;

	/** 
	 * 预算库有效期修改失败时的错误信息
	 */
	@ApiField("message")
	private String message;

	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessage( ) {
		return this.message;
	}

}
