package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.user.family.relation.valid.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 08:16:22
 */
public class AlipayUserFamilyRelationValidQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3185766333538315817L;

	/** 
	 * 是否加入过家庭
	 */
	@ApiField("has_family")
	private Boolean hasFamily;

	/** 
	 * 是否加入有效家庭
	 */
	@ApiField("has_valid_family")
	private Boolean hasValidFamily;

	public void setHasFamily(Boolean hasFamily) {
		this.hasFamily = hasFamily;
	}
	public Boolean getHasFamily( ) {
		return this.hasFamily;
	}

	public void setHasValidFamily(Boolean hasValidFamily) {
		this.hasValidFamily = hasValidFamily;
	}
	public Boolean getHasValidFamily( ) {
		return this.hasValidFamily;
	}

}
