/*
 * 支付宝开放平台API
 * 支付宝开放平台v3协议文档
 *
 * The version of the OpenAPI document: 2022-12-30
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.alipay.v3.model;

import java.util.Objects;
import java.util.Arrays;
import com.alipay.v3.model.PaidOuterCardTemplateConfDTO;
import com.alipay.v3.model.PubChannelDTO;
import com.alipay.v3.model.TemplateActionInfoDTO;
import com.alipay.v3.model.TemplateBenefitInfoDTO;
import com.alipay.v3.model.TemplateCardLevelConfDTO;
import com.alipay.v3.model.TemplateColumnInfoDTO;
import com.alipay.v3.model.TemplateFieldRuleDTO;
import com.alipay.v3.model.TemplateMdcodeNotifyConfDTO;
import com.alipay.v3.model.TemplateOpenCardConfDTO;
import com.alipay.v3.model.TemplateStyleInfoDTO;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.alipay.v3.JSON;

/**
 * AlipayMarketingCardTemplateQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayMarketingCardTemplateQueryResponseModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_BIZ_NO_PREFIX = "biz_no_prefix";
  @SerializedName(SERIALIZED_NAME_BIZ_NO_PREFIX)
  private String bizNoPrefix;

  public static final String SERIALIZED_NAME_BIZ_NO_SUFFIX_LEN = "biz_no_suffix_len";
  @SerializedName(SERIALIZED_NAME_BIZ_NO_SUFFIX_LEN)
  private String bizNoSuffixLen;

  public static final String SERIALIZED_NAME_CARD_ACTION_LIST = "card_action_list";
  @SerializedName(SERIALIZED_NAME_CARD_ACTION_LIST)
  private List<TemplateActionInfoDTO> cardActionList = null;

  public static final String SERIALIZED_NAME_CARD_LEVEL_CONFS = "card_level_confs";
  @SerializedName(SERIALIZED_NAME_CARD_LEVEL_CONFS)
  private List<TemplateCardLevelConfDTO> cardLevelConfs = null;

  public static final String SERIALIZED_NAME_CARD_SPEC_TAG = "card_spec_tag";
  @SerializedName(SERIALIZED_NAME_CARD_SPEC_TAG)
  private String cardSpecTag;

  public static final String SERIALIZED_NAME_CARD_TYPE = "card_type";
  @SerializedName(SERIALIZED_NAME_CARD_TYPE)
  private String cardType;

  public static final String SERIALIZED_NAME_COLUMN_INFO_LIST = "column_info_list";
  @SerializedName(SERIALIZED_NAME_COLUMN_INFO_LIST)
  private List<TemplateColumnInfoDTO> columnInfoList = null;

  public static final String SERIALIZED_NAME_FIELD_RULE_LIST = "field_rule_list";
  @SerializedName(SERIALIZED_NAME_FIELD_RULE_LIST)
  private List<TemplateFieldRuleDTO> fieldRuleList = null;

  public static final String SERIALIZED_NAME_MDCODE_NOTIFY_CONF = "mdcode_notify_conf";
  @SerializedName(SERIALIZED_NAME_MDCODE_NOTIFY_CONF)
  private TemplateMdcodeNotifyConfDTO mdcodeNotifyConf;

  public static final String SERIALIZED_NAME_OPEN_CARD_CONF = "open_card_conf";
  @SerializedName(SERIALIZED_NAME_OPEN_CARD_CONF)
  private TemplateOpenCardConfDTO openCardConf;

  public static final String SERIALIZED_NAME_PAID_OUTER_CARD_CONF = "paid_outer_card_conf";
  @SerializedName(SERIALIZED_NAME_PAID_OUTER_CARD_CONF)
  private PaidOuterCardTemplateConfDTO paidOuterCardConf;

  public static final String SERIALIZED_NAME_PUB_CHANNELS = "pub_channels";
  @SerializedName(SERIALIZED_NAME_PUB_CHANNELS)
  private List<PubChannelDTO> pubChannels = null;

  public static final String SERIALIZED_NAME_SERVICE_LABEL_LIST = "service_label_list";
  @SerializedName(SERIALIZED_NAME_SERVICE_LABEL_LIST)
  private List<String> serviceLabelList = null;

  public static final String SERIALIZED_NAME_SHOP_IDS = "shop_ids";
  @SerializedName(SERIALIZED_NAME_SHOP_IDS)
  private List<String> shopIds = null;

  public static final String SERIALIZED_NAME_SPI_APP_ID = "spi_app_id";
  @SerializedName(SERIALIZED_NAME_SPI_APP_ID)
  private String spiAppId;

  public static final String SERIALIZED_NAME_TEMPLATE_BENEFIT_INFO = "template_benefit_info";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_BENEFIT_INFO)
  private List<TemplateBenefitInfoDTO> templateBenefitInfo = null;

  public static final String SERIALIZED_NAME_TEMPLATE_STYLE_INFO = "template_style_info";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_STYLE_INFO)
  private TemplateStyleInfoDTO templateStyleInfo;

  public AlipayMarketingCardTemplateQueryResponseModel() { 
  }

  public AlipayMarketingCardTemplateQueryResponseModel bizNoPrefix(String bizNoPrefix) {
    
    this.bizNoPrefix = bizNoPrefix;
    return this;
  }

   /**
   * 业务卡号前缀，由商户指定  支付宝业务卡号生成规则：biz_no_prefix(商户指定)卡号前缀 + biz_no_suffix(实时生成）卡号后缀
   * @return bizNoPrefix
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "prex", value = "业务卡号前缀，由商户指定  支付宝业务卡号生成规则：biz_no_prefix(商户指定)卡号前缀 + biz_no_suffix(实时生成）卡号后缀")

  public String getBizNoPrefix() {
    return bizNoPrefix;
  }


  public void setBizNoPrefix(String bizNoPrefix) {
    this.bizNoPrefix = bizNoPrefix;
  }


  public AlipayMarketingCardTemplateQueryResponseModel bizNoSuffixLen(String bizNoSuffixLen) {
    
    this.bizNoSuffixLen = bizNoSuffixLen;
    return this;
  }

   /**
   * 业务卡号后缀的长度  支付宝业务卡号生成规则：biz_no_prefix(商户指定)卡号前缀 + biz_no_suffix(实时生成）卡号后缀
   * @return bizNoSuffixLen
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "业务卡号后缀的长度  支付宝业务卡号生成规则：biz_no_prefix(商户指定)卡号前缀 + biz_no_suffix(实时生成）卡号后缀")

  public String getBizNoSuffixLen() {
    return bizNoSuffixLen;
  }


  public void setBizNoSuffixLen(String bizNoSuffixLen) {
    this.bizNoSuffixLen = bizNoSuffixLen;
  }


  public AlipayMarketingCardTemplateQueryResponseModel cardActionList(List<TemplateActionInfoDTO> cardActionList) {
    
    this.cardActionList = cardActionList;
    return this;
  }

  public AlipayMarketingCardTemplateQueryResponseModel addCardActionListItem(TemplateActionInfoDTO cardActionListItem) {
    if (this.cardActionList == null) {
      this.cardActionList = new ArrayList<>();
    }
    this.cardActionList.add(cardActionListItem);
    return this;
  }

   /**
   * 卡行动点配置；  行动点，即用户可点击跳转的区块，类似按钮控件的交互；  单张卡最多4个行动点。
   * @return cardActionList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "卡行动点配置；  行动点，即用户可点击跳转的区块，类似按钮控件的交互；  单张卡最多4个行动点。")

  public List<TemplateActionInfoDTO> getCardActionList() {
    return cardActionList;
  }


  public void setCardActionList(List<TemplateActionInfoDTO> cardActionList) {
    this.cardActionList = cardActionList;
  }


  public AlipayMarketingCardTemplateQueryResponseModel cardLevelConfs(List<TemplateCardLevelConfDTO> cardLevelConfs) {
    
    this.cardLevelConfs = cardLevelConfs;
    return this;
  }

  public AlipayMarketingCardTemplateQueryResponseModel addCardLevelConfsItem(TemplateCardLevelConfDTO cardLevelConfsItem) {
    if (this.cardLevelConfs == null) {
      this.cardLevelConfs = new ArrayList<>();
    }
    this.cardLevelConfs.add(cardLevelConfsItem);
    return this;
  }

   /**
   * 卡等级配置
   * @return cardLevelConfs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "卡等级配置")

  public List<TemplateCardLevelConfDTO> getCardLevelConfs() {
    return cardLevelConfs;
  }


  public void setCardLevelConfs(List<TemplateCardLevelConfDTO> cardLevelConfs) {
    this.cardLevelConfs = cardLevelConfs;
  }


  public AlipayMarketingCardTemplateQueryResponseModel cardSpecTag(String cardSpecTag) {
    
    this.cardSpecTag = cardSpecTag;
    return this;
  }

   /**
   * 卡特定标签，只供特定业务使用，通常接入无需关注
   * @return cardSpecTag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "NONE", value = "卡特定标签，只供特定业务使用，通常接入无需关注")

  public String getCardSpecTag() {
    return cardSpecTag;
  }


  public void setCardSpecTag(String cardSpecTag) {
    this.cardSpecTag = cardSpecTag;
  }


  public AlipayMarketingCardTemplateQueryResponseModel cardType(String cardType) {
    
    this.cardType = cardType;
    return this;
  }

   /**
   * 会员卡类型：  OUT_MEMBER_CARD：外部权益卡
   * @return cardType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "OUT_MEMBER_CARD", value = "会员卡类型：  OUT_MEMBER_CARD：外部权益卡")

  public String getCardType() {
    return cardType;
  }


  public void setCardType(String cardType) {
    this.cardType = cardType;
  }


  public AlipayMarketingCardTemplateQueryResponseModel columnInfoList(List<TemplateColumnInfoDTO> columnInfoList) {
    
    this.columnInfoList = columnInfoList;
    return this;
  }

  public AlipayMarketingCardTemplateQueryResponseModel addColumnInfoListItem(TemplateColumnInfoDTO columnInfoListItem) {
    if (this.columnInfoList == null) {
      this.columnInfoList = new ArrayList<>();
    }
    this.columnInfoList.add(columnInfoListItem);
    return this;
  }

   /**
   * 栏位信息（卡包详情页面展现的栏位）
   * @return columnInfoList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "栏位信息（卡包详情页面展现的栏位）")

  public List<TemplateColumnInfoDTO> getColumnInfoList() {
    return columnInfoList;
  }


  public void setColumnInfoList(List<TemplateColumnInfoDTO> columnInfoList) {
    this.columnInfoList = columnInfoList;
  }


  public AlipayMarketingCardTemplateQueryResponseModel fieldRuleList(List<TemplateFieldRuleDTO> fieldRuleList) {
    
    this.fieldRuleList = fieldRuleList;
    return this;
  }

  public AlipayMarketingCardTemplateQueryResponseModel addFieldRuleListItem(TemplateFieldRuleDTO fieldRuleListItem) {
    if (this.fieldRuleList == null) {
      this.fieldRuleList = new ArrayList<>();
    }
    this.fieldRuleList.add(fieldRuleListItem);
    return this;
  }

   /**
   * 字段规则列表，会员卡开卡过程中，会员卡信息的生成规则，  例如：卡有效期为开卡后两年内有效，则设置为：DATE_IN_FUTURE
   * @return fieldRuleList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "字段规则列表，会员卡开卡过程中，会员卡信息的生成规则，  例如：卡有效期为开卡后两年内有效，则设置为：DATE_IN_FUTURE")

  public List<TemplateFieldRuleDTO> getFieldRuleList() {
    return fieldRuleList;
  }


  public void setFieldRuleList(List<TemplateFieldRuleDTO> fieldRuleList) {
    this.fieldRuleList = fieldRuleList;
  }


  public AlipayMarketingCardTemplateQueryResponseModel mdcodeNotifyConf(TemplateMdcodeNotifyConfDTO mdcodeNotifyConf) {
    
    this.mdcodeNotifyConf = mdcodeNotifyConf;
    return this;
  }

   /**
   * Get mdcodeNotifyConf
   * @return mdcodeNotifyConf
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TemplateMdcodeNotifyConfDTO getMdcodeNotifyConf() {
    return mdcodeNotifyConf;
  }


  public void setMdcodeNotifyConf(TemplateMdcodeNotifyConfDTO mdcodeNotifyConf) {
    this.mdcodeNotifyConf = mdcodeNotifyConf;
  }


  public AlipayMarketingCardTemplateQueryResponseModel openCardConf(TemplateOpenCardConfDTO openCardConf) {
    
    this.openCardConf = openCardConf;
    return this;
  }

   /**
   * Get openCardConf
   * @return openCardConf
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TemplateOpenCardConfDTO getOpenCardConf() {
    return openCardConf;
  }


  public void setOpenCardConf(TemplateOpenCardConfDTO openCardConf) {
    this.openCardConf = openCardConf;
  }


  public AlipayMarketingCardTemplateQueryResponseModel paidOuterCardConf(PaidOuterCardTemplateConfDTO paidOuterCardConf) {
    
    this.paidOuterCardConf = paidOuterCardConf;
    return this;
  }

   /**
   * Get paidOuterCardConf
   * @return paidOuterCardConf
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public PaidOuterCardTemplateConfDTO getPaidOuterCardConf() {
    return paidOuterCardConf;
  }


  public void setPaidOuterCardConf(PaidOuterCardTemplateConfDTO paidOuterCardConf) {
    this.paidOuterCardConf = paidOuterCardConf;
  }


  public AlipayMarketingCardTemplateQueryResponseModel pubChannels(List<PubChannelDTO> pubChannels) {
    
    this.pubChannels = pubChannels;
    return this;
  }

  public AlipayMarketingCardTemplateQueryResponseModel addPubChannelsItem(PubChannelDTO pubChannelsItem) {
    if (this.pubChannels == null) {
      this.pubChannels = new ArrayList<>();
    }
    this.pubChannels.add(pubChannelsItem);
    return this;
  }

   /**
   * 卡模板投放渠道
   * @return pubChannels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "卡模板投放渠道")

  public List<PubChannelDTO> getPubChannels() {
    return pubChannels;
  }


  public void setPubChannels(List<PubChannelDTO> pubChannels) {
    this.pubChannels = pubChannels;
  }


  public AlipayMarketingCardTemplateQueryResponseModel serviceLabelList(List<String> serviceLabelList) {
    
    this.serviceLabelList = serviceLabelList;
    return this;
  }

  public AlipayMarketingCardTemplateQueryResponseModel addServiceLabelListItem(String serviceLabelListItem) {
    if (this.serviceLabelList == null) {
      this.serviceLabelList = new ArrayList<>();
    }
    this.serviceLabelList.add(serviceLabelListItem);
    return this;
  }

   /**
   * 服务标签列表
   * @return serviceLabelList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Checklater", value = "服务标签列表")

  public List<String> getServiceLabelList() {
    return serviceLabelList;
  }


  public void setServiceLabelList(List<String> serviceLabelList) {
    this.serviceLabelList = serviceLabelList;
  }


  public AlipayMarketingCardTemplateQueryResponseModel shopIds(List<String> shopIds) {
    
    this.shopIds = shopIds;
    return this;
  }

  public AlipayMarketingCardTemplateQueryResponseModel addShopIdsItem(String shopIdsItem) {
    if (this.shopIds == null) {
      this.shopIds = new ArrayList<>();
    }
    this.shopIds.add(shopIdsItem);
    return this;
  }

   /**
   * 门店ids
   * @return shopIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"2015122900077000000002409504\"]", value = "门店ids")

  public List<String> getShopIds() {
    return shopIds;
  }


  public void setShopIds(List<String> shopIds) {
    this.shopIds = shopIds;
  }


  public AlipayMarketingCardTemplateQueryResponseModel spiAppId(String spiAppId) {
    
    this.spiAppId = spiAppId;
    return this;
  }

   /**
   * spi_app_id：若使用openspi模式开卡，该字段为创建模版时，设置的实现spi.alipay.user.opencard.get接口的app_id
   * @return spiAppId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2014072300007148", value = "spi_app_id：若使用openspi模式开卡，该字段为创建模版时，设置的实现spi.alipay.user.opencard.get接口的app_id")

  public String getSpiAppId() {
    return spiAppId;
  }


  public void setSpiAppId(String spiAppId) {
    this.spiAppId = spiAppId;
  }


  public AlipayMarketingCardTemplateQueryResponseModel templateBenefitInfo(List<TemplateBenefitInfoDTO> templateBenefitInfo) {
    
    this.templateBenefitInfo = templateBenefitInfo;
    return this;
  }

  public AlipayMarketingCardTemplateQueryResponseModel addTemplateBenefitInfoItem(TemplateBenefitInfoDTO templateBenefitInfoItem) {
    if (this.templateBenefitInfo == null) {
      this.templateBenefitInfo = new ArrayList<>();
    }
    this.templateBenefitInfo.add(templateBenefitInfoItem);
    return this;
  }

   /**
   * 权益信息，  1、在卡包的卡详情页面会自动添加权益栏位，展现会员卡特权，  2、如果添加门店渠道，则可在门店页展现会员卡的权益
   * @return templateBenefitInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "权益信息，  1、在卡包的卡详情页面会自动添加权益栏位，展现会员卡特权，  2、如果添加门店渠道，则可在门店页展现会员卡的权益")

  public List<TemplateBenefitInfoDTO> getTemplateBenefitInfo() {
    return templateBenefitInfo;
  }


  public void setTemplateBenefitInfo(List<TemplateBenefitInfoDTO> templateBenefitInfo) {
    this.templateBenefitInfo = templateBenefitInfo;
  }


  public AlipayMarketingCardTemplateQueryResponseModel templateStyleInfo(TemplateStyleInfoDTO templateStyleInfo) {
    
    this.templateStyleInfo = templateStyleInfo;
    return this;
  }

   /**
   * Get templateStyleInfo
   * @return templateStyleInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TemplateStyleInfoDTO getTemplateStyleInfo() {
    return templateStyleInfo;
  }


  public void setTemplateStyleInfo(TemplateStyleInfoDTO templateStyleInfo) {
    this.templateStyleInfo = templateStyleInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayMarketingCardTemplateQueryResponseModel alipayMarketingCardTemplateQueryResponseModel = (AlipayMarketingCardTemplateQueryResponseModel) o;
    return Objects.equals(this.bizNoPrefix, alipayMarketingCardTemplateQueryResponseModel.bizNoPrefix) &&
        Objects.equals(this.bizNoSuffixLen, alipayMarketingCardTemplateQueryResponseModel.bizNoSuffixLen) &&
        Objects.equals(this.cardActionList, alipayMarketingCardTemplateQueryResponseModel.cardActionList) &&
        Objects.equals(this.cardLevelConfs, alipayMarketingCardTemplateQueryResponseModel.cardLevelConfs) &&
        Objects.equals(this.cardSpecTag, alipayMarketingCardTemplateQueryResponseModel.cardSpecTag) &&
        Objects.equals(this.cardType, alipayMarketingCardTemplateQueryResponseModel.cardType) &&
        Objects.equals(this.columnInfoList, alipayMarketingCardTemplateQueryResponseModel.columnInfoList) &&
        Objects.equals(this.fieldRuleList, alipayMarketingCardTemplateQueryResponseModel.fieldRuleList) &&
        Objects.equals(this.mdcodeNotifyConf, alipayMarketingCardTemplateQueryResponseModel.mdcodeNotifyConf) &&
        Objects.equals(this.openCardConf, alipayMarketingCardTemplateQueryResponseModel.openCardConf) &&
        Objects.equals(this.paidOuterCardConf, alipayMarketingCardTemplateQueryResponseModel.paidOuterCardConf) &&
        Objects.equals(this.pubChannels, alipayMarketingCardTemplateQueryResponseModel.pubChannels) &&
        Objects.equals(this.serviceLabelList, alipayMarketingCardTemplateQueryResponseModel.serviceLabelList) &&
        Objects.equals(this.shopIds, alipayMarketingCardTemplateQueryResponseModel.shopIds) &&
        Objects.equals(this.spiAppId, alipayMarketingCardTemplateQueryResponseModel.spiAppId) &&
        Objects.equals(this.templateBenefitInfo, alipayMarketingCardTemplateQueryResponseModel.templateBenefitInfo) &&
        Objects.equals(this.templateStyleInfo, alipayMarketingCardTemplateQueryResponseModel.templateStyleInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bizNoPrefix, bizNoSuffixLen, cardActionList, cardLevelConfs, cardSpecTag, cardType, columnInfoList, fieldRuleList, mdcodeNotifyConf, openCardConf, paidOuterCardConf, pubChannels, serviceLabelList, shopIds, spiAppId, templateBenefitInfo, templateStyleInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayMarketingCardTemplateQueryResponseModel {\n");
    sb.append("    bizNoPrefix: ").append(toIndentedString(bizNoPrefix)).append("\n");
    sb.append("    bizNoSuffixLen: ").append(toIndentedString(bizNoSuffixLen)).append("\n");
    sb.append("    cardActionList: ").append(toIndentedString(cardActionList)).append("\n");
    sb.append("    cardLevelConfs: ").append(toIndentedString(cardLevelConfs)).append("\n");
    sb.append("    cardSpecTag: ").append(toIndentedString(cardSpecTag)).append("\n");
    sb.append("    cardType: ").append(toIndentedString(cardType)).append("\n");
    sb.append("    columnInfoList: ").append(toIndentedString(columnInfoList)).append("\n");
    sb.append("    fieldRuleList: ").append(toIndentedString(fieldRuleList)).append("\n");
    sb.append("    mdcodeNotifyConf: ").append(toIndentedString(mdcodeNotifyConf)).append("\n");
    sb.append("    openCardConf: ").append(toIndentedString(openCardConf)).append("\n");
    sb.append("    paidOuterCardConf: ").append(toIndentedString(paidOuterCardConf)).append("\n");
    sb.append("    pubChannels: ").append(toIndentedString(pubChannels)).append("\n");
    sb.append("    serviceLabelList: ").append(toIndentedString(serviceLabelList)).append("\n");
    sb.append("    shopIds: ").append(toIndentedString(shopIds)).append("\n");
    sb.append("    spiAppId: ").append(toIndentedString(spiAppId)).append("\n");
    sb.append("    templateBenefitInfo: ").append(toIndentedString(templateBenefitInfo)).append("\n");
    sb.append("    templateStyleInfo: ").append(toIndentedString(templateStyleInfo)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("biz_no_prefix");
    openapiFields.add("biz_no_suffix_len");
    openapiFields.add("card_action_list");
    openapiFields.add("card_level_confs");
    openapiFields.add("card_spec_tag");
    openapiFields.add("card_type");
    openapiFields.add("column_info_list");
    openapiFields.add("field_rule_list");
    openapiFields.add("mdcode_notify_conf");
    openapiFields.add("open_card_conf");
    openapiFields.add("paid_outer_card_conf");
    openapiFields.add("pub_channels");
    openapiFields.add("service_label_list");
    openapiFields.add("shop_ids");
    openapiFields.add("spi_app_id");
    openapiFields.add("template_benefit_info");
    openapiFields.add("template_style_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayMarketingCardTemplateQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayMarketingCardTemplateQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayMarketingCardTemplateQueryResponseModel is not found in the empty JSON string", AlipayMarketingCardTemplateQueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayMarketingCardTemplateQueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayMarketingCardTemplateQueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("biz_no_prefix") != null && !jsonObj.get("biz_no_prefix").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biz_no_prefix` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biz_no_prefix").toString()));
      }
      if (jsonObj.get("biz_no_suffix_len") != null && !jsonObj.get("biz_no_suffix_len").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biz_no_suffix_len` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biz_no_suffix_len").toString()));
      }
      JsonArray jsonArraycardActionList = jsonObj.getAsJsonArray("card_action_list");
      if (jsonArraycardActionList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("card_action_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `card_action_list` to be an array in the JSON string but got `%s`", jsonObj.get("card_action_list").toString()));
        }

        // validate the optional field `card_action_list` (array)
        for (int i = 0; i < jsonArraycardActionList.size(); i++) {
          TemplateActionInfoDTO.validateJsonObject(jsonArraycardActionList.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArraycardLevelConfs = jsonObj.getAsJsonArray("card_level_confs");
      if (jsonArraycardLevelConfs != null) {
        // ensure the json data is an array
        if (!jsonObj.get("card_level_confs").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `card_level_confs` to be an array in the JSON string but got `%s`", jsonObj.get("card_level_confs").toString()));
        }

        // validate the optional field `card_level_confs` (array)
        for (int i = 0; i < jsonArraycardLevelConfs.size(); i++) {
          TemplateCardLevelConfDTO.validateJsonObject(jsonArraycardLevelConfs.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("card_spec_tag") != null && !jsonObj.get("card_spec_tag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_spec_tag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_spec_tag").toString()));
      }
      if (jsonObj.get("card_type") != null && !jsonObj.get("card_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `card_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("card_type").toString()));
      }
      JsonArray jsonArraycolumnInfoList = jsonObj.getAsJsonArray("column_info_list");
      if (jsonArraycolumnInfoList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("column_info_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `column_info_list` to be an array in the JSON string but got `%s`", jsonObj.get("column_info_list").toString()));
        }

        // validate the optional field `column_info_list` (array)
        for (int i = 0; i < jsonArraycolumnInfoList.size(); i++) {
          TemplateColumnInfoDTO.validateJsonObject(jsonArraycolumnInfoList.get(i).getAsJsonObject());
        };
      }
      JsonArray jsonArrayfieldRuleList = jsonObj.getAsJsonArray("field_rule_list");
      if (jsonArrayfieldRuleList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("field_rule_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `field_rule_list` to be an array in the JSON string but got `%s`", jsonObj.get("field_rule_list").toString()));
        }

        // validate the optional field `field_rule_list` (array)
        for (int i = 0; i < jsonArrayfieldRuleList.size(); i++) {
          TemplateFieldRuleDTO.validateJsonObject(jsonArrayfieldRuleList.get(i).getAsJsonObject());
        };
      }
      // validate the optional field `mdcode_notify_conf`
      if (jsonObj.getAsJsonObject("mdcode_notify_conf") != null) {
        TemplateMdcodeNotifyConfDTO.validateJsonObject(jsonObj.getAsJsonObject("mdcode_notify_conf"));
      }
      // validate the optional field `open_card_conf`
      if (jsonObj.getAsJsonObject("open_card_conf") != null) {
        TemplateOpenCardConfDTO.validateJsonObject(jsonObj.getAsJsonObject("open_card_conf"));
      }
      // validate the optional field `paid_outer_card_conf`
      if (jsonObj.getAsJsonObject("paid_outer_card_conf") != null) {
        PaidOuterCardTemplateConfDTO.validateJsonObject(jsonObj.getAsJsonObject("paid_outer_card_conf"));
      }
      JsonArray jsonArraypubChannels = jsonObj.getAsJsonArray("pub_channels");
      if (jsonArraypubChannels != null) {
        // ensure the json data is an array
        if (!jsonObj.get("pub_channels").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `pub_channels` to be an array in the JSON string but got `%s`", jsonObj.get("pub_channels").toString()));
        }

        // validate the optional field `pub_channels` (array)
        for (int i = 0; i < jsonArraypubChannels.size(); i++) {
          PubChannelDTO.validateJsonObject(jsonArraypubChannels.get(i).getAsJsonObject());
        };
      }
      // ensure the json data is an array
      if (jsonObj.get("service_label_list") != null && !jsonObj.get("service_label_list").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `service_label_list` to be an array in the JSON string but got `%s`", jsonObj.get("service_label_list").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("shop_ids") != null && !jsonObj.get("shop_ids").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `shop_ids` to be an array in the JSON string but got `%s`", jsonObj.get("shop_ids").toString()));
      }
      if (jsonObj.get("spi_app_id") != null && !jsonObj.get("spi_app_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `spi_app_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("spi_app_id").toString()));
      }
      JsonArray jsonArraytemplateBenefitInfo = jsonObj.getAsJsonArray("template_benefit_info");
      if (jsonArraytemplateBenefitInfo != null) {
        // ensure the json data is an array
        if (!jsonObj.get("template_benefit_info").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `template_benefit_info` to be an array in the JSON string but got `%s`", jsonObj.get("template_benefit_info").toString()));
        }

        // validate the optional field `template_benefit_info` (array)
        for (int i = 0; i < jsonArraytemplateBenefitInfo.size(); i++) {
          TemplateBenefitInfoDTO.validateJsonObject(jsonArraytemplateBenefitInfo.get(i).getAsJsonObject());
        };
      }
      // validate the optional field `template_style_info`
      if (jsonObj.getAsJsonObject("template_style_info") != null) {
        TemplateStyleInfoDTO.validateJsonObject(jsonObj.getAsJsonObject("template_style_info"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayMarketingCardTemplateQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayMarketingCardTemplateQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayMarketingCardTemplateQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayMarketingCardTemplateQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayMarketingCardTemplateQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayMarketingCardTemplateQueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayMarketingCardTemplateQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayMarketingCardTemplateQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayMarketingCardTemplateQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayMarketingCardTemplateQueryResponseModel
  */
  public static AlipayMarketingCardTemplateQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayMarketingCardTemplateQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayMarketingCardTemplateQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

