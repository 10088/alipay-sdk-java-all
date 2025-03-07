package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.marketing.data.dashboard.cancel response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 03:32:12
 */
public class AlipayMarketingDataDashboardCancelResponse extends AlipayResponse {

	private static final long serialVersionUID = 8415986251862642538L;

	/** 
	 * 取消授权失败仪表盘列表
	 */
	@ApiListField("dashboard_fail_list")
	@ApiField("string")
	private List<String> dashboardFailList;

	/** 
	 * 取消仪表盘授权结果
	 */
	@ApiField("status")
	private Boolean status;

	public void setDashboardFailList(List<String> dashboardFailList) {
		this.dashboardFailList = dashboardFailList;
	}
	public List<String> getDashboardFailList( ) {
		return this.dashboardFailList;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}
	public Boolean getStatus( ) {
		return this.status;
	}

}
