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
 * VoucherUseGuide
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VoucherUseGuide {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_MINI_APP_ID = "mini_app_id";
  @SerializedName(SERIALIZED_NAME_MINI_APP_ID)
  private String miniAppId;

  public static final String SERIALIZED_NAME_MINI_APP_PATH = "mini_app_path";
  @SerializedName(SERIALIZED_NAME_MINI_APP_PATH)
  private String miniAppPath;

  public static final String SERIALIZED_NAME_MINI_APP_USE_GUIDE = "mini_app_use_guide";
  @SerializedName(SERIALIZED_NAME_MINI_APP_USE_GUIDE)
  private Boolean miniAppUseGuide;

  public static final String SERIALIZED_NAME_OFFLINE_CODE_USE_GUIDE = "offline_code_use_guide";
  @SerializedName(SERIALIZED_NAME_OFFLINE_CODE_USE_GUIDE)
  private Boolean offlineCodeUseGuide;

  public static final String SERIALIZED_NAME_SERVICE_CODES = "service_codes";
  @SerializedName(SERIALIZED_NAME_SERVICE_CODES)
  private List<String> serviceCodes = null;

  public VoucherUseGuide() { 
  }

  public VoucherUseGuide miniAppId(String miniAppId) {
    
    this.miniAppId = miniAppId;
    return this;
  }

   /**
   * 券可用的小程序appId，卡包详情页可跳转到该appId
   * @return miniAppId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "券可用的小程序appId，卡包详情页可跳转到该appId")

  public String getMiniAppId() {
    return miniAppId;
  }


  public void setMiniAppId(String miniAppId) {
    this.miniAppId = miniAppId;
  }


  public VoucherUseGuide miniAppPath(String miniAppPath) {
    
    this.miniAppPath = miniAppPath;
    return this;
  }

   /**
   * 指定跳转到mini_app_id时的具体页面路径。
   * @return miniAppPath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "指定跳转到mini_app_id时的具体页面路径。")

  public String getMiniAppPath() {
    return miniAppPath;
  }


  public void setMiniAppPath(String miniAppPath) {
    this.miniAppPath = miniAppPath;
  }


  public VoucherUseGuide miniAppUseGuide(Boolean miniAppUseGuide) {
    
    this.miniAppUseGuide = miniAppUseGuide;
    return this;
  }

   /**
   * 小程序核销。
   * @return miniAppUseGuide
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "小程序核销。")

  public Boolean getMiniAppUseGuide() {
    return miniAppUseGuide;
  }


  public void setMiniAppUseGuide(Boolean miniAppUseGuide) {
    this.miniAppUseGuide = miniAppUseGuide;
  }


  public VoucherUseGuide offlineCodeUseGuide(Boolean offlineCodeUseGuide) {
    
    this.offlineCodeUseGuide = offlineCodeUseGuide;
    return this;
  }

   /**
   * 线下扫码核销。
   * @return offlineCodeUseGuide
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "线下扫码核销。")

  public Boolean getOfflineCodeUseGuide() {
    return offlineCodeUseGuide;
  }


  public void setOfflineCodeUseGuide(Boolean offlineCodeUseGuide) {
    this.offlineCodeUseGuide = offlineCodeUseGuide;
  }


  public VoucherUseGuide serviceCodes(List<String> serviceCodes) {
    
    this.serviceCodes = serviceCodes;
    return this;
  }

  public VoucherUseGuide addServiceCodesItem(String serviceCodesItem) {
    if (this.serviceCodes == null) {
      this.serviceCodes = new ArrayList<>();
    }
    this.serviceCodes.add(serviceCodesItem);
    return this;
  }

   /**
   * 小程序服务编码，通过 alipay.open.app.appcontent.function.create(小程序服务创建)接口创建服务后获取。
   * @return serviceCodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "小程序服务编码，通过 alipay.open.app.appcontent.function.create(小程序服务创建)接口创建服务后获取。")

  public List<String> getServiceCodes() {
    return serviceCodes;
  }


  public void setServiceCodes(List<String> serviceCodes) {
    this.serviceCodes = serviceCodes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VoucherUseGuide voucherUseGuide = (VoucherUseGuide) o;
    return Objects.equals(this.miniAppId, voucherUseGuide.miniAppId) &&
        Objects.equals(this.miniAppPath, voucherUseGuide.miniAppPath) &&
        Objects.equals(this.miniAppUseGuide, voucherUseGuide.miniAppUseGuide) &&
        Objects.equals(this.offlineCodeUseGuide, voucherUseGuide.offlineCodeUseGuide) &&
        Objects.equals(this.serviceCodes, voucherUseGuide.serviceCodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(miniAppId, miniAppPath, miniAppUseGuide, offlineCodeUseGuide, serviceCodes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoucherUseGuide {\n");
    sb.append("    miniAppId: ").append(toIndentedString(miniAppId)).append("\n");
    sb.append("    miniAppPath: ").append(toIndentedString(miniAppPath)).append("\n");
    sb.append("    miniAppUseGuide: ").append(toIndentedString(miniAppUseGuide)).append("\n");
    sb.append("    offlineCodeUseGuide: ").append(toIndentedString(offlineCodeUseGuide)).append("\n");
    sb.append("    serviceCodes: ").append(toIndentedString(serviceCodes)).append("\n");
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
    openapiFields.add("mini_app_id");
    openapiFields.add("mini_app_path");
    openapiFields.add("mini_app_use_guide");
    openapiFields.add("offline_code_use_guide");
    openapiFields.add("service_codes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VoucherUseGuide
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (VoucherUseGuide.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in VoucherUseGuide is not found in the empty JSON string", VoucherUseGuide.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!VoucherUseGuide.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VoucherUseGuide` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("mini_app_id") != null && !jsonObj.get("mini_app_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mini_app_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mini_app_id").toString()));
      }
      if (jsonObj.get("mini_app_path") != null && !jsonObj.get("mini_app_path").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mini_app_path` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mini_app_path").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("service_codes") != null && !jsonObj.get("service_codes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `service_codes` to be an array in the JSON string but got `%s`", jsonObj.get("service_codes").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VoucherUseGuide.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VoucherUseGuide' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VoucherUseGuide> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VoucherUseGuide.class));

       return (TypeAdapter<T>) new TypeAdapter<VoucherUseGuide>() {
           @Override
           public void write(JsonWriter out, VoucherUseGuide value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VoucherUseGuide read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of VoucherUseGuide given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VoucherUseGuide
  * @throws IOException if the JSON string is invalid with respect to VoucherUseGuide
  */
  public static VoucherUseGuide fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VoucherUseGuide.class);
  }

 /**
  * Convert an instance of VoucherUseGuide to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

