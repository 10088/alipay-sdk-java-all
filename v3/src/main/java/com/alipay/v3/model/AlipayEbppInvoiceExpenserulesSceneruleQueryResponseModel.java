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
import com.alipay.v3.model.StandardRuleInfo;
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
 * AlipayEbppInvoiceExpenserulesSceneruleQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayEbppInvoiceExpenserulesSceneruleQueryResponseModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_PAGE_NUM = "page_num";
  @SerializedName(SERIALIZED_NAME_PAGE_NUM)
  private Integer pageNum;

  public static final String SERIALIZED_NAME_PAGE_SIZE = "page_size";
  @SerializedName(SERIALIZED_NAME_PAGE_SIZE)
  private Integer pageSize;

  public static final String SERIALIZED_NAME_STANDARD_RULE_INFO_LIST = "standard_rule_info_list";
  @SerializedName(SERIALIZED_NAME_STANDARD_RULE_INFO_LIST)
  private List<StandardRuleInfo> standardRuleInfoList = null;

  public static final String SERIALIZED_NAME_TOTAL_PAGE_COUNT = "total_page_count";
  @SerializedName(SERIALIZED_NAME_TOTAL_PAGE_COUNT)
  private Integer totalPageCount;

  public AlipayEbppInvoiceExpenserulesSceneruleQueryResponseModel() { 
  }

  public AlipayEbppInvoiceExpenserulesSceneruleQueryResponseModel pageNum(Integer pageNum) {
    
    this.pageNum = pageNum;
    return this;
  }

   /**
   * 当前页数
   * @return pageNum
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "当前页数")

  public Integer getPageNum() {
    return pageNum;
  }


  public void setPageNum(Integer pageNum) {
    this.pageNum = pageNum;
  }


  public AlipayEbppInvoiceExpenserulesSceneruleQueryResponseModel pageSize(Integer pageSize) {
    
    this.pageSize = pageSize;
    return this;
  }

   /**
   * 当前记录数
   * @return pageSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "当前记录数")

  public Integer getPageSize() {
    return pageSize;
  }


  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }


  public AlipayEbppInvoiceExpenserulesSceneruleQueryResponseModel standardRuleInfoList(List<StandardRuleInfo> standardRuleInfoList) {
    
    this.standardRuleInfoList = standardRuleInfoList;
    return this;
  }

  public AlipayEbppInvoiceExpenserulesSceneruleQueryResponseModel addStandardRuleInfoListItem(StandardRuleInfo standardRuleInfoListItem) {
    if (this.standardRuleInfoList == null) {
      this.standardRuleInfoList = new ArrayList<>();
    }
    this.standardRuleInfoList.add(standardRuleInfoListItem);
    return this;
  }

   /**
   * 费控规则列表
   * @return standardRuleInfoList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "费控规则列表")

  public List<StandardRuleInfo> getStandardRuleInfoList() {
    return standardRuleInfoList;
  }


  public void setStandardRuleInfoList(List<StandardRuleInfo> standardRuleInfoList) {
    this.standardRuleInfoList = standardRuleInfoList;
  }


  public AlipayEbppInvoiceExpenserulesSceneruleQueryResponseModel totalPageCount(Integer totalPageCount) {
    
    this.totalPageCount = totalPageCount;
    return this;
  }

   /**
   * 总页数
   * @return totalPageCount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "总页数")

  public Integer getTotalPageCount() {
    return totalPageCount;
  }


  public void setTotalPageCount(Integer totalPageCount) {
    this.totalPageCount = totalPageCount;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayEbppInvoiceExpenserulesSceneruleQueryResponseModel alipayEbppInvoiceExpenserulesSceneruleQueryResponseModel = (AlipayEbppInvoiceExpenserulesSceneruleQueryResponseModel) o;
    return Objects.equals(this.pageNum, alipayEbppInvoiceExpenserulesSceneruleQueryResponseModel.pageNum) &&
        Objects.equals(this.pageSize, alipayEbppInvoiceExpenserulesSceneruleQueryResponseModel.pageSize) &&
        Objects.equals(this.standardRuleInfoList, alipayEbppInvoiceExpenserulesSceneruleQueryResponseModel.standardRuleInfoList) &&
        Objects.equals(this.totalPageCount, alipayEbppInvoiceExpenserulesSceneruleQueryResponseModel.totalPageCount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pageNum, pageSize, standardRuleInfoList, totalPageCount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayEbppInvoiceExpenserulesSceneruleQueryResponseModel {\n");
    sb.append("    pageNum: ").append(toIndentedString(pageNum)).append("\n");
    sb.append("    pageSize: ").append(toIndentedString(pageSize)).append("\n");
    sb.append("    standardRuleInfoList: ").append(toIndentedString(standardRuleInfoList)).append("\n");
    sb.append("    totalPageCount: ").append(toIndentedString(totalPageCount)).append("\n");
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
    openapiFields.add("page_num");
    openapiFields.add("page_size");
    openapiFields.add("standard_rule_info_list");
    openapiFields.add("total_page_count");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayEbppInvoiceExpenserulesSceneruleQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayEbppInvoiceExpenserulesSceneruleQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayEbppInvoiceExpenserulesSceneruleQueryResponseModel is not found in the empty JSON string", AlipayEbppInvoiceExpenserulesSceneruleQueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayEbppInvoiceExpenserulesSceneruleQueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayEbppInvoiceExpenserulesSceneruleQueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArraystandardRuleInfoList = jsonObj.getAsJsonArray("standard_rule_info_list");
      if (jsonArraystandardRuleInfoList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("standard_rule_info_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `standard_rule_info_list` to be an array in the JSON string but got `%s`", jsonObj.get("standard_rule_info_list").toString()));
        }

        // validate the optional field `standard_rule_info_list` (array)
        for (int i = 0; i < jsonArraystandardRuleInfoList.size(); i++) {
          StandardRuleInfo.validateJsonObject(jsonArraystandardRuleInfoList.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayEbppInvoiceExpenserulesSceneruleQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayEbppInvoiceExpenserulesSceneruleQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayEbppInvoiceExpenserulesSceneruleQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayEbppInvoiceExpenserulesSceneruleQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayEbppInvoiceExpenserulesSceneruleQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayEbppInvoiceExpenserulesSceneruleQueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayEbppInvoiceExpenserulesSceneruleQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayEbppInvoiceExpenserulesSceneruleQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayEbppInvoiceExpenserulesSceneruleQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayEbppInvoiceExpenserulesSceneruleQueryResponseModel
  */
  public static AlipayEbppInvoiceExpenserulesSceneruleQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayEbppInvoiceExpenserulesSceneruleQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayEbppInvoiceExpenserulesSceneruleQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

