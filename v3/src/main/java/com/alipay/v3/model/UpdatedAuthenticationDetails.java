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
import java.util.ArrayList;
import java.util.List;
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
 * UpdatedAuthenticationDetails
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UpdatedAuthenticationDetails {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_AUTHENTICATION_MECHANISMS = "authentication_mechanisms";
  @SerializedName(SERIALIZED_NAME_AUTHENTICATION_MECHANISMS)
  private List<String> authenticationMechanisms = null;

  public static final String SERIALIZED_NAME_NONCE = "nonce";
  @SerializedName(SERIALIZED_NAME_NONCE)
  private String nonce;

  public static final String SERIALIZED_NAME_PARTIAL_TRANSACTION_DETAILS_SIGNATURE = "partial_transaction_details_signature";
  @SerializedName(SERIALIZED_NAME_PARTIAL_TRANSACTION_DETAILS_SIGNATURE)
  private String partialTransactionDetailsSignature;

  public static final String SERIALIZED_NAME_PIN_FORMAT = "pin_format";
  @SerializedName(SERIALIZED_NAME_PIN_FORMAT)
  private String pinFormat;

  public static final String SERIALIZED_NAME_SIGNING_KEY_MATERIAL = "signing_key_material";
  @SerializedName(SERIALIZED_NAME_SIGNING_KEY_MATERIAL)
  private String signingKeyMaterial;

  public UpdatedAuthenticationDetails() { 
  }

  public UpdatedAuthenticationDetails authenticationMechanisms(List<String> authenticationMechanisms) {
    
    this.authenticationMechanisms = authenticationMechanisms;
    return this;
  }

  public UpdatedAuthenticationDetails addAuthenticationMechanismsItem(String authenticationMechanismsItem) {
    if (this.authenticationMechanisms == null) {
      this.authenticationMechanisms = new ArrayList<>();
    }
    this.authenticationMechanisms.add(authenticationMechanismsItem);
    return this;
  }

   /**
   * 鉴权机制
   * @return authenticationMechanisms
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ApplicationRedirect", value = "鉴权机制")

  public List<String> getAuthenticationMechanisms() {
    return authenticationMechanisms;
  }


  public void setAuthenticationMechanisms(List<String> authenticationMechanisms) {
    this.authenticationMechanisms = authenticationMechanisms;
  }


  public UpdatedAuthenticationDetails nonce(String nonce) {
    
    this.nonce = nonce;
    return this;
  }

   /**
   * 随机数
   * @return nonce
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4A941B84", value = "随机数")

  public String getNonce() {
    return nonce;
  }


  public void setNonce(String nonce) {
    this.nonce = nonce;
  }


  public UpdatedAuthenticationDetails partialTransactionDetailsSignature(String partialTransactionDetailsSignature) {
    
    this.partialTransactionDetailsSignature = partialTransactionDetailsSignature;
    return this;
  }

   /**
   * 交易签名信息
   * @return partialTransactionDetailsSignature
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "U2VydmVyIGdlbmVyYXRlZCB0cmFuc2FjdGlvbiBkZXRhaWxzIHNpZ25hdHVyZQ==", value = "交易签名信息")

  public String getPartialTransactionDetailsSignature() {
    return partialTransactionDetailsSignature;
  }


  public void setPartialTransactionDetailsSignature(String partialTransactionDetailsSignature) {
    this.partialTransactionDetailsSignature = partialTransactionDetailsSignature;
  }


  public UpdatedAuthenticationDetails pinFormat(String pinFormat) {
    
    this.pinFormat = pinFormat;
    return this;
  }

   /**
   * 6位密码或者长密码
   * @return pinFormat
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "sixDigits", value = "6位密码或者长密码")

  public String getPinFormat() {
    return pinFormat;
  }


  public void setPinFormat(String pinFormat) {
    this.pinFormat = pinFormat;
  }


  public UpdatedAuthenticationDetails signingKeyMaterial(String signingKeyMaterial) {
    
    this.signingKeyMaterial = signingKeyMaterial;
    return this;
  }

   /**
   * 签名秘钥
   * @return signingKeyMaterial
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "U2lnbmluZyBrZXkgbWF0ZXJpYWw=", value = "签名秘钥")

  public String getSigningKeyMaterial() {
    return signingKeyMaterial;
  }


  public void setSigningKeyMaterial(String signingKeyMaterial) {
    this.signingKeyMaterial = signingKeyMaterial;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdatedAuthenticationDetails updatedAuthenticationDetails = (UpdatedAuthenticationDetails) o;
    return Objects.equals(this.authenticationMechanisms, updatedAuthenticationDetails.authenticationMechanisms) &&
        Objects.equals(this.nonce, updatedAuthenticationDetails.nonce) &&
        Objects.equals(this.partialTransactionDetailsSignature, updatedAuthenticationDetails.partialTransactionDetailsSignature) &&
        Objects.equals(this.pinFormat, updatedAuthenticationDetails.pinFormat) &&
        Objects.equals(this.signingKeyMaterial, updatedAuthenticationDetails.signingKeyMaterial);
  }

  @Override
  public int hashCode() {
    return Objects.hash(authenticationMechanisms, nonce, partialTransactionDetailsSignature, pinFormat, signingKeyMaterial);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdatedAuthenticationDetails {\n");
    sb.append("    authenticationMechanisms: ").append(toIndentedString(authenticationMechanisms)).append("\n");
    sb.append("    nonce: ").append(toIndentedString(nonce)).append("\n");
    sb.append("    partialTransactionDetailsSignature: ").append(toIndentedString(partialTransactionDetailsSignature)).append("\n");
    sb.append("    pinFormat: ").append(toIndentedString(pinFormat)).append("\n");
    sb.append("    signingKeyMaterial: ").append(toIndentedString(signingKeyMaterial)).append("\n");
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
    openapiFields.add("authentication_mechanisms");
    openapiFields.add("nonce");
    openapiFields.add("partial_transaction_details_signature");
    openapiFields.add("pin_format");
    openapiFields.add("signing_key_material");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UpdatedAuthenticationDetails
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (UpdatedAuthenticationDetails.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdatedAuthenticationDetails is not found in the empty JSON string", UpdatedAuthenticationDetails.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UpdatedAuthenticationDetails.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdatedAuthenticationDetails` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("authentication_mechanisms") != null && !jsonObj.get("authentication_mechanisms").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `authentication_mechanisms` to be an array in the JSON string but got `%s`", jsonObj.get("authentication_mechanisms").toString()));
      }
      if (jsonObj.get("nonce") != null && !jsonObj.get("nonce").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `nonce` to be a primitive type in the JSON string but got `%s`", jsonObj.get("nonce").toString()));
      }
      if (jsonObj.get("partial_transaction_details_signature") != null && !jsonObj.get("partial_transaction_details_signature").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `partial_transaction_details_signature` to be a primitive type in the JSON string but got `%s`", jsonObj.get("partial_transaction_details_signature").toString()));
      }
      if (jsonObj.get("pin_format") != null && !jsonObj.get("pin_format").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pin_format` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pin_format").toString()));
      }
      if (jsonObj.get("signing_key_material") != null && !jsonObj.get("signing_key_material").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `signing_key_material` to be a primitive type in the JSON string but got `%s`", jsonObj.get("signing_key_material").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdatedAuthenticationDetails.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdatedAuthenticationDetails' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdatedAuthenticationDetails> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdatedAuthenticationDetails.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdatedAuthenticationDetails>() {
           @Override
           public void write(JsonWriter out, UpdatedAuthenticationDetails value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdatedAuthenticationDetails read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UpdatedAuthenticationDetails given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UpdatedAuthenticationDetails
  * @throws IOException if the JSON string is invalid with respect to UpdatedAuthenticationDetails
  */
  public static UpdatedAuthenticationDetails fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdatedAuthenticationDetails.class);
  }

 /**
  * Convert an instance of UpdatedAuthenticationDetails to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

