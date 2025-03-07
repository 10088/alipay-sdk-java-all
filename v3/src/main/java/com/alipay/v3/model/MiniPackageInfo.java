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
 * MiniPackageInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class MiniPackageInfo {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_DOC_URL = "doc_url";
  @SerializedName(SERIALIZED_NAME_DOC_URL)
  private String docUrl;

  public static final String SERIALIZED_NAME_PACKAGE_DESC = "package_desc";
  @SerializedName(SERIALIZED_NAME_PACKAGE_DESC)
  private String packageDesc;

  public static final String SERIALIZED_NAME_PACKAGE_NAME = "package_name";
  @SerializedName(SERIALIZED_NAME_PACKAGE_NAME)
  private String packageName;

  public static final String SERIALIZED_NAME_PACKAGE_OPEN_TYPE = "package_open_type";
  @SerializedName(SERIALIZED_NAME_PACKAGE_OPEN_TYPE)
  private String packageOpenType;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public MiniPackageInfo() { 
  }

  public MiniPackageInfo docUrl(String docUrl) {
    
    this.docUrl = docUrl;
    return this;
  }

   /**
   * 功能包文档地址
   * @return docUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://doc.aaa.alipay.com", value = "功能包文档地址")

  public String getDocUrl() {
    return docUrl;
  }


  public void setDocUrl(String docUrl) {
    this.docUrl = docUrl;
  }


  public MiniPackageInfo packageDesc(String packageDesc) {
    
    this.packageDesc = packageDesc;
    return this;
  }

   /**
   * 功能包描述
   * @return packageDesc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "这是通用能力", value = "功能包描述")

  public String getPackageDesc() {
    return packageDesc;
  }


  public void setPackageDesc(String packageDesc) {
    this.packageDesc = packageDesc;
  }


  public MiniPackageInfo packageName(String packageName) {
    
    this.packageName = packageName;
    return this;
  }

   /**
   * 功能包名称
   * @return packageName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "基础能力", value = "功能包名称")

  public String getPackageName() {
    return packageName;
  }


  public void setPackageName(String packageName) {
    this.packageName = packageName;
  }


  public MiniPackageInfo packageOpenType(String packageOpenType) {
    
    this.packageOpenType = packageOpenType;
    return this;
  }

   /**
   * 功能包开通方式，\&quot;APPLY\&quot;, \&quot;申请开通\&quot;；\&quot;ORDER\&quot;, \&quot;签约开通\&quot;；\&quot;DEFAULT\&quot;, \&quot;默认开通\&quot;
   * @return packageOpenType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "APPLY", value = "功能包开通方式，\"APPLY\", \"申请开通\"；\"ORDER\", \"签约开通\"；\"DEFAULT\", \"默认开通\"")

  public String getPackageOpenType() {
    return packageOpenType;
  }


  public void setPackageOpenType(String packageOpenType) {
    this.packageOpenType = packageOpenType;
  }


  public MiniPackageInfo status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * 功能包签约状态，\&quot;valid\&quot;, \&quot;已生效\&quot;；\&quot;audit\&quot;, \&quot;签约中\&quot;；\&quot;invalid\&quot;, \&quot;已失效\&quot;；\&quot;none\&quot;, \&quot;未签约\&quot;
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "valid", value = "功能包签约状态，\"valid\", \"已生效\"；\"audit\", \"签约中\"；\"invalid\", \"已失效\"；\"none\", \"未签约\"")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MiniPackageInfo miniPackageInfo = (MiniPackageInfo) o;
    return Objects.equals(this.docUrl, miniPackageInfo.docUrl) &&
        Objects.equals(this.packageDesc, miniPackageInfo.packageDesc) &&
        Objects.equals(this.packageName, miniPackageInfo.packageName) &&
        Objects.equals(this.packageOpenType, miniPackageInfo.packageOpenType) &&
        Objects.equals(this.status, miniPackageInfo.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(docUrl, packageDesc, packageName, packageOpenType, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MiniPackageInfo {\n");
    sb.append("    docUrl: ").append(toIndentedString(docUrl)).append("\n");
    sb.append("    packageDesc: ").append(toIndentedString(packageDesc)).append("\n");
    sb.append("    packageName: ").append(toIndentedString(packageName)).append("\n");
    sb.append("    packageOpenType: ").append(toIndentedString(packageOpenType)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("doc_url");
    openapiFields.add("package_desc");
    openapiFields.add("package_name");
    openapiFields.add("package_open_type");
    openapiFields.add("status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MiniPackageInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (MiniPackageInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in MiniPackageInfo is not found in the empty JSON string", MiniPackageInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!MiniPackageInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MiniPackageInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("doc_url") != null && !jsonObj.get("doc_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `doc_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("doc_url").toString()));
      }
      if (jsonObj.get("package_desc") != null && !jsonObj.get("package_desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `package_desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("package_desc").toString()));
      }
      if (jsonObj.get("package_name") != null && !jsonObj.get("package_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `package_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("package_name").toString()));
      }
      if (jsonObj.get("package_open_type") != null && !jsonObj.get("package_open_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `package_open_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("package_open_type").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MiniPackageInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MiniPackageInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MiniPackageInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MiniPackageInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<MiniPackageInfo>() {
           @Override
           public void write(JsonWriter out, MiniPackageInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MiniPackageInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MiniPackageInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MiniPackageInfo
  * @throws IOException if the JSON string is invalid with respect to MiniPackageInfo
  */
  public static MiniPackageInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MiniPackageInfo.class);
  }

 /**
  * Convert an instance of MiniPackageInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

