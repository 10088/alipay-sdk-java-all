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
 * ZhimaCustomerJobworthPictureUploadResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ZhimaCustomerJobworthPictureUploadResponseModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_PIC_ID = "pic_id";
  @SerializedName(SERIALIZED_NAME_PIC_ID)
  private String picId;

  public static final String SERIALIZED_NAME_SUB_CODE = "sub_code";
  @SerializedName(SERIALIZED_NAME_SUB_CODE)
  private String subCode;

  public static final String SERIALIZED_NAME_SUB_MSG = "sub_msg";
  @SerializedName(SERIALIZED_NAME_SUB_MSG)
  private String subMsg;

  public ZhimaCustomerJobworthPictureUploadResponseModel() { 
  }

  public ZhimaCustomerJobworthPictureUploadResponseModel picId(String picId) {
    
    this.picId = picId;
    return this;
  }

   /**
   * 图片返回ID
   * @return picId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "abcd123456", value = "图片返回ID")

  public String getPicId() {
    return picId;
  }


  public void setPicId(String picId) {
    this.picId = picId;
  }


  public ZhimaCustomerJobworthPictureUploadResponseModel subCode(String subCode) {
    
    this.subCode = subCode;
    return this;
  }

   /**
   * 错误码
   * @return subCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PICTURE_UPLOAD_LIMIT_ERROR", value = "错误码")

  public String getSubCode() {
    return subCode;
  }


  public void setSubCode(String subCode) {
    this.subCode = subCode;
  }


  public ZhimaCustomerJobworthPictureUploadResponseModel subMsg(String subMsg) {
    
    this.subMsg = subMsg;
    return this;
  }

   /**
   * 错误原因
   * @return subMsg
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "图片上传限制", value = "错误原因")

  public String getSubMsg() {
    return subMsg;
  }


  public void setSubMsg(String subMsg) {
    this.subMsg = subMsg;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZhimaCustomerJobworthPictureUploadResponseModel zhimaCustomerJobworthPictureUploadResponseModel = (ZhimaCustomerJobworthPictureUploadResponseModel) o;
    return Objects.equals(this.picId, zhimaCustomerJobworthPictureUploadResponseModel.picId) &&
        Objects.equals(this.subCode, zhimaCustomerJobworthPictureUploadResponseModel.subCode) &&
        Objects.equals(this.subMsg, zhimaCustomerJobworthPictureUploadResponseModel.subMsg);
  }

  @Override
  public int hashCode() {
    return Objects.hash(picId, subCode, subMsg);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZhimaCustomerJobworthPictureUploadResponseModel {\n");
    sb.append("    picId: ").append(toIndentedString(picId)).append("\n");
    sb.append("    subCode: ").append(toIndentedString(subCode)).append("\n");
    sb.append("    subMsg: ").append(toIndentedString(subMsg)).append("\n");
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
    openapiFields.add("pic_id");
    openapiFields.add("sub_code");
    openapiFields.add("sub_msg");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ZhimaCustomerJobworthPictureUploadResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ZhimaCustomerJobworthPictureUploadResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ZhimaCustomerJobworthPictureUploadResponseModel is not found in the empty JSON string", ZhimaCustomerJobworthPictureUploadResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ZhimaCustomerJobworthPictureUploadResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ZhimaCustomerJobworthPictureUploadResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("pic_id") != null && !jsonObj.get("pic_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pic_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pic_id").toString()));
      }
      if (jsonObj.get("sub_code") != null && !jsonObj.get("sub_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sub_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sub_code").toString()));
      }
      if (jsonObj.get("sub_msg") != null && !jsonObj.get("sub_msg").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sub_msg` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sub_msg").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ZhimaCustomerJobworthPictureUploadResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ZhimaCustomerJobworthPictureUploadResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ZhimaCustomerJobworthPictureUploadResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ZhimaCustomerJobworthPictureUploadResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<ZhimaCustomerJobworthPictureUploadResponseModel>() {
           @Override
           public void write(JsonWriter out, ZhimaCustomerJobworthPictureUploadResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ZhimaCustomerJobworthPictureUploadResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ZhimaCustomerJobworthPictureUploadResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ZhimaCustomerJobworthPictureUploadResponseModel
  * @throws IOException if the JSON string is invalid with respect to ZhimaCustomerJobworthPictureUploadResponseModel
  */
  public static ZhimaCustomerJobworthPictureUploadResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ZhimaCustomerJobworthPictureUploadResponseModel.class);
  }

 /**
  * Convert an instance of ZhimaCustomerJobworthPictureUploadResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

