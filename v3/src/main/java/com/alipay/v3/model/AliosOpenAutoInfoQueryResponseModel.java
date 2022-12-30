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
 * AliosOpenAutoInfoQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AliosOpenAutoInfoQueryResponseModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ENGINE_NO = "engine_no";
  @SerializedName(SERIALIZED_NAME_ENGINE_NO)
  private String engineNo;

  public static final String SERIALIZED_NAME_LICENSE_NO = "license_no";
  @SerializedName(SERIALIZED_NAME_LICENSE_NO)
  private String licenseNo;

  public static final String SERIALIZED_NAME_USER_ACTIVATION_TIME = "user_activation_time";
  @SerializedName(SERIALIZED_NAME_USER_ACTIVATION_TIME)
  private String userActivationTime;

  public static final String SERIALIZED_NAME_VEHICLE_TYPE = "vehicle_type";
  @SerializedName(SERIALIZED_NAME_VEHICLE_TYPE)
  private String vehicleType;

  public static final String SERIALIZED_NAME_VIN = "vin";
  @SerializedName(SERIALIZED_NAME_VIN)
  private String vin;

  public AliosOpenAutoInfoQueryResponseModel() { 
  }

  public AliosOpenAutoInfoQueryResponseModel engineNo(String engineNo) {
    
    this.engineNo = engineNo;
    return this;
  }

   /**
   * 发动机号
   * @return engineNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "234534634523", value = "发动机号")

  public String getEngineNo() {
    return engineNo;
  }


  public void setEngineNo(String engineNo) {
    this.engineNo = engineNo;
  }


  public AliosOpenAutoInfoQueryResponseModel licenseNo(String licenseNo) {
    
    this.licenseNo = licenseNo;
    return this;
  }

   /**
   * 车牌号
   * @return licenseNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "京FW12A7", value = "车牌号")

  public String getLicenseNo() {
    return licenseNo;
  }


  public void setLicenseNo(String licenseNo) {
    this.licenseNo = licenseNo;
  }


  public AliosOpenAutoInfoQueryResponseModel userActivationTime(String userActivationTime) {
    
    this.userActivationTime = userActivationTime;
    return this;
  }

   /**
   * 用户激活时间
   * @return userActivationTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2020-04-29 15:53:11", value = "用户激活时间")

  public String getUserActivationTime() {
    return userActivationTime;
  }


  public void setUserActivationTime(String userActivationTime) {
    this.userActivationTime = userActivationTime;
  }


  public AliosOpenAutoInfoQueryResponseModel vehicleType(String vehicleType) {
    
    this.vehicleType = vehicleType;
    return this;
  }

   /**
   * 车辆类型
   * @return vehicleType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "02", value = "车辆类型")

  public String getVehicleType() {
    return vehicleType;
  }


  public void setVehicleType(String vehicleType) {
    this.vehicleType = vehicleType;
  }


  public AliosOpenAutoInfoQueryResponseModel vin(String vin) {
    
    this.vin = vin;
    return this;
  }

   /**
   * 车辆识别号码
   * @return vin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "T1D234E567A890H", value = "车辆识别号码")

  public String getVin() {
    return vin;
  }


  public void setVin(String vin) {
    this.vin = vin;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AliosOpenAutoInfoQueryResponseModel aliosOpenAutoInfoQueryResponseModel = (AliosOpenAutoInfoQueryResponseModel) o;
    return Objects.equals(this.engineNo, aliosOpenAutoInfoQueryResponseModel.engineNo) &&
        Objects.equals(this.licenseNo, aliosOpenAutoInfoQueryResponseModel.licenseNo) &&
        Objects.equals(this.userActivationTime, aliosOpenAutoInfoQueryResponseModel.userActivationTime) &&
        Objects.equals(this.vehicleType, aliosOpenAutoInfoQueryResponseModel.vehicleType) &&
        Objects.equals(this.vin, aliosOpenAutoInfoQueryResponseModel.vin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(engineNo, licenseNo, userActivationTime, vehicleType, vin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AliosOpenAutoInfoQueryResponseModel {\n");
    sb.append("    engineNo: ").append(toIndentedString(engineNo)).append("\n");
    sb.append("    licenseNo: ").append(toIndentedString(licenseNo)).append("\n");
    sb.append("    userActivationTime: ").append(toIndentedString(userActivationTime)).append("\n");
    sb.append("    vehicleType: ").append(toIndentedString(vehicleType)).append("\n");
    sb.append("    vin: ").append(toIndentedString(vin)).append("\n");
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
    openapiFields.add("engine_no");
    openapiFields.add("license_no");
    openapiFields.add("user_activation_time");
    openapiFields.add("vehicle_type");
    openapiFields.add("vin");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AliosOpenAutoInfoQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AliosOpenAutoInfoQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AliosOpenAutoInfoQueryResponseModel is not found in the empty JSON string", AliosOpenAutoInfoQueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AliosOpenAutoInfoQueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AliosOpenAutoInfoQueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("engine_no") != null && !jsonObj.get("engine_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `engine_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("engine_no").toString()));
      }
      if (jsonObj.get("license_no") != null && !jsonObj.get("license_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `license_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("license_no").toString()));
      }
      if (jsonObj.get("user_activation_time") != null && !jsonObj.get("user_activation_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `user_activation_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("user_activation_time").toString()));
      }
      if (jsonObj.get("vehicle_type") != null && !jsonObj.get("vehicle_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vehicle_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vehicle_type").toString()));
      }
      if (jsonObj.get("vin") != null && !jsonObj.get("vin").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `vin` to be a primitive type in the JSON string but got `%s`", jsonObj.get("vin").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AliosOpenAutoInfoQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AliosOpenAutoInfoQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AliosOpenAutoInfoQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AliosOpenAutoInfoQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AliosOpenAutoInfoQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AliosOpenAutoInfoQueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AliosOpenAutoInfoQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AliosOpenAutoInfoQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AliosOpenAutoInfoQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AliosOpenAutoInfoQueryResponseModel
  */
  public static AliosOpenAutoInfoQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AliosOpenAutoInfoQueryResponseModel.class);
  }

 /**
  * Convert an instance of AliosOpenAutoInfoQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

