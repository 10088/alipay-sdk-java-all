package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.memberwallet.withdraw.submit response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-07 18:12:03
 */
public class AntMerchantMemberwalletWithdrawSubmitResponse extends AlipayResponse {

	private static final long serialVersionUID = 2197232718358845676L;

	/** 
	 * 提现本金金额（单位：元）
	 */
	@ApiField("actual_withdraw_amount")
	private String actualWithdrawAmount;

	/** 
	 * 提现金额（单位：元）
	 */
	@ApiField("withdraw_amount")
	private String withdrawAmount;

	public void setActualWithdrawAmount(String actualWithdrawAmount) {
		this.actualWithdrawAmount = actualWithdrawAmount;
	}
	public String getActualWithdrawAmount( ) {
		return this.actualWithdrawAmount;
	}

	public void setWithdrawAmount(String withdrawAmount) {
		this.withdrawAmount = withdrawAmount;
	}
	public String getWithdrawAmount( ) {
		return this.withdrawAmount;
	}

}
