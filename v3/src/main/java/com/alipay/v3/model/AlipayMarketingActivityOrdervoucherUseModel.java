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
import com.alipay.v3.model.GoodsDetailDTO;
import com.alipay.v3.model.VoucherUseDetailInfo;
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
 * AlipayMarketingActivityOrdervoucherUseModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayMarketingActivityOrdervoucherUseModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_BIZ_DT = "biz_dt";
  @SerializedName(SERIALIZED_NAME_BIZ_DT)
  private String bizDt;

  public static final String SERIALIZED_NAME_GOODS_DETAIL = "goods_detail";
  @SerializedName(SERIALIZED_NAME_GOODS_DETAIL)
  private List<GoodsDetailDTO> goodsDetail = null;

  public static final String SERIALIZED_NAME_MERCHANT_ACCESS_MODE = "merchant_access_mode";
  @SerializedName(SERIALIZED_NAME_MERCHANT_ACCESS_MODE)
  private String merchantAccessMode;

  public static final String SERIALIZED_NAME_OUT_BIZ_NO = "out_biz_no";
  @SerializedName(SERIALIZED_NAME_OUT_BIZ_NO)
  private String outBizNo;

  public static final String SERIALIZED_NAME_REAL_SHOP_ID = "real_shop_id";
  @SerializedName(SERIALIZED_NAME_REAL_SHOP_ID)
  private String realShopId;

  public static final String SERIALIZED_NAME_STORE_ID = "store_id";
  @SerializedName(SERIALIZED_NAME_STORE_ID)
  private String storeId;

  public static final String SERIALIZED_NAME_TOTAL_FEE = "total_fee";
  @SerializedName(SERIALIZED_NAME_TOTAL_FEE)
  private String totalFee;

  public static final String SERIALIZED_NAME_TRADE_CHANNEL = "trade_channel";
  @SerializedName(SERIALIZED_NAME_TRADE_CHANNEL)
  private String tradeChannel;

  public static final String SERIALIZED_NAME_TRADE_NO = "trade_no";
  @SerializedName(SERIALIZED_NAME_TRADE_NO)
  private String tradeNo;

  public static final String SERIALIZED_NAME_VOUCHER_USE_DETAIL_INFO = "voucher_use_detail_info";
  @SerializedName(SERIALIZED_NAME_VOUCHER_USE_DETAIL_INFO)
  private VoucherUseDetailInfo voucherUseDetailInfo;

  public AlipayMarketingActivityOrdervoucherUseModel() { 
  }

  public AlipayMarketingActivityOrdervoucherUseModel bizDt(String bizDt) {
    
    this.bizDt = bizDt;
    return this;
  }

   /**
   * 外部优惠券的核销时间，用于流水记录。 格式为：yyyy-MM-dd HH:mm:ss
   * @return bizDt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2017-01-01 00:00:01", value = "外部优惠券的核销时间，用于流水记录。 格式为：yyyy-MM-dd HH:mm:ss")

  public String getBizDt() {
    return bizDt;
  }


  public void setBizDt(String bizDt) {
    this.bizDt = bizDt;
  }


  public AlipayMarketingActivityOrdervoucherUseModel goodsDetail(List<GoodsDetailDTO> goodsDetail) {
    
    this.goodsDetail = goodsDetail;
    return this;
  }

  public AlipayMarketingActivityOrdervoucherUseModel addGoodsDetailItem(GoodsDetailDTO goodsDetailItem) {
    if (this.goodsDetail == null) {
      this.goodsDetail = new ArrayList<>();
    }
    this.goodsDetail.add(goodsDetailItem);
    return this;
  }

   /**
   * 商品明细信息。    限制：  当前交易中存在商品信息，则建议传入商品明细信息。
   * @return goodsDetail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "商品明细信息。    限制：  当前交易中存在商品信息，则建议传入商品明细信息。")

  public List<GoodsDetailDTO> getGoodsDetail() {
    return goodsDetail;
  }


  public void setGoodsDetail(List<GoodsDetailDTO> goodsDetail) {
    this.goodsDetail = goodsDetail;
  }


  public AlipayMarketingActivityOrdervoucherUseModel merchantAccessMode(String merchantAccessMode) {
    
    this.merchantAccessMode = merchantAccessMode;
    return this;
  }

   /**
   * 商户接入模式  枚举值 SELF_MODE 商户自接入模式 AGENCY_MODE 服务商代接入模式
   * @return merchantAccessMode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "AGENCY_MODE", value = "商户接入模式  枚举值 SELF_MODE 商户自接入模式 AGENCY_MODE 服务商代接入模式")

  public String getMerchantAccessMode() {
    return merchantAccessMode;
  }


  public void setMerchantAccessMode(String merchantAccessMode) {
    this.merchantAccessMode = merchantAccessMode;
  }


  public AlipayMarketingActivityOrdervoucherUseModel outBizNo(String outBizNo) {
    
    this.outBizNo = outBizNo;
    return this;
  }

   /**
   * 外部业务单号，用作幂等控制。    幂等作用：  参数不变的情况下，再次请求返回与上一次相同的结果。    外部接入方需保证业务单号唯一。
   * @return outBizNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "20170101000001654bb46ba", value = "外部业务单号，用作幂等控制。    幂等作用：  参数不变的情况下，再次请求返回与上一次相同的结果。    外部接入方需保证业务单号唯一。")

  public String getOutBizNo() {
    return outBizNo;
  }


  public void setOutBizNo(String outBizNo) {
    this.outBizNo = outBizNo;
  }


  public AlipayMarketingActivityOrdervoucherUseModel realShopId(String realShopId) {
    
    this.realShopId = realShopId;
    return this;
  }

   /**
   * 用户核销优惠券的代运营商业关系门店id，调用接口alipay.business.relation.shop.create创建门店返回的real_shop_id。 限制: 传入的门店id必须是创建商家券voucher_use_rule. voucher_available_scope. order_voucher_available_shop对象中real_shop_ids中的门店id
   * @return realShopId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018051000502000000011111111", value = "用户核销优惠券的代运营商业关系门店id，调用接口alipay.business.relation.shop.create创建门店返回的real_shop_id。 限制: 传入的门店id必须是创建商家券voucher_use_rule. voucher_available_scope. order_voucher_available_shop对象中real_shop_ids中的门店id")

  public String getRealShopId() {
    return realShopId;
  }


  public void setRealShopId(String realShopId) {
    this.realShopId = realShopId;
  }


  public AlipayMarketingActivityOrdervoucherUseModel storeId(String storeId) {
    
    this.storeId = storeId;
    return this;
  }

   /**
   * 用户核销优惠券的支付门店id,调用接口ant.merchant.expand.shop.create创建门店返回的门店id。 限制: 传入的门店id必须是创建商家券voucher_use_rule. voucher_available_scope. order_voucher_available_shop对象中shop_ids中的门店id
   * @return storeId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2018051000502000000011111111", value = "用户核销优惠券的支付门店id,调用接口ant.merchant.expand.shop.create创建门店返回的门店id。 限制: 传入的门店id必须是创建商家券voucher_use_rule. voucher_available_scope. order_voucher_available_shop对象中shop_ids中的门店id")

  public String getStoreId() {
    return storeId;
  }


  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }


  public AlipayMarketingActivityOrdervoucherUseModel totalFee(String totalFee) {
    
    this.totalFee = totalFee;
    return this;
  }

   /**
   * 订单优惠前的总金额    限制：  该笔订单的资金总额，取值范围[0.01,100000000]，精确到小数点后2位。
   * @return totalFee
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "999.99", value = "订单优惠前的总金额    限制：  该笔订单的资金总额，取值范围[0.01,100000000]，精确到小数点后2位。")

  public String getTotalFee() {
    return totalFee;
  }


  public void setTotalFee(String totalFee) {
    this.totalFee = totalFee;
  }


  public AlipayMarketingActivityOrdervoucherUseModel tradeChannel(String tradeChannel) {
    
    this.tradeChannel = tradeChannel;
    return this;
  }

   /**
   * 交易渠道。    枚举值：  ZHIFUBAO_TRADE_CHANNEL：  支付宝交易渠道    WX_TRADE_CHANNEL：  微信交易渠道    OTHER_TRADE_CHANNEL：  其他交易渠道
   * @return tradeChannel
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ZHIFUBAO_TRADE_CHANNEL", value = "交易渠道。    枚举值：  ZHIFUBAO_TRADE_CHANNEL：  支付宝交易渠道    WX_TRADE_CHANNEL：  微信交易渠道    OTHER_TRADE_CHANNEL：  其他交易渠道")

  public String getTradeChannel() {
    return tradeChannel;
  }


  public void setTradeChannel(String tradeChannel) {
    this.tradeChannel = tradeChannel;
  }


  public AlipayMarketingActivityOrdervoucherUseModel tradeNo(String tradeNo) {
    
    this.tradeNo = tradeNo;
    return this;
  }

   /**
   * 该交易在支付宝系统中的交易流水号。 注意：若用户使用支付宝为交易的渠道，本参数必填。
   * @return tradeNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021042322001426261436764012", value = "该交易在支付宝系统中的交易流水号。 注意：若用户使用支付宝为交易的渠道，本参数必填。")

  public String getTradeNo() {
    return tradeNo;
  }


  public void setTradeNo(String tradeNo) {
    this.tradeNo = tradeNo;
  }


  public AlipayMarketingActivityOrdervoucherUseModel voucherUseDetailInfo(VoucherUseDetailInfo voucherUseDetailInfo) {
    
    this.voucherUseDetailInfo = voucherUseDetailInfo;
    return this;
  }

   /**
   * Get voucherUseDetailInfo
   * @return voucherUseDetailInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public VoucherUseDetailInfo getVoucherUseDetailInfo() {
    return voucherUseDetailInfo;
  }


  public void setVoucherUseDetailInfo(VoucherUseDetailInfo voucherUseDetailInfo) {
    this.voucherUseDetailInfo = voucherUseDetailInfo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayMarketingActivityOrdervoucherUseModel alipayMarketingActivityOrdervoucherUseModel = (AlipayMarketingActivityOrdervoucherUseModel) o;
    return Objects.equals(this.bizDt, alipayMarketingActivityOrdervoucherUseModel.bizDt) &&
        Objects.equals(this.goodsDetail, alipayMarketingActivityOrdervoucherUseModel.goodsDetail) &&
        Objects.equals(this.merchantAccessMode, alipayMarketingActivityOrdervoucherUseModel.merchantAccessMode) &&
        Objects.equals(this.outBizNo, alipayMarketingActivityOrdervoucherUseModel.outBizNo) &&
        Objects.equals(this.realShopId, alipayMarketingActivityOrdervoucherUseModel.realShopId) &&
        Objects.equals(this.storeId, alipayMarketingActivityOrdervoucherUseModel.storeId) &&
        Objects.equals(this.totalFee, alipayMarketingActivityOrdervoucherUseModel.totalFee) &&
        Objects.equals(this.tradeChannel, alipayMarketingActivityOrdervoucherUseModel.tradeChannel) &&
        Objects.equals(this.tradeNo, alipayMarketingActivityOrdervoucherUseModel.tradeNo) &&
        Objects.equals(this.voucherUseDetailInfo, alipayMarketingActivityOrdervoucherUseModel.voucherUseDetailInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(bizDt, goodsDetail, merchantAccessMode, outBizNo, realShopId, storeId, totalFee, tradeChannel, tradeNo, voucherUseDetailInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayMarketingActivityOrdervoucherUseModel {\n");
    sb.append("    bizDt: ").append(toIndentedString(bizDt)).append("\n");
    sb.append("    goodsDetail: ").append(toIndentedString(goodsDetail)).append("\n");
    sb.append("    merchantAccessMode: ").append(toIndentedString(merchantAccessMode)).append("\n");
    sb.append("    outBizNo: ").append(toIndentedString(outBizNo)).append("\n");
    sb.append("    realShopId: ").append(toIndentedString(realShopId)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    totalFee: ").append(toIndentedString(totalFee)).append("\n");
    sb.append("    tradeChannel: ").append(toIndentedString(tradeChannel)).append("\n");
    sb.append("    tradeNo: ").append(toIndentedString(tradeNo)).append("\n");
    sb.append("    voucherUseDetailInfo: ").append(toIndentedString(voucherUseDetailInfo)).append("\n");
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
    openapiFields.add("biz_dt");
    openapiFields.add("goods_detail");
    openapiFields.add("merchant_access_mode");
    openapiFields.add("out_biz_no");
    openapiFields.add("real_shop_id");
    openapiFields.add("store_id");
    openapiFields.add("total_fee");
    openapiFields.add("trade_channel");
    openapiFields.add("trade_no");
    openapiFields.add("voucher_use_detail_info");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayMarketingActivityOrdervoucherUseModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayMarketingActivityOrdervoucherUseModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayMarketingActivityOrdervoucherUseModel is not found in the empty JSON string", AlipayMarketingActivityOrdervoucherUseModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayMarketingActivityOrdervoucherUseModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayMarketingActivityOrdervoucherUseModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("biz_dt") != null && !jsonObj.get("biz_dt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biz_dt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biz_dt").toString()));
      }
      JsonArray jsonArraygoodsDetail = jsonObj.getAsJsonArray("goods_detail");
      if (jsonArraygoodsDetail != null) {
        // ensure the json data is an array
        if (!jsonObj.get("goods_detail").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `goods_detail` to be an array in the JSON string but got `%s`", jsonObj.get("goods_detail").toString()));
        }

        // validate the optional field `goods_detail` (array)
        for (int i = 0; i < jsonArraygoodsDetail.size(); i++) {
          GoodsDetailDTO.validateJsonObject(jsonArraygoodsDetail.get(i).getAsJsonObject());
        };
      }
      if (jsonObj.get("merchant_access_mode") != null && !jsonObj.get("merchant_access_mode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_access_mode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_access_mode").toString()));
      }
      if (jsonObj.get("out_biz_no") != null && !jsonObj.get("out_biz_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_biz_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_biz_no").toString()));
      }
      if (jsonObj.get("real_shop_id") != null && !jsonObj.get("real_shop_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `real_shop_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("real_shop_id").toString()));
      }
      if (jsonObj.get("store_id") != null && !jsonObj.get("store_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `store_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("store_id").toString()));
      }
      if (jsonObj.get("total_fee") != null && !jsonObj.get("total_fee").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `total_fee` to be a primitive type in the JSON string but got `%s`", jsonObj.get("total_fee").toString()));
      }
      if (jsonObj.get("trade_channel") != null && !jsonObj.get("trade_channel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trade_channel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trade_channel").toString()));
      }
      if (jsonObj.get("trade_no") != null && !jsonObj.get("trade_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trade_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trade_no").toString()));
      }
      // validate the optional field `voucher_use_detail_info`
      if (jsonObj.getAsJsonObject("voucher_use_detail_info") != null) {
        VoucherUseDetailInfo.validateJsonObject(jsonObj.getAsJsonObject("voucher_use_detail_info"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayMarketingActivityOrdervoucherUseModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayMarketingActivityOrdervoucherUseModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayMarketingActivityOrdervoucherUseModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayMarketingActivityOrdervoucherUseModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayMarketingActivityOrdervoucherUseModel>() {
           @Override
           public void write(JsonWriter out, AlipayMarketingActivityOrdervoucherUseModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayMarketingActivityOrdervoucherUseModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayMarketingActivityOrdervoucherUseModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayMarketingActivityOrdervoucherUseModel
  * @throws IOException if the JSON string is invalid with respect to AlipayMarketingActivityOrdervoucherUseModel
  */
  public static AlipayMarketingActivityOrdervoucherUseModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayMarketingActivityOrdervoucherUseModel.class);
  }

 /**
  * Convert an instance of AlipayMarketingActivityOrdervoucherUseModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

