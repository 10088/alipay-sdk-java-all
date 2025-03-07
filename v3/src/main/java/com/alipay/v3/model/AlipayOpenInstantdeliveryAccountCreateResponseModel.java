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
import com.alipay.v3.model.LogisticsAccountStatusDTO;
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
 * AlipayOpenInstantdeliveryAccountCreateResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenInstantdeliveryAccountCreateResponseModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_LOGISTICS_ACCOUNT_STATUS = "logistics_account_status";
  @SerializedName(SERIALIZED_NAME_LOGISTICS_ACCOUNT_STATUS)
  private List<LogisticsAccountStatusDTO> logisticsAccountStatus = null;

  public AlipayOpenInstantdeliveryAccountCreateResponseModel() { 
  }

  public AlipayOpenInstantdeliveryAccountCreateResponseModel logisticsAccountStatus(List<LogisticsAccountStatusDTO> logisticsAccountStatus) {
    
    this.logisticsAccountStatus = logisticsAccountStatus;
    return this;
  }

  public AlipayOpenInstantdeliveryAccountCreateResponseModel addLogisticsAccountStatusItem(LogisticsAccountStatusDTO logisticsAccountStatusItem) {
    if (this.logisticsAccountStatus == null) {
      this.logisticsAccountStatus = new ArrayList<>();
    }
    this.logisticsAccountStatus.add(logisticsAccountStatusItem);
    return this;
  }

   /**
   * 配送公司账户创建结果列表
   * @return logisticsAccountStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "配送公司账户创建结果列表")

  public List<LogisticsAccountStatusDTO> getLogisticsAccountStatus() {
    return logisticsAccountStatus;
  }


  public void setLogisticsAccountStatus(List<LogisticsAccountStatusDTO> logisticsAccountStatus) {
    this.logisticsAccountStatus = logisticsAccountStatus;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenInstantdeliveryAccountCreateResponseModel alipayOpenInstantdeliveryAccountCreateResponseModel = (AlipayOpenInstantdeliveryAccountCreateResponseModel) o;
    return Objects.equals(this.logisticsAccountStatus, alipayOpenInstantdeliveryAccountCreateResponseModel.logisticsAccountStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logisticsAccountStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenInstantdeliveryAccountCreateResponseModel {\n");
    sb.append("    logisticsAccountStatus: ").append(toIndentedString(logisticsAccountStatus)).append("\n");
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
    openapiFields.add("logistics_account_status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenInstantdeliveryAccountCreateResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenInstantdeliveryAccountCreateResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenInstantdeliveryAccountCreateResponseModel is not found in the empty JSON string", AlipayOpenInstantdeliveryAccountCreateResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenInstantdeliveryAccountCreateResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenInstantdeliveryAccountCreateResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArraylogisticsAccountStatus = jsonObj.getAsJsonArray("logistics_account_status");
      if (jsonArraylogisticsAccountStatus != null) {
        // ensure the json data is an array
        if (!jsonObj.get("logistics_account_status").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `logistics_account_status` to be an array in the JSON string but got `%s`", jsonObj.get("logistics_account_status").toString()));
        }

        // validate the optional field `logistics_account_status` (array)
        for (int i = 0; i < jsonArraylogisticsAccountStatus.size(); i++) {
          LogisticsAccountStatusDTO.validateJsonObject(jsonArraylogisticsAccountStatus.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenInstantdeliveryAccountCreateResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenInstantdeliveryAccountCreateResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenInstantdeliveryAccountCreateResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenInstantdeliveryAccountCreateResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenInstantdeliveryAccountCreateResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenInstantdeliveryAccountCreateResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenInstantdeliveryAccountCreateResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenInstantdeliveryAccountCreateResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenInstantdeliveryAccountCreateResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenInstantdeliveryAccountCreateResponseModel
  */
  public static AlipayOpenInstantdeliveryAccountCreateResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenInstantdeliveryAccountCreateResponseModel.class);
  }

 /**
  * Convert an instance of AlipayOpenInstantdeliveryAccountCreateResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

