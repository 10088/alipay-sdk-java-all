package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.AiPictureVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.coupon.wufu.aipicture.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 10:16:38
 */
public class AlipayFundCouponWufuAipictureQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1687811628314425587L;

	/** 
	 * AI年画图片列表
	 */
	@ApiListField("ai_picture_list")
	@ApiField("ai_picture_v_o")
	private List<AiPictureVO> aiPictureList;

	public void setAiPictureList(List<AiPictureVO> aiPictureList) {
		this.aiPictureList = aiPictureList;
	}
	public List<AiPictureVO> getAiPictureList( ) {
		return this.aiPictureList;
	}

}
