package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 用户绑定申请token
 *
 * @author auto create
 * @since 1.0, 2022-12-26 14:31:13
 */
public class AlipayFundWalletTokenCreateModel extends AlipayObject {

	private static final long serialVersionUID = 1132214271516885914L;

	/**
	 * 业务场景
	 */
	@ApiField("biz_scene")
	private String bizScene;

	/**
	 * 如果是ALIPAY_USER_ID，则传用户账号；如果是ALIPAY_LOGIN_ID，则传手机号
	 */
	@ApiField("identity")
	private String identity;

	/**
	 * 登陆类型
	 */
	@ApiField("identity_type")
	private String identityType;

	/**
	 * 外部业务号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 销售产品码
	 */
	@ApiField("product_code")
	private String productCode;

	/**
	 * 如果账号类型是ALIPAY_LOGIN_ID，则必传用户真实姓名，进行信息校验
	 */
	@ApiField("real_name")
	private String realName;

	public String getBizScene() {
		return this.bizScene;
	}
	public void setBizScene(String bizScene) {
		this.bizScene = bizScene;
	}

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

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public String getProductCode() {
		return this.productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}

	public String getRealName() {
		return this.realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}

}
