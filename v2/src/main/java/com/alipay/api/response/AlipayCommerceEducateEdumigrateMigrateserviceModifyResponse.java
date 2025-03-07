package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.edumigrate.migrateservice.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 00:24:39
 */
public class AlipayCommerceEducateEdumigrateMigrateserviceModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 2482354321628435323L;

	/** 
	 * data字段为迁移服务数据返回 JSON结构
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
