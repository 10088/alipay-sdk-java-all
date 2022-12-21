package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.BcClusterMsgRecord;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.social.base.bc.clustermsg.query response.
 * 
 * @author auto create
 * @since 1.0, 2022-12-07 15:07:57
 */
public class AlipaySocialBaseBcClustermsgQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 1143486268585783435L;

	/** 
	 * 消息记录
	 */
	@ApiListField("msg_records")
	@ApiField("bc_cluster_msg_record")
	private List<BcClusterMsgRecord> msgRecords;

	public void setMsgRecords(List<BcClusterMsgRecord> msgRecords) {
		this.msgRecords = msgRecords;
	}
	public List<BcClusterMsgRecord> getMsgRecords( ) {
		return this.msgRecords;
	}

}
