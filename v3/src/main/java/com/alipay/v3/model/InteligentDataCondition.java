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
 * InteligentDataCondition
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InteligentDataCondition {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_DATA_TYPE = "data_type";
  @SerializedName(SERIALIZED_NAME_DATA_TYPE)
  private String dataType;

  public static final String SERIALIZED_NAME_LIMIT_TYPE = "limit_type";
  @SerializedName(SERIALIZED_NAME_LIMIT_TYPE)
  private String limitType;

  public static final String SERIALIZED_NAME_VALUE = "value";
  @SerializedName(SERIALIZED_NAME_VALUE)
  private String value;

  public InteligentDataCondition() { 
  }

  public InteligentDataCondition dataType(String dataType) {
    
    this.dataType = dataType;
    return this;
  }

   /**
   * 数据类型，支持枚举：文本：STRING；数值：NUMBER；长整型：LONG；浮点型：DOUBLE；日期：DATE；布尔：BOOLEAN；金额：MONEY
   * @return dataType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "NUMBER", value = "数据类型，支持枚举：文本：STRING；数值：NUMBER；长整型：LONG；浮点型：DOUBLE；日期：DATE；布尔：BOOLEAN；金额：MONEY")

  public String getDataType() {
    return dataType;
  }


  public void setDataType(String dataType) {
    this.dataType = dataType;
  }


  public InteligentDataCondition limitType(String limitType) {
    
    this.limitType = limitType;
    return this;
  }

   /**
   * 数据限制类型，支持枚举：固定值：FIX；单选值：SELECT；区间值：RANGE;
   * @return limitType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "RANGE", value = "数据限制类型，支持枚举：固定值：FIX；单选值：SELECT；区间值：RANGE;")

  public String getLimitType() {
    return limitType;
  }


  public void setLimitType(String limitType) {
    this.limitType = limitType;
  }


  public InteligentDataCondition value(String value) {
    
    this.value = value;
    return this;
  }

   /**
   * 数据格式值；如：范围值:(1,10)，固定值:1
   * @return value
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "(1,10)", value = "数据格式值；如：范围值:(1,10)，固定值:1")

  public String getValue() {
    return value;
  }


  public void setValue(String value) {
    this.value = value;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InteligentDataCondition inteligentDataCondition = (InteligentDataCondition) o;
    return Objects.equals(this.dataType, inteligentDataCondition.dataType) &&
        Objects.equals(this.limitType, inteligentDataCondition.limitType) &&
        Objects.equals(this.value, inteligentDataCondition.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataType, limitType, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InteligentDataCondition {\n");
    sb.append("    dataType: ").append(toIndentedString(dataType)).append("\n");
    sb.append("    limitType: ").append(toIndentedString(limitType)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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
    openapiFields.add("data_type");
    openapiFields.add("limit_type");
    openapiFields.add("value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InteligentDataCondition
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (InteligentDataCondition.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in InteligentDataCondition is not found in the empty JSON string", InteligentDataCondition.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!InteligentDataCondition.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InteligentDataCondition` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("data_type") != null && !jsonObj.get("data_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `data_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("data_type").toString()));
      }
      if (jsonObj.get("limit_type") != null && !jsonObj.get("limit_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `limit_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("limit_type").toString()));
      }
      if (jsonObj.get("value") != null && !jsonObj.get("value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InteligentDataCondition.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InteligentDataCondition' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InteligentDataCondition> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InteligentDataCondition.class));

       return (TypeAdapter<T>) new TypeAdapter<InteligentDataCondition>() {
           @Override
           public void write(JsonWriter out, InteligentDataCondition value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InteligentDataCondition read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InteligentDataCondition given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InteligentDataCondition
  * @throws IOException if the JSON string is invalid with respect to InteligentDataCondition
  */
  public static InteligentDataCondition fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InteligentDataCondition.class);
  }

 /**
  * Convert an instance of InteligentDataCondition to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

