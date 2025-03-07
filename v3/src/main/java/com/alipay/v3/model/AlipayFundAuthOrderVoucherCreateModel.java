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
 * AlipayFundAuthOrderVoucherCreateModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayFundAuthOrderVoucherCreateModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private String amount;

  public static final String SERIALIZED_NAME_BUSINESS_PARAMS = "business_params";
  @SerializedName(SERIALIZED_NAME_BUSINESS_PARAMS)
  private String businessParams;

  public static final String SERIALIZED_NAME_DISABLE_PAY_CHANNELS = "disable_pay_channels";
  @SerializedName(SERIALIZED_NAME_DISABLE_PAY_CHANNELS)
  private String disablePayChannels;

  public static final String SERIALIZED_NAME_ENABLE_PAY_CHANNELS = "enable_pay_channels";
  @SerializedName(SERIALIZED_NAME_ENABLE_PAY_CHANNELS)
  private String enablePayChannels;

  public static final String SERIALIZED_NAME_EXTRA_PARAM = "extra_param";
  @SerializedName(SERIALIZED_NAME_EXTRA_PARAM)
  private String extraParam;

  public static final String SERIALIZED_NAME_IDENTITY_PARAMS = "identity_params";
  @SerializedName(SERIALIZED_NAME_IDENTITY_PARAMS)
  private String identityParams;

  public static final String SERIALIZED_NAME_NOTIFY_URL = "notify_url";
  @SerializedName(SERIALIZED_NAME_NOTIFY_URL)
  private String notifyUrl;

  public static final String SERIALIZED_NAME_ORDER_TITLE = "order_title";
  @SerializedName(SERIALIZED_NAME_ORDER_TITLE)
  private String orderTitle;

  public static final String SERIALIZED_NAME_OUT_ORDER_NO = "out_order_no";
  @SerializedName(SERIALIZED_NAME_OUT_ORDER_NO)
  private String outOrderNo;

  public static final String SERIALIZED_NAME_OUT_REQUEST_NO = "out_request_no";
  @SerializedName(SERIALIZED_NAME_OUT_REQUEST_NO)
  private String outRequestNo;

  public static final String SERIALIZED_NAME_PAY_TIMEOUT = "pay_timeout";
  @SerializedName(SERIALIZED_NAME_PAY_TIMEOUT)
  private String payTimeout;

  public static final String SERIALIZED_NAME_PAYEE_LOGON_ID = "payee_logon_id";
  @SerializedName(SERIALIZED_NAME_PAYEE_LOGON_ID)
  private String payeeLogonId;

  public static final String SERIALIZED_NAME_PAYEE_USER_ID = "payee_user_id";
  @SerializedName(SERIALIZED_NAME_PAYEE_USER_ID)
  private String payeeUserId;

  public static final String SERIALIZED_NAME_PRODUCT_CODE = "product_code";
  @SerializedName(SERIALIZED_NAME_PRODUCT_CODE)
  private String productCode;

  public static final String SERIALIZED_NAME_SETTLE_CURRENCY = "settle_currency";
  @SerializedName(SERIALIZED_NAME_SETTLE_CURRENCY)
  private String settleCurrency;

  public static final String SERIALIZED_NAME_TIMEOUT_EXPRESS = "timeout_express";
  @SerializedName(SERIALIZED_NAME_TIMEOUT_EXPRESS)
  private String timeoutExpress;

  public static final String SERIALIZED_NAME_TRANS_CURRENCY = "trans_currency";
  @SerializedName(SERIALIZED_NAME_TRANS_CURRENCY)
  private String transCurrency;

  public AlipayFundAuthOrderVoucherCreateModel() { 
  }

  public AlipayFundAuthOrderVoucherCreateModel amount(String amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * 需要冻结的金额，单位为：元（人民币），精确到小数点后两位。 取值范围：[0.01,100000000.00]
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "100.00", value = "需要冻结的金额，单位为：元（人民币），精确到小数点后两位。 取值范围：[0.01,100000000.00]")

  public String getAmount() {
    return amount;
  }


  public void setAmount(String amount) {
    this.amount = amount;
  }


  public AlipayFundAuthOrderVoucherCreateModel businessParams(String businessParams) {
    
    this.businessParams = businessParams;
    return this;
  }

   /**
   * 业务参数，如风控参数outRiskInfo等。
   * @return businessParams
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"outRiskInfo\":\"{\\\"mcCreateTradeTime\\\":\\\"2022-03-11 12:46:09\\\",\\\"extraAccountCertnoLastSix\\\":\\\"000011\\\",\\\"mobileOperatingPlatform\\\":\\\"ios\\\",\\\"sysVersion\\\":\\\"15.4.2\\\",\\\"mcCreateTradeIp\\\":\\\"11.110.111.43\\\"}\"}", value = "业务参数，如风控参数outRiskInfo等。")

  public String getBusinessParams() {
    return businessParams;
  }


  public void setBusinessParams(String businessParams) {
    this.businessParams = businessParams;
  }


  public AlipayFundAuthOrderVoucherCreateModel disablePayChannels(String disablePayChannels) {
    
    this.disablePayChannels = disablePayChannels;
    return this;
  }

   /**
   * 无特殊需要请勿传入；商户可用该参数禁用支付渠道。 传入后用户不可使用列表中的渠道进行支付，目前支持两种禁用渠道：信用卡快捷（OPTIMIZED_MOTO）、信用卡卡通（BIGAMOUNT_CREDIT_CARTOON）。与可用支付渠道不能同时传入
   * @return disablePayChannels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"payChannelType\":\"OPTIMIZED_MOTO\"},{\"payChannelType\":\"BIGAMOUNT_CREDIT_CARTOON\"}]", value = "无特殊需要请勿传入；商户可用该参数禁用支付渠道。 传入后用户不可使用列表中的渠道进行支付，目前支持两种禁用渠道：信用卡快捷（OPTIMIZED_MOTO）、信用卡卡通（BIGAMOUNT_CREDIT_CARTOON）。与可用支付渠道不能同时传入")

  public String getDisablePayChannels() {
    return disablePayChannels;
  }


  public void setDisablePayChannels(String disablePayChannels) {
    this.disablePayChannels = disablePayChannels;
  }


  public AlipayFundAuthOrderVoucherCreateModel enablePayChannels(String enablePayChannels) {
    
    this.enablePayChannels = enablePayChannels;
    return this;
  }

   /**
   * 无特殊需要请勿传入；商户可用该参数指定支付渠道。 传入后用户仅能使用列表中的渠道进行支付，目前支持三种渠道，余额宝（MONEY_FUND）、花呗（PCREDIT_PAY）以及芝麻信用（CREDITZHIMA）。与禁用支付渠道不可同时传入
   * @return enablePayChannels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "[{\"payChannelType\":\"PCREDIT_PAY\"},{\"payChannelType\":\"MONEY_FUND\"}]", value = "无特殊需要请勿传入；商户可用该参数指定支付渠道。 传入后用户仅能使用列表中的渠道进行支付，目前支持三种渠道，余额宝（MONEY_FUND）、花呗（PCREDIT_PAY）以及芝麻信用（CREDITZHIMA）。与禁用支付渠道不可同时传入")

  public String getEnablePayChannels() {
    return enablePayChannels;
  }


  public void setEnablePayChannels(String enablePayChannels) {
    this.enablePayChannels = enablePayChannels;
  }


  public AlipayFundAuthOrderVoucherCreateModel extraParam(String extraParam) {
    
    this.extraParam = extraParam;
    return this;
  }

   /**
   * 业务扩展参数，用于特定业务信息的传递，json格式，key值如下： 1、category，信用类目，信用预授权场景必传，具体类目信息见https://opendocs.alipay.com/open/10719 2、serviceId，信用服务id，信用预授权场景必传，需要联系芝麻客服获取，https://cshall.alipay.com/enterprise/index.htm?sourceId&#x3D;pc_zhima（右上角“有问题点我”进入咨询） 3、creditExtInfo，信用参数，如有需要请与芝麻约定后传入，信用服务说明见https://opendocs.alipay.com/open/11157/qlsxya
   * @return extraParam
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"category\":\"CHARGE_PILE_CAR\",\"serviceId\":\"2020042800000000000001450466\"}", value = "业务扩展参数，用于特定业务信息的传递，json格式，key值如下： 1、category，信用类目，信用预授权场景必传，具体类目信息见https://opendocs.alipay.com/open/10719 2、serviceId，信用服务id，信用预授权场景必传，需要联系芝麻客服获取，https://cshall.alipay.com/enterprise/index.htm?sourceId=pc_zhima（右上角“有问题点我”进入咨询） 3、creditExtInfo，信用参数，如有需要请与芝麻约定后传入，信用服务说明见https://opendocs.alipay.com/open/11157/qlsxya")

  public String getExtraParam() {
    return extraParam;
  }


  public void setExtraParam(String extraParam) {
    this.extraParam = extraParam;
  }


  public AlipayFundAuthOrderVoucherCreateModel identityParams(String identityParams) {
    
    this.identityParams = identityParams;
    return this;
  }

   /**
   * 无特殊需要请勿传入；买家实名信息。 传入后支付宝会比对买家在支付宝端的实名信息。包含两个可选key： 1.identity_hash，买家姓名拼接身份证号后，使用SHA256摘要方式与UTF8编码后的hash值，返回的十六进制字符串，例如 “张三4566498798498498498498”对应的identity_hash应为“acc2b92ffc5ed9b472faa19748f10045c30434132784f774b00216a56b8841c6” 2.alipay_user_id，买家uid
   * @return identityParams
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"identity_hash\":\"acc2b92ffc5ed9b472faa19748f10045c30434132784f774b00216a56b8841c6\"}", value = "无特殊需要请勿传入；买家实名信息。 传入后支付宝会比对买家在支付宝端的实名信息。包含两个可选key： 1.identity_hash，买家姓名拼接身份证号后，使用SHA256摘要方式与UTF8编码后的hash值，返回的十六进制字符串，例如 “张三4566498798498498498498”对应的identity_hash应为“acc2b92ffc5ed9b472faa19748f10045c30434132784f774b00216a56b8841c6” 2.alipay_user_id，买家uid")

  public String getIdentityParams() {
    return identityParams;
  }


  public void setIdentityParams(String identityParams) {
    this.identityParams = identityParams;
  }


  public AlipayFundAuthOrderVoucherCreateModel notifyUrl(String notifyUrl) {
    
    this.notifyUrl = notifyUrl;
    return this;
  }

   /**
   * 通知地址
   * @return notifyUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "通知地址")

  public String getNotifyUrl() {
    return notifyUrl;
  }


  public void setNotifyUrl(String notifyUrl) {
    this.notifyUrl = notifyUrl;
  }


  public AlipayFundAuthOrderVoucherCreateModel orderTitle(String orderTitle) {
    
    this.orderTitle = orderTitle;
    return this;
  }

   /**
   * 订单标题。 业务订单的简单描述，如商品名称等
   * @return orderTitle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "预授权发码", value = "订单标题。 业务订单的简单描述，如商品名称等")

  public String getOrderTitle() {
    return orderTitle;
  }


  public void setOrderTitle(String orderTitle) {
    this.orderTitle = orderTitle;
  }


  public AlipayFundAuthOrderVoucherCreateModel outOrderNo(String outOrderNo) {
    
    this.outOrderNo = outOrderNo;
    return this;
  }

   /**
   * 商户授权资金订单号。 商家自定义需保证在商户端不重复。仅支持字母、数字、下划线。
   * @return outOrderNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8077735255938023", value = "商户授权资金订单号。 商家自定义需保证在商户端不重复。仅支持字母、数字、下划线。")

  public String getOutOrderNo() {
    return outOrderNo;
  }


  public void setOutOrderNo(String outOrderNo) {
    this.outOrderNo = outOrderNo;
  }


  public AlipayFundAuthOrderVoucherCreateModel outRequestNo(String outRequestNo) {
    
    this.outRequestNo = outRequestNo;
    return this;
  }

   /**
   * 商户本次资金操作的请求流水号，用于标示请求流水的唯一性。 可与out_order_no相同，仅支持字母、数字、下划线。
   * @return outRequestNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8077735255938032", value = "商户本次资金操作的请求流水号，用于标示请求流水的唯一性。 可与out_order_no相同，仅支持字母、数字、下划线。")

  public String getOutRequestNo() {
    return outRequestNo;
  }


  public void setOutRequestNo(String outRequestNo) {
    this.outRequestNo = outRequestNo;
  }


  public AlipayFundAuthOrderVoucherCreateModel payTimeout(String payTimeout) {
    
    this.payTimeout = payTimeout;
    return this;
  }

   /**
   * 预授权订单相对超时时间，从商户请求时间开始计算。 预授权订单允许的最晚授权时间，逾期将关闭该笔订单。取值范围：1m～15d。m-分钟，h-小时，d-天。 该参数数值不接受小数点， 如 1.5h，可转换为90m。 默认为15m。
   * @return payTimeout
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2d", value = "预授权订单相对超时时间，从商户请求时间开始计算。 预授权订单允许的最晚授权时间，逾期将关闭该笔订单。取值范围：1m～15d。m-分钟，h-小时，d-天。 该参数数值不接受小数点， 如 1.5h，可转换为90m。 默认为15m。")

  public String getPayTimeout() {
    return payTimeout;
  }


  public void setPayTimeout(String payTimeout) {
    this.payTimeout = payTimeout;
  }


  public AlipayFundAuthOrderVoucherCreateModel payeeLogonId(String payeeLogonId) {
    
    this.payeeLogonId = payeeLogonId;
    return this;
  }

   /**
   * 收款账户的支付宝登录号（email或手机号）。 如果传入则会校验该登录号对应的账号是否具备当前商户收款权限，如果商户希望用户能够使用花呗，则用户号(payee_user_id)和登录号(payee_logon_id)两者必须传入其一，二者无需同时传入
   * @return payeeLogonId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "159****5620", value = "收款账户的支付宝登录号（email或手机号）。 如果传入则会校验该登录号对应的账号是否具备当前商户收款权限，如果商户希望用户能够使用花呗，则用户号(payee_user_id)和登录号(payee_logon_id)两者必须传入其一，二者无需同时传入")

  public String getPayeeLogonId() {
    return payeeLogonId;
  }


  public void setPayeeLogonId(String payeeLogonId) {
    this.payeeLogonId = payeeLogonId;
  }


  public AlipayFundAuthOrderVoucherCreateModel payeeUserId(String payeeUserId) {
    
    this.payeeUserId = payeeUserId;
    return this;
  }

   /**
   * 收款账户的支付宝用户号。 以2088开头的16位纯数字，如果传入则会校验该账号是否具备当前商户收款权限，如果商户希望用户能够使用花呗，则用户号(payee_user_id)和登录号(payee_logon_id)两者必须传入其一，二者无需同时传入
   * @return payeeUserId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088102000275795", value = "收款账户的支付宝用户号。 以2088开头的16位纯数字，如果传入则会校验该账号是否具备当前商户收款权限，如果商户希望用户能够使用花呗，则用户号(payee_user_id)和登录号(payee_logon_id)两者必须传入其一，二者无需同时传入")

  public String getPayeeUserId() {
    return payeeUserId;
  }


  public void setPayeeUserId(String payeeUserId) {
    this.payeeUserId = payeeUserId;
  }


  public AlipayFundAuthOrderVoucherCreateModel productCode(String productCode) {
    
    this.productCode = productCode;
    return this;
  }

   /**
   * 销售产品码。 当面资金预授权固定为 PRE_AUTH
   * @return productCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PRE_AUTH", value = "销售产品码。 当面资金预授权固定为 PRE_AUTH")

  public String getProductCode() {
    return productCode;
  }


  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }


  public AlipayFundAuthOrderVoucherCreateModel settleCurrency(String settleCurrency) {
    
    this.settleCurrency = settleCurrency;
    return this;
  }

   /**
   * 商户指定的结算币种。支持澳元：AUD, 新西兰元：NZD, 台币：TWD, 美元：USD, 欧元：EUR, 英镑：GBP
   * @return settleCurrency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "USD", value = "商户指定的结算币种。支持澳元：AUD, 新西兰元：NZD, 台币：TWD, 美元：USD, 欧元：EUR, 英镑：GBP")

  public String getSettleCurrency() {
    return settleCurrency;
  }


  public void setSettleCurrency(String settleCurrency) {
    this.settleCurrency = settleCurrency;
  }


  public AlipayFundAuthOrderVoucherCreateModel timeoutExpress(String timeoutExpress) {
    
    this.timeoutExpress = timeoutExpress;
    return this;
  }

   /**
   * 预授权订单相对超时时间，从商户请求时间开始计算。 预授权订单允许的最晚授权时间，逾期将关闭该笔订单。取值范围：1m～15d。m-分钟，h-小时，d-天。 该参数数值不接受小数点， 如 1.5h，可转换为90m。 默认为15m。
   * @return timeoutExpress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2d", value = "预授权订单相对超时时间，从商户请求时间开始计算。 预授权订单允许的最晚授权时间，逾期将关闭该笔订单。取值范围：1m～15d。m-分钟，h-小时，d-天。 该参数数值不接受小数点， 如 1.5h，可转换为90m。 默认为15m。")

  public String getTimeoutExpress() {
    return timeoutExpress;
  }


  public void setTimeoutExpress(String timeoutExpress) {
    this.timeoutExpress = timeoutExpress;
  }


  public AlipayFundAuthOrderVoucherCreateModel transCurrency(String transCurrency) {
    
    this.transCurrency = transCurrency;
    return this;
  }

   /**
   * 标价币种,  amount 对应的币种单位。支持澳元：AUD, 新西兰元：NZD, 台币：TWD, 美元：USD, 欧元：EUR, 英镑：GBP
   * @return transCurrency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "USD", value = "标价币种,  amount 对应的币种单位。支持澳元：AUD, 新西兰元：NZD, 台币：TWD, 美元：USD, 欧元：EUR, 英镑：GBP")

  public String getTransCurrency() {
    return transCurrency;
  }


  public void setTransCurrency(String transCurrency) {
    this.transCurrency = transCurrency;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayFundAuthOrderVoucherCreateModel alipayFundAuthOrderVoucherCreateModel = (AlipayFundAuthOrderVoucherCreateModel) o;
    return Objects.equals(this.amount, alipayFundAuthOrderVoucherCreateModel.amount) &&
        Objects.equals(this.businessParams, alipayFundAuthOrderVoucherCreateModel.businessParams) &&
        Objects.equals(this.disablePayChannels, alipayFundAuthOrderVoucherCreateModel.disablePayChannels) &&
        Objects.equals(this.enablePayChannels, alipayFundAuthOrderVoucherCreateModel.enablePayChannels) &&
        Objects.equals(this.extraParam, alipayFundAuthOrderVoucherCreateModel.extraParam) &&
        Objects.equals(this.identityParams, alipayFundAuthOrderVoucherCreateModel.identityParams) &&
        Objects.equals(this.notifyUrl, alipayFundAuthOrderVoucherCreateModel.notifyUrl) &&
        Objects.equals(this.orderTitle, alipayFundAuthOrderVoucherCreateModel.orderTitle) &&
        Objects.equals(this.outOrderNo, alipayFundAuthOrderVoucherCreateModel.outOrderNo) &&
        Objects.equals(this.outRequestNo, alipayFundAuthOrderVoucherCreateModel.outRequestNo) &&
        Objects.equals(this.payTimeout, alipayFundAuthOrderVoucherCreateModel.payTimeout) &&
        Objects.equals(this.payeeLogonId, alipayFundAuthOrderVoucherCreateModel.payeeLogonId) &&
        Objects.equals(this.payeeUserId, alipayFundAuthOrderVoucherCreateModel.payeeUserId) &&
        Objects.equals(this.productCode, alipayFundAuthOrderVoucherCreateModel.productCode) &&
        Objects.equals(this.settleCurrency, alipayFundAuthOrderVoucherCreateModel.settleCurrency) &&
        Objects.equals(this.timeoutExpress, alipayFundAuthOrderVoucherCreateModel.timeoutExpress) &&
        Objects.equals(this.transCurrency, alipayFundAuthOrderVoucherCreateModel.transCurrency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, businessParams, disablePayChannels, enablePayChannels, extraParam, identityParams, notifyUrl, orderTitle, outOrderNo, outRequestNo, payTimeout, payeeLogonId, payeeUserId, productCode, settleCurrency, timeoutExpress, transCurrency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayFundAuthOrderVoucherCreateModel {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    businessParams: ").append(toIndentedString(businessParams)).append("\n");
    sb.append("    disablePayChannels: ").append(toIndentedString(disablePayChannels)).append("\n");
    sb.append("    enablePayChannels: ").append(toIndentedString(enablePayChannels)).append("\n");
    sb.append("    extraParam: ").append(toIndentedString(extraParam)).append("\n");
    sb.append("    identityParams: ").append(toIndentedString(identityParams)).append("\n");
    sb.append("    notifyUrl: ").append(toIndentedString(notifyUrl)).append("\n");
    sb.append("    orderTitle: ").append(toIndentedString(orderTitle)).append("\n");
    sb.append("    outOrderNo: ").append(toIndentedString(outOrderNo)).append("\n");
    sb.append("    outRequestNo: ").append(toIndentedString(outRequestNo)).append("\n");
    sb.append("    payTimeout: ").append(toIndentedString(payTimeout)).append("\n");
    sb.append("    payeeLogonId: ").append(toIndentedString(payeeLogonId)).append("\n");
    sb.append("    payeeUserId: ").append(toIndentedString(payeeUserId)).append("\n");
    sb.append("    productCode: ").append(toIndentedString(productCode)).append("\n");
    sb.append("    settleCurrency: ").append(toIndentedString(settleCurrency)).append("\n");
    sb.append("    timeoutExpress: ").append(toIndentedString(timeoutExpress)).append("\n");
    sb.append("    transCurrency: ").append(toIndentedString(transCurrency)).append("\n");
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
    openapiFields.add("amount");
    openapiFields.add("business_params");
    openapiFields.add("disable_pay_channels");
    openapiFields.add("enable_pay_channels");
    openapiFields.add("extra_param");
    openapiFields.add("identity_params");
    openapiFields.add("notify_url");
    openapiFields.add("order_title");
    openapiFields.add("out_order_no");
    openapiFields.add("out_request_no");
    openapiFields.add("pay_timeout");
    openapiFields.add("payee_logon_id");
    openapiFields.add("payee_user_id");
    openapiFields.add("product_code");
    openapiFields.add("settle_currency");
    openapiFields.add("timeout_express");
    openapiFields.add("trans_currency");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayFundAuthOrderVoucherCreateModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayFundAuthOrderVoucherCreateModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayFundAuthOrderVoucherCreateModel is not found in the empty JSON string", AlipayFundAuthOrderVoucherCreateModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayFundAuthOrderVoucherCreateModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayFundAuthOrderVoucherCreateModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("amount") != null && !jsonObj.get("amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount").toString()));
      }
      if (jsonObj.get("business_params") != null && !jsonObj.get("business_params").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `business_params` to be a primitive type in the JSON string but got `%s`", jsonObj.get("business_params").toString()));
      }
      if (jsonObj.get("disable_pay_channels") != null && !jsonObj.get("disable_pay_channels").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `disable_pay_channels` to be a primitive type in the JSON string but got `%s`", jsonObj.get("disable_pay_channels").toString()));
      }
      if (jsonObj.get("enable_pay_channels") != null && !jsonObj.get("enable_pay_channels").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `enable_pay_channels` to be a primitive type in the JSON string but got `%s`", jsonObj.get("enable_pay_channels").toString()));
      }
      if (jsonObj.get("extra_param") != null && !jsonObj.get("extra_param").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `extra_param` to be a primitive type in the JSON string but got `%s`", jsonObj.get("extra_param").toString()));
      }
      if (jsonObj.get("identity_params") != null && !jsonObj.get("identity_params").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `identity_params` to be a primitive type in the JSON string but got `%s`", jsonObj.get("identity_params").toString()));
      }
      if (jsonObj.get("notify_url") != null && !jsonObj.get("notify_url").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `notify_url` to be a primitive type in the JSON string but got `%s`", jsonObj.get("notify_url").toString()));
      }
      if (jsonObj.get("order_title") != null && !jsonObj.get("order_title").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_title` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_title").toString()));
      }
      if (jsonObj.get("out_order_no") != null && !jsonObj.get("out_order_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_order_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_order_no").toString()));
      }
      if (jsonObj.get("out_request_no") != null && !jsonObj.get("out_request_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_request_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_request_no").toString()));
      }
      if (jsonObj.get("pay_timeout") != null && !jsonObj.get("pay_timeout").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pay_timeout` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pay_timeout").toString()));
      }
      if (jsonObj.get("payee_logon_id") != null && !jsonObj.get("payee_logon_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payee_logon_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payee_logon_id").toString()));
      }
      if (jsonObj.get("payee_user_id") != null && !jsonObj.get("payee_user_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `payee_user_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("payee_user_id").toString()));
      }
      if (jsonObj.get("product_code") != null && !jsonObj.get("product_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `product_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("product_code").toString()));
      }
      if (jsonObj.get("settle_currency") != null && !jsonObj.get("settle_currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `settle_currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("settle_currency").toString()));
      }
      if (jsonObj.get("timeout_express") != null && !jsonObj.get("timeout_express").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `timeout_express` to be a primitive type in the JSON string but got `%s`", jsonObj.get("timeout_express").toString()));
      }
      if (jsonObj.get("trans_currency") != null && !jsonObj.get("trans_currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `trans_currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("trans_currency").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayFundAuthOrderVoucherCreateModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayFundAuthOrderVoucherCreateModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayFundAuthOrderVoucherCreateModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayFundAuthOrderVoucherCreateModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayFundAuthOrderVoucherCreateModel>() {
           @Override
           public void write(JsonWriter out, AlipayFundAuthOrderVoucherCreateModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayFundAuthOrderVoucherCreateModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayFundAuthOrderVoucherCreateModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayFundAuthOrderVoucherCreateModel
  * @throws IOException if the JSON string is invalid with respect to AlipayFundAuthOrderVoucherCreateModel
  */
  public static AlipayFundAuthOrderVoucherCreateModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayFundAuthOrderVoucherCreateModel.class);
  }

 /**
  * Convert an instance of AlipayFundAuthOrderVoucherCreateModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

