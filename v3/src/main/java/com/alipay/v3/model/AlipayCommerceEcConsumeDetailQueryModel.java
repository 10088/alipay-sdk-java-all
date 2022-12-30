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
 * AlipayCommerceEcConsumeDetailQueryModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayCommerceEcConsumeDetailQueryModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_AGREEMENT_NO = "agreement_no";
  @SerializedName(SERIALIZED_NAME_AGREEMENT_NO)
  private String agreementNo;

  public static final String SERIALIZED_NAME_ENTERPRISE_ID = "enterprise_id";
  @SerializedName(SERIALIZED_NAME_ENTERPRISE_ID)
  private String enterpriseId;

  public static final String SERIALIZED_NAME_PAY_NO = "pay_no";
  @SerializedName(SERIALIZED_NAME_PAY_NO)
  private String payNo;

  public static final String SERIALIZED_NAME_QUERY_OPTIONS = "query_options";
  @SerializedName(SERIALIZED_NAME_QUERY_OPTIONS)
  private List<String> queryOptions = null;

  public AlipayCommerceEcConsumeDetailQueryModel() { 
  }

  public AlipayCommerceEcConsumeDetailQueryModel accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * 共同账户ID，有企业ID可不传
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088123456789000", value = "共同账户ID，有企业ID可不传")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public AlipayCommerceEcConsumeDetailQueryModel agreementNo(String agreementNo) {
    
    this.agreementNo = agreementNo;
    return this;
  }

   /**
   * 授权签约协议号，有企业ID可不传
   * @return agreementNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20205820659822371223", value = "授权签约协议号，有企业ID可不传")

  public String getAgreementNo() {
    return agreementNo;
  }


  public void setAgreementNo(String agreementNo) {
    this.agreementNo = agreementNo;
  }


  public AlipayCommerceEcConsumeDetailQueryModel enterpriseId(String enterpriseId) {
    
    this.enterpriseId = enterpriseId;
    return this;
  }

   /**
   * 企业ID，推荐查询方式
   * @return enterpriseId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088123456789000", value = "企业ID，推荐查询方式")

  public String getEnterpriseId() {
    return enterpriseId;
  }


  public void setEnterpriseId(String enterpriseId) {
    this.enterpriseId = enterpriseId;
  }


  public AlipayCommerceEcConsumeDetailQueryModel payNo(String payNo) {
    
    this.payNo = payNo;
    return this;
  }

   /**
   * 支付宝账单号
   * @return payNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020123100152601930000003650", value = "支付宝账单号")

  public String getPayNo() {
    return payNo;
  }


  public void setPayNo(String payNo) {
    this.payNo = payNo;
  }


  public AlipayCommerceEcConsumeDetailQueryModel queryOptions(List<String> queryOptions) {
    
    this.queryOptions = queryOptions;
    return this;
  }

  public AlipayCommerceEcConsumeDetailQueryModel addQueryOptionsItem(String queryOptionsItem) {
    if (this.queryOptions == null) {
      this.queryOptions = new ArrayList<>();
    }
    this.queryOptions.add(queryOptionsItem);
    return this;
  }

   /**
   * 查询选项，只针对消费账单生效 查询关联退款账单：Refund 查询关联订单：Order 查询关联票据：Ticket 查询关联多媒体凭证：Multimedia
   * @return queryOptions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"Refund\"]", value = "查询选项，只针对消费账单生效 查询关联退款账单：Refund 查询关联订单：Order 查询关联票据：Ticket 查询关联多媒体凭证：Multimedia")

  public List<String> getQueryOptions() {
    return queryOptions;
  }


  public void setQueryOptions(List<String> queryOptions) {
    this.queryOptions = queryOptions;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayCommerceEcConsumeDetailQueryModel alipayCommerceEcConsumeDetailQueryModel = (AlipayCommerceEcConsumeDetailQueryModel) o;
    return Objects.equals(this.accountId, alipayCommerceEcConsumeDetailQueryModel.accountId) &&
        Objects.equals(this.agreementNo, alipayCommerceEcConsumeDetailQueryModel.agreementNo) &&
        Objects.equals(this.enterpriseId, alipayCommerceEcConsumeDetailQueryModel.enterpriseId) &&
        Objects.equals(this.payNo, alipayCommerceEcConsumeDetailQueryModel.payNo) &&
        Objects.equals(this.queryOptions, alipayCommerceEcConsumeDetailQueryModel.queryOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, agreementNo, enterpriseId, payNo, queryOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayCommerceEcConsumeDetailQueryModel {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    agreementNo: ").append(toIndentedString(agreementNo)).append("\n");
    sb.append("    enterpriseId: ").append(toIndentedString(enterpriseId)).append("\n");
    sb.append("    payNo: ").append(toIndentedString(payNo)).append("\n");
    sb.append("    queryOptions: ").append(toIndentedString(queryOptions)).append("\n");
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
    openapiFields.add("enterprise_id");
    openapiFields.add("pay_no");
    openapiFields.add("query_options");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayCommerceEcConsumeDetailQueryModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayCommerceEcConsumeDetailQueryModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayCommerceEcConsumeDetailQueryModel is not found in the empty JSON string", AlipayCommerceEcConsumeDetailQueryModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayCommerceEcConsumeDetailQueryModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayCommerceEcConsumeDetailQueryModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("account_id") != null && !jsonObj.get("account_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_id").toString()));
      }
      if (jsonObj.get("agreement_no") != null && !jsonObj.get("agreement_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agreement_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agreement_no").toString()));
      }
      if (jsonObj.get("enterprise_id") != null && !jsonObj.get("enterprise_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enterprise_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enterprise_id").toString()));
      }
      if (jsonObj.get("pay_no") != null && !jsonObj.get("pay_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pay_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pay_no").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("query_options") != null && !jsonObj.get("query_options").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `query_options` to be an array in the JSON string but got `%s`", jsonObj.get("query_options").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayCommerceEcConsumeDetailQueryModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayCommerceEcConsumeDetailQueryModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayCommerceEcConsumeDetailQueryModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayCommerceEcConsumeDetailQueryModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayCommerceEcConsumeDetailQueryModel>() {
           @Override
           public void write(JsonWriter out, AlipayCommerceEcConsumeDetailQueryModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayCommerceEcConsumeDetailQueryModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayCommerceEcConsumeDetailQueryModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayCommerceEcConsumeDetailQueryModel
  * @throws IOException if the JSON string is invalid with respect to AlipayCommerceEcConsumeDetailQueryModel
  */
  public static AlipayCommerceEcConsumeDetailQueryModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayCommerceEcConsumeDetailQueryModel.class);
  }

 /**
  * Convert an instance of AlipayCommerceEcConsumeDetailQueryModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

