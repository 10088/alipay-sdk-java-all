package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.DeviceServiceVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.iot.servicemodel.servicelist.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 02:06:58
 */
public class AlipayCommerceIotServicemodelServicelistQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4616863158892933626L;

	/** 
	 * 设备服务列表
	 */
	@ApiListField("list")
	@ApiField("device_service_v_o")
	private List<DeviceServiceVO> list;

	public void setList(List<DeviceServiceVO> list) {
		this.list = list;
	}
	public List<DeviceServiceVO> getList( ) {
		return this.list;
	}

}
