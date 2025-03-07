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
 * AlipayBossFncInvoiceApplyResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayBossFncInvoiceApplyResponseModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_RESULT_SET = "result_set";
  @SerializedName(SERIALIZED_NAME_RESULT_SET)
  private String resultSet;

  public AlipayBossFncInvoiceApplyResponseModel() { 
  }

  public AlipayBossFncInvoiceApplyResponseModel resultSet(String resultSet) {
    
    this.resultSet = resultSet;
    return this;
  }

   /**
   * 开票申请ID，唯一性ID
   * @return resultSet
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017090710122000473800320000049574", value = "开票申请ID，唯一性ID")

  public String getResultSet() {
    return resultSet;
  }


  public void setResultSet(String resultSet) {
    this.resultSet = resultSet;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayBossFncInvoiceApplyResponseModel alipayBossFncInvoiceApplyResponseModel = (AlipayBossFncInvoiceApplyResponseModel) o;
    return Objects.equals(this.resultSet, alipayBossFncInvoiceApplyResponseModel.resultSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resultSet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayBossFncInvoiceApplyResponseModel {\n");
    sb.append("    resultSet: ").append(toIndentedString(resultSet)).append("\n");
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
    openapiFields.add("result_set");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayBossFncInvoiceApplyResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayBossFncInvoiceApplyResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayBossFncInvoiceApplyResponseModel is not found in the empty JSON string", AlipayBossFncInvoiceApplyResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayBossFncInvoiceApplyResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayBossFncInvoiceApplyResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("result_set") != null && !jsonObj.get("result_set").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `result_set` to be a primitive type in the JSON string but got `%s`", jsonObj.get("result_set").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayBossFncInvoiceApplyResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayBossFncInvoiceApplyResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayBossFncInvoiceApplyResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayBossFncInvoiceApplyResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayBossFncInvoiceApplyResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayBossFncInvoiceApplyResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayBossFncInvoiceApplyResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayBossFncInvoiceApplyResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayBossFncInvoiceApplyResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayBossFncInvoiceApplyResponseModel
  */
  public static AlipayBossFncInvoiceApplyResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayBossFncInvoiceApplyResponseModel.class);
  }

 /**
  * Convert an instance of AlipayBossFncInvoiceApplyResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

