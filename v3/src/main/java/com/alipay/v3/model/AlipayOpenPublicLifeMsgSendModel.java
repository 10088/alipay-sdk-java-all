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
 * AlipayOpenPublicLifeMsgSendModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenPublicLifeMsgSendModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CATEGORY = "category";
  @SerializedName(SERIALIZED_NAME_CATEGORY)
  private String category;

  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private String content;

  public static final String SERIALIZED_NAME_DESC = "desc";
  @SerializedName(SERIALIZED_NAME_DESC)
  private String desc;

  public static final String SERIALIZED_NAME_MSG_TYPE = "msg_type";
  @SerializedName(SERIALIZED_NAME_MSG_TYPE)
  private String msgType;

  public static final String SERIALIZED_NAME_SOURCE_EXT_INFO = "source_ext_info";
  @SerializedName(SERIALIZED_NAME_SOURCE_EXT_INFO)
  private String sourceExtInfo;

  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_UNIQUE_MSG_ID = "unique_msg_id";
  @SerializedName(SERIALIZED_NAME_UNIQUE_MSG_ID)
  private String uniqueMsgId;

  public static final String SERIALIZED_NAME_VIDEO_LENGTH = "video_length";
  @SerializedName(SERIALIZED_NAME_VIDEO_LENGTH)
  private String videoLength;

  public static final String SERIALIZED_NAME_VIDEO_SAMPLES = "video_samples";
  @SerializedName(SERIALIZED_NAME_VIDEO_SAMPLES)
  private List<String> videoSamples = null;

  public static final String SERIALIZED_NAME_VIDEO_SIZE = "video_size";
  @SerializedName(SERIALIZED_NAME_VIDEO_SIZE)
  private String videoSize;

  public static final String SERIALIZED_NAME_VIDEO_SOURCE = "video_source";
  @SerializedName(SERIALIZED_NAME_VIDEO_SOURCE)
  private String videoSource;

  public static final String SERIALIZED_NAME_VIDEO_TEMPORARY_URL = "video_temporary_url";
  @SerializedName(SERIALIZED_NAME_VIDEO_TEMPORARY_URL)
  private String videoTemporaryUrl;

  public static final String SERIALIZED_NAME_VIDEO_URL = "video_url";
  @SerializedName(SERIALIZED_NAME_VIDEO_URL)
  private String videoUrl;

  public AlipayOpenPublicLifeMsgSendModel() { 
  }

  public AlipayOpenPublicLifeMsgSendModel category(String category) {
    
    this.category = category;
    return this;
  }

   /**
   * 消息分类，请传入对应分类编码值
   * @return category
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "c001", value = "消息分类，请传入对应分类编码值")

  public String getCategory() {
    return category;
  }


  public void setCategory(String category) {
    this.category = category;
  }


  public AlipayOpenPublicLifeMsgSendModel content(String content) {
    
    this.content = content;
    return this;
  }

   /**
   * 消息正文，html原文或纯文本
   * @return content
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "多云转晴，10°-21°", value = "消息正文，html原文或纯文本")

  public String getContent() {
    return content;
  }


  public void setContent(String content) {
    this.content = content;
  }


  public AlipayOpenPublicLifeMsgSendModel desc(String desc) {
    
    this.desc = desc;
    return this;
  }

   /**
   * 消息概述
   * @return desc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "多云转晴，13-21°", value = "消息概述")

  public String getDesc() {
    return desc;
  }


  public void setDesc(String desc) {
    this.desc = desc;
  }


  public AlipayOpenPublicLifeMsgSendModel msgType(String msgType) {
    
    this.msgType = msgType;
    return this;
  }

   /**
   * 媒体资讯类生活号消息类型
   * @return msgType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "IMAGE-CONTENT： 生活号新图文消息（单条），VIDEO：生活号视频消息（单条）", value = "媒体资讯类生活号消息类型")

  public String getMsgType() {
    return msgType;
  }


  public void setMsgType(String msgType) {
    this.msgType = msgType;
  }


  public AlipayOpenPublicLifeMsgSendModel sourceExtInfo(String sourceExtInfo) {
    
    this.sourceExtInfo = sourceExtInfo;
    return this;
  }

   /**
   * 消息来源方附属信息，供搜索、推荐使用  publish_time（int）：消息发布时间，单位秒  keyword_list（String）: 文章的标签列表，英文逗号分隔  comment（int）：消息来源处评论次数  reward（int）：消息来源处打赏次数  is_recommended（boolean）：消息在来源处是否被推荐  is_news（boolean）：消息是否实时性内容  read（int）：消息在来源处被阅读次数  like（int）：消息在来源处被点赞次数  is_hot（boolean）：消息在来源平台是否是热门内容  share（int）：文章在来源平台的分享次数  deadline（int）：文章的失效时间，单位秒
   * @return sourceExtInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"is_recommended\":\"true\",\"is_news\":\"true\"}", value = "消息来源方附属信息，供搜索、推荐使用  publish_time（int）：消息发布时间，单位秒  keyword_list（String）: 文章的标签列表，英文逗号分隔  comment（int）：消息来源处评论次数  reward（int）：消息来源处打赏次数  is_recommended（boolean）：消息在来源处是否被推荐  is_news（boolean）：消息是否实时性内容  read（int）：消息在来源处被阅读次数  like（int）：消息在来源处被点赞次数  is_hot（boolean）：消息在来源平台是否是热门内容  share（int）：文章在来源平台的分享次数  deadline（int）：文章的失效时间，单位秒")

  public String getSourceExtInfo() {
    return sourceExtInfo;
  }


  public void setSourceExtInfo(String sourceExtInfo) {
    this.sourceExtInfo = sourceExtInfo;
  }


  public AlipayOpenPublicLifeMsgSendModel title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * 消息标题
   * @return title
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "杭州天气预报", value = "消息标题")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public AlipayOpenPublicLifeMsgSendModel uniqueMsgId(String uniqueMsgId) {
    
    this.uniqueMsgId = uniqueMsgId;
    return this;
  }

   /**
   * 来源方消息唯一标识；若不为空，根据此id和生活号id对消息去重；若为空，不去重
   * @return uniqueMsgId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2016042810221362", value = "来源方消息唯一标识；若不为空，根据此id和生活号id对消息去重；若为空，不去重")

  public String getUniqueMsgId() {
    return uniqueMsgId;
  }


  public void setUniqueMsgId(String uniqueMsgId) {
    this.uniqueMsgId = uniqueMsgId;
  }


  public AlipayOpenPublicLifeMsgSendModel videoLength(String videoLength) {
    
    this.videoLength = videoLength;
    return this;
  }

   /**
   * 生活号消息视频时长，单位：秒（视频类消息必填）
   * @return videoLength
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "120", value = "生活号消息视频时长，单位：秒（视频类消息必填）")

  public String getVideoLength() {
    return videoLength;
  }


  public void setVideoLength(String videoLength) {
    this.videoLength = videoLength;
  }


  public AlipayOpenPublicLifeMsgSendModel videoSamples(List<String> videoSamples) {
    
    this.videoSamples = videoSamples;
    return this;
  }

  public AlipayOpenPublicLifeMsgSendModel addVideoSamplesItem(String videoSamplesItem) {
    if (this.videoSamples == null) {
      this.videoSamples = new ArrayList<>();
    }
    this.videoSamples.add(videoSamplesItem);
    return this;
  }

   /**
   * 视频类型消息中视频抽样关键帧截图，视频类消息选填
   * @return videoSamples
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://os.alipayobjects.com/rmsportal/SbMPIcOBQLFUXGg.jpg", value = "视频类型消息中视频抽样关键帧截图，视频类消息选填")

  public List<String> getVideoSamples() {
    return videoSamples;
  }


  public void setVideoSamples(List<String> videoSamples) {
    this.videoSamples = videoSamples;
  }


  public AlipayOpenPublicLifeMsgSendModel videoSize(String videoSize) {
    
    this.videoSize = videoSize;
    return this;
  }

   /**
   * 视频大小，单位：KB（视频类消息必填）
   * @return videoSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1024", value = "视频大小，单位：KB（视频类消息必填）")

  public String getVideoSize() {
    return videoSize;
  }


  public void setVideoSize(String videoSize) {
    this.videoSize = videoSize;
  }


  public AlipayOpenPublicLifeMsgSendModel videoSource(String videoSource) {
    
    this.videoSource = videoSource;
    return this;
  }

   /**
   * 视频资源来源id（视频类消息必填），取值限定youku, miaopai, taobao, sina中的一个
   * @return videoSource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "youku", value = "视频资源来源id（视频类消息必填），取值限定youku, miaopai, taobao, sina中的一个")

  public String getVideoSource() {
    return videoSource;
  }


  public void setVideoSource(String videoSource) {
    this.videoSource = videoSource;
  }


  public AlipayOpenPublicLifeMsgSendModel videoTemporaryUrl(String videoTemporaryUrl) {
    
    this.videoTemporaryUrl = videoTemporaryUrl;
    return this;
  }

   /**
   * 视频的临时链接（优酷来源的视频消息，该字段不能为空）
   * @return videoTemporaryUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://openhome.alipay.com/platform/home.htm", value = "视频的临时链接（优酷来源的视频消息，该字段不能为空）")

  public String getVideoTemporaryUrl() {
    return videoTemporaryUrl;
  }


  public void setVideoTemporaryUrl(String videoTemporaryUrl) {
    this.videoTemporaryUrl = videoTemporaryUrl;
  }


  public AlipayOpenPublicLifeMsgSendModel videoUrl(String videoUrl) {
    
    this.videoUrl = videoUrl;
    return this;
  }

   /**
   * 生活号视频类消息视频id或url（视频类消息必填，根据来源区分）
   * @return videoUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://open.alipay.com/platform/home.htm", value = "生活号视频类消息视频id或url（视频类消息必填，根据来源区分）")

  public String getVideoUrl() {
    return videoUrl;
  }


  public void setVideoUrl(String videoUrl) {
    this.videoUrl = videoUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenPublicLifeMsgSendModel alipayOpenPublicLifeMsgSendModel = (AlipayOpenPublicLifeMsgSendModel) o;
    return Objects.equals(this.category, alipayOpenPublicLifeMsgSendModel.category) &&
        Objects.equals(this.content, alipayOpenPublicLifeMsgSendModel.content) &&
        Objects.equals(this.desc, alipayOpenPublicLifeMsgSendModel.desc) &&
        Objects.equals(this.msgType, alipayOpenPublicLifeMsgSendModel.msgType) &&
        Objects.equals(this.sourceExtInfo, alipayOpenPublicLifeMsgSendModel.sourceExtInfo) &&
        Objects.equals(this.title, alipayOpenPublicLifeMsgSendModel.title) &&
        Objects.equals(this.uniqueMsgId, alipayOpenPublicLifeMsgSendModel.uniqueMsgId) &&
        Objects.equals(this.videoLength, alipayOpenPublicLifeMsgSendModel.videoLength) &&
        Objects.equals(this.videoSamples, alipayOpenPublicLifeMsgSendModel.videoSamples) &&
        Objects.equals(this.videoSize, alipayOpenPublicLifeMsgSendModel.videoSize) &&
        Objects.equals(this.videoSource, alipayOpenPublicLifeMsgSendModel.videoSource) &&
        Objects.equals(this.videoTemporaryUrl, alipayOpenPublicLifeMsgSendModel.videoTemporaryUrl) &&
        Objects.equals(this.videoUrl, alipayOpenPublicLifeMsgSendModel.videoUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(category, content, desc, msgType, sourceExtInfo, title, uniqueMsgId, videoLength, videoSamples, videoSize, videoSource, videoTemporaryUrl, videoUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenPublicLifeMsgSendModel {\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    msgType: ").append(toIndentedString(msgType)).append("\n");
    sb.append("    sourceExtInfo: ").append(toIndentedString(sourceExtInfo)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    uniqueMsgId: ").append(toIndentedString(uniqueMsgId)).append("\n");
    sb.append("    videoLength: ").append(toIndentedString(videoLength)).append("\n");
    sb.append("    videoSamples: ").append(toIndentedString(videoSamples)).append("\n");
    sb.append("    videoSize: ").append(toIndentedString(videoSize)).append("\n");
    sb.append("    videoSource: ").append(toIndentedString(videoSource)).append("\n");
    sb.append("    videoTemporaryUrl: ").append(toIndentedString(videoTemporaryUrl)).append("\n");
    sb.append("    videoUrl: ").append(toIndentedString(videoUrl)).append("\n");
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
    openapiFields.add("category");
    openapiFields.add("content");
    openapiFields.add("desc");
    openapiFields.add("msg_type");
    openapiFields.add("source_ext_info");
    openapiFields.add("title");
    openapiFields.add("unique_msg_id");
    openapiFields.add("video_length");
    openapiFields.add("video_samples");
    openapiFields.add("video_size");
    openapiFields.add("video_source");
    openapiFields.add("video_temporary_url");
    openapiFields.add("video_url");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenPublicLifeMsgSendModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenPublicLifeMsgSendModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenPublicLifeMsgSendModel is not found in the empty JSON string", AlipayOpenPublicLifeMsgSendModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenPublicLifeMsgSendModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenPublicLifeMsgSendModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("category") != null && !jsonObj.get("category").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `category` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category").toString()));
      }
      if (jsonObj.get("content") != null && !jsonObj.get("content").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `content` to be a primitive type in the JSON string but got `%s`", jsonObj.get("content").toString()));
      }
      if (jsonObj.get("desc") != null && !jsonObj.get("desc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `desc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("desc").toString()));
      }
      if (jsonObj.get("msg_type") != null && !jsonObj.get("msg_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `msg_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("msg_type").toString()));
      }
      if (jsonObj.get("source_ext_info") != null && !jsonObj.get("source_ext_info").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source_ext_info` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source_ext_info").toString()));
      }
      if (jsonObj.get("title") != null && !jsonObj.get("title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("title").toString()));
      }
      if (jsonObj.get("unique_msg_id") != null && !jsonObj.get("unique_msg_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `unique_msg_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("unique_msg_id").toString()));
      }
      if (jsonObj.get("video_length") != null && !jsonObj.get("video_length").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `video_length` to be a primitive type in the JSON string but got `%s`", jsonObj.get("video_length").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("video_samples") != null && !jsonObj.get("video_samples").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `video_samples` to be an array in the JSON string but got `%s`", jsonObj.get("video_samples").toString()));
      }
      if (jsonObj.get("video_size") != null && !jsonObj.get("video_size").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `video_size` to be a primitive type in the JSON string but got `%s`", jsonObj.get("video_size").toString()));
      }
      if (jsonObj.get("video_source") != null && !jsonObj.get("video_source").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `video_source` to be a primitive type in the JSON string but got `%s`", jsonObj.get("video_source").toString()));
      }
      if (jsonObj.get("video_temporary_url") != null && !jsonObj.get("video_temporary_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `video_temporary_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("video_temporary_url").toString()));
      }
      if (jsonObj.get("video_url") != null && !jsonObj.get("video_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `video_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("video_url").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenPublicLifeMsgSendModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenPublicLifeMsgSendModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenPublicLifeMsgSendModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenPublicLifeMsgSendModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenPublicLifeMsgSendModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenPublicLifeMsgSendModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenPublicLifeMsgSendModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenPublicLifeMsgSendModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenPublicLifeMsgSendModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenPublicLifeMsgSendModel
  */
  public static AlipayOpenPublicLifeMsgSendModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenPublicLifeMsgSendModel.class);
  }

 /**
  * Convert an instance of AlipayOpenPublicLifeMsgSendModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

