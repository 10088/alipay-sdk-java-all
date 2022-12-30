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
import com.alipay.v3.model.Marketingtest;
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
 * Marketingtestt
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Marketingtestt {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_TEST22 = "test_22";
  @SerializedName(SERIALIZED_NAME_TEST22)
  private Marketingtest test22;

  public Marketingtestt() { 
  }

  public Marketingtestt test22(Marketingtest test22) {
    
    this.test22 = test22;
    return this;
  }

   /**
   * Get test22
   * @return test22
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Marketingtest getTest22() {
    return test22;
  }


  public void setTest22(Marketingtest test22) {
    this.test22 = test22;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Marketingtestt marketingtestt = (Marketingtestt) o;
    return Objects.equals(this.test22, marketingtestt.test22);
  }

  @Override
  public int hashCode() {
    return Objects.hash(test22);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Marketingtestt {\n");
    sb.append("    test22: ").append(toIndentedString(test22)).append("\n");
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
    openapiFields.add("test_22");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Marketingtestt
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Marketingtestt.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Marketingtestt is not found in the empty JSON string", Marketingtestt.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Marketingtestt.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Marketingtestt` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `test_22`
      if (jsonObj.getAsJsonObject("test_22") != null) {
        Marketingtest.validateJsonObject(jsonObj.getAsJsonObject("test_22"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Marketingtestt.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Marketingtestt' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Marketingtestt> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Marketingtestt.class));

       return (TypeAdapter<T>) new TypeAdapter<Marketingtestt>() {
           @Override
           public void write(JsonWriter out, Marketingtestt value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Marketingtestt read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Marketingtestt given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Marketingtestt
  * @throws IOException if the JSON string is invalid with respect to Marketingtestt
  */
  public static Marketingtestt fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Marketingtestt.class);
  }

 /**
  * Convert an instance of Marketingtestt to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

