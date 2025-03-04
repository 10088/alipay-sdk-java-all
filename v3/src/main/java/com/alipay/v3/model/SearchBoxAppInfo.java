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
 * SearchBoxAppInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SearchBoxAppInfo {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_APP_NAME = "app_name";
  @SerializedName(SERIALIZED_NAME_APP_NAME)
  private String appName;

  public static final String SERIALIZED_NAME_APP_TYPE = "app_type";
  @SerializedName(SERIALIZED_NAME_APP_TYPE)
  private String appType;

  public static final String SERIALIZED_NAME_RELATE_APPID = "relate_appid";
  @SerializedName(SERIALIZED_NAME_RELATE_APPID)
  private String relateAppid;

  public SearchBoxAppInfo() { 
  }

  public SearchBoxAppInfo appName(String appName) {
    
    this.appName = appName;
    return this;
  }

   /**
   * 应用名称
   * @return appName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "应用名称")

  public String getAppName() {
    return appName;
  }


  public void setAppName(String appName) {
    this.appName = appName;
  }


  public SearchBoxAppInfo appType(String appType) {
    
    this.appType = appType;
    return this;
  }

   /**
   * 应用类型，TINY_APP-小程序/PUBLIC_APP-生活号/SHOP_APP-门店应用
   * @return appType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "应用类型，TINY_APP-小程序/PUBLIC_APP-生活号/SHOP_APP-门店应用")

  public String getAppType() {
    return appType;
  }


  public void setAppType(String appType) {
    this.appType = appType;
  }


  public SearchBoxAppInfo relateAppid(String relateAppid) {
    
    this.relateAppid = relateAppid;
    return this;
  }

   /**
   * 应用ID
   * @return relateAppid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "应用ID")

  public String getRelateAppid() {
    return relateAppid;
  }


  public void setRelateAppid(String relateAppid) {
    this.relateAppid = relateAppid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchBoxAppInfo searchBoxAppInfo = (SearchBoxAppInfo) o;
    return Objects.equals(this.appName, searchBoxAppInfo.appName) &&
        Objects.equals(this.appType, searchBoxAppInfo.appType) &&
        Objects.equals(this.relateAppid, searchBoxAppInfo.relateAppid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appName, appType, relateAppid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchBoxAppInfo {\n");
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    appType: ").append(toIndentedString(appType)).append("\n");
    sb.append("    relateAppid: ").append(toIndentedString(relateAppid)).append("\n");
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
    openapiFields.add("app_name");
    openapiFields.add("app_type");
    openapiFields.add("relate_appid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SearchBoxAppInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SearchBoxAppInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SearchBoxAppInfo is not found in the empty JSON string", SearchBoxAppInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SearchBoxAppInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SearchBoxAppInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("app_name") != null && !jsonObj.get("app_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_name").toString()));
      }
      if (jsonObj.get("app_type") != null && !jsonObj.get("app_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `app_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("app_type").toString()));
      }
      if (jsonObj.get("relate_appid") != null && !jsonObj.get("relate_appid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `relate_appid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("relate_appid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SearchBoxAppInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SearchBoxAppInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SearchBoxAppInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SearchBoxAppInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<SearchBoxAppInfo>() {
           @Override
           public void write(JsonWriter out, SearchBoxAppInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SearchBoxAppInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SearchBoxAppInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SearchBoxAppInfo
  * @throws IOException if the JSON string is invalid with respect to SearchBoxAppInfo
  */
  public static SearchBoxAppInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SearchBoxAppInfo.class);
  }

 /**
  * Convert an instance of SearchBoxAppInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

