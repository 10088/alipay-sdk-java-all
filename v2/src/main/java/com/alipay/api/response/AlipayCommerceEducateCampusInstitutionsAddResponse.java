package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.campus.institutions.add response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-04 23:34:31
 */
public class AlipayCommerceEducateCampusInstitutionsAddResponse extends AlipayResponse {

	private static final long serialVersionUID = 7383355566475992945L;

	/** 
	 * 学校内标。如果入驻成功，返回学校内标；入驻失败则不返回学校内标。
	 */
	@ApiField("inst_id")
	private String instId;

	/** 
	 * 学校外标。如果入驻成功，返回学校外标；入驻失败则不返回学校外标。
	 */
	@ApiField("inst_std_code")
	private String instStdCode;

	/** 
	 * 入驻失败原因
	 */
	@ApiField("reason")
	private String reason;

	public void setInstId(String instId) {
		this.instId = instId;
	}
	public String getInstId( ) {
		return this.instId;
	}

	public void setInstStdCode(String instStdCode) {
		this.instStdCode = instStdCode;
	}
	public String getInstStdCode( ) {
		return this.instStdCode;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getReason( ) {
		return this.reason;
	}

}
