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
import com.alipay.v3.model.ItemSkuInfo;
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
 * ItemModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ItemModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CREATOR_ID = "creator_id";
  @SerializedName(SERIALIZED_NAME_CREATOR_ID)
  private String creatorId;

  public static final String SERIALIZED_NAME_CREATOR_TYPE = "creator_type";
  @SerializedName(SERIALIZED_NAME_CREATOR_TYPE)
  private String creatorType;

  public static final String SERIALIZED_NAME_EXT_INFO = "ext_info";
  @SerializedName(SERIALIZED_NAME_EXT_INFO)
  private String extInfo;

  public static final String SERIALIZED_NAME_FRONT_CATEGORY_ID = "front_category_id";
  @SerializedName(SERIALIZED_NAME_FRONT_CATEGORY_ID)
  private String frontCategoryId;

  public static final String SERIALIZED_NAME_GMT_CREATE = "gmt_create";
  @SerializedName(SERIALIZED_NAME_GMT_CREATE)
  private String gmtCreate;

  public static final String SERIALIZED_NAME_GMT_MODIFIED = "gmt_modified";
  @SerializedName(SERIALIZED_NAME_GMT_MODIFIED)
  private String gmtModified;

  public static final String SERIALIZED_NAME_ITEM_ID = "item_id";
  @SerializedName(SERIALIZED_NAME_ITEM_ID)
  private String itemId;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SKU_LIST = "sku_list";
  @SerializedName(SERIALIZED_NAME_SKU_LIST)
  private List<ItemSkuInfo> skuList = null;

  public static final String SERIALIZED_NAME_SORT = "sort";
  @SerializedName(SERIALIZED_NAME_SORT)
  private Integer sort;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_TARGET_ID = "target_id";
  @SerializedName(SERIALIZED_NAME_TARGET_ID)
  private String targetId;

  public static final String SERIALIZED_NAME_TARGET_TYPE = "target_type";
  @SerializedName(SERIALIZED_NAME_TARGET_TYPE)
  private String targetType;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public ItemModel() { 
  }

  public ItemModel creatorId(String creatorId) {
    
    this.creatorId = creatorId;
    return this;
  }

   /**
   * 创建者id
   * @return creatorId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "创建者id")

  public String getCreatorId() {
    return creatorId;
  }


  public void setCreatorId(String creatorId) {
    this.creatorId = creatorId;
  }


  public ItemModel creatorType(String creatorType) {
    
    this.creatorType = creatorType;
    return this;
  }

   /**
   * 创建者类型
   * @return creatorType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SYSTEM", value = "创建者类型")

  public String getCreatorType() {
    return creatorType;
  }


  public void setCreatorType(String creatorType) {
    this.creatorType = creatorType;
  }


  public ItemModel extInfo(String extInfo) {
    
    this.extInfo = extInfo;
    return this;
  }

   /**
   * 商品扩展信息：可以解析成 Map&lt;String, String&gt; 的 json string
   * @return extInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"DISCOUNT\": \"88\"}", value = "商品扩展信息：可以解析成 Map<String, String> 的 json string")

  public String getExtInfo() {
    return extInfo;
  }


  public void setExtInfo(String extInfo) {
    this.extInfo = extInfo;
  }


  public ItemModel frontCategoryId(String frontCategoryId) {
    
    this.frontCategoryId = frontCategoryId;
    return this;
  }

   /**
   * 前台类目id
   * @return frontCategoryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018091300502200002600105884", value = "前台类目id")

  public String getFrontCategoryId() {
    return frontCategoryId;
  }


  public void setFrontCategoryId(String frontCategoryId) {
    this.frontCategoryId = frontCategoryId;
  }


  public ItemModel gmtCreate(String gmtCreate) {
    
    this.gmtCreate = gmtCreate;
    return this;
  }

   /**
   * 商品创建时间
   * @return gmtCreate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018-09-25 19:41:34", value = "商品创建时间")

  public String getGmtCreate() {
    return gmtCreate;
  }


  public void setGmtCreate(String gmtCreate) {
    this.gmtCreate = gmtCreate;
  }


  public ItemModel gmtModified(String gmtModified) {
    
    this.gmtModified = gmtModified;
    return this;
  }

   /**
   * 商品更新时间
   * @return gmtModified
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018-09-25 19:41:34", value = "商品更新时间")

  public String getGmtModified() {
    return gmtModified;
  }


  public void setGmtModified(String gmtModified) {
    this.gmtModified = gmtModified;
  }


  public ItemModel itemId(String itemId) {
    
    this.itemId = itemId;
    return this;
  }

   /**
   * 商品id
   * @return itemId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018091300502200004300103587", value = "商品id")

  public String getItemId() {
    return itemId;
  }


  public void setItemId(String itemId) {
    this.itemId = itemId;
  }


  public ItemModel name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * 商品名称
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "西红柿炒蛋", value = "商品名称")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ItemModel skuList(List<ItemSkuInfo> skuList) {
    
    this.skuList = skuList;
    return this;
  }

  public ItemModel addSkuListItem(ItemSkuInfo skuListItem) {
    if (this.skuList == null) {
      this.skuList = new ArrayList<>();
    }
    this.skuList.add(skuListItem);
    return this;
  }

   /**
   * 商品sku列表
   * @return skuList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商品sku列表")

  public List<ItemSkuInfo> getSkuList() {
    return skuList;
  }


  public void setSkuList(List<ItemSkuInfo> skuList) {
    this.skuList = skuList;
  }


  public ItemModel sort(Integer sort) {
    
    this.sort = sort;
    return this;
  }

   /**
   * 商品排序
   * @return sort
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "商品排序")

  public Integer getSort() {
    return sort;
  }


  public void setSort(Integer sort) {
    this.sort = sort;
  }


  public ItemModel status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 商品状态
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "EFFECT", value = "商品状态")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public ItemModel targetId(String targetId) {
    
    this.targetId = targetId;
    return this;
  }

   /**
   * 商户归属主体id
   * @return targetId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018090600502000000022501261", value = "商户归属主体id")

  public String getTargetId() {
    return targetId;
  }


  public void setTargetId(String targetId) {
    this.targetId = targetId;
  }


  public ItemModel targetType(String targetType) {
    
    this.targetType = targetType;
    return this;
  }

   /**
   * 商品归属主体类型：5(商铺)
   * @return targetType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5", value = "商品归属主体类型：5(商铺)")

  public String getTargetType() {
    return targetType;
  }


  public void setTargetType(String targetType) {
    this.targetType = targetType;
  }


  public ItemModel type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * 商品类型
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "STANDARD_GOODS", value = "商品类型")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemModel itemModel = (ItemModel) o;
    return Objects.equals(this.creatorId, itemModel.creatorId) &&
        Objects.equals(this.creatorType, itemModel.creatorType) &&
        Objects.equals(this.extInfo, itemModel.extInfo) &&
        Objects.equals(this.frontCategoryId, itemModel.frontCategoryId) &&
        Objects.equals(this.gmtCreate, itemModel.gmtCreate) &&
        Objects.equals(this.gmtModified, itemModel.gmtModified) &&
        Objects.equals(this.itemId, itemModel.itemId) &&
        Objects.equals(this.name, itemModel.name) &&
        Objects.equals(this.skuList, itemModel.skuList) &&
        Objects.equals(this.sort, itemModel.sort) &&
        Objects.equals(this.status, itemModel.status) &&
        Objects.equals(this.targetId, itemModel.targetId) &&
        Objects.equals(this.targetType, itemModel.targetType) &&
        Objects.equals(this.type, itemModel.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creatorId, creatorType, extInfo, frontCategoryId, gmtCreate, gmtModified, itemId, name, skuList, sort, status, targetId, targetType, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemModel {\n");
    sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
    sb.append("    creatorType: ").append(toIndentedString(creatorType)).append("\n");
    sb.append("    extInfo: ").append(toIndentedString(extInfo)).append("\n");
    sb.append("    frontCategoryId: ").append(toIndentedString(frontCategoryId)).append("\n");
    sb.append("    gmtCreate: ").append(toIndentedString(gmtCreate)).append("\n");
    sb.append("    gmtModified: ").append(toIndentedString(gmtModified)).append("\n");
    sb.append("    itemId: ").append(toIndentedString(itemId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    skuList: ").append(toIndentedString(skuList)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
    sb.append("    targetType: ").append(toIndentedString(targetType)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("creator_id");
    openapiFields.add("creator_type");
    openapiFields.add("ext_info");
    openapiFields.add("front_category_id");
    openapiFields.add("gmt_create");
    openapiFields.add("gmt_modified");
    openapiFields.add("item_id");
    openapiFields.add("name");
    openapiFields.add("sku_list");
    openapiFields.add("sort");
    openapiFields.add("status");
    openapiFields.add("target_id");
    openapiFields.add("target_type");
    openapiFields.add("type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ItemModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ItemModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ItemModel is not found in the empty JSON string", ItemModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ItemModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ItemModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("creator_id") != null && !jsonObj.get("creator_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `creator_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("creator_id").toString()));
      }
      if (jsonObj.get("creator_type") != null && !jsonObj.get("creator_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `creator_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("creator_type").toString()));
      }
      if (jsonObj.get("ext_info") != null && !jsonObj.get("ext_info").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ext_info` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ext_info").toString()));
      }
      if (jsonObj.get("front_category_id") != null && !jsonObj.get("front_category_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `front_category_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("front_category_id").toString()));
      }
      if (jsonObj.get("gmt_create") != null && !jsonObj.get("gmt_create").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gmt_create` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gmt_create").toString()));
      }
      if (jsonObj.get("gmt_modified") != null && !jsonObj.get("gmt_modified").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gmt_modified` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gmt_modified").toString()));
      }
      if (jsonObj.get("item_id") != null && !jsonObj.get("item_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `item_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("item_id").toString()));
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      JsonArray jsonArrayskuList = jsonObj.getAsJsonArray("sku_list");
      if (jsonArrayskuList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("sku_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `sku_list` to be an array in the JSON string but got `%s`", jsonObj.get("sku_list").toString()));
        }

        // validate the optional field `sku_list` (array)
        for (int i = 0; i < jsonArrayskuList.size(); i++) {
          ItemSkuInfo.validateJsonObject(jsonArrayskuList.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (jsonObj.get("target_id") != null && !jsonObj.get("target_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target_id").toString()));
      }
      if (jsonObj.get("target_type") != null && !jsonObj.get("target_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `target_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("target_type").toString()));
      }
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ItemModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ItemModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ItemModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ItemModel.class));

       return (TypeAdapter<T>) new TypeAdapter<ItemModel>() {
           @Override
           public void write(JsonWriter out, ItemModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ItemModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ItemModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ItemModel
  * @throws IOException if the JSON string is invalid with respect to ItemModel
  */
  public static ItemModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ItemModel.class);
  }

 /**
  * Convert an instance of ItemModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

