package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 外汇订单的创建
 *
 * @author auto create
 * @since 1.0, 2019-10-11 14:03:25
 */
public class AlipayOverseasRemitFxtradeorderCreateModel extends AlipayObject {

	private static final long serialVersionUID = 8428685751173761758L;

	/**
	 * the unique id on block chain generated by the caller to represent this remit operation
	 */
	@ApiField("bc_remit_id")
	private String bcRemitId;

	/**
	 * currency pair
	 */
	@ApiField("currency_pair")
	private String currencyPair;

	/**
	 * extended info
	 */
	@ApiField("extend_info")
	private String extendInfo;

	/**
	 * fx trade orderId
	 */
	@ApiField("fx_trade_order_id")
	private String fxTradeOrderId;

	/**
	 * fx trade side
	 */
	@ApiField("fx_trade_side")
	private String fxTradeSide;

	/**
	 * the Mid of the receiver allocated by net.
	 */
	@ApiField("receiver_mid")
	private String receiverMid;

	/**
	 * the Mid of the sender allocated by net.
	 */
	@ApiField("sender_mid")
	private String senderMid;

	/**
	 * { "currency":"CNY", "value":"100000" }
	 */
	@ApiField("trans_amount")
	private Money transAmount;

	public String getBcRemitId() {
		return this.bcRemitId;
	}
	public void setBcRemitId(String bcRemitId) {
		this.bcRemitId = bcRemitId;
	}

	public String getCurrencyPair() {
		return this.currencyPair;
	}
	public void setCurrencyPair(String currencyPair) {
		this.currencyPair = currencyPair;
	}

	public String getExtendInfo() {
		return this.extendInfo;
	}
	public void setExtendInfo(String extendInfo) {
		this.extendInfo = extendInfo;
	}

	public String getFxTradeOrderId() {
		return this.fxTradeOrderId;
	}
	public void setFxTradeOrderId(String fxTradeOrderId) {
		this.fxTradeOrderId = fxTradeOrderId;
	}

	public String getFxTradeSide() {
		return this.fxTradeSide;
	}
	public void setFxTradeSide(String fxTradeSide) {
		this.fxTradeSide = fxTradeSide;
	}

	public String getReceiverMid() {
		return this.receiverMid;
	}
	public void setReceiverMid(String receiverMid) {
		this.receiverMid = receiverMid;
	}

	public String getSenderMid() {
		return this.senderMid;
	}
	public void setSenderMid(String senderMid) {
		this.senderMid = senderMid;
	}

	public Money getTransAmount() {
		return this.transAmount;
	}
	public void setTransAmount(Money transAmount) {
		this.transAmount = transAmount;
	}

}
