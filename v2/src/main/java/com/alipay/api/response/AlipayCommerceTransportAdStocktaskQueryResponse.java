package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.StockTask;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.transport.ad.stocktask.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 04:26:42
 */
public class AlipayCommerceTransportAdStocktaskQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7181679845152913335L;

	/** 
	 * 库存任务执行情况
	 */
	@ApiField("stock_task")
	private StockTask stockTask;

	public void setStockTask(StockTask stockTask) {
		this.stockTask = stockTask;
	}
	public StockTask getStockTask( ) {
		return this.stockTask;
	}

}
