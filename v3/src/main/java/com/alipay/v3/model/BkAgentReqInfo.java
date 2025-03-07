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
 * BkAgentReqInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class BkAgentReqInfo {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ACQ_CODE = "acq_code";
  @SerializedName(SERIALIZED_NAME_ACQ_CODE)
  private String acqCode;

  public static final String SERIALIZED_NAME_DEVICE_TYPE = "device_type";
  @SerializedName(SERIALIZED_NAME_DEVICE_TYPE)
  private String deviceType;

  public static final String SERIALIZED_NAME_LOCATION = "location";
  @SerializedName(SERIALIZED_NAME_LOCATION)
  private String location;

  public static final String SERIALIZED_NAME_MERCH_CODE = "merch_code";
  @SerializedName(SERIALIZED_NAME_MERCH_CODE)
  private String merchCode;

  public static final String SERIALIZED_NAME_SERIAL_NUM = "serial_num";
  @SerializedName(SERIALIZED_NAME_SERIAL_NUM)
  private String serialNum;

  public BkAgentReqInfo() { 
  }

  public BkAgentReqInfo acqCode(String acqCode) {
    
    this.acqCode = acqCode;
    return this;
  }

   /**
   * 收单机构在清算组织登记或分配的机构代码
   * @return acqCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "收单机构在清算组织登记或分配的机构代码")

  public String getAcqCode() {
    return acqCode;
  }


  public void setAcqCode(String acqCode) {
    this.acqCode = acqCode;
  }


  public BkAgentReqInfo deviceType(String deviceType) {
    
    this.deviceType = deviceType;
    return this;
  }

   /**
   * 终端设备类型，受理方可参考终端 注册时的设备类型填写，取值如下: 01:自动柜员机(含 ATM 和 CDM) 和多媒体自助终端  02:传统 POS 03:mPOS 04:智能 POS 05:II 型固定电话 06:云闪付终端; 07:保留使用; 08:手机 POS; 09:刷脸付终端; 10:条码支付受理终端; 11:条码支付辅助受理终端; 12:行业终端(公交、地铁用于指 定行业的终端); 13:MIS 终端;
   * @return deviceType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "终端设备类型，受理方可参考终端 注册时的设备类型填写，取值如下: 01:自动柜员机(含 ATM 和 CDM) 和多媒体自助终端  02:传统 POS 03:mPOS 04:智能 POS 05:II 型固定电话 06:云闪付终端; 07:保留使用; 08:手机 POS; 09:刷脸付终端; 10:条码支付受理终端; 11:条码支付辅助受理终端; 12:行业终端(公交、地铁用于指 定行业的终端); 13:MIS 终端;")

  public String getDeviceType() {
    return deviceType;
  }


  public void setDeviceType(String deviceType) {
    this.deviceType = deviceType;
  }


  public BkAgentReqInfo location(String location) {
    
    this.location = location;
    return this;
  }

   /**
   * 终端设备实时经纬度信息，格式为纬度/经度，+表示北纬、东经，-表示南纬、西经。
   * @return location
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "终端设备实时经纬度信息，格式为纬度/经度，+表示北纬、东经，-表示南纬、西经。")

  public String getLocation() {
    return location;
  }


  public void setLocation(String location) {
    this.location = location;
  }


  public BkAgentReqInfo merchCode(String merchCode) {
    
    this.merchCode = merchCode;
    return this;
  }

   /**
   * 收单机构在清算组织登记的商户编码
   * @return merchCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "收单机构在清算组织登记的商户编码")

  public String getMerchCode() {
    return merchCode;
  }


  public void setMerchCode(String merchCode) {
    this.merchCode = merchCode;
  }


  public BkAgentReqInfo serialNum(String serialNum) {
    
    this.serialNum = serialNum;
    return this;
  }

   /**
   * 终端类型填写为 02、 03、04、05、06、08、09 或 10 时，必 须填写终端序列号。
   * @return serialNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "终端类型填写为 02、 03、04、05、06、08、09 或 10 时，必 须填写终端序列号。")

  public String getSerialNum() {
    return serialNum;
  }


  public void setSerialNum(String serialNum) {
    this.serialNum = serialNum;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BkAgentReqInfo bkAgentReqInfo = (BkAgentReqInfo) o;
    return Objects.equals(this.acqCode, bkAgentReqInfo.acqCode) &&
        Objects.equals(this.deviceType, bkAgentReqInfo.deviceType) &&
        Objects.equals(this.location, bkAgentReqInfo.location) &&
        Objects.equals(this.merchCode, bkAgentReqInfo.merchCode) &&
        Objects.equals(this.serialNum, bkAgentReqInfo.serialNum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acqCode, deviceType, location, merchCode, serialNum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BkAgentReqInfo {\n");
    sb.append("    acqCode: ").append(toIndentedString(acqCode)).append("\n");
    sb.append("    deviceType: ").append(toIndentedString(deviceType)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    merchCode: ").append(toIndentedString(merchCode)).append("\n");
    sb.append("    serialNum: ").append(toIndentedString(serialNum)).append("\n");
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
    openapiFields.add("acq_code");
    openapiFields.add("device_type");
    openapiFields.add("location");
    openapiFields.add("merch_code");
    openapiFields.add("serial_num");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to BkAgentReqInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (BkAgentReqInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in BkAgentReqInfo is not found in the empty JSON string", BkAgentReqInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!BkAgentReqInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `BkAgentReqInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("acq_code") != null && !jsonObj.get("acq_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `acq_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("acq_code").toString()));
      }
      if (jsonObj.get("device_type") != null && !jsonObj.get("device_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `device_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("device_type").toString()));
      }
      if (jsonObj.get("location") != null && !jsonObj.get("location").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `location` to be a primitive type in the JSON string but got `%s`", jsonObj.get("location").toString()));
      }
      if (jsonObj.get("merch_code") != null && !jsonObj.get("merch_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merch_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merch_code").toString()));
      }
      if (jsonObj.get("serial_num") != null && !jsonObj.get("serial_num").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serial_num` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serial_num").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!BkAgentReqInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'BkAgentReqInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<BkAgentReqInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(BkAgentReqInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<BkAgentReqInfo>() {
           @Override
           public void write(JsonWriter out, BkAgentReqInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public BkAgentReqInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of BkAgentReqInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of BkAgentReqInfo
  * @throws IOException if the JSON string is invalid with respect to BkAgentReqInfo
  */
  public static BkAgentReqInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, BkAgentReqInfo.class);
  }

 /**
  * Convert an instance of BkAgentReqInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

