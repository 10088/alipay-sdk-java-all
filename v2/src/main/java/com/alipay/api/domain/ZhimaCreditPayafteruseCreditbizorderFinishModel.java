package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 完结先享后付记账单
 *
 * @author auto create
 * @since 1.0, 2022-07-14 13:59:49
 */
public class ZhimaCreditPayafteruseCreditbizorderFinishModel extends AlipayObject {

	private static final long serialVersionUID = 4293141962521176185L;

	/**
	 * 信用服务订单号
	 */
	@ApiField("credit_biz_order_id")
	private String creditBizOrderId;

	/**
	 * 用户此订单是否守约。
传true时，用户在芝麻信用-守约记录中，该笔订单是已守约状态；
传false时，用户在芝麻信用-守约记录中，该笔订单是已取消状态。
	 */
	@ApiField("is_fulfilled")
	private String isFulfilled;

	/**
	 * 商户外部请求号
	 */
	@ApiField("out_request_no")
	private String outRequestNo;

	/**
	 * 商户对本次操作的附言描述
	 */
	@ApiField("remark")
	private String remark;

	public String getCreditBizOrderId() {
		return this.creditBizOrderId;
	}
	public void setCreditBizOrderId(String creditBizOrderId) {
		this.creditBizOrderId = creditBizOrderId;
	}

	public String getIsFulfilled() {
		return this.isFulfilled;
	}
	public void setIsFulfilled(String isFulfilled) {
		this.isFulfilled = isFulfilled;
	}

	public String getOutRequestNo() {
		return this.outRequestNo;
	}
	public void setOutRequestNo(String outRequestNo) {
		this.outRequestNo = outRequestNo;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

}
