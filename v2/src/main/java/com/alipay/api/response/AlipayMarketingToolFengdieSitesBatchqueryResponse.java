package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.FengdieSitesListRespModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.tool.fengdie.sites.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-07 17:17:50
 */
public class AlipayMarketingToolFengdieSitesBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6282445553849787675L;

	/** 
	 * 获取云凤蝶站点列表返回值模型
	 */
	@ApiField("data")
	private FengdieSitesListRespModel data;

	public void setData(FengdieSitesListRespModel data) {
		this.data = data;
	}
	public FengdieSitesListRespModel getData( ) {
		return this.data;
	}

}
