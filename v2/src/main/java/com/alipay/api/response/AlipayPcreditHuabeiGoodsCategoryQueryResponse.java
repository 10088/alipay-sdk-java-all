package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.GoodsCategoryResult;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.pcredit.huabei.goods.category.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 07:59:01
 */
public class AlipayPcreditHuabeiGoodsCategoryQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 5536286855984331684L;

	/** 
	 * 类目详情信息
	 */
	@ApiListField("categorys")
	@ApiField("goods_category_result")
	private List<GoodsCategoryResult> categorys;

	/** 
	 * 是否请求成功
	 */
	@ApiField("success")
	private Boolean success;

	public void setCategorys(List<GoodsCategoryResult> categorys) {
		this.categorys = categorys;
	}
	public List<GoodsCategoryResult> getCategorys( ) {
		return this.categorys;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public Boolean getSuccess( ) {
		return this.success;
	}

}
