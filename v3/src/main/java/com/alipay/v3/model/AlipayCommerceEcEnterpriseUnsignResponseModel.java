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
 * AlipayCommerceEcEnterpriseUnsignResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayCommerceEcEnterpriseUnsignResponseModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ACCOUNT_ID = "account_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_ID)
  private String accountId;

  public static final String SERIALIZED_NAME_ENTERPRISE_ID = "enterprise_id";
  @SerializedName(SERIALIZED_NAME_ENTERPRISE_ID)
  private String enterpriseId;

  public static final String SERIALIZED_NAME_UNSIGN_URL = "unsign_url";
  @SerializedName(SERIALIZED_NAME_UNSIGN_URL)
  private String unsignUrl;

  public AlipayCommerceEcEnterpriseUnsignResponseModel() { 
  }

  public AlipayCommerceEcEnterpriseUnsignResponseModel accountId(String accountId) {
    
    this.accountId = accountId;
    return this;
  }

   /**
   * 入参传的共同账户id，出参也会返回共同账户id
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088390300034", value = "入参传的共同账户id，出参也会返回共同账户id")

  public String getAccountId() {
    return accountId;
  }


  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }


  public AlipayCommerceEcEnterpriseUnsignResponseModel enterpriseId(String enterpriseId) {
    
    this.enterpriseId = enterpriseId;
    return this;
  }

   /**
   * 企业id
   * @return enterpriseId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "208893993930", value = "企业id")

  public String getEnterpriseId() {
    return enterpriseId;
  }


  public void setEnterpriseId(String enterpriseId) {
    this.enterpriseId = enterpriseId;
  }


  public AlipayCommerceEcEnterpriseUnsignResponseModel unsignUrl(String unsignUrl) {
    
    this.unsignUrl = unsignUrl;
    return this;
  }

   /**
   * 解约链接
   * @return unsignUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://business-site-default.dev.alipay.net/page/EnterprisePay/Account?signToken=12324", value = "解约链接")

  public String getUnsignUrl() {
    return unsignUrl;
  }


  public void setUnsignUrl(String unsignUrl) {
    this.unsignUrl = unsignUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayCommerceEcEnterpriseUnsignResponseModel alipayCommerceEcEnterpriseUnsignResponseModel = (AlipayCommerceEcEnterpriseUnsignResponseModel) o;
    return Objects.equals(this.accountId, alipayCommerceEcEnterpriseUnsignResponseModel.accountId) &&
        Objects.equals(this.enterpriseId, alipayCommerceEcEnterpriseUnsignResponseModel.enterpriseId) &&
        Objects.equals(this.unsignUrl, alipayCommerceEcEnterpriseUnsignResponseModel.unsignUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, enterpriseId, unsignUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayCommerceEcEnterpriseUnsignResponseModel {\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    enterpriseId: ").append(toIndentedString(enterpriseId)).append("\n");
    sb.append("    unsignUrl: ").append(toIndentedString(unsignUrl)).append("\n");
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
    openapiFields.add("account_id");
    openapiFields.add("enterprise_id");
    openapiFields.add("unsign_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayCommerceEcEnterpriseUnsignResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayCommerceEcEnterpriseUnsignResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayCommerceEcEnterpriseUnsignResponseModel is not found in the empty JSON string", AlipayCommerceEcEnterpriseUnsignResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayCommerceEcEnterpriseUnsignResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayCommerceEcEnterpriseUnsignResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("account_id") != null && !jsonObj.get("account_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_id").toString()));
      }
      if (jsonObj.get("enterprise_id") != null && !jsonObj.get("enterprise_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enterprise_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enterprise_id").toString()));
      }
      if (jsonObj.get("unsign_url") != null && !jsonObj.get("unsign_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unsign_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unsign_url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayCommerceEcEnterpriseUnsignResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayCommerceEcEnterpriseUnsignResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayCommerceEcEnterpriseUnsignResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayCommerceEcEnterpriseUnsignResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayCommerceEcEnterpriseUnsignResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayCommerceEcEnterpriseUnsignResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayCommerceEcEnterpriseUnsignResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayCommerceEcEnterpriseUnsignResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayCommerceEcEnterpriseUnsignResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayCommerceEcEnterpriseUnsignResponseModel
  */
  public static AlipayCommerceEcEnterpriseUnsignResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayCommerceEcEnterpriseUnsignResponseModel.class);
  }

 /**
  * Convert an instance of AlipayCommerceEcEnterpriseUnsignResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

