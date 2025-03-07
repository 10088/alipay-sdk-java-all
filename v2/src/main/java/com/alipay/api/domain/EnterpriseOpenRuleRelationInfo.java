package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 开票规则绑定关系
 *
 * @author auto create
 * @since 1.0, 2022-11-11 14:14:24
 */
public class EnterpriseOpenRuleRelationInfo extends AlipayObject {

	private static final long serialVersionUID = 4411846454746653927L;

	/**
	 * 企业ID【推荐使用】
	 */
	@ApiField("enterprise_id")
	private String enterpriseId;

	/**
	 * 创建时间
	 */
	@ApiField("gmt_create")
	private Date gmtCreate;

	/**
	 * 修改时间
	 */
	@ApiField("gmt_modified")
	private Date gmtModified;

	/**
	 * 企业共同账户ID【不推荐使用】
	 */
	@ApiField("owner_id")
	private String ownerId;

	/**
	 * 费控制度id
	 */
	@ApiField("standard_id")
	private String standardId;

	public String getEnterpriseId() {
		return this.enterpriseId;
	}
	public void setEnterpriseId(String enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public Date getGmtCreate() {
		return this.gmtCreate;
	}
	public void setGmtCreate(Date gmtCreate) {
		this.gmtCreate = gmtCreate;
	}

	public Date getGmtModified() {
		return this.gmtModified;
	}
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

	public String getOwnerId() {
		return this.ownerId;
	}
	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	public String getStandardId() {
		return this.standardId;
	}
	public void setStandardId(String standardId) {
		this.standardId = standardId;
	}

}
