package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.chat.msg.send response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 09:31:39
 */
public class AlipaySocialBaseChatMsgSendResponse extends AlipayResponse {

	private static final long serialVersionUID = 1221477126158651956L;

	/** 
	 * 消息索引号 会话ID_消息ID
	 */
	@ApiField("msg_index")
	private String msgIndex;

	public void setMsgIndex(String msgIndex) {
		this.msgIndex = msgIndex;
	}
	public String getMsgIndex( ) {
		return this.msgIndex;
	}

}
