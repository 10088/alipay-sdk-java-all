package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ebpp.instservice.signresult.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-24 16:46:37
 */
public class AlipayEbppInstserviceSignresultBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6213891537636837955L;

	/** 
	 * json格式用户签约信息；格式：{"字段名":"字段值"}
	 */
	@ApiField("list")
	private String list;

	public void setList(String list) {
		this.list = list;
	}
	public String getList( ) {
		return this.list;
	}

}
