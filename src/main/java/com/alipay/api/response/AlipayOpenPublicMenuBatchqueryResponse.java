package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.QueryMenu;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.menu.batchquery response.
 * 
 * @author auto create
 * @since 1.0, 2021-12-09 00:29:14
 */
public class AlipayOpenPublicMenuBatchqueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 2267769994441746753L;

	/** 
	 * 菜单数量，包括默认菜单和个性化菜单
	 */
	@ApiField("count")
	private String count;

	/** 
	 * 菜单列表
	 */
	@ApiListField("menus")
	@ApiField("query_menu")
	private List<QueryMenu> menus;

	public void setCount(String count) {
		this.count = count;
	}
	public String getCount( ) {
		return this.count;
	}

	public void setMenus(List<QueryMenu> menus) {
		this.menus = menus;
	}
	public List<QueryMenu> getMenus( ) {
		return this.menus;
	}

}
