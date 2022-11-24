package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AlgorithmGoodsInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.msaas.mediarecog.mmtcaftscv.goodsinfo.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2022-09-26 11:18:09
 */
public class AlipayMsaasMediarecogMmtcaftscvGoodsinfoBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5553347665261739872L;

	/** 
	 * 商品信息列表
	 */
	@ApiListField("goods_infos")
	@ApiField("algorithm_goods_info")
	private List<AlgorithmGoodsInfo> goodsInfos;

	public void setGoodsInfos(List<AlgorithmGoodsInfo> goodsInfos) {
		this.goodsInfos = goodsInfos;
	}
	public List<AlgorithmGoodsInfo> getGoodsInfos( ) {
		return this.goodsInfos;
	}

}
