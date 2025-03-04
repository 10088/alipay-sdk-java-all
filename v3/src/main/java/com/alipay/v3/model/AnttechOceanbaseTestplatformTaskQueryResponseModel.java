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
 * AnttechOceanbaseTestplatformTaskQueryResponseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AnttechOceanbaseTestplatformTaskQueryResponseModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_BRANCH = "branch";
  @SerializedName(SERIALIZED_NAME_BRANCH)
  private String branch;

  public static final String SERIALIZED_NAME_COMMIT_ID = "commit_id";
  @SerializedName(SERIALIZED_NAME_COMMIT_ID)
  private String commitId;

  public static final String SERIALIZED_NAME_CURRENT_RETRY = "current_retry";
  @SerializedName(SERIALIZED_NAME_CURRENT_RETRY)
  private String currentRetry;

  public static final String SERIALIZED_NAME_GIT_REPO = "git_repo";
  @SerializedName(SERIALIZED_NAME_GIT_REPO)
  private String gitRepo;

  public static final String SERIALIZED_NAME_GMT_CREATE = "gmt_create";
  @SerializedName(SERIALIZED_NAME_GMT_CREATE)
  private String gmtCreate;

  public static final String SERIALIZED_NAME_PLAYER = "player";
  @SerializedName(SERIALIZED_NAME_PLAYER)
  private String player;

  public static final String SERIALIZED_NAME_RESULT_TYPE = "result_type";
  @SerializedName(SERIALIZED_NAME_RESULT_TYPE)
  private Integer resultType;

  public static final String SERIALIZED_NAME_TASK_ID = "task_id";
  @SerializedName(SERIALIZED_NAME_TASK_ID)
  private Integer taskId;

  public static final String SERIALIZED_NAME_TEST_CASES = "test_cases";
  @SerializedName(SERIALIZED_NAME_TEST_CASES)
  private String testCases;

  public static final String SERIALIZED_NAME_TEST_INFO = "test_info";
  @SerializedName(SERIALIZED_NAME_TEST_INFO)
  private String testInfo;

  public static final String SERIALIZED_NAME_TEST_SUITE = "test_suite";
  @SerializedName(SERIALIZED_NAME_TEST_SUITE)
  private String testSuite;

  public AnttechOceanbaseTestplatformTaskQueryResponseModel() { 
  }

  public AnttechOceanbaseTestplatformTaskQueryResponseModel branch(String branch) {
    
    this.branch = branch;
    return this;
  }

   /**
   * 提测代码的分支
   * @return branch
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "test-miniob", value = "提测代码的分支")

  public String getBranch() {
    return branch;
  }


  public void setBranch(String branch) {
    this.branch = branch;
  }


  public AnttechOceanbaseTestplatformTaskQueryResponseModel commitId(String commitId) {
    
    this.commitId = commitId;
    return this;
  }

   /**
   * 提测代码仓库的commit id
   * @return commitId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "586cbbe560dff2792dcc76e5705367b21fa1df5d", value = "提测代码仓库的commit id")

  public String getCommitId() {
    return commitId;
  }


  public void setCommitId(String commitId) {
    this.commitId = commitId;
  }


  public AnttechOceanbaseTestplatformTaskQueryResponseModel currentRetry(String currentRetry) {
    
    this.currentRetry = currentRetry;
    return this;
  }

   /**
   * 当前任务的运行（重试）次数
   * @return currentRetry
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "当前任务的运行（重试）次数")

  public String getCurrentRetry() {
    return currentRetry;
  }


  public void setCurrentRetry(String currentRetry) {
    this.currentRetry = currentRetry;
  }


  public AnttechOceanbaseTestplatformTaskQueryResponseModel gitRepo(String gitRepo) {
    
    this.gitRepo = gitRepo;
    return this;
  }

   /**
   * 代码仓库的url
   * @return gitRepo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://github.com/oceanbase/oceanbase.git", value = "代码仓库的url")

  public String getGitRepo() {
    return gitRepo;
  }


  public void setGitRepo(String gitRepo) {
    this.gitRepo = gitRepo;
  }


  public AnttechOceanbaseTestplatformTaskQueryResponseModel gmtCreate(String gmtCreate) {
    
    this.gmtCreate = gmtCreate;
    return this;
  }

   /**
   * 任务创建的时间戳
   * @return gmtCreate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2022-04-15 18:36:24", value = "任务创建的时间戳")

  public String getGmtCreate() {
    return gmtCreate;
  }


  public void setGmtCreate(String gmtCreate) {
    this.gmtCreate = gmtCreate;
  }


  public AnttechOceanbaseTestplatformTaskQueryResponseModel player(String player) {
    
    this.player = player;
    return this;
  }

   /**
   * 参赛选手的名字
   * @return player
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "无名选手", value = "参赛选手的名字")

  public String getPlayer() {
    return player;
  }


  public void setPlayer(String player) {
    this.player = player;
  }


  public AnttechOceanbaseTestplatformTaskQueryResponseModel resultType(Integer resultType) {
    
    this.resultType = resultType;
    return this;
  }

   /**
   * 提测结果类型 默认1
   * @return resultType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "提测结果类型 默认1")

  public Integer getResultType() {
    return resultType;
  }


  public void setResultType(Integer resultType) {
    this.resultType = resultType;
  }


  public AnttechOceanbaseTestplatformTaskQueryResponseModel taskId(Integer taskId) {
    
    this.taskId = taskId;
    return this;
  }

   /**
   * 测试任务的Id
   * @return taskId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "测试任务的Id")

  public Integer getTaskId() {
    return taskId;
  }


  public void setTaskId(Integer taskId) {
    this.taskId = taskId;
  }


  public AnttechOceanbaseTestplatformTaskQueryResponseModel testCases(String testCases) {
    
    this.testCases = testCases;
    return this;
  }

   /**
   * 二级提测题目
   * @return testCases
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "查询元数据校验select-meta", value = "二级提测题目")

  public String getTestCases() {
    return testCases;
  }


  public void setTestCases(String testCases) {
    this.testCases = testCases;
  }


  public AnttechOceanbaseTestplatformTaskQueryResponseModel testInfo(String testInfo) {
    
    this.testInfo = testInfo;
    return this;
  }

   /**
   * 测试题目
   * @return testInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "必做。查询语句中存在不存在的列名、表名等，需要返回失败。需要检查代码，判断是否需要返回错误的地方都返回错误了。", value = "测试题目")

  public String getTestInfo() {
    return testInfo;
  }


  public void setTestInfo(String testInfo) {
    this.testInfo = testInfo;
  }


  public AnttechOceanbaseTestplatformTaskQueryResponseModel testSuite(String testSuite) {
    
    this.testSuite = testSuite;
    return this;
  }

   /**
   * 一级提测题目
   * @return testSuite
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "mini-ob", value = "一级提测题目")

  public String getTestSuite() {
    return testSuite;
  }


  public void setTestSuite(String testSuite) {
    this.testSuite = testSuite;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AnttechOceanbaseTestplatformTaskQueryResponseModel anttechOceanbaseTestplatformTaskQueryResponseModel = (AnttechOceanbaseTestplatformTaskQueryResponseModel) o;
    return Objects.equals(this.branch, anttechOceanbaseTestplatformTaskQueryResponseModel.branch) &&
        Objects.equals(this.commitId, anttechOceanbaseTestplatformTaskQueryResponseModel.commitId) &&
        Objects.equals(this.currentRetry, anttechOceanbaseTestplatformTaskQueryResponseModel.currentRetry) &&
        Objects.equals(this.gitRepo, anttechOceanbaseTestplatformTaskQueryResponseModel.gitRepo) &&
        Objects.equals(this.gmtCreate, anttechOceanbaseTestplatformTaskQueryResponseModel.gmtCreate) &&
        Objects.equals(this.player, anttechOceanbaseTestplatformTaskQueryResponseModel.player) &&
        Objects.equals(this.resultType, anttechOceanbaseTestplatformTaskQueryResponseModel.resultType) &&
        Objects.equals(this.taskId, anttechOceanbaseTestplatformTaskQueryResponseModel.taskId) &&
        Objects.equals(this.testCases, anttechOceanbaseTestplatformTaskQueryResponseModel.testCases) &&
        Objects.equals(this.testInfo, anttechOceanbaseTestplatformTaskQueryResponseModel.testInfo) &&
        Objects.equals(this.testSuite, anttechOceanbaseTestplatformTaskQueryResponseModel.testSuite);
  }

  @Override
  public int hashCode() {
    return Objects.hash(branch, commitId, currentRetry, gitRepo, gmtCreate, player, resultType, taskId, testCases, testInfo, testSuite);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AnttechOceanbaseTestplatformTaskQueryResponseModel {\n");
    sb.append("    branch: ").append(toIndentedString(branch)).append("\n");
    sb.append("    commitId: ").append(toIndentedString(commitId)).append("\n");
    sb.append("    currentRetry: ").append(toIndentedString(currentRetry)).append("\n");
    sb.append("    gitRepo: ").append(toIndentedString(gitRepo)).append("\n");
    sb.append("    gmtCreate: ").append(toIndentedString(gmtCreate)).append("\n");
    sb.append("    player: ").append(toIndentedString(player)).append("\n");
    sb.append("    resultType: ").append(toIndentedString(resultType)).append("\n");
    sb.append("    taskId: ").append(toIndentedString(taskId)).append("\n");
    sb.append("    testCases: ").append(toIndentedString(testCases)).append("\n");
    sb.append("    testInfo: ").append(toIndentedString(testInfo)).append("\n");
    sb.append("    testSuite: ").append(toIndentedString(testSuite)).append("\n");
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
    openapiFields.add("branch");
    openapiFields.add("commit_id");
    openapiFields.add("current_retry");
    openapiFields.add("git_repo");
    openapiFields.add("gmt_create");
    openapiFields.add("player");
    openapiFields.add("result_type");
    openapiFields.add("task_id");
    openapiFields.add("test_cases");
    openapiFields.add("test_info");
    openapiFields.add("test_suite");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AnttechOceanbaseTestplatformTaskQueryResponseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AnttechOceanbaseTestplatformTaskQueryResponseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AnttechOceanbaseTestplatformTaskQueryResponseModel is not found in the empty JSON string", AnttechOceanbaseTestplatformTaskQueryResponseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AnttechOceanbaseTestplatformTaskQueryResponseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AnttechOceanbaseTestplatformTaskQueryResponseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("branch") != null && !jsonObj.get("branch").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `branch` to be a primitive type in the JSON string but got `%s`", jsonObj.get("branch").toString()));
      }
      if (jsonObj.get("commit_id") != null && !jsonObj.get("commit_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `commit_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("commit_id").toString()));
      }
      if (jsonObj.get("current_retry") != null && !jsonObj.get("current_retry").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `current_retry` to be a primitive type in the JSON string but got `%s`", jsonObj.get("current_retry").toString()));
      }
      if (jsonObj.get("git_repo") != null && !jsonObj.get("git_repo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `git_repo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("git_repo").toString()));
      }
      if (jsonObj.get("gmt_create") != null && !jsonObj.get("gmt_create").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `gmt_create` to be a primitive type in the JSON string but got `%s`", jsonObj.get("gmt_create").toString()));
      }
      if (jsonObj.get("player") != null && !jsonObj.get("player").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `player` to be a primitive type in the JSON string but got `%s`", jsonObj.get("player").toString()));
      }
      if (jsonObj.get("test_cases") != null && !jsonObj.get("test_cases").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `test_cases` to be a primitive type in the JSON string but got `%s`", jsonObj.get("test_cases").toString()));
      }
      if (jsonObj.get("test_info") != null && !jsonObj.get("test_info").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `test_info` to be a primitive type in the JSON string but got `%s`", jsonObj.get("test_info").toString()));
      }
      if (jsonObj.get("test_suite") != null && !jsonObj.get("test_suite").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `test_suite` to be a primitive type in the JSON string but got `%s`", jsonObj.get("test_suite").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AnttechOceanbaseTestplatformTaskQueryResponseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AnttechOceanbaseTestplatformTaskQueryResponseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AnttechOceanbaseTestplatformTaskQueryResponseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AnttechOceanbaseTestplatformTaskQueryResponseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AnttechOceanbaseTestplatformTaskQueryResponseModel>() {
           @Override
           public void write(JsonWriter out, AnttechOceanbaseTestplatformTaskQueryResponseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AnttechOceanbaseTestplatformTaskQueryResponseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AnttechOceanbaseTestplatformTaskQueryResponseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AnttechOceanbaseTestplatformTaskQueryResponseModel
  * @throws IOException if the JSON string is invalid with respect to AnttechOceanbaseTestplatformTaskQueryResponseModel
  */
  public static AnttechOceanbaseTestplatformTaskQueryResponseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AnttechOceanbaseTestplatformTaskQueryResponseModel.class);
  }

 /**
  * Convert an instance of AnttechOceanbaseTestplatformTaskQueryResponseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

