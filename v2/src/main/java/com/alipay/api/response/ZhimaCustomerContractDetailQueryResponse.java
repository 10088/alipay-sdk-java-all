package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.ApiContractDetail;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: zhima.customer.contract.detail.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-07 15:55:46
 */
public class ZhimaCustomerContractDetailQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6731562856453838963L;

	/** 
	 * 合约详情
	 */
	@ApiField("contract_detail")
	private ApiContractDetail contractDetail;

	public void setContractDetail(ApiContractDetail contractDetail) {
		this.contractDetail = contractDetail;
	}
	public ApiContractDetail getContractDetail( ) {
		return this.contractDetail;
	}

}
