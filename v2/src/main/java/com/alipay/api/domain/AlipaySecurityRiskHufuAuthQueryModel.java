package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 查询虎符认证结果
 *
 * @author auto create
 * @since 1.0, 2021-09-06 13:51:58
 */
public class AlipaySecurityRiskHufuAuthQueryModel extends AlipayObject {

	private static final long serialVersionUID = 3225695382218576343L;

	/**
	 * 获取虎符结果需要的code
	 */
	@ApiField("code")
	private String code;

	/**
	 * 获取虎符结果的额外策略信息
	 */
	@ApiField("policy")
	private String policy;

	/**
	 * 业务系统创建虎符时传入的序列号
	 */
	@ApiField("serial")
	private String serial;

	public String getCode() {
		return this.code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public String getPolicy() {
		return this.policy;
	}
	public void setPolicy(String policy) {
		this.policy = policy;
	}

	public String getSerial() {
		return this.serial;
	}
	public void setSerial(String serial) {
		this.serial = serial;
	}

}
