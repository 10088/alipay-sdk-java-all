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
 * SearchOperPageQueryRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SearchOperPageQueryRequest {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ACCESS_TYPE = "access_type";
  @SerializedName(SERIALIZED_NAME_ACCESS_TYPE)
  private String accessType;

  public static final String SERIALIZED_NAME_APPID = "appid";
  @SerializedName(SERIALIZED_NAME_APPID)
  private String appid;

  public static final String SERIALIZED_NAME_PAGE_NUM = "page_num";
  @SerializedName(SERIALIZED_NAME_PAGE_NUM)
  private String pageNum;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "page_size";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private String pageSize;

  public static final String SERIALIZED_NAME_SCENE_CODE = "scene_code";
  @SerializedName(SERIALIZED_NAME_SCENE_CODE)
  private String sceneCode;

  public static final String SERIALIZED_NAME_SPEC_CODE = "spec_code";
  @SerializedName(SERIALIZED_NAME_SPEC_CODE)
  private String specCode;

  public SearchOperPageQueryRequest() { 
  }

  public SearchOperPageQueryRequest accessType(String accessType) {
    
    this.accessType = accessType;
    return this;
  }

   /**
   * 申请类型 BASE：基础信息， BRAND_BOX：品牌直达，SERVICE_BOX服务直达
   * @return accessType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "BRAND_BOX", value = "申请类型 BASE：基础信息， BRAND_BOX：品牌直达，SERVICE_BOX服务直达")

  public String getAccessType() {
    return accessType;
  }


  public void setAccessType(String accessType) {
    this.accessType = accessType;
  }


  public SearchOperPageQueryRequest appid(String appid) {
    
    this.appid = appid;
    return this;
  }

   /**
   * 小程序ID
   * @return appid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021001105612404", value = "小程序ID")

  public String getAppid() {
    return appid;
  }


  public void setAppid(String appid) {
    this.appid = appid;
  }


  public SearchOperPageQueryRequest pageNum(String pageNum) {
    
    this.pageNum = pageNum;
    return this;
  }

   /**
   * 当前页
   * @return pageNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "当前页")

  public String getPageNum() {
    return pageNum;
  }


  public void setPageNum(String pageNum) {
    this.pageNum = pageNum;
  }


  public SearchOperPageQueryRequest pageSize(String pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * 每页显示条数
   * @return pageSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "每页显示条数")

  public String getPageSize() {
    return pageSize;
  }


  public void setPageSize(String pageSize) {
    this.pageSize = pageSize;
  }


  public SearchOperPageQueryRequest sceneCode(String sceneCode) {
    
    this.sceneCode = sceneCode;
    return this;
  }

   /**
   * 场景码
   * @return sceneCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "HOT_WORD_RANKING", value = "场景码")

  public String getSceneCode() {
    return sceneCode;
  }


  public void setSceneCode(String sceneCode) {
    this.sceneCode = sceneCode;
  }


  public SearchOperPageQueryRequest specCode(String specCode) {
    
    this.specCode = specCode;
    return this;
  }

   /**
   * 服务类型 SP_MINI_APP 小程序 SP_PUBLIC_APP 生活号
   * @return specCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SP_MINI_APP", value = "服务类型 SP_MINI_APP 小程序 SP_PUBLIC_APP 生活号")

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
    SearchOperPageQueryRequest searchOperPageQueryRequest = (SearchOperPageQueryRequest) o;
    return Objects.equals(this.accessType, searchOperPageQueryRequest.accessType) &&
        Objects.equals(this.appid, searchOperPageQueryRequest.appid) &&
        Objects.equals(this.pageNum, searchOperPageQueryRequest.pageNum) &&
        Objects.equals(this.pageSize, searchOperPageQueryRequest.pageSize) &&
        Objects.equals(this.sceneCode, searchOperPageQueryRequest.sceneCode) &&
        Objects.equals(this.specCode, searchOperPageQueryRequest.specCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessType, appid, pageNum, pageSize, sceneCode, specCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchOperPageQueryRequest {\n");
    sb.append("    accessType: ").append(toIndentedString(accessType)).append("\n");
    sb.append("    appid: ").append(toIndentedString(appid)).append("\n");
    sb.append("    pageNum: ").append(toIndentedString(pageNum)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    sceneCode: ").append(toIndentedString(sceneCode)).append("\n");
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
    openapiFields.add("access_type");
    openapiFields.add("appid");
    openapiFields.add("page_num");
    openapiFields.add("page_size");
    openapiFields.add("scene_code");
    openapiFields.add("spec_code");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SearchOperPageQueryRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SearchOperPageQueryRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SearchOperPageQueryRequest is not found in the empty JSON string", SearchOperPageQueryRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SearchOperPageQueryRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SearchOperPageQueryRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("access_type") != null && !jsonObj.get("access_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `access_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("access_type").toString()));
      }
      if (jsonObj.get("appid") != null && !jsonObj.get("appid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `appid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("appid").toString()));
      }
      if (jsonObj.get("page_num") != null && !jsonObj.get("page_num").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `page_num` to be a primitive type in the JSON string but got `%s`", jsonObj.get("page_num").toString()));
      }
      if (jsonObj.get("page_size") != null && !jsonObj.get("page_size").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `page_size` to be a primitive type in the JSON string but got `%s`", jsonObj.get("page_size").toString()));
      }
      if (jsonObj.get("scene_code") != null && !jsonObj.get("scene_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scene_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scene_code").toString()));
      }
      if (jsonObj.get("spec_code") != null && !jsonObj.get("spec_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `spec_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("spec_code").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SearchOperPageQueryRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SearchOperPageQueryRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SearchOperPageQueryRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SearchOperPageQueryRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<SearchOperPageQueryRequest>() {
           @Override
           public void write(JsonWriter out, SearchOperPageQueryRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SearchOperPageQueryRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SearchOperPageQueryRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SearchOperPageQueryRequest
  * @throws IOException if the JSON string is invalid with respect to SearchOperPageQueryRequest
  */
  public static SearchOperPageQueryRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SearchOperPageQueryRequest.class);
  }

 /**
  * Convert an instance of SearchOperPageQueryRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

