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
import com.alipay.v3.model.McardTemplate;
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
 * AlipayMarketingCardTemplateBatchqueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayMarketingCardTemplateBatchqueryResponseModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_MCARD_TEMPLATE = "mcard_template";
  @SerializedName(SERIALIZED_NAME_MCARD_TEMPLATE)
  private List<McardTemplate> mcardTemplate = null;

  public static final String SERIALIZED_NAME_TEMPLATE_TOTAL = "template_total";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_TOTAL)
  private Integer templateTotal;

  public AlipayMarketingCardTemplateBatchqueryResponseModel() { 
  }

  public AlipayMarketingCardTemplateBatchqueryResponseModel mcardTemplate(List<McardTemplate> mcardTemplate) {
    
    this.mcardTemplate = mcardTemplate;
    return this;
  }

  public AlipayMarketingCardTemplateBatchqueryResponseModel addMcardTemplateItem(McardTemplate mcardTemplateItem) {
    if (this.mcardTemplate == null) {
      this.mcardTemplate = new ArrayList<>();
    }
    this.mcardTemplate.add(mcardTemplateItem);
    return this;
  }

   /**
   * 会员卡模板基本信息
   * @return mcardTemplate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "会员卡模板基本信息")

  public List<McardTemplate> getMcardTemplate() {
    return mcardTemplate;
  }


  public void setMcardTemplate(List<McardTemplate> mcardTemplate) {
    this.mcardTemplate = mcardTemplate;
  }


  public AlipayMarketingCardTemplateBatchqueryResponseModel templateTotal(Integer templateTotal) {
    
    this.templateTotal = templateTotal;
    return this;
  }

   /**
   * 会员卡模板总数
   * @return templateTotal
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "10", value = "会员卡模板总数")

  public Integer getTemplateTotal() {
    return templateTotal;
  }


  public void setTemplateTotal(Integer templateTotal) {
    this.templateTotal = templateTotal;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayMarketingCardTemplateBatchqueryResponseModel alipayMarketingCardTemplateBatchqueryResponseModel = (AlipayMarketingCardTemplateBatchqueryResponseModel) o;
    return Objects.equals(this.mcardTemplate, alipayMarketingCardTemplateBatchqueryResponseModel.mcardTemplate) &&
        Objects.equals(this.templateTotal, alipayMarketingCardTemplateBatchqueryResponseModel.templateTotal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mcardTemplate, templateTotal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayMarketingCardTemplateBatchqueryResponseModel {\n");
    sb.append("    mcardTemplate: ").append(toIndentedString(mcardTemplate)).append("\n");
    sb.append("    templateTotal: ").append(toIndentedString(templateTotal)).append("\n");
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
    openapiFields.add("mcard_template");
    openapiFields.add("template_total");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayMarketingCardTemplateBatchqueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayMarketingCardTemplateBatchqueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayMarketingCardTemplateBatchqueryResponseModel is not found in the empty JSON string", AlipayMarketingCardTemplateBatchqueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayMarketingCardTemplateBatchqueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayMarketingCardTemplateBatchqueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArraymcardTemplate = jsonObj.getAsJsonArray("mcard_template");
      if (jsonArraymcardTemplate != null) {
        // ensure the json data is an array
        if (!jsonObj.get("mcard_template").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `mcard_template` to be an array in the JSON string but got `%s`", jsonObj.get("mcard_template").toString()));
        }

        // validate the optional field `mcard_template` (array)
        for (int i = 0; i < jsonArraymcardTemplate.size(); i++) {
          McardTemplate.validateJsonObject(jsonArraymcardTemplate.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayMarketingCardTemplateBatchqueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayMarketingCardTemplateBatchqueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayMarketingCardTemplateBatchqueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayMarketingCardTemplateBatchqueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayMarketingCardTemplateBatchqueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AlipayMarketingCardTemplateBatchqueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayMarketingCardTemplateBatchqueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayMarketingCardTemplateBatchqueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayMarketingCardTemplateBatchqueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayMarketingCardTemplateBatchqueryResponseModel
  */
  public static AlipayMarketingCardTemplateBatchqueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayMarketingCardTemplateBatchqueryResponseModel.class);
  }

 /**
  * Convert an instance of AlipayMarketingCardTemplateBatchqueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

