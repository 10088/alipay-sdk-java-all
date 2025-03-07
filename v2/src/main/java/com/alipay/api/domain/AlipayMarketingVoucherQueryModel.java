package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 券查询
 *
 * @author auto create
 * @since 1.0, 2023-01-13 15:36:50
 */
public class AlipayMarketingVoucherQueryModel extends AlipayObject {

	private static final long serialVersionUID = 2341836733286754698L;

	/**
	 * 券ID(券唯一标识, 发券接口返回参数)。通过 <a href="https://opendocs.alipay.com/apis/api_5/alipay.marketing.voucher.send">alipay.marketing.voucher.send</a>(发券接口)发券后获取。
	 */
	@ApiField("voucher_id")
	private String voucherId;

	public String getVoucherId() {
		return this.voucherId;
	}
	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

}
