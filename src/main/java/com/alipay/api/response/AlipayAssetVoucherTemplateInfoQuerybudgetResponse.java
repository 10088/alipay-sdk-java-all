package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.VoucherTemplateBudgetDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.asset.voucher.template.info.querybudget response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-19 15:33:32
 */
public class AlipayAssetVoucherTemplateInfoQuerybudgetResponse extends AlipayResponse {

	private static final long serialVersionUID = 8119567321678176573L;

	/** 
	 * 券模板预算列表
	 */
	@ApiListField("template_list")
	@ApiField("voucher_template_budget_d_t_o")
	private List<VoucherTemplateBudgetDTO> templateList;

	public void setTemplateList(List<VoucherTemplateBudgetDTO> templateList) {
		this.templateList = templateList;
	}
	public List<VoucherTemplateBudgetDTO> getTemplateList( ) {
		return this.templateList;
	}

}
