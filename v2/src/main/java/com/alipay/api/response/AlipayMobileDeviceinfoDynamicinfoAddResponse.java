package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.mobile.deviceinfo.dynamicinfo.add response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 03:32:44
 */
public class AlipayMobileDeviceinfoDynamicinfoAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 1426689817858574947L;

	/** 
	 * 同步处理结果
	 */
	@ApiField("operateresult")
	private Boolean operateresult;

	public void setOperateresult(Boolean operateresult) {
		this.operateresult = operateresult;
	}
	public Boolean getOperateresult( ) {
		return this.operateresult;
	}

}
