package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.fund.trans.auction.balance.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-05 10:32:28
 */
public class AlipayFundTransAuctionBalanceQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7532617968297851884L;

	/** 
	 * 当前可用余额
	 */
	@ApiField("balance_available")
	private String balanceAvailable;

	/** 
	 * 冻结金额
	 */
	@ApiField("balance_freezed")
	private String balanceFreezed;

	public void setBalanceAvailable(String balanceAvailable) {
		this.balanceAvailable = balanceAvailable;
	}
	public String getBalanceAvailable( ) {
		return this.balanceAvailable;
	}

	public void setBalanceFreezed(String balanceFreezed) {
		this.balanceFreezed = balanceFreezed;
	}
	public String getBalanceFreezed( ) {
		return this.balanceFreezed;
	}

}
