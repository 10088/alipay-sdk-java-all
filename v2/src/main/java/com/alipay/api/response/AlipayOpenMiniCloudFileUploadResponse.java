package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.open.mini.cloud.file.upload response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-04 19:56:43
 */
public class AlipayOpenMiniCloudFileUploadResponse extends AlipayResponse {

	private static final long serialVersionUID = 2699536895774329357L;

	/** 
	 * 文件访问地址
	 */
	@ApiField("download_url")
	private String downloadUrl;

	/** 
	 * 文件id
	 */
	@ApiField("file_id")
	private String fileId;

	public void setDownloadUrl(String downloadUrl) {
		this.downloadUrl = downloadUrl;
	}
	public String getDownloadUrl( ) {
		return this.downloadUrl;
	}

	public void setFileId(String fileId) {
		this.fileId = fileId;
	}
	public String getFileId( ) {
		return this.fileId;
	}

}
