package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户实名信息参数
 *
 * @author auto create
 * @since 1.0, 2022-12-13 16:57:52
 */
public class IdentityParams extends AlipayObject {

	private static final long serialVersionUID = 3671151988262145163L;

	/**
	 * 用户身份证号
	 */
	@ApiField("cert_no")
	private String certNo;

	/**
	 * 用户实名信息hash值
	 */
	@ApiField("identity_hash")
	private String identityHash;

	/**
	 * 签约指定用户的uid，如用户登录的uid和指定的用户uid不一致则报错
	 */
	@ApiField("sign_user_id")
	private String signUserId;

	/**
	 * 用户姓名
	 */
	@ApiField("user_name")
	private String userName;

	public String getCertNo() {
		return this.certNo;
	}
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	public String getIdentityHash() {
		return this.identityHash;
	}
	public void setIdentityHash(String identityHash) {
		this.identityHash = identityHash;
	}

	public String getSignUserId() {
		return this.signUserId;
	}
	public void setSignUserId(String signUserId) {
		this.signUserId = signUserId;
	}

	public String getUserName() {
		return this.userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

}
