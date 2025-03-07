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
 * AlipayOpenAgentSignstatusQueryModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenAgentSignstatusQueryModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_PID = "pid";
  @SerializedName(SERIALIZED_NAME_PID)
  private String pid;

  public static final String SERIALIZED_NAME_PRODUCT_CODES = "product_codes";
  @SerializedName(SERIALIZED_NAME_PRODUCT_CODES)
  private List<String> productCodes = null;

  public AlipayOpenAgentSignstatusQueryModel() { 
  }

  public AlipayOpenAgentSignstatusQueryModel pid(String pid) {
    
    this.pid = pid;
    return this;
  }

   /**
   * isv要查询签约状态的商户账号，可以是支付宝账号pid（2088开头），也可以是商户的登录账号（邮箱或手机号）
   * @return pid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "支付宝账号：2088123451234543或手机号：13811111111或邮箱：123@xxx.com", value = "isv要查询签约状态的商户账号，可以是支付宝账号pid（2088开头），也可以是商户的登录账号（邮箱或手机号）")

  public String getPid() {
    return pid;
  }


  public void setPid(String pid) {
    this.pid = pid;
  }


  public AlipayOpenAgentSignstatusQueryModel productCodes(List<String> productCodes) {
    
    this.productCodes = productCodes;
    return this;
  }

  public AlipayOpenAgentSignstatusQueryModel addProductCodesItem(String productCodesItem) {
    if (this.productCodes == null) {
      this.productCodes = new ArrayList<>();
    }
    this.productCodes.add(productCodesItem);
    return this;
  }

   /**
   * isv要查询商户签约状态的产品码，产品码是支付宝内部对产品的唯一标识。目前支持查询产品及产品码详情参见 https://opendocs.alipay.com/isv/01cv77#%E8%83%BD%E5%8A%9B%E4%BA%A7%E5%93%81%E7%A0%81 。 
   * @return productCodes
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "I1011000100000000001", value = "isv要查询商户签约状态的产品码，产品码是支付宝内部对产品的唯一标识。目前支持查询产品及产品码详情参见 https://opendocs.alipay.com/isv/01cv77#%E8%83%BD%E5%8A%9B%E4%BA%A7%E5%93%81%E7%A0%81 。 ")

  public List<String> getProductCodes() {
    return productCodes;
  }


  public void setProductCodes(List<String> productCodes) {
    this.productCodes = productCodes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenAgentSignstatusQueryModel alipayOpenAgentSignstatusQueryModel = (AlipayOpenAgentSignstatusQueryModel) o;
    return Objects.equals(this.pid, alipayOpenAgentSignstatusQueryModel.pid) &&
        Objects.equals(this.productCodes, alipayOpenAgentSignstatusQueryModel.productCodes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pid, productCodes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenAgentSignstatusQueryModel {\n");
    sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
    sb.append("    productCodes: ").append(toIndentedString(productCodes)).append("\n");
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
    openapiFields.add("pid");
    openapiFields.add("product_codes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenAgentSignstatusQueryModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenAgentSignstatusQueryModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenAgentSignstatusQueryModel is not found in the empty JSON string", AlipayOpenAgentSignstatusQueryModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenAgentSignstatusQueryModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenAgentSignstatusQueryModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("pid") != null && !jsonObj.get("pid").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pid` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pid").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("product_codes") != null && !jsonObj.get("product_codes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `product_codes` to be an array in the JSON string but got `%s`", jsonObj.get("product_codes").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenAgentSignstatusQueryModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenAgentSignstatusQueryModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenAgentSignstatusQueryModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenAgentSignstatusQueryModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenAgentSignstatusQueryModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenAgentSignstatusQueryModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenAgentSignstatusQueryModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenAgentSignstatusQueryModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenAgentSignstatusQueryModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenAgentSignstatusQueryModel
  */
  public static AlipayOpenAgentSignstatusQueryModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenAgentSignstatusQueryModel.class);
  }

 /**
  * Convert an instance of AlipayOpenAgentSignstatusQueryModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

