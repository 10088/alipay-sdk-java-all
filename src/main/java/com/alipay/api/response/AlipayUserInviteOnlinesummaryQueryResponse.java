package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.OnlineInviteNewerSummaryInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.invite.onlinesummary.query response.
 * 
 * @author auto create
 * @since 1.0, 2019-01-21 14:37:41
 */
public class AlipayUserInviteOnlinesummaryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 8714951823933281847L;

	/** 
	 * 线上拉新结算汇总数据列表
	 */
	@ApiListField("online_summary_info_list")
	@ApiField("online_invite_newer_summary_info")
	private List<OnlineInviteNewerSummaryInfo> onlineSummaryInfoList;

	public void setOnlineSummaryInfoList(List<OnlineInviteNewerSummaryInfo> onlineSummaryInfoList) {
		this.onlineSummaryInfoList = onlineSummaryInfoList;
	}
	public List<OnlineInviteNewerSummaryInfo> getOnlineSummaryInfoList( ) {
		return this.onlineSummaryInfoList;
	}

}
