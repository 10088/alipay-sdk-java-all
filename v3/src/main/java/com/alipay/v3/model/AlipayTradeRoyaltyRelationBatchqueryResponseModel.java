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
import com.alipay.v3.model.RoyaltyEntity;
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
 * AlipayTradeRoyaltyRelationBatchqueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayTradeRoyaltyRelationBatchqueryResponseModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CURRENT_PAGE_NUM = "current_page_num";
  @SerializedName(SERIALIZED_NAME_CURRENT_PAGE_NUM)
  private Integer currentPageNum;

  public static final String SERIALIZED_NAME_CURRENT_PAGE_SIZE = "current_page_size";
  @SerializedName(SERIALIZED_NAME_CURRENT_PAGE_SIZE)
  private Integer currentPageSize;

  public static final String SERIALIZED_NAME_RECEIVER_LIST = "receiver_list";
  @SerializedName(SERIALIZED_NAME_RECEIVER_LIST)
  private List<RoyaltyEntity> receiverList = null;

  public static final String SERIALIZED_NAME_RESULT_CODE = "result_code";
  @SerializedName(SERIALIZED_NAME_RESULT_CODE)
  private String resultCode;

  public static final String SERIALIZED_NAME_TOTAL_PAGE_NUM = "total_page_num";
  @SerializedName(SERIALIZED_NAME_TOTAL_PAGE_NUM)
  private Integer totalPageNum;

  public static final String SERIALIZED_NAME_TOTAL_RECORD_NUM = "total_record_num";
  @SerializedName(SERIALIZED_NAME_TOTAL_RECORD_NUM)
  private Integer totalRecordNum;

  public AlipayTradeRoyaltyRelationBatchqueryResponseModel() { 
  }

  public AlipayTradeRoyaltyRelationBatchqueryResponseModel currentPageNum(Integer currentPageNum) {
    
    this.currentPageNum = currentPageNum;
    return this;
  }

   /**
   * 当前页数
   * @return currentPageNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "当前页数")

  public Integer getCurrentPageNum() {
    return currentPageNum;
  }


  public void setCurrentPageNum(Integer currentPageNum) {
    this.currentPageNum = currentPageNum;
  }


  public AlipayTradeRoyaltyRelationBatchqueryResponseModel currentPageSize(Integer currentPageSize) {
    
    this.currentPageSize = currentPageSize;
    return this;
  }

   /**
   * 当前页面大小
   * @return currentPageSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20", value = "当前页面大小")

  public Integer getCurrentPageSize() {
    return currentPageSize;
  }


  public void setCurrentPageSize(Integer currentPageSize) {
    this.currentPageSize = currentPageSize;
  }


  public AlipayTradeRoyaltyRelationBatchqueryResponseModel receiverList(List<RoyaltyEntity> receiverList) {
    
    this.receiverList = receiverList;
    return this;
  }

  public AlipayTradeRoyaltyRelationBatchqueryResponseModel addReceiverListItem(RoyaltyEntity receiverListItem) {
    if (this.receiverList == null) {
      this.receiverList = new ArrayList<>();
    }
    this.receiverList.add(receiverListItem);
    return this;
  }

   /**
   * 分账收款方列表
   * @return receiverList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "分账收款方列表")

  public List<RoyaltyEntity> getReceiverList() {
    return receiverList;
  }


  public void setReceiverList(List<RoyaltyEntity> receiverList) {
    this.receiverList = receiverList;
  }


  public AlipayTradeRoyaltyRelationBatchqueryResponseModel resultCode(String resultCode) {
    
    this.resultCode = resultCode;
    return this;
  }

   /**
   * 业务结果码。SUCCESS：分账关系查询成功；FAIL：分账关系查询失败。
   * @return resultCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SUCCESS", value = "业务结果码。SUCCESS：分账关系查询成功；FAIL：分账关系查询失败。")

  public String getResultCode() {
    return resultCode;
  }


  public void setResultCode(String resultCode) {
    this.resultCode = resultCode;
  }


  public AlipayTradeRoyaltyRelationBatchqueryResponseModel totalPageNum(Integer totalPageNum) {
    
    this.totalPageNum = totalPageNum;
    return this;
  }

   /**
   * 总页数
   * @return totalPageNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "总页数")

  public Integer getTotalPageNum() {
    return totalPageNum;
  }


  public void setTotalPageNum(Integer totalPageNum) {
    this.totalPageNum = totalPageNum;
  }


  public AlipayTradeRoyaltyRelationBatchqueryResponseModel totalRecordNum(Integer totalRecordNum) {
    
    this.totalRecordNum = totalRecordNum;
    return this;
  }

   /**
   * 分账关系记录总数
   * @return totalRecordNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "480", value = "分账关系记录总数")

  public Integer getTotalRecordNum() {
    return totalRecordNum;
  }


  public void setTotalRecordNum(Integer totalRecordNum) {
    this.totalRecordNum = totalRecordNum;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayTradeRoyaltyRelationBatchqueryResponseModel alipayTradeRoyaltyRelationBatchqueryResponseModel = (AlipayTradeRoyaltyRelationBatchqueryResponseModel) o;
    return Objects.equals(this.currentPageNum, alipayTradeRoyaltyRelationBatchqueryResponseModel.currentPageNum) &&
        Objects.equals(this.currentPageSize, alipayTradeRoyaltyRelationBatchqueryResponseModel.currentPageSize) &&
        Objects.equals(this.receiverList, alipayTradeRoyaltyRelationBatchqueryResponseModel.receiverList) &&
        Objects.equals(this.resultCode, alipayTradeRoyaltyRelationBatchqueryResponseModel.resultCode) &&
        Objects.equals(this.totalPageNum, alipayTradeRoyaltyRelationBatchqueryResponseModel.totalPageNum) &&
        Objects.equals(this.totalRecordNum, alipayTradeRoyaltyRelationBatchqueryResponseModel.totalRecordNum);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currentPageNum, currentPageSize, receiverList, resultCode, totalPageNum, totalRecordNum);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayTradeRoyaltyRelationBatchqueryResponseModel {\n");
    sb.append("    currentPageNum: ").append(toIndentedString(currentPageNum)).append("\n");
    sb.append("    currentPageSize: ").append(toIndentedString(currentPageSize)).append("\n");
    sb.append("    receiverList: ").append(toIndentedString(receiverList)).append("\n");
    sb.append("    resultCode: ").append(toIndentedString(resultCode)).append("\n");
    sb.append("    totalPageNum: ").append(toIndentedString(totalPageNum)).append("\n");
    sb.append("    totalRecordNum: ").append(toIndentedString(totalRecordNum)).append("\n");
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
    openapiFields.add("current_page_num");
    openapiFields.add("current_page_size");
    openapiFields.add("receiver_list");
    openapiFields.add("result_code");
    openapiFields.add("total_page_num");
    openapiFields.add("total_record_num");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayTradeRoyaltyRelationBatchqueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayTradeRoyaltyRelationBatchqueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayTradeRoyaltyRelationBatchqueryResponseModel is not found in the empty JSON string", AlipayTradeRoyaltyRelationBatchqueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayTradeRoyaltyRelationBatchqueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayTradeRoyaltyRelationBatchqueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayreceiverList = jsonObj.getAsJsonArray("receiver_list");
      if (jsonArrayreceiverList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("receiver_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `receiver_list` to be an array in the JSON string but got `%s`", jsonObj.get("receiver_list").toString()));
        }

        // validate the optional field `receiver_list` (array)
        for (int i = 0; i < jsonArrayreceiverList.size(); i++) {
          RoyaltyEntity.validateJsonObject(jsonArrayreceiverList.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("result_code") != null && !jsonObj.get("result_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `result_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("result_code").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayTradeRoyaltyRelationBatchqueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayTradeRoyaltyRelationBatchqueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayTradeRoyaltyRelationBatchqueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayTradeRoyaltyRelationBatchqueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayTradeRoyaltyRelationBatchqueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayTradeRoyaltyRelationBatchqueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayTradeRoyaltyRelationBatchqueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayTradeRoyaltyRelationBatchqueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayTradeRoyaltyRelationBatchqueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayTradeRoyaltyRelationBatchqueryResponseModel
  */
  public static AlipayTradeRoyaltyRelationBatchqueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayTradeRoyaltyRelationBatchqueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayTradeRoyaltyRelationBatchqueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

