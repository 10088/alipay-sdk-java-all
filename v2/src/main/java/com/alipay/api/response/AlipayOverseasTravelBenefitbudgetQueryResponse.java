package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BenefitBudgetQueryResultDTO;
import com.alipay.api.domain.ResultInfoDTO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.overseas.travel.benefitbudget.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 08:56:39
 */
public class AlipayOverseasTravelBenefitbudgetQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7533931158148692448L;

	/** 
	 * 预算详情列表
	 */
	@ApiListField("budget_details")
	@ApiField("benefit_budget_query_result_d_t_o")
	private List<BenefitBudgetQueryResultDTO> budgetDetails;

	/** 
	 * 结果信息
	 */
	@ApiField("result")
	private ResultInfoDTO result;

	public void setBudgetDetails(List<BenefitBudgetQueryResultDTO> budgetDetails) {
		this.budgetDetails = budgetDetails;
	}
	public List<BenefitBudgetQueryResultDTO> getBudgetDetails( ) {
		return this.budgetDetails;
	}

	public void setResult(ResultInfoDTO result) {
		this.result = result;
	}
	public ResultInfoDTO getResult( ) {
		return this.result;
	}

}
