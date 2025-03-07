package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 实人认证查询
 *
 * @author auto create
 * @since 1.0, 2022-06-15 10:03:03
 */
public class ZolozIdentificationCustomerCertifyQueryModel extends AlipayObject {

	private static final long serialVersionUID = 6824156718214678819L;

	/**
	 * 业务单据号，用于核对和排查
	 */
	@ApiField("biz_id")
	private String bizId;

	/**
	 * zimId，用于查询认证结果
	 */
	@ApiField("zim_id")
	private String zimId;

	public String getBizId() {
		return this.bizId;
	}
	public void setBizId(String bizId) {
		this.bizId = bizId;
	}

	public String getZimId() {
		return this.zimId;
	}
	public void setZimId(String zimId) {
		this.zimId = zimId;
	}

}
