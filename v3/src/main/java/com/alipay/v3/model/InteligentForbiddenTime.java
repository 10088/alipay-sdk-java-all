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
 * InteligentForbiddenTime
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InteligentForbiddenTime {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_DAYS = "days";
  @SerializedName(SERIALIZED_NAME_DAYS)
  private String days;

  public InteligentForbiddenTime() { 
  }

  public InteligentForbiddenTime days(String days) {
    
    this.days = days;
    return this;
  }

   /**
   * 不可用日期区间，仅支持到天  不可用区间起止日期用逗号分隔，多个区间之间用^分隔  如\&quot;2016-05-01,2016-05-03^2016-10-01,2016-10-07\&quot;表示2016年5月1日至5月3日，10月1日至10月7日券不可用
   * @return days
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016-03-03,2016-03-08^2016-10-01,2016-10-01", value = "不可用日期区间，仅支持到天  不可用区间起止日期用逗号分隔，多个区间之间用^分隔  如\"2016-05-01,2016-05-03^2016-10-01,2016-10-07\"表示2016年5月1日至5月3日，10月1日至10月7日券不可用")

  public String getDays() {
    return days;
  }


  public void setDays(String days) {
    this.days = days;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InteligentForbiddenTime inteligentForbiddenTime = (InteligentForbiddenTime) o;
    return Objects.equals(this.days, inteligentForbiddenTime.days);
  }

  @Override
  public int hashCode() {
    return Objects.hash(days);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InteligentForbiddenTime {\n");
    sb.append("    days: ").append(toIndentedString(days)).append("\n");
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
    openapiFields.add("days");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to InteligentForbiddenTime
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (InteligentForbiddenTime.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in InteligentForbiddenTime is not found in the empty JSON string", InteligentForbiddenTime.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!InteligentForbiddenTime.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InteligentForbiddenTime` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("days") != null && !jsonObj.get("days").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `days` to be a primitive type in the JSON string but got `%s`", jsonObj.get("days").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InteligentForbiddenTime.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InteligentForbiddenTime' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InteligentForbiddenTime> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InteligentForbiddenTime.class));

       return (TypeAdapter<T>) new TypeAdapter<InteligentForbiddenTime>() {
           @Override
           public void write(JsonWriter out, InteligentForbiddenTime value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InteligentForbiddenTime read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of InteligentForbiddenTime given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of InteligentForbiddenTime
  * @throws IOException if the JSON string is invalid with respect to InteligentForbiddenTime
  */
  public static InteligentForbiddenTime fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InteligentForbiddenTime.class);
  }

 /**
  * Convert an instance of InteligentForbiddenTime to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

