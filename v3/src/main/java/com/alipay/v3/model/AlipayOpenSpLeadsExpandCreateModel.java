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
 * AlipayOpenSpLeadsExpandCreateModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenSpLeadsExpandCreateModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_CITY_CODE = "city_code";
  @SerializedName(SERIALIZED_NAME_CITY_CODE)
  private String cityCode;

  public static final String SERIALIZED_NAME_CITY_NAME = "city_name";
  @SerializedName(SERIALIZED_NAME_CITY_NAME)
  private String cityName;

  public static final String SERIALIZED_NAME_DISTRICT_CODE = "district_code";
  @SerializedName(SERIALIZED_NAME_DISTRICT_CODE)
  private String districtCode;

  public static final String SERIALIZED_NAME_DISTRICT_NAME = "district_name";
  @SerializedName(SERIALIZED_NAME_DISTRICT_NAME)
  private String districtName;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_LATITUDE = "latitude";
  @SerializedName(SERIALIZED_NAME_LATITUDE)
  private String latitude;

  public static final String SERIALIZED_NAME_LONGITUDE = "longitude";
  @SerializedName(SERIALIZED_NAME_LONGITUDE)
  private String longitude;

  public static final String SERIALIZED_NAME_MCC = "mcc";
  @SerializedName(SERIALIZED_NAME_MCC)
  private String mcc;

  public static final String SERIALIZED_NAME_MERCHANT_PID = "merchant_pid";
  @SerializedName(SERIALIZED_NAME_MERCHANT_PID)
  private String merchantPid;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OUT_BIZ_NO = "out_biz_no";
  @SerializedName(SERIALIZED_NAME_OUT_BIZ_NO)
  private String outBizNo;

  public static final String SERIALIZED_NAME_PHONE = "phone";
  @SerializedName(SERIALIZED_NAME_PHONE)
  private String phone;

  public static final String SERIALIZED_NAME_PROVINCE_CODE = "province_code";
  @SerializedName(SERIALIZED_NAME_PROVINCE_CODE)
  private String provinceCode;

  public static final String SERIALIZED_NAME_PROVINCE_NAME = "province_name";
  @SerializedName(SERIALIZED_NAME_PROVINCE_NAME)
  private String provinceName;

  public static final String SERIALIZED_NAME_SCENE = "scene";
  @SerializedName(SERIALIZED_NAME_SCENE)
  private String scene;

  public AlipayOpenSpLeadsExpandCreateModel() { 
  }

  public AlipayOpenSpLeadsExpandCreateModel address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * 拓展助手商机地址
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "紫金港路与文二西路交叉口向西500米西城广场", value = "拓展助手商机地址")

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public AlipayOpenSpLeadsExpandCreateModel cityCode(String cityCode) {
    
    this.cityCode = cityCode;
    return this;
  }

   /**
   * 拓展助手商机地址市code
   * @return cityCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "330100", value = "拓展助手商机地址市code")

  public String getCityCode() {
    return cityCode;
  }


  public void setCityCode(String cityCode) {
    this.cityCode = cityCode;
  }


  public AlipayOpenSpLeadsExpandCreateModel cityName(String cityName) {
    
    this.cityName = cityName;
    return this;
  }

   /**
   * 拓展助手商机地址市名称
   * @return cityName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "杭州市", value = "拓展助手商机地址市名称")

  public String getCityName() {
    return cityName;
  }


  public void setCityName(String cityName) {
    this.cityName = cityName;
  }


  public AlipayOpenSpLeadsExpandCreateModel districtCode(String districtCode) {
    
    this.districtCode = districtCode;
    return this;
  }

   /**
   * 拓展助手商机地址区code
   * @return districtCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "330111", value = "拓展助手商机地址区code")

  public String getDistrictCode() {
    return districtCode;
  }


  public void setDistrictCode(String districtCode) {
    this.districtCode = districtCode;
  }


  public AlipayOpenSpLeadsExpandCreateModel districtName(String districtName) {
    
    this.districtName = districtName;
    return this;
  }

   /**
   * 拓展助手商机地址区名称
   * @return districtName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "西湖区", value = "拓展助手商机地址区名称")

  public String getDistrictName() {
    return districtName;
  }


  public void setDistrictName(String districtName) {
    this.districtName = districtName;
  }


  public AlipayOpenSpLeadsExpandCreateModel email(String email) {
    
    this.email = email;
    return this;
  }

   /**
   * 拓展助手商机邮箱
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "xxx@qq.com", value = "拓展助手商机邮箱")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public AlipayOpenSpLeadsExpandCreateModel latitude(String latitude) {
    
    this.latitude = latitude;
    return this;
  }

   /**
   * 拓展助手商机地址纬度
   * @return latitude
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "30.259247", value = "拓展助手商机地址纬度")

  public String getLatitude() {
    return latitude;
  }


  public void setLatitude(String latitude) {
    this.latitude = latitude;
  }


  public AlipayOpenSpLeadsExpandCreateModel longitude(String longitude) {
    
    this.longitude = longitude;
    return this;
  }

   /**
   * 拓展助手商机地址经度
   * @return longitude
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "120.13042700000001", value = "拓展助手商机地址经度")

  public String getLongitude() {
    return longitude;
  }


  public void setLongitude(String longitude) {
    this.longitude = longitude;
  }


  public AlipayOpenSpLeadsExpandCreateModel mcc(String mcc) {
    
    this.mcc = mcc;
    return this;
  }

   /**
   * mcc行业
   * @return mcc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "MARKET", value = "mcc行业")

  public String getMcc() {
    return mcc;
  }


  public void setMcc(String mcc) {
    this.mcc = mcc;
  }


  public AlipayOpenSpLeadsExpandCreateModel merchantPid(String merchantPid) {
    
    this.merchantPid = merchantPid;
    return this;
  }

   /**
   * 2088账号
   * @return merchantPid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088401299710003", value = "2088账号")

  public String getMerchantPid() {
    return merchantPid;
  }


  public void setMerchantPid(String merchantPid) {
    this.merchantPid = merchantPid;
  }


  public AlipayOpenSpLeadsExpandCreateModel name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 拓展助手商机名称
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "名称", value = "拓展助手商机名称")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public AlipayOpenSpLeadsExpandCreateModel outBizNo(String outBizNo) {
    
    this.outBizNo = outBizNo;
    return this;
  }

   /**
   * 外部幂等唯一键
   * @return outBizNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "out_biz_no", value = "外部幂等唯一键")

  public String getOutBizNo() {
    return outBizNo;
  }


  public void setOutBizNo(String outBizNo) {
    this.outBizNo = outBizNo;
  }


  public AlipayOpenSpLeadsExpandCreateModel phone(String phone) {
    
    this.phone = phone;
    return this;
  }

   /**
   * 拓展助手商机联系电话
   * @return phone
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "13812312323", value = "拓展助手商机联系电话")

  public String getPhone() {
    return phone;
  }


  public void setPhone(String phone) {
    this.phone = phone;
  }


  public AlipayOpenSpLeadsExpandCreateModel provinceCode(String provinceCode) {
    
    this.provinceCode = provinceCode;
    return this;
  }

   /**
   * 拓展助手商机地址省code
   * @return provinceCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "330000", value = "拓展助手商机地址省code")

  public String getProvinceCode() {
    return provinceCode;
  }


  public void setProvinceCode(String provinceCode) {
    this.provinceCode = provinceCode;
  }


  public AlipayOpenSpLeadsExpandCreateModel provinceName(String provinceName) {
    
    this.provinceName = provinceName;
    return this;
  }

   /**
   * 拓展助手商机地址省名称
   * @return provinceName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "浙江省", value = "拓展助手商机地址省名称")

  public String getProvinceName() {
    return provinceName;
  }


  public void setProvinceName(String provinceName) {
    this.provinceName = provinceName;
  }


  public AlipayOpenSpLeadsExpandCreateModel scene(String scene) {
    
    this.scene = scene;
    return this;
  }

   /**
   * 拓展助手场景，参数约定
   * @return scene
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "IOT_RUYI_EXPAND", value = "拓展助手场景，参数约定")

  public String getScene() {
    return scene;
  }


  public void setScene(String scene) {
    this.scene = scene;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenSpLeadsExpandCreateModel alipayOpenSpLeadsExpandCreateModel = (AlipayOpenSpLeadsExpandCreateModel) o;
    return Objects.equals(this.address, alipayOpenSpLeadsExpandCreateModel.address) &&
        Objects.equals(this.cityCode, alipayOpenSpLeadsExpandCreateModel.cityCode) &&
        Objects.equals(this.cityName, alipayOpenSpLeadsExpandCreateModel.cityName) &&
        Objects.equals(this.districtCode, alipayOpenSpLeadsExpandCreateModel.districtCode) &&
        Objects.equals(this.districtName, alipayOpenSpLeadsExpandCreateModel.districtName) &&
        Objects.equals(this.email, alipayOpenSpLeadsExpandCreateModel.email) &&
        Objects.equals(this.latitude, alipayOpenSpLeadsExpandCreateModel.latitude) &&
        Objects.equals(this.longitude, alipayOpenSpLeadsExpandCreateModel.longitude) &&
        Objects.equals(this.mcc, alipayOpenSpLeadsExpandCreateModel.mcc) &&
        Objects.equals(this.merchantPid, alipayOpenSpLeadsExpandCreateModel.merchantPid) &&
        Objects.equals(this.name, alipayOpenSpLeadsExpandCreateModel.name) &&
        Objects.equals(this.outBizNo, alipayOpenSpLeadsExpandCreateModel.outBizNo) &&
        Objects.equals(this.phone, alipayOpenSpLeadsExpandCreateModel.phone) &&
        Objects.equals(this.provinceCode, alipayOpenSpLeadsExpandCreateModel.provinceCode) &&
        Objects.equals(this.provinceName, alipayOpenSpLeadsExpandCreateModel.provinceName) &&
        Objects.equals(this.scene, alipayOpenSpLeadsExpandCreateModel.scene);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, cityCode, cityName, districtCode, districtName, email, latitude, longitude, mcc, merchantPid, name, outBizNo, phone, provinceCode, provinceName, scene);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenSpLeadsExpandCreateModel {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    cityCode: ").append(toIndentedString(cityCode)).append("\n");
    sb.append("    cityName: ").append(toIndentedString(cityName)).append("\n");
    sb.append("    districtCode: ").append(toIndentedString(districtCode)).append("\n");
    sb.append("    districtName: ").append(toIndentedString(districtName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    latitude: ").append(toIndentedString(latitude)).append("\n");
    sb.append("    longitude: ").append(toIndentedString(longitude)).append("\n");
    sb.append("    mcc: ").append(toIndentedString(mcc)).append("\n");
    sb.append("    merchantPid: ").append(toIndentedString(merchantPid)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    outBizNo: ").append(toIndentedString(outBizNo)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    provinceCode: ").append(toIndentedString(provinceCode)).append("\n");
    sb.append("    provinceName: ").append(toIndentedString(provinceName)).append("\n");
    sb.append("    scene: ").append(toIndentedString(scene)).append("\n");
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
    openapiFields.add("address");
    openapiFields.add("city_code");
    openapiFields.add("city_name");
    openapiFields.add("district_code");
    openapiFields.add("district_name");
    openapiFields.add("email");
    openapiFields.add("latitude");
    openapiFields.add("longitude");
    openapiFields.add("mcc");
    openapiFields.add("merchant_pid");
    openapiFields.add("name");
    openapiFields.add("out_biz_no");
    openapiFields.add("phone");
    openapiFields.add("province_code");
    openapiFields.add("province_name");
    openapiFields.add("scene");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenSpLeadsExpandCreateModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenSpLeadsExpandCreateModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenSpLeadsExpandCreateModel is not found in the empty JSON string", AlipayOpenSpLeadsExpandCreateModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenSpLeadsExpandCreateModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenSpLeadsExpandCreateModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("address") != null && !jsonObj.get("address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address").toString()));
      }
      if (jsonObj.get("city_code") != null && !jsonObj.get("city_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city_code").toString()));
      }
      if (jsonObj.get("city_name") != null && !jsonObj.get("city_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city_name").toString()));
      }
      if (jsonObj.get("district_code") != null && !jsonObj.get("district_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `district_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("district_code").toString()));
      }
      if (jsonObj.get("district_name") != null && !jsonObj.get("district_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `district_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("district_name").toString()));
      }
      if (jsonObj.get("email") != null && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if (jsonObj.get("latitude") != null && !jsonObj.get("latitude").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `latitude` to be a primitive type in the JSON string but got `%s`", jsonObj.get("latitude").toString()));
      }
      if (jsonObj.get("longitude") != null && !jsonObj.get("longitude").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `longitude` to be a primitive type in the JSON string but got `%s`", jsonObj.get("longitude").toString()));
      }
      if (jsonObj.get("mcc") != null && !jsonObj.get("mcc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `mcc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("mcc").toString()));
      }
      if (jsonObj.get("merchant_pid") != null && !jsonObj.get("merchant_pid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_pid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_pid").toString()));
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("out_biz_no") != null && !jsonObj.get("out_biz_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_biz_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_biz_no").toString()));
      }
      if (jsonObj.get("phone") != null && !jsonObj.get("phone").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `phone` to be a primitive type in the JSON string but got `%s`", jsonObj.get("phone").toString()));
      }
      if (jsonObj.get("province_code") != null && !jsonObj.get("province_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `province_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("province_code").toString()));
      }
      if (jsonObj.get("province_name") != null && !jsonObj.get("province_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `province_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("province_name").toString()));
      }
      if (jsonObj.get("scene") != null && !jsonObj.get("scene").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `scene` to be a primitive type in the JSON string but got `%s`", jsonObj.get("scene").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenSpLeadsExpandCreateModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenSpLeadsExpandCreateModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenSpLeadsExpandCreateModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenSpLeadsExpandCreateModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenSpLeadsExpandCreateModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenSpLeadsExpandCreateModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenSpLeadsExpandCreateModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenSpLeadsExpandCreateModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenSpLeadsExpandCreateModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenSpLeadsExpandCreateModel
  */
  public static AlipayOpenSpLeadsExpandCreateModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenSpLeadsExpandCreateModel.class);
  }

 /**
  * Convert an instance of AlipayOpenSpLeadsExpandCreateModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

