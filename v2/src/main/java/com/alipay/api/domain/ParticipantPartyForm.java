package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 参与者表单
 *
 * @author auto create
 * @since 1.0, 2023-01-05 16:02:04
 */
public class ParticipantPartyForm extends AlipayObject {

	private static final long serialVersionUID = 4368156489925227148L;

	/**
	 * 参与者的业务身份标识
	 */
	@ApiField("identity")
	private String identity;

	/**
	 * ALIPAY_OPEN_ID代表identity为支付宝开放用户ID；ALIPAY_LOGON_ID代表identity为支付宝用户登录号；
	 */
	@ApiField("identity_type")
	private String identityType;

	/**
	 * 用户姓名，在identity_type为ALIPAY_LOGON_ID时必填
	 */
	@ApiField("name")
	private String name;

	public String getIdentity() {
		return this.identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}

	public String getIdentityType() {
		return this.identityType;
	}
	public void setIdentityType(String identityType) {
		this.identityType = identityType;
	}

	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
