package com.alipay.api.response;

import com.alipay.api.internal.mapping.ApiField;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: ant.merchant.expand.asset.qrcode.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-02-06 14:18:59
 */
public class AntMerchantExpandAssetQrcodeQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4526572846518968953L;

	/** 
	 * 码业务类型
	 */
	@ApiField("biz_type")
	private String bizType;

	/** 
	 * 码类型
	 */
	@ApiField("code_type")
	private String codeType;

	/** 
	 * 码图url
	 */
	@ApiField("dynamic_img_url")
	private String dynamicImgUrl;

	/** 
	 * 二维码唯一标识
	 */
	@ApiField("token_id")
	private String tokenId;

	public void setBizType(String bizType) {
		this.bizType = bizType;
	}
	public String getBizType( ) {
		return this.bizType;
	}

	public void setCodeType(String codeType) {
		this.codeType = codeType;
	}
	public String getCodeType( ) {
		return this.codeType;
	}

	public void setDynamicImgUrl(String dynamicImgUrl) {
		this.dynamicImgUrl = dynamicImgUrl;
	}
	public String getDynamicImgUrl( ) {
		return this.dynamicImgUrl;
	}

	public void setTokenId(String tokenId) {
		this.tokenId = tokenId;
	}
	public String getTokenId( ) {
		return this.tokenId;
	}

}
