package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.PointReceiveInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.operation.promoter.point.receive response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-04 23:02:14
 */
public class AlipayCommerceOperationPromoterPointReceiveResponse extends AlipayResponse {

	private static final long serialVersionUID = 8149537244546562651L;

	/** 
	 * 积分领取结果
	 */
	@ApiField("point_receive_result")
	private PointReceiveInfo pointReceiveResult;

	public void setPointReceiveResult(PointReceiveInfo pointReceiveResult) {
		this.pointReceiveResult = pointReceiveResult;
	}
	public PointReceiveInfo getPointReceiveResult( ) {
		return this.pointReceiveResult;
	}

}
