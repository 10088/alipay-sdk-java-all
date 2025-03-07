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
 * AlipayOpenMiniWidgetGoodsUploadResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenMiniWidgetGoodsUploadResponseModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_COMMIT_ID = "commit_id";
  @SerializedName(SERIALIZED_NAME_COMMIT_ID)
  private String commitId;

  public AlipayOpenMiniWidgetGoodsUploadResponseModel() { 
  }

  public AlipayOpenMiniWidgetGoodsUploadResponseModel commitId(String commitId) {
    
    this.commitId = commitId;
    return this;
  }

   /**
   * 商品提交生成的唯一标识，用于查询商品信息的审核状态
   * @return commitId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20220829000000000101", value = "商品提交生成的唯一标识，用于查询商品信息的审核状态")

  public String getCommitId() {
    return commitId;
  }


  public void setCommitId(String commitId) {
    this.commitId = commitId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenMiniWidgetGoodsUploadResponseModel alipayOpenMiniWidgetGoodsUploadResponseModel = (AlipayOpenMiniWidgetGoodsUploadResponseModel) o;
    return Objects.equals(this.commitId, alipayOpenMiniWidgetGoodsUploadResponseModel.commitId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commitId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenMiniWidgetGoodsUploadResponseModel {\n");
    sb.append("    commitId: ").append(toIndentedString(commitId)).append("\n");
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
    openapiFields.add("commit_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenMiniWidgetGoodsUploadResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenMiniWidgetGoodsUploadResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenMiniWidgetGoodsUploadResponseModel is not found in the empty JSON string", AlipayOpenMiniWidgetGoodsUploadResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenMiniWidgetGoodsUploadResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenMiniWidgetGoodsUploadResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("commit_id") != null && !jsonObj.get("commit_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `commit_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("commit_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenMiniWidgetGoodsUploadResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenMiniWidgetGoodsUploadResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenMiniWidgetGoodsUploadResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenMiniWidgetGoodsUploadResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenMiniWidgetGoodsUploadResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenMiniWidgetGoodsUploadResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenMiniWidgetGoodsUploadResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenMiniWidgetGoodsUploadResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenMiniWidgetGoodsUploadResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenMiniWidgetGoodsUploadResponseModel
  */
  public static AlipayOpenMiniWidgetGoodsUploadResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenMiniWidgetGoodsUploadResponseModel.class);
  }

 /**
  * Convert an instance of AlipayOpenMiniWidgetGoodsUploadResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

