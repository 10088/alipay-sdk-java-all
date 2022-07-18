package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 间连商户信息补录
 *
 * @author auto create
 * @since 1.0, 2021-09-03 17:54:09
 */
public class AntMerchantExpandIndirectSupplementCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8792544276936249232L;

	/**
	 * logo图片，其值为使用ant.merchant.expand.indirect.image.upload上传图片得到的一串oss key。
	 */
	@ApiField("logo_key")
	private String logoKey;

	/**
	 * 商户在支付宝入驻成功后，生成的支付宝内全局唯一的商户编号
	 */
	@ApiField("sub_merchant_id")
	private String subMerchantId;

	public String getLogoKey() {
		return this.logoKey;
	}
	public void setLogoKey(String logoKey) {
		this.logoKey = logoKey;
	}

	public String getSubMerchantId() {
		return this.subMerchantId;
	}
	public void setSubMerchantId(String subMerchantId) {
		this.subMerchantId = subMerchantId;
	}

}
