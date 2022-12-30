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
import com.alipay.v3.model.InterfaceInfoList;
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
 * AlipayEcoMycarParkingConfigQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayEcoMycarParkingConfigQueryResponseModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ACCOUNT_NO = "account_no";
  @SerializedName(SERIALIZED_NAME_ACCOUNT_NO)
  private String accountNo;

  public static final String SERIALIZED_NAME_INTERFACE_INFO_LIST = "interface_info_list";
  @SerializedName(SERIALIZED_NAME_INTERFACE_INFO_LIST)
  private InterfaceInfoList interfaceInfoList;

  public static final String SERIALIZED_NAME_MERCHANT_LOGO = "merchant_logo";
  @SerializedName(SERIALIZED_NAME_MERCHANT_LOGO)
  private String merchantLogo;

  public static final String SERIALIZED_NAME_MERCHANT_NAME = "merchant_name";
  @SerializedName(SERIALIZED_NAME_MERCHANT_NAME)
  private String merchantName;

  public static final String SERIALIZED_NAME_MERCHANT_SERVICE_PHONE = "merchant_service_phone";
  @SerializedName(SERIALIZED_NAME_MERCHANT_SERVICE_PHONE)
  private String merchantServicePhone;

  public AlipayEcoMycarParkingConfigQueryResponseModel() { 
  }

  public AlipayEcoMycarParkingConfigQueryResponseModel accountNo(String accountNo) {
    
    this.accountNo = accountNo;
    return this;
  }

   /**
   * 签约支付宝账号，开发者通过ISV系统配置信息注册接口(alipay.eco.mycar.parking.config.set)传入的参数值
   * @return accountNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1234567@126.com", value = "签约支付宝账号，开发者通过ISV系统配置信息注册接口(alipay.eco.mycar.parking.config.set)传入的参数值")

  public String getAccountNo() {
    return accountNo;
  }


  public void setAccountNo(String accountNo) {
    this.accountNo = accountNo;
  }


  public AlipayEcoMycarParkingConfigQueryResponseModel interfaceInfoList(InterfaceInfoList interfaceInfoList) {
    
    this.interfaceInfoList = interfaceInfoList;
    return this;
  }

   /**
   * Get interfaceInfoList
   * @return interfaceInfoList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InterfaceInfoList getInterfaceInfoList() {
    return interfaceInfoList;
  }


  public void setInterfaceInfoList(InterfaceInfoList interfaceInfoList) {
    this.interfaceInfoList = interfaceInfoList;
  }


  public AlipayEcoMycarParkingConfigQueryResponseModel merchantLogo(String merchantLogo) {
    
    this.merchantLogo = merchantLogo;
    return this;
  }

   /**
   * 商户在停车平台首页露出的LOGO链接地址，开发者通过ISV系统配置信息注册接口(alipay.eco.mycar.parking.config.set)调用自动生成该链接
   * @return merchantLogo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://ecopublic.oss-cn-hangzhou.aliyuncs.com/eco/carlife/parking/merchantlogo/xiaoshanjichang.png", value = "商户在停车平台首页露出的LOGO链接地址，开发者通过ISV系统配置信息注册接口(alipay.eco.mycar.parking.config.set)调用自动生成该链接")

  public String getMerchantLogo() {
    return merchantLogo;
  }


  public void setMerchantLogo(String merchantLogo) {
    this.merchantLogo = merchantLogo;
  }


  public AlipayEcoMycarParkingConfigQueryResponseModel merchantName(String merchantName) {
    
    this.merchantName = merchantName;
    return this;
  }

   /**
   * 商户简称，开发者通过ISV系统配置信息注册接口(alipay.eco.mycar.parking.config.set)传入的参数值
   * @return merchantName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "杭州立方", value = "商户简称，开发者通过ISV系统配置信息注册接口(alipay.eco.mycar.parking.config.set)传入的参数值")

  public String getMerchantName() {
    return merchantName;
  }


  public void setMerchantName(String merchantName) {
    this.merchantName = merchantName;
  }


  public AlipayEcoMycarParkingConfigQueryResponseModel merchantServicePhone(String merchantServicePhone) {
    
    this.merchantServicePhone = merchantServicePhone;
    return this;
  }

   /**
   * 商户客服电话，开发者通过ISV系统配置信息注册接口(alipay.eco.mycar.parking.config.set)传入的参数值
   * @return merchantServicePhone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "021-25413215", value = "商户客服电话，开发者通过ISV系统配置信息注册接口(alipay.eco.mycar.parking.config.set)传入的参数值")

  public String getMerchantServicePhone() {
    return merchantServicePhone;
  }


  public void setMerchantServicePhone(String merchantServicePhone) {
    this.merchantServicePhone = merchantServicePhone;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayEcoMycarParkingConfigQueryResponseModel alipayEcoMycarParkingConfigQueryResponseModel = (AlipayEcoMycarParkingConfigQueryResponseModel) o;
    return Objects.equals(this.accountNo, alipayEcoMycarParkingConfigQueryResponseModel.accountNo) &&
        Objects.equals(this.interfaceInfoList, alipayEcoMycarParkingConfigQueryResponseModel.interfaceInfoList) &&
        Objects.equals(this.merchantLogo, alipayEcoMycarParkingConfigQueryResponseModel.merchantLogo) &&
        Objects.equals(this.merchantName, alipayEcoMycarParkingConfigQueryResponseModel.merchantName) &&
        Objects.equals(this.merchantServicePhone, alipayEcoMycarParkingConfigQueryResponseModel.merchantServicePhone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNo, interfaceInfoList, merchantLogo, merchantName, merchantServicePhone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayEcoMycarParkingConfigQueryResponseModel {\n");
    sb.append("    accountNo: ").append(toIndentedString(accountNo)).append("\n");
    sb.append("    interfaceInfoList: ").append(toIndentedString(interfaceInfoList)).append("\n");
    sb.append("    merchantLogo: ").append(toIndentedString(merchantLogo)).append("\n");
    sb.append("    merchantName: ").append(toIndentedString(merchantName)).append("\n");
    sb.append("    merchantServicePhone: ").append(toIndentedString(merchantServicePhone)).append("\n");
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
    openapiFields.add("account_no");
    openapiFields.add("interface_info_list");
    openapiFields.add("merchant_logo");
    openapiFields.add("merchant_name");
    openapiFields.add("merchant_service_phone");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayEcoMycarParkingConfigQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayEcoMycarParkingConfigQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayEcoMycarParkingConfigQueryResponseModel is not found in the empty JSON string", AlipayEcoMycarParkingConfigQueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayEcoMycarParkingConfigQueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayEcoMycarParkingConfigQueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("account_no") != null && !jsonObj.get("account_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `account_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("account_no").toString()));
      }
      // validate the optional field `interface_info_list`
      if (jsonObj.getAsJsonObject("interface_info_list") != null) {
        InterfaceInfoList.validateJsonObject(jsonObj.getAsJsonObject("interface_info_list"));
      }
      if (jsonObj.get("merchant_logo") != null && !jsonObj.get("merchant_logo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_logo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_logo").toString()));
      }
      if (jsonObj.get("merchant_name") != null && !jsonObj.get("merchant_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_name").toString()));
      }
      if (jsonObj.get("merchant_service_phone") != null && !jsonObj.get("merchant_service_phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_service_phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_service_phone").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayEcoMycarParkingConfigQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayEcoMycarParkingConfigQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayEcoMycarParkingConfigQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayEcoMycarParkingConfigQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayEcoMycarParkingConfigQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayEcoMycarParkingConfigQueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayEcoMycarParkingConfigQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayEcoMycarParkingConfigQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayEcoMycarParkingConfigQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayEcoMycarParkingConfigQueryResponseModel
  */
  public static AlipayEcoMycarParkingConfigQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayEcoMycarParkingConfigQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayEcoMycarParkingConfigQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

