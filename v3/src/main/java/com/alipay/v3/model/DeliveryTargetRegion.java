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
 * DeliveryTargetRegion
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DeliveryTargetRegion {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_REGION_CODE = "region_code";
  @SerializedName(SERIALIZED_NAME_REGION_CODE)
  private String regionCode;

  public static final String SERIALIZED_NAME_REGION_NAME = "region_name";
  @SerializedName(SERIALIZED_NAME_REGION_NAME)
  private String regionName;

  public static final String SERIALIZED_NAME_REGION_TYPE = "region_type";
  @SerializedName(SERIALIZED_NAME_REGION_TYPE)
  private String regionType;

  public DeliveryTargetRegion() { 
  }

  public DeliveryTargetRegion regionCode(String regionCode) {
    
    this.regionCode = regionCode;
    return this;
  }

   /**
   * 区域编码，参考&lt;a href&#x3D;\&quot;https://opendocs.alipay.com/mini/03fjbg\&quot; target&#x3D;\&quot;_blank\&quot;&gt;取值说明&lt;/a&gt;
   * @return regionCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "区域编码，参考<a href=\"https://opendocs.alipay.com/mini/03fjbg\" target=\"_blank\">取值说明</a>")

  public String getRegionCode() {
    return regionCode;
  }


  public void setRegionCode(String regionCode) {
    this.regionCode = regionCode;
  }


  public DeliveryTargetRegion regionName(String regionName) {
    
    this.regionName = regionName;
    return this;
  }

   /**
   * 区域名，参考&lt;a href&#x3D;\&quot;https://opendocs.alipay.com/mini/03fjbg\&quot; target&#x3D;\&quot;_blank\&quot;&gt;取值说明&lt;/a&gt;
   * @return regionName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "区域名，参考<a href=\"https://opendocs.alipay.com/mini/03fjbg\" target=\"_blank\">取值说明</a>")

  public String getRegionName() {
    return regionName;
  }


  public void setRegionName(String regionName) {
    this.regionName = regionName;
  }


  public DeliveryTargetRegion regionType(String regionType) {
    
    this.regionType = regionType;
    return this;
  }

   /**
   * 区域类型，1代表全国，2代表省级区域，3代表市级区域，参考&lt;a href&#x3D;\&quot;https://opendocs.alipay.com/mini/03fjbg\&quot; target&#x3D;\&quot;_blank\&quot;&gt;取值说明&lt;/a&gt;
   * @return regionType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "区域类型，1代表全国，2代表省级区域，3代表市级区域，参考<a href=\"https://opendocs.alipay.com/mini/03fjbg\" target=\"_blank\">取值说明</a>")

  public String getRegionType() {
    return regionType;
  }


  public void setRegionType(String regionType) {
    this.regionType = regionType;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DeliveryTargetRegion deliveryTargetRegion = (DeliveryTargetRegion) o;
    return Objects.equals(this.regionCode, deliveryTargetRegion.regionCode) &&
        Objects.equals(this.regionName, deliveryTargetRegion.regionName) &&
        Objects.equals(this.regionType, deliveryTargetRegion.regionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(regionCode, regionName, regionType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DeliveryTargetRegion {\n");
    sb.append("    regionCode: ").append(toIndentedString(regionCode)).append("\n");
    sb.append("    regionName: ").append(toIndentedString(regionName)).append("\n");
    sb.append("    regionType: ").append(toIndentedString(regionType)).append("\n");
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
    openapiFields.add("region_code");
    openapiFields.add("region_name");
    openapiFields.add("region_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DeliveryTargetRegion
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (DeliveryTargetRegion.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in DeliveryTargetRegion is not found in the empty JSON string", DeliveryTargetRegion.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DeliveryTargetRegion.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DeliveryTargetRegion` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("region_code") != null && !jsonObj.get("region_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `region_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("region_code").toString()));
      }
      if (jsonObj.get("region_name") != null && !jsonObj.get("region_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `region_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("region_name").toString()));
      }
      if (jsonObj.get("region_type") != null && !jsonObj.get("region_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `region_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("region_type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DeliveryTargetRegion.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DeliveryTargetRegion' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DeliveryTargetRegion> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DeliveryTargetRegion.class));

       return (TypeAdapter<T>) new TypeAdapter<DeliveryTargetRegion>() {
           @Override
           public void write(JsonWriter out, DeliveryTargetRegion value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DeliveryTargetRegion read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DeliveryTargetRegion given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DeliveryTargetRegion
  * @throws IOException if the JSON string is invalid with respect to DeliveryTargetRegion
  */
  public static DeliveryTargetRegion fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DeliveryTargetRegion.class);
  }

 /**
  * Convert an instance of DeliveryTargetRegion to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

