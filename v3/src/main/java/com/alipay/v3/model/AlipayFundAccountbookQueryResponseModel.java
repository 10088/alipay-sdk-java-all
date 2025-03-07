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
import com.alipay.v3.model.ExtCardInfo;
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
 * AlipayFundAccountbookQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayFundAccountbookQueryResponseModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ACCOUNT_BOOK_ID = "account_book_id";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_BOOK_ID)
  private String accountBookId;

  public static final String SERIALIZED_NAME_AVAILABLE_AMOUNT = "available_amount";
  @SerializedName(SERIALIZED_NAME_AVAILABLE_AMOUNT)
  private String availableAmount;

  public static final String SERIALIZED_NAME_EXT_CARD_INFO = "ext_card_info";
  @SerializedName(SERIALIZED_NAME_EXT_CARD_INFO)
  private ExtCardInfo extCardInfo;

  public AlipayFundAccountbookQueryResponseModel() { 
  }

  public AlipayFundAccountbookQueryResponseModel accountBookId(String accountBookId) {
    
    this.accountBookId = accountBookId;
    return this;
  }

   /**
   * 记账账簿id
   * @return accountBookId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088001409188095", value = "记账账簿id")

  public String getAccountBookId() {
    return accountBookId;
  }


  public void setAccountBookId(String accountBookId) {
    this.accountBookId = accountBookId;
  }


  public AlipayFundAccountbookQueryResponseModel availableAmount(String availableAmount) {
    
    this.availableAmount = availableAmount;
    return this;
  }

   /**
   * 可用余额
   * @return availableAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "26.45", value = "可用余额")

  public String getAvailableAmount() {
    return availableAmount;
  }


  public void setAvailableAmount(String availableAmount) {
    this.availableAmount = availableAmount;
  }


  public AlipayFundAccountbookQueryResponseModel extCardInfo(ExtCardInfo extCardInfo) {
    
    this.extCardInfo = extCardInfo;
    return this;
  }

   /**
   * Get extCardInfo
   * @return extCardInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ExtCardInfo getExtCardInfo() {
    return extCardInfo;
  }


  public void setExtCardInfo(ExtCardInfo extCardInfo) {
    this.extCardInfo = extCardInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayFundAccountbookQueryResponseModel alipayFundAccountbookQueryResponseModel = (AlipayFundAccountbookQueryResponseModel) o;
    return Objects.equals(this.accountBookId, alipayFundAccountbookQueryResponseModel.accountBookId) &&
        Objects.equals(this.availableAmount, alipayFundAccountbookQueryResponseModel.availableAmount) &&
        Objects.equals(this.extCardInfo, alipayFundAccountbookQueryResponseModel.extCardInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountBookId, availableAmount, extCardInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayFundAccountbookQueryResponseModel {\n");
    sb.append("    accountBookId: ").append(toIndentedString(accountBookId)).append("\n");
    sb.append("    availableAmount: ").append(toIndentedString(availableAmount)).append("\n");
    sb.append("    extCardInfo: ").append(toIndentedString(extCardInfo)).append("\n");
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
    openapiFields.add("account_book_id");
    openapiFields.add("available_amount");
    openapiFields.add("ext_card_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayFundAccountbookQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayFundAccountbookQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayFundAccountbookQueryResponseModel is not found in the empty JSON string", AlipayFundAccountbookQueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayFundAccountbookQueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayFundAccountbookQueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("account_book_id") != null && !jsonObj.get("account_book_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_book_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_book_id").toString()));
      }
      if (jsonObj.get("available_amount") != null && !jsonObj.get("available_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `available_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("available_amount").toString()));
      }
      // validate the optional field `ext_card_info`
      if (jsonObj.getAsJsonObject("ext_card_info") != null) {
        ExtCardInfo.validateJsonObject(jsonObj.getAsJsonObject("ext_card_info"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayFundAccountbookQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayFundAccountbookQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayFundAccountbookQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayFundAccountbookQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayFundAccountbookQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayFundAccountbookQueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayFundAccountbookQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayFundAccountbookQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayFundAccountbookQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayFundAccountbookQueryResponseModel
  */
  public static AlipayFundAccountbookQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayFundAccountbookQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayFundAccountbookQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

