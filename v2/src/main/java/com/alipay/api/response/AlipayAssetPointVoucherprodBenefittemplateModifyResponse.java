package com.alipay.api.response;

import java.util.Date;
import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.asset.point.voucherprod.benefittemplate.modify response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 00:15:57
 */
public class AlipayAssetPointVoucherprodBenefittemplateModifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6774852396931972759L;

	/** 
	 * 修改后模版的过期时间
	 */
	@ApiField("publish_end_time")
	private Date publishEndTime;

	public void setPublishEndTime(Date publishEndTime) {
		this.publishEndTime = publishEndTime;
	}
	public Date getPublishEndTime( ) {
		return this.publishEndTime;
	}

}
