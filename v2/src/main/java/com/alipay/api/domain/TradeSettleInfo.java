package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 交易结算相关信息。包含分账、补差等信息
 *
 * @author auto create
 * @since 1.0, 2021-07-14 19:40:35
 */
public class TradeSettleInfo extends AlipayObject {

	private static final long serialVersionUID = 4116244976574697339L;

	/**
	 * 交易结算明细信息
	 */
	@ApiListField("trade_settle_detail_list")
	@ApiField("trade_settle_detail")
	private List<TradeSettleDetail> tradeSettleDetailList;

	public List<TradeSettleDetail> getTradeSettleDetailList() {
		return this.tradeSettleDetailList;
	}
	public void setTradeSettleDetailList(List<TradeSettleDetail> tradeSettleDetailList) {
		this.tradeSettleDetailList = tradeSettleDetailList;
	}

}
