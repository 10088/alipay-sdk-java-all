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
 * DiscountInfoData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class DiscountInfoData {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_DISCOUNT_AMOUNT = "discount_amount";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_AMOUNT)
  private String discountAmount;

  public static final String SERIALIZED_NAME_DISCOUNT_NAME = "discount_name";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_NAME)
  private String discountName;

  public static final String SERIALIZED_NAME_DISCOUNT_PAGE_LINK = "discount_page_link";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_PAGE_LINK)
  private String discountPageLink;

  public static final String SERIALIZED_NAME_DISCOUNT_QUANTITY = "discount_quantity";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_QUANTITY)
  private Integer discountQuantity;

  public static final String SERIALIZED_NAME_EXTERNAL_DISCOUNT_ID = "external_discount_id";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_DISCOUNT_ID)
  private String externalDiscountId;

  public DiscountInfoData() { 
  }

  public DiscountInfoData discountAmount(String discountAmount) {
    
    this.discountAmount = discountAmount;
    return this;
  }

   /**
   * 优惠金额
   * @return discountAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10.01", value = "优惠金额")

  public String getDiscountAmount() {
    return discountAmount;
  }


  public void setDiscountAmount(String discountAmount) {
    this.discountAmount = discountAmount;
  }


  public DiscountInfoData discountName(String discountName) {
    
    this.discountName = discountName;
    return this;
  }

   /**
   * 优惠名称
   * @return discountName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "商家红包", value = "优惠名称")

  public String getDiscountName() {
    return discountName;
  }


  public void setDiscountName(String discountName) {
    this.discountName = discountName;
  }


  public DiscountInfoData discountPageLink(String discountPageLink) {
    
    this.discountPageLink = discountPageLink;
    return this;
  }

   /**
   * 优惠跳转链接地址
   * @return discountPageLink
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://www.alipay.com/", value = "优惠跳转链接地址")

  public String getDiscountPageLink() {
    return discountPageLink;
  }


  public void setDiscountPageLink(String discountPageLink) {
    this.discountPageLink = discountPageLink;
  }


  public DiscountInfoData discountQuantity(Integer discountQuantity) {
    
    this.discountQuantity = discountQuantity;
    return this;
  }

   /**
   * 优惠数量
   * @return discountQuantity
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "优惠数量")

  public Integer getDiscountQuantity() {
    return discountQuantity;
  }


  public void setDiscountQuantity(Integer discountQuantity) {
    this.discountQuantity = discountQuantity;
  }


  public DiscountInfoData externalDiscountId(String externalDiscountId) {
    
    this.externalDiscountId = externalDiscountId;
    return this;
  }

   /**
   * 外部优惠id
   * @return externalDiscountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "discount001", value = "外部优惠id")

  public String getExternalDiscountId() {
    return externalDiscountId;
  }


  public void setExternalDiscountId(String externalDiscountId) {
    this.externalDiscountId = externalDiscountId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiscountInfoData discountInfoData = (DiscountInfoData) o;
    return Objects.equals(this.discountAmount, discountInfoData.discountAmount) &&
        Objects.equals(this.discountName, discountInfoData.discountName) &&
        Objects.equals(this.discountPageLink, discountInfoData.discountPageLink) &&
        Objects.equals(this.discountQuantity, discountInfoData.discountQuantity) &&
        Objects.equals(this.externalDiscountId, discountInfoData.externalDiscountId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(discountAmount, discountName, discountPageLink, discountQuantity, externalDiscountId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiscountInfoData {\n");
    sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
    sb.append("    discountName: ").append(toIndentedString(discountName)).append("\n");
    sb.append("    discountPageLink: ").append(toIndentedString(discountPageLink)).append("\n");
    sb.append("    discountQuantity: ").append(toIndentedString(discountQuantity)).append("\n");
    sb.append("    externalDiscountId: ").append(toIndentedString(externalDiscountId)).append("\n");
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
    openapiFields.add("discount_amount");
    openapiFields.add("discount_name");
    openapiFields.add("discount_page_link");
    openapiFields.add("discount_quantity");
    openapiFields.add("external_discount_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to DiscountInfoData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (DiscountInfoData.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in DiscountInfoData is not found in the empty JSON string", DiscountInfoData.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!DiscountInfoData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `DiscountInfoData` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("discount_amount") != null && !jsonObj.get("discount_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `discount_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("discount_amount").toString()));
      }
      if (jsonObj.get("discount_name") != null && !jsonObj.get("discount_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `discount_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("discount_name").toString()));
      }
      if (jsonObj.get("discount_page_link") != null && !jsonObj.get("discount_page_link").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `discount_page_link` to be a primitive type in the JSON string but got `%s`", jsonObj.get("discount_page_link").toString()));
      }
      if (jsonObj.get("external_discount_id") != null && !jsonObj.get("external_discount_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `external_discount_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("external_discount_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!DiscountInfoData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'DiscountInfoData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<DiscountInfoData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(DiscountInfoData.class));

       return (TypeAdapter<T>) new TypeAdapter<DiscountInfoData>() {
           @Override
           public void write(JsonWriter out, DiscountInfoData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public DiscountInfoData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of DiscountInfoData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of DiscountInfoData
  * @throws IOException if the JSON string is invalid with respect to DiscountInfoData
  */
  public static DiscountInfoData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, DiscountInfoData.class);
  }

 /**
  * Convert an instance of DiscountInfoData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

