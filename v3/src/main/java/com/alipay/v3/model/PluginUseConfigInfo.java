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
 * PluginUseConfigInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PluginUseConfigInfo {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_BUNDLE_ID = "bundle_id";
  @SerializedName(SERIALIZED_NAME_BUNDLE_ID)
  private String bundleId;

  public static final String SERIALIZED_NAME_GRAY_CODE = "gray_code";
  @SerializedName(SERIALIZED_NAME_GRAY_CODE)
  private String grayCode;

  public static final String SERIALIZED_NAME_PLUGIN_DEVELOP_VERSION = "plugin_develop_version";
  @SerializedName(SERIALIZED_NAME_PLUGIN_DEVELOP_VERSION)
  private String pluginDevelopVersion;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public PluginUseConfigInfo() { 
  }

  public PluginUseConfigInfo bundleId(String bundleId) {
    
    this.bundleId = bundleId;
    return this;
  }

   /**
   * 端
   * @return bundleId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "com.alipay.alipaywallet", value = "端")

  public String getBundleId() {
    return bundleId;
  }


  public void setBundleId(String bundleId) {
    this.bundleId = bundleId;
  }


  public PluginUseConfigInfo grayCode(String grayCode) {
    
    this.grayCode = grayCode;
    return this;
  }

   /**
   * 灰度策略
   * @return grayCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "p1", value = "灰度策略")

  public String getGrayCode() {
    return grayCode;
  }


  public void setGrayCode(String grayCode) {
    this.grayCode = grayCode;
  }


  public PluginUseConfigInfo pluginDevelopVersion(String pluginDevelopVersion) {
    
    this.pluginDevelopVersion = pluginDevelopVersion;
    return this;
  }

   /**
   * 插件研发版本
   * @return pluginDevelopVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0.0.3", value = "插件研发版本")

  public String getPluginDevelopVersion() {
    return pluginDevelopVersion;
  }


  public void setPluginDevelopVersion(String pluginDevelopVersion) {
    this.pluginDevelopVersion = pluginDevelopVersion;
  }


  public PluginUseConfigInfo status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * GRAY(灰度中)/RELEASE(在线状态)
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "GRAY", value = "GRAY(灰度中)/RELEASE(在线状态)")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PluginUseConfigInfo pluginUseConfigInfo = (PluginUseConfigInfo) o;
    return Objects.equals(this.bundleId, pluginUseConfigInfo.bundleId) &&
        Objects.equals(this.grayCode, pluginUseConfigInfo.grayCode) &&
        Objects.equals(this.pluginDevelopVersion, pluginUseConfigInfo.pluginDevelopVersion) &&
        Objects.equals(this.status, pluginUseConfigInfo.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bundleId, grayCode, pluginDevelopVersion, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PluginUseConfigInfo {\n");
    sb.append("    bundleId: ").append(toIndentedString(bundleId)).append("\n");
    sb.append("    grayCode: ").append(toIndentedString(grayCode)).append("\n");
    sb.append("    pluginDevelopVersion: ").append(toIndentedString(pluginDevelopVersion)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("bundle_id");
    openapiFields.add("gray_code");
    openapiFields.add("plugin_develop_version");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PluginUseConfigInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (PluginUseConfigInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PluginUseConfigInfo is not found in the empty JSON string", PluginUseConfigInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PluginUseConfigInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PluginUseConfigInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("bundle_id") != null && !jsonObj.get("bundle_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bundle_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bundle_id").toString()));
      }
      if (jsonObj.get("gray_code") != null && !jsonObj.get("gray_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gray_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gray_code").toString()));
      }
      if (jsonObj.get("plugin_develop_version") != null && !jsonObj.get("plugin_develop_version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `plugin_develop_version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("plugin_develop_version").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PluginUseConfigInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PluginUseConfigInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PluginUseConfigInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PluginUseConfigInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<PluginUseConfigInfo>() {
           @Override
           public void write(JsonWriter out, PluginUseConfigInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PluginUseConfigInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PluginUseConfigInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PluginUseConfigInfo
  * @throws IOException if the JSON string is invalid with respect to PluginUseConfigInfo
  */
  public static PluginUseConfigInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PluginUseConfigInfo.class);
  }

 /**
  * Convert an instance of PluginUseConfigInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

