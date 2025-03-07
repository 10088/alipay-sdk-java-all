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
import com.alipay.v3.model.AlipayOpenAgentCommonSignModel;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.File;
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
 * AlipayOpenAgentCommonSignRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenAgentCommonSignRequest {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_APP_DEMO = "app_demo";
  @SerializedName(SERIALIZED_NAME_APP_DEMO)
  private File appDemo;

  public static final String SERIALIZED_NAME_BUSINESS_LICENSE_AUTH_PIC = "business_license_auth_pic";
  @SerializedName(SERIALIZED_NAME_BUSINESS_LICENSE_AUTH_PIC)
  private File businessLicenseAuthPic;

  public static final String SERIALIZED_NAME_BUSINESS_LICENSE_PIC = "business_license_pic";
  @SerializedName(SERIALIZED_NAME_BUSINESS_LICENSE_PIC)
  private File businessLicensePic;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private AlipayOpenAgentCommonSignModel data;

  public static final String SERIALIZED_NAME_SHOP_SCENE_PIC = "shop_scene_pic";
  @SerializedName(SERIALIZED_NAME_SHOP_SCENE_PIC)
  private File shopScenePic;

  public static final String SERIALIZED_NAME_SHOP_SIGN_BOARD_PIC = "shop_sign_board_pic";
  @SerializedName(SERIALIZED_NAME_SHOP_SIGN_BOARD_PIC)
  private File shopSignBoardPic;

  public static final String SERIALIZED_NAME_SPECIAL_LICENSE_PIC = "special_license_pic";
  @SerializedName(SERIALIZED_NAME_SPECIAL_LICENSE_PIC)
  private File specialLicensePic;

  public static final String SERIALIZED_NAME_WEB_HOME_SCREENSHOT = "web_home_screenshot";
  @SerializedName(SERIALIZED_NAME_WEB_HOME_SCREENSHOT)
  private File webHomeScreenshot;

  public static final String SERIALIZED_NAME_WEB_ITEM_SCREENSHOT = "web_item_screenshot";
  @SerializedName(SERIALIZED_NAME_WEB_ITEM_SCREENSHOT)
  private File webItemScreenshot;

  public static final String SERIALIZED_NAME_WEB_PAY_SCREENSHOT = "web_pay_screenshot";
  @SerializedName(SERIALIZED_NAME_WEB_PAY_SCREENSHOT)
  private File webPayScreenshot;

  public static final String SERIALIZED_NAME_WEB_SITES_LOA = "web_sites_loa";
  @SerializedName(SERIALIZED_NAME_WEB_SITES_LOA)
  private File webSitesLoa;

  public AlipayOpenAgentCommonSignRequest() { 
  }

  public AlipayOpenAgentCommonSignRequest appDemo(File appDemo) {
    
    this.appDemo = appDemo;
    return this;
  }

   /**
   * Get appDemo
   * @return appDemo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public File getAppDemo() {
    return appDemo;
  }


  public void setAppDemo(File appDemo) {
    this.appDemo = appDemo;
  }


  public AlipayOpenAgentCommonSignRequest businessLicenseAuthPic(File businessLicenseAuthPic) {
    
    this.businessLicenseAuthPic = businessLicenseAuthPic;
    return this;
  }

   /**
   * Get businessLicenseAuthPic
   * @return businessLicenseAuthPic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public File getBusinessLicenseAuthPic() {
    return businessLicenseAuthPic;
  }


  public void setBusinessLicenseAuthPic(File businessLicenseAuthPic) {
    this.businessLicenseAuthPic = businessLicenseAuthPic;
  }


  public AlipayOpenAgentCommonSignRequest businessLicensePic(File businessLicensePic) {
    
    this.businessLicensePic = businessLicensePic;
    return this;
  }

   /**
   * Get businessLicensePic
   * @return businessLicensePic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public File getBusinessLicensePic() {
    return businessLicensePic;
  }


  public void setBusinessLicensePic(File businessLicensePic) {
    this.businessLicensePic = businessLicensePic;
  }


  public AlipayOpenAgentCommonSignRequest data(AlipayOpenAgentCommonSignModel data) {
    
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public AlipayOpenAgentCommonSignModel getData() {
    return data;
  }


  public void setData(AlipayOpenAgentCommonSignModel data) {
    this.data = data;
  }


  public AlipayOpenAgentCommonSignRequest shopScenePic(File shopScenePic) {
    
    this.shopScenePic = shopScenePic;
    return this;
  }

   /**
   * Get shopScenePic
   * @return shopScenePic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public File getShopScenePic() {
    return shopScenePic;
  }


  public void setShopScenePic(File shopScenePic) {
    this.shopScenePic = shopScenePic;
  }


  public AlipayOpenAgentCommonSignRequest shopSignBoardPic(File shopSignBoardPic) {
    
    this.shopSignBoardPic = shopSignBoardPic;
    return this;
  }

   /**
   * Get shopSignBoardPic
   * @return shopSignBoardPic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public File getShopSignBoardPic() {
    return shopSignBoardPic;
  }


  public void setShopSignBoardPic(File shopSignBoardPic) {
    this.shopSignBoardPic = shopSignBoardPic;
  }


  public AlipayOpenAgentCommonSignRequest specialLicensePic(File specialLicensePic) {
    
    this.specialLicensePic = specialLicensePic;
    return this;
  }

   /**
   * Get specialLicensePic
   * @return specialLicensePic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public File getSpecialLicensePic() {
    return specialLicensePic;
  }


  public void setSpecialLicensePic(File specialLicensePic) {
    this.specialLicensePic = specialLicensePic;
  }


  public AlipayOpenAgentCommonSignRequest webHomeScreenshot(File webHomeScreenshot) {
    
    this.webHomeScreenshot = webHomeScreenshot;
    return this;
  }

   /**
   * Get webHomeScreenshot
   * @return webHomeScreenshot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public File getWebHomeScreenshot() {
    return webHomeScreenshot;
  }


  public void setWebHomeScreenshot(File webHomeScreenshot) {
    this.webHomeScreenshot = webHomeScreenshot;
  }


  public AlipayOpenAgentCommonSignRequest webItemScreenshot(File webItemScreenshot) {
    
    this.webItemScreenshot = webItemScreenshot;
    return this;
  }

   /**
   * Get webItemScreenshot
   * @return webItemScreenshot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public File getWebItemScreenshot() {
    return webItemScreenshot;
  }


  public void setWebItemScreenshot(File webItemScreenshot) {
    this.webItemScreenshot = webItemScreenshot;
  }


  public AlipayOpenAgentCommonSignRequest webPayScreenshot(File webPayScreenshot) {
    
    this.webPayScreenshot = webPayScreenshot;
    return this;
  }

   /**
   * Get webPayScreenshot
   * @return webPayScreenshot
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public File getWebPayScreenshot() {
    return webPayScreenshot;
  }


  public void setWebPayScreenshot(File webPayScreenshot) {
    this.webPayScreenshot = webPayScreenshot;
  }


  public AlipayOpenAgentCommonSignRequest webSitesLoa(File webSitesLoa) {
    
    this.webSitesLoa = webSitesLoa;
    return this;
  }

   /**
   * Get webSitesLoa
   * @return webSitesLoa
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public File getWebSitesLoa() {
    return webSitesLoa;
  }


  public void setWebSitesLoa(File webSitesLoa) {
    this.webSitesLoa = webSitesLoa;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenAgentCommonSignRequest alipayOpenAgentCommonSignRequest = (AlipayOpenAgentCommonSignRequest) o;
    return Objects.equals(this.appDemo, alipayOpenAgentCommonSignRequest.appDemo) &&
        Objects.equals(this.businessLicenseAuthPic, alipayOpenAgentCommonSignRequest.businessLicenseAuthPic) &&
        Objects.equals(this.businessLicensePic, alipayOpenAgentCommonSignRequest.businessLicensePic) &&
        Objects.equals(this.data, alipayOpenAgentCommonSignRequest.data) &&
        Objects.equals(this.shopScenePic, alipayOpenAgentCommonSignRequest.shopScenePic) &&
        Objects.equals(this.shopSignBoardPic, alipayOpenAgentCommonSignRequest.shopSignBoardPic) &&
        Objects.equals(this.specialLicensePic, alipayOpenAgentCommonSignRequest.specialLicensePic) &&
        Objects.equals(this.webHomeScreenshot, alipayOpenAgentCommonSignRequest.webHomeScreenshot) &&
        Objects.equals(this.webItemScreenshot, alipayOpenAgentCommonSignRequest.webItemScreenshot) &&
        Objects.equals(this.webPayScreenshot, alipayOpenAgentCommonSignRequest.webPayScreenshot) &&
        Objects.equals(this.webSitesLoa, alipayOpenAgentCommonSignRequest.webSitesLoa);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appDemo, businessLicenseAuthPic, businessLicensePic, data, shopScenePic, shopSignBoardPic, specialLicensePic, webHomeScreenshot, webItemScreenshot, webPayScreenshot, webSitesLoa);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenAgentCommonSignRequest {\n");
    sb.append("    appDemo: ").append(toIndentedString(appDemo)).append("\n");
    sb.append("    businessLicenseAuthPic: ").append(toIndentedString(businessLicenseAuthPic)).append("\n");
    sb.append("    businessLicensePic: ").append(toIndentedString(businessLicensePic)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    shopScenePic: ").append(toIndentedString(shopScenePic)).append("\n");
    sb.append("    shopSignBoardPic: ").append(toIndentedString(shopSignBoardPic)).append("\n");
    sb.append("    specialLicensePic: ").append(toIndentedString(specialLicensePic)).append("\n");
    sb.append("    webHomeScreenshot: ").append(toIndentedString(webHomeScreenshot)).append("\n");
    sb.append("    webItemScreenshot: ").append(toIndentedString(webItemScreenshot)).append("\n");
    sb.append("    webPayScreenshot: ").append(toIndentedString(webPayScreenshot)).append("\n");
    sb.append("    webSitesLoa: ").append(toIndentedString(webSitesLoa)).append("\n");
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
    openapiFields.add("app_demo");
    openapiFields.add("business_license_auth_pic");
    openapiFields.add("business_license_pic");
    openapiFields.add("data");
    openapiFields.add("shop_scene_pic");
    openapiFields.add("shop_sign_board_pic");
    openapiFields.add("special_license_pic");
    openapiFields.add("web_home_screenshot");
    openapiFields.add("web_item_screenshot");
    openapiFields.add("web_pay_screenshot");
    openapiFields.add("web_sites_loa");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenAgentCommonSignRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenAgentCommonSignRequest.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenAgentCommonSignRequest is not found in the empty JSON string", AlipayOpenAgentCommonSignRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenAgentCommonSignRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenAgentCommonSignRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `data`
      if (jsonObj.getAsJsonObject("data") != null) {
        AlipayOpenAgentCommonSignModel.validateJsonObject(jsonObj.getAsJsonObject("data"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenAgentCommonSignRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenAgentCommonSignRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenAgentCommonSignRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenAgentCommonSignRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenAgentCommonSignRequest>() {
           @Override
           public void write(JsonWriter out, AlipayOpenAgentCommonSignRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenAgentCommonSignRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenAgentCommonSignRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenAgentCommonSignRequest
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenAgentCommonSignRequest
  */
  public static AlipayOpenAgentCommonSignRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenAgentCommonSignRequest.class);
  }

 /**
  * Convert an instance of AlipayOpenAgentCommonSignRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

