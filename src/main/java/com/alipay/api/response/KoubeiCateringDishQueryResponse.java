package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.KbdishInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.dish.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-08 03:16:59
 */
public class KoubeiCateringDishQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7313976122826977517L;

	/** 
	 * 口碑菜品模型列表
	 */
	@ApiListField("kb_dish_info_list")
	@ApiField("kbdish_info")
	private List<KbdishInfo> kbDishInfoList;

	public void setKbDishInfoList(List<KbdishInfo> kbDishInfoList) {
		this.kbDishInfoList = kbDishInfoList;
	}
	public List<KbdishInfo> getKbDishInfoList( ) {
		return this.kbDishInfoList;
	}

}
