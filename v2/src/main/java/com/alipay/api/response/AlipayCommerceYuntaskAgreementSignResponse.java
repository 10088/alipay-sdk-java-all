package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.yuntask.agreement.sign response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 00:52:49
 */
public class AlipayCommerceYuntaskAgreementSignResponse extends AlipayResponse {

	private static final long serialVersionUID = 6654258644574479884L;

	/** 
	 * 响应为表单格式，可嵌入页面，具体以返回的结果为准
	 */
	@ApiField("form_data")
	private String formData;

	public void setFormData(String formData) {
		this.formData = formData;
	}
	public String getFormData( ) {
		return this.formData;
	}

}
