package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.search.box.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-05 00:47:29
 */
public class AlipayOpenSearchBoxApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3377741219374549168L;

	/** 
	 * 搜索直达配置id
	 */
	@ApiField("box_id")
	private String boxId;

	public void setBoxId(String boxId) {
		this.boxId = boxId;
	}
	public String getBoxId( ) {
		return this.boxId;
	}

}
