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
 * SpuDetail
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SpuDetail {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_BRAND = "brand";
  @SerializedName(SERIALIZED_NAME_BRAND)
  private String brand;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public static final String SERIALIZED_NAME_DIMENSION = "dimension";
  @SerializedName(SERIALIZED_NAME_DIMENSION)
  private String dimension;

  public static final String SERIALIZED_NAME_ICON = "icon";
  @SerializedName(SERIALIZED_NAME_ICON)
  private String icon;

  public static final String SERIALIZED_NAME_LINK_URL = "link_url";
  @SerializedName(SERIALIZED_NAME_LINK_URL)
  private String linkUrl;

  public static final String SERIALIZED_NAME_SPU_ID = "spu_id";
  @SerializedName(SERIALIZED_NAME_SPU_ID)
  private String spuId;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public SpuDetail() { 
  }

  public SpuDetail brand(String brand) {
    
    this.brand = brand;
    return this;
  }

   /**
   * 商品品牌
   * @return brand
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "思有为", value = "商品品牌")

  public String getBrand() {
    return brand;
  }


  public void setBrand(String brand) {
    this.brand = brand;
  }


  public SpuDetail category(String category) {
    
    this.category = category;
    return this;
  }

   /**
   * 商品类目
   * @return category
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "汽车配件", value = "商品类目")

  public String getCategory() {
    return category;
  }


  public void setCategory(String category) {
    this.category = category;
  }


  public SpuDetail dimension(String dimension) {
    
    this.dimension = dimension;
    return this;
  }

   /**
   * 商品规格
   * @return dimension
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "\"品牌\": \"思有为\", \"颜色分类\":\"黑色\",\"传感器类别\": \"24G\",\"毫米波型号\": 1001,\"最大探测距离\": \"15m\",\"是否支持到店安装\":\"是\",\"传感器数量\": \"2个\"", value = "商品规格")

  public String getDimension() {
    return dimension;
  }


  public void setDimension(String dimension) {
    this.dimension = dimension;
  }


  public SpuDetail icon(String icon) {
    
    this.icon = icon;
    return this;
  }

   /**
   * 商品图片地址
   * @return icon
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://image.baidu.com/search/detail?ct=503316480&z=0&ipn=d", value = "商品图片地址")

  public String getIcon() {
    return icon;
  }


  public void setIcon(String icon) {
    this.icon = icon;
  }


  public SpuDetail linkUrl(String linkUrl) {
    
    this.linkUrl = linkUrl;
    return this;
  }

   /**
   * 商品链接
   * @return linkUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://detail.tmall.com/item.htm?id=530187047412&ali_trackid=2:mm_26632614_0_0:1603785697_244_935652742", value = "商品链接")

  public String getLinkUrl() {
    return linkUrl;
  }


  public void setLinkUrl(String linkUrl) {
    this.linkUrl = linkUrl;
  }


  public SpuDetail spuId(String spuId) {
    
    this.spuId = spuId;
    return this;
  }

   /**
   * 商品ID
   * @return spuId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "spu001002003004005006", value = "商品ID")

  public String getSpuId() {
    return spuId;
  }


  public void setSpuId(String spuId) {
    this.spuId = spuId;
  }


  public SpuDetail title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * 商品名称
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "汽车盲点BSD并线辅助系统盲点监测变道后视镜盲区监控雷达预警", value = "商品名称")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SpuDetail spuDetail = (SpuDetail) o;
    return Objects.equals(this.brand, spuDetail.brand) &&
        Objects.equals(this.category, spuDetail.category) &&
        Objects.equals(this.dimension, spuDetail.dimension) &&
        Objects.equals(this.icon, spuDetail.icon) &&
        Objects.equals(this.linkUrl, spuDetail.linkUrl) &&
        Objects.equals(this.spuId, spuDetail.spuId) &&
        Objects.equals(this.title, spuDetail.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(brand, category, dimension, icon, linkUrl, spuId, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SpuDetail {\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    dimension: ").append(toIndentedString(dimension)).append("\n");
    sb.append("    icon: ").append(toIndentedString(icon)).append("\n");
    sb.append("    linkUrl: ").append(toIndentedString(linkUrl)).append("\n");
    sb.append("    spuId: ").append(toIndentedString(spuId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
    openapiFields.add("brand");
    openapiFields.add("category");
    openapiFields.add("dimension");
    openapiFields.add("icon");
    openapiFields.add("link_url");
    openapiFields.add("spu_id");
    openapiFields.add("title");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SpuDetail
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SpuDetail.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SpuDetail is not found in the empty JSON string", SpuDetail.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SpuDetail.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SpuDetail` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("brand") != null && !jsonObj.get("brand").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `brand` to be a primitive type in the JSON string but got `%s`", jsonObj.get("brand").toString()));
      }
      if (jsonObj.get("category") != null && !jsonObj.get("category").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `category` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category").toString()));
      }
      if (jsonObj.get("dimension") != null && !jsonObj.get("dimension").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dimension` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dimension").toString()));
      }
      if (jsonObj.get("icon") != null && !jsonObj.get("icon").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `icon` to be a primitive type in the JSON string but got `%s`", jsonObj.get("icon").toString()));
      }
      if (jsonObj.get("link_url") != null && !jsonObj.get("link_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `link_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("link_url").toString()));
      }
      if (jsonObj.get("spu_id") != null && !jsonObj.get("spu_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `spu_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("spu_id").toString()));
      }
      if (jsonObj.get("title") != null && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SpuDetail.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SpuDetail' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SpuDetail> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SpuDetail.class));

       return (TypeAdapter<T>) new TypeAdapter<SpuDetail>() {
           @Override
           public void write(JsonWriter out, SpuDetail value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SpuDetail read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SpuDetail given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SpuDetail
  * @throws IOException if the JSON string is invalid with respect to SpuDetail
  */
  public static SpuDetail fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SpuDetail.class);
  }

 /**
  * Convert an instance of SpuDetail to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

