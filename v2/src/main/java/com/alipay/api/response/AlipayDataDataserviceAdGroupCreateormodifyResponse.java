package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.data.dataservice.ad.group.createormodify response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-04 18:59:07
 */
public class AlipayDataDataserviceAdGroupCreateormodifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 6763188176582123648L;

	/** 
	 * 单元id
	 */
	@ApiField("group_id")
	private Long groupId;

	/** 
	 * 外部单元编号
	 */
	@ApiField("group_outer_id")
	private String groupOuterId;

	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}
	public Long getGroupId( ) {
		return this.groupId;
	}

	public void setGroupOuterId(String groupOuterId) {
		this.groupOuterId = groupOuterId;
	}
	public String getGroupOuterId( ) {
		return this.groupOuterId;
	}

}
