package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.WeatherInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: anttech.blockchain.defin.dataservice.weatherinfos.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 09:26:41
 */
public class AnttechBlockchainDefinDataserviceWeatherinfosQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8614774619232493216L;

	/** 
	 * 气象信息
	 */
	@ApiListField("weather_infos")
	@ApiField("weather_info")
	private List<WeatherInfo> weatherInfos;

	public void setWeatherInfos(List<WeatherInfo> weatherInfos) {
		this.weatherInfos = weatherInfos;
	}
	public List<WeatherInfo> getWeatherInfos( ) {
		return this.weatherInfos;
	}

}
