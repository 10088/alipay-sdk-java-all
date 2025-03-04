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
 * SubFee
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SubFee {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CHARGE_FEE = "charge_fee";
  @SerializedName(SERIALIZED_NAME_CHARGE_FEE)
  private String chargeFee;

  public static final String SERIALIZED_NAME_ORIGINAL_CHARGE_FEE = "original_charge_fee";
  @SerializedName(SERIALIZED_NAME_ORIGINAL_CHARGE_FEE)
  private String originalChargeFee;

  public static final String SERIALIZED_NAME_SWITCH_FEE_RATE = "switch_fee_rate";
  @SerializedName(SERIALIZED_NAME_SWITCH_FEE_RATE)
  private String switchFeeRate;

  public SubFee() { 
  }

  public SubFee chargeFee(String chargeFee) {
    
    this.chargeFee = chargeFee;
    return this;
  }

   /**
   * 实收费用
   * @return chargeFee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "实收费用")

  public String getChargeFee() {
    return chargeFee;
  }


  public void setChargeFee(String chargeFee) {
    this.chargeFee = chargeFee;
  }


  public SubFee originalChargeFee(String originalChargeFee) {
    
    this.originalChargeFee = originalChargeFee;
    return this;
  }

   /**
   * 原始费用
   * @return originalChargeFee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "原始费用")

  public String getOriginalChargeFee() {
    return originalChargeFee;
  }


  public void setOriginalChargeFee(String originalChargeFee) {
    this.originalChargeFee = originalChargeFee;
  }


  public SubFee switchFeeRate(String switchFeeRate) {
    
    this.switchFeeRate = switchFeeRate;
    return this;
  }

   /**
   * 签约费率
   * @return switchFeeRate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "签约费率")

  public String getSwitchFeeRate() {
    return switchFeeRate;
  }


  public void setSwitchFeeRate(String switchFeeRate) {
    this.switchFeeRate = switchFeeRate;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubFee subFee = (SubFee) o;
    return Objects.equals(this.chargeFee, subFee.chargeFee) &&
        Objects.equals(this.originalChargeFee, subFee.originalChargeFee) &&
        Objects.equals(this.switchFeeRate, subFee.switchFeeRate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(chargeFee, originalChargeFee, switchFeeRate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubFee {\n");
    sb.append("    chargeFee: ").append(toIndentedString(chargeFee)).append("\n");
    sb.append("    originalChargeFee: ").append(toIndentedString(originalChargeFee)).append("\n");
    sb.append("    switchFeeRate: ").append(toIndentedString(switchFeeRate)).append("\n");
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
    openapiFields.add("charge_fee");
    openapiFields.add("original_charge_fee");
    openapiFields.add("switch_fee_rate");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SubFee
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SubFee.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SubFee is not found in the empty JSON string", SubFee.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SubFee.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SubFee` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("charge_fee") != null && !jsonObj.get("charge_fee").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `charge_fee` to be a primitive type in the JSON string but got `%s`", jsonObj.get("charge_fee").toString()));
      }
      if (jsonObj.get("original_charge_fee") != null && !jsonObj.get("original_charge_fee").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `original_charge_fee` to be a primitive type in the JSON string but got `%s`", jsonObj.get("original_charge_fee").toString()));
      }
      if (jsonObj.get("switch_fee_rate") != null && !jsonObj.get("switch_fee_rate").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `switch_fee_rate` to be a primitive type in the JSON string but got `%s`", jsonObj.get("switch_fee_rate").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SubFee.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SubFee' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SubFee> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SubFee.class));

       return (TypeAdapter<T>) new TypeAdapter<SubFee>() {
           @Override
           public void write(JsonWriter out, SubFee value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SubFee read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SubFee given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SubFee
  * @throws IOException if the JSON string is invalid with respect to SubFee
  */
  public static SubFee fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SubFee.class);
  }

 /**
  * Convert an instance of SubFee to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

