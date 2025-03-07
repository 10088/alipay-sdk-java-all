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
import com.alipay.v3.model.AlipayOpenAgentOfflinepaymentSignModel;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.File;
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
 * AlipayOpenAgentOfflinepaymentSignRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenAgentOfflinepaymentSignRequest {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_BUSINESS_LICENSE_PIC = "business_license_pic";
  @SerializedName(SERIALIZED_NAME_BUSINESS_LICENSE_PIC)
  private File businessLicensePic;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private AlipayOpenAgentOfflinepaymentSignModel data;

  public static final String SERIALIZED_NAME_SHOP_SCENE_PIC = "shop_scene_pic";
  @SerializedName(SERIALIZED_NAME_SHOP_SCENE_PIC)
  private File shopScenePic;

  public static final String SERIALIZED_NAME_SHOP_SIGN_BOARD_PIC = "shop_sign_board_pic";
  @SerializedName(SERIALIZED_NAME_SHOP_SIGN_BOARD_PIC)
  private File shopSignBoardPic;

  public static final String SERIALIZED_NAME_SPECIAL_LICENSE_PIC = "special_license_pic";
  @SerializedName(SERIALIZED_NAME_SPECIAL_LICENSE_PIC)
  private File specialLicensePic;

  public AlipayOpenAgentOfflinepaymentSignRequest() { 
  }

  public AlipayOpenAgentOfflinepaymentSignRequest businessLicensePic(File businessLicensePic) {
    
    this.businessLicensePic = businessLicensePic;
    return this;
  }

   /**
   * Get businessLicensePic
   * @return businessLicensePic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public File getBusinessLicensePic() {
    return businessLicensePic;
  }


  public void setBusinessLicensePic(File businessLicensePic) {
    this.businessLicensePic = businessLicensePic;
  }


  public AlipayOpenAgentOfflinepaymentSignRequest data(AlipayOpenAgentOfflinepaymentSignModel data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AlipayOpenAgentOfflinepaymentSignModel getData() {
    return data;
  }


  public void setData(AlipayOpenAgentOfflinepaymentSignModel data) {
    this.data = data;
  }


  public AlipayOpenAgentOfflinepaymentSignRequest shopScenePic(File shopScenePic) {
    
    this.shopScenePic = shopScenePic;
    return this;
  }

   /**
   * Get shopScenePic
   * @return shopScenePic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public File getShopScenePic() {
    return shopScenePic;
  }


  public void setShopScenePic(File shopScenePic) {
    this.shopScenePic = shopScenePic;
  }


  public AlipayOpenAgentOfflinepaymentSignRequest shopSignBoardPic(File shopSignBoardPic) {
    
    this.shopSignBoardPic = shopSignBoardPic;
    return this;
  }

   /**
   * Get shopSignBoardPic
   * @return shopSignBoardPic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public File getShopSignBoardPic() {
    return shopSignBoardPic;
  }


  public void setShopSignBoardPic(File shopSignBoardPic) {
    this.shopSignBoardPic = shopSignBoardPic;
  }


  public AlipayOpenAgentOfflinepaymentSignRequest specialLicensePic(File specialLicensePic) {
    
    this.specialLicensePic = specialLicensePic;
    return this;
  }

   /**
   * Get specialLicensePic
   * @return specialLicensePic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public File getSpecialLicensePic() {
    return specialLicensePic;
  }


  public void setSpecialLicensePic(File specialLicensePic) {
    this.specialLicensePic = specialLicensePic;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenAgentOfflinepaymentSignRequest alipayOpenAgentOfflinepaymentSignRequest = (AlipayOpenAgentOfflinepaymentSignRequest) o;
    return Objects.equals(this.businessLicensePic, alipayOpenAgentOfflinepaymentSignRequest.businessLicensePic) &&
        Objects.equals(this.data, alipayOpenAgentOfflinepaymentSignRequest.data) &&
        Objects.equals(this.shopScenePic, alipayOpenAgentOfflinepaymentSignRequest.shopScenePic) &&
        Objects.equals(this.shopSignBoardPic, alipayOpenAgentOfflinepaymentSignRequest.shopSignBoardPic) &&
        Objects.equals(this.specialLicensePic, alipayOpenAgentOfflinepaymentSignRequest.specialLicensePic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessLicensePic, data, shopScenePic, shopSignBoardPic, specialLicensePic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenAgentOfflinepaymentSignRequest {\n");
    sb.append("    businessLicensePic: ").append(toIndentedString(businessLicensePic)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    shopScenePic: ").append(toIndentedString(shopScenePic)).append("\n");
    sb.append("    shopSignBoardPic: ").append(toIndentedString(shopSignBoardPic)).append("\n");
    sb.append("    specialLicensePic: ").append(toIndentedString(specialLicensePic)).append("\n");
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
    openapiFields.add("business_license_pic");
    openapiFields.add("data");
    openapiFields.add("shop_scene_pic");
    openapiFields.add("shop_sign_board_pic");
    openapiFields.add("special_license_pic");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenAgentOfflinepaymentSignRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenAgentOfflinepaymentSignRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenAgentOfflinepaymentSignRequest is not found in the empty JSON string", AlipayOpenAgentOfflinepaymentSignRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenAgentOfflinepaymentSignRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenAgentOfflinepaymentSignRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `data`
      if (jsonObj.getAsJsonObject("data") != null) {
        AlipayOpenAgentOfflinepaymentSignModel.validateJsonObject(jsonObj.getAsJsonObject("data"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenAgentOfflinepaymentSignRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenAgentOfflinepaymentSignRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenAgentOfflinepaymentSignRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenAgentOfflinepaymentSignRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenAgentOfflinepaymentSignRequest>() {
           @Override
           public void write(JsonWriter out, AlipayOpenAgentOfflinepaymentSignRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenAgentOfflinepaymentSignRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenAgentOfflinepaymentSignRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenAgentOfflinepaymentSignRequest
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenAgentOfflinepaymentSignRequest
  */
  public static AlipayOpenAgentOfflinepaymentSignRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenAgentOfflinepaymentSignRequest.class);
  }

 /**
  * Convert an instance of AlipayOpenAgentOfflinepaymentSignRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

