package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.iservice.ccm.sw.spu.sync response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-04 20:21:41
 */
public class AlipayIserviceCcmSwSpuSyncResponse extends AlipayResponse {

	private static final long serialVersionUID = 3469132729522937692L;

	/** 
	 * 商品id
	 */
	@ApiField("spu_id")
	private String spuId;

	public void setSpuId(String spuId) {
		this.spuId = spuId;
	}
	public String getSpuId( ) {
		return this.spuId;
	}

}
