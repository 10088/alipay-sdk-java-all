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
import com.alipay.v3.model.CategoryRequireInfo;
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
 * AlipayOpenMiniCategoryRequireQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenMiniCategoryRequireQueryResponseModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CATEGORY_REQUIRE_INFO_LIST = "category_require_info_list";
  @SerializedName(SERIALIZED_NAME_CATEGORY_REQUIRE_INFO_LIST)
  private List<CategoryRequireInfo> categoryRequireInfoList = null;

  public AlipayOpenMiniCategoryRequireQueryResponseModel() { 
  }

  public AlipayOpenMiniCategoryRequireQueryResponseModel categoryRequireInfoList(List<CategoryRequireInfo> categoryRequireInfoList) {
    
    this.categoryRequireInfoList = categoryRequireInfoList;
    return this;
  }

  public AlipayOpenMiniCategoryRequireQueryResponseModel addCategoryRequireInfoListItem(CategoryRequireInfo categoryRequireInfoListItem) {
    if (this.categoryRequireInfoList == null) {
      this.categoryRequireInfoList = new ArrayList<>();
    }
    this.categoryRequireInfoList.add(categoryRequireInfoListItem);
    return this;
  }

   /**
   * 类目对应资质列表
   * @return categoryRequireInfoList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "类目对应资质列表")

  public List<CategoryRequireInfo> getCategoryRequireInfoList() {
    return categoryRequireInfoList;
  }


  public void setCategoryRequireInfoList(List<CategoryRequireInfo> categoryRequireInfoList) {
    this.categoryRequireInfoList = categoryRequireInfoList;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenMiniCategoryRequireQueryResponseModel alipayOpenMiniCategoryRequireQueryResponseModel = (AlipayOpenMiniCategoryRequireQueryResponseModel) o;
    return Objects.equals(this.categoryRequireInfoList, alipayOpenMiniCategoryRequireQueryResponseModel.categoryRequireInfoList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(categoryRequireInfoList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenMiniCategoryRequireQueryResponseModel {\n");
    sb.append("    categoryRequireInfoList: ").append(toIndentedString(categoryRequireInfoList)).append("\n");
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
    openapiFields.add("category_require_info_list");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenMiniCategoryRequireQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenMiniCategoryRequireQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenMiniCategoryRequireQueryResponseModel is not found in the empty JSON string", AlipayOpenMiniCategoryRequireQueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenMiniCategoryRequireQueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenMiniCategoryRequireQueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArraycategoryRequireInfoList = jsonObj.getAsJsonArray("category_require_info_list");
      if (jsonArraycategoryRequireInfoList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("category_require_info_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `category_require_info_list` to be an array in the JSON string but got `%s`", jsonObj.get("category_require_info_list").toString()));
        }

        // validate the optional field `category_require_info_list` (array)
        for (int i = 0; i < jsonArraycategoryRequireInfoList.size(); i++) {
          CategoryRequireInfo.validateJsonObject(jsonArraycategoryRequireInfoList.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenMiniCategoryRequireQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenMiniCategoryRequireQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenMiniCategoryRequireQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenMiniCategoryRequireQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenMiniCategoryRequireQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenMiniCategoryRequireQueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenMiniCategoryRequireQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenMiniCategoryRequireQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenMiniCategoryRequireQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenMiniCategoryRequireQueryResponseModel
  */
  public static AlipayOpenMiniCategoryRequireQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenMiniCategoryRequireQueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayOpenMiniCategoryRequireQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

