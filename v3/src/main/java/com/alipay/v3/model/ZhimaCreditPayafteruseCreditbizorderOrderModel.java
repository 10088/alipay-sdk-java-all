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
 * ZhimaCreditPayafteruseCreditbizorderOrderModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ZhimaCreditPayafteruseCreditbizorderOrderModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_AMOUNT_TYPE = "amount_type";
  @SerializedName(SERIALIZED_NAME_AMOUNT_TYPE)
  private String amountType;

  public static final String SERIALIZED_NAME_BODY = "body";
  @SerializedName(SERIALIZED_NAME_BODY)
  private String body;

  public static final String SERIALIZED_NAME_CATEGORY_ID = "category_id";
  @SerializedName(SERIALIZED_NAME_CATEGORY_ID)
  private String categoryId;

  public static final String SERIALIZED_NAME_CREDIT_AGREEMENT_ID = "credit_agreement_id";
  @SerializedName(SERIALIZED_NAME_CREDIT_AGREEMENT_ID)
  private String creditAgreementId;

  public static final String SERIALIZED_NAME_EXTEND_PARAMS = "extend_params";
  @SerializedName(SERIALIZED_NAME_EXTEND_PARAMS)
  private String extendParams;

  public static final String SERIALIZED_NAME_ORDER_AMOUNT = "order_amount";
  @SerializedName(SERIALIZED_NAME_ORDER_AMOUNT)
  private String orderAmount;

  public static final String SERIALIZED_NAME_OUT_ORDER_NO = "out_order_no";
  @SerializedName(SERIALIZED_NAME_OUT_ORDER_NO)
  private String outOrderNo;

  public static final String SERIALIZED_NAME_PRODUCT_CODE = "product_code";
  @SerializedName(SERIALIZED_NAME_PRODUCT_CODE)
  private String productCode;

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject;

  public ZhimaCreditPayafteruseCreditbizorderOrderModel() { 
  }

  public ZhimaCreditPayafteruseCreditbizorderOrderModel amountType(String amountType) {
    
    this.amountType = amountType;
    return this;
  }

   /**
   * 只有当传递了order_amount时，该参数才有意义； 1）该参数不传时，默认为ORDER_AMOUNT。 2）传ORDER_AMOUNT时，表示order_amount传入的金额为后付金额，在发起扣款时，最大扣款支付金额为order_amount传入的值； 3）传RISK_AMOUNT时，表示ORDER_AMOUNT传入的金额为风险预估金额，在发起扣款时，最大扣款支付金额为商户签约时约定的上限额度。
   * @return amountType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "RISK_AMOUNT", value = "只有当传递了order_amount时，该参数才有意义； 1）该参数不传时，默认为ORDER_AMOUNT。 2）传ORDER_AMOUNT时，表示order_amount传入的金额为后付金额，在发起扣款时，最大扣款支付金额为order_amount传入的值； 3）传RISK_AMOUNT时，表示ORDER_AMOUNT传入的金额为风险预估金额，在发起扣款时，最大扣款支付金额为商户签约时约定的上限额度。")

  public String getAmountType() {
    return amountType;
  }


  public void setAmountType(String amountType) {
    this.amountType = amountType;
  }


  public ZhimaCreditPayafteruseCreditbizorderOrderModel body(String body) {
    
    this.body = body;
    return this;
  }

   /**
   * 订单描述
   * @return body
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Iphone6 16G", value = "订单描述")

  public String getBody() {
    return body;
  }


  public void setBody(String body) {
    this.body = body;
  }


  public ZhimaCreditPayafteruseCreditbizorderOrderModel categoryId(String categoryId) {
    
    this.categoryId = categoryId;
    return this;
  }

   /**
   * 芝麻外部类目
   * @return categoryId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "credit_pay_after_use", value = "芝麻外部类目")

  public String getCategoryId() {
    return categoryId;
  }


  public void setCategoryId(String categoryId) {
    this.categoryId = categoryId;
  }


  public ZhimaCreditPayafteruseCreditbizorderOrderModel creditAgreementId(String creditAgreementId) {
    
    this.creditAgreementId = creditAgreementId;
    return this;
  }

   /**
   * 芝麻开通协议号
   * @return creditAgreementId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "ZMOP99202011240100520025162811", value = "芝麻开通协议号")

  public String getCreditAgreementId() {
    return creditAgreementId;
  }


  public void setCreditAgreementId(String creditAgreementId) {
    this.creditAgreementId = creditAgreementId;
  }


  public ZhimaCreditPayafteruseCreditbizorderOrderModel extendParams(String extendParams) {
    
    this.extendParams = extendParams;
    return this;
  }

   /**
   * 业务扩展参数
   * @return extendParams
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"key\":\"value\"}", value = "业务扩展参数")

  public String getExtendParams() {
    return extendParams;
  }


  public void setExtendParams(String extendParams) {
    this.extendParams = extendParams;
  }


  public ZhimaCreditPayafteruseCreditbizorderOrderModel orderAmount(String orderAmount) {
    
    this.orderAmount = orderAmount;
    return this;
  }

   /**
   * 订单金额，该金额为当前订单扣款的累计最大额度。例如，下单时传递10.00，则扣款时最大支付金额为10元。若该参数不传，则默认使用商户签约时约定的上限额度。芝麻速办业务场景（极速回收、极速返利、极速退款等）商户请求时，order_amount必传，且amount_type类型需传递ORDER_AMOUNT。
   * @return orderAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "88.66", value = "订单金额，该金额为当前订单扣款的累计最大额度。例如，下单时传递10.00，则扣款时最大支付金额为10元。若该参数不传，则默认使用商户签约时约定的上限额度。芝麻速办业务场景（极速回收、极速返利、极速退款等）商户请求时，order_amount必传，且amount_type类型需传递ORDER_AMOUNT。")

  public String getOrderAmount() {
    return orderAmount;
  }


  public void setOrderAmount(String orderAmount) {
    this.orderAmount = orderAmount;
  }


  public ZhimaCreditPayafteruseCreditbizorderOrderModel outOrderNo(String outOrderNo) {
    
    this.outOrderNo = outOrderNo;
    return this;
  }

   /**
   * 商户外部订单号，保证不重复
   * @return outOrderNo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "out00120312323232", value = "商户外部订单号，保证不重复")

  public String getOutOrderNo() {
    return outOrderNo;
  }


  public void setOutOrderNo(String outOrderNo) {
    this.outOrderNo = outOrderNo;
  }


  public ZhimaCreditPayafteruseCreditbizorderOrderModel productCode(String productCode) {
    
    this.productCode = productCode;
    return this;
  }

   /**
   * 产品码，不传默认为CREDIT_PAY_AFTER_USE
   * @return productCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CREDIT_PAY_AFTER_USE", value = "产品码，不传默认为CREDIT_PAY_AFTER_USE")

  public String getProductCode() {
    return productCode;
  }


  public void setProductCode(String productCode) {
    this.productCode = productCode;
  }


  public ZhimaCreditPayafteruseCreditbizorderOrderModel subject(String subject) {
    
    this.subject = subject;
    return this;
  }

   /**
   * 订单标题。 注意：不可使用特殊字符，如 /，&#x3D;，&amp; 等。
   * @return subject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Iphone6 16G", value = "订单标题。 注意：不可使用特殊字符，如 /，=，& 等。")

  public String getSubject() {
    return subject;
  }


  public void setSubject(String subject) {
    this.subject = subject;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ZhimaCreditPayafteruseCreditbizorderOrderModel zhimaCreditPayafteruseCreditbizorderOrderModel = (ZhimaCreditPayafteruseCreditbizorderOrderModel) o;
    return Objects.equals(this.amountType, zhimaCreditPayafteruseCreditbizorderOrderModel.amountType) &&
        Objects.equals(this.body, zhimaCreditPayafteruseCreditbizorderOrderModel.body) &&
        Objects.equals(this.categoryId, zhimaCreditPayafteruseCreditbizorderOrderModel.categoryId) &&
        Objects.equals(this.creditAgreementId, zhimaCreditPayafteruseCreditbizorderOrderModel.creditAgreementId) &&
        Objects.equals(this.extendParams, zhimaCreditPayafteruseCreditbizorderOrderModel.extendParams) &&
        Objects.equals(this.orderAmount, zhimaCreditPayafteruseCreditbizorderOrderModel.orderAmount) &&
        Objects.equals(this.outOrderNo, zhimaCreditPayafteruseCreditbizorderOrderModel.outOrderNo) &&
        Objects.equals(this.productCode, zhimaCreditPayafteruseCreditbizorderOrderModel.productCode) &&
        Objects.equals(this.subject, zhimaCreditPayafteruseCreditbizorderOrderModel.subject);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amountType, body, categoryId, creditAgreementId, extendParams, orderAmount, outOrderNo, productCode, subject);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ZhimaCreditPayafteruseCreditbizorderOrderModel {\n");
    sb.append("    amountType: ").append(toIndentedString(amountType)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    categoryId: ").append(toIndentedString(categoryId)).append("\n");
    sb.append("    creditAgreementId: ").append(toIndentedString(creditAgreementId)).append("\n");
    sb.append("    extendParams: ").append(toIndentedString(extendParams)).append("\n");
    sb.append("    orderAmount: ").append(toIndentedString(orderAmount)).append("\n");
    sb.append("    outOrderNo: ").append(toIndentedString(outOrderNo)).append("\n");
    sb.append("    productCode: ").append(toIndentedString(productCode)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
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
    openapiFields.add("amount_type");
    openapiFields.add("body");
    openapiFields.add("category_id");
    openapiFields.add("credit_agreement_id");
    openapiFields.add("extend_params");
    openapiFields.add("order_amount");
    openapiFields.add("out_order_no");
    openapiFields.add("product_code");
    openapiFields.add("subject");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ZhimaCreditPayafteruseCreditbizorderOrderModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ZhimaCreditPayafteruseCreditbizorderOrderModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ZhimaCreditPayafteruseCreditbizorderOrderModel is not found in the empty JSON string", ZhimaCreditPayafteruseCreditbizorderOrderModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ZhimaCreditPayafteruseCreditbizorderOrderModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ZhimaCreditPayafteruseCreditbizorderOrderModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("amount_type") != null && !jsonObj.get("amount_type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `amount_type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("amount_type").toString()));
      }
      if (jsonObj.get("body") != null && !jsonObj.get("body").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `body` to be a primitive type in the JSON string but got `%s`", jsonObj.get("body").toString()));
      }
      if (jsonObj.get("category_id") != null && !jsonObj.get("category_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `category_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("category_id").toString()));
      }
      if (jsonObj.get("credit_agreement_id") != null && !jsonObj.get("credit_agreement_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `credit_agreement_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("credit_agreement_id").toString()));
      }
      if (jsonObj.get("extend_params") != null && !jsonObj.get("extend_params").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `extend_params` to be a primitive type in the JSON string but got `%s`", jsonObj.get("extend_params").toString()));
      }
      if (jsonObj.get("order_amount") != null && !jsonObj.get("order_amount").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `order_amount` to be a primitive type in the JSON string but got `%s`", jsonObj.get("order_amount").toString()));
      }
      if (jsonObj.get("out_order_no") != null && !jsonObj.get("out_order_no").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `out_order_no` to be a primitive type in the JSON string but got `%s`", jsonObj.get("out_order_no").toString()));
      }
      if (jsonObj.get("product_code") != null && !jsonObj.get("product_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `product_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("product_code").toString()));
      }
      if (jsonObj.get("subject") != null && !jsonObj.get("subject").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `subject` to be a primitive type in the JSON string but got `%s`", jsonObj.get("subject").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ZhimaCreditPayafteruseCreditbizorderOrderModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ZhimaCreditPayafteruseCreditbizorderOrderModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ZhimaCreditPayafteruseCreditbizorderOrderModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ZhimaCreditPayafteruseCreditbizorderOrderModel.class));

       return (TypeAdapter<T>) new TypeAdapter<ZhimaCreditPayafteruseCreditbizorderOrderModel>() {
           @Override
           public void write(JsonWriter out, ZhimaCreditPayafteruseCreditbizorderOrderModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ZhimaCreditPayafteruseCreditbizorderOrderModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ZhimaCreditPayafteruseCreditbizorderOrderModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ZhimaCreditPayafteruseCreditbizorderOrderModel
  * @throws IOException if the JSON string is invalid with respect to ZhimaCreditPayafteruseCreditbizorderOrderModel
  */
  public static ZhimaCreditPayafteruseCreditbizorderOrderModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ZhimaCreditPayafteruseCreditbizorderOrderModel.class);
  }

 /**
  * Convert an instance of ZhimaCreditPayafteruseCreditbizorderOrderModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

