package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询部门详情
 *
 * @author auto create
 * @since 1.0, 2023-01-10 14:16:48
 */
public class AlipayCommerceEcDepartmentInfoQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2695629977918485991L;

	/**
	 * 部门id
	 */
	@ApiField("department_id")
	private String departmentId;

	/**
	 * 企业id
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	public String getDepartmentId() {
		return this.departmentId;
	}
	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

}
