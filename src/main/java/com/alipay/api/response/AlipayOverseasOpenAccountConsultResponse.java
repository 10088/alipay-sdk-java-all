package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.TuitionISVResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.open.account.consult response.
 * 
 * @author auto create
 * @since 1.0, 2021-07-13 15:44:08
 */
public class AlipayOverseasOpenAccountConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 3747741131496191252L;

	/** 
	 * 账号
	 */
	@ApiField("account_id")
	private String accountId;

	/** 
	 * isv请求结果
	 */
	@ApiField("result")
	private TuitionISVResult result;

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}
	public String getAccountId( ) {
		return this.accountId;
	}

	public void setResult(TuitionISVResult result) {
		this.result = result;
	}
	public TuitionISVResult getResult( ) {
		return this.result;
	}

}
