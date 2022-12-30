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
 * AlipayOpenSpBlueseaactivityCreateModel
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayOpenSpBlueseaactivityCreateModel {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_BIZ_SCENE = "biz_scene";
  @SerializedName(SERIALIZED_NAME_BIZ_SCENE)
  private String bizScene;

  public static final String SERIALIZED_NAME_BUSINESS_LIC = "business_lic";
  @SerializedName(SERIALIZED_NAME_BUSINESS_LIC)
  private String businessLic;

  public static final String SERIALIZED_NAME_CITY_CODE = "city_code";
  @SerializedName(SERIALIZED_NAME_CITY_CODE)
  private String cityCode;

  public static final String SERIALIZED_NAME_DISTRICT_CODE = "district_code";
  @SerializedName(SERIALIZED_NAME_DISTRICT_CODE)
  private String districtCode;

  public static final String SERIALIZED_NAME_FOOD_BUSINESS_LIC = "food_business_lic";
  @SerializedName(SERIALIZED_NAME_FOOD_BUSINESS_LIC)
  private String foodBusinessLic;

  public static final String SERIALIZED_NAME_FOOD_CIRCULATE_LIC = "food_circulate_lic";
  @SerializedName(SERIALIZED_NAME_FOOD_CIRCULATE_LIC)
  private String foodCirculateLic;

  public static final String SERIALIZED_NAME_FOOD_HEALTH_LIC = "food_health_lic";
  @SerializedName(SERIALIZED_NAME_FOOD_HEALTH_LIC)
  private String foodHealthLic;

  public static final String SERIALIZED_NAME_FOOD_PRODUCTION_LIC = "food_production_lic";
  @SerializedName(SERIALIZED_NAME_FOOD_PRODUCTION_LIC)
  private String foodProductionLic;

  public static final String SERIALIZED_NAME_FOOD_SERVICE_LIC = "food_service_lic";
  @SerializedName(SERIALIZED_NAME_FOOD_SERVICE_LIC)
  private String foodServiceLic;

  public static final String SERIALIZED_NAME_INDOOR_PIC = "indoor_pic";
  @SerializedName(SERIALIZED_NAME_INDOOR_PIC)
  private String indoorPic;

  public static final String SERIALIZED_NAME_MERCHANT_LOGON = "merchant_logon";
  @SerializedName(SERIALIZED_NAME_MERCHANT_LOGON)
  private String merchantLogon;

  public static final String SERIALIZED_NAME_PROVINCE_CODE = "province_code";
  @SerializedName(SERIALIZED_NAME_PROVINCE_CODE)
  private String provinceCode;

  public static final String SERIALIZED_NAME_SHOP_ENTRANCE_PIC = "shop_entrance_pic";
  @SerializedName(SERIALIZED_NAME_SHOP_ENTRANCE_PIC)
  private String shopEntrancePic;

  public static final String SERIALIZED_NAME_SUB_MERCHANT_ID = "sub_merchant_id";
  @SerializedName(SERIALIZED_NAME_SUB_MERCHANT_ID)
  private String subMerchantId;

  public static final String SERIALIZED_NAME_TOBACCO_LIC = "tobacco_lic";
  @SerializedName(SERIALIZED_NAME_TOBACCO_LIC)
  private String tobaccoLic;

  public AlipayOpenSpBlueseaactivityCreateModel() { 
  }

  public AlipayOpenSpBlueseaactivityCreateModel address(String address) {
    
    this.address = address;
    return this;
  }

   /**
   * 详细地址。 该资质是否必传请参见&lt;a href&#x3D;&#39;https://opendocs.alipay.com/open/01hd83&#39;&gt;报名资质要求&lt;/a&gt;。
   * @return address
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "万塘路18号黄龙时代广场B座", value = "详细地址。 该资质是否必传请参见<a href='https://opendocs.alipay.com/open/01hd83'>报名资质要求</a>。")

  public String getAddress() {
    return address;
  }


  public void setAddress(String address) {
    this.address = address;
  }


  public AlipayOpenSpBlueseaactivityCreateModel bizScene(String bizScene) {
    
    this.bizScene = bizScene;
    return this;
  }

   /**
   * 蓝海活动的场景，支持场景如下： * 直连餐饮（BLUE_SEA_FOOD_APPLY）； * 直连快消（BLUE_SEA_FMCG_APPLY）； * 间连餐饮（BLUE_SEA_FOOD_INDIRECT_APPLY）； * 间连快消（BLUE_SEA_FMCG_INDIRECT_APPLY）。
   * @return bizScene
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "BLUE_SEA_FOOD_APPLY", value = "蓝海活动的场景，支持场景如下： * 直连餐饮（BLUE_SEA_FOOD_APPLY）； * 直连快消（BLUE_SEA_FMCG_APPLY）； * 间连餐饮（BLUE_SEA_FOOD_INDIRECT_APPLY）； * 间连快消（BLUE_SEA_FMCG_INDIRECT_APPLY）。")

  public String getBizScene() {
    return bizScene;
  }


  public void setBizScene(String bizScene) {
    this.bizScene = bizScene;
  }


  public AlipayOpenSpBlueseaactivityCreateModel businessLic(String businessLic) {
    
    this.businessLic = businessLic;
    return this;
  }

   /**
   * 营业执照，要求证件文本信息清晰可见，图片文件大小在 50K-5M 之间，不限制长宽，支持 png、bmp、gif、jpg、jpeg 格式。 请传入&lt;a href&#x3D;&#39;https://opendocs.alipay.com/apis/01ea4t&#39;&gt;alipay.open.sp.image.upload&lt;/a&gt;(图片上传接口) 返回的 image_id。 该资质是否必传请参见&lt;a href&#x3D;&#39;https://opendocs.alipay.com/open/01hd83&#39;&gt;报名资质要求&lt;/a&gt;。
   * @return businessLic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "A*7j1pTrCpV8EAAAAAAAAAAAAAAQAAAA", value = "营业执照，要求证件文本信息清晰可见，图片文件大小在 50K-5M 之间，不限制长宽，支持 png、bmp、gif、jpg、jpeg 格式。 请传入<a href='https://opendocs.alipay.com/apis/01ea4t'>alipay.open.sp.image.upload</a>(图片上传接口) 返回的 image_id。 该资质是否必传请参见<a href='https://opendocs.alipay.com/open/01hd83'>报名资质要求</a>。")

  public String getBusinessLic() {
    return businessLic;
  }


  public void setBusinessLic(String businessLic) {
    this.businessLic = businessLic;
  }


  public AlipayOpenSpBlueseaactivityCreateModel cityCode(String cityCode) {
    
    this.cityCode = cityCode;
    return this;
  }

   /**
   * 城市编码。请按照&lt;a href&#x3D;&#39;https://gw.alipayobjects.com/os/basement_prod/253c4dcb-b8a4-4a1e-8be2-79e191a9b6db.xlsx&#39;&gt;表格&lt;/a&gt; 中内容填写。 （请参考资料：&lt;a href&#x3D;&#39;http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/&#39;&gt; 统计用区划和城乡划分代码&lt;/a&gt;）
   * @return cityCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "310001", value = "城市编码。请按照<a href='https://gw.alipayobjects.com/os/basement_prod/253c4dcb-b8a4-4a1e-8be2-79e191a9b6db.xlsx'>表格</a> 中内容填写。 （请参考资料：<a href='http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/'> 统计用区划和城乡划分代码</a>）")

  public String getCityCode() {
    return cityCode;
  }


  public void setCityCode(String cityCode) {
    this.cityCode = cityCode;
  }


  public AlipayOpenSpBlueseaactivityCreateModel districtCode(String districtCode) {
    
    this.districtCode = districtCode;
    return this;
  }

   /**
   * 区县编码。请按照&lt;a href&#x3D;&#39;https://gw.alipayobjects.com/os/basement_prod/253c4dcb-b8a4-4a1e-8be2-79e191a9b6db.xlsx&#39;&gt;表格&lt;/a&gt; 中内容填写。 （请参考资料：&lt;a href&#x3D;&#39;http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/&#39;&gt; 统计用区划和城乡划分代码&lt;/a&gt;）
   * @return districtCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "310006", value = "区县编码。请按照<a href='https://gw.alipayobjects.com/os/basement_prod/253c4dcb-b8a4-4a1e-8be2-79e191a9b6db.xlsx'>表格</a> 中内容填写。 （请参考资料：<a href='http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/'> 统计用区划和城乡划分代码</a>）")

  public String getDistrictCode() {
    return districtCode;
  }


  public void setDistrictCode(String districtCode) {
    this.districtCode = districtCode;
  }


  public AlipayOpenSpBlueseaactivityCreateModel foodBusinessLic(String foodBusinessLic) {
    
    this.foodBusinessLic = foodBusinessLic;
    return this;
  }

   /**
   * 食品经营许可证，要求证件文本信息清晰可见，图片文件大小在 50K-5M 之间，不限制长宽，支持 png、bmp、gif、jpg、jpeg 格式。 请传入&lt;a href&#x3D;&#39;https://opendocs.alipay.com/apis/01ea4t&#39;&gt;alipay.open.sp.image.upload&lt;/a&gt;(图片上传接口) 返回的 image_id。 该资质是否必传请参见&lt;a href&#x3D;&#39;https://opendocs.alipay.com/open/01hd83&#39;&gt;报名资质要求&lt;/a&gt;。
   * @return foodBusinessLic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "A*7j1pTrCpV8EAAAAAAAAAAAAAAQAAAA", value = "食品经营许可证，要求证件文本信息清晰可见，图片文件大小在 50K-5M 之间，不限制长宽，支持 png、bmp、gif、jpg、jpeg 格式。 请传入<a href='https://opendocs.alipay.com/apis/01ea4t'>alipay.open.sp.image.upload</a>(图片上传接口) 返回的 image_id。 该资质是否必传请参见<a href='https://opendocs.alipay.com/open/01hd83'>报名资质要求</a>。")

  public String getFoodBusinessLic() {
    return foodBusinessLic;
  }


  public void setFoodBusinessLic(String foodBusinessLic) {
    this.foodBusinessLic = foodBusinessLic;
  }


  public AlipayOpenSpBlueseaactivityCreateModel foodCirculateLic(String foodCirculateLic) {
    
    this.foodCirculateLic = foodCirculateLic;
    return this;
  }

   /**
   * 食品流通许可证，要求证件文本信息清晰可见，图片文件大小在 50K-5M 之间，不限制长宽，支持 png、bmp、gif、jpg、jpeg 格式。 请传入&lt;a href&#x3D;&#39;https://opendocs.alipay.com/apis/01ea4t&#39;&gt;alipay.open.sp.image.upload&lt;/a&gt;(图片上传接口) 返回的 image_id。 该资质是否必传请参见&lt;a href&#x3D;&#39;https://opendocs.alipay.com/open/01hd83&#39;&gt;报名资质要求&lt;/a&gt;。
   * @return foodCirculateLic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "A*7j1pTrCpV8EAAAAAAAAAAAAAAQAAAA", value = "食品流通许可证，要求证件文本信息清晰可见，图片文件大小在 50K-5M 之间，不限制长宽，支持 png、bmp、gif、jpg、jpeg 格式。 请传入<a href='https://opendocs.alipay.com/apis/01ea4t'>alipay.open.sp.image.upload</a>(图片上传接口) 返回的 image_id。 该资质是否必传请参见<a href='https://opendocs.alipay.com/open/01hd83'>报名资质要求</a>。")

  public String getFoodCirculateLic() {
    return foodCirculateLic;
  }


  public void setFoodCirculateLic(String foodCirculateLic) {
    this.foodCirculateLic = foodCirculateLic;
  }


  public AlipayOpenSpBlueseaactivityCreateModel foodHealthLic(String foodHealthLic) {
    
    this.foodHealthLic = foodHealthLic;
    return this;
  }

   /**
   * 食品卫生许可证，要求证件文本信息清晰可见，图片文件大小在 50K-5M 之间，不限制长宽，支持 png、bmp、gif、jpg、jpeg 格式。 请传入&lt;a href&#x3D;&#39;https://opendocs.alipay.com/apis/01ea4t&#39;&gt;alipay.open.sp.image.upload&lt;/a&gt;(图片上传接口) 返回的 image_id。  该资质是否必传请参见&lt;a href&#x3D;&#39;https://opendocs.alipay.com/open/01hd83&#39;&gt;报名资质要求&lt;/a&gt;。
   * @return foodHealthLic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "A*7j1pTrCpV8EAAAAAAAAAAAAAAQAAAA", value = "食品卫生许可证，要求证件文本信息清晰可见，图片文件大小在 50K-5M 之间，不限制长宽，支持 png、bmp、gif、jpg、jpeg 格式。 请传入<a href='https://opendocs.alipay.com/apis/01ea4t'>alipay.open.sp.image.upload</a>(图片上传接口) 返回的 image_id。  该资质是否必传请参见<a href='https://opendocs.alipay.com/open/01hd83'>报名资质要求</a>。")

  public String getFoodHealthLic() {
    return foodHealthLic;
  }


  public void setFoodHealthLic(String foodHealthLic) {
    this.foodHealthLic = foodHealthLic;
  }


  public AlipayOpenSpBlueseaactivityCreateModel foodProductionLic(String foodProductionLic) {
    
    this.foodProductionLic = foodProductionLic;
    return this;
  }

   /**
   * 食品生产许可证，要求证件文本信息清晰可见，图片文件大小在 50K-5M 之间，不限制长宽，支持 png、bmp、gif、jpg、jpeg 格式。 请传入&lt;a href&#x3D;&#39;https://opendocs.alipay.com/apis/01ea4t&#39;&gt;alipay.open.sp.image.upload&lt;/a&gt;(图片上传接口) 返回的 image_id。 该资质是否必传请参见&lt;a href&#x3D;&#39;https://opendocs.alipay.com/open/01hd83&#39;&gt;报名资质要求&lt;/a&gt;。
   * @return foodProductionLic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "A*7j1pTrCpV8EAAAAAAAAAAAAAAQAAAA", value = "食品生产许可证，要求证件文本信息清晰可见，图片文件大小在 50K-5M 之间，不限制长宽，支持 png、bmp、gif、jpg、jpeg 格式。 请传入<a href='https://opendocs.alipay.com/apis/01ea4t'>alipay.open.sp.image.upload</a>(图片上传接口) 返回的 image_id。 该资质是否必传请参见<a href='https://opendocs.alipay.com/open/01hd83'>报名资质要求</a>。")

  public String getFoodProductionLic() {
    return foodProductionLic;
  }


  public void setFoodProductionLic(String foodProductionLic) {
    this.foodProductionLic = foodProductionLic;
  }


  public AlipayOpenSpBlueseaactivityCreateModel foodServiceLic(String foodServiceLic) {
    
    this.foodServiceLic = foodServiceLic;
    return this;
  }

   /**
   * 餐饮服务许可证，要求证件文本信息清晰可见，图片文件大小在 50K-5M 之间，不限制长宽，支持 png、bmp、gif、jpg、jpeg 格式。 请传入&lt;a href&#x3D;&#39;https://opendocs.alipay.com/apis/01ea4t&#39;&gt;alipay.open.sp.image.upload&lt;/a&gt;(图片上传接口) 返回的 image_id。 该资质是否必传请参见&lt;a href&#x3D;&#39;https://opendocs.alipay.com/open/01hd83&#39;&gt;报名资质要求&lt;/a&gt;。
   * @return foodServiceLic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "A*7j1pTrCpV8EAAAAAAAAAAAAAAQAAAA", value = "餐饮服务许可证，要求证件文本信息清晰可见，图片文件大小在 50K-5M 之间，不限制长宽，支持 png、bmp、gif、jpg、jpeg 格式。 请传入<a href='https://opendocs.alipay.com/apis/01ea4t'>alipay.open.sp.image.upload</a>(图片上传接口) 返回的 image_id。 该资质是否必传请参见<a href='https://opendocs.alipay.com/open/01hd83'>报名资质要求</a>。")

  public String getFoodServiceLic() {
    return foodServiceLic;
  }


  public void setFoodServiceLic(String foodServiceLic) {
    this.foodServiceLic = foodServiceLic;
  }


  public AlipayOpenSpBlueseaactivityCreateModel indoorPic(String indoorPic) {
    
    this.indoorPic = indoorPic;
    return this;
  }

   /**
   * 内景照，要求图片清晰可见，图片文件大小在 50K-5M 之间，不限制长宽，支持 png、bmp、gif、jpg、jpeg 格式。 请传入&lt;a href&#x3D;&#39;https://opendocs.alipay.com/apis/01ea4t&#39;&gt;alipay.open.sp.image.upload&lt;/a&gt;(图片上传接口) 返回的 image_id。 该资质是否必传请参见&lt;a href&#x3D;&#39;https://opendocs.alipay.com/open/01hd83&#39;&gt;报名资质要求&lt;/a&gt;。
   * @return indoorPic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "A*7j1pTrCpV8EAAAAAAAAAAAAAAQAAAA", value = "内景照，要求图片清晰可见，图片文件大小在 50K-5M 之间，不限制长宽，支持 png、bmp、gif、jpg、jpeg 格式。 请传入<a href='https://opendocs.alipay.com/apis/01ea4t'>alipay.open.sp.image.upload</a>(图片上传接口) 返回的 image_id。 该资质是否必传请参见<a href='https://opendocs.alipay.com/open/01hd83'>报名资质要求</a>。")

  public String getIndoorPic() {
    return indoorPic;
  }


  public void setIndoorPic(String indoorPic) {
    this.indoorPic = indoorPic;
  }


  public AlipayOpenSpBlueseaactivityCreateModel merchantLogon(String merchantLogon) {
    
    this.merchantLogon = merchantLogon;
    return this;
  }

   /**
   * 参与蓝海活动的商户支付宝账号，只有当参与直连蓝海活动场景（BLUE_SEA_FOOD_APPLY/BLUE_SEA_FMCG_APPLY）时必填，间连场景可空。
   * @return merchantLogon
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "13200132000", value = "参与蓝海活动的商户支付宝账号，只有当参与直连蓝海活动场景（BLUE_SEA_FOOD_APPLY/BLUE_SEA_FMCG_APPLY）时必填，间连场景可空。")

  public String getMerchantLogon() {
    return merchantLogon;
  }


  public void setMerchantLogon(String merchantLogon) {
    this.merchantLogon = merchantLogon;
  }


  public AlipayOpenSpBlueseaactivityCreateModel provinceCode(String provinceCode) {
    
    this.provinceCode = provinceCode;
    return this;
  }

   /**
   * 省份编码。请按照&lt;a href&#x3D;&#39;https://gw.alipayobjects.com/os/basement_prod/253c4dcb-b8a4-4a1e-8be2-79e191a9b6db.xlsx&#39;&gt;表格&lt;/a&gt; 中内容填写。 （请参考资料：&lt;a href&#x3D;&#39;http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/&#39;&gt;  统计用区划和城乡划分代码&lt;/a&gt;）
   * @return provinceCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "310000", value = "省份编码。请按照<a href='https://gw.alipayobjects.com/os/basement_prod/253c4dcb-b8a4-4a1e-8be2-79e191a9b6db.xlsx'>表格</a> 中内容填写。 （请参考资料：<a href='http://www.stats.gov.cn/tjsj/tjbz/tjyqhdmhcxhfdm/'>  统计用区划和城乡划分代码</a>）")

  public String getProvinceCode() {
    return provinceCode;
  }


  public void setProvinceCode(String provinceCode) {
    this.provinceCode = provinceCode;
  }


  public AlipayOpenSpBlueseaactivityCreateModel shopEntrancePic(String shopEntrancePic) {
    
    this.shopEntrancePic = shopEntrancePic;
    return this;
  }

   /**
   * 门头照，要求图片清晰可见，图片文件大小在 50K-5M 之间，不限制长宽，支持 png、bmp、gif、jpg、jpeg 格式。 请传入&lt;a href&#x3D;&#39;https://opendocs.alipay.com/apis/01ea4t&#39;&gt;alipay.open.sp.image.upload&lt;/a&gt;(图片上传接口) 返回的 image_id。 该资质是否必传请参见&lt;a href&#x3D;&#39;https://opendocs.alipay.com/open/01hd83&#39;&gt;报名资质要求&lt;/a&gt;。
   * @return shopEntrancePic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "A*7j1pTrCpV8EAAAAAAAAAAAAAAQAAAA", value = "门头照，要求图片清晰可见，图片文件大小在 50K-5M 之间，不限制长宽，支持 png、bmp、gif、jpg、jpeg 格式。 请传入<a href='https://opendocs.alipay.com/apis/01ea4t'>alipay.open.sp.image.upload</a>(图片上传接口) 返回的 image_id。 该资质是否必传请参见<a href='https://opendocs.alipay.com/open/01hd83'>报名资质要求</a>。")

  public String getShopEntrancePic() {
    return shopEntrancePic;
  }


  public void setShopEntrancePic(String shopEntrancePic) {
    this.shopEntrancePic = shopEntrancePic;
  }


  public AlipayOpenSpBlueseaactivityCreateModel subMerchantId(String subMerchantId) {
    
    this.subMerchantId = subMerchantId;
    return this;
  }

   /**
   * 参与蓝海活动的间连商户账号，只有当参与间连蓝海活动场景（BLUE_SEA_FOOD_INDIRECT_APPLY/BLUE_SEA_FMCG_INDIRECT_APPLY）时必填，直连场景可空。
   * @return subMerchantId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2088100010001000", value = "参与蓝海活动的间连商户账号，只有当参与间连蓝海活动场景（BLUE_SEA_FOOD_INDIRECT_APPLY/BLUE_SEA_FMCG_INDIRECT_APPLY）时必填，直连场景可空。")

  public String getSubMerchantId() {
    return subMerchantId;
  }


  public void setSubMerchantId(String subMerchantId) {
    this.subMerchantId = subMerchantId;
  }


  public AlipayOpenSpBlueseaactivityCreateModel tobaccoLic(String tobaccoLic) {
    
    this.tobaccoLic = tobaccoLic;
    return this;
  }

   /**
   * 烟草专卖零售许可证，要求证件文本信息清晰可见，图片文件大小在 50K-5M 之间，不限制长宽，支持 png、bmp、gif、jpg、jpeg 格式。 请传入&lt;a href&#x3D;&#39;https://opendocs.alipay.com/apis/01ea4t&#39;&gt;alipay.open.sp.image.upload&lt;/a&gt;(图片上传接口) 返回的 image_id。  该资质是否必传请参见&lt;a href&#x3D;&#39;https://opendocs.alipay.com/open/01hd83&#39;&gt;报名资质要求&lt;/a&gt;。
   * @return tobaccoLic
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "A*7j1pTrCpV8EAAAAAAAAAAAAAAQAAAA", value = "烟草专卖零售许可证，要求证件文本信息清晰可见，图片文件大小在 50K-5M 之间，不限制长宽，支持 png、bmp、gif、jpg、jpeg 格式。 请传入<a href='https://opendocs.alipay.com/apis/01ea4t'>alipay.open.sp.image.upload</a>(图片上传接口) 返回的 image_id。  该资质是否必传请参见<a href='https://opendocs.alipay.com/open/01hd83'>报名资质要求</a>。")

  public String getTobaccoLic() {
    return tobaccoLic;
  }


  public void setTobaccoLic(String tobaccoLic) {
    this.tobaccoLic = tobaccoLic;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AlipayOpenSpBlueseaactivityCreateModel alipayOpenSpBlueseaactivityCreateModel = (AlipayOpenSpBlueseaactivityCreateModel) o;
    return Objects.equals(this.address, alipayOpenSpBlueseaactivityCreateModel.address) &&
        Objects.equals(this.bizScene, alipayOpenSpBlueseaactivityCreateModel.bizScene) &&
        Objects.equals(this.businessLic, alipayOpenSpBlueseaactivityCreateModel.businessLic) &&
        Objects.equals(this.cityCode, alipayOpenSpBlueseaactivityCreateModel.cityCode) &&
        Objects.equals(this.districtCode, alipayOpenSpBlueseaactivityCreateModel.districtCode) &&
        Objects.equals(this.foodBusinessLic, alipayOpenSpBlueseaactivityCreateModel.foodBusinessLic) &&
        Objects.equals(this.foodCirculateLic, alipayOpenSpBlueseaactivityCreateModel.foodCirculateLic) &&
        Objects.equals(this.foodHealthLic, alipayOpenSpBlueseaactivityCreateModel.foodHealthLic) &&
        Objects.equals(this.foodProductionLic, alipayOpenSpBlueseaactivityCreateModel.foodProductionLic) &&
        Objects.equals(this.foodServiceLic, alipayOpenSpBlueseaactivityCreateModel.foodServiceLic) &&
        Objects.equals(this.indoorPic, alipayOpenSpBlueseaactivityCreateModel.indoorPic) &&
        Objects.equals(this.merchantLogon, alipayOpenSpBlueseaactivityCreateModel.merchantLogon) &&
        Objects.equals(this.provinceCode, alipayOpenSpBlueseaactivityCreateModel.provinceCode) &&
        Objects.equals(this.shopEntrancePic, alipayOpenSpBlueseaactivityCreateModel.shopEntrancePic) &&
        Objects.equals(this.subMerchantId, alipayOpenSpBlueseaactivityCreateModel.subMerchantId) &&
        Objects.equals(this.tobaccoLic, alipayOpenSpBlueseaactivityCreateModel.tobaccoLic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, bizScene, businessLic, cityCode, districtCode, foodBusinessLic, foodCirculateLic, foodHealthLic, foodProductionLic, foodServiceLic, indoorPic, merchantLogon, provinceCode, shopEntrancePic, subMerchantId, tobaccoLic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AlipayOpenSpBlueseaactivityCreateModel {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    bizScene: ").append(toIndentedString(bizScene)).append("\n");
    sb.append("    businessLic: ").append(toIndentedString(businessLic)).append("\n");
    sb.append("    cityCode: ").append(toIndentedString(cityCode)).append("\n");
    sb.append("    districtCode: ").append(toIndentedString(districtCode)).append("\n");
    sb.append("    foodBusinessLic: ").append(toIndentedString(foodBusinessLic)).append("\n");
    sb.append("    foodCirculateLic: ").append(toIndentedString(foodCirculateLic)).append("\n");
    sb.append("    foodHealthLic: ").append(toIndentedString(foodHealthLic)).append("\n");
    sb.append("    foodProductionLic: ").append(toIndentedString(foodProductionLic)).append("\n");
    sb.append("    foodServiceLic: ").append(toIndentedString(foodServiceLic)).append("\n");
    sb.append("    indoorPic: ").append(toIndentedString(indoorPic)).append("\n");
    sb.append("    merchantLogon: ").append(toIndentedString(merchantLogon)).append("\n");
    sb.append("    provinceCode: ").append(toIndentedString(provinceCode)).append("\n");
    sb.append("    shopEntrancePic: ").append(toIndentedString(shopEntrancePic)).append("\n");
    sb.append("    subMerchantId: ").append(toIndentedString(subMerchantId)).append("\n");
    sb.append("    tobaccoLic: ").append(toIndentedString(tobaccoLic)).append("\n");
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
    openapiFields.add("address");
    openapiFields.add("biz_scene");
    openapiFields.add("business_lic");
    openapiFields.add("city_code");
    openapiFields.add("district_code");
    openapiFields.add("food_business_lic");
    openapiFields.add("food_circulate_lic");
    openapiFields.add("food_health_lic");
    openapiFields.add("food_production_lic");
    openapiFields.add("food_service_lic");
    openapiFields.add("indoor_pic");
    openapiFields.add("merchant_logon");
    openapiFields.add("province_code");
    openapiFields.add("shop_entrance_pic");
    openapiFields.add("sub_merchant_id");
    openapiFields.add("tobacco_lic");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayOpenSpBlueseaactivityCreateModel
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AlipayOpenSpBlueseaactivityCreateModel.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AlipayOpenSpBlueseaactivityCreateModel is not found in the empty JSON string", AlipayOpenSpBlueseaactivityCreateModel.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AlipayOpenSpBlueseaactivityCreateModel.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AlipayOpenSpBlueseaactivityCreateModel` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if (jsonObj.get("address") != null && !jsonObj.get("address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("address").toString()));
      }
      if (jsonObj.get("biz_scene") != null && !jsonObj.get("biz_scene").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `biz_scene` to be a primitive type in the JSON string but got `%s`", jsonObj.get("biz_scene").toString()));
      }
      if (jsonObj.get("business_lic") != null && !jsonObj.get("business_lic").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `business_lic` to be a primitive type in the JSON string but got `%s`", jsonObj.get("business_lic").toString()));
      }
      if (jsonObj.get("city_code") != null && !jsonObj.get("city_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `city_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("city_code").toString()));
      }
      if (jsonObj.get("district_code") != null && !jsonObj.get("district_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `district_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("district_code").toString()));
      }
      if (jsonObj.get("food_business_lic") != null && !jsonObj.get("food_business_lic").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `food_business_lic` to be a primitive type in the JSON string but got `%s`", jsonObj.get("food_business_lic").toString()));
      }
      if (jsonObj.get("food_circulate_lic") != null && !jsonObj.get("food_circulate_lic").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `food_circulate_lic` to be a primitive type in the JSON string but got `%s`", jsonObj.get("food_circulate_lic").toString()));
      }
      if (jsonObj.get("food_health_lic") != null && !jsonObj.get("food_health_lic").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `food_health_lic` to be a primitive type in the JSON string but got `%s`", jsonObj.get("food_health_lic").toString()));
      }
      if (jsonObj.get("food_production_lic") != null && !jsonObj.get("food_production_lic").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `food_production_lic` to be a primitive type in the JSON string but got `%s`", jsonObj.get("food_production_lic").toString()));
      }
      if (jsonObj.get("food_service_lic") != null && !jsonObj.get("food_service_lic").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `food_service_lic` to be a primitive type in the JSON string but got `%s`", jsonObj.get("food_service_lic").toString()));
      }
      if (jsonObj.get("indoor_pic") != null && !jsonObj.get("indoor_pic").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `indoor_pic` to be a primitive type in the JSON string but got `%s`", jsonObj.get("indoor_pic").toString()));
      }
      if (jsonObj.get("merchant_logon") != null && !jsonObj.get("merchant_logon").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `merchant_logon` to be a primitive type in the JSON string but got `%s`", jsonObj.get("merchant_logon").toString()));
      }
      if (jsonObj.get("province_code") != null && !jsonObj.get("province_code").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `province_code` to be a primitive type in the JSON string but got `%s`", jsonObj.get("province_code").toString()));
      }
      if (jsonObj.get("shop_entrance_pic") != null && !jsonObj.get("shop_entrance_pic").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `shop_entrance_pic` to be a primitive type in the JSON string but got `%s`", jsonObj.get("shop_entrance_pic").toString()));
      }
      if (jsonObj.get("sub_merchant_id") != null && !jsonObj.get("sub_merchant_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sub_merchant_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sub_merchant_id").toString()));
      }
      if (jsonObj.get("tobacco_lic") != null && !jsonObj.get("tobacco_lic").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `tobacco_lic` to be a primitive type in the JSON string but got `%s`", jsonObj.get("tobacco_lic").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AlipayOpenSpBlueseaactivityCreateModel.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AlipayOpenSpBlueseaactivityCreateModel' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AlipayOpenSpBlueseaactivityCreateModel> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AlipayOpenSpBlueseaactivityCreateModel.class));

       return (TypeAdapter<T>) new TypeAdapter<AlipayOpenSpBlueseaactivityCreateModel>() {
           @Override
           public void write(JsonWriter out, AlipayOpenSpBlueseaactivityCreateModel value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AlipayOpenSpBlueseaactivityCreateModel read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of AlipayOpenSpBlueseaactivityCreateModel given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayOpenSpBlueseaactivityCreateModel
  * @throws IOException if the JSON string is invalid with respect to AlipayOpenSpBlueseaactivityCreateModel
  */
  public static AlipayOpenSpBlueseaactivityCreateModel fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayOpenSpBlueseaactivityCreateModel.class);
  }

 /**
  * Convert an instance of AlipayOpenSpBlueseaactivityCreateModel to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

