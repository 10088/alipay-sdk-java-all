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
 * AlipayTradePayErrorResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayTradePayErrorResponseModel {
  private static final long serialVersionUID = 1L;

  /**
   * 错误码
   */
  @JsonAdapter(CodeEnum.Adapter.class)
  public enum CodeEnum {
    SYSTEM_ERROR("ACQ.SYSTEM_ERROR"),
    
    INVALID_PARAMETER("ACQ.INVALID_PARAMETER"),
    
    ACCESS_FORBIDDEN("ACQ.ACCESS_FORBIDDEN"),
    
    EXIST_FORBIDDEN_WORD("ACQ.EXIST_FORBIDDEN_WORD"),
    
    PARTNER_ERROR("ACQ.PARTNER_ERROR"),
    
    TOTAL_FEE_EXCEED("ACQ.TOTAL_FEE_EXCEED"),
    
    PAYMENT_AUTH_CODE_INVALID("ACQ.PAYMENT_AUTH_CODE_INVALID"),
    
    CONTEXT_INCONSISTENT("ACQ.CONTEXT_INCONSISTENT"),
    
    TRADE_HAS_SUCCESS("ACQ.TRADE_HAS_SUCCESS"),
    
    TRADE_HAS_CLOSE("ACQ.TRADE_HAS_CLOSE"),
    
    BUYER_BALANCE_NOT_ENOUGH("ACQ.BUYER_BALANCE_NOT_ENOUGH"),
    
    BUYER_BANKCARD_BALANCE_NOT_ENOUGH("ACQ.BUYER_BANKCARD_BALANCE_NOT_ENOUGH"),
    
    ERROR_BALANCE_PAYMENT_DISABLE("ACQ.ERROR_BALANCE_PAYMENT_DISABLE"),
    
    BUYER_SELLER_EQUAL("ACQ.BUYER_SELLER_EQUAL"),
    
    TRADE_BUYER_NOT_MATCH("ACQ.TRADE_BUYER_NOT_MATCH"),
    
    BUYER_ENABLE_STATUS_FORBID("ACQ.BUYER_ENABLE_STATUS_FORBID"),
    
    PULL_MOBILE_CASHIER_FAIL("ACQ.PULL_MOBILE_CASHIER_FAIL"),
    
    MOBILE_PAYMENT_SWITCH_OFF("ACQ.MOBILE_PAYMENT_SWITCH_OFF"),
    
    PAYMENT_FAIL("ACQ.PAYMENT_FAIL"),
    
    BUYER_PAYMENT_AMOUNT_DAY_LIMIT_ERROR("ACQ.BUYER_PAYMENT_AMOUNT_DAY_LIMIT_ERROR"),
    
    BEYOND_PAY_RESTRICTION("ACQ.BEYOND_PAY_RESTRICTION"),
    
    BEYOND_PER_RECEIPT_RESTRICTION("ACQ.BEYOND_PER_RECEIPT_RESTRICTION"),
    
    BUYER_PAYMENT_AMOUNT_MONTH_LIMIT_ERROR("ACQ.BUYER_PAYMENT_AMOUNT_MONTH_LIMIT_ERROR"),
    
    SELLER_BEEN_BLOCKED("ACQ.SELLER_BEEN_BLOCKED"),
    
    ERROR_BUYER_CERTIFY_LEVEL_LIMIT("ACQ.ERROR_BUYER_CERTIFY_LEVEL_LIMIT"),
    
    PAYMENT_REQUEST_HAS_RISK("ACQ.PAYMENT_REQUEST_HAS_RISK"),
    
    NO_PAYMENT_INSTRUMENTS_AVAILABLE("ACQ.NO_PAYMENT_INSTRUMENTS_AVAILABLE"),
    
    USER_FACE_PAYMENT_SWITCH_OFF("ACQ.USER_FACE_PAYMENT_SWITCH_OFF"),
    
    INVALID_STORE_ID("ACQ.INVALID_STORE_ID"),
    
    SUB_MERCHANT_CREATE_FAIL("ACQ.SUB_MERCHANT_CREATE_FAIL"),
    
    SUB_MERCHANT_TYPE_INVALID("ACQ.SUB_MERCHANT_TYPE_INVALID"),
    
    AGREEMENT_NOT_EXIST("ACQ.AGREEMENT_NOT_EXIST"),
    
    AGREEMENT_INVALID("ACQ.AGREEMENT_INVALID"),
    
    AGREEMENT_STATUS_NOT_NORMAL("ACQ.AGREEMENT_STATUS_NOT_NORMAL"),
    
    MERCHANT_AGREEMENT_NOT_EXIST("ACQ.MERCHANT_AGREEMENT_NOT_EXIST"),
    
    MERCHANT_AGREEMENT_INVALID("ACQ.MERCHANT_AGREEMENT_INVALID"),
    
    MERCHANT_STATUS_NOT_NORMAL("ACQ.MERCHANT_STATUS_NOT_NORMAL"),
    
    CARD_USER_NOT_MATCH("ACQ.CARD_USER_NOT_MATCH"),
    
    CARD_TYPE_ERROR("ACQ.CARD_TYPE_ERROR"),
    
    CERT_EXPIRED("ACQ.CERT_EXPIRED"),
    
    AMOUNT_OR_CURRENCY_ERROR("ACQ.AMOUNT_OR_CURRENCY_ERROR"),
    
    CURRENCY_NOT_SUPPORT("ACQ.CURRENCY_NOT_SUPPORT"),
    
    MERCHANT_UNSUPPORT_ADVANCE("ACQ.MERCHANT_UNSUPPORT_ADVANCE"),
    
    BUYER_UNSUPPORT_ADVANCE("ACQ.BUYER_UNSUPPORT_ADVANCE"),
    
    ORDER_UNSUPPORT_ADVANCE("ACQ.ORDER_UNSUPPORT_ADVANCE"),
    
    CYCLE_PAY_DATE_NOT_MATCH("ACQ.CYCLE_PAY_DATE_NOT_MATCH"),
    
    CYCLE_PAY_SINGLE_FEE_EXCEED("ACQ.CYCLE_PAY_SINGLE_FEE_EXCEED"),
    
    CYCLE_PAY_TOTAL_FEE_EXCEED("ACQ.CYCLE_PAY_TOTAL_FEE_EXCEED"),
    
    CYCLE_PAY_TOTAL_TIMES_EXCEED("ACQ.CYCLE_PAY_TOTAL_TIMES_EXCEED"),
    
    SECONDARY_MERCHANT_STATUS_ERROR("ACQ.SECONDARY_MERCHANT_STATUS_ERROR"),
    
    AUTH_NO_ERROR("ACQ.AUTH_NO_ERROR"),
    
    BUYER_NOT_EXIST("ACQ.BUYER_NOT_EXIST"),
    
    PRODUCT_AMOUNT_LIMIT_ERROR("ACQ.PRODUCT_AMOUNT_LIMIT_ERROR"),
    
    SECONDARY_MERCHANT_ALIPAY_ACCOUNT_INVALID("ACQ.SECONDARY_MERCHANT_ALIPAY_ACCOUNT_INVALID"),
    
    INVALID_RECEIVE_ACCOUNT("ACQ.INVALID_RECEIVE_ACCOUNT"),
    
    SELLER_NOT_EXIST("ACQ.SELLER_NOT_EXIST"),
    
    AUTH_AMOUNT_NOT_ENOUGH("ACQ.AUTH_AMOUNT_NOT_ENOUGH"),
    
    AGREEMENT_ERROR("ACQ.AGREEMENT_ERROR"),
    
    BEYOND_PER_RECEIPT_SINGLE_RESTRICTION("ACQ.BEYOND_PER_RECEIPT_SINGLE_RESTRICTION"),
    
    PAYER_UNMATCHED("ACQ.PAYER_UNMATCHED"),
    
    PRE_AUTH_PROD_CODE_INCONSISTENT("ACQ.PRE_AUTH_PROD_CODE_INCONSISTENT"),
    
    SECONDARY_MERCHANT_ID_INVALID("ACQ.SECONDARY_MERCHANT_ID_INVALID"),
    
    NOW_TIME_AFTER_EXPIRE_TIME_ERROR("ACQ.NOW_TIME_AFTER_EXPIRE_TIME_ERROR"),
    
    SECONDARY_MERCHANT_NOT_MATCH("ACQ.SECONDARY_MERCHANT_NOT_MATCH"),
    
    REQUEST_AMOUNT_EXCEED("ACQ.REQUEST_AMOUNT_EXCEED"),
    
    SUB_GOODS_SIZE_MAX_COUNT("ACQ.SUB_GOODS_SIZE_MAX_COUNT"),
    
    NOT_SUPPORT_PAYMENT_INST("ACQ.NOT_SUPPORT_PAYMENT_INST"),
    
    BUYER_NOT_MAINLAND_CERT("ACQ.BUYER_NOT_MAINLAND_CERT"),
    
    SECONDARY_MERCHANT_ID_BLANK("ACQ.SECONDARY_MERCHANT_ID_BLANK"),
    
    TRADE_SETTLE_ERROR("ACQ.TRADE_SETTLE_ERROR"),
    
    AUTH_TOKEN_IS_NOT_EXIST("ACQ.AUTH_TOKEN_IS_NOT_EXIST"),
    
    SMILE_PAY_MERCHANT_NOT_MATCH("ACQ.SMILE_PAY_MERCHANT_NOT_MATCH"),
    
    NOT_CERTIFIED_USER("ACQ.NOT_CERTIFIED_USER"),
    
    SECONDARY_MERCHANT_ISV_PUNISH_INDIRECT("ACQ.SECONDARY_MERCHANT_ISV_PUNISH_INDIRECT"),
    
    RESTRICTED_MERCHANT_INDUSTRY("ACQ.RESTRICTED_MERCHANT_INDUSTRY"),
    
    PLATFORM_BUSINESS_ACQUIRE_MODE_MUST_MERCHANT_ID("ACQ.PLATFORM_BUSINESS_ACQUIRE_MODE_MUST_MERCHANT_ID"),
    
    BEYOND_PER_RECEIPT_DAY_RESTRICTION("ACQ.BEYOND_PER_RECEIPT_DAY_RESTRICTION"),
    
    TRADE_STATUS_ERROR("ACQ.TRADE_STATUS_ERROR"),
    
    MERCHANT_PERM_RECEIPT_SUSPEND_LIMIT("ACQ.MERCHANT_PERM_RECEIPT_SUSPEND_LIMIT"),
    
    MERCHANT_PERM_RECEIPT_SINGLE_LIMIT("ACQ.MERCHANT_PERM_RECEIPT_SINGLE_LIMIT"),
    
    MERCHANT_PERM_RECEIPT_DAY_LIMIT("ACQ.MERCHANT_PERM_RECEIPT_DAY_LIMIT"),
    
    USER_LOGONID_DUP("ACQ.USER_LOGONID_DUP"),
    
    AUTH_ORDER_NOT_PAID("ACQ.AUTH_ORDER_NOT_PAID"),
    
    AUTH_ORDER_HAS_FINISHED("ACQ.AUTH_ORDER_HAS_FINISHED"),
    
    AUTH_ORDER_HAS_CLOSED("ACQ.AUTH_ORDER_HAS_CLOSED"),
    
    ZM_AUTH_AMOUNT_EXCEED("ACQ.ZM_AUTH_AMOUNT_EXCEED"),
    
    ZM_CREDIT_AUTH_FAIL("ACQ.ZM_CREDIT_AUTH_FAIL"),
    
    ZM_AUTH_RULE_LIMIT("ACQ.ZM_AUTH_RULE_LIMIT"),
    
    ROYALTY_ACCOUNT_NOT_EXIST("ACQ.ROYALTY_ACCOUNT_NOT_EXIST");

    private String value;

    CodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static CodeEnum fromValue(String value) {
      for (CodeEnum b : CodeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<CodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public CodeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return CodeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CODE = "code";
  @SerializedName(SERIALIZED_NAME_CODE)
  private CodeEnum code;

  public static final String SERIALIZED_NAME_LINKS = "links";
  @SerializedName(SERIALIZED_NAME_LINKS)
  private String links;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public AlipayTradePayErrorResponseModel() { 
  }

  public AlipayTradePayErrorResponseModel code(CodeEnum code) {
    
    this.code = code;
    return this;
  }

   /**
   * 错误码
   * @return code
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "错误码")

  public CodeEnum getCode() {
    return code;
  }


  public void setCode(CodeEnum code) {
    this.code = code;
  }


  public AlipayTradePayErrorResponseModel links(String links) {
    
    this.links = links;
    return this;
  }

   /**
   * 解决方案链接
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "解决方案链接")

  public String getLinks() {
    return links;
  }


  public void setLinks(String links) {
    this.links = links;
  }


  public AlipayTradePayErrorResponseModel message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * 错误描述
   * @return message
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "错误描述")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayTradePayErrorResponseModel alipayTradePayErrorResponseModel = (AlipayTradePayErrorResponseModel) o;
    return Objects.equals(this.code, alipayTradePayErrorResponseModel.code) &&
        Objects.equals(this.links, alipayTradePayErrorResponseModel.links) &&
        Objects.equals(this.message, alipayTradePayErrorResponseModel.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, links, message);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayTradePayErrorResponseModel {\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
    openapiFields.add("code");
    openapiFields.add("links");
    openapiFields.add("message");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("code");
    openapiRequiredFields.add("message");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayTradePayErrorResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayTradePayErrorResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayTradePayErrorResponseModel is not found in the empty JSON string", AlipayTradePayErrorResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayTradePayErrorResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayTradePayErrorResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AlipayTradePayErrorResponseModel.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("code") != null && !jsonObj.get("code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("code").toString()));
      }
      if (jsonObj.get("links") != null && !jsonObj.get("links").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `links` to be a primitive type in the JSON string but got `%s`", jsonObj.get("links").toString()));
      }
      if (jsonObj.get("message") != null && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayTradePayErrorResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayTradePayErrorResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayTradePayErrorResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayTradePayErrorResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayTradePayErrorResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayTradePayErrorResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayTradePayErrorResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayTradePayErrorResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayTradePayErrorResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayTradePayErrorResponseModel
  */
  public static AlipayTradePayErrorResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayTradePayErrorResponseModel.class);
  }

 /**
  * Convert an instance of AlipayTradePayErrorResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

