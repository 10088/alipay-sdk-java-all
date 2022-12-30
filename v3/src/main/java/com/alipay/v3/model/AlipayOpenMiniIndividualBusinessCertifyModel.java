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
 * AlipayOpenMiniIndividualBusinessCertifyModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenMiniIndividualBusinessCertifyModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_LICENSE_NO = "license_no";
  @SerializedName(SERIALIZED_NAME_LICENSE_NO)
  private String licenseNo;

  public static final String SERIALIZED_NAME_LICENSE_PIC = "license_pic";
  @SerializedName(SERIALIZED_NAME_LICENSE_PIC)
  private String licensePic;

  public AlipayOpenMiniIndividualBusinessCertifyModel() { 
  }

  public AlipayOpenMiniIndividualBusinessCertifyModel licenseNo(String licenseNo) {
    
    this.licenseNo = licenseNo;
    return this;
  }

   /**
   * 营业执照注册号即营业执照的编号。
   * @return licenseNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1235234234123124234234", value = "营业执照注册号即营业执照的编号。")

  public String getLicenseNo() {
    return licenseNo;
  }


  public void setLicenseNo(String licenseNo) {
    this.licenseNo = licenseNo;
  }


  public AlipayOpenMiniIndividualBusinessCertifyModel licensePic(String licensePic) {
    
    this.licensePic = licensePic;
    return this;
  }

   /**
   * 营业执照图片的Base64编码字符串，图片大小不能超过2M
   * @return licensePic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "/9j/Qnl0ZUFycmF5T3V0cHV0U3RyZWFtIG91dHB1dCA9IG5ldyBCeXRlQ中间缩略Skge30=", value = "营业执照图片的Base64编码字符串，图片大小不能超过2M")

  public String getLicensePic() {
    return licensePic;
  }


  public void setLicensePic(String licensePic) {
    this.licensePic = licensePic;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenMiniIndividualBusinessCertifyModel alipayOpenMiniIndividualBusinessCertifyModel = (AlipayOpenMiniIndividualBusinessCertifyModel) o;
    return Objects.equals(this.licenseNo, alipayOpenMiniIndividualBusinessCertifyModel.licenseNo) &&
        Objects.equals(this.licensePic, alipayOpenMiniIndividualBusinessCertifyModel.licensePic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(licenseNo, licensePic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenMiniIndividualBusinessCertifyModel {\n");
    sb.append("    licenseNo: ").append(toIndentedString(licenseNo)).append("\n");
    sb.append("    licensePic: ").append(toIndentedString(licensePic)).append("\n");
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
    openapiFields.add("license_no");
    openapiFields.add("license_pic");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenMiniIndividualBusinessCertifyModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenMiniIndividualBusinessCertifyModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenMiniIndividualBusinessCertifyModel is not found in the empty JSON string", AlipayOpenMiniIndividualBusinessCertifyModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenMiniIndividualBusinessCertifyModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenMiniIndividualBusinessCertifyModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("license_no") != null && !jsonObj.get("license_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `license_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("license_no").toString()));
      }
      if (jsonObj.get("license_pic") != null && !jsonObj.get("license_pic").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `license_pic` to be a primitive type in the JSON string but got `%s`", jsonObj.get("license_pic").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenMiniIndividualBusinessCertifyModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenMiniIndividualBusinessCertifyModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenMiniIndividualBusinessCertifyModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenMiniIndividualBusinessCertifyModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenMiniIndividualBusinessCertifyModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenMiniIndividualBusinessCertifyModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenMiniIndividualBusinessCertifyModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenMiniIndividualBusinessCertifyModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenMiniIndividualBusinessCertifyModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenMiniIndividualBusinessCertifyModel
  */
  public static AlipayOpenMiniIndividualBusinessCertifyModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenMiniIndividualBusinessCertifyModel.class);
  }

 /**
  * Convert an instance of AlipayOpenMiniIndividualBusinessCertifyModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

