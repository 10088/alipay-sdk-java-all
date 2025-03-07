# AlipayOpenMiniVersionListApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayOpenMiniVersionListApi.md#query) | **GET** /v3/alipay/open/mini/version/list/query | 小程序版本列表查询 |


<a name="query"></a>
# **query**
> AlipayOpenMiniVersionListQueryResponseModel query(bundleId, versionStatus)

小程序版本列表查询

根据状态、端分页查询小程序版本基础信息列表，查询结果根据版本号大小降序排列，即0.0.2在前，0.0.1在后。

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayOpenMiniVersionListApi;

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

    AlipayOpenMiniVersionListApi apiInstance = new AlipayOpenMiniVersionListApi(defaultClient);
    String bundleId = "com.alipay.alipaywallet"; // String | 端参数，用于查询多端版本，不传默认为支付宝端。 高德端：com.amap.app
    String versionStatus = "AUDITING"; // String | 版本状态列表，用英文逗号\",\"分割，可选；不填默认不返回，状态可选值以及说明如下-INIT: 开发中, AUDITING: 审核中, AUDIT_REJECT: 审核驳回, WAIT_RELEASE: 待上架, BASE_AUDIT_PASS: 准入不可营销, GRAY: 灰度中, RELEASE: 已上架, OFFLINE: 已下架, AUDIT_OFFLINE: 已下架;
    try {
      AlipayOpenMiniVersionListQueryResponseModel result = apiInstance.query(bundleId, versionStatus);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayOpenMiniVersionListApi#query");
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
| **bundleId** | **String**| 端参数，用于查询多端版本，不传默认为支付宝端。 高德端：com.amap.app | [optional] |
| **versionStatus** | **String**| 版本状态列表，用英文逗号\&quot;,\&quot;分割，可选；不填默认不返回，状态可选值以及说明如下-INIT: 开发中, AUDITING: 审核中, AUDIT_REJECT: 审核驳回, WAIT_RELEASE: 待上架, BASE_AUDIT_PASS: 准入不可营销, GRAY: 灰度中, RELEASE: 已上架, OFFLINE: 已下架, AUDIT_OFFLINE: 已下架; | [optional] |

### Return type

**AlipayOpenMiniVersionListQueryResponseModel**

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

