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
import com.alipay.v3.model.RecruitVoucherRule;
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
 * RecruitEnrollRuleData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class RecruitEnrollRuleData {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_RECRUIT_VOUCHER_RULES = "recruit_voucher_rules";
  @SerializedName(SERIALIZED_NAME_RECRUIT_VOUCHER_RULES)
  private List<RecruitVoucherRule> recruitVoucherRules = null;

  public static final String SERIALIZED_NAME_SCHEMA = "schema";
  @SerializedName(SERIALIZED_NAME_SCHEMA)
  private String schema;

  public RecruitEnrollRuleData() { 
  }

  public RecruitEnrollRuleData recruitVoucherRules(List<RecruitVoucherRule> recruitVoucherRules) {
    
    this.recruitVoucherRules = recruitVoucherRules;
    return this;
  }

  public RecruitEnrollRuleData addRecruitVoucherRulesItem(RecruitVoucherRule recruitVoucherRulesItem) {
    if (this.recruitVoucherRules == null) {
      this.recruitVoucherRules = new ArrayList<>();
    }
    this.recruitVoucherRules.add(recruitVoucherRulesItem);
    return this;
  }

   /**
   * 招商方案可提报的券的规则列表，不同的券有不同的规则。
   * @return recruitVoucherRules
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "招商方案可提报的券的规则列表，不同的券有不同的规则。")

  public List<RecruitVoucherRule> getRecruitVoucherRules() {
    return recruitVoucherRules;
  }


  public void setRecruitVoucherRules(List<RecruitVoucherRule> recruitVoucherRules) {
    this.recruitVoucherRules = recruitVoucherRules;
  }


  public RecruitEnrollRuleData schema(String schema) {
    
    this.schema = schema;
    return this;
  }

   /**
   * 素材的要求，json字符串，使用时需要把此字符串解析成json对象。 field：提报的字段key label：字段说明 required：是否必填 type：字段类型。包含：图片（IMAGE）、文本（TEXT）、数据源（DATASOURCE）等 rules：字段约束规则   图片（IMAGE）：     image_size：图片宽高，单位是PX     file_type：图片类型     file_size：表示图片大小的最大值，单位是KB     image_aspect_ratio: 图片宽高比例   文本（TEXT）：     unicode_length：文本长度，单位为Byte   数据源（DATASOURCE）：     unicode_length：文本长度，单位为Byte
   * @return schema
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"field\":\"activityImage\",\"label\":\"活动图片\",\"type\":\"IMAGE\",\"required\":true,\"rules\":{\"image_size\":[400,300],\"file_type\":[\"jpg\"],\"file_size\":500}},{\"field\":\"contentId\",\"label\":\"内容ID\",\"required\":true,\"rules\":{\"unicode_length\":[2,512]},\"type\":\"DATASOURCE\"}]", value = "素材的要求，json字符串，使用时需要把此字符串解析成json对象。 field：提报的字段key label：字段说明 required：是否必填 type：字段类型。包含：图片（IMAGE）、文本（TEXT）、数据源（DATASOURCE）等 rules：字段约束规则   图片（IMAGE）：     image_size：图片宽高，单位是PX     file_type：图片类型     file_size：表示图片大小的最大值，单位是KB     image_aspect_ratio: 图片宽高比例   文本（TEXT）：     unicode_length：文本长度，单位为Byte   数据源（DATASOURCE）：     unicode_length：文本长度，单位为Byte")

  public String getSchema() {
    return schema;
  }


  public void setSchema(String schema) {
    this.schema = schema;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecruitEnrollRuleData recruitEnrollRuleData = (RecruitEnrollRuleData) o;
    return Objects.equals(this.recruitVoucherRules, recruitEnrollRuleData.recruitVoucherRules) &&
        Objects.equals(this.schema, recruitEnrollRuleData.schema);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recruitVoucherRules, schema);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecruitEnrollRuleData {\n");
    sb.append("    recruitVoucherRules: ").append(toIndentedString(recruitVoucherRules)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
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
    openapiFields.add("recruit_voucher_rules");
    openapiFields.add("schema");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to RecruitEnrollRuleData
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (RecruitEnrollRuleData.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in RecruitEnrollRuleData is not found in the empty JSON string", RecruitEnrollRuleData.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!RecruitEnrollRuleData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `RecruitEnrollRuleData` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayrecruitVoucherRules = jsonObj.getAsJsonArray("recruit_voucher_rules");
      if (jsonArrayrecruitVoucherRules != null) {
        // ensure the json data is an array
        if (!jsonObj.get("recruit_voucher_rules").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `recruit_voucher_rules` to be an array in the JSON string but got `%s`", jsonObj.get("recruit_voucher_rules").toString()));
        }

        // validate the optional field `recruit_voucher_rules` (array)
        for (int i = 0; i < jsonArrayrecruitVoucherRules.size(); i++) {
          RecruitVoucherRule.validateJsonObject(jsonArrayrecruitVoucherRules.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("schema") != null && !jsonObj.get("schema").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `schema` to be a primitive type in the JSON string but got `%s`", jsonObj.get("schema").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!RecruitEnrollRuleData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'RecruitEnrollRuleData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<RecruitEnrollRuleData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(RecruitEnrollRuleData.class));

       return (TypeAdapter<T>) new TypeAdapter<RecruitEnrollRuleData>() {
           @Override
           public void write(JsonWriter out, RecruitEnrollRuleData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public RecruitEnrollRuleData read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of RecruitEnrollRuleData given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of RecruitEnrollRuleData
  * @throws IOException if the JSON string is invalid with respect to RecruitEnrollRuleData
  */
  public static RecruitEnrollRuleData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, RecruitEnrollRuleData.class);
  }

 /**
  * Convert an instance of RecruitEnrollRuleData to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

