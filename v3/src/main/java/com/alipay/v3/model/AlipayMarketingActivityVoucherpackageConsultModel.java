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
 * AlipayMarketingActivityVoucherpackageConsultModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayMarketingActivityVoucherpackageConsultModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_VOUCHER_PACKAGE_ID_LIST = "voucher_package_id_list";
  @SerializedName(SERIALIZED_NAME_VOUCHER_PACKAGE_ID_LIST)
  private List<String> voucherPackageIdList = null;

  public AlipayMarketingActivityVoucherpackageConsultModel() { 
  }

  public AlipayMarketingActivityVoucherpackageConsultModel voucherPackageIdList(List<String> voucherPackageIdList) {
    
    this.voucherPackageIdList = voucherPackageIdList;
    return this;
  }

  public AlipayMarketingActivityVoucherpackageConsultModel addVoucherPackageIdListItem(String voucherPackageIdListItem) {
    if (this.voucherPackageIdList == null) {
      this.voucherPackageIdList = new ArrayList<>();
    }
    this.voucherPackageIdList.add(voucherPackageIdListItem);
    return this;
  }

   /**
   * 券包id列表
   * @return voucherPackageIdList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"IP20220628016671405804297103167741\"]", value = "券包id列表")

  public List<String> getVoucherPackageIdList() {
    return voucherPackageIdList;
  }


  public void setVoucherPackageIdList(List<String> voucherPackageIdList) {
    this.voucherPackageIdList = voucherPackageIdList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayMarketingActivityVoucherpackageConsultModel alipayMarketingActivityVoucherpackageConsultModel = (AlipayMarketingActivityVoucherpackageConsultModel) o;
    return Objects.equals(this.voucherPackageIdList, alipayMarketingActivityVoucherpackageConsultModel.voucherPackageIdList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(voucherPackageIdList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayMarketingActivityVoucherpackageConsultModel {\n");
    sb.append("    voucherPackageIdList: ").append(toIndentedString(voucherPackageIdList)).append("\n");
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
    openapiFields.add("voucher_package_id_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayMarketingActivityVoucherpackageConsultModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayMarketingActivityVoucherpackageConsultModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayMarketingActivityVoucherpackageConsultModel is not found in the empty JSON string", AlipayMarketingActivityVoucherpackageConsultModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayMarketingActivityVoucherpackageConsultModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayMarketingActivityVoucherpackageConsultModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("voucher_package_id_list") != null && !jsonObj.get("voucher_package_id_list").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `voucher_package_id_list` to be an array in the JSON string but got `%s`", jsonObj.get("voucher_package_id_list").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayMarketingActivityVoucherpackageConsultModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayMarketingActivityVoucherpackageConsultModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayMarketingActivityVoucherpackageConsultModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayMarketingActivityVoucherpackageConsultModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayMarketingActivityVoucherpackageConsultModel>() {
           @Override
           public void write(JsonWriter out, AlipayMarketingActivityVoucherpackageConsultModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayMarketingActivityVoucherpackageConsultModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayMarketingActivityVoucherpackageConsultModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayMarketingActivityVoucherpackageConsultModel
  * @throws IOException if the JSON string is invalid with respect to AlipayMarketingActivityVoucherpackageConsultModel
  */
  public static AlipayMarketingActivityVoucherpackageConsultModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayMarketingActivityVoucherpackageConsultModel.class);
  }

 /**
  * Convert an instance of AlipayMarketingActivityVoucherpackageConsultModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

