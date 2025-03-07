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
import com.alipay.v3.model.ShopCategoryConfigInfo;
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
 * AlipayOfflineMarketShopCategoryQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOfflineMarketShopCategoryQueryResponseModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_SHOP_CATEGORY_CONFIG_INFOS = "shop_category_config_infos";
  @SerializedName(SERIALIZED_NAME_SHOP_CATEGORY_CONFIG_INFOS)
  private List<ShopCategoryConfigInfo> shopCategoryConfigInfos = null;

  public AlipayOfflineMarketShopCategoryQueryResponseModel() { 
  }

  public AlipayOfflineMarketShopCategoryQueryResponseModel shopCategoryConfigInfos(List<ShopCategoryConfigInfo> shopCategoryConfigInfos) {
    
    this.shopCategoryConfigInfos = shopCategoryConfigInfos;
    return this;
  }

  public AlipayOfflineMarketShopCategoryQueryResponseModel addShopCategoryConfigInfosItem(ShopCategoryConfigInfo shopCategoryConfigInfosItem) {
    if (this.shopCategoryConfigInfos == null) {
      this.shopCategoryConfigInfos = new ArrayList<>();
    }
    this.shopCategoryConfigInfos.add(shopCategoryConfigInfosItem);
    return this;
  }

   /**
   * 门店类目配置信息，包括能够开店的叶子节点类目信息，以及类目约束配置信息。
   * @return shopCategoryConfigInfos
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "门店类目配置信息，包括能够开店的叶子节点类目信息，以及类目约束配置信息。")

  public List<ShopCategoryConfigInfo> getShopCategoryConfigInfos() {
    return shopCategoryConfigInfos;
  }


  public void setShopCategoryConfigInfos(List<ShopCategoryConfigInfo> shopCategoryConfigInfos) {
    this.shopCategoryConfigInfos = shopCategoryConfigInfos;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOfflineMarketShopCategoryQueryResponseModel alipayOfflineMarketShopCategoryQueryResponseModel = (AlipayOfflineMarketShopCategoryQueryResponseModel) o;
    return Objects.equals(this.shopCategoryConfigInfos, alipayOfflineMarketShopCategoryQueryResponseModel.shopCategoryConfigInfos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shopCategoryConfigInfos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOfflineMarketShopCategoryQueryResponseModel {\n");
    sb.append("    shopCategoryConfigInfos: ").append(toIndentedString(shopCategoryConfigInfos)).append("\n");
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
    openapiFields.add("shop_category_config_infos");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOfflineMarketShopCategoryQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOfflineMarketShopCategoryQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOfflineMarketShopCategoryQueryResponseModel is not found in the empty JSON string", AlipayOfflineMarketShopCategoryQueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOfflineMarketShopCategoryQueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOfflineMarketShopCategoryQueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayshopCategoryConfigInfos = jsonObj.getAsJsonArray("shop_category_config_infos");
      if (jsonArrayshopCategoryConfigInfos != null) {
        // ensure the json data is an array
        if (!jsonObj.get("shop_category_config_infos").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `shop_category_config_infos` to be an array in the JSON string but got `%s`", jsonObj.get("shop_category_config_infos").toString()));
        }

        // validate the optional field `shop_category_config_infos` (array)
        for (int i = 0; i < jsonArrayshopCategoryConfigInfos.size(); i++) {
          ShopCategoryConfigInfo.validateJsonObject(jsonArrayshopCategoryConfigInfos.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOfflineMarketShopCategoryQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOfflineMarketShopCategoryQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOfflineMarketShopCategoryQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOfflineMarketShopCategoryQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOfflineMarketShopCategoryQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayOfflineMarketShopCategoryQueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOfflineMarketShopCategoryQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOfflineMarketShopCategoryQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOfflineMarketShopCategoryQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOfflineMarketShopCategoryQueryResponseModel
  */
  public static AlipayOfflineMarketShopCategoryQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOfflineMarketShopCategoryQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayOfflineMarketShopCategoryQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

