package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.parking.goods.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-10 23:00:23
 */
public class AlipayCommerceTransportParkingGoodsModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 3431636886539347958L;

	/** 
	 * 支付宝商品唯一ID
	 */
	@ApiField("goods_id")
	private String goodsId;

	/** 
	 * isv内部产生商品ID(goods_id和out_id不能同时为空)
	 */
	@ApiField("out_id")
	private String outId;

	public void setGoodsId(String goodsId) {
		this.goodsId = goodsId;
	}
	public String getGoodsId( ) {
		return this.goodsId;
	}

	public void setOutId(String outId) {
		this.outId = outId;
	}
	public String getOutId( ) {
		return this.outId;
	}

}
