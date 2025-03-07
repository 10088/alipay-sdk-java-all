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
 * McardTemplateBenefit
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class McardTemplateBenefit {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_BENEFIT_DESC = "benefit_desc";
  @SerializedName(SERIALIZED_NAME_BENEFIT_DESC)
  private List<String> benefitDesc = null;

  public static final String SERIALIZED_NAME_END_DATE = "end_date";
  @SerializedName(SERIALIZED_NAME_END_DATE)
  private String endDate;

  public static final String SERIALIZED_NAME_EXT_INFO = "ext_info";
  @SerializedName(SERIALIZED_NAME_EXT_INFO)
  private String extInfo;

  public static final String SERIALIZED_NAME_START_DATE = "start_date";
  @SerializedName(SERIALIZED_NAME_START_DATE)
  private String startDate;

  public static final String SERIALIZED_NAME_TEMPLATE_ID = "template_id";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_ID)
  private String templateId;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public McardTemplateBenefit() { 
  }

  public McardTemplateBenefit benefitDesc(List<String> benefitDesc) {
    
    this.benefitDesc = benefitDesc;
    return this;
  }

  public McardTemplateBenefit addBenefitDescItem(String benefitDescItem) {
    if (this.benefitDesc == null) {
      this.benefitDesc = new ArrayList<>();
    }
    this.benefitDesc.add(benefitDescItem);
    return this;
  }

   /**
   * 权益描述信息
   * @return benefitDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "权益描述信息")

  public List<String> getBenefitDesc() {
    return benefitDesc;
  }


  public void setBenefitDesc(List<String> benefitDesc) {
    this.benefitDesc = benefitDesc;
  }


  public McardTemplateBenefit endDate(String endDate) {
    
    this.endDate = endDate;
    return this;
  }

   /**
   * 权益结束时间。  注：在权益开始时间和结束时间范围内的权益才会认为是有效权益进行展示。
   * @return endDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "权益结束时间。  注：在权益开始时间和结束时间范围内的权益才会认为是有效权益进行展示。")

  public String getEndDate() {
    return endDate;
  }


  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }


  public McardTemplateBenefit extInfo(String extInfo) {
    
    this.extInfo = extInfo;
    return this;
  }

   /**
   * 会员卡模板权益扩展信息：JSON格式; openUrl 说明：跳转到商户的优惠活动页面
   * @return extInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "会员卡模板权益扩展信息：JSON格式; openUrl 说明：跳转到商户的优惠活动页面")

  public String getExtInfo() {
    return extInfo;
  }


  public void setExtInfo(String extInfo) {
    this.extInfo = extInfo;
  }


  public McardTemplateBenefit startDate(String startDate) {
    
    this.startDate = startDate;
    return this;
  }

   /**
   * 权益开始时间
   * @return startDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "权益开始时间")

  public String getStartDate() {
    return startDate;
  }


  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }


  public McardTemplateBenefit templateId(String templateId) {
    
    this.templateId = templateId;
    return this;
  }

   /**
   * 会员卡模板ID
   * @return templateId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "会员卡模板ID")

  public String getTemplateId() {
    return templateId;
  }


  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }


  public McardTemplateBenefit title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * 权益标题
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "权益标题")

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
    McardTemplateBenefit mcardTemplateBenefit = (McardTemplateBenefit) o;
    return Objects.equals(this.benefitDesc, mcardTemplateBenefit.benefitDesc) &&
        Objects.equals(this.endDate, mcardTemplateBenefit.endDate) &&
        Objects.equals(this.extInfo, mcardTemplateBenefit.extInfo) &&
        Objects.equals(this.startDate, mcardTemplateBenefit.startDate) &&
        Objects.equals(this.templateId, mcardTemplateBenefit.templateId) &&
        Objects.equals(this.title, mcardTemplateBenefit.title);
  }

  @Override
  public int hashCode() {
    return Objects.hash(benefitDesc, endDate, extInfo, startDate, templateId, title);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class McardTemplateBenefit {\n");
    sb.append("    benefitDesc: ").append(toIndentedString(benefitDesc)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
    sb.append("    extInfo: ").append(toIndentedString(extInfo)).append("\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
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
    openapiFields.add("benefit_desc");
    openapiFields.add("end_date");
    openapiFields.add("ext_info");
    openapiFields.add("start_date");
    openapiFields.add("template_id");
    openapiFields.add("title");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to McardTemplateBenefit
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (McardTemplateBenefit.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in McardTemplateBenefit is not found in the empty JSON string", McardTemplateBenefit.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!McardTemplateBenefit.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `McardTemplateBenefit` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // ensure the json data is an array
      if (jsonObj.get("benefit_desc") != null && !jsonObj.get("benefit_desc").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `benefit_desc` to be an array in the JSON string but got `%s`", jsonObj.get("benefit_desc").toString()));
      }
      if (jsonObj.get("end_date") != null && !jsonObj.get("end_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `end_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("end_date").toString()));
      }
      if (jsonObj.get("ext_info") != null && !jsonObj.get("ext_info").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ext_info` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ext_info").toString()));
      }
      if (jsonObj.get("start_date") != null && !jsonObj.get("start_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `start_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("start_date").toString()));
      }
      if (jsonObj.get("template_id") != null && !jsonObj.get("template_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `template_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("template_id").toString()));
      }
      if (jsonObj.get("title") != null && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!McardTemplateBenefit.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'McardTemplateBenefit' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<McardTemplateBenefit> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(McardTemplateBenefit.class));

       return (TypeAdapter<T>) new TypeAdapter<McardTemplateBenefit>() {
           @Override
           public void write(JsonWriter out, McardTemplateBenefit value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public McardTemplateBenefit read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of McardTemplateBenefit given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of McardTemplateBenefit
  * @throws IOException if the JSON string is invalid with respect to McardTemplateBenefit
  */
  public static McardTemplateBenefit fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, McardTemplateBenefit.class);
  }

 /**
  * Convert an instance of McardTemplateBenefit to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

