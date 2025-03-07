package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 活动内容信息。主要包含商家券与支付券活动。
 *
 * @author auto create
 * @since 1.0, 2022-11-24 17:51:28
 */
public class DeliveryActivityContentInfo extends AlipayObject {

	private static final long serialVersionUID = 6664211426331758362L;

	/**
	 * 活动id。

说明：
通过 alipay.marketing.activity.voucher.create 创建的支付券活动。 
通过alipay.marketing.activity.ordervoucher.create 创建的导码模式的商家券活动。
	 */
	@ApiField("activity_id")
	private String activityId;

	public String getActivityId() {
		return this.activityId;
	}
	public void setActivityId(String activityId) {
		this.activityId = activityId;
	}

}
