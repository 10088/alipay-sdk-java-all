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
import com.alipay.v3.model.ItemConsultRequest;
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
 * AlipayMarketingCampaignOrderVoucherConsultModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayMarketingCampaignOrderVoucherConsultModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_BUSINESS_PARAM = "business_param";
  @SerializedName(SERIALIZED_NAME_BUSINESS_PARAM)
  private String businessParam;

  public static final String SERIALIZED_NAME_ITEM_CONSULT_LIST = "item_consult_list";
  @SerializedName(SERIALIZED_NAME_ITEM_CONSULT_LIST)
  private List<ItemConsultRequest> itemConsultList = null;

  public static final String SERIALIZED_NAME_ORDER_AMOUNT = "order_amount";
  @SerializedName(SERIALIZED_NAME_ORDER_AMOUNT)
  private String orderAmount;

  public static final String SERIALIZED_NAME_SCENE_CODE = "scene_code";
  @SerializedName(SERIALIZED_NAME_SCENE_CODE)
  private List<String> sceneCode = null;

  public static final String SERIALIZED_NAME_SPECIFIED_APP_ID = "specified_app_id";
  @SerializedName(SERIALIZED_NAME_SPECIFIED_APP_ID)
  private String specifiedAppId;

  public AlipayMarketingCampaignOrderVoucherConsultModel() { 
  }

  public AlipayMarketingCampaignOrderVoucherConsultModel businessParam(String businessParam) {
    
    this.businessParam = businessParam;
    return this;
  }

   /**
   * 业务参数大字段，优惠咨询的控制参数，json格式；目前支持传入useBigAmountSkipOrderThold为N来控制不使用大金额跳过优惠的订单门槛检查；默认不传；
   * @return businessParam
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"useBigAmountSkipOrderThold\":\"N\"}", value = "业务参数大字段，优惠咨询的控制参数，json格式；目前支持传入useBigAmountSkipOrderThold为N来控制不使用大金额跳过优惠的订单门槛检查；默认不传；")

  public String getBusinessParam() {
    return businessParam;
  }


  public void setBusinessParam(String businessParam) {
    this.businessParam = businessParam;
  }


  public AlipayMarketingCampaignOrderVoucherConsultModel itemConsultList(List<ItemConsultRequest> itemConsultList) {
    
    this.itemConsultList = itemConsultList;
    return this;
  }

  public AlipayMarketingCampaignOrderVoucherConsultModel addItemConsultListItem(ItemConsultRequest itemConsultListItem) {
    if (this.itemConsultList == null) {
      this.itemConsultList = new ArrayList<>();
    }
    this.itemConsultList.add(itemConsultListItem);
    return this;
  }

   /**
   * 商品咨询请求列表（当需要咨询单品券时必传，如果某商品不希望参与本次单品优惠咨询则不传递对应信息即可）
   * @return itemConsultList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商品咨询请求列表（当需要咨询单品券时必传，如果某商品不希望参与本次单品优惠咨询则不传递对应信息即可）")

  public List<ItemConsultRequest> getItemConsultList() {
    return itemConsultList;
  }


  public void setItemConsultList(List<ItemConsultRequest> itemConsultList) {
    this.itemConsultList = itemConsultList;
  }


  public AlipayMarketingCampaignOrderVoucherConsultModel orderAmount(String orderAmount) {
    
    this.orderAmount = orderAmount;
    return this;
  }

   /**
   * 订单金额（如同时享受商户自有优惠请先扣除后传入），单位为元，最多2位小数
   * @return orderAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "120.87", value = "订单金额（如同时享受商户自有优惠请先扣除后传入），单位为元，最多2位小数")

  public String getOrderAmount() {
    return orderAmount;
  }


  public void setOrderAmount(String orderAmount) {
    this.orderAmount = orderAmount;
  }


  public AlipayMarketingCampaignOrderVoucherConsultModel sceneCode(List<String> sceneCode) {
    
    this.sceneCode = sceneCode;
    return this;
  }

  public AlipayMarketingCampaignOrderVoucherConsultModel addSceneCodeItem(String sceneCodeItem) {
    if (this.sceneCode == null) {
      this.sceneCode = new ArrayList<>();
    }
    this.sceneCode.add(sceneCodeItem);
    return this;
  }

   /**
   * 场景码：默认(DEFAULT)
   * @return sceneCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[\"DEFAULT\"]", value = "场景码：默认(DEFAULT)")

  public List<String> getSceneCode() {
    return sceneCode;
  }


  public void setSceneCode(List<String> sceneCode) {
    this.sceneCode = sceneCode;
  }


  public AlipayMarketingCampaignOrderVoucherConsultModel specifiedAppId(String specifiedAppId) {
    
    this.specifiedAppId = specifiedAppId;
    return this;
  }

   /**
   * 券指定的核销appid（如果配券时指定了核销范围为线上小程序及相应的appid则此处必传）
   * @return specifiedAppId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021001159604390", value = "券指定的核销appid（如果配券时指定了核销范围为线上小程序及相应的appid则此处必传）")

  public String getSpecifiedAppId() {
    return specifiedAppId;
  }


  public void setSpecifiedAppId(String specifiedAppId) {
    this.specifiedAppId = specifiedAppId;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayMarketingCampaignOrderVoucherConsultModel alipayMarketingCampaignOrderVoucherConsultModel = (AlipayMarketingCampaignOrderVoucherConsultModel) o;
    return Objects.equals(this.businessParam, alipayMarketingCampaignOrderVoucherConsultModel.businessParam) &&
        Objects.equals(this.itemConsultList, alipayMarketingCampaignOrderVoucherConsultModel.itemConsultList) &&
        Objects.equals(this.orderAmount, alipayMarketingCampaignOrderVoucherConsultModel.orderAmount) &&
        Objects.equals(this.sceneCode, alipayMarketingCampaignOrderVoucherConsultModel.sceneCode) &&
        Objects.equals(this.specifiedAppId, alipayMarketingCampaignOrderVoucherConsultModel.specifiedAppId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessParam, itemConsultList, orderAmount, sceneCode, specifiedAppId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayMarketingCampaignOrderVoucherConsultModel {\n");
    sb.append("    businessParam: ").append(toIndentedString(businessParam)).append("\n");
    sb.append("    itemConsultList: ").append(toIndentedString(itemConsultList)).append("\n");
    sb.append("    orderAmount: ").append(toIndentedString(orderAmount)).append("\n");
    sb.append("    sceneCode: ").append(toIndentedString(sceneCode)).append("\n");
    sb.append("    specifiedAppId: ").append(toIndentedString(specifiedAppId)).append("\n");
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
    openapiFields.add("business_param");
    openapiFields.add("item_consult_list");
    openapiFields.add("order_amount");
    openapiFields.add("scene_code");
    openapiFields.add("specified_app_id");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayMarketingCampaignOrderVoucherConsultModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayMarketingCampaignOrderVoucherConsultModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayMarketingCampaignOrderVoucherConsultModel is not found in the empty JSON string", AlipayMarketingCampaignOrderVoucherConsultModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayMarketingCampaignOrderVoucherConsultModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayMarketingCampaignOrderVoucherConsultModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("business_param") != null && !jsonObj.get("business_param").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `business_param` to be a primitive type in the JSON string but got `%s`", jsonObj.get("business_param").toString()));
      }
      JsonArray jsonArrayitemConsultList = jsonObj.getAsJsonArray("item_consult_list");
      if (jsonArrayitemConsultList != null) {
        // ensure the json data is an array
        if (!jsonObj.get("item_consult_list").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `item_consult_list` to be an array in the JSON string but got `%s`", jsonObj.get("item_consult_list").toString()));
        }

        // validate the optional field `item_consult_list` (array)
        for (int i = 0; i < jsonArrayitemConsultList.size(); i++) {
          ItemConsultRequest.validateJsonObject(jsonArrayitemConsultList.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("order_amount") != null && !jsonObj.get("order_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_amount").toString()));
      }
      // ensure the json data is an array
      if (jsonObj.get("scene_code") != null && !jsonObj.get("scene_code").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `scene_code` to be an array in the JSON string but got `%s`", jsonObj.get("scene_code").toString()));
      }
      if (jsonObj.get("specified_app_id") != null && !jsonObj.get("specified_app_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `specified_app_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("specified_app_id").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayMarketingCampaignOrderVoucherConsultModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayMarketingCampaignOrderVoucherConsultModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayMarketingCampaignOrderVoucherConsultModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayMarketingCampaignOrderVoucherConsultModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayMarketingCampaignOrderVoucherConsultModel>() {
           @Override
           public void write(JsonWriter out, AlipayMarketingCampaignOrderVoucherConsultModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayMarketingCampaignOrderVoucherConsultModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayMarketingCampaignOrderVoucherConsultModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayMarketingCampaignOrderVoucherConsultModel
  * @throws IOException if the JSON string is invalid with respect to AlipayMarketingCampaignOrderVoucherConsultModel
  */
  public static AlipayMarketingCampaignOrderVoucherConsultModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayMarketingCampaignOrderVoucherConsultModel.class);
  }

 /**
  * Convert an instance of AlipayMarketingCampaignOrderVoucherConsultModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

