package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.pos.desk.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 04:33:07
 */
public class KoubeiCateringPosDeskCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 3823693934187778456L;

	/** 
	 * 桌位ID
	 */
	@ApiListField("ids")
	@ApiField("string")
	private List<String> ids;

	public void setIds(List<String> ids) {
		this.ids = ids;
	}
	public List<String> getIds( ) {
		return this.ids;
	}

}
