package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.file.url.upload response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-04 19:08:39
 */
public class AlipaySocialBaseFileUrlUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 8199112123635485344L;

	/** 
	 * 文件id
	 */
	@ApiField("file_id")
	private String fileId;

	public void setFileId(String fileId) {
		this.fileId = fileId;
	}
	public String getFileId( ) {
		return this.fileId;
	}

}
