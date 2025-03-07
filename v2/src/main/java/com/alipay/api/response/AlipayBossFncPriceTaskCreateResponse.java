package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.boss.fnc.price.task.create response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 05:16:12
 */
public class AlipayBossFncPriceTaskCreateResponse extends AlipayResponse {

	private static final long serialVersionUID = 4572132264564266895L;

	/** 
	 * 结果码
	 */
	@ApiField("result_code")
	private String resultCode;

	/** 
	 * 结果信息
	 */
	@ApiField("result_msg")
	private String resultMsg;

	/** 
	 * 价格任务创建的返回结果
	 */
	@ApiField("task_detail")
	private String taskDetail;

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}
	public String getResultCode( ) {
		return this.resultCode;
	}

	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
	public String getResultMsg( ) {
		return this.resultMsg;
	}

	public void setTaskDetail(String taskDetail) {
		this.taskDetail = taskDetail;
	}
	public String getTaskDetail( ) {
		return this.taskDetail;
	}

}
