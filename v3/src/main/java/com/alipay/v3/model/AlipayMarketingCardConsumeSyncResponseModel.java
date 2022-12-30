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
 * AlipayMarketingCardConsumeSyncResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayMarketingCardConsumeSyncResponseModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_EXTERNAL_CARD_NO = "external_card_no";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_CARD_NO)
  private String externalCardNo;

  public AlipayMarketingCardConsumeSyncResponseModel() { 
  }

  public AlipayMarketingCardConsumeSyncResponseModel externalCardNo(String externalCardNo) {
    
    this.externalCardNo = externalCardNo;
    return this;
  }

   /**
   * 外部卡号
   * @return externalCardNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "EXT10000001", value = "外部卡号")

  public String getExternalCardNo() {
    return externalCardNo;
  }


  public void setExternalCardNo(String externalCardNo) {
    this.externalCardNo = externalCardNo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayMarketingCardConsumeSyncResponseModel alipayMarketingCardConsumeSyncResponseModel = (AlipayMarketingCardConsumeSyncResponseModel) o;
    return Objects.equals(this.externalCardNo, alipayMarketingCardConsumeSyncResponseModel.externalCardNo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalCardNo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayMarketingCardConsumeSyncResponseModel {\n");
    sb.append("    externalCardNo: ").append(toIndentedString(externalCardNo)).append("\n");
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
    openapiFields.add("external_card_no");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayMarketingCardConsumeSyncResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayMarketingCardConsumeSyncResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayMarketingCardConsumeSyncResponseModel is not found in the empty JSON string", AlipayMarketingCardConsumeSyncResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayMarketingCardConsumeSyncResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayMarketingCardConsumeSyncResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("external_card_no") != null && !jsonObj.get("external_card_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `external_card_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("external_card_no").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayMarketingCardConsumeSyncResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayMarketingCardConsumeSyncResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayMarketingCardConsumeSyncResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayMarketingCardConsumeSyncResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayMarketingCardConsumeSyncResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayMarketingCardConsumeSyncResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayMarketingCardConsumeSyncResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayMarketingCardConsumeSyncResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayMarketingCardConsumeSyncResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayMarketingCardConsumeSyncResponseModel
  */
  public static AlipayMarketingCardConsumeSyncResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayMarketingCardConsumeSyncResponseModel.class);
  }

 /**
  * Convert an instance of AlipayMarketingCardConsumeSyncResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

