package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.InsPreOrderDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.scene.ecommerce.preorderquote.consult response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-04 20:01:44
 */
public class AlipayInsSceneEcommercePreorderquoteConsultResponse extends AlipayResponse {

	private static final long serialVersionUID = 6155964973789586923L;

	/** 
	 * 预下单数据及最新报价
	 */
	@ApiField("pre_order")
	private InsPreOrderDTO preOrder;

	public void setPreOrder(InsPreOrderDTO preOrder) {
		this.preOrder = preOrder;
	}
	public InsPreOrderDTO getPreOrder( ) {
		return this.preOrder;
	}

}
