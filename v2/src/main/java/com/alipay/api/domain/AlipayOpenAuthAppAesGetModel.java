package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 授权应用aes密钥查询
 *
 * @author auto create
 * @since 1.0, 2023-01-13 15:45:38
 */
public class AlipayOpenAuthAppAesGetModel extends AlipayObject {

	private static final long serialVersionUID = 5716677146164295138L;

	/**
	 * 商家应用appId
	 */
	@ApiField("merchant_app_id")
	private String merchantAppId;

	public String getMerchantAppId() {
		return this.merchantAppId;
	}
	public void setMerchantAppId(String merchantAppId) {
		this.merchantAppId = merchantAppId;
	}

}
