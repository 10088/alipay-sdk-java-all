package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MobileAppInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.ampe.mobileapp.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 06:37:41
 */
public class AlipayOpenMiniAmpeMobileappBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8374297198569312662L;

	/** 
	 * 移动应用信息列表
	 */
	@ApiListField("mobile_app_info_list")
	@ApiField("mobile_app_info")
	private List<MobileAppInfo> mobileAppInfoList;

	public void setMobileAppInfoList(List<MobileAppInfo> mobileAppInfoList) {
		this.mobileAppInfoList = mobileAppInfoList;
	}
	public List<MobileAppInfo> getMobileAppInfoList( ) {
		return this.mobileAppInfoList;
	}

}
