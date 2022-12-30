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
import com.alipay.v3.model.Attachment;
import com.alipay.v3.model.ConfigInfoBean;
import com.alipay.v3.model.TemplateInfoBean;
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
 * AlipayEcoContractSignflowsCreateModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayEcoContractSignflowsCreateModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ATTACHMENTS = "attachments";
  @SerializedName(SERIALIZED_NAME_ATTACHMENTS)
  private List<Attachment> attachments = null;

  public static final String SERIALIZED_NAME_BUSINESS_SCENE = "business_scene";
  @SerializedName(SERIALIZED_NAME_BUSINESS_SCENE)
  private String businessScene;

  public static final String SERIALIZED_NAME_CONFIG_INFO = "config_info";
  @SerializedName(SERIALIZED_NAME_CONFIG_INFO)
  private ConfigInfoBean configInfo;

  public static final String SERIALIZED_NAME_TEMPLATE_INFOS = "template_infos";
  @SerializedName(SERIALIZED_NAME_TEMPLATE_INFOS)
  private List<TemplateInfoBean> templateInfos = null;

  public AlipayEcoContractSignflowsCreateModel() { 
  }

  public AlipayEcoContractSignflowsCreateModel attachments(List<Attachment> attachments) {
    
    this.attachments = attachments;
    return this;
  }

  public AlipayEcoContractSignflowsCreateModel addAttachmentsItem(Attachment attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * 附件信息（附件可作为合同的辅助证明材料，无需签署。需通过文件直传接口上传附件，获取文件id后添加）。注意事项参见 &lt;a href&#x3D;\&quot;https://opendocs.alipay.com/mini/00kr2w\&quot;&gt;文件流上传方法&lt;/a&gt;。
   * @return attachments
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "附件信息（附件可作为合同的辅助证明材料，无需签署。需通过文件直传接口上传附件，获取文件id后添加）。注意事项参见 <a href=\"https://opendocs.alipay.com/mini/00kr2w\">文件流上传方法</a>。")

  public List<Attachment> getAttachments() {
    return attachments;
  }


  public void setAttachments(List<Attachment> attachments) {
    this.attachments = attachments;
  }


  public AlipayEcoContractSignflowsCreateModel businessScene(String businessScene) {
    
    this.businessScene = businessScene;
    return this;
  }

   /**
   * 流程主题（简要概括合同的签署内容）
   * @return businessScene
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "爱租机手机交付单；某某公司劳动合同等", value = "流程主题（简要概括合同的签署内容）")

  public String getBusinessScene() {
    return businessScene;
  }


  public void setBusinessScene(String businessScene) {
    this.businessScene = businessScene;
  }


  public AlipayEcoContractSignflowsCreateModel configInfo(ConfigInfoBean configInfo) {
    
    this.configInfo = configInfo;
    return this;
  }

   /**
   * Get configInfo
   * @return configInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public ConfigInfoBean getConfigInfo() {
    return configInfo;
  }


  public void setConfigInfo(ConfigInfoBean configInfo) {
    this.configInfo = configInfo;
  }


  public AlipayEcoContractSignflowsCreateModel templateInfos(List<TemplateInfoBean> templateInfos) {
    
    this.templateInfos = templateInfos;
    return this;
  }

  public AlipayEcoContractSignflowsCreateModel addTemplateInfosItem(TemplateInfoBean templateInfosItem) {
    if (this.templateInfos == null) {
      this.templateInfos = new ArrayList<>();
    }
    this.templateInfos.add(templateInfosItem);
    return this;
  }

   /**
   * 模板信息（基于合同模板填充内容生成待签文件，并指定签署人）
   * @return templateInfos
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "模板信息（基于合同模板填充内容生成待签文件，并指定签署人）")

  public List<TemplateInfoBean> getTemplateInfos() {
    return templateInfos;
  }


  public void setTemplateInfos(List<TemplateInfoBean> templateInfos) {
    this.templateInfos = templateInfos;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayEcoContractSignflowsCreateModel alipayEcoContractSignflowsCreateModel = (AlipayEcoContractSignflowsCreateModel) o;
    return Objects.equals(this.attachments, alipayEcoContractSignflowsCreateModel.attachments) &&
        Objects.equals(this.businessScene, alipayEcoContractSignflowsCreateModel.businessScene) &&
        Objects.equals(this.configInfo, alipayEcoContractSignflowsCreateModel.configInfo) &&
        Objects.equals(this.templateInfos, alipayEcoContractSignflowsCreateModel.templateInfos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attachments, businessScene, configInfo, templateInfos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayEcoContractSignflowsCreateModel {\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    businessScene: ").append(toIndentedString(businessScene)).append("\n");
    sb.append("    configInfo: ").append(toIndentedString(configInfo)).append("\n");
    sb.append("    templateInfos: ").append(toIndentedString(templateInfos)).append("\n");
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
    openapiFields.add("attachments");
    openapiFields.add("business_scene");
    openapiFields.add("config_info");
    openapiFields.add("template_infos");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayEcoContractSignflowsCreateModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayEcoContractSignflowsCreateModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayEcoContractSignflowsCreateModel is not found in the empty JSON string", AlipayEcoContractSignflowsCreateModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayEcoContractSignflowsCreateModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayEcoContractSignflowsCreateModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayattachments = jsonObj.getAsJsonArray("attachments");
      if (jsonArrayattachments != null) {
        // ensure the json data is an array
        if (!jsonObj.get("attachments").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `attachments` to be an array in the JSON string but got `%s`", jsonObj.get("attachments").toString()));
        }

        // validate the optional field `attachments` (array)
        for (int i = 0; i < jsonArrayattachments.size(); i++) {
          Attachment.validateJsonObject(jsonArrayattachments.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("business_scene") != null && !jsonObj.get("business_scene").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `business_scene` to be a primitive type in the JSON string but got `%s`", jsonObj.get("business_scene").toString()));
      }
      // validate the optional field `config_info`
      if (jsonObj.getAsJsonObject("config_info") != null) {
        ConfigInfoBean.validateJsonObject(jsonObj.getAsJsonObject("config_info"));
      }
      JsonArray jsonArraytemplateInfos = jsonObj.getAsJsonArray("template_infos");
      if (jsonArraytemplateInfos != null) {
        // ensure the json data is an array
        if (!jsonObj.get("template_infos").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `template_infos` to be an array in the JSON string but got `%s`", jsonObj.get("template_infos").toString()));
        }

        // validate the optional field `template_infos` (array)
        for (int i = 0; i < jsonArraytemplateInfos.size(); i++) {
          TemplateInfoBean.validateJsonObject(jsonArraytemplateInfos.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayEcoContractSignflowsCreateModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayEcoContractSignflowsCreateModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayEcoContractSignflowsCreateModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayEcoContractSignflowsCreateModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayEcoContractSignflowsCreateModel>() {
           @Override
           public void write(JsonWriter out, AlipayEcoContractSignflowsCreateModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayEcoContractSignflowsCreateModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayEcoContractSignflowsCreateModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayEcoContractSignflowsCreateModel
  * @throws IOException if the JSON string is invalid with respect to AlipayEcoContractSignflowsCreateModel
  */
  public static AlipayEcoContractSignflowsCreateModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayEcoContractSignflowsCreateModel.class);
  }

 /**
  * Convert an instance of AlipayEcoContractSignflowsCreateModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

