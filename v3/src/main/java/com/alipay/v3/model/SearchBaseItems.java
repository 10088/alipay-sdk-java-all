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
 * SearchBaseItems
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class SearchBaseItems {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CAN_SEARCH = "can_search";
  @SerializedName(SERIALIZED_NAME_CAN_SEARCH)
  private Boolean canSearch;

  public static final String SERIALIZED_NAME_KEY_WORDS = "key_words";
  @SerializedName(SERIALIZED_NAME_KEY_WORDS)
  private List<String> keyWords = null;

  public SearchBaseItems() { 
  }

  public SearchBaseItems canSearch(Boolean canSearch) {
    
    this.canSearch = canSearch;
    return this;
  }

   /**
   * 搜索可见性
   * @return canSearch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "搜索可见性")

  public Boolean getCanSearch() {
    return canSearch;
  }


  public void setCanSearch(Boolean canSearch) {
    this.canSearch = canSearch;
  }


  public SearchBaseItems keyWords(List<String> keyWords) {
    
    this.keyWords = keyWords;
    return this;
  }

  public SearchBaseItems addKeyWordsItem(String keyWordsItem) {
    if (this.keyWords == null) {
      this.keyWords = new ArrayList<>();
    }
    this.keyWords.add(keyWordsItem);
    return this;
  }

   /**
   * 提报关键词列表
   * @return keyWords
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"111\",\"222\",\"333\"]", value = "提报关键词列表")

  public List<String> getKeyWords() {
    return keyWords;
  }


  public void setKeyWords(List<String> keyWords) {
    this.keyWords = keyWords;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SearchBaseItems searchBaseItems = (SearchBaseItems) o;
    return Objects.equals(this.canSearch, searchBaseItems.canSearch) &&
        Objects.equals(this.keyWords, searchBaseItems.keyWords);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canSearch, keyWords);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SearchBaseItems {\n");
    sb.append("    canSearch: ").append(toIndentedString(canSearch)).append("\n");
    sb.append("    keyWords: ").append(toIndentedString(keyWords)).append("\n");
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
    openapiFields.add("can_search");
    openapiFields.add("key_words");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to SearchBaseItems
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (SearchBaseItems.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in SearchBaseItems is not found in the empty JSON string", SearchBaseItems.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!SearchBaseItems.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SearchBaseItems` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("key_words") != null && !jsonObj.get("key_words").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `key_words` to be an array in the JSON string but got `%s`", jsonObj.get("key_words").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SearchBaseItems.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SearchBaseItems' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SearchBaseItems> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SearchBaseItems.class));

       return (TypeAdapter<T>) new TypeAdapter<SearchBaseItems>() {
           @Override
           public void write(JsonWriter out, SearchBaseItems value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SearchBaseItems read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of SearchBaseItems given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of SearchBaseItems
  * @throws IOException if the JSON string is invalid with respect to SearchBaseItems
  */
  public static SearchBaseItems fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SearchBaseItems.class);
  }

 /**
  * Convert an instance of SearchBaseItems to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

