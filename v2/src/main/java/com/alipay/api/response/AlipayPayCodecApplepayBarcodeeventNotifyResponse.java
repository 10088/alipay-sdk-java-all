package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.BarcodeEventResponseHeader;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pay.codec.applepay.barcodeevent.notify response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-10 23:28:28
 */
public class AlipayPayCodecApplepayBarcodeeventNotifyResponse extends AlipayResponse {

	private static final long serialVersionUID = 8333222318897566631L;

	/** 
	 * 结果。 statusCode:Status code used to indicate an error. If omitted, assumed to be 200 (success);subStatusCode:Conveys failure codes from downstream entities or for more granular conveyance of specific error conditions;statusMessage:Not parsed programmatically. Example "Downstream system offline".
	 */
	@ApiField("response_header")
	private BarcodeEventResponseHeader responseHeader;

	/** 
	 * 当前付款码是否有交易发生。
	 */
	@ApiField("transaction_available")
	private String transactionAvailable;

	public void setResponseHeader(BarcodeEventResponseHeader responseHeader) {
		this.responseHeader = responseHeader;
	}
	public BarcodeEventResponseHeader getResponseHeader( ) {
		return this.responseHeader;
	}

	public void setTransactionAvailable(String transactionAvailable) {
		this.transactionAvailable = transactionAvailable;
	}
	public String getTransactionAvailable( ) {
		return this.transactionAvailable;
	}

}
