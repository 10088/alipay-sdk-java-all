package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.RegionState;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.msaas.mediarecog.mmtcaftscv.machinegoods.add response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 05:14:36
 */
public class AlipayMsaasMediarecogMmtcaftscvMachinegoodsAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 8495853216736541164L;

	/** 
	 * 柜内区域状态
	 */
	@ApiListField("regions")
	@ApiField("region_state")
	private List<RegionState> regions;

	public void setRegions(List<RegionState> regions) {
		this.regions = regions;
	}
	public List<RegionState> getRegions( ) {
		return this.regions;
	}

}
