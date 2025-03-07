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
import com.alipay.v3.model.ExpenseCtrRuleGroupInfo;
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
 * ProjectRuleInfo
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ProjectRuleInfo {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_EFFECTIVE_END_DATE = "effective_end_date";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_END_DATE)
  private String effectiveEndDate;

  public static final String SERIALIZED_NAME_EFFECTIVE_START_DATE = "effective_start_date";
  @SerializedName(SERIALIZED_NAME_EFFECTIVE_START_DATE)
  private String effectiveStartDate;

  public static final String SERIALIZED_NAME_EMPLOYEE_LIST = "employee_list";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_LIST)
  private List<String> employeeList = null;

  public static final String SERIALIZED_NAME_EMPLOYEE_OPEN_ID_LIST = "employee_open_id_list";
  @SerializedName(SERIALIZED_NAME_EMPLOYEE_OPEN_ID_LIST)
  private List<String> employeeOpenIdList = null;

  public static final String SERIALIZED_NAME_EXPENSE_CTRL_RULE_INFO_GROUP_LIST = "expense_ctrl_rule_info_group_list";
  @SerializedName(SERIALIZED_NAME_EXPENSE_CTRL_RULE_INFO_GROUP_LIST)
  private List<ExpenseCtrRuleGroupInfo> expenseCtrlRuleInfoGroupList = null;

  public static final String SERIALIZED_NAME_PROJECT_ID = "project_id";
  @SerializedName(SERIALIZED_NAME_PROJECT_ID)
  private String projectId;

  public static final String SERIALIZED_NAME_PROJECT_NAME = "project_name";
  @SerializedName(SERIALIZED_NAME_PROJECT_NAME)
  private String projectName;

  public ProjectRuleInfo() { 
  }

  public ProjectRuleInfo effectiveEndDate(String effectiveEndDate) {
    
    this.effectiveEndDate = effectiveEndDate;
    return this;
  }

   /**
   * 有效期截止
   * @return effectiveEndDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-03-02 17:00:00", value = "有效期截止")

  public String getEffectiveEndDate() {
    return effectiveEndDate;
  }


  public void setEffectiveEndDate(String effectiveEndDate) {
    this.effectiveEndDate = effectiveEndDate;
  }


  public ProjectRuleInfo effectiveStartDate(String effectiveStartDate) {
    
    this.effectiveStartDate = effectiveStartDate;
    return this;
  }

   /**
   * 有效期起始
   * @return effectiveStartDate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021-03-01 19:00:00", value = "有效期起始")

  public String getEffectiveStartDate() {
    return effectiveStartDate;
  }


  public void setEffectiveStartDate(String effectiveStartDate) {
    this.effectiveStartDate = effectiveStartDate;
  }


  public ProjectRuleInfo employeeList(List<String> employeeList) {
    
    this.employeeList = employeeList;
    return this;
  }

  public ProjectRuleInfo addEmployeeListItem(String employeeListItem) {
    if (this.employeeList == null) {
      this.employeeList = new ArrayList<>();
    }
    this.employeeList.add(employeeListItem);
    return this;
  }

   /**
   * 切换open_id前请使用此字段：员工uid列表
   * @return employeeList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"2088123412341234\"]", value = "切换open_id前请使用此字段：员工uid列表")

  public List<String> getEmployeeList() {
    return employeeList;
  }


  public void setEmployeeList(List<String> employeeList) {
    this.employeeList = employeeList;
  }


  public ProjectRuleInfo employeeOpenIdList(List<String> employeeOpenIdList) {
    
    this.employeeOpenIdList = employeeOpenIdList;
    return this;
  }

  public ProjectRuleInfo addEmployeeOpenIdListItem(String employeeOpenIdListItem) {
    if (this.employeeOpenIdList == null) {
      this.employeeOpenIdList = new ArrayList<>();
    }
    this.employeeOpenIdList.add(employeeOpenIdListItem);
    return this;
  }

   /**
   * 切换open_id后请使用此字段：员工open_id列表
   * @return employeeOpenIdList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"abcdxxxx\"]", value = "切换open_id后请使用此字段：员工open_id列表")

  public List<String> getEmployeeOpenIdList() {
    return employeeOpenIdList;
  }


  public void setEmployeeOpenIdList(List<String> employeeOpenIdList) {
    this.employeeOpenIdList = employeeOpenIdList;
  }


  public ProjectRuleInfo expenseCtrlRuleInfoGroupList(List<ExpenseCtrRuleGroupInfo> expenseCtrlRuleInfoGroupList) {
    
    this.expenseCtrlRuleInfoGroupList = expenseCtrlRuleInfoGroupList;
    return this;
  }

  public ProjectRuleInfo addExpenseCtrlRuleInfoGroupListItem(ExpenseCtrRuleGroupInfo expenseCtrlRuleInfoGroupListItem) {
    if (this.expenseCtrlRuleInfoGroupList == null) {
      this.expenseCtrlRuleInfoGroupList = new ArrayList<>();
    }
    this.expenseCtrlRuleInfoGroupList.add(expenseCtrlRuleInfoGroupListItem);
    return this;
  }

   /**
   * 规则组列表
   * @return expenseCtrlRuleInfoGroupList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "规则组列表")

  public List<ExpenseCtrRuleGroupInfo> getExpenseCtrlRuleInfoGroupList() {
    return expenseCtrlRuleInfoGroupList;
  }


  public void setExpenseCtrlRuleInfoGroupList(List<ExpenseCtrRuleGroupInfo> expenseCtrlRuleInfoGroupList) {
    this.expenseCtrlRuleInfoGroupList = expenseCtrlRuleInfoGroupList;
  }


  public ProjectRuleInfo projectId(String projectId) {
    
    this.projectId = projectId;
    return this;
  }

   /**
   * 项目id
   * @return projectId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1100", value = "项目id")

  public String getProjectId() {
    return projectId;
  }


  public void setProjectId(String projectId) {
    this.projectId = projectId;
  }


  public ProjectRuleInfo projectName(String projectName) {
    
    this.projectName = projectName;
    return this;
  }

   /**
   * 项目名称
   * @return projectName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "费控项目", value = "项目名称")

  public String getProjectName() {
    return projectName;
  }


  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectRuleInfo projectRuleInfo = (ProjectRuleInfo) o;
    return Objects.equals(this.effectiveEndDate, projectRuleInfo.effectiveEndDate) &&
        Objects.equals(this.effectiveStartDate, projectRuleInfo.effectiveStartDate) &&
        Objects.equals(this.employeeList, projectRuleInfo.employeeList) &&
        Objects.equals(this.employeeOpenIdList, projectRuleInfo.employeeOpenIdList) &&
        Objects.equals(this.expenseCtrlRuleInfoGroupList, projectRuleInfo.expenseCtrlRuleInfoGroupList) &&
        Objects.equals(this.projectId, projectRuleInfo.projectId) &&
        Objects.equals(this.projectName, projectRuleInfo.projectName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(effectiveEndDate, effectiveStartDate, employeeList, employeeOpenIdList, expenseCtrlRuleInfoGroupList, projectId, projectName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectRuleInfo {\n");
    sb.append("    effectiveEndDate: ").append(toIndentedString(effectiveEndDate)).append("\n");
    sb.append("    effectiveStartDate: ").append(toIndentedString(effectiveStartDate)).append("\n");
    sb.append("    employeeList: ").append(toIndentedString(employeeList)).append("\n");
    sb.append("    employeeOpenIdList: ").append(toIndentedString(employeeOpenIdList)).append("\n");
    sb.append("    expenseCtrlRuleInfoGroupList: ").append(toIndentedString(expenseCtrlRuleInfoGroupList)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
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
    openapiFields.add("effective_end_date");
    openapiFields.add("effective_start_date");
    openapiFields.add("employee_list");
    openapiFields.add("employee_open_id_list");
    openapiFields.add("expense_ctrl_rule_info_group_list");
    openapiFields.add("project_id");
    openapiFields.add("project_name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProjectRuleInfo
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ProjectRuleInfo.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProjectRuleInfo is not found in the empty JSON string", ProjectRuleInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ProjectRuleInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProjectRuleInfo` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("effective_end_date") != null && !jsonObj.get("effective_end_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `effective_end_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("effective_end_date").toString()));
      }
      if (jsonObj.get("effective_start_date") != null && !jsonObj.get("effective_start_date").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `effective_start_date` to be a primitive type in the JSON string but got `%s`", jsonObj.get("effective_start_date").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("employee_list") != null && !jsonObj.get("employee_list").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `employee_list` to be an array in the JSON string but got `%s`", jsonObj.get("employee_list").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("employee_open_id_list") != null && !jsonObj.get("employee_open_id_list").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `employee_open_id_list` to be an array in the JSON string but got `%s`", jsonObj.get("employee_open_id_list").toString()));
      }
      JsonArray jsonArrayexpenseCtrlRuleInfoGroupList = jsonObj.getAsJsonArray("expense_ctrl_rule_info_group_list");
      if (jsonArrayexpenseCtrlRuleInfoGroupList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("expense_ctrl_rule_info_group_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `expense_ctrl_rule_info_group_list` to be an array in the JSON string but got `%s`", jsonObj.get("expense_ctrl_rule_info_group_list").toString()));
        }

        // validate the optional field `expense_ctrl_rule_info_group_list` (array)
        for (int i = 0; i < jsonArrayexpenseCtrlRuleInfoGroupList.size(); i++) {
          ExpenseCtrRuleGroupInfo.validateJsonObject(jsonArrayexpenseCtrlRuleInfoGroupList.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("project_id") != null && !jsonObj.get("project_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `project_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("project_id").toString()));
      }
      if (jsonObj.get("project_name") != null && !jsonObj.get("project_name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `project_name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("project_name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProjectRuleInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProjectRuleInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProjectRuleInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProjectRuleInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<ProjectRuleInfo>() {
           @Override
           public void write(JsonWriter out, ProjectRuleInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProjectRuleInfo read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProjectRuleInfo given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProjectRuleInfo
  * @throws IOException if the JSON string is invalid with respect to ProjectRuleInfo
  */
  public static ProjectRuleInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProjectRuleInfo.class);
  }

 /**
  * Convert an instance of ProjectRuleInfo to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

