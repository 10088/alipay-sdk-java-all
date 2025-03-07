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
 * AlipayDataBillAccountbookereceiptApplyModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayDataBillAccountbookereceiptApplyModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_AGREEMENT_NO = "agreement_no";
  @SerializedName(SERIALIZED_NAME_AGREEMENT_NO)
  private String agreementNo;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public static final String SERIALIZED_NAME_STORE_NO = "store_no";
  @SerializedName(SERIALIZED_NAME_STORE_NO)
  private String storeNo;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public AlipayDataBillAccountbookereceiptApplyModel() { 
  }

  public AlipayDataBillAccountbookereceiptApplyModel agreementNo(String agreementNo) {
    
    this.agreementNo = agreementNo;
    return this;
  }

   /**
   * 协议号
   * @return agreementNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20205215001418078112", value = "协议号")

  public String getAgreementNo() {
    return agreementNo;
  }


  public void setAgreementNo(String agreementNo) {
    this.agreementNo = agreementNo;
  }


  public AlipayDataBillAccountbookereceiptApplyModel key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * 明细凭证，传入流水号（转账接口查询结果）。汇总凭证，传入起止时间，格式yyyy-MM-dd_yyyy-MM-dd。
   * @return key
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-01-01_2020-01-10", value = "明细凭证，传入流水号（转账接口查询结果）。汇总凭证，传入起止时间，格式yyyy-MM-dd_yyyy-MM-dd。")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }


  public AlipayDataBillAccountbookereceiptApplyModel storeNo(String storeNo) {
    
    this.storeNo = storeNo;
    return this;
  }

   /**
   * 子账本号，或者子账本名称。模糊查询
   * @return storeNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088000117463004", value = "子账本号，或者子账本名称。模糊查询")

  public String getStoreNo() {
    return storeNo;
  }


  public void setStoreNo(String storeNo) {
    this.storeNo = storeNo;
  }


  public AlipayDataBillAccountbookereceiptApplyModel type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * 申请的类型。可传入：FUND_PLATFORM_DETAIL - 资金明细证明，FUND_PLATFORM_SUM - 资金汇总证明
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "FUND_PLATFORM_DETAIL", value = "申请的类型。可传入：FUND_PLATFORM_DETAIL - 资金明细证明，FUND_PLATFORM_SUM - 资金汇总证明")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayDataBillAccountbookereceiptApplyModel alipayDataBillAccountbookereceiptApplyModel = (AlipayDataBillAccountbookereceiptApplyModel) o;
    return Objects.equals(this.agreementNo, alipayDataBillAccountbookereceiptApplyModel.agreementNo) &&
        Objects.equals(this.key, alipayDataBillAccountbookereceiptApplyModel.key) &&
        Objects.equals(this.storeNo, alipayDataBillAccountbookereceiptApplyModel.storeNo) &&
        Objects.equals(this.type, alipayDataBillAccountbookereceiptApplyModel.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agreementNo, key, storeNo, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayDataBillAccountbookereceiptApplyModel {\n");
    sb.append("    agreementNo: ").append(toIndentedString(agreementNo)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    storeNo: ").append(toIndentedString(storeNo)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("agreement_no");
    openapiFields.add("key");
    openapiFields.add("store_no");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayDataBillAccountbookereceiptApplyModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayDataBillAccountbookereceiptApplyModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayDataBillAccountbookereceiptApplyModel is not found in the empty JSON string", AlipayDataBillAccountbookereceiptApplyModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayDataBillAccountbookereceiptApplyModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayDataBillAccountbookereceiptApplyModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("agreement_no") != null && !jsonObj.get("agreement_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `agreement_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("agreement_no").toString()));
      }
      if (jsonObj.get("key") != null && !jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
      if (jsonObj.get("store_no") != null && !jsonObj.get("store_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `store_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("store_no").toString()));
      }
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayDataBillAccountbookereceiptApplyModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayDataBillAccountbookereceiptApplyModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayDataBillAccountbookereceiptApplyModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayDataBillAccountbookereceiptApplyModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayDataBillAccountbookereceiptApplyModel>() {
           @Override
           public void write(JsonWriter out, AlipayDataBillAccountbookereceiptApplyModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayDataBillAccountbookereceiptApplyModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayDataBillAccountbookereceiptApplyModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayDataBillAccountbookereceiptApplyModel
  * @throws IOException if the JSON string is invalid with respect to AlipayDataBillAccountbookereceiptApplyModel
  */
  public static AlipayDataBillAccountbookereceiptApplyModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayDataBillAccountbookereceiptApplyModel.class);
  }

 /**
  * Convert an instance of AlipayDataBillAccountbookereceiptApplyModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

