package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 根据addressId获取用户详细地址信息
 *
 * @author auto create
 * @since 1.0, 2020-08-27 14:56:43
 */
public class AlipayUserAddressQueryModel extends AlipayObject {

	private static final long serialVersionUID = 5346124174472419619L;

	/**
	 * 用户地址唯一ID。通过调用小程序开放api(my.chooseAddress)获取。
	 */
	@ApiField("address_id")
	private String addressId;

	public String getAddressId() {
		return this.addressId;
	}
	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}

}
