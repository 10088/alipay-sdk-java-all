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
 * AlipayOpenPublicArticlesummaryDataBatchqueryModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenPublicArticlesummaryDataBatchqueryModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_BEGIN_DATE = "begin_date";
  @SerializedName(SERIALIZED_NAME_BEGIN_DATE)
  private String beginDate;

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private String endDate;

  public AlipayOpenPublicArticlesummaryDataBatchqueryModel() { 
  }

  public AlipayOpenPublicArticlesummaryDataBatchqueryModel beginDate(String beginDate) {
    
    this.beginDate = beginDate;
    return this;
  }

   /**
   * 数据开始日期，时间格式为 \&quot;yyyyMMdd\&quot; 。
   * @return beginDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20171101", value = "数据开始日期，时间格式为 \"yyyyMMdd\" 。")

  public String getBeginDate() {
    return beginDate;
  }


  public void setBeginDate(String beginDate) {
    this.beginDate = beginDate;
  }


  public AlipayOpenPublicArticlesummaryDataBatchqueryModel endDate(String endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * 数据结束日期，时间格式为\&quot;yyyyMMdd\&quot;。查询数据开始日期/结束日期时间跨度最大30天。
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20171108", value = "数据结束日期，时间格式为\"yyyyMMdd\"。查询数据开始日期/结束日期时间跨度最大30天。")

  public String getEndDate() {
    return endDate;
  }


  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenPublicArticlesummaryDataBatchqueryModel alipayOpenPublicArticlesummaryDataBatchqueryModel = (AlipayOpenPublicArticlesummaryDataBatchqueryModel) o;
    return Objects.equals(this.beginDate, alipayOpenPublicArticlesummaryDataBatchqueryModel.beginDate) &&
        Objects.equals(this.endDate, alipayOpenPublicArticlesummaryDataBatchqueryModel.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(beginDate, endDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenPublicArticlesummaryDataBatchqueryModel {\n");
    sb.append("    beginDate: ").append(toIndentedString(beginDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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
    openapiFields.add("begin_date");
    openapiFields.add("end_date");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenPublicArticlesummaryDataBatchqueryModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenPublicArticlesummaryDataBatchqueryModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenPublicArticlesummaryDataBatchqueryModel is not found in the empty JSON string", AlipayOpenPublicArticlesummaryDataBatchqueryModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenPublicArticlesummaryDataBatchqueryModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenPublicArticlesummaryDataBatchqueryModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("begin_date") != null && !jsonObj.get("begin_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `begin_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("begin_date").toString()));
      }
      if (jsonObj.get("end_date") != null && !jsonObj.get("end_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `end_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("end_date").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenPublicArticlesummaryDataBatchqueryModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenPublicArticlesummaryDataBatchqueryModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenPublicArticlesummaryDataBatchqueryModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenPublicArticlesummaryDataBatchqueryModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenPublicArticlesummaryDataBatchqueryModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenPublicArticlesummaryDataBatchqueryModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenPublicArticlesummaryDataBatchqueryModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenPublicArticlesummaryDataBatchqueryModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenPublicArticlesummaryDataBatchqueryModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenPublicArticlesummaryDataBatchqueryModel
  */
  public static AlipayOpenPublicArticlesummaryDataBatchqueryModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenPublicArticlesummaryDataBatchqueryModel.class);
  }

 /**
  * Convert an instance of AlipayOpenPublicArticlesummaryDataBatchqueryModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

