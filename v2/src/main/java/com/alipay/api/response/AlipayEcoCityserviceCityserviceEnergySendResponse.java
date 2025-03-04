package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.eco.cityservice.cityservice.energy.send response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-04 23:14:53
 */
public class AlipayEcoCityserviceCityserviceEnergySendResponse extends AlipayResponse {

	private static final long serialVersionUID = 1344453365558652459L;

	/** 
	 * 发放的能量总额，单位：克
	 */
	@ApiField("total_energy")
	private Long totalEnergy;

	public void setTotalEnergy(Long totalEnergy) {
		this.totalEnergy = totalEnergy;
	}
	public Long getTotalEnergy( ) {
		return this.totalEnergy;
	}

}
