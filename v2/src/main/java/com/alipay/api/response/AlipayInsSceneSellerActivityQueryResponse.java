package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InsSellerActivity;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.seller.activity.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 03:52:15
 */
public class AlipayInsSceneSellerActivityQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3651352165398251394L;

	/** 
	 * 关于签约查询结果的告知
	 */
	@ApiField("ins_seller_activity")
	private InsSellerActivity insSellerActivity;

	public void setInsSellerActivity(InsSellerActivity insSellerActivity) {
		this.insSellerActivity = insSellerActivity;
	}
	public InsSellerActivity getInsSellerActivity( ) {
		return this.insSellerActivity;
	}

}
