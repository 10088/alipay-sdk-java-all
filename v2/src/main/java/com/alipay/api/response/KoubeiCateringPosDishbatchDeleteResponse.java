package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.pos.dishbatch.delete response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-05 11:16:20
 */
public class KoubeiCateringPosDishbatchDeleteResponse extends AlipayResponse {

	private static final long serialVersionUID = 2713673247848951236L;

	/** 
	 * 删除成功的ID
	 */
	@ApiListField("dish_ids")
	@ApiField("string")
	private List<String> dishIds;

	public void setDishIds(List<String> dishIds) {
		this.dishIds = dishIds;
	}
	public List<String> getDishIds( ) {
		return this.dishIds;
	}

}
