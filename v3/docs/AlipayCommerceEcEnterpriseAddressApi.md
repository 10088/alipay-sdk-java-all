# AlipayCommerceEcEnterpriseAddressApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**add**](AlipayCommerceEcEnterpriseAddressApi.md#add) | **POST** /v3/alipay/commerce/ec/enterprise/address | 企业地址添加 |
| [**modify**](AlipayCommerceEcEnterpriseAddressApi.md#modify) | **PUT** /v3/alipay/commerce/ec/enterprise/address | 企业地址修改 |
| [**query**](AlipayCommerceEcEnterpriseAddressApi.md#query) | **GET** /v3/alipay/commerce/ec/enterprise/address | 企业地址查询 |


<a name="add"></a>
# **add**
> AlipayCommerceEcEnterpriseAddressAddResponseModel add(alipayCommerceEcEnterpriseAddressAddModel)

企业地址添加

企业地址添加

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayCommerceEcEnterpriseAddressApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.alipay.com");
    // 设置alipayConfig参数（全局设置一次）
    AlipayConfig config = new AlipayConfig();
    config.setAppId("app_id");
    config.setPrivateKey("private_key");
    config.setAlipayPublicKey("alipay_public_key");
    config.setEncryptKey("encrypt_key");
    defaultClient.setAlipayConfig(config);

    AlipayCommerceEcEnterpriseAddressApi apiInstance = new AlipayCommerceEcEnterpriseAddressApi(defaultClient);
    AlipayCommerceEcEnterpriseAddressAddModel alipayCommerceEcEnterpriseAddressAddModel = new AlipayCommerceEcEnterpriseAddressAddModel(); // AlipayCommerceEcEnterpriseAddressAddModel | 
    try {
      AlipayCommerceEcEnterpriseAddressAddResponseModel result = apiInstance.add(alipayCommerceEcEnterpriseAddressAddModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayCommerceEcEnterpriseAddressApi#add");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **alipayCommerceEcEnterpriseAddressAddModel** | **AlipayCommerceEcEnterpriseAddressAddModel**|  | [optional] |

### Return type

**AlipayCommerceEcEnterpriseAddressAddResponseModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | common response |  -  |
| **0** | 请求失败 |  -  |

<a name="modify"></a>
# **modify**
> AlipayCommerceEcEnterpriseAddressModifyResponseModel modify(alipayCommerceEcEnterpriseAddressModifyModel)

企业地址修改

企业地址修改

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayCommerceEcEnterpriseAddressApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.alipay.com");
    // 设置alipayConfig参数（全局设置一次）
    AlipayConfig config = new AlipayConfig();
    config.setAppId("app_id");
    config.setPrivateKey("private_key");
    config.setAlipayPublicKey("alipay_public_key");
    config.setEncryptKey("encrypt_key");
    defaultClient.setAlipayConfig(config);

    AlipayCommerceEcEnterpriseAddressApi apiInstance = new AlipayCommerceEcEnterpriseAddressApi(defaultClient);
    AlipayCommerceEcEnterpriseAddressModifyModel alipayCommerceEcEnterpriseAddressModifyModel = new AlipayCommerceEcEnterpriseAddressModifyModel(); // AlipayCommerceEcEnterpriseAddressModifyModel | 
    try {
      AlipayCommerceEcEnterpriseAddressModifyResponseModel result = apiInstance.modify(alipayCommerceEcEnterpriseAddressModifyModel);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayCommerceEcEnterpriseAddressApi#modify");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **alipayCommerceEcEnterpriseAddressModifyModel** | **AlipayCommerceEcEnterpriseAddressModifyModel**|  | [optional] |

### Return type

**AlipayCommerceEcEnterpriseAddressModifyResponseModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | common response |  -  |
| **0** | 请求失败 |  -  |

<a name="query"></a>
# **query**
> AlipayCommerceEcEnterpriseAddressQueryResponseModel query(enterpriseId, accountId, agreementNo, addressId, cityCode, pageNum, pageSize)

企业地址查询

查询企业地址信息

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayCommerceEcEnterpriseAddressApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://openapi.alipay.com");
    // 设置alipayConfig参数（全局设置一次）
    AlipayConfig config = new AlipayConfig();
    config.setAppId("app_id");
    config.setPrivateKey("private_key");
    config.setAlipayPublicKey("alipay_public_key");
    config.setEncryptKey("encrypt_key");
    defaultClient.setAlipayConfig(config);

    AlipayCommerceEcEnterpriseAddressApi apiInstance = new AlipayCommerceEcEnterpriseAddressApi(defaultClient);
    String enterpriseId = "208890399440"; // String | 企业id和account_id二选一
    String accountId = "2088483784949"; // String | 共同账户id和enterprise_id二选一
    String agreementNo = "23893293203"; // String | 协议号，如果填共同账户id，则该字段必填
    String addressId = "190309300303"; // String | 地址id
    String cityCode = "310023"; // String | 市
    Integer pageNum = 1; // Integer | 页码从1开始
    Integer pageSize = 20; // Integer | 每页数据
    try {
      AlipayCommerceEcEnterpriseAddressQueryResponseModel result = apiInstance.query(enterpriseId, accountId, agreementNo, addressId, cityCode, pageNum, pageSize);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayCommerceEcEnterpriseAddressApi#query");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **enterpriseId** | **String**| 企业id和account_id二选一 | [optional] |
| **accountId** | **String**| 共同账户id和enterprise_id二选一 | [optional] |
| **agreementNo** | **String**| 协议号，如果填共同账户id，则该字段必填 | [optional] |
| **addressId** | **String**| 地址id | [optional] |
| **cityCode** | **String**| 市 | [optional] |
| **pageNum** | **Integer**| 页码从1开始 | [optional] |
| **pageSize** | **Integer**| 每页数据 | [optional] |

### Return type

**AlipayCommerceEcEnterpriseAddressQueryResponseModel**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | common response |  -  |
| **0** | 请求失败 |  -  |

