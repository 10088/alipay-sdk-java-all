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
 * BenefitInfoDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BenefitInfoDetail {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_BENEFIT_TYPE = "benefit_type";
  @SerializedName(SERIALIZED_NAME_BENEFIT_TYPE)
  private String benefitType;

  public static final String SERIALIZED_NAME_COUNT = "count";
  @SerializedName(SERIALIZED_NAME_COUNT)
  private String count;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public BenefitInfoDetail() { 
  }

  public BenefitInfoDetail amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * PRE_FUND：实际核销或者商户赠送的金额  DISCOUNT：实际折扣掉的金额（获取权益不支持该类型）  COUPON：实际核销或者商户赠送的券
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "PRE_FUND：实际核销或者商户赠送的金额  DISCOUNT：实际折扣掉的金额（获取权益不支持该类型）  COUPON：实际核销或者商户赠送的券")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public BenefitInfoDetail benefitType(String benefitType) {
    
    this.benefitType = benefitType;
    return this;
  }

   /**
   * 权益类型  PRE_FUND（卡面额）  DISCOUNT：折扣金额  COUPON：券
   * @return benefitType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "权益类型  PRE_FUND（卡面额）  DISCOUNT：折扣金额  COUPON：券")

  public String getBenefitType() {
    return benefitType;
  }


  public void setBenefitType(String benefitType) {
    this.benefitType = benefitType;
  }


  public BenefitInfoDetail count(String count) {
    
    this.count = count;
    return this;
  }

   /**
   * COUPON：当核销或者赠送券时，可以设置该值
   * @return count
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "COUPON：当核销或者赠送券时，可以设置该值")

  public String getCount() {
    return count;
  }


  public void setCount(String count) {
    this.count = count;
  }


  public BenefitInfoDetail description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * 产生核销或者赠送权益的描述
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "产生核销或者赠送权益的描述")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BenefitInfoDetail benefitInfoDetail = (BenefitInfoDetail) o;
    return Objects.equals(this.amount, benefitInfoDetail.amount) &&
        Objects.equals(this.benefitType, benefitInfoDetail.benefitType) &&
        Objects.equals(this.count, benefitInfoDetail.count) &&
        Objects.equals(this.description, benefitInfoDetail.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, benefitType, count, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BenefitInfoDetail {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    benefitType: ").append(toIndentedString(benefitType)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("benefit_type");
    openapiFields.add("count");
    openapiFields.add("description");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BenefitInfoDetail
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (BenefitInfoDetail.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in BenefitInfoDetail is not found in the empty JSON string", BenefitInfoDetail.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BenefitInfoDetail.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BenefitInfoDetail` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
      if (jsonObj.get("benefit_type") != null && !jsonObj.get("benefit_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `benefit_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("benefit_type").toString()));
      }
      if (jsonObj.get("count") != null && !jsonObj.get("count").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `count` to be a primitive type in the JSON string but got `%s`", jsonObj.get("count").toString()));
      }
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BenefitInfoDetail.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BenefitInfoDetail' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BenefitInfoDetail> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BenefitInfoDetail.class));

       return (TypeAdapter<T>) new TypeAdapter<BenefitInfoDetail>() {
           @Override
           public void write(JsonWriter out, BenefitInfoDetail value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BenefitInfoDetail read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BenefitInfoDetail given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BenefitInfoDetail
  * @throws IOException if the JSON string is invalid with respect to BenefitInfoDetail
  */
  public static BenefitInfoDetail fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BenefitInfoDetail.class);
  }

 /**
  * Convert an instance of BenefitInfoDetail to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

