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
 * VoucherSendRuleDetailModify
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class VoucherSendRuleDetailModify {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_NATURAL_PERSON_LIMIT = "natural_person_limit";
  @SerializedName(SERIALIZED_NAME_NATURAL_PERSON_LIMIT)
  private Boolean naturalPersonLimit;

  public static final String SERIALIZED_NAME_PHONE_NUMBER_LIMIT = "phone_number_limit";
  @SerializedName(SERIALIZED_NAME_PHONE_NUMBER_LIMIT)
  private String phoneNumberLimit;

  public static final String SERIALIZED_NAME_VOUCHER_QUANTITY_LIMIT_PER_USER = "voucher_quantity_limit_per_user";
  @SerializedName(SERIALIZED_NAME_VOUCHER_QUANTITY_LIMIT_PER_USER)
  private Integer voucherQuantityLimitPerUser;

  public VoucherSendRuleDetailModify() { 
  }

  public VoucherSendRuleDetailModify naturalPersonLimit(Boolean naturalPersonLimit) {
    
    this.naturalPersonLimit = naturalPersonLimit;
    return this;
  }

   /**
   * 是否开启自然人领取限制。 自然人表示按照身份证纬度进行领取限制。
   * @return naturalPersonLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "是否开启自然人领取限制。 自然人表示按照身份证纬度进行领取限制。")

  public Boolean getNaturalPersonLimit() {
    return naturalPersonLimit;
  }


  public void setNaturalPersonLimit(Boolean naturalPersonLimit) {
    this.naturalPersonLimit = naturalPersonLimit;
  }


  public VoucherSendRuleDetailModify phoneNumberLimit(String phoneNumberLimit) {
    
    this.phoneNumberLimit = phoneNumberLimit;
    return this;
  }

   /**
   * 是否开启电话号码领取限制。
   * @return phoneNumberLimit
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "是否开启电话号码领取限制。")

  public String getPhoneNumberLimit() {
    return phoneNumberLimit;
  }


  public void setPhoneNumberLimit(String phoneNumberLimit) {
    this.phoneNumberLimit = phoneNumberLimit;
  }


  public VoucherSendRuleDetailModify voucherQuantityLimitPerUser(Integer voucherQuantityLimitPerUser) {
    
    this.voucherQuantityLimitPerUser = voucherQuantityLimitPerUser;
    return this;
  }

   /**
   * 每人领取限制。 默认按照支付宝uid进行领取限制;
   * @return voucherQuantityLimitPerUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "每人领取限制。 默认按照支付宝uid进行领取限制;")

  public Integer getVoucherQuantityLimitPerUser() {
    return voucherQuantityLimitPerUser;
  }


  public void setVoucherQuantityLimitPerUser(Integer voucherQuantityLimitPerUser) {
    this.voucherQuantityLimitPerUser = voucherQuantityLimitPerUser;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VoucherSendRuleDetailModify voucherSendRuleDetailModify = (VoucherSendRuleDetailModify) o;
    return Objects.equals(this.naturalPersonLimit, voucherSendRuleDetailModify.naturalPersonLimit) &&
        Objects.equals(this.phoneNumberLimit, voucherSendRuleDetailModify.phoneNumberLimit) &&
        Objects.equals(this.voucherQuantityLimitPerUser, voucherSendRuleDetailModify.voucherQuantityLimitPerUser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(naturalPersonLimit, phoneNumberLimit, voucherQuantityLimitPerUser);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoucherSendRuleDetailModify {\n");
    sb.append("    naturalPersonLimit: ").append(toIndentedString(naturalPersonLimit)).append("\n");
    sb.append("    phoneNumberLimit: ").append(toIndentedString(phoneNumberLimit)).append("\n");
    sb.append("    voucherQuantityLimitPerUser: ").append(toIndentedString(voucherQuantityLimitPerUser)).append("\n");
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
    openapiFields.add("natural_person_limit");
    openapiFields.add("phone_number_limit");
    openapiFields.add("voucher_quantity_limit_per_user");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to VoucherSendRuleDetailModify
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (VoucherSendRuleDetailModify.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in VoucherSendRuleDetailModify is not found in the empty JSON string", VoucherSendRuleDetailModify.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!VoucherSendRuleDetailModify.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `VoucherSendRuleDetailModify` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("phone_number_limit") != null && !jsonObj.get("phone_number_limit").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone_number_limit` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone_number_limit").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!VoucherSendRuleDetailModify.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'VoucherSendRuleDetailModify' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<VoucherSendRuleDetailModify> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(VoucherSendRuleDetailModify.class));

       return (TypeAdapter<T>) new TypeAdapter<VoucherSendRuleDetailModify>() {
           @Override
           public void write(JsonWriter out, VoucherSendRuleDetailModify value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public VoucherSendRuleDetailModify read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of VoucherSendRuleDetailModify given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of VoucherSendRuleDetailModify
  * @throws IOException if the JSON string is invalid with respect to VoucherSendRuleDetailModify
  */
  public static VoucherSendRuleDetailModify fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, VoucherSendRuleDetailModify.class);
  }

 /**
  * Convert an instance of VoucherSendRuleDetailModify to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

