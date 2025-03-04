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
 * MemberShip
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MemberShip {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_BANK_CARD_NO = "bank_card_no";
  @SerializedName(SERIALIZED_NAME_BANK_CARD_NO)
  private String bankCardNo;

  public static final String SERIALIZED_NAME_CERT_NO = "cert_no";
  @SerializedName(SERIALIZED_NAME_CERT_NO)
  private String certNo;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_MAC = "mac";
  @SerializedName(SERIALIZED_NAME_MAC)
  private String mac;

  public static final String SERIALIZED_NAME_MOBILE_PHONE_NO = "mobile_phone_no";
  @SerializedName(SERIALIZED_NAME_MOBILE_PHONE_NO)
  private String mobilePhoneNo;

  public MemberShip() { 
  }

  public MemberShip bankCardNo(String bankCardNo) {
    
    this.bankCardNo = bankCardNo;
    return this;
  }

   /**
   * 银行卡号
   * @return bankCardNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "6228000000000000", value = "银行卡号")

  public String getBankCardNo() {
    return bankCardNo;
  }


  public void setBankCardNo(String bankCardNo) {
    this.bankCardNo = bankCardNo;
  }


  public MemberShip certNo(String certNo) {
    
    this.certNo = certNo;
    return this;
  }

   /**
   * 会员二代身份证号码
   * @return certNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "339000111111111000", value = "会员二代身份证号码")

  public String getCertNo() {
    return certNo;
  }


  public void setCertNo(String certNo) {
    this.certNo = certNo;
  }


  public MemberShip email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * 邮箱号码
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "xxx@koubei.com", value = "邮箱号码")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public MemberShip mac(String mac) {
    
    this.mac = mac;
    return this;
  }

   /**
   * MAC地址
   * @return mac
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "6C：3E：6D：2B：54:34", value = "MAC地址")

  public String getMac() {
    return mac;
  }


  public void setMac(String mac) {
    this.mac = mac;
  }


  public MemberShip mobilePhoneNo(String mobilePhoneNo) {
    
    this.mobilePhoneNo = mobilePhoneNo;
    return this;
  }

   /**
   * 11位手机号码
   * @return mobilePhoneNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "15657153919", value = "11位手机号码")

  public String getMobilePhoneNo() {
    return mobilePhoneNo;
  }


  public void setMobilePhoneNo(String mobilePhoneNo) {
    this.mobilePhoneNo = mobilePhoneNo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MemberShip memberShip = (MemberShip) o;
    return Objects.equals(this.bankCardNo, memberShip.bankCardNo) &&
        Objects.equals(this.certNo, memberShip.certNo) &&
        Objects.equals(this.email, memberShip.email) &&
        Objects.equals(this.mac, memberShip.mac) &&
        Objects.equals(this.mobilePhoneNo, memberShip.mobilePhoneNo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bankCardNo, certNo, email, mac, mobilePhoneNo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MemberShip {\n");
    sb.append("    bankCardNo: ").append(toIndentedString(bankCardNo)).append("\n");
    sb.append("    certNo: ").append(toIndentedString(certNo)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    mac: ").append(toIndentedString(mac)).append("\n");
    sb.append("    mobilePhoneNo: ").append(toIndentedString(mobilePhoneNo)).append("\n");
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
    openapiFields.add("bank_card_no");
    openapiFields.add("cert_no");
    openapiFields.add("email");
    openapiFields.add("mac");
    openapiFields.add("mobile_phone_no");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MemberShip
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (MemberShip.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in MemberShip is not found in the empty JSON string", MemberShip.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!MemberShip.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MemberShip` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("bank_card_no") != null && !jsonObj.get("bank_card_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `bank_card_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("bank_card_no").toString()));
      }
      if (jsonObj.get("cert_no") != null && !jsonObj.get("cert_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cert_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cert_no").toString()));
      }
      if (jsonObj.get("email") != null && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if (jsonObj.get("mac") != null && !jsonObj.get("mac").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mac` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mac").toString()));
      }
      if (jsonObj.get("mobile_phone_no") != null && !jsonObj.get("mobile_phone_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mobile_phone_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mobile_phone_no").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MemberShip.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MemberShip' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MemberShip> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MemberShip.class));

       return (TypeAdapter<T>) new TypeAdapter<MemberShip>() {
           @Override
           public void write(JsonWriter out, MemberShip value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MemberShip read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MemberShip given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MemberShip
  * @throws IOException if the JSON string is invalid with respect to MemberShip
  */
  public static MemberShip fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MemberShip.class);
  }

 /**
  * Convert an instance of MemberShip to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

