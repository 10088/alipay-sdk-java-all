package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.domain.FixFileInfo;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.fix.attachment.upload response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-10 23:13:25
 */
public class AlipayCommerceFixAttachmentUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 4546124168863117324L;

	/** 
	 * 上传文件的内容。
	 */
	@ApiField("file_info")
	private FixFileInfo fileInfo;

	public void setFileInfo(FixFileInfo fileInfo) {
		this.fileInfo = fileInfo;
	}
	public FixFileInfo getFileInfo( ) {
		return this.fileInfo;
	}

}
