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
 * CommonVoucherDisplayInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CommonVoucherDisplayInfo {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_BRAND_LOGO = "brand_logo";
  @SerializedName(SERIALIZED_NAME_BRAND_LOGO)
  private String brandLogo;

  public static final String SERIALIZED_NAME_BRAND_NAME = "brand_name";
  @SerializedName(SERIALIZED_NAME_BRAND_NAME)
  private String brandName;

  public static final String SERIALIZED_NAME_VOUCHER_DESCRIPTION = "voucher_description";
  @SerializedName(SERIALIZED_NAME_VOUCHER_DESCRIPTION)
  private String voucherDescription;

  public static final String SERIALIZED_NAME_VOUCHER_DETAIL_IMAGES = "voucher_detail_images";
  @SerializedName(SERIALIZED_NAME_VOUCHER_DETAIL_IMAGES)
  private List<String> voucherDetailImages = null;

  public static final String SERIALIZED_NAME_VOUCHER_IMAGE = "voucher_image";
  @SerializedName(SERIALIZED_NAME_VOUCHER_IMAGE)
  private String voucherImage;

  public CommonVoucherDisplayInfo() { 
  }

  public CommonVoucherDisplayInfo brandLogo(String brandLogo) {
    
    this.brandLogo = brandLogo;
    return this;
  }

   /**
   * 商家品牌 logo 链接。
   * @return brandLogo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商家品牌 logo 链接。")

  public String getBrandLogo() {
    return brandLogo;
  }


  public void setBrandLogo(String brandLogo) {
    this.brandLogo = brandLogo;
  }


  public CommonVoucherDisplayInfo brandName(String brandName) {
    
    this.brandName = brandName;
    return this;
  }

   /**
   * 商户品牌名称。 如果不设置品牌名称，则默认使用支付宝商家系统中维护的商家别名。 如果没有维护商家别名，则使用默认名称： 商家优惠。 用户领取优惠券后，品牌名称会对用户进行展示
   * @return brandName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商户品牌名称。 如果不设置品牌名称，则默认使用支付宝商家系统中维护的商家别名。 如果没有维护商家别名，则使用默认名称： 商家优惠。 用户领取优惠券后，品牌名称会对用户进行展示")

  public String getBrandName() {
    return brandName;
  }


  public void setBrandName(String brandName) {
    this.brandName = brandName;
  }


  public CommonVoucherDisplayInfo voucherDescription(String voucherDescription) {
    
    this.voucherDescription = voucherDescription;
    return this;
  }

   /**
   * 用于说明详细的活动规则，会展示在支付宝卡包券详情页。
   * @return voucherDescription
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "用于说明详细的活动规则，会展示在支付宝卡包券详情页。")

  public String getVoucherDescription() {
    return voucherDescription;
  }


  public void setVoucherDescription(String voucherDescription) {
    this.voucherDescription = voucherDescription;
  }


  public CommonVoucherDisplayInfo voucherDetailImages(List<String> voucherDetailImages) {
    
    this.voucherDetailImages = voucherDetailImages;
    return this;
  }

  public CommonVoucherDisplayInfo addVoucherDetailImagesItem(String voucherDetailImagesItem) {
    if (this.voucherDetailImages == null) {
      this.voucherDetailImages = new ArrayList<>();
    }
    this.voucherDetailImages.add(voucherDetailImagesItem);
    return this;
  }

   /**
   * 券详情图片链接。
   * @return voucherDetailImages
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "券详情图片链接。")

  public List<String> getVoucherDetailImages() {
    return voucherDetailImages;
  }


  public void setVoucherDetailImages(List<String> voucherDetailImages) {
    this.voucherDetailImages = voucherDetailImages;
  }


  public CommonVoucherDisplayInfo voucherImage(String voucherImage) {
    
    this.voucherImage = voucherImage;
    return this;
  }

   /**
   * 券封面图链接。
   * @return voucherImage
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "券封面图链接。")

  public String getVoucherImage() {
    return voucherImage;
  }


  public void setVoucherImage(String voucherImage) {
    this.voucherImage = voucherImage;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CommonVoucherDisplayInfo commonVoucherDisplayInfo = (CommonVoucherDisplayInfo) o;
    return Objects.equals(this.brandLogo, commonVoucherDisplayInfo.brandLogo) &&
        Objects.equals(this.brandName, commonVoucherDisplayInfo.brandName) &&
        Objects.equals(this.voucherDescription, commonVoucherDisplayInfo.voucherDescription) &&
        Objects.equals(this.voucherDetailImages, commonVoucherDisplayInfo.voucherDetailImages) &&
        Objects.equals(this.voucherImage, commonVoucherDisplayInfo.voucherImage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brandLogo, brandName, voucherDescription, voucherDetailImages, voucherImage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CommonVoucherDisplayInfo {\n");
    sb.append("    brandLogo: ").append(toIndentedString(brandLogo)).append("\n");
    sb.append("    brandName: ").append(toIndentedString(brandName)).append("\n");
    sb.append("    voucherDescription: ").append(toIndentedString(voucherDescription)).append("\n");
    sb.append("    voucherDetailImages: ").append(toIndentedString(voucherDetailImages)).append("\n");
    sb.append("    voucherImage: ").append(toIndentedString(voucherImage)).append("\n");
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
    openapiFields.add("brand_logo");
    openapiFields.add("brand_name");
    openapiFields.add("voucher_description");
    openapiFields.add("voucher_detail_images");
    openapiFields.add("voucher_image");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CommonVoucherDisplayInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CommonVoucherDisplayInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CommonVoucherDisplayInfo is not found in the empty JSON string", CommonVoucherDisplayInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CommonVoucherDisplayInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CommonVoucherDisplayInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("brand_logo") != null && !jsonObj.get("brand_logo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `brand_logo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("brand_logo").toString()));
      }
      if (jsonObj.get("brand_name") != null && !jsonObj.get("brand_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `brand_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("brand_name").toString()));
      }
      if (jsonObj.get("voucher_description") != null && !jsonObj.get("voucher_description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voucher_description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voucher_description").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("voucher_detail_images") != null && !jsonObj.get("voucher_detail_images").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `voucher_detail_images` to be an array in the JSON string but got `%s`", jsonObj.get("voucher_detail_images").toString()));
      }
      if (jsonObj.get("voucher_image") != null && !jsonObj.get("voucher_image").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voucher_image` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voucher_image").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CommonVoucherDisplayInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CommonVoucherDisplayInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CommonVoucherDisplayInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CommonVoucherDisplayInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<CommonVoucherDisplayInfo>() {
           @Override
           public void write(JsonWriter out, CommonVoucherDisplayInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CommonVoucherDisplayInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CommonVoucherDisplayInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CommonVoucherDisplayInfo
  * @throws IOException if the JSON string is invalid with respect to CommonVoucherDisplayInfo
  */
  public static CommonVoucherDisplayInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CommonVoucherDisplayInfo.class);
  }

 /**
  * Convert an instance of CommonVoucherDisplayInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

