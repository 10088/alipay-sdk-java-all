package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.TagInfoVO;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.educate.train.tags.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 00:04:27
 */
public class AlipayCommerceEducateTrainTagsQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 4373718449425679395L;

	/** 
	 * 标签信息列表
	 */
	@ApiListField("tag_infos")
	@ApiField("tag_info_v_o")
	private List<TagInfoVO> tagInfos;

	public void setTagInfos(List<TagInfoVO> tagInfos) {
		this.tagInfos = tagInfos;
	}
	public List<TagInfoVO> getTagInfos( ) {
		return this.tagInfos;
	}

}
