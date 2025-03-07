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
import com.alipay.v3.model.FaceExtInfo;
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
 * ZolozAuthenticationCustomerFtokenQueryModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ZolozAuthenticationCustomerFtokenQueryModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_BIZ_TYPE = "biz_type";
  @SerializedName(SERIALIZED_NAME_BIZ_TYPE)
  private String bizType;

  public static final String SERIALIZED_NAME_EXT_INFO = "ext_info";
  @SerializedName(SERIALIZED_NAME_EXT_INFO)
  private FaceExtInfo extInfo;

  public static final String SERIALIZED_NAME_FTOKEN = "ftoken";
  @SerializedName(SERIALIZED_NAME_FTOKEN)
  private String ftoken;

  public static final String SERIALIZED_NAME_ZIM_ID = "zim_id";
  @SerializedName(SERIALIZED_NAME_ZIM_ID)
  private String zimId;

  public ZolozAuthenticationCustomerFtokenQueryModel() { 
  }

  public ZolozAuthenticationCustomerFtokenQueryModel bizType(String bizType) {
    
    this.bizType = bizType;
    return this;
  }

   /**
   * 1、1：1人脸验证能力  2、1：n人脸搜索能力（支付宝uid入库）  3、1：n人脸搜索能力（支付宝手机号入库）  4、手机号和人脸识别综合能力
   * @return bizType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "1、1：1人脸验证能力  2、1：n人脸搜索能力（支付宝uid入库）  3、1：n人脸搜索能力（支付宝手机号入库）  4、手机号和人脸识别综合能力")

  public String getBizType() {
    return bizType;
  }


  public void setBizType(String bizType) {
    this.bizType = bizType;
  }


  public ZolozAuthenticationCustomerFtokenQueryModel extInfo(FaceExtInfo extInfo) {
    
    this.extInfo = extInfo;
    return this;
  }

   /**
   * Get extInfo
   * @return extInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public FaceExtInfo getExtInfo() {
    return extInfo;
  }


  public void setExtInfo(FaceExtInfo extInfo) {
    this.extInfo = extInfo;
  }


  public ZolozAuthenticationCustomerFtokenQueryModel ftoken(String ftoken) {
    
    this.ftoken = ftoken;
    return this;
  }

   /**
   * 人脸token
   * @return ftoken
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "fp0593e8d5c136277f13fd5bc36c13a7db7", value = "人脸token")

  public String getFtoken() {
    return ftoken;
  }


  public void setFtoken(String ftoken) {
    this.ftoken = ftoken;
  }


  public ZolozAuthenticationCustomerFtokenQueryModel zimId(String zimId) {
    
    this.zimId = zimId;
    return this;
  }

   /**
   * 刷脸初始化流程中产生的zimId值
   * @return zimId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "3b35b4677de2c69bb5bab69a4a5168d62", value = "刷脸初始化流程中产生的zimId值")

  public String getZimId() {
    return zimId;
  }


  public void setZimId(String zimId) {
    this.zimId = zimId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZolozAuthenticationCustomerFtokenQueryModel zolozAuthenticationCustomerFtokenQueryModel = (ZolozAuthenticationCustomerFtokenQueryModel) o;
    return Objects.equals(this.bizType, zolozAuthenticationCustomerFtokenQueryModel.bizType) &&
        Objects.equals(this.extInfo, zolozAuthenticationCustomerFtokenQueryModel.extInfo) &&
        Objects.equals(this.ftoken, zolozAuthenticationCustomerFtokenQueryModel.ftoken) &&
        Objects.equals(this.zimId, zolozAuthenticationCustomerFtokenQueryModel.zimId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bizType, extInfo, ftoken, zimId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZolozAuthenticationCustomerFtokenQueryModel {\n");
    sb.append("    bizType: ").append(toIndentedString(bizType)).append("\n");
    sb.append("    extInfo: ").append(toIndentedString(extInfo)).append("\n");
    sb.append("    ftoken: ").append(toIndentedString(ftoken)).append("\n");
    sb.append("    zimId: ").append(toIndentedString(zimId)).append("\n");
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
    openapiFields.add("biz_type");
    openapiFields.add("ext_info");
    openapiFields.add("ftoken");
    openapiFields.add("zim_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ZolozAuthenticationCustomerFtokenQueryModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ZolozAuthenticationCustomerFtokenQueryModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ZolozAuthenticationCustomerFtokenQueryModel is not found in the empty JSON string", ZolozAuthenticationCustomerFtokenQueryModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ZolozAuthenticationCustomerFtokenQueryModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ZolozAuthenticationCustomerFtokenQueryModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("biz_type") != null && !jsonObj.get("biz_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biz_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biz_type").toString()));
      }
      // validate the optional field `ext_info`
      if (jsonObj.getAsJsonObject("ext_info") != null) {
        FaceExtInfo.validateJsonObject(jsonObj.getAsJsonObject("ext_info"));
      }
      if (jsonObj.get("ftoken") != null && !jsonObj.get("ftoken").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ftoken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ftoken").toString()));
      }
      if (jsonObj.get("zim_id") != null && !jsonObj.get("zim_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `zim_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("zim_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ZolozAuthenticationCustomerFtokenQueryModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ZolozAuthenticationCustomerFtokenQueryModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ZolozAuthenticationCustomerFtokenQueryModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ZolozAuthenticationCustomerFtokenQueryModel.class));

       return (TypeAdapter<T>) new TypeAdapter<ZolozAuthenticationCustomerFtokenQueryModel>() {
           @Override
           public void write(JsonWriter out, ZolozAuthenticationCustomerFtokenQueryModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ZolozAuthenticationCustomerFtokenQueryModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ZolozAuthenticationCustomerFtokenQueryModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ZolozAuthenticationCustomerFtokenQueryModel
  * @throws IOException if the JSON string is invalid with respect to ZolozAuthenticationCustomerFtokenQueryModel
  */
  public static ZolozAuthenticationCustomerFtokenQueryModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ZolozAuthenticationCustomerFtokenQueryModel.class);
  }

 /**
  * Convert an instance of ZolozAuthenticationCustomerFtokenQueryModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

