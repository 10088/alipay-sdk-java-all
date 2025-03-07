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
 * AlipayEcoMycarParkingChargeinfoSyncResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayEcoMycarParkingChargeinfoSyncResponseModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_SYNC_RESULT = "sync_result";
  @SerializedName(SERIALIZED_NAME_SYNC_RESULT)
  private String syncResult;

  public AlipayEcoMycarParkingChargeinfoSyncResponseModel() { 
  }

  public AlipayEcoMycarParkingChargeinfoSyncResponseModel syncResult(String syncResult) {
    
    this.syncResult = syncResult;
    return this;
  }

   /**
   * 同步结果：0 成功，1 失败
   * @return syncResult
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "同步结果：0 成功，1 失败")

  public String getSyncResult() {
    return syncResult;
  }


  public void setSyncResult(String syncResult) {
    this.syncResult = syncResult;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayEcoMycarParkingChargeinfoSyncResponseModel alipayEcoMycarParkingChargeinfoSyncResponseModel = (AlipayEcoMycarParkingChargeinfoSyncResponseModel) o;
    return Objects.equals(this.syncResult, alipayEcoMycarParkingChargeinfoSyncResponseModel.syncResult);
  }

  @Override
  public int hashCode() {
    return Objects.hash(syncResult);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayEcoMycarParkingChargeinfoSyncResponseModel {\n");
    sb.append("    syncResult: ").append(toIndentedString(syncResult)).append("\n");
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
    openapiFields.add("sync_result");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayEcoMycarParkingChargeinfoSyncResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayEcoMycarParkingChargeinfoSyncResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayEcoMycarParkingChargeinfoSyncResponseModel is not found in the empty JSON string", AlipayEcoMycarParkingChargeinfoSyncResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayEcoMycarParkingChargeinfoSyncResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayEcoMycarParkingChargeinfoSyncResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("sync_result") != null && !jsonObj.get("sync_result").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sync_result` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sync_result").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayEcoMycarParkingChargeinfoSyncResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayEcoMycarParkingChargeinfoSyncResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayEcoMycarParkingChargeinfoSyncResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayEcoMycarParkingChargeinfoSyncResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayEcoMycarParkingChargeinfoSyncResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayEcoMycarParkingChargeinfoSyncResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayEcoMycarParkingChargeinfoSyncResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayEcoMycarParkingChargeinfoSyncResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayEcoMycarParkingChargeinfoSyncResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayEcoMycarParkingChargeinfoSyncResponseModel
  */
  public static AlipayEcoMycarParkingChargeinfoSyncResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayEcoMycarParkingChargeinfoSyncResponseModel.class);
  }

 /**
  * Convert an instance of AlipayEcoMycarParkingChargeinfoSyncResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

