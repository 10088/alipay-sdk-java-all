package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.PayModeModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.pos.paymode.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 03:20:33
 */
public class KoubeiCateringPosPaymodeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3362389163372284553L;

	/** 
	 * 支付方式列表
	 */
	@ApiListField("pay_mode_model_list")
	@ApiField("pay_mode_model")
	private List<PayModeModel> payModeModelList;

	public void setPayModeModelList(List<PayModeModel> payModeModelList) {
		this.payModeModelList = payModeModelList;
	}
	public List<PayModeModel> getPayModeModelList( ) {
		return this.payModeModelList;
	}

}
