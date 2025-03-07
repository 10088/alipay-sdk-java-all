package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.EpInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.credit.pe.lawsuit.detail.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-04 18:05:03
 */
public class ZhimaCreditPeLawsuitDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5194384419961321139L;

	/** 
	 * 芝麻信用对于每一次请求返回的业务号。后续可以通过此业务号进行对账
	 */
	@ApiField("biz_no")
	private String bizNo;

	/** 
	 * 个人涉诉详情信息
	 */
	@ApiField("lawsuit_detail")
	private EpInfo lawsuitDetail;

	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}
	public String getBizNo( ) {
		return this.bizNo;
	}

	public void setLawsuitDetail(EpInfo lawsuitDetail) {
		this.lawsuitDetail = lawsuitDetail;
	}
	public EpInfo getLawsuitDetail( ) {
		return this.lawsuitDetail;
	}

}
