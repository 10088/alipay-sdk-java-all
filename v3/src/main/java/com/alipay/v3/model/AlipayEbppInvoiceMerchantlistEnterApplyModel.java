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
import com.alipay.v3.model.MerchantBaseEnterOpenModel;
import com.alipay.v3.model.SubMerchantCommonEnterOpenModel;
import com.alipay.v3.model.SubMerchantEnterOpenModel;
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
 * AlipayEbppInvoiceMerchantlistEnterApplyModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayEbppInvoiceMerchantlistEnterApplyModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_MERCHANT_BASE = "merchant_base";
  @SerializedName(SERIALIZED_NAME_MERCHANT_BASE)
  private MerchantBaseEnterOpenModel merchantBase;

  public static final String SERIALIZED_NAME_SUB_MERCHANT_COMMON_INFO = "sub_merchant_common_info";
  @SerializedName(SERIALIZED_NAME_SUB_MERCHANT_COMMON_INFO)
  private SubMerchantCommonEnterOpenModel subMerchantCommonInfo;

  public static final String SERIALIZED_NAME_SUB_MERCHANT_LIST = "sub_merchant_list";
  @SerializedName(SERIALIZED_NAME_SUB_MERCHANT_LIST)
  private List<SubMerchantEnterOpenModel> subMerchantList = null;

  public AlipayEbppInvoiceMerchantlistEnterApplyModel() { 
  }

  public AlipayEbppInvoiceMerchantlistEnterApplyModel merchantBase(MerchantBaseEnterOpenModel merchantBase) {
    
    this.merchantBase = merchantBase;
    return this;
  }

   /**
   * Get merchantBase
   * @return merchantBase
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public MerchantBaseEnterOpenModel getMerchantBase() {
    return merchantBase;
  }


  public void setMerchantBase(MerchantBaseEnterOpenModel merchantBase) {
    this.merchantBase = merchantBase;
  }


  public AlipayEbppInvoiceMerchantlistEnterApplyModel subMerchantCommonInfo(SubMerchantCommonEnterOpenModel subMerchantCommonInfo) {
    
    this.subMerchantCommonInfo = subMerchantCommonInfo;
    return this;
  }

   /**
   * Get subMerchantCommonInfo
   * @return subMerchantCommonInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public SubMerchantCommonEnterOpenModel getSubMerchantCommonInfo() {
    return subMerchantCommonInfo;
  }


  public void setSubMerchantCommonInfo(SubMerchantCommonEnterOpenModel subMerchantCommonInfo) {
    this.subMerchantCommonInfo = subMerchantCommonInfo;
  }


  public AlipayEbppInvoiceMerchantlistEnterApplyModel subMerchantList(List<SubMerchantEnterOpenModel> subMerchantList) {
    
    this.subMerchantList = subMerchantList;
    return this;
  }

  public AlipayEbppInvoiceMerchantlistEnterApplyModel addSubMerchantListItem(SubMerchantEnterOpenModel subMerchantListItem) {
    if (this.subMerchantList == null) {
      this.subMerchantList = new ArrayList<>();
    }
    this.subMerchantList.add(subMerchantListItem);
    return this;
  }

   /**
   * 商户门店列表信息，最多传入30个门店信息
   * @return subMerchantList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商户门店列表信息，最多传入30个门店信息")

  public List<SubMerchantEnterOpenModel> getSubMerchantList() {
    return subMerchantList;
  }


  public void setSubMerchantList(List<SubMerchantEnterOpenModel> subMerchantList) {
    this.subMerchantList = subMerchantList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayEbppInvoiceMerchantlistEnterApplyModel alipayEbppInvoiceMerchantlistEnterApplyModel = (AlipayEbppInvoiceMerchantlistEnterApplyModel) o;
    return Objects.equals(this.merchantBase, alipayEbppInvoiceMerchantlistEnterApplyModel.merchantBase) &&
        Objects.equals(this.subMerchantCommonInfo, alipayEbppInvoiceMerchantlistEnterApplyModel.subMerchantCommonInfo) &&
        Objects.equals(this.subMerchantList, alipayEbppInvoiceMerchantlistEnterApplyModel.subMerchantList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantBase, subMerchantCommonInfo, subMerchantList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayEbppInvoiceMerchantlistEnterApplyModel {\n");
    sb.append("    merchantBase: ").append(toIndentedString(merchantBase)).append("\n");
    sb.append("    subMerchantCommonInfo: ").append(toIndentedString(subMerchantCommonInfo)).append("\n");
    sb.append("    subMerchantList: ").append(toIndentedString(subMerchantList)).append("\n");
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
    openapiFields.add("merchant_base");
    openapiFields.add("sub_merchant_common_info");
    openapiFields.add("sub_merchant_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayEbppInvoiceMerchantlistEnterApplyModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayEbppInvoiceMerchantlistEnterApplyModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayEbppInvoiceMerchantlistEnterApplyModel is not found in the empty JSON string", AlipayEbppInvoiceMerchantlistEnterApplyModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayEbppInvoiceMerchantlistEnterApplyModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayEbppInvoiceMerchantlistEnterApplyModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `merchant_base`
      if (jsonObj.getAsJsonObject("merchant_base") != null) {
        MerchantBaseEnterOpenModel.validateJsonObject(jsonObj.getAsJsonObject("merchant_base"));
      }
      // validate the optional field `sub_merchant_common_info`
      if (jsonObj.getAsJsonObject("sub_merchant_common_info") != null) {
        SubMerchantCommonEnterOpenModel.validateJsonObject(jsonObj.getAsJsonObject("sub_merchant_common_info"));
      }
      JsonArray jsonArraysubMerchantList = jsonObj.getAsJsonArray("sub_merchant_list");
      if (jsonArraysubMerchantList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("sub_merchant_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `sub_merchant_list` to be an array in the JSON string but got `%s`", jsonObj.get("sub_merchant_list").toString()));
        }

        // validate the optional field `sub_merchant_list` (array)
        for (int i = 0; i < jsonArraysubMerchantList.size(); i++) {
          SubMerchantEnterOpenModel.validateJsonObject(jsonArraysubMerchantList.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayEbppInvoiceMerchantlistEnterApplyModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayEbppInvoiceMerchantlistEnterApplyModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayEbppInvoiceMerchantlistEnterApplyModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayEbppInvoiceMerchantlistEnterApplyModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayEbppInvoiceMerchantlistEnterApplyModel>() {
           @Override
           public void write(JsonWriter out, AlipayEbppInvoiceMerchantlistEnterApplyModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayEbppInvoiceMerchantlistEnterApplyModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayEbppInvoiceMerchantlistEnterApplyModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayEbppInvoiceMerchantlistEnterApplyModel
  * @throws IOException if the JSON string is invalid with respect to AlipayEbppInvoiceMerchantlistEnterApplyModel
  */
  public static AlipayEbppInvoiceMerchantlistEnterApplyModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayEbppInvoiceMerchantlistEnterApplyModel.class);
  }

 /**
  * Convert an instance of AlipayEbppInvoiceMerchantlistEnterApplyModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

