package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.MaterialEntity;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: koubei.catering.pos.material.query response.
 * 
 * @author auto create
 * @since 1.0, 2023-01-11 04:31:47
 */
public class KoubeiCateringPosMaterialQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 7683316819946724465L;

	/** 
	 * 配料对象
	 */
	@ApiListField("material_entity_list")
	@ApiField("material_entity")
	private List<MaterialEntity> materialEntityList;

	public void setMaterialEntityList(List<MaterialEntity> materialEntityList) {
		this.materialEntityList = materialEntityList;
	}
	public List<MaterialEntity> getMaterialEntityList( ) {
		return this.materialEntityList;
	}

}
