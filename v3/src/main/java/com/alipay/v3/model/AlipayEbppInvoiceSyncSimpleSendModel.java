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
import com.alipay.v3.model.InvoicePDFSynModel;
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
 * AlipayEbppInvoiceSyncSimpleSendModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayEbppInvoiceSyncSimpleSendModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_INVOICE_INFO = "invoice_info";
  @SerializedName(SERIALIZED_NAME_INVOICE_INFO)
  private InvoicePDFSynModel invoiceInfo;

  public static final String SERIALIZED_NAME_M_SHORT_NAME = "m_short_name";
  @SerializedName(SERIALIZED_NAME_M_SHORT_NAME)
  private String mShortName;

  public static final String SERIALIZED_NAME_SUB_M_SHORT_NAME = "sub_m_short_name";
  @SerializedName(SERIALIZED_NAME_SUB_M_SHORT_NAME)
  private String subMShortName;

  public AlipayEbppInvoiceSyncSimpleSendModel() { 
  }

  public AlipayEbppInvoiceSyncSimpleSendModel invoiceInfo(InvoicePDFSynModel invoiceInfo) {
    
    this.invoiceInfo = invoiceInfo;
    return this;
  }

   /**
   * Get invoiceInfo
   * @return invoiceInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InvoicePDFSynModel getInvoiceInfo() {
    return invoiceInfo;
  }


  public void setInvoiceInfo(InvoicePDFSynModel invoiceInfo) {
    this.invoiceInfo = invoiceInfo;
  }


  public AlipayEbppInvoiceSyncSimpleSendModel mShortName(String mShortName) {
    
    this.mShortName = mShortName;
    return this;
  }

   /**
   * 开票商户品牌简称，与商户入驻时的品牌简称保持一致。详情参见 &lt;a href&#x3D;\&quot;https://opendocs.alipay.com/open/10691/welcome-to-lark\&quot;&gt;电子发票&lt;/a&gt;
   * @return mShortName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "XSD", value = "开票商户品牌简称，与商户入驻时的品牌简称保持一致。详情参见 <a href=\"https://opendocs.alipay.com/open/10691/welcome-to-lark\">电子发票</a>")

  public String getmShortName() {
    return mShortName;
  }


  public void setmShortName(String mShortName) {
    this.mShortName = mShortName;
  }


  public AlipayEbppInvoiceSyncSimpleSendModel subMShortName(String subMShortName) {
    
    this.subMShortName = subMShortName;
    return this;
  }

   /**
   * 开票商户门店简称，与商户入驻时的门店简称保持一致。
   * @return subMShortName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "XSD_HL", value = "开票商户门店简称，与商户入驻时的门店简称保持一致。")

  public String getSubMShortName() {
    return subMShortName;
  }


  public void setSubMShortName(String subMShortName) {
    this.subMShortName = subMShortName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayEbppInvoiceSyncSimpleSendModel alipayEbppInvoiceSyncSimpleSendModel = (AlipayEbppInvoiceSyncSimpleSendModel) o;
    return Objects.equals(this.invoiceInfo, alipayEbppInvoiceSyncSimpleSendModel.invoiceInfo) &&
        Objects.equals(this.mShortName, alipayEbppInvoiceSyncSimpleSendModel.mShortName) &&
        Objects.equals(this.subMShortName, alipayEbppInvoiceSyncSimpleSendModel.subMShortName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invoiceInfo, mShortName, subMShortName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayEbppInvoiceSyncSimpleSendModel {\n");
    sb.append("    invoiceInfo: ").append(toIndentedString(invoiceInfo)).append("\n");
    sb.append("    mShortName: ").append(toIndentedString(mShortName)).append("\n");
    sb.append("    subMShortName: ").append(toIndentedString(subMShortName)).append("\n");
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
    openapiFields.add("invoice_info");
    openapiFields.add("m_short_name");
    openapiFields.add("sub_m_short_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayEbppInvoiceSyncSimpleSendModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayEbppInvoiceSyncSimpleSendModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayEbppInvoiceSyncSimpleSendModel is not found in the empty JSON string", AlipayEbppInvoiceSyncSimpleSendModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayEbppInvoiceSyncSimpleSendModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayEbppInvoiceSyncSimpleSendModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `invoice_info`
      if (jsonObj.getAsJsonObject("invoice_info") != null) {
        InvoicePDFSynModel.validateJsonObject(jsonObj.getAsJsonObject("invoice_info"));
      }
      if (jsonObj.get("m_short_name") != null && !jsonObj.get("m_short_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `m_short_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("m_short_name").toString()));
      }
      if (jsonObj.get("sub_m_short_name") != null && !jsonObj.get("sub_m_short_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sub_m_short_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sub_m_short_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayEbppInvoiceSyncSimpleSendModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayEbppInvoiceSyncSimpleSendModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayEbppInvoiceSyncSimpleSendModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayEbppInvoiceSyncSimpleSendModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayEbppInvoiceSyncSimpleSendModel>() {
           @Override
           public void write(JsonWriter out, AlipayEbppInvoiceSyncSimpleSendModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayEbppInvoiceSyncSimpleSendModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayEbppInvoiceSyncSimpleSendModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayEbppInvoiceSyncSimpleSendModel
  * @throws IOException if the JSON string is invalid with respect to AlipayEbppInvoiceSyncSimpleSendModel
  */
  public static AlipayEbppInvoiceSyncSimpleSendModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayEbppInvoiceSyncSimpleSendModel.class);
  }

 /**
  * Convert an instance of AlipayEbppInvoiceSyncSimpleSendModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

