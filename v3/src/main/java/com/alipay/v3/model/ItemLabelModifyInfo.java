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
 * ItemLabelModifyInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ItemLabelModifyInfo {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_LABEL_KEY = "label_key";
  @SerializedName(SERIALIZED_NAME_LABEL_KEY)
  private String labelKey;

  public static final String SERIALIZED_NAME_LABEL_VALUE = "label_value";
  @SerializedName(SERIALIZED_NAME_LABEL_VALUE)
  private String labelValue;

  public ItemLabelModifyInfo() { 
  }

  public ItemLabelModifyInfo labelKey(String labelKey) {
    
    this.labelKey = labelKey;
    return this;
  }

   /**
   * 标签键  OIL_NUM：油号
   * @return labelKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "OIL_NUM", value = "标签键  OIL_NUM：油号")

  public String getLabelKey() {
    return labelKey;
  }


  public void setLabelKey(String labelKey) {
    this.labelKey = labelKey;
  }


  public ItemLabelModifyInfo labelValue(String labelValue) {
    
    this.labelValue = labelValue;
    return this;
  }

   /**
   * 标签值：  OIL_NUM对应的值为：95# 92# 98# 等等
   * @return labelValue
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "95#", value = "标签值：  OIL_NUM对应的值为：95# 92# 98# 等等")

  public String getLabelValue() {
    return labelValue;
  }


  public void setLabelValue(String labelValue) {
    this.labelValue = labelValue;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemLabelModifyInfo itemLabelModifyInfo = (ItemLabelModifyInfo) o;
    return Objects.equals(this.labelKey, itemLabelModifyInfo.labelKey) &&
        Objects.equals(this.labelValue, itemLabelModifyInfo.labelValue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(labelKey, labelValue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemLabelModifyInfo {\n");
    sb.append("    labelKey: ").append(toIndentedString(labelKey)).append("\n");
    sb.append("    labelValue: ").append(toIndentedString(labelValue)).append("\n");
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
    openapiFields.add("label_key");
    openapiFields.add("label_value");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ItemLabelModifyInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ItemLabelModifyInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ItemLabelModifyInfo is not found in the empty JSON string", ItemLabelModifyInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ItemLabelModifyInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ItemLabelModifyInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("label_key") != null && !jsonObj.get("label_key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `label_key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("label_key").toString()));
      }
      if (jsonObj.get("label_value") != null && !jsonObj.get("label_value").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `label_value` to be a primitive type in the JSON string but got `%s`", jsonObj.get("label_value").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ItemLabelModifyInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ItemLabelModifyInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ItemLabelModifyInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ItemLabelModifyInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<ItemLabelModifyInfo>() {
           @Override
           public void write(JsonWriter out, ItemLabelModifyInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ItemLabelModifyInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ItemLabelModifyInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ItemLabelModifyInfo
  * @throws IOException if the JSON string is invalid with respect to ItemLabelModifyInfo
  */
  public static ItemLabelModifyInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ItemLabelModifyInfo.class);
  }

 /**
  * Convert an instance of ItemLabelModifyInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

