package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 服务投放模版查询
 *
 * @author auto create
 * @since 1.0, 2022-04-21 14:45:19
 */
public class AlipayOpenAppServicePromotemplateQueryModel extends AlipayObject {

	private static final long serialVersionUID = 1187824957889729929L;

	/**
	 * 展台ID
	 */
	@ApiField("promo_booth_id")
	private String promoBoothId;

	/**
	 * 展台版本
	 */
	@ApiField("promo_booth_version")
	private Long promoBoothVersion;

	public String getPromoBoothId() {
		return this.promoBoothId;
	}
	public void setPromoBoothId(String promoBoothId) {
		this.promoBoothId = promoBoothId;
	}

	public Long getPromoBoothVersion() {
		return this.promoBoothVersion;
	}
	public void setPromoBoothVersion(Long promoBoothVersion) {
		this.promoBoothVersion = promoBoothVersion;
	}

}
