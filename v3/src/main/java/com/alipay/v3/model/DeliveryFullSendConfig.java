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
import com.alipay.v3.model.DeliveryContentInfo;
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
 * DeliveryFullSendConfig
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DeliveryFullSendConfig {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_DELIVERY_CONTENT_INFO = "delivery_content_info";
  @SerializedName(SERIALIZED_NAME_DELIVERY_CONTENT_INFO)
  private DeliveryContentInfo deliveryContentInfo;

  public static final String SERIALIZED_NAME_DELIVERY_FLOOR_AMOUNT = "delivery_floor_amount";
  @SerializedName(SERIALIZED_NAME_DELIVERY_FLOOR_AMOUNT)
  private String deliveryFloorAmount;

  public DeliveryFullSendConfig() { 
  }

  public DeliveryFullSendConfig deliveryContentInfo(DeliveryContentInfo deliveryContentInfo) {
    
    this.deliveryContentInfo = deliveryContentInfo;
    return this;
  }

   /**
   * Get deliveryContentInfo
   * @return deliveryContentInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DeliveryContentInfo getDeliveryContentInfo() {
    return deliveryContentInfo;
  }


  public void setDeliveryContentInfo(DeliveryContentInfo deliveryContentInfo) {
    this.deliveryContentInfo = deliveryContentInfo;
  }


  public DeliveryFullSendConfig deliveryFloorAmount(String deliveryFloorAmount) {
    
    this.deliveryFloorAmount = deliveryFloorAmount;
    return this;
  }

   /**
   * 满足消费金额门槛，左闭区间，单位元。 说明：限制支付时的订单金额最少满足的金额门槛。 限制：value &gt; 0 &amp;&amp; value &lt;&#x3D; 99999。
   * @return deliveryFloorAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "满足消费金额门槛，左闭区间，单位元。 说明：限制支付时的订单金额最少满足的金额门槛。 限制：value > 0 && value <= 99999。")

  public String getDeliveryFloorAmount() {
    return deliveryFloorAmount;
  }


  public void setDeliveryFloorAmount(String deliveryFloorAmount) {
    this.deliveryFloorAmount = deliveryFloorAmount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeliveryFullSendConfig deliveryFullSendConfig = (DeliveryFullSendConfig) o;
    return Objects.equals(this.deliveryContentInfo, deliveryFullSendConfig.deliveryContentInfo) &&
        Objects.equals(this.deliveryFloorAmount, deliveryFullSendConfig.deliveryFloorAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliveryContentInfo, deliveryFloorAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeliveryFullSendConfig {\n");
    sb.append("    deliveryContentInfo: ").append(toIndentedString(deliveryContentInfo)).append("\n");
    sb.append("    deliveryFloorAmount: ").append(toIndentedString(deliveryFloorAmount)).append("\n");
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
    openapiFields.add("delivery_content_info");
    openapiFields.add("delivery_floor_amount");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DeliveryFullSendConfig
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (DeliveryFullSendConfig.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in DeliveryFullSendConfig is not found in the empty JSON string", DeliveryFullSendConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DeliveryFullSendConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DeliveryFullSendConfig` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `delivery_content_info`
      if (jsonObj.getAsJsonObject("delivery_content_info") != null) {
        DeliveryContentInfo.validateJsonObject(jsonObj.getAsJsonObject("delivery_content_info"));
      }
      if (jsonObj.get("delivery_floor_amount") != null && !jsonObj.get("delivery_floor_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `delivery_floor_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("delivery_floor_amount").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DeliveryFullSendConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DeliveryFullSendConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DeliveryFullSendConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DeliveryFullSendConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<DeliveryFullSendConfig>() {
           @Override
           public void write(JsonWriter out, DeliveryFullSendConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DeliveryFullSendConfig read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DeliveryFullSendConfig given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DeliveryFullSendConfig
  * @throws IOException if the JSON string is invalid with respect to DeliveryFullSendConfig
  */
  public static DeliveryFullSendConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DeliveryFullSendConfig.class);
  }

 /**
  * Convert an instance of DeliveryFullSendConfig to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

