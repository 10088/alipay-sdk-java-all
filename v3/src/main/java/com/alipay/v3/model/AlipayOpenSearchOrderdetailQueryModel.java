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
import com.alipay.v3.model.SearchOrderRequest;
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
 * AlipayOpenSearchOrderdetailQueryModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenSearchOrderdetailQueryModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_BIZ_DATA = "biz_data";
  @SerializedName(SERIALIZED_NAME_BIZ_DATA)
  private SearchOrderRequest bizData;

  public static final String SERIALIZED_NAME_BIZ_TYPE = "biz_type";
  @SerializedName(SERIALIZED_NAME_BIZ_TYPE)
  private String bizType;

  public static final String SERIALIZED_NAME_OPT_TYPE = "opt_type";
  @SerializedName(SERIALIZED_NAME_OPT_TYPE)
  private String optType;

  public AlipayOpenSearchOrderdetailQueryModel() { 
  }

  public AlipayOpenSearchOrderdetailQueryModel bizData(SearchOrderRequest bizData) {
    
    this.bizData = bizData;
    return this;
  }

   /**
   * Get bizData
   * @return bizData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SearchOrderRequest getBizData() {
    return bizData;
  }


  public void setBizData(SearchOrderRequest bizData) {
    this.bizData = bizData;
  }


  public AlipayOpenSearchOrderdetailQueryModel bizType(String bizType) {
    
    this.bizType = bizType;
    return this;
  }

   /**
   * 表示修改内容的业务类型
   * @return bizType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SEARCH_ORDER_DETAIL_QUERY", value = "表示修改内容的业务类型")

  public String getBizType() {
    return bizType;
  }


  public void setBizType(String bizType) {
    this.bizType = bizType;
  }


  public AlipayOpenSearchOrderdetailQueryModel optType(String optType) {
    
    this.optType = optType;
    return this;
  }

   /**
   * 进行具体操作的类型比如：create、mod、cancel
   * @return optType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "query", value = "进行具体操作的类型比如：create、mod、cancel")

  public String getOptType() {
    return optType;
  }


  public void setOptType(String optType) {
    this.optType = optType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenSearchOrderdetailQueryModel alipayOpenSearchOrderdetailQueryModel = (AlipayOpenSearchOrderdetailQueryModel) o;
    return Objects.equals(this.bizData, alipayOpenSearchOrderdetailQueryModel.bizData) &&
        Objects.equals(this.bizType, alipayOpenSearchOrderdetailQueryModel.bizType) &&
        Objects.equals(this.optType, alipayOpenSearchOrderdetailQueryModel.optType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bizData, bizType, optType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenSearchOrderdetailQueryModel {\n");
    sb.append("    bizData: ").append(toIndentedString(bizData)).append("\n");
    sb.append("    bizType: ").append(toIndentedString(bizType)).append("\n");
    sb.append("    optType: ").append(toIndentedString(optType)).append("\n");
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
    openapiFields.add("biz_data");
    openapiFields.add("biz_type");
    openapiFields.add("opt_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenSearchOrderdetailQueryModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenSearchOrderdetailQueryModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenSearchOrderdetailQueryModel is not found in the empty JSON string", AlipayOpenSearchOrderdetailQueryModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenSearchOrderdetailQueryModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenSearchOrderdetailQueryModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `biz_data`
      if (jsonObj.getAsJsonObject("biz_data") != null) {
        SearchOrderRequest.validateJsonObject(jsonObj.getAsJsonObject("biz_data"));
      }
      if (jsonObj.get("biz_type") != null && !jsonObj.get("biz_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biz_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biz_type").toString()));
      }
      if (jsonObj.get("opt_type") != null && !jsonObj.get("opt_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `opt_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("opt_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenSearchOrderdetailQueryModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenSearchOrderdetailQueryModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenSearchOrderdetailQueryModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenSearchOrderdetailQueryModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenSearchOrderdetailQueryModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenSearchOrderdetailQueryModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenSearchOrderdetailQueryModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenSearchOrderdetailQueryModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenSearchOrderdetailQueryModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenSearchOrderdetailQueryModel
  */
  public static AlipayOpenSearchOrderdetailQueryModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenSearchOrderdetailQueryModel.class);
  }

 /**
  * Convert an instance of AlipayOpenSearchOrderdetailQueryModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

