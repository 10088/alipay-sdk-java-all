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
 * ZhimaMerchantSubsidiariesApplyModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ZhimaMerchantSubsidiariesApplyModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_PID = "pid";
  @SerializedName(SERIALIZED_NAME_PID)
  private String pid;

  public static final String SERIALIZED_NAME_SERVICE_ID = "service_id";
  @SerializedName(SERIALIZED_NAME_SERVICE_ID)
  private String serviceId;

  public static final String SERIALIZED_NAME_SMID = "smid";
  @SerializedName(SERIALIZED_NAME_SMID)
  private String smid;

  public static final String SERIALIZED_NAME_SUB_MERCHANT_CONTACT_NUMBER = "sub_merchant_contact_number";
  @SerializedName(SERIALIZED_NAME_SUB_MERCHANT_CONTACT_NUMBER)
  private String subMerchantContactNumber;

  public static final String SERIALIZED_NAME_SUB_MERCHANT_JUMP_LINK = "sub_merchant_jump_link";
  @SerializedName(SERIALIZED_NAME_SUB_MERCHANT_JUMP_LINK)
  private String subMerchantJumpLink;

  public static final String SERIALIZED_NAME_SUB_MERCHANT_LOGO_URL = "sub_merchant_logo_url";
  @SerializedName(SERIALIZED_NAME_SUB_MERCHANT_LOGO_URL)
  private String subMerchantLogoUrl;

  public static final String SERIALIZED_NAME_SUB_MERCHANT_NAME = "sub_merchant_name";
  @SerializedName(SERIALIZED_NAME_SUB_MERCHANT_NAME)
  private String subMerchantName;

  public static final String SERIALIZED_NAME_SUB_PID = "sub_pid";
  @SerializedName(SERIALIZED_NAME_SUB_PID)
  private String subPid;

  public ZhimaMerchantSubsidiariesApplyModel() { 
  }

  public ZhimaMerchantSubsidiariesApplyModel pid(String pid) {
    
    this.pid = pid;
    return this;
  }

   /**
   * 商户pid
   * @return pid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088101117955612", value = "商户pid")

  public String getPid() {
    return pid;
  }


  public void setPid(String pid) {
    this.pid = pid;
  }


  public ZhimaMerchantSubsidiariesApplyModel serviceId(String serviceId) {
    
    this.serviceId = serviceId;
    return this;
  }

   /**
   * 信用服务id
   * @return serviceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20210413000000000000xxxxxxxx", value = "信用服务id")

  public String getServiceId() {
    return serviceId;
  }


  public void setServiceId(String serviceId) {
    this.serviceId = serviceId;
  }


  public ZhimaMerchantSubsidiariesApplyModel smid(String smid) {
    
    this.smid = smid;
    return this;
  }

   /**
   * 二级商户进件id
   * @return smid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088101118048455", value = "二级商户进件id")

  public String getSmid() {
    return smid;
  }


  public void setSmid(String smid) {
    this.smid = smid;
  }


  public ZhimaMerchantSubsidiariesApplyModel subMerchantContactNumber(String subMerchantContactNumber) {
    
    this.subMerchantContactNumber = subMerchantContactNumber;
    return this;
  }

   /**
   * 子商户联系电话
   * @return subMerchantContactNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "200-000-0000", value = "子商户联系电话")

  public String getSubMerchantContactNumber() {
    return subMerchantContactNumber;
  }


  public void setSubMerchantContactNumber(String subMerchantContactNumber) {
    this.subMerchantContactNumber = subMerchantContactNumber;
  }


  public ZhimaMerchantSubsidiariesApplyModel subMerchantJumpLink(String subMerchantJumpLink) {
    
    this.subMerchantJumpLink = subMerchantJumpLink;
    return this;
  }

   /**
   * 子商户跳转链接
   * @return subMerchantJumpLink
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://xxxxxxxx", value = "子商户跳转链接")

  public String getSubMerchantJumpLink() {
    return subMerchantJumpLink;
  }


  public void setSubMerchantJumpLink(String subMerchantJumpLink) {
    this.subMerchantJumpLink = subMerchantJumpLink;
  }


  public ZhimaMerchantSubsidiariesApplyModel subMerchantLogoUrl(String subMerchantLogoUrl) {
    
    this.subMerchantLogoUrl = subMerchantLogoUrl;
    return this;
  }

   /**
   * 子商户logo地址
   * @return subMerchantLogoUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://xxxxxxxx", value = "子商户logo地址")

  public String getSubMerchantLogoUrl() {
    return subMerchantLogoUrl;
  }


  public void setSubMerchantLogoUrl(String subMerchantLogoUrl) {
    this.subMerchantLogoUrl = subMerchantLogoUrl;
  }


  public ZhimaMerchantSubsidiariesApplyModel subMerchantName(String subMerchantName) {
    
    this.subMerchantName = subMerchantName;
    return this;
  }

   /**
   * 子商户名
   * @return subMerchantName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "XXX商户", value = "子商户名")

  public String getSubMerchantName() {
    return subMerchantName;
  }


  public void setSubMerchantName(String subMerchantName) {
    this.subMerchantName = subMerchantName;
  }


  public ZhimaMerchantSubsidiariesApplyModel subPid(String subPid) {
    
    this.subPid = subPid;
    return this;
  }

   /**
   * 子商户id
   * @return subPid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088101117955611", value = "子商户id")

  public String getSubPid() {
    return subPid;
  }


  public void setSubPid(String subPid) {
    this.subPid = subPid;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZhimaMerchantSubsidiariesApplyModel zhimaMerchantSubsidiariesApplyModel = (ZhimaMerchantSubsidiariesApplyModel) o;
    return Objects.equals(this.pid, zhimaMerchantSubsidiariesApplyModel.pid) &&
        Objects.equals(this.serviceId, zhimaMerchantSubsidiariesApplyModel.serviceId) &&
        Objects.equals(this.smid, zhimaMerchantSubsidiariesApplyModel.smid) &&
        Objects.equals(this.subMerchantContactNumber, zhimaMerchantSubsidiariesApplyModel.subMerchantContactNumber) &&
        Objects.equals(this.subMerchantJumpLink, zhimaMerchantSubsidiariesApplyModel.subMerchantJumpLink) &&
        Objects.equals(this.subMerchantLogoUrl, zhimaMerchantSubsidiariesApplyModel.subMerchantLogoUrl) &&
        Objects.equals(this.subMerchantName, zhimaMerchantSubsidiariesApplyModel.subMerchantName) &&
        Objects.equals(this.subPid, zhimaMerchantSubsidiariesApplyModel.subPid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pid, serviceId, smid, subMerchantContactNumber, subMerchantJumpLink, subMerchantLogoUrl, subMerchantName, subPid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZhimaMerchantSubsidiariesApplyModel {\n");
    sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
    sb.append("    serviceId: ").append(toIndentedString(serviceId)).append("\n");
    sb.append("    smid: ").append(toIndentedString(smid)).append("\n");
    sb.append("    subMerchantContactNumber: ").append(toIndentedString(subMerchantContactNumber)).append("\n");
    sb.append("    subMerchantJumpLink: ").append(toIndentedString(subMerchantJumpLink)).append("\n");
    sb.append("    subMerchantLogoUrl: ").append(toIndentedString(subMerchantLogoUrl)).append("\n");
    sb.append("    subMerchantName: ").append(toIndentedString(subMerchantName)).append("\n");
    sb.append("    subPid: ").append(toIndentedString(subPid)).append("\n");
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
    openapiFields.add("pid");
    openapiFields.add("service_id");
    openapiFields.add("smid");
    openapiFields.add("sub_merchant_contact_number");
    openapiFields.add("sub_merchant_jump_link");
    openapiFields.add("sub_merchant_logo_url");
    openapiFields.add("sub_merchant_name");
    openapiFields.add("sub_pid");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ZhimaMerchantSubsidiariesApplyModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ZhimaMerchantSubsidiariesApplyModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ZhimaMerchantSubsidiariesApplyModel is not found in the empty JSON string", ZhimaMerchantSubsidiariesApplyModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ZhimaMerchantSubsidiariesApplyModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ZhimaMerchantSubsidiariesApplyModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("pid") != null && !jsonObj.get("pid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pid").toString()));
      }
      if (jsonObj.get("service_id") != null && !jsonObj.get("service_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `service_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("service_id").toString()));
      }
      if (jsonObj.get("smid") != null && !jsonObj.get("smid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `smid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("smid").toString()));
      }
      if (jsonObj.get("sub_merchant_contact_number") != null && !jsonObj.get("sub_merchant_contact_number").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sub_merchant_contact_number` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sub_merchant_contact_number").toString()));
      }
      if (jsonObj.get("sub_merchant_jump_link") != null && !jsonObj.get("sub_merchant_jump_link").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sub_merchant_jump_link` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sub_merchant_jump_link").toString()));
      }
      if (jsonObj.get("sub_merchant_logo_url") != null && !jsonObj.get("sub_merchant_logo_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sub_merchant_logo_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sub_merchant_logo_url").toString()));
      }
      if (jsonObj.get("sub_merchant_name") != null && !jsonObj.get("sub_merchant_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sub_merchant_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sub_merchant_name").toString()));
      }
      if (jsonObj.get("sub_pid") != null && !jsonObj.get("sub_pid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sub_pid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sub_pid").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ZhimaMerchantSubsidiariesApplyModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ZhimaMerchantSubsidiariesApplyModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ZhimaMerchantSubsidiariesApplyModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ZhimaMerchantSubsidiariesApplyModel.class));

       return (TypeAdapter<T>) new TypeAdapter<ZhimaMerchantSubsidiariesApplyModel>() {
           @Override
           public void write(JsonWriter out, ZhimaMerchantSubsidiariesApplyModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ZhimaMerchantSubsidiariesApplyModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ZhimaMerchantSubsidiariesApplyModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ZhimaMerchantSubsidiariesApplyModel
  * @throws IOException if the JSON string is invalid with respect to ZhimaMerchantSubsidiariesApplyModel
  */
  public static ZhimaMerchantSubsidiariesApplyModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ZhimaMerchantSubsidiariesApplyModel.class);
  }

 /**
  * Convert an instance of ZhimaMerchantSubsidiariesApplyModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

