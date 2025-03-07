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
 * SearchOrderRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SearchOrderRequest {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_APPLY_ID = "apply_id";
  @SerializedName(SERIALIZED_NAME_APPLY_ID)
  private String applyId;

  public static final String SERIALIZED_NAME_APPLY_TYPE = "apply_type";
  @SerializedName(SERIALIZED_NAME_APPLY_TYPE)
  private String applyType;

  public static final String SERIALIZED_NAME_BRAND_TEMPLATE_ID = "brand_template_id";
  @SerializedName(SERIALIZED_NAME_BRAND_TEMPLATE_ID)
  private String brandTemplateId;

  public static final String SERIALIZED_NAME_SERVICE_CODE = "service_code";
  @SerializedName(SERIALIZED_NAME_SERVICE_CODE)
  private String serviceCode;

  public static final String SERIALIZED_NAME_SPEC_CODE = "spec_code";
  @SerializedName(SERIALIZED_NAME_SPEC_CODE)
  private String specCode;

  public SearchOrderRequest() { 
  }

  public SearchOrderRequest applyId(String applyId) {
    
    this.applyId = applyId;
    return this;
  }

   /**
   * 申请单id
   * @return applyId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AP20200212100002488", value = "申请单id")

  public String getApplyId() {
    return applyId;
  }


  public void setApplyId(String applyId) {
    this.applyId = applyId;
  }


  public SearchOrderRequest applyType(String applyType) {
    
    this.applyType = applyType;
    return this;
  }

   /**
   * 申请类型 BASE：基础信息， BRAND_BOX：品牌直达，SERVICE_BOX服务直达
   * @return applyType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "BASE", value = "申请类型 BASE：基础信息， BRAND_BOX：品牌直达，SERVICE_BOX服务直达")

  public String getApplyType() {
    return applyType;
  }


  public void setApplyType(String applyType) {
    this.applyType = applyType;
  }


  public SearchOrderRequest brandTemplateId(String brandTemplateId) {
    
    this.brandTemplateId = brandTemplateId;
    return this;
  }

   /**
   * 品牌的模板id ONE_WITH_TWO：一拖二、DEFAULT：一拖四
   * @return brandTemplateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DEFAULT", value = "品牌的模板id ONE_WITH_TWO：一拖二、DEFAULT：一拖四")

  public String getBrandTemplateId() {
    return brandTemplateId;
  }


  public void setBrandTemplateId(String brandTemplateId) {
    this.brandTemplateId = brandTemplateId;
  }


  public SearchOrderRequest serviceCode(String serviceCode) {
    
    this.serviceCode = serviceCode;
    return this;
  }

   /**
   * 服务code
   * @return serviceCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2019121121000102523089", value = "服务code")

  public String getServiceCode() {
    return serviceCode;
  }


  public void setServiceCode(String serviceCode) {
    this.serviceCode = serviceCode;
  }


  public SearchOrderRequest specCode(String specCode) {
    
    this.specCode = specCode;
    return this;
  }

   /**
   * 服务的类型默认使用小程序 SP_MINI_APP 小程序 SP_PUBLIC_APP 生活号
   * @return specCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SP_MINI_APP", value = "服务的类型默认使用小程序 SP_MINI_APP 小程序 SP_PUBLIC_APP 生活号")

  public String getSpecCode() {
    return specCode;
  }


  public void setSpecCode(String specCode) {
    this.specCode = specCode;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchOrderRequest searchOrderRequest = (SearchOrderRequest) o;
    return Objects.equals(this.applyId, searchOrderRequest.applyId) &&
        Objects.equals(this.applyType, searchOrderRequest.applyType) &&
        Objects.equals(this.brandTemplateId, searchOrderRequest.brandTemplateId) &&
        Objects.equals(this.serviceCode, searchOrderRequest.serviceCode) &&
        Objects.equals(this.specCode, searchOrderRequest.specCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applyId, applyType, brandTemplateId, serviceCode, specCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchOrderRequest {\n");
    sb.append("    applyId: ").append(toIndentedString(applyId)).append("\n");
    sb.append("    applyType: ").append(toIndentedString(applyType)).append("\n");
    sb.append("    brandTemplateId: ").append(toIndentedString(brandTemplateId)).append("\n");
    sb.append("    serviceCode: ").append(toIndentedString(serviceCode)).append("\n");
    sb.append("    specCode: ").append(toIndentedString(specCode)).append("\n");
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
    openapiFields.add("apply_id");
    openapiFields.add("apply_type");
    openapiFields.add("brand_template_id");
    openapiFields.add("service_code");
    openapiFields.add("spec_code");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SearchOrderRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SearchOrderRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SearchOrderRequest is not found in the empty JSON string", SearchOrderRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SearchOrderRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SearchOrderRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("apply_id") != null && !jsonObj.get("apply_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `apply_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("apply_id").toString()));
      }
      if (jsonObj.get("apply_type") != null && !jsonObj.get("apply_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `apply_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("apply_type").toString()));
      }
      if (jsonObj.get("brand_template_id") != null && !jsonObj.get("brand_template_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `brand_template_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("brand_template_id").toString()));
      }
      if (jsonObj.get("service_code") != null && !jsonObj.get("service_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `service_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("service_code").toString()));
      }
      if (jsonObj.get("spec_code") != null && !jsonObj.get("spec_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `spec_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("spec_code").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SearchOrderRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SearchOrderRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SearchOrderRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SearchOrderRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<SearchOrderRequest>() {
           @Override
           public void write(JsonWriter out, SearchOrderRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SearchOrderRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SearchOrderRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SearchOrderRequest
  * @throws IOException if the JSON string is invalid with respect to SearchOrderRequest
  */
  public static SearchOrderRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SearchOrderRequest.class);
  }

 /**
  * Convert an instance of SearchOrderRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

