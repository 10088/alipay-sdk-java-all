package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.contentlib.standardvideo.send response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-05 11:26:39
 */
public class AlipaySocialBaseContentlibStandardvideoSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 3349896945137153756L;

	/** 
	 * result_msg为请求openAPI接口后返回的结果message
	 */
	@ApiField("result_msg")
	private String resultMsg;

	public void setResultMsg(String resultMsg) {
		this.resultMsg = resultMsg;
	}
	public String getResultMsg( ) {
		return this.resultMsg;
	}

}
