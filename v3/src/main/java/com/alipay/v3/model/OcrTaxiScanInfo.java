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
 * OcrTaxiScanInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OcrTaxiScanInfo {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_GET_OFF_TIME = "get_off_time";
  @SerializedName(SERIALIZED_NAME_GET_OFF_TIME)
  private String getOffTime;

  public static final String SERIALIZED_NAME_GET_ON_TIME = "get_on_time";
  @SerializedName(SERIALIZED_NAME_GET_ON_TIME)
  private String getOnTime;

  public static final String SERIALIZED_NAME_INVOICE_CODE = "invoice_code";
  @SerializedName(SERIALIZED_NAME_INVOICE_CODE)
  private String invoiceCode;

  public static final String SERIALIZED_NAME_INVOICE_DATE = "invoice_date";
  @SerializedName(SERIALIZED_NAME_INVOICE_DATE)
  private String invoiceDate;

  public static final String SERIALIZED_NAME_INVOICE_NO = "invoice_no";
  @SerializedName(SERIALIZED_NAME_INVOICE_NO)
  private String invoiceNo;

  public static final String SERIALIZED_NAME_PASSENGER = "passenger";
  @SerializedName(SERIALIZED_NAME_PASSENGER)
  private String passenger;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private String price;

  public static final String SERIALIZED_NAME_TRAVEL_DIST = "travel_dist";
  @SerializedName(SERIALIZED_NAME_TRAVEL_DIST)
  private String travelDist;

  public OcrTaxiScanInfo() { 
  }

  public OcrTaxiScanInfo getOffTime(String getOffTime) {
    
    this.getOffTime = getOffTime;
    return this;
  }

   /**
   * 下车时间
   * @return getOffTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "下车时间")

  public String getGetOffTime() {
    return getOffTime;
  }


  public void setGetOffTime(String getOffTime) {
    this.getOffTime = getOffTime;
  }


  public OcrTaxiScanInfo getOnTime(String getOnTime) {
    
    this.getOnTime = getOnTime;
    return this;
  }

   /**
   * 上车时间
   * @return getOnTime
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "上车时间")

  public String getGetOnTime() {
    return getOnTime;
  }


  public void setGetOnTime(String getOnTime) {
    this.getOnTime = getOnTime;
  }


  public OcrTaxiScanInfo invoiceCode(String invoiceCode) {
    
    this.invoiceCode = invoiceCode;
    return this;
  }

   /**
   * 发票代码
   * @return invoiceCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "发票代码")

  public String getInvoiceCode() {
    return invoiceCode;
  }


  public void setInvoiceCode(String invoiceCode) {
    this.invoiceCode = invoiceCode;
  }


  public OcrTaxiScanInfo invoiceDate(String invoiceDate) {
    
    this.invoiceDate = invoiceDate;
    return this;
  }

   /**
   * 开票时间
   * @return invoiceDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "开票时间")

  public String getInvoiceDate() {
    return invoiceDate;
  }


  public void setInvoiceDate(String invoiceDate) {
    this.invoiceDate = invoiceDate;
  }


  public OcrTaxiScanInfo invoiceNo(String invoiceNo) {
    
    this.invoiceNo = invoiceNo;
    return this;
  }

   /**
   * 发票号码
   * @return invoiceNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "发票号码")

  public String getInvoiceNo() {
    return invoiceNo;
  }


  public void setInvoiceNo(String invoiceNo) {
    this.invoiceNo = invoiceNo;
  }


  public OcrTaxiScanInfo passenger(String passenger) {
    
    this.passenger = passenger;
    return this;
  }

   /**
   * 乘客人
   * @return passenger
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "乘客人")

  public String getPassenger() {
    return passenger;
  }


  public void setPassenger(String passenger) {
    this.passenger = passenger;
  }


  public OcrTaxiScanInfo price(String price) {
    
    this.price = price;
    return this;
  }

   /**
   * 金额
   * @return price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "金额")

  public String getPrice() {
    return price;
  }


  public void setPrice(String price) {
    this.price = price;
  }


  public OcrTaxiScanInfo travelDist(String travelDist) {
    
    this.travelDist = travelDist;
    return this;
  }

   /**
   * 乘车距离
   * @return travelDist
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "乘车距离")

  public String getTravelDist() {
    return travelDist;
  }


  public void setTravelDist(String travelDist) {
    this.travelDist = travelDist;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OcrTaxiScanInfo ocrTaxiScanInfo = (OcrTaxiScanInfo) o;
    return Objects.equals(this.getOffTime, ocrTaxiScanInfo.getOffTime) &&
        Objects.equals(this.getOnTime, ocrTaxiScanInfo.getOnTime) &&
        Objects.equals(this.invoiceCode, ocrTaxiScanInfo.invoiceCode) &&
        Objects.equals(this.invoiceDate, ocrTaxiScanInfo.invoiceDate) &&
        Objects.equals(this.invoiceNo, ocrTaxiScanInfo.invoiceNo) &&
        Objects.equals(this.passenger, ocrTaxiScanInfo.passenger) &&
        Objects.equals(this.price, ocrTaxiScanInfo.price) &&
        Objects.equals(this.travelDist, ocrTaxiScanInfo.travelDist);
  }

  @Override
  public int hashCode() {
    return Objects.hash(getOffTime, getOnTime, invoiceCode, invoiceDate, invoiceNo, passenger, price, travelDist);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OcrTaxiScanInfo {\n");
    sb.append("    getOffTime: ").append(toIndentedString(getOffTime)).append("\n");
    sb.append("    getOnTime: ").append(toIndentedString(getOnTime)).append("\n");
    sb.append("    invoiceCode: ").append(toIndentedString(invoiceCode)).append("\n");
    sb.append("    invoiceDate: ").append(toIndentedString(invoiceDate)).append("\n");
    sb.append("    invoiceNo: ").append(toIndentedString(invoiceNo)).append("\n");
    sb.append("    passenger: ").append(toIndentedString(passenger)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    travelDist: ").append(toIndentedString(travelDist)).append("\n");
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
    openapiFields.add("get_off_time");
    openapiFields.add("get_on_time");
    openapiFields.add("invoice_code");
    openapiFields.add("invoice_date");
    openapiFields.add("invoice_no");
    openapiFields.add("passenger");
    openapiFields.add("price");
    openapiFields.add("travel_dist");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OcrTaxiScanInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (OcrTaxiScanInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in OcrTaxiScanInfo is not found in the empty JSON string", OcrTaxiScanInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!OcrTaxiScanInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OcrTaxiScanInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("get_off_time") != null && !jsonObj.get("get_off_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `get_off_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("get_off_time").toString()));
      }
      if (jsonObj.get("get_on_time") != null && !jsonObj.get("get_on_time").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `get_on_time` to be a primitive type in the JSON string but got `%s`", jsonObj.get("get_on_time").toString()));
      }
      if (jsonObj.get("invoice_code") != null && !jsonObj.get("invoice_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoice_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoice_code").toString()));
      }
      if (jsonObj.get("invoice_date") != null && !jsonObj.get("invoice_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoice_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoice_date").toString()));
      }
      if (jsonObj.get("invoice_no") != null && !jsonObj.get("invoice_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `invoice_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("invoice_no").toString()));
      }
      if (jsonObj.get("passenger") != null && !jsonObj.get("passenger").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `passenger` to be a primitive type in the JSON string but got `%s`", jsonObj.get("passenger").toString()));
      }
      if (jsonObj.get("price") != null && !jsonObj.get("price").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `price` to be a primitive type in the JSON string but got `%s`", jsonObj.get("price").toString()));
      }
      if (jsonObj.get("travel_dist") != null && !jsonObj.get("travel_dist").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `travel_dist` to be a primitive type in the JSON string but got `%s`", jsonObj.get("travel_dist").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OcrTaxiScanInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OcrTaxiScanInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OcrTaxiScanInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OcrTaxiScanInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<OcrTaxiScanInfo>() {
           @Override
           public void write(JsonWriter out, OcrTaxiScanInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OcrTaxiScanInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OcrTaxiScanInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OcrTaxiScanInfo
  * @throws IOException if the JSON string is invalid with respect to OcrTaxiScanInfo
  */
  public static OcrTaxiScanInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OcrTaxiScanInfo.class);
  }

 /**
  * Convert an instance of OcrTaxiScanInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

