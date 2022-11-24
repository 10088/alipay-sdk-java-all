package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ActivityGoods;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.security.data.sss.modify response.
 * 
 * @author auto create
 * @since 1.0, 2022-11-23 16:36:36
 */
public class AlipaySecurityDataSssModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 7295558367636752214L;

	/** 
	 * 复杂类型
	 */
	@ApiField("dff")
	private ActivityGoods dff;

	/** 
	 * 323
	 */
	@ApiField("kjkj")
	private String kjkj;

	public void setDff(ActivityGoods dff) {
		this.dff = dff;
	}
	public ActivityGoods getDff( ) {
		return this.dff;
	}

	public void setKjkj(String kjkj) {
		this.kjkj = kjkj;
	}
	public String getKjkj( ) {
		return this.kjkj;
	}

}
