package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.scene.facegroup.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-04 23:06:02
 */
public class AlipayCommerceEducateSceneFacegroupQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4214377298129639328L;

	/** 
	 * 学校人脸库ID
	 */
	@ApiField("school_group_id")
	private String schoolGroupId;

	public void setSchoolGroupId(String schoolGroupId) {
		this.schoolGroupId = schoolGroupId;
	}
	public String getSchoolGroupId( ) {
		return this.schoolGroupId;
	}

}
