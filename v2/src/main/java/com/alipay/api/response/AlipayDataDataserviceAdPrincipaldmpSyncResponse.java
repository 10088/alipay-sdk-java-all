package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.ad.principaldmp.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-04 22:29:19
 */
public class AlipayDataDataserviceAdPrincipaldmpSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 8666357419847635914L;

	/** 
	 * 关联结果：true-成功；false-失败
	 */
	@ApiField("result")
	private Boolean result;

	public void setResult(Boolean result) {
		this.result = result;
	}
	public Boolean getResult( ) {
		return this.result;
	}

}
