package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.public.personalized.menu.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-04 22:32:12
 */
public class AlipayOpenPublicPersonalizedMenuCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 2697316355997315238L;

	/** 
	 * 该套个性化菜单key
	 */
	@ApiField("menu_key")
	private String menuKey;

	public void setMenuKey(String menuKey) {
		this.menuKey = menuKey;
	}
	public String getMenuKey( ) {
		return this.menuKey;
	}

}
