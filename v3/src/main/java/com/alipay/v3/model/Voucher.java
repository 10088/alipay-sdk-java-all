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
import com.alipay.v3.model.ClauseTerm;
import com.alipay.v3.model.DelayInfo;
import com.alipay.v3.model.DisplayConfig;
import com.alipay.v3.model.ItemInfo;
import com.alipay.v3.model.UseRule;
import com.alipay.v3.model.VoucherDescDetail;
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
 * Voucher
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Voucher {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ALLOW_SPLIT = "allow_split";
  @SerializedName(SERIALIZED_NAME_ALLOW_SPLIT)
  private Boolean allowSplit;

  public static final String SERIALIZED_NAME_AVAILABLE_AMOUNT = "available_amount";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_AMOUNT)
  private String availableAmount;

  public static final String SERIALIZED_NAME_BRAND_NAME = "brand_name";
  @SerializedName(SERIALIZED_NAME_BRAND_NAME)
  private String brandName;

  public static final String SERIALIZED_NAME_CLAUSE_TERMS = "clause_terms";
  @SerializedName(SERIALIZED_NAME_CLAUSE_TERMS)
  private List<ClauseTerm> clauseTerms = null;

  public static final String SERIALIZED_NAME_DELAY_INFO = "delay_info";
  @SerializedName(SERIALIZED_NAME_DELAY_INFO)
  private DelayInfo delayInfo;

  public static final String SERIALIZED_NAME_DESC = "desc";
  @SerializedName(SERIALIZED_NAME_DESC)
  private String desc;

  public static final String SERIALIZED_NAME_DESC_DETAIL_LIST = "desc_detail_list";
  @SerializedName(SERIALIZED_NAME_DESC_DETAIL_LIST)
  private List<VoucherDescDetail> descDetailList = null;

  public static final String SERIALIZED_NAME_DISPLAY_CONFIG = "display_config";
  @SerializedName(SERIALIZED_NAME_DISPLAY_CONFIG)
  private DisplayConfig displayConfig;

  public static final String SERIALIZED_NAME_DONATE_FLAG = "donate_flag";
  @SerializedName(SERIALIZED_NAME_DONATE_FLAG)
  private String donateFlag;

  public static final String SERIALIZED_NAME_EFFECT_TYPE = "effect_type";
  @SerializedName(SERIALIZED_NAME_EFFECT_TYPE)
  private String effectType;

  public static final String SERIALIZED_NAME_END_TIME = "end_time";
  @SerializedName(SERIALIZED_NAME_END_TIME)
  private String endTime;

  public static final String SERIALIZED_NAME_EXT_INFO = "ext_info";
  @SerializedName(SERIALIZED_NAME_EXT_INFO)
  private String extInfo;

  public static final String SERIALIZED_NAME_ITEM_INFO = "item_info";
  @SerializedName(SERIALIZED_NAME_ITEM_INFO)
  private ItemInfo itemInfo;

  public static final String SERIALIZED_NAME_LOGO = "logo";
  @SerializedName(SERIALIZED_NAME_LOGO)
  private String logo;

  public static final String SERIALIZED_NAME_MAX_AMOUNT = "max_amount";
  @SerializedName(SERIALIZED_NAME_MAX_AMOUNT)
  private String maxAmount;

  public static final String SERIALIZED_NAME_MULTI_USE_MODE = "multi_use_mode";
  @SerializedName(SERIALIZED_NAME_MULTI_USE_MODE)
  private String multiUseMode;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_RATE = "rate";
  @SerializedName(SERIALIZED_NAME_RATE)
  private String rate;

  public static final String SERIALIZED_NAME_RELATIVE_TIME = "relative_time";
  @SerializedName(SERIALIZED_NAME_RELATIVE_TIME)
  private String relativeTime;

  public static final String SERIALIZED_NAME_ROUNDING_RULE = "rounding_rule";
  @SerializedName(SERIALIZED_NAME_ROUNDING_RULE)
  private String roundingRule;

  public static final String SERIALIZED_NAME_START_TIME = "start_time";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private String startTime;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_USE_INSTRUCTIONS = "use_instructions";
  @SerializedName(SERIALIZED_NAME_USE_INSTRUCTIONS)
  private List<String> useInstructions = null;

  public static final String SERIALIZED_NAME_USE_RULE = "use_rule";
  @SerializedName(SERIALIZED_NAME_USE_RULE)
  private UseRule useRule;

  public static final String SERIALIZED_NAME_VALIDATE_TYPE = "validate_type";
  @SerializedName(SERIALIZED_NAME_VALIDATE_TYPE)
  private String validateType;

  public static final String SERIALIZED_NAME_VERIFY_MODE = "verify_mode";
  @SerializedName(SERIALIZED_NAME_VERIFY_MODE)
  private String verifyMode;

  public static final String SERIALIZED_NAME_VOUCHER_IMG = "voucher_img";
  @SerializedName(SERIALIZED_NAME_VOUCHER_IMG)
  private String voucherImg;

  public static final String SERIALIZED_NAME_VOUCHER_NOTE = "voucher_note";
  @SerializedName(SERIALIZED_NAME_VOUCHER_NOTE)
  private String voucherNote;

  public static final String SERIALIZED_NAME_WORTH_VALUE = "worth_value";
  @SerializedName(SERIALIZED_NAME_WORTH_VALUE)
  private String worthValue;

  public Voucher() { 
  }

  public Voucher allowSplit(Boolean allowSplit) {
    
    this.allowSplit = allowSplit;
    return this;
  }

   /**
   * 是否允许拆分，券在核销的时候是否允许券的面额拆分使用。(仅限渠道类型为ISV企业福利：ISV_ENTERPRISE_BENIFIT的场景使用)
   * @return allowSplit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "是否允许拆分，券在核销的时候是否允许券的面额拆分使用。(仅限渠道类型为ISV企业福利：ISV_ENTERPRISE_BENIFIT的场景使用)")

  public Boolean getAllowSplit() {
    return allowSplit;
  }


  public void setAllowSplit(Boolean allowSplit) {
    this.allowSplit = allowSplit;
  }


  public Voucher availableAmount(String availableAmount) {
    
    this.availableAmount = availableAmount;
    return this;
  }

   /**
   * 券剩余面额，单位元  券详情查询接口返回，可拆分券中的券详情展示用
   * @return availableAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100", value = "券剩余面额，单位元  券详情查询接口返回，可拆分券中的券详情展示用")

  public String getAvailableAmount() {
    return availableAmount;
  }


  public void setAvailableAmount(String availableAmount) {
    this.availableAmount = availableAmount;
  }


  public Voucher brandName(String brandName) {
    
    this.brandName = brandName;
    return this;
  }

   /**
   * 券副标题
   * @return brandName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "券副标题", value = "券副标题")

  public String getBrandName() {
    return brandName;
  }


  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }


  public Voucher clauseTerms(List<ClauseTerm> clauseTerms) {
    
    this.clauseTerms = clauseTerms;
    return this;
  }

  public Voucher addClauseTermsItem(ClauseTerm clauseTermsItem) {
    if (this.clauseTerms == null) {
      this.clauseTerms = new ArrayList<>();
    }
    this.clauseTerms.add(clauseTermsItem);
    return this;
  }

   /**
   * 券的说明条款
   * @return clauseTerms
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "券的说明条款")

  public List<ClauseTerm> getClauseTerms() {
    return clauseTerms;
  }


  public void setClauseTerms(List<ClauseTerm> clauseTerms) {
    this.clauseTerms = clauseTerms;
  }


  public Voucher delayInfo(DelayInfo delayInfo) {
    
    this.delayInfo = delayInfo;
    return this;
  }

   /**
   * Get delayInfo
   * @return delayInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DelayInfo getDelayInfo() {
    return delayInfo;
  }


  public void setDelayInfo(DelayInfo delayInfo) {
    this.delayInfo = delayInfo;
  }


  public Voucher desc(String desc) {
    
    this.desc = desc;
    return this;
  }

   /**
   * 券详细说明  最多包含500个字符
   * @return desc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "券的详细说明", value = "券详细说明  最多包含500个字符")

  public String getDesc() {
    return desc;
  }


  public void setDesc(String desc) {
    this.desc = desc;
  }


  public Voucher descDetailList(List<VoucherDescDetail> descDetailList) {
    
    this.descDetailList = descDetailList;
    return this;
  }

  public Voucher addDescDetailListItem(VoucherDescDetail descDetailListItem) {
    if (this.descDetailList == null) {
      this.descDetailList = new ArrayList<>();
    }
    this.descDetailList.add(descDetailListItem);
    return this;
  }

   /**
   * 券使用说明描述列表
   * @return descDetailList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "券使用说明描述列表")

  public List<VoucherDescDetail> getDescDetailList() {
    return descDetailList;
  }


  public void setDescDetailList(List<VoucherDescDetail> descDetailList) {
    this.descDetailList = descDetailList;
  }


  public Voucher displayConfig(DisplayConfig displayConfig) {
    
    this.displayConfig = displayConfig;
    return this;
  }

   /**
   * Get displayConfig
   * @return displayConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DisplayConfig getDisplayConfig() {
    return displayConfig;
  }


  public void setDisplayConfig(DisplayConfig displayConfig) {
    this.displayConfig = displayConfig;
  }


  public Voucher donateFlag(String donateFlag) {
    
    this.donateFlag = donateFlag;
    return this;
  }

   /**
   * 券是否可转赠，默认为可转赠
   * @return donateFlag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "券是否可转赠，默认为可转赠")

  public String getDonateFlag() {
    return donateFlag;
  }


  public void setDonateFlag(String donateFlag) {
    this.donateFlag = donateFlag;
  }


  public Voucher effectType(String effectType) {
    
    this.effectType = effectType;
    return this;
  }

   /**
   * 券生效的方式，目前支持以下方式  立即生效：IMMEDIATELY  延迟生效：DELAY  仅在券有效期类型为相对有效期时生效
   * @return effectType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "IMMEDIATELY", value = "券生效的方式，目前支持以下方式  立即生效：IMMEDIATELY  延迟生效：DELAY  仅在券有效期类型为相对有效期时生效")

  public String getEffectType() {
    return effectType;
  }


  public void setEffectType(String effectType) {
    this.effectType = effectType;
  }


  public Voucher endTime(String endTime) {
    
    this.endTime = endTime;
    return this;
  }

   /**
   * 券有效期的结束时间  仅在券有效期类型为绝对有效期时生效  必须晚于活动结束时间
   * @return endTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016-11-01 00:00:00", value = "券有效期的结束时间  仅在券有效期类型为绝对有效期时生效  必须晚于活动结束时间")

  public String getEndTime() {
    return endTime;
  }


  public void setEndTime(String endTime) {
    this.endTime = endTime;
  }


  public Voucher extInfo(String extInfo) {
    
    this.extInfo = extInfo;
    return this;
  }

   /**
   * 券的扩展信息
   * @return extInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "\"key\":\"value\"", value = "券的扩展信息")

  public String getExtInfo() {
    return extInfo;
  }


  public void setExtInfo(String extInfo) {
    this.extInfo = extInfo;
  }


  public Voucher itemInfo(ItemInfo itemInfo) {
    
    this.itemInfo = itemInfo;
    return this;
  }

   /**
   * Get itemInfo
   * @return itemInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ItemInfo getItemInfo() {
    return itemInfo;
  }


  public void setItemInfo(ItemInfo itemInfo) {
    this.itemInfo = itemInfo;
  }


  public Voucher logo(String logo) {
    
    this.logo = logo;
    return this;
  }

   /**
   * 券LOGO文件ID，调用图片上传接口alipay.offline.material.image.upload获得
   * @return logo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1T8Pp00AT7eo9NoAJkMR3AAAACMAAQEC", value = "券LOGO文件ID，调用图片上传接口alipay.offline.material.image.upload获得")

  public String getLogo() {
    return logo;
  }


  public void setLogo(String logo) {
    this.logo = logo;
  }


  public Voucher maxAmount(String maxAmount) {
    
    this.maxAmount = maxAmount;
    return this;
  }

   /**
   * 最高优惠金额，单位元  指用券最高可以优惠的金额  必须为合法金额类型字符串仅当券类型为折扣券（RATE），每满减券（PER_FULL_CUT）有效
   * @return maxAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100", value = "最高优惠金额，单位元  指用券最高可以优惠的金额  必须为合法金额类型字符串仅当券类型为折扣券（RATE），每满减券（PER_FULL_CUT）有效")

  public String getMaxAmount() {
    return maxAmount;
  }


  public void setMaxAmount(String maxAmount) {
    this.maxAmount = maxAmount;
  }


  public Voucher multiUseMode(String multiUseMode) {
    
    this.multiUseMode = multiUseMode;
    return this;
  }

   /**
   * 券叠加的属性，  仅全场券可设置该选项；  NO_MULTI:不可与其他全场券和单品券叠加;  MULTI_USE_WITH_SINGLE:  该全场优惠和单品优惠的叠加  ；MULTI_USE_WITH_OTHE  RS:该全场优惠和其他所有优惠都可以叠加
   * @return multiUseMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "NO_MULTI", value = "券叠加的属性，  仅全场券可设置该选项；  NO_MULTI:不可与其他全场券和单品券叠加;  MULTI_USE_WITH_SINGLE:  该全场优惠和单品优惠的叠加  ；MULTI_USE_WITH_OTHE  RS:该全场优惠和其他所有优惠都可以叠加")

  public String getMultiUseMode() {
    return multiUseMode;
  }


  public void setMultiUseMode(String multiUseMode) {
    this.multiUseMode = multiUseMode;
  }


  public Voucher name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 名称
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "券的名称", value = "名称")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Voucher rate(String rate) {
    
    this.rate = rate;
    return this;
  }

   /**
   * 折扣率  仅当券类型为折扣券时有效  有效折扣率取值范围0.11-0.99  仅允许保留小数点后两位
   * @return rate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.8", value = "折扣率  仅当券类型为折扣券时有效  有效折扣率取值范围0.11-0.99  仅允许保留小数点后两位")

  public String getRate() {
    return rate;
  }


  public void setRate(String rate) {
    this.rate = rate;
  }


  public Voucher relativeTime(String relativeTime) {
    
    this.relativeTime = relativeTime;
    return this;
  }

   /**
   * 券相对有效期，单位天  仅在券有效期类型为相对有效期时生效  如，设5表示领券领取后5日内有效
   * @return relativeTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "券相对有效期，单位天  仅在券有效期类型为相对有效期时生效  如，设5表示领券领取后5日内有效")

  public String getRelativeTime() {
    return relativeTime;
  }


  public void setRelativeTime(String relativeTime) {
    this.relativeTime = relativeTime;
  }


  public Voucher roundingRule(String roundingRule) {
    
    this.roundingRule = roundingRule;
    return this;
  }

   /**
   * 券核销时，抹零方式，目前支持： NOT_AUTO_ROUNDING:不自动抹零 AUTO_ROUNDING_YUAN:自动抹零到元 AUTO_ROUNDING_JIAO:自动抹零到角 ROUNDING_UP_YUAN:四舍五入到元 ROUNDING_UP_JIAO:四舍五入到角
   * @return roundingRule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "NOT_AUTO_ROUNDING", value = "券核销时，抹零方式，目前支持： NOT_AUTO_ROUNDING:不自动抹零 AUTO_ROUNDING_YUAN:自动抹零到元 AUTO_ROUNDING_JIAO:自动抹零到角 ROUNDING_UP_YUAN:四舍五入到元 ROUNDING_UP_JIAO:四舍五入到角")

  public String getRoundingRule() {
    return roundingRule;
  }


  public void setRoundingRule(String roundingRule) {
    this.roundingRule = roundingRule;
  }


  public Voucher startTime(String startTime) {
    
    this.startTime = startTime;
    return this;
  }

   /**
   * 券有效期的开始时间  仅在券有效期类型为绝对有效期时生效
   * @return startTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016-05-01 00:00:00", value = "券有效期的开始时间  仅在券有效期类型为绝对有效期时生效")

  public String getStartTime() {
    return startTime;
  }


  public void setStartTime(String startTime) {
    this.startTime = startTime;
  }


  public Voucher type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * 券类型，目前支持以下类型：  EXCHANGE：兑换券；  MONEY：代金券；  REDUCETO：减至券；  RATE：折扣券；  PER_FULL_CUT：每满减券
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "MONEY", value = "券类型，目前支持以下类型：  EXCHANGE：兑换券；  MONEY：代金券；  REDUCETO：减至券；  RATE：折扣券；  PER_FULL_CUT：每满减券")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public Voucher useInstructions(List<String> useInstructions) {
    
    this.useInstructions = useInstructions;
    return this;
  }

  public Voucher addUseInstructionsItem(String useInstructionsItem) {
    if (this.useInstructions == null) {
      this.useInstructions = new ArrayList<>();
    }
    this.useInstructions.add(useInstructionsItem);
    return this;
  }

   /**
   * 券的使用说明  使用须知最多6条，且每条最多100字
   * @return useInstructions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "券的使用说明", value = "券的使用说明  使用须知最多6条，且每条最多100字")

  public List<String> getUseInstructions() {
    return useInstructions;
  }


  public void setUseInstructions(List<String> useInstructions) {
    this.useInstructions = useInstructions;
  }


  public Voucher useRule(UseRule useRule) {
    
    this.useRule = useRule;
    return this;
  }

   /**
   * Get useRule
   * @return useRule
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UseRule getUseRule() {
    return useRule;
  }


  public void setUseRule(UseRule useRule) {
    this.useRule = useRule;
  }


  public Voucher validateType(String validateType) {
    
    this.validateType = validateType;
    return this;
  }

   /**
   * 券有效期类型，目前支持以下类型：  RELATIVE：相对有效期  FIXED：绝对有效期
   * @return validateType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "FIXED", value = "券有效期类型，目前支持以下类型：  RELATIVE：相对有效期  FIXED：绝对有效期")

  public String getValidateType() {
    return validateType;
  }


  public void setValidateType(String validateType) {
    this.validateType = validateType;
  }


  public Voucher verifyMode(String verifyMode) {
    
    this.verifyMode = verifyMode;
    return this;
  }

   /**
   * 该字段仅在兑换券条件下(即券类型为EXCHANGE)，用于设置兑换券的核销方式  USER_CLICK:用户自己点击券上的按钮核销  MERCHANT_SCAN：商户通过APP扫码核销  其他情况下此字段为空
   * @return verifyMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "MERCHANT_SCAN", value = "该字段仅在兑换券条件下(即券类型为EXCHANGE)，用于设置兑换券的核销方式  USER_CLICK:用户自己点击券上的按钮核销  MERCHANT_SCAN：商户通过APP扫码核销  其他情况下此字段为空")

  public String getVerifyMode() {
    return verifyMode;
  }


  public void setVerifyMode(String verifyMode) {
    this.verifyMode = verifyMode;
  }


  public Voucher voucherImg(String voucherImg) {
    
    this.voucherImg = voucherImg;
    return this;
  }

   /**
   * 券图片文件ID,调用上传图片接口alipay.offline.material.image.upload获得
   * @return voucherImg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1T8Pp00AT7eo9NoAJkMR3AAAACMAAQEC", value = "券图片文件ID,调用上传图片接口alipay.offline.material.image.upload获得")

  public String getVoucherImg() {
    return voucherImg;
  }


  public void setVoucherImg(String voucherImg) {
    this.voucherImg = voucherImg;
  }


  public Voucher voucherNote(String voucherNote) {
    
    this.voucherNote = voucherNote;
    return this;
  }

   /**
   * 券的备注    用于收银系统识别指定券使用；如备注中传入“123”，券发出后核销时将在当面付接口将该值传回，供收银系统识别
   * @return voucherNote
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "券的备注", value = "券的备注    用于收银系统识别指定券使用；如备注中传入“123”，券发出后核销时将在当面付接口将该值传回，供收银系统识别")

  public String getVoucherNote() {
    return voucherNote;
  }


  public void setVoucherNote(String voucherNote) {
    this.voucherNote = voucherNote;
  }


  public Voucher worthValue(String worthValue) {
    
    this.worthValue = worthValue;
    return this;
  }

   /**
   * 券面额，单位元必须为合法金额类型字符串券类型为代金券（MONEY）、减至券（REDUCETO）、每满减券（PER_FULL_CUT）时必填  如：  代金券：10元代金券中的10为券面额；  每满减券：毎满100减10元，其中的10为券面额；  减至券：单品原价100，现价10元，其中10为券面额，单品减至券的券面额必须低于单品原价
   * @return worthValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "券面额，单位元必须为合法金额类型字符串券类型为代金券（MONEY）、减至券（REDUCETO）、每满减券（PER_FULL_CUT）时必填  如：  代金券：10元代金券中的10为券面额；  每满减券：毎满100减10元，其中的10为券面额；  减至券：单品原价100，现价10元，其中10为券面额，单品减至券的券面额必须低于单品原价")

  public String getWorthValue() {
    return worthValue;
  }


  public void setWorthValue(String worthValue) {
    this.worthValue = worthValue;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Voucher voucher = (Voucher) o;
    return Objects.equals(this.allowSplit, voucher.allowSplit) &&
        Objects.equals(this.availableAmount, voucher.availableAmount) &&
        Objects.equals(this.brandName, voucher.brandName) &&
        Objects.equals(this.clauseTerms, voucher.clauseTerms) &&
        Objects.equals(this.delayInfo, voucher.delayInfo) &&
        Objects.equals(this.desc, voucher.desc) &&
        Objects.equals(this.descDetailList, voucher.descDetailList) &&
        Objects.equals(this.displayConfig, voucher.displayConfig) &&
        Objects.equals(this.donateFlag, voucher.donateFlag) &&
        Objects.equals(this.effectType, voucher.effectType) &&
        Objects.equals(this.endTime, voucher.endTime) &&
        Objects.equals(this.extInfo, voucher.extInfo) &&
        Objects.equals(this.itemInfo, voucher.itemInfo) &&
        Objects.equals(this.logo, voucher.logo) &&
        Objects.equals(this.maxAmount, voucher.maxAmount) &&
        Objects.equals(this.multiUseMode, voucher.multiUseMode) &&
        Objects.equals(this.name, voucher.name) &&
        Objects.equals(this.rate, voucher.rate) &&
        Objects.equals(this.relativeTime, voucher.relativeTime) &&
        Objects.equals(this.roundingRule, voucher.roundingRule) &&
        Objects.equals(this.startTime, voucher.startTime) &&
        Objects.equals(this.type, voucher.type) &&
        Objects.equals(this.useInstructions, voucher.useInstructions) &&
        Objects.equals(this.useRule, voucher.useRule) &&
        Objects.equals(this.validateType, voucher.validateType) &&
        Objects.equals(this.verifyMode, voucher.verifyMode) &&
        Objects.equals(this.voucherImg, voucher.voucherImg) &&
        Objects.equals(this.voucherNote, voucher.voucherNote) &&
        Objects.equals(this.worthValue, voucher.worthValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowSplit, availableAmount, brandName, clauseTerms, delayInfo, desc, descDetailList, displayConfig, donateFlag, effectType, endTime, extInfo, itemInfo, logo, maxAmount, multiUseMode, name, rate, relativeTime, roundingRule, startTime, type, useInstructions, useRule, validateType, verifyMode, voucherImg, voucherNote, worthValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Voucher {\n");
    sb.append("    allowSplit: ").append(toIndentedString(allowSplit)).append("\n");
    sb.append("    availableAmount: ").append(toIndentedString(availableAmount)).append("\n");
    sb.append("    brandName: ").append(toIndentedString(brandName)).append("\n");
    sb.append("    clauseTerms: ").append(toIndentedString(clauseTerms)).append("\n");
    sb.append("    delayInfo: ").append(toIndentedString(delayInfo)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    descDetailList: ").append(toIndentedString(descDetailList)).append("\n");
    sb.append("    displayConfig: ").append(toIndentedString(displayConfig)).append("\n");
    sb.append("    donateFlag: ").append(toIndentedString(donateFlag)).append("\n");
    sb.append("    effectType: ").append(toIndentedString(effectType)).append("\n");
    sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
    sb.append("    extInfo: ").append(toIndentedString(extInfo)).append("\n");
    sb.append("    itemInfo: ").append(toIndentedString(itemInfo)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    maxAmount: ").append(toIndentedString(maxAmount)).append("\n");
    sb.append("    multiUseMode: ").append(toIndentedString(multiUseMode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rate: ").append(toIndentedString(rate)).append("\n");
    sb.append("    relativeTime: ").append(toIndentedString(relativeTime)).append("\n");
    sb.append("    roundingRule: ").append(toIndentedString(roundingRule)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    useInstructions: ").append(toIndentedString(useInstructions)).append("\n");
    sb.append("    useRule: ").append(toIndentedString(useRule)).append("\n");
    sb.append("    validateType: ").append(toIndentedString(validateType)).append("\n");
    sb.append("    verifyMode: ").append(toIndentedString(verifyMode)).append("\n");
    sb.append("    voucherImg: ").append(toIndentedString(voucherImg)).append("\n");
    sb.append("    voucherNote: ").append(toIndentedString(voucherNote)).append("\n");
    sb.append("    worthValue: ").append(toIndentedString(worthValue)).append("\n");
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
    openapiFields.add("allow_split");
    openapiFields.add("available_amount");
    openapiFields.add("brand_name");
    openapiFields.add("clause_terms");
    openapiFields.add("delay_info");
    openapiFields.add("desc");
    openapiFields.add("desc_detail_list");
    openapiFields.add("display_config");
    openapiFields.add("donate_flag");
    openapiFields.add("effect_type");
    openapiFields.add("end_time");
    openapiFields.add("ext_info");
    openapiFields.add("item_info");
    openapiFields.add("logo");
    openapiFields.add("max_amount");
    openapiFields.add("multi_use_mode");
    openapiFields.add("name");
    openapiFields.add("rate");
    openapiFields.add("relative_time");
    openapiFields.add("rounding_rule");
    openapiFields.add("start_time");
    openapiFields.add("type");
    openapiFields.add("use_instructions");
    openapiFields.add("use_rule");
    openapiFields.add("validate_type");
    openapiFields.add("verify_mode");
    openapiFields.add("voucher_img");
    openapiFields.add("voucher_note");
    openapiFields.add("worth_value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Voucher
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Voucher.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Voucher is not found in the empty JSON string", Voucher.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Voucher.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Voucher` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("available_amount") != null && !jsonObj.get("available_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `available_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("available_amount").toString()));
      }
      if (jsonObj.get("brand_name") != null && !jsonObj.get("brand_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `brand_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("brand_name").toString()));
      }
      JsonArray jsonArrayclauseTerms = jsonObj.getAsJsonArray("clause_terms");
      if (jsonArrayclauseTerms != null) {
        // ensure the json data is an array
        if (!jsonObj.get("clause_terms").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `clause_terms` to be an array in the JSON string but got `%s`", jsonObj.get("clause_terms").toString()));
        }

        // validate the optional field `clause_terms` (array)
        for (int i = 0; i < jsonArrayclauseTerms.size(); i++) {
          ClauseTerm.validateJsonObject(jsonArrayclauseTerms.get(i).getAsJsonObject());
        };
      }
      // validate the optional field `delay_info`
      if (jsonObj.getAsJsonObject("delay_info") != null) {
        DelayInfo.validateJsonObject(jsonObj.getAsJsonObject("delay_info"));
      }
      if (jsonObj.get("desc") != null && !jsonObj.get("desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("desc").toString()));
      }
      JsonArray jsonArraydescDetailList = jsonObj.getAsJsonArray("desc_detail_list");
      if (jsonArraydescDetailList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("desc_detail_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `desc_detail_list` to be an array in the JSON string but got `%s`", jsonObj.get("desc_detail_list").toString()));
        }

        // validate the optional field `desc_detail_list` (array)
        for (int i = 0; i < jsonArraydescDetailList.size(); i++) {
          VoucherDescDetail.validateJsonObject(jsonArraydescDetailList.get(i).getAsJsonObject());
        };
      }
      // validate the optional field `display_config`
      if (jsonObj.getAsJsonObject("display_config") != null) {
        DisplayConfig.validateJsonObject(jsonObj.getAsJsonObject("display_config"));
      }
      if (jsonObj.get("donate_flag") != null && !jsonObj.get("donate_flag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `donate_flag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("donate_flag").toString()));
      }
      if (jsonObj.get("effect_type") != null && !jsonObj.get("effect_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `effect_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("effect_type").toString()));
      }
      if (jsonObj.get("end_time") != null && !jsonObj.get("end_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `end_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("end_time").toString()));
      }
      if (jsonObj.get("ext_info") != null && !jsonObj.get("ext_info").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ext_info` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ext_info").toString()));
      }
      // validate the optional field `item_info`
      if (jsonObj.getAsJsonObject("item_info") != null) {
        ItemInfo.validateJsonObject(jsonObj.getAsJsonObject("item_info"));
      }
      if (jsonObj.get("logo") != null && !jsonObj.get("logo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `logo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("logo").toString()));
      }
      if (jsonObj.get("max_amount") != null && !jsonObj.get("max_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `max_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("max_amount").toString()));
      }
      if (jsonObj.get("multi_use_mode") != null && !jsonObj.get("multi_use_mode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `multi_use_mode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("multi_use_mode").toString()));
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("rate") != null && !jsonObj.get("rate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rate").toString()));
      }
      if (jsonObj.get("relative_time") != null && !jsonObj.get("relative_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `relative_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("relative_time").toString()));
      }
      if (jsonObj.get("rounding_rule") != null && !jsonObj.get("rounding_rule").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rounding_rule` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rounding_rule").toString()));
      }
      if (jsonObj.get("start_time") != null && !jsonObj.get("start_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `start_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("start_time").toString()));
      }
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("use_instructions") != null && !jsonObj.get("use_instructions").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `use_instructions` to be an array in the JSON string but got `%s`", jsonObj.get("use_instructions").toString()));
      }
      // validate the optional field `use_rule`
      if (jsonObj.getAsJsonObject("use_rule") != null) {
        UseRule.validateJsonObject(jsonObj.getAsJsonObject("use_rule"));
      }
      if (jsonObj.get("validate_type") != null && !jsonObj.get("validate_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `validate_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("validate_type").toString()));
      }
      if (jsonObj.get("verify_mode") != null && !jsonObj.get("verify_mode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `verify_mode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("verify_mode").toString()));
      }
      if (jsonObj.get("voucher_img") != null && !jsonObj.get("voucher_img").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voucher_img` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voucher_img").toString()));
      }
      if (jsonObj.get("voucher_note") != null && !jsonObj.get("voucher_note").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voucher_note` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voucher_note").toString()));
      }
      if (jsonObj.get("worth_value") != null && !jsonObj.get("worth_value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `worth_value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("worth_value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Voucher.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Voucher' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Voucher> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Voucher.class));

       return (TypeAdapter<T>) new TypeAdapter<Voucher>() {
           @Override
           public void write(JsonWriter out, Voucher value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Voucher read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Voucher given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Voucher
  * @throws IOException if the JSON string is invalid with respect to Voucher
  */
  public static Voucher fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Voucher.class);
  }

 /**
  * Convert an instance of Voucher to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

