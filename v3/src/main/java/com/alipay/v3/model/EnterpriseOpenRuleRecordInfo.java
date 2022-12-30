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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
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
 * EnterpriseOpenRuleRecordInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class EnterpriseOpenRuleRecordInfo {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_BILL_MONTH_DAY = "bill_month_day";
  @SerializedName(SERIALIZED_NAME_BILL_MONTH_DAY)
  private Integer billMonthDay;

  public static final String SERIALIZED_NAME_EFFECTIVE_START = "effective_start";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_START)
  private String effectiveStart;

  public static final String SERIALIZED_NAME_ENTERPRISE_ID = "enterprise_id";
  @SerializedName(SERIALIZED_NAME_ENTERPRISE_ID)
  private String enterpriseId;

  public static final String SERIALIZED_NAME_GMT_CREATE = "gmt_create";
  @SerializedName(SERIALIZED_NAME_GMT_CREATE)
  private String gmtCreate;

  public static final String SERIALIZED_NAME_GMT_MODIFIED = "gmt_modified";
  @SerializedName(SERIALIZED_NAME_GMT_MODIFIED)
  private String gmtModified;

  public static final String SERIALIZED_NAME_INVOICE_RULE_ID = "invoice_rule_id";
  @SerializedName(SERIALIZED_NAME_INVOICE_RULE_ID)
  private String invoiceRuleId;

  public static final String SERIALIZED_NAME_INVOICE_RULE_RECORD_ID = "invoice_rule_record_id";
  @SerializedName(SERIALIZED_NAME_INVOICE_RULE_RECORD_ID)
  private String invoiceRuleRecordId;

  public static final String SERIALIZED_NAME_INVOICE_TITLE_ID = "invoice_title_id";
  @SerializedName(SERIALIZED_NAME_INVOICE_TITLE_ID)
  private String invoiceTitleId;

  public static final String SERIALIZED_NAME_OPEN_APPLYER = "open_applyer";
  @SerializedName(SERIALIZED_NAME_OPEN_APPLYER)
  private String openApplyer;

  public static final String SERIALIZED_NAME_OPEN_MODE = "open_mode";
  @SerializedName(SERIALIZED_NAME_OPEN_MODE)
  private String openMode;

  public static final String SERIALIZED_NAME_OPEN_TYPE = "open_type";
  @SerializedName(SERIALIZED_NAME_OPEN_TYPE)
  private String openType;

  public static final String SERIALIZED_NAME_OWNER_ID = "owner_id";
  @SerializedName(SERIALIZED_NAME_OWNER_ID)
  private String ownerId;

  public static final String SERIALIZED_NAME_TAG = "tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public EnterpriseOpenRuleRecordInfo() { 
  }

  public EnterpriseOpenRuleRecordInfo billMonthDay(Integer billMonthDay) {
    
    this.billMonthDay = billMonthDay;
    return this;
  }

   /**
   * 开票规则账单日
   * @return billMonthDay
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5", value = "开票规则账单日")

  public Integer getBillMonthDay() {
    return billMonthDay;
  }


  public void setBillMonthDay(Integer billMonthDay) {
    this.billMonthDay = billMonthDay;
  }


  public EnterpriseOpenRuleRecordInfo effectiveStart(String effectiveStart) {
    
    this.effectiveStart = effectiveStart;
    return this;
  }

   /**
   * 开票规则生效日期
   * @return effectiveStart
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-08-27 00:00:00", value = "开票规则生效日期")

  public String getEffectiveStart() {
    return effectiveStart;
  }


  public void setEffectiveStart(String effectiveStart) {
    this.effectiveStart = effectiveStart;
  }


  public EnterpriseOpenRuleRecordInfo enterpriseId(String enterpriseId) {
    
    this.enterpriseId = enterpriseId;
    return this;
  }

   /**
   * 企业ID【推荐使用】
   * @return enterpriseId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088000000000001", value = "企业ID【推荐使用】")

  public String getEnterpriseId() {
    return enterpriseId;
  }


  public void setEnterpriseId(String enterpriseId) {
    this.enterpriseId = enterpriseId;
  }


  public EnterpriseOpenRuleRecordInfo gmtCreate(String gmtCreate) {
    
    this.gmtCreate = gmtCreate;
    return this;
  }

   /**
   * 创建时间
   * @return gmtCreate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-08-27 00:00:00", value = "创建时间")

  public String getGmtCreate() {
    return gmtCreate;
  }


  public void setGmtCreate(String gmtCreate) {
    this.gmtCreate = gmtCreate;
  }


  public EnterpriseOpenRuleRecordInfo gmtModified(String gmtModified) {
    
    this.gmtModified = gmtModified;
    return this;
  }

   /**
   * 修改时间
   * @return gmtModified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-08-27 00:00:00", value = "修改时间")

  public String getGmtModified() {
    return gmtModified;
  }


  public void setGmtModified(String gmtModified) {
    this.gmtModified = gmtModified;
  }


  public EnterpriseOpenRuleRecordInfo invoiceRuleId(String invoiceRuleId) {
    
    this.invoiceRuleId = invoiceRuleId;
    return this;
  }

   /**
   * 开票规则ID
   * @return invoiceRuleId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021032900152710950000000001", value = "开票规则ID")

  public String getInvoiceRuleId() {
    return invoiceRuleId;
  }


  public void setInvoiceRuleId(String invoiceRuleId) {
    this.invoiceRuleId = invoiceRuleId;
  }


  public EnterpriseOpenRuleRecordInfo invoiceRuleRecordId(String invoiceRuleRecordId) {
    
    this.invoiceRuleRecordId = invoiceRuleRecordId;
    return this;
  }

   /**
   * 开票规则记录ID
   * @return invoiceRuleRecordId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021032900152710950000000001", value = "开票规则记录ID")

  public String getInvoiceRuleRecordId() {
    return invoiceRuleRecordId;
  }


  public void setInvoiceRuleRecordId(String invoiceRuleRecordId) {
    this.invoiceRuleRecordId = invoiceRuleRecordId;
  }


  public EnterpriseOpenRuleRecordInfo invoiceTitleId(String invoiceTitleId) {
    
    this.invoiceTitleId = invoiceTitleId;
    return this;
  }

   /**
   * 发票抬头ID
   * @return invoiceTitleId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021032900152710950000000001", value = "发票抬头ID")

  public String getInvoiceTitleId() {
    return invoiceTitleId;
  }


  public void setInvoiceTitleId(String invoiceTitleId) {
    this.invoiceTitleId = invoiceTitleId;
  }


  public EnterpriseOpenRuleRecordInfo openApplyer(String openApplyer) {
    
    this.openApplyer = openApplyer;
    return this;
  }

   /**
   * 开票申请方：ENTERPRISE（企业发起），EMPLOYEE（员工发起）
   * @return openApplyer
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ENTERPRISE", value = "开票申请方：ENTERPRISE（企业发起），EMPLOYEE（员工发起）")

  public String getOpenApplyer() {
    return openApplyer;
  }


  public void setOpenApplyer(String openApplyer) {
    this.openApplyer = openApplyer;
  }


  public EnterpriseOpenRuleRecordInfo openMode(String openMode) {
    
    this.openMode = openMode;
    return this;
  }

   /**
   * 开票模式：汇总开、笔笔开 枚举定义：SUMMARY:汇总开 SINGLE:单笔开
   * @return openMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SUMMARY", value = "开票模式：汇总开、笔笔开 枚举定义：SUMMARY:汇总开 SINGLE:单笔开")

  public String getOpenMode() {
    return openMode;
  }


  public void setOpenMode(String openMode) {
    this.openMode = openMode;
  }


  public EnterpriseOpenRuleRecordInfo openType(String openType) {
    
    this.openType = openType;
    return this;
  }

   /**
   * 开票申请类型：AUTO（自动开票），MANUAL（手动开票）
   * @return openType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AUTO", value = "开票申请类型：AUTO（自动开票），MANUAL（手动开票）")

  public String getOpenType() {
    return openType;
  }


  public void setOpenType(String openType) {
    this.openType = openType;
  }


  public EnterpriseOpenRuleRecordInfo ownerId(String ownerId) {
    
    this.ownerId = ownerId;
    return this;
  }

   /**
   * 所有者ID（企业情况下即为企业ID）
   * @return ownerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088000194958956", value = "所有者ID（企业情况下即为企业ID）")

  public String getOwnerId() {
    return ownerId;
  }


  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }


  public EnterpriseOpenRuleRecordInfo tag(String tag) {
    
    this.tag = tag;
    return this;
  }

   /**
   * 开票规则标记： DEFAULT-默认 EMPLOYEE_TITLE_FIRST-员工签约抬头优先于开票规则
   * @return tag
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DEFAULT", value = "开票规则标记： DEFAULT-默认 EMPLOYEE_TITLE_FIRST-员工签约抬头优先于开票规则")

  public String getTag() {
    return tag;
  }


  public void setTag(String tag) {
    this.tag = tag;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EnterpriseOpenRuleRecordInfo enterpriseOpenRuleRecordInfo = (EnterpriseOpenRuleRecordInfo) o;
    return Objects.equals(this.billMonthDay, enterpriseOpenRuleRecordInfo.billMonthDay) &&
        Objects.equals(this.effectiveStart, enterpriseOpenRuleRecordInfo.effectiveStart) &&
        Objects.equals(this.enterpriseId, enterpriseOpenRuleRecordInfo.enterpriseId) &&
        Objects.equals(this.gmtCreate, enterpriseOpenRuleRecordInfo.gmtCreate) &&
        Objects.equals(this.gmtModified, enterpriseOpenRuleRecordInfo.gmtModified) &&
        Objects.equals(this.invoiceRuleId, enterpriseOpenRuleRecordInfo.invoiceRuleId) &&
        Objects.equals(this.invoiceRuleRecordId, enterpriseOpenRuleRecordInfo.invoiceRuleRecordId) &&
        Objects.equals(this.invoiceTitleId, enterpriseOpenRuleRecordInfo.invoiceTitleId) &&
        Objects.equals(this.openApplyer, enterpriseOpenRuleRecordInfo.openApplyer) &&
        Objects.equals(this.openMode, enterpriseOpenRuleRecordInfo.openMode) &&
        Objects.equals(this.openType, enterpriseOpenRuleRecordInfo.openType) &&
        Objects.equals(this.ownerId, enterpriseOpenRuleRecordInfo.ownerId) &&
        Objects.equals(this.tag, enterpriseOpenRuleRecordInfo.tag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(billMonthDay, effectiveStart, enterpriseId, gmtCreate, gmtModified, invoiceRuleId, invoiceRuleRecordId, invoiceTitleId, openApplyer, openMode, openType, ownerId, tag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EnterpriseOpenRuleRecordInfo {\n");
    sb.append("    billMonthDay: ").append(toIndentedString(billMonthDay)).append("\n");
    sb.append("    effectiveStart: ").append(toIndentedString(effectiveStart)).append("\n");
    sb.append("    enterpriseId: ").append(toIndentedString(enterpriseId)).append("\n");
    sb.append("    gmtCreate: ").append(toIndentedString(gmtCreate)).append("\n");
    sb.append("    gmtModified: ").append(toIndentedString(gmtModified)).append("\n");
    sb.append("    invoiceRuleId: ").append(toIndentedString(invoiceRuleId)).append("\n");
    sb.append("    invoiceRuleRecordId: ").append(toIndentedString(invoiceRuleRecordId)).append("\n");
    sb.append("    invoiceTitleId: ").append(toIndentedString(invoiceTitleId)).append("\n");
    sb.append("    openApplyer: ").append(toIndentedString(openApplyer)).append("\n");
    sb.append("    openMode: ").append(toIndentedString(openMode)).append("\n");
    sb.append("    openType: ").append(toIndentedString(openType)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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
    openapiFields.add("bill_month_day");
    openapiFields.add("effective_start");
    openapiFields.add("enterprise_id");
    openapiFields.add("gmt_create");
    openapiFields.add("gmt_modified");
    openapiFields.add("invoice_rule_id");
    openapiFields.add("invoice_rule_record_id");
    openapiFields.add("invoice_title_id");
    openapiFields.add("open_applyer");
    openapiFields.add("open_mode");
    openapiFields.add("open_type");
    openapiFields.add("owner_id");
    openapiFields.add("tag");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to EnterpriseOpenRuleRecordInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (EnterpriseOpenRuleRecordInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in EnterpriseOpenRuleRecordInfo is not found in the empty JSON string", EnterpriseOpenRuleRecordInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!EnterpriseOpenRuleRecordInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EnterpriseOpenRuleRecordInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("effective_start") != null && !jsonObj.get("effective_start").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `effective_start` to be a primitive type in the JSON string but got `%s`", jsonObj.get("effective_start").toString()));
      }
      if (jsonObj.get("enterprise_id") != null && !jsonObj.get("enterprise_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enterprise_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enterprise_id").toString()));
      }
      if (jsonObj.get("gmt_create") != null && !jsonObj.get("gmt_create").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gmt_create` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gmt_create").toString()));
      }
      if (jsonObj.get("gmt_modified") != null && !jsonObj.get("gmt_modified").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gmt_modified` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gmt_modified").toString()));
      }
      if (jsonObj.get("invoice_rule_id") != null && !jsonObj.get("invoice_rule_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoice_rule_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoice_rule_id").toString()));
      }
      if (jsonObj.get("invoice_rule_record_id") != null && !jsonObj.get("invoice_rule_record_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoice_rule_record_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoice_rule_record_id").toString()));
      }
      if (jsonObj.get("invoice_title_id") != null && !jsonObj.get("invoice_title_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoice_title_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoice_title_id").toString()));
      }
      if (jsonObj.get("open_applyer") != null && !jsonObj.get("open_applyer").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `open_applyer` to be a primitive type in the JSON string but got `%s`", jsonObj.get("open_applyer").toString()));
      }
      if (jsonObj.get("open_mode") != null && !jsonObj.get("open_mode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `open_mode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("open_mode").toString()));
      }
      if (jsonObj.get("open_type") != null && !jsonObj.get("open_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `open_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("open_type").toString()));
      }
      if (jsonObj.get("owner_id") != null && !jsonObj.get("owner_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `owner_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("owner_id").toString()));
      }
      if (jsonObj.get("tag") != null && !jsonObj.get("tag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tag").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EnterpriseOpenRuleRecordInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EnterpriseOpenRuleRecordInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EnterpriseOpenRuleRecordInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EnterpriseOpenRuleRecordInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<EnterpriseOpenRuleRecordInfo>() {
           @Override
           public void write(JsonWriter out, EnterpriseOpenRuleRecordInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EnterpriseOpenRuleRecordInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of EnterpriseOpenRuleRecordInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of EnterpriseOpenRuleRecordInfo
  * @throws IOException if the JSON string is invalid with respect to EnterpriseOpenRuleRecordInfo
  */
  public static EnterpriseOpenRuleRecordInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EnterpriseOpenRuleRecordInfo.class);
  }

 /**
  * Convert an instance of EnterpriseOpenRuleRecordInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

