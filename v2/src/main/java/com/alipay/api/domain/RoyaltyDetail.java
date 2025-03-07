package com.alipay.api.domain;

import java.util.Date;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 分账明细
 *
 * @author auto create
 * @since 1.0, 2022-12-21 11:02:34
 */
public class RoyaltyDetail extends AlipayObject {

	private static final long serialVersionUID = 7818921188474217572L;

	/**
	 * 分账金额
	 */
	@ApiField("amount")
	private String amount;

	/**
	 * 分账失败错误码，只在分账失败时返回
	 */
	@ApiField("error_code")
	private String errorCode;

	/**
	 * 分账错误描述信息
	 */
	@ApiField("error_desc")
	private String errorDesc;

	/**
	 * 分账执行时间
	 */
	@ApiField("execute_dt")
	private Date executeDt;

	/**
	 * 分账操作类型。有以下几种类型： replenish(补差)、replenish_refund(退补差)、transfer(分账)、transfer_refund(退分账)
	 */
	@ApiField("operation_type")
	private String operationType;

	/**
	 * 分账状态，SUCCESS成功，FAIL失败，PROCESSING处理中
	 */
	@ApiField("state")
	private String state;

	/**
	 * 分账转入账号，只有在operation_type为replenish_refund(退补差)，transfer(分账)才返回该字段或trans_in_open_id。trans_in_open_id为分账转入方的openId，当trans_in_open_id不为空的时候，请优先使用trans_in_open_id。
	 */
	@ApiField("trans_in")
	private String transIn;

	/**
	 * 分账转入方的OpenId，OpenId为用户在该应用下支付宝的唯一用户标识。
	 */
	@ApiField("trans_in_open_id")
	private String transInOpenId;

	/**
	 * 分账转入账号类型，userId表示是支付宝账号对应的支付宝唯一用户号，loginName表示是支付宝登录号，secondMerchantID表示是二级商户id。
只有在operation_type为replenish_refund(退补差)，transfer(分账)才返回该字段
	 */
	@ApiField("trans_in_type")
	private String transInType;

	/**
	 * 分账转出账号，只有在operation_type为replenish(补差),transfer_refund(退分账)类型才返回该字段或trans_out_open_id字段。trans_out_open_id字段为分账转出方的openId，当trans_out_open_id 字段不为空时，请优先使用trans_out_open_id。
	 */
	@ApiField("trans_out")
	private String transOut;

	/**
	 * 分账转出方的OpenId，OpenId为用户在该应用下支付宝内的唯一用户标识。
	 */
	@ApiField("trans_out_open_id")
	private String transOutOpenId;

	/**
	 * 分账转出账号类型，userId表示是支付宝账号对应的支付宝唯一用户号，loginName表示是支付宝登录号，secondMerchantID表示是二级商户id。
只有在operation_type为replenish(补差)，transfer_refund(退分账)类型才返回该字段
	 */
	@ApiField("trans_out_type")
	private String transOutType;

	public String getAmount() {
		return this.amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getErrorCode() {
		return this.errorCode;
	}
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	public String getErrorDesc() {
		return this.errorDesc;
	}
	public void setErrorDesc(String errorDesc) {
		this.errorDesc = errorDesc;
	}

	public Date getExecuteDt() {
		return this.executeDt;
	}
	public void setExecuteDt(Date executeDt) {
		this.executeDt = executeDt;
	}

	public String getOperationType() {
		return this.operationType;
	}
	public void setOperationType(String operationType) {
		this.operationType = operationType;
	}

	public String getState() {
		return this.state;
	}
	public void setState(String state) {
		this.state = state;
	}

	public String getTransIn() {
		return this.transIn;
	}
	public void setTransIn(String transIn) {
		this.transIn = transIn;
	}

	public String getTransInOpenId() {
		return this.transInOpenId;
	}
	public void setTransInOpenId(String transInOpenId) {
		this.transInOpenId = transInOpenId;
	}

	public String getTransInType() {
		return this.transInType;
	}
	public void setTransInType(String transInType) {
		this.transInType = transInType;
	}

	public String getTransOut() {
		return this.transOut;
	}
	public void setTransOut(String transOut) {
		this.transOut = transOut;
	}

	public String getTransOutOpenId() {
		return this.transOutOpenId;
	}
	public void setTransOutOpenId(String transOutOpenId) {
		this.transOutOpenId = transOutOpenId;
	}

	public String getTransOutType() {
		return this.transOutType;
	}
	public void setTransOutType(String transOutType) {
		this.transOutType = transOutType;
	}

}
