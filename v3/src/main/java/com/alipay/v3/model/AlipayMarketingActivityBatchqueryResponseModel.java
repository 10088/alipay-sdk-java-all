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
import com.alipay.v3.model.ActivityLiteInfo;
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
 * AlipayMarketingActivityBatchqueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayMarketingActivityBatchqueryResponseModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ACTIVITY_LITE_INFOS = "activity_lite_infos";
  @SerializedName(SERIALIZED_NAME_ACTIVITY_LITE_INFOS)
  private List<ActivityLiteInfo> activityLiteInfos = null;

  public static final String SERIALIZED_NAME_PAGE_NUM = "page_num";
  @SerializedName(SERIALIZED_NAME_PAGE_NUM)
  private Integer pageNum;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "page_size";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Integer pageSize;

  public static final String SERIALIZED_NAME_TOTAL_SIZE = "total_size";
  @SerializedName(SERIALIZED_NAME_TOTAL_SIZE)
  private String totalSize;

  public AlipayMarketingActivityBatchqueryResponseModel() { 
  }

  public AlipayMarketingActivityBatchqueryResponseModel activityLiteInfos(List<ActivityLiteInfo> activityLiteInfos) {
    
    this.activityLiteInfos = activityLiteInfos;
    return this;
  }

  public AlipayMarketingActivityBatchqueryResponseModel addActivityLiteInfosItem(ActivityLiteInfo activityLiteInfosItem) {
    if (this.activityLiteInfos == null) {
      this.activityLiteInfos = new ArrayList<>();
    }
    this.activityLiteInfos.add(activityLiteInfosItem);
    return this;
  }

   /**
   * 活动摘要信息
   * @return activityLiteInfos
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "活动摘要信息")

  public List<ActivityLiteInfo> getActivityLiteInfos() {
    return activityLiteInfos;
  }


  public void setActivityLiteInfos(List<ActivityLiteInfo> activityLiteInfos) {
    this.activityLiteInfos = activityLiteInfos;
  }


  public AlipayMarketingActivityBatchqueryResponseModel pageNum(Integer pageNum) {
    
    this.pageNum = pageNum;
    return this;
  }

   /**
   * 分页查询页码。
   * @return pageNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "分页查询页码。")

  public Integer getPageNum() {
    return pageNum;
  }


  public void setPageNum(Integer pageNum) {
    this.pageNum = pageNum;
  }


  public AlipayMarketingActivityBatchqueryResponseModel pageSize(Integer pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * 分页查询单页数据条数。
   * @return pageSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20", value = "分页查询单页数据条数。")

  public Integer getPageSize() {
    return pageSize;
  }


  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  public AlipayMarketingActivityBatchqueryResponseModel totalSize(String totalSize) {
    
    this.totalSize = totalSize;
    return this;
  }

   /**
   * 经过条件筛选，查询到的活动总数量
   * @return totalSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "200", value = "经过条件筛选，查询到的活动总数量")

  public String getTotalSize() {
    return totalSize;
  }


  public void setTotalSize(String totalSize) {
    this.totalSize = totalSize;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayMarketingActivityBatchqueryResponseModel alipayMarketingActivityBatchqueryResponseModel = (AlipayMarketingActivityBatchqueryResponseModel) o;
    return Objects.equals(this.activityLiteInfos, alipayMarketingActivityBatchqueryResponseModel.activityLiteInfos) &&
        Objects.equals(this.pageNum, alipayMarketingActivityBatchqueryResponseModel.pageNum) &&
        Objects.equals(this.pageSize, alipayMarketingActivityBatchqueryResponseModel.pageSize) &&
        Objects.equals(this.totalSize, alipayMarketingActivityBatchqueryResponseModel.totalSize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(activityLiteInfos, pageNum, pageSize, totalSize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayMarketingActivityBatchqueryResponseModel {\n");
    sb.append("    activityLiteInfos: ").append(toIndentedString(activityLiteInfos)).append("\n");
    sb.append("    pageNum: ").append(toIndentedString(pageNum)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    totalSize: ").append(toIndentedString(totalSize)).append("\n");
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
    openapiFields.add("activity_lite_infos");
    openapiFields.add("page_num");
    openapiFields.add("page_size");
    openapiFields.add("total_size");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayMarketingActivityBatchqueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayMarketingActivityBatchqueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayMarketingActivityBatchqueryResponseModel is not found in the empty JSON string", AlipayMarketingActivityBatchqueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayMarketingActivityBatchqueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayMarketingActivityBatchqueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayactivityLiteInfos = jsonObj.getAsJsonArray("activity_lite_infos");
      if (jsonArrayactivityLiteInfos != null) {
        // ensure the json data is an array
        if (!jsonObj.get("activity_lite_infos").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `activity_lite_infos` to be an array in the JSON string but got `%s`", jsonObj.get("activity_lite_infos").toString()));
        }

        // validate the optional field `activity_lite_infos` (array)
        for (int i = 0; i < jsonArrayactivityLiteInfos.size(); i++) {
          ActivityLiteInfo.validateJsonObject(jsonArrayactivityLiteInfos.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("total_size") != null && !jsonObj.get("total_size").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `total_size` to be a primitive type in the JSON string but got `%s`", jsonObj.get("total_size").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayMarketingActivityBatchqueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayMarketingActivityBatchqueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayMarketingActivityBatchqueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayMarketingActivityBatchqueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayMarketingActivityBatchqueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayMarketingActivityBatchqueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayMarketingActivityBatchqueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayMarketingActivityBatchqueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayMarketingActivityBatchqueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayMarketingActivityBatchqueryResponseModel
  */
  public static AlipayMarketingActivityBatchqueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayMarketingActivityBatchqueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayMarketingActivityBatchqueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

