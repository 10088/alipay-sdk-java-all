package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.ItemModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.item.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-04 22:38:08
 */
public class AntMerchantExpandItemQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2569667516983129297L;

	/** 
	 * 商品列表
	 */
	@ApiListField("item_list")
	@ApiField("item_model")
	private List<ItemModel> itemList;

	public void setItemList(List<ItemModel> itemList) {
		this.itemList = itemList;
	}
	public List<ItemModel> getItemList( ) {
		return this.itemList;
	}

}
