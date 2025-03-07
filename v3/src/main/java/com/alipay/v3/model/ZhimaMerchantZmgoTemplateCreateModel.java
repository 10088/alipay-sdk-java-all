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
import com.alipay.v3.model.ZMGOBasicConfig;
import com.alipay.v3.model.ZMGOExtConfig;
import com.alipay.v3.model.ZMGOObligationConfig;
import com.alipay.v3.model.ZMGOOpenConfig;
import com.alipay.v3.model.ZMGOQuitConfig;
import com.alipay.v3.model.ZMGORightConfig;
import com.alipay.v3.model.ZMGOSettlementConfig;
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
 * ZhimaMerchantZmgoTemplateCreateModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ZhimaMerchantZmgoTemplateCreateModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_BASIC_CONFIG = "basic_config";
  @SerializedName(SERIALIZED_NAME_BASIC_CONFIG)
  private ZMGOBasicConfig basicConfig;

  public static final String SERIALIZED_NAME_EXT_CONFIG = "ext_config";
  @SerializedName(SERIALIZED_NAME_EXT_CONFIG)
  private ZMGOExtConfig extConfig;

  public static final String SERIALIZED_NAME_OBLIGATION_CONFIG = "obligation_config";
  @SerializedName(SERIALIZED_NAME_OBLIGATION_CONFIG)
  private ZMGOObligationConfig obligationConfig;

  public static final String SERIALIZED_NAME_OPEN_CONFIG = "open_config";
  @SerializedName(SERIALIZED_NAME_OPEN_CONFIG)
  private ZMGOOpenConfig openConfig;

  public static final String SERIALIZED_NAME_QUIT_CONFIG = "quit_config";
  @SerializedName(SERIALIZED_NAME_QUIT_CONFIG)
  private ZMGOQuitConfig quitConfig;

  public static final String SERIALIZED_NAME_RIGHT_CONFIG = "right_config";
  @SerializedName(SERIALIZED_NAME_RIGHT_CONFIG)
  private ZMGORightConfig rightConfig;

  public static final String SERIALIZED_NAME_SETTLEMENT_CONFIG = "settlement_config";
  @SerializedName(SERIALIZED_NAME_SETTLEMENT_CONFIG)
  private ZMGOSettlementConfig settlementConfig;

  public ZhimaMerchantZmgoTemplateCreateModel() { 
  }

  public ZhimaMerchantZmgoTemplateCreateModel basicConfig(ZMGOBasicConfig basicConfig) {
    
    this.basicConfig = basicConfig;
    return this;
  }

   /**
   * Get basicConfig
   * @return basicConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ZMGOBasicConfig getBasicConfig() {
    return basicConfig;
  }


  public void setBasicConfig(ZMGOBasicConfig basicConfig) {
    this.basicConfig = basicConfig;
  }


  public ZhimaMerchantZmgoTemplateCreateModel extConfig(ZMGOExtConfig extConfig) {
    
    this.extConfig = extConfig;
    return this;
  }

   /**
   * Get extConfig
   * @return extConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ZMGOExtConfig getExtConfig() {
    return extConfig;
  }


  public void setExtConfig(ZMGOExtConfig extConfig) {
    this.extConfig = extConfig;
  }


  public ZhimaMerchantZmgoTemplateCreateModel obligationConfig(ZMGOObligationConfig obligationConfig) {
    
    this.obligationConfig = obligationConfig;
    return this;
  }

   /**
   * Get obligationConfig
   * @return obligationConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ZMGOObligationConfig getObligationConfig() {
    return obligationConfig;
  }


  public void setObligationConfig(ZMGOObligationConfig obligationConfig) {
    this.obligationConfig = obligationConfig;
  }


  public ZhimaMerchantZmgoTemplateCreateModel openConfig(ZMGOOpenConfig openConfig) {
    
    this.openConfig = openConfig;
    return this;
  }

   /**
   * Get openConfig
   * @return openConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ZMGOOpenConfig getOpenConfig() {
    return openConfig;
  }


  public void setOpenConfig(ZMGOOpenConfig openConfig) {
    this.openConfig = openConfig;
  }


  public ZhimaMerchantZmgoTemplateCreateModel quitConfig(ZMGOQuitConfig quitConfig) {
    
    this.quitConfig = quitConfig;
    return this;
  }

   /**
   * Get quitConfig
   * @return quitConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ZMGOQuitConfig getQuitConfig() {
    return quitConfig;
  }


  public void setQuitConfig(ZMGOQuitConfig quitConfig) {
    this.quitConfig = quitConfig;
  }


  public ZhimaMerchantZmgoTemplateCreateModel rightConfig(ZMGORightConfig rightConfig) {
    
    this.rightConfig = rightConfig;
    return this;
  }

   /**
   * Get rightConfig
   * @return rightConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ZMGORightConfig getRightConfig() {
    return rightConfig;
  }


  public void setRightConfig(ZMGORightConfig rightConfig) {
    this.rightConfig = rightConfig;
  }


  public ZhimaMerchantZmgoTemplateCreateModel settlementConfig(ZMGOSettlementConfig settlementConfig) {
    
    this.settlementConfig = settlementConfig;
    return this;
  }

   /**
   * Get settlementConfig
   * @return settlementConfig
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ZMGOSettlementConfig getSettlementConfig() {
    return settlementConfig;
  }


  public void setSettlementConfig(ZMGOSettlementConfig settlementConfig) {
    this.settlementConfig = settlementConfig;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZhimaMerchantZmgoTemplateCreateModel zhimaMerchantZmgoTemplateCreateModel = (ZhimaMerchantZmgoTemplateCreateModel) o;
    return Objects.equals(this.basicConfig, zhimaMerchantZmgoTemplateCreateModel.basicConfig) &&
        Objects.equals(this.extConfig, zhimaMerchantZmgoTemplateCreateModel.extConfig) &&
        Objects.equals(this.obligationConfig, zhimaMerchantZmgoTemplateCreateModel.obligationConfig) &&
        Objects.equals(this.openConfig, zhimaMerchantZmgoTemplateCreateModel.openConfig) &&
        Objects.equals(this.quitConfig, zhimaMerchantZmgoTemplateCreateModel.quitConfig) &&
        Objects.equals(this.rightConfig, zhimaMerchantZmgoTemplateCreateModel.rightConfig) &&
        Objects.equals(this.settlementConfig, zhimaMerchantZmgoTemplateCreateModel.settlementConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(basicConfig, extConfig, obligationConfig, openConfig, quitConfig, rightConfig, settlementConfig);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZhimaMerchantZmgoTemplateCreateModel {\n");
    sb.append("    basicConfig: ").append(toIndentedString(basicConfig)).append("\n");
    sb.append("    extConfig: ").append(toIndentedString(extConfig)).append("\n");
    sb.append("    obligationConfig: ").append(toIndentedString(obligationConfig)).append("\n");
    sb.append("    openConfig: ").append(toIndentedString(openConfig)).append("\n");
    sb.append("    quitConfig: ").append(toIndentedString(quitConfig)).append("\n");
    sb.append("    rightConfig: ").append(toIndentedString(rightConfig)).append("\n");
    sb.append("    settlementConfig: ").append(toIndentedString(settlementConfig)).append("\n");
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
    openapiFields.add("basic_config");
    openapiFields.add("ext_config");
    openapiFields.add("obligation_config");
    openapiFields.add("open_config");
    openapiFields.add("quit_config");
    openapiFields.add("right_config");
    openapiFields.add("settlement_config");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ZhimaMerchantZmgoTemplateCreateModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ZhimaMerchantZmgoTemplateCreateModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ZhimaMerchantZmgoTemplateCreateModel is not found in the empty JSON string", ZhimaMerchantZmgoTemplateCreateModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ZhimaMerchantZmgoTemplateCreateModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ZhimaMerchantZmgoTemplateCreateModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `basic_config`
      if (jsonObj.getAsJsonObject("basic_config") != null) {
        ZMGOBasicConfig.validateJsonObject(jsonObj.getAsJsonObject("basic_config"));
      }
      // validate the optional field `ext_config`
      if (jsonObj.getAsJsonObject("ext_config") != null) {
        ZMGOExtConfig.validateJsonObject(jsonObj.getAsJsonObject("ext_config"));
      }
      // validate the optional field `obligation_config`
      if (jsonObj.getAsJsonObject("obligation_config") != null) {
        ZMGOObligationConfig.validateJsonObject(jsonObj.getAsJsonObject("obligation_config"));
      }
      // validate the optional field `open_config`
      if (jsonObj.getAsJsonObject("open_config") != null) {
        ZMGOOpenConfig.validateJsonObject(jsonObj.getAsJsonObject("open_config"));
      }
      // validate the optional field `quit_config`
      if (jsonObj.getAsJsonObject("quit_config") != null) {
        ZMGOQuitConfig.validateJsonObject(jsonObj.getAsJsonObject("quit_config"));
      }
      // validate the optional field `right_config`
      if (jsonObj.getAsJsonObject("right_config") != null) {
        ZMGORightConfig.validateJsonObject(jsonObj.getAsJsonObject("right_config"));
      }
      // validate the optional field `settlement_config`
      if (jsonObj.getAsJsonObject("settlement_config") != null) {
        ZMGOSettlementConfig.validateJsonObject(jsonObj.getAsJsonObject("settlement_config"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ZhimaMerchantZmgoTemplateCreateModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ZhimaMerchantZmgoTemplateCreateModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ZhimaMerchantZmgoTemplateCreateModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ZhimaMerchantZmgoTemplateCreateModel.class));

       return (TypeAdapter<T>) new TypeAdapter<ZhimaMerchantZmgoTemplateCreateModel>() {
           @Override
           public void write(JsonWriter out, ZhimaMerchantZmgoTemplateCreateModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ZhimaMerchantZmgoTemplateCreateModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ZhimaMerchantZmgoTemplateCreateModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ZhimaMerchantZmgoTemplateCreateModel
  * @throws IOException if the JSON string is invalid with respect to ZhimaMerchantZmgoTemplateCreateModel
  */
  public static ZhimaMerchantZmgoTemplateCreateModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ZhimaMerchantZmgoTemplateCreateModel.class);
  }

 /**
  * Convert an instance of ZhimaMerchantZmgoTemplateCreateModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

