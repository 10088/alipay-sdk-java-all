package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.PayForPrivilegePromotionPlanInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.merchant.payforprivilege.promotionplan.create response.
 * 
 * @author auto create
 * @since 1.0, 2021-08-18 10:15:50
 */
public class AlipayMerchantPayforprivilegePromotionplanCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4273616779325987197L;

	/** 
	 * 充值方案，当前接口创建的充值方案
	 */
	@ApiField("promotion_plan")
	private PayForPrivilegePromotionPlanInfo promotionPlan;

	public void setPromotionPlan(PayForPrivilegePromotionPlanInfo promotionPlan) {
		this.promotionPlan = promotionPlan;
	}
	public PayForPrivilegePromotionPlanInfo getPromotionPlan( ) {
		return this.promotionPlan;
	}

}
