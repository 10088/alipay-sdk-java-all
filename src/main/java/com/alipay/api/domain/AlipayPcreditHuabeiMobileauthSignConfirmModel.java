package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 芝麻GO签约确认服务
 *
 * @author auto create
 * @since 1.0, 2021-04-13 15:42:05
 */
public class AlipayPcreditHuabeiMobileauthSignConfirmModel extends AlipayObject {

	private static final long serialVersionUID = 4735492943663758736L;

	/**
	 * 请求参数
	 */
	@ApiField("request")
	private String request;

	public String getRequest() {
		return this.request;
	}
	public void setRequest(String request) {
		this.request = request;
	}

}
