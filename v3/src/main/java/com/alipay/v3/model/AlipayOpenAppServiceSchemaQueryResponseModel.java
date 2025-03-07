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
 * AlipayOpenAppServiceSchemaQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenAppServiceSchemaQueryResponseModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CATEGORY_ID = "category_id";
  @SerializedName(SERIALIZED_NAME_CATEGORY_ID)
  private String categoryId;

  public static final String SERIALIZED_NAME_SCHEMA_VERSION = "schema_version";
  @SerializedName(SERIALIZED_NAME_SCHEMA_VERSION)
  private String schemaVersion;

  public static final String SERIALIZED_NAME_SCHEMA_XML = "schema_xml";
  @SerializedName(SERIALIZED_NAME_SCHEMA_XML)
  private String schemaXml;

  public AlipayOpenAppServiceSchemaQueryResponseModel() { 
  }

  public AlipayOpenAppServiceSchemaQueryResponseModel categoryId(String categoryId) {
    
    this.categoryId = categoryId;
    return this;
  }

   /**
   * 类目id
   * @return categoryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "c11111", value = "类目id")

  public String getCategoryId() {
    return categoryId;
  }


  public void setCategoryId(String categoryId) {
    this.categoryId = categoryId;
  }


  public AlipayOpenAppServiceSchemaQueryResponseModel schemaVersion(String schemaVersion) {
    
    this.schemaVersion = schemaVersion;
    return this;
  }

   /**
   * 服务schema版本
   * @return schemaVersion
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "v1.0", value = "服务schema版本")

  public String getSchemaVersion() {
    return schemaVersion;
  }


  public void setSchemaVersion(String schemaVersion) {
    this.schemaVersion = schemaVersion;
  }


  public AlipayOpenAppServiceSchemaQueryResponseModel schemaXml(String schemaXml) {
    
    this.schemaXml = schemaXml;
    return this;
  }

   /**
   * 服务schema
   * @return schemaXml
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "<serviceSchema><attribute id=\"serviceName\" name=\"服务名称\" type=\"single\" valueType=\"text\"><rules><rule type=\"valid\" code=\"maxLength\" name=\"最大长度\" value=\"10\"/><rule type=\"valid\" code=\"reg\" name=\"正则表达式\" value=\"[^A-Za-z0-9一-龥]\"/><rule type=\"tips\" code=\"inputTip\" name=\"底纹提示文案\" value=\"请输入服务名称,不超过8个字符,不含特殊字符\"/></rules></attribute></serviceSchema>", value = "服务schema")

  public String getSchemaXml() {
    return schemaXml;
  }


  public void setSchemaXml(String schemaXml) {
    this.schemaXml = schemaXml;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenAppServiceSchemaQueryResponseModel alipayOpenAppServiceSchemaQueryResponseModel = (AlipayOpenAppServiceSchemaQueryResponseModel) o;
    return Objects.equals(this.categoryId, alipayOpenAppServiceSchemaQueryResponseModel.categoryId) &&
        Objects.equals(this.schemaVersion, alipayOpenAppServiceSchemaQueryResponseModel.schemaVersion) &&
        Objects.equals(this.schemaXml, alipayOpenAppServiceSchemaQueryResponseModel.schemaXml);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryId, schemaVersion, schemaXml);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenAppServiceSchemaQueryResponseModel {\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    schemaVersion: ").append(toIndentedString(schemaVersion)).append("\n");
    sb.append("    schemaXml: ").append(toIndentedString(schemaXml)).append("\n");
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
    openapiFields.add("category_id");
    openapiFields.add("schema_version");
    openapiFields.add("schema_xml");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenAppServiceSchemaQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenAppServiceSchemaQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenAppServiceSchemaQueryResponseModel is not found in the empty JSON string", AlipayOpenAppServiceSchemaQueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenAppServiceSchemaQueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenAppServiceSchemaQueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("category_id") != null && !jsonObj.get("category_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `category_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category_id").toString()));
      }
      if (jsonObj.get("schema_version") != null && !jsonObj.get("schema_version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `schema_version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("schema_version").toString()));
      }
      if (jsonObj.get("schema_xml") != null && !jsonObj.get("schema_xml").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `schema_xml` to be a primitive type in the JSON string but got `%s`", jsonObj.get("schema_xml").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenAppServiceSchemaQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenAppServiceSchemaQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenAppServiceSchemaQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenAppServiceSchemaQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenAppServiceSchemaQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenAppServiceSchemaQueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenAppServiceSchemaQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenAppServiceSchemaQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenAppServiceSchemaQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenAppServiceSchemaQueryResponseModel
  */
  public static AlipayOpenAppServiceSchemaQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenAppServiceSchemaQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayOpenAppServiceSchemaQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

