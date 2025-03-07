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
import com.alipay.v3.model.SpiResult;
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
 * AlipayIserviceCcmServiceInitializeResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayIserviceCcmServiceInitializeResponseModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_SPI_IDS = "spi_ids";
  @SerializedName(SERIALIZED_NAME_SPI_IDS)
  private List<SpiResult> spiIds = null;

  public AlipayIserviceCcmServiceInitializeResponseModel() { 
  }

  public AlipayIserviceCcmServiceInitializeResponseModel spiIds(List<SpiResult> spiIds) {
    
    this.spiIds = spiIds;
    return this;
  }

  public AlipayIserviceCcmServiceInitializeResponseModel addSpiIdsItem(SpiResult spiIdsItem) {
    if (this.spiIds == null) {
      this.spiIds = new ArrayList<>();
    }
    this.spiIds.add(spiIdsItem);
    return this;
  }

   /**
   * spi在ccm中的唯一标识，与biz_code一一对应
   * @return spiIds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "spi在ccm中的唯一标识，与biz_code一一对应")

  public List<SpiResult> getSpiIds() {
    return spiIds;
  }


  public void setSpiIds(List<SpiResult> spiIds) {
    this.spiIds = spiIds;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayIserviceCcmServiceInitializeResponseModel alipayIserviceCcmServiceInitializeResponseModel = (AlipayIserviceCcmServiceInitializeResponseModel) o;
    return Objects.equals(this.spiIds, alipayIserviceCcmServiceInitializeResponseModel.spiIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(spiIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayIserviceCcmServiceInitializeResponseModel {\n");
    sb.append("    spiIds: ").append(toIndentedString(spiIds)).append("\n");
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
    openapiFields.add("spi_ids");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayIserviceCcmServiceInitializeResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayIserviceCcmServiceInitializeResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayIserviceCcmServiceInitializeResponseModel is not found in the empty JSON string", AlipayIserviceCcmServiceInitializeResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayIserviceCcmServiceInitializeResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayIserviceCcmServiceInitializeResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayspiIds = jsonObj.getAsJsonArray("spi_ids");
      if (jsonArrayspiIds != null) {
        // ensure the json data is an array
        if (!jsonObj.get("spi_ids").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `spi_ids` to be an array in the JSON string but got `%s`", jsonObj.get("spi_ids").toString()));
        }

        // validate the optional field `spi_ids` (array)
        for (int i = 0; i < jsonArrayspiIds.size(); i++) {
          SpiResult.validateJsonObject(jsonArrayspiIds.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayIserviceCcmServiceInitializeResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayIserviceCcmServiceInitializeResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayIserviceCcmServiceInitializeResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayIserviceCcmServiceInitializeResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayIserviceCcmServiceInitializeResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayIserviceCcmServiceInitializeResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayIserviceCcmServiceInitializeResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayIserviceCcmServiceInitializeResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayIserviceCcmServiceInitializeResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayIserviceCcmServiceInitializeResponseModel
  */
  public static AlipayIserviceCcmServiceInitializeResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayIserviceCcmServiceInitializeResponseModel.class);
  }

 /**
  * Convert an instance of AlipayIserviceCcmServiceInitializeResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

