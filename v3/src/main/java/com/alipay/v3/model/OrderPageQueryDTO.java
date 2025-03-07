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
import com.alipay.v3.model.ApplyOrderData;
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
 * OrderPageQueryDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OrderPageQueryDTO {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_PAGE_DATA = "page_data";
  @SerializedName(SERIALIZED_NAME_PAGE_DATA)
  private List<ApplyOrderData> pageData = null;

  public static final String SERIALIZED_NAME_PAGE_NUM = "page_num";
  @SerializedName(SERIALIZED_NAME_PAGE_NUM)
  private String pageNum;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "page_size";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private String pageSize;

  public static final String SERIALIZED_NAME_TOTAL_NUMBER = "total_number";
  @SerializedName(SERIALIZED_NAME_TOTAL_NUMBER)
  private Integer totalNumber;

  public OrderPageQueryDTO() { 
  }

  public OrderPageQueryDTO pageData(List<ApplyOrderData> pageData) {
    
    this.pageData = pageData;
    return this;
  }

  public OrderPageQueryDTO addPageDataItem(ApplyOrderData pageDataItem) {
    if (this.pageData == null) {
      this.pageData = new ArrayList<>();
    }
    this.pageData.add(pageDataItem);
    return this;
  }

   /**
   * 审核单数据信息
   * @return pageData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "审核单数据信息")

  public List<ApplyOrderData> getPageData() {
    return pageData;
  }


  public void setPageData(List<ApplyOrderData> pageData) {
    this.pageData = pageData;
  }


  public OrderPageQueryDTO pageNum(String pageNum) {
    
    this.pageNum = pageNum;
    return this;
  }

   /**
   * 当前页码，默认第一页
   * @return pageNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "当前页码，默认第一页")

  public String getPageNum() {
    return pageNum;
  }


  public void setPageNum(String pageNum) {
    this.pageNum = pageNum;
  }


  public OrderPageQueryDTO pageSize(String pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * 每页记录数，默认10
   * @return pageSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "每页记录数，默认10")

  public String getPageSize() {
    return pageSize;
  }


  public void setPageSize(String pageSize) {
    this.pageSize = pageSize;
  }


  public OrderPageQueryDTO totalNumber(Integer totalNumber) {
    
    this.totalNumber = totalNumber;
    return this;
  }

   /**
   * 记录总数
   * @return totalNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1000", value = "记录总数")

  public Integer getTotalNumber() {
    return totalNumber;
  }


  public void setTotalNumber(Integer totalNumber) {
    this.totalNumber = totalNumber;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderPageQueryDTO orderPageQueryDTO = (OrderPageQueryDTO) o;
    return Objects.equals(this.pageData, orderPageQueryDTO.pageData) &&
        Objects.equals(this.pageNum, orderPageQueryDTO.pageNum) &&
        Objects.equals(this.pageSize, orderPageQueryDTO.pageSize) &&
        Objects.equals(this.totalNumber, orderPageQueryDTO.totalNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageData, pageNum, pageSize, totalNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderPageQueryDTO {\n");
    sb.append("    pageData: ").append(toIndentedString(pageData)).append("\n");
    sb.append("    pageNum: ").append(toIndentedString(pageNum)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    totalNumber: ").append(toIndentedString(totalNumber)).append("\n");
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
    openapiFields.add("page_data");
    openapiFields.add("page_num");
    openapiFields.add("page_size");
    openapiFields.add("total_number");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to OrderPageQueryDTO
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (OrderPageQueryDTO.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in OrderPageQueryDTO is not found in the empty JSON string", OrderPageQueryDTO.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!OrderPageQueryDTO.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `OrderPageQueryDTO` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArraypageData = jsonObj.getAsJsonArray("page_data");
      if (jsonArraypageData != null) {
        // ensure the json data is an array
        if (!jsonObj.get("page_data").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `page_data` to be an array in the JSON string but got `%s`", jsonObj.get("page_data").toString()));
        }

        // validate the optional field `page_data` (array)
        for (int i = 0; i < jsonArraypageData.size(); i++) {
          ApplyOrderData.validateJsonObject(jsonArraypageData.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("page_num") != null && !jsonObj.get("page_num").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `page_num` to be a primitive type in the JSON string but got `%s`", jsonObj.get("page_num").toString()));
      }
      if (jsonObj.get("page_size") != null && !jsonObj.get("page_size").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `page_size` to be a primitive type in the JSON string but got `%s`", jsonObj.get("page_size").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!OrderPageQueryDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'OrderPageQueryDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<OrderPageQueryDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(OrderPageQueryDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<OrderPageQueryDTO>() {
           @Override
           public void write(JsonWriter out, OrderPageQueryDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public OrderPageQueryDTO read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of OrderPageQueryDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of OrderPageQueryDTO
  * @throws IOException if the JSON string is invalid with respect to OrderPageQueryDTO
  */
  public static OrderPageQueryDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, OrderPageQueryDTO.class);
  }

 /**
  * Convert an instance of OrderPageQueryDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

