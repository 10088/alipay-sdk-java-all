package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.public.message.group response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-05 09:59:30
 */
public class AlipayMobilePublicMessageGroupResponse extends AlipayResponse {

	private static final long serialVersionUID = 7886722273468442283L;

	/** 
	 * code
	 */
	@ApiField("code")
	private String code;

	/** 
	 * 消息ID
	 */
	@ApiField("data")
	private String data;

	/** 
	 * 结果描述
	 */
	@ApiField("msg")
	private String msg;

	public void setCode(String code) {
		this.code = code;
	}
	public String getCode( ) {
		return this.code;
	}

	public void setData(String data) {
		this.data = data;
	}
	public String getData( ) {
		return this.data;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getMsg( ) {
		return this.msg;
	}

}
