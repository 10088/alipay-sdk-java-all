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
 * AlipayMobilePublicMessageSingleSendModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayMobilePublicMessageSingleSendModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_BIZ_CONTENT = "biz_content";
  @SerializedName(SERIALIZED_NAME_BIZ_CONTENT)
  private String bizContent;

  public AlipayMobilePublicMessageSingleSendModel() { 
  }

  public AlipayMobilePublicMessageSingleSendModel bizContent(String bizContent) {
    
    this.bizContent = bizContent;
    return this;
  }

   /**
   * 业务内容，其中包括模板template和消息接收人toUserId两大块，具体参见“表1-2 服务窗单发模板消息的biz_content参数说明”。  &lt;a href&#x3D;\&quot;https://doc.open.alipay.com/doc2/detail.htm?spm&#x3D;a219a.7386797.0.0.eZqycg&amp;treeId&#x3D;53&amp;articleId&#x3D;103463&amp;docType&#x3D;1\&quot;&gt;详情请见&lt;/a&gt;
   * @return bizContent
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"toUserId\":\"208876427\",\"template\":{\"context\":{\"amount\":\"20元\",\"cardNo\":\"1855\"},\"templateId\":\"1ff2840464c4463187f5451119de8fea\"}}", value = "业务内容，其中包括模板template和消息接收人toUserId两大块，具体参见“表1-2 服务窗单发模板消息的biz_content参数说明”。  <a href=\"https://doc.open.alipay.com/doc2/detail.htm?spm=a219a.7386797.0.0.eZqycg&treeId=53&articleId=103463&docType=1\">详情请见</a>")

  public String getBizContent() {
    return bizContent;
  }


  public void setBizContent(String bizContent) {
    this.bizContent = bizContent;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayMobilePublicMessageSingleSendModel alipayMobilePublicMessageSingleSendModel = (AlipayMobilePublicMessageSingleSendModel) o;
    return Objects.equals(this.bizContent, alipayMobilePublicMessageSingleSendModel.bizContent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bizContent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayMobilePublicMessageSingleSendModel {\n");
    sb.append("    bizContent: ").append(toIndentedString(bizContent)).append("\n");
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
    openapiFields.add("biz_content");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayMobilePublicMessageSingleSendModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayMobilePublicMessageSingleSendModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayMobilePublicMessageSingleSendModel is not found in the empty JSON string", AlipayMobilePublicMessageSingleSendModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayMobilePublicMessageSingleSendModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayMobilePublicMessageSingleSendModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("biz_content") != null && !jsonObj.get("biz_content").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biz_content` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biz_content").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayMobilePublicMessageSingleSendModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayMobilePublicMessageSingleSendModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayMobilePublicMessageSingleSendModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayMobilePublicMessageSingleSendModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayMobilePublicMessageSingleSendModel>() {
           @Override
           public void write(JsonWriter out, AlipayMobilePublicMessageSingleSendModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayMobilePublicMessageSingleSendModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayMobilePublicMessageSingleSendModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayMobilePublicMessageSingleSendModel
  * @throws IOException if the JSON string is invalid with respect to AlipayMobilePublicMessageSingleSendModel
  */
  public static AlipayMobilePublicMessageSingleSendModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayMobilePublicMessageSingleSendModel.class);
  }

 /**
  * Convert an instance of AlipayMobilePublicMessageSingleSendModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

