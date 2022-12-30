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
 * AlipayEbppInvoiceExpensecontrolQuotaCreateModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayEbppInvoiceExpensecontrolQuotaCreateModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_AGREEMENT_NO = "agreement_no";
  @SerializedName(SERIALIZED_NAME_AGREEMENT_NO)
  private String agreementNo;

  public static final String SERIALIZED_NAME_EFFECTIVE_END_DATE = "effective_end_date";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_END_DATE)
  private String effectiveEndDate;

  public static final String SERIALIZED_NAME_EFFECTIVE_START_DATE = "effective_start_date";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_START_DATE)
  private String effectiveStartDate;

  public static final String SERIALIZED_NAME_ENTERPRISE_ID = "enterprise_id";
  @SerializedName(SERIALIZED_NAME_ENTERPRISE_ID)
  private String enterpriseId;

  public static final String SERIALIZED_NAME_OUTER_SOURCE_ID = "outer_source_id";
  @SerializedName(SERIALIZED_NAME_OUTER_SOURCE_ID)
  private String outerSourceId;

  public static final String SERIALIZED_NAME_OWNER_ID = "owner_id";
  @SerializedName(SERIALIZED_NAME_OWNER_ID)
  private String ownerId;

  public static final String SERIALIZED_NAME_OWNER_OPEN_ID = "owner_open_id";
  @SerializedName(SERIALIZED_NAME_OWNER_OPEN_ID)
  private String ownerOpenId;

  public static final String SERIALIZED_NAME_OWNER_TYPE = "owner_type";
  @SerializedName(SERIALIZED_NAME_OWNER_TYPE)
  private String ownerType;

  public static final String SERIALIZED_NAME_PLATFORM = "platform";
  @SerializedName(SERIALIZED_NAME_PLATFORM)
  private String platform;

  public static final String SERIALIZED_NAME_QUOTA_TYPE = "quota_type";
  @SerializedName(SERIALIZED_NAME_QUOTA_TYPE)
  private String quotaType;

  public static final String SERIALIZED_NAME_QUOTA_VALUE = "quota_value";
  @SerializedName(SERIALIZED_NAME_QUOTA_VALUE)
  private String quotaValue;

  public static final String SERIALIZED_NAME_TARGET_ID = "target_id";
  @SerializedName(SERIALIZED_NAME_TARGET_ID)
  private String targetId;

  public static final String SERIALIZED_NAME_TARGET_TYPE = "target_type";
  @SerializedName(SERIALIZED_NAME_TARGET_TYPE)
  private String targetType;

  public AlipayEbppInvoiceExpensecontrolQuotaCreateModel() { 
  }

  public AlipayEbppInvoiceExpensecontrolQuotaCreateModel accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * 企业共同账户id，和授权签约协议号共同使用。
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088000194958956", value = "企业共同账户id，和授权签约协议号共同使用。")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public AlipayEbppInvoiceExpensecontrolQuotaCreateModel agreementNo(String agreementNo) {
    
    this.agreementNo = agreementNo;
    return this;
  }

   /**
   * 授权签约协议号，可通过签约消息获取。配合企业共同账户id使用，当填写企业共同账户id时，此字段必填。
   * @return agreementNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20215425001112341234", value = "授权签约协议号，可通过签约消息获取。配合企业共同账户id使用，当填写企业共同账户id时，此字段必填。")

  public String getAgreementNo() {
    return agreementNo;
  }


  public void setAgreementNo(String agreementNo) {
    this.agreementNo = agreementNo;
  }


  public AlipayEbppInvoiceExpensecontrolQuotaCreateModel effectiveEndDate(String effectiveEndDate) {
    
    this.effectiveEndDate = effectiveEndDate;
    return this;
  }

   /**
   * 额度失效时间（格式：yyyy-MM-dd HH:mm:ss），额度类型为点券时必填，额度类型为余额时有默认值，无需填写
   * @return effectiveEndDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-10-01 00:00:00", value = "额度失效时间（格式：yyyy-MM-dd HH:mm:ss），额度类型为点券时必填，额度类型为余额时有默认值，无需填写")

  public String getEffectiveEndDate() {
    return effectiveEndDate;
  }


  public void setEffectiveEndDate(String effectiveEndDate) {
    this.effectiveEndDate = effectiveEndDate;
  }


  public AlipayEbppInvoiceExpensecontrolQuotaCreateModel effectiveStartDate(String effectiveStartDate) {
    
    this.effectiveStartDate = effectiveStartDate;
    return this;
  }

   /**
   * 额度生效时间（格式：yyyy-MM-dd HH:mm:ss），额度类型为点券时必填，额度类型为余额时有默认值，无需填写
   * @return effectiveStartDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-01-01 00:00:00", value = "额度生效时间（格式：yyyy-MM-dd HH:mm:ss），额度类型为点券时必填，额度类型为余额时有默认值，无需填写")

  public String getEffectiveStartDate() {
    return effectiveStartDate;
  }


  public void setEffectiveStartDate(String effectiveStartDate) {
    this.effectiveStartDate = effectiveStartDate;
  }


  public AlipayEbppInvoiceExpensecontrolQuotaCreateModel enterpriseId(String enterpriseId) {
    
    this.enterpriseId = enterpriseId;
    return this;
  }

   /**
   * 企业ID
   * @return enterpriseId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088000194958956", value = "企业ID")

  public String getEnterpriseId() {
    return enterpriseId;
  }


  public void setEnterpriseId(String enterpriseId) {
    this.enterpriseId = enterpriseId;
  }


  public AlipayEbppInvoiceExpensecontrolQuotaCreateModel outerSourceId(String outerSourceId) {
    
    this.outerSourceId = outerSourceId;
    return this;
  }

   /**
   * 外部操作幂等ID（接入方接口调用幂等控制ID），创建额度类型为点券时必填
   * @return outerSourceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "TN00000000000001", value = "外部操作幂等ID（接入方接口调用幂等控制ID），创建额度类型为点券时必填")

  public String getOuterSourceId() {
    return outerSourceId;
  }


  public void setOuterSourceId(String outerSourceId) {
    this.outerSourceId = outerSourceId;
  }


  public AlipayEbppInvoiceExpensecontrolQuotaCreateModel ownerId(String ownerId) {
    
    this.ownerId = ownerId;
    return this;
  }

   /**
   * 额度所属者ID（未切换open_id请使用此字段）： owner_type为EMPLOYEE时填写员工支付宝ID； owner_type为ENTERPRISE_PAY_UID时填写员工企业码ID； owner_type为PHONE时填写员工手机号； owner_type为ENTERPRISE时填写企业ID。
   * @return ownerId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088210888827370", value = "额度所属者ID（未切换open_id请使用此字段）： owner_type为EMPLOYEE时填写员工支付宝ID； owner_type为ENTERPRISE_PAY_UID时填写员工企业码ID； owner_type为PHONE时填写员工手机号； owner_type为ENTERPRISE时填写企业ID。")

  public String getOwnerId() {
    return ownerId;
  }


  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }


  public AlipayEbppInvoiceExpensecontrolQuotaCreateModel ownerOpenId(String ownerOpenId) {
    
    this.ownerOpenId = ownerOpenId;
    return this;
  }

   /**
   * 额度所属者ID（切换open_id后请使用此字段）： owner_type为EMPLOYEE时填写open_id； owner_type为ENTERPRISE_PAY_UID时填写员工企业码ID； owner_type为PHONE时填写员工手机号； owner_type为ENTERPRISE时填写企业ID。
   * @return ownerOpenId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "abcdxxx", value = "额度所属者ID（切换open_id后请使用此字段）： owner_type为EMPLOYEE时填写open_id； owner_type为ENTERPRISE_PAY_UID时填写员工企业码ID； owner_type为PHONE时填写员工手机号； owner_type为ENTERPRISE时填写企业ID。")

  public String getOwnerOpenId() {
    return ownerOpenId;
  }


  public void setOwnerOpenId(String ownerOpenId) {
    this.ownerOpenId = ownerOpenId;
  }


  public AlipayEbppInvoiceExpensecontrolQuotaCreateModel ownerType(String ownerType) {
    
    this.ownerType = ownerType;
    return this;
  }

   /**
   * 额度所属者类型，可通过设置该字段来指定操作的owner_id类型，如果设置企业额度则设置为ENTERPRISE
   * @return ownerType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "EMPLOYEE", value = "额度所属者类型，可通过设置该字段来指定操作的owner_id类型，如果设置企业额度则设置为ENTERPRISE")

  public String getOwnerType() {
    return ownerType;
  }


  public void setOwnerType(String ownerType) {
    this.ownerType = ownerType;
  }


  public AlipayEbppInvoiceExpensecontrolQuotaCreateModel platform(String platform) {
    
    this.platform = platform;
    return this;
  }

   /**
   * 外部平台编码（通常为接入方大写英文缩写）
   * @return platform
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "RJ", value = "外部平台编码（通常为接入方大写英文缩写）")

  public String getPlatform() {
    return platform;
  }


  public void setPlatform(String platform) {
    this.platform = platform;
  }


  public AlipayEbppInvoiceExpensecontrolQuotaCreateModel quotaType(String quotaType) {
    
    this.quotaType = quotaType;
    return this;
  }

   /**
   * 创建额度类型，支持点券和余额，不填写则默认为余额类型
   * @return quotaType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "COUPON", value = "创建额度类型，支持点券和余额，不填写则默认为余额类型")

  public String getQuotaType() {
    return quotaType;
  }


  public void setQuotaType(String quotaType) {
    this.quotaType = quotaType;
  }


  public AlipayEbppInvoiceExpensecontrolQuotaCreateModel quotaValue(String quotaValue) {
    
    this.quotaValue = quotaValue;
    return this;
  }

   /**
   * 额度值，以（分）为单位 约束：个人额度不超过100000元，企业额度不超过100000000元
   * @return quotaValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "50", value = "额度值，以（分）为单位 约束：个人额度不超过100000元，企业额度不超过100000000元")

  public String getQuotaValue() {
    return quotaValue;
  }


  public void setQuotaValue(String quotaValue) {
    this.quotaValue = quotaValue;
  }


  public AlipayEbppInvoiceExpensecontrolQuotaCreateModel targetId(String targetId) {
    
    this.targetId = targetId;
    return this;
  }

   /**
   * 额度维度ID 当 target_type&#x3D;EXPENSE_TYPE 时，值为 MEAL（工作餐） 当target_type&#x3D;RULE_GROUP_AGGREGATION 时，值为费控规则聚合ID 当target_type&#x3D;INSTITUTION 时，值为制度ID
   * @return targetId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "MEAL", value = "额度维度ID 当 target_type=EXPENSE_TYPE 时，值为 MEAL（工作餐） 当target_type=RULE_GROUP_AGGREGATION 时，值为费控规则聚合ID 当target_type=INSTITUTION 时，值为制度ID")

  public String getTargetId() {
    return targetId;
  }


  public void setTargetId(String targetId) {
    this.targetId = targetId;
  }


  public AlipayEbppInvoiceExpensecontrolQuotaCreateModel targetType(String targetType) {
    
    this.targetType = targetType;
    return this;
  }

   /**
   * 额度维度 枚举值： EXPENSE_TYPE（费用类型维度）， RULE_GROUP_AGGREGATION（规则聚合维度）， INSTITUTION（制度维度）
   * @return targetType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "EXPENSE_TYPE", value = "额度维度 枚举值： EXPENSE_TYPE（费用类型维度）， RULE_GROUP_AGGREGATION（规则聚合维度）， INSTITUTION（制度维度）")

  public String getTargetType() {
    return targetType;
  }


  public void setTargetType(String targetType) {
    this.targetType = targetType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayEbppInvoiceExpensecontrolQuotaCreateModel alipayEbppInvoiceExpensecontrolQuotaCreateModel = (AlipayEbppInvoiceExpensecontrolQuotaCreateModel) o;
    return Objects.equals(this.accountId, alipayEbppInvoiceExpensecontrolQuotaCreateModel.accountId) &&
        Objects.equals(this.agreementNo, alipayEbppInvoiceExpensecontrolQuotaCreateModel.agreementNo) &&
        Objects.equals(this.effectiveEndDate, alipayEbppInvoiceExpensecontrolQuotaCreateModel.effectiveEndDate) &&
        Objects.equals(this.effectiveStartDate, alipayEbppInvoiceExpensecontrolQuotaCreateModel.effectiveStartDate) &&
        Objects.equals(this.enterpriseId, alipayEbppInvoiceExpensecontrolQuotaCreateModel.enterpriseId) &&
        Objects.equals(this.outerSourceId, alipayEbppInvoiceExpensecontrolQuotaCreateModel.outerSourceId) &&
        Objects.equals(this.ownerId, alipayEbppInvoiceExpensecontrolQuotaCreateModel.ownerId) &&
        Objects.equals(this.ownerOpenId, alipayEbppInvoiceExpensecontrolQuotaCreateModel.ownerOpenId) &&
        Objects.equals(this.ownerType, alipayEbppInvoiceExpensecontrolQuotaCreateModel.ownerType) &&
        Objects.equals(this.platform, alipayEbppInvoiceExpensecontrolQuotaCreateModel.platform) &&
        Objects.equals(this.quotaType, alipayEbppInvoiceExpensecontrolQuotaCreateModel.quotaType) &&
        Objects.equals(this.quotaValue, alipayEbppInvoiceExpensecontrolQuotaCreateModel.quotaValue) &&
        Objects.equals(this.targetId, alipayEbppInvoiceExpensecontrolQuotaCreateModel.targetId) &&
        Objects.equals(this.targetType, alipayEbppInvoiceExpensecontrolQuotaCreateModel.targetType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, agreementNo, effectiveEndDate, effectiveStartDate, enterpriseId, outerSourceId, ownerId, ownerOpenId, ownerType, platform, quotaType, quotaValue, targetId, targetType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayEbppInvoiceExpensecontrolQuotaCreateModel {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    agreementNo: ").append(toIndentedString(agreementNo)).append("\n");
    sb.append("    effectiveEndDate: ").append(toIndentedString(effectiveEndDate)).append("\n");
    sb.append("    effectiveStartDate: ").append(toIndentedString(effectiveStartDate)).append("\n");
    sb.append("    enterpriseId: ").append(toIndentedString(enterpriseId)).append("\n");
    sb.append("    outerSourceId: ").append(toIndentedString(outerSourceId)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    ownerOpenId: ").append(toIndentedString(ownerOpenId)).append("\n");
    sb.append("    ownerType: ").append(toIndentedString(ownerType)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    quotaType: ").append(toIndentedString(quotaType)).append("\n");
    sb.append("    quotaValue: ").append(toIndentedString(quotaValue)).append("\n");
    sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
    sb.append("    targetType: ").append(toIndentedString(targetType)).append("\n");
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
    openapiFields.add("account_id");
    openapiFields.add("agreement_no");
    openapiFields.add("effective_end_date");
    openapiFields.add("effective_start_date");
    openapiFields.add("enterprise_id");
    openapiFields.add("outer_source_id");
    openapiFields.add("owner_id");
    openapiFields.add("owner_open_id");
    openapiFields.add("owner_type");
    openapiFields.add("platform");
    openapiFields.add("quota_type");
    openapiFields.add("quota_value");
    openapiFields.add("target_id");
    openapiFields.add("target_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayEbppInvoiceExpensecontrolQuotaCreateModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayEbppInvoiceExpensecontrolQuotaCreateModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayEbppInvoiceExpensecontrolQuotaCreateModel is not found in the empty JSON string", AlipayEbppInvoiceExpensecontrolQuotaCreateModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayEbppInvoiceExpensecontrolQuotaCreateModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayEbppInvoiceExpensecontrolQuotaCreateModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("account_id") != null && !jsonObj.get("account_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_id").toString()));
      }
      if (jsonObj.get("agreement_no") != null && !jsonObj.get("agreement_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agreement_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agreement_no").toString()));
      }
      if (jsonObj.get("effective_end_date") != null && !jsonObj.get("effective_end_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `effective_end_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("effective_end_date").toString()));
      }
      if (jsonObj.get("effective_start_date") != null && !jsonObj.get("effective_start_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `effective_start_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("effective_start_date").toString()));
      }
      if (jsonObj.get("enterprise_id") != null && !jsonObj.get("enterprise_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enterprise_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enterprise_id").toString()));
      }
      if (jsonObj.get("outer_source_id") != null && !jsonObj.get("outer_source_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `outer_source_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("outer_source_id").toString()));
      }
      if (jsonObj.get("owner_id") != null && !jsonObj.get("owner_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `owner_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("owner_id").toString()));
      }
      if (jsonObj.get("owner_open_id") != null && !jsonObj.get("owner_open_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `owner_open_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("owner_open_id").toString()));
      }
      if (jsonObj.get("owner_type") != null && !jsonObj.get("owner_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `owner_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("owner_type").toString()));
      }
      if (jsonObj.get("platform") != null && !jsonObj.get("platform").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `platform` to be a primitive type in the JSON string but got `%s`", jsonObj.get("platform").toString()));
      }
      if (jsonObj.get("quota_type") != null && !jsonObj.get("quota_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `quota_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("quota_type").toString()));
      }
      if (jsonObj.get("quota_value") != null && !jsonObj.get("quota_value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `quota_value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("quota_value").toString()));
      }
      if (jsonObj.get("target_id") != null && !jsonObj.get("target_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target_id").toString()));
      }
      if (jsonObj.get("target_type") != null && !jsonObj.get("target_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayEbppInvoiceExpensecontrolQuotaCreateModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayEbppInvoiceExpensecontrolQuotaCreateModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayEbppInvoiceExpensecontrolQuotaCreateModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayEbppInvoiceExpensecontrolQuotaCreateModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayEbppInvoiceExpensecontrolQuotaCreateModel>() {
           @Override
           public void write(JsonWriter out, AlipayEbppInvoiceExpensecontrolQuotaCreateModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayEbppInvoiceExpensecontrolQuotaCreateModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayEbppInvoiceExpensecontrolQuotaCreateModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayEbppInvoiceExpensecontrolQuotaCreateModel
  * @throws IOException if the JSON string is invalid with respect to AlipayEbppInvoiceExpensecontrolQuotaCreateModel
  */
  public static AlipayEbppInvoiceExpensecontrolQuotaCreateModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayEbppInvoiceExpensecontrolQuotaCreateModel.class);
  }

 /**
  * Convert an instance of AlipayEbppInvoiceExpensecontrolQuotaCreateModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

