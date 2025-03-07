package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.antforest.project.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 09:01:40
 */
public class AlipaySocialAntforestProjectQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 6161661747738741269L;

	/** 
	 * 请联系接口开发人员咨询相关参数
	 */
	@ApiListField("projects")
	@ApiField("string")
	private List<String> projects;

	public void setProjects(List<String> projects) {
		this.projects = projects;
	}
	public List<String> getProjects( ) {
		return this.projects;
	}

}
