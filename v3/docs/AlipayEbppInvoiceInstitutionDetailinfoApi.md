# AlipayEbppInvoiceInstitutionDetailinfoApi

All URIs are relative to *https://openapi.alipay.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**query**](AlipayEbppInvoiceInstitutionDetailinfoApi.md#query) | **GET** /v3/alipay/ebpp/invoice/institution/detailinfo/query | 制度详情查询 |


<a name="query"></a>
# **query**
> AlipayEbppInvoiceInstitutionDetailinfoQueryResponseModel query(accountId, agreementNo, enterpriseId, institutionId)

制度详情查询

单个制度查询，返回制度详细信息，包含制度下使用规则列表和发放规则列表

### Example
```java
// Import classes:
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.Configuration;
import com.alipay.v3.util.*;
import com.alipay.v3.api.models.*;
import com.alipay.v3.api.AlipayEbppInvoiceInstitutionDetailinfoApi;

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

    AlipayEbppInvoiceInstitutionDetailinfoApi apiInstance = new AlipayEbppInvoiceInstitutionDetailinfoApi(defaultClient);
    String accountId = "2088000194958956"; // String | 企业共同账户id，和授权签约协议号共同使用。
    String agreementNo = "20215425001112341234"; // String | 授权签约协议号，可通过签约消息获取。配合企业共同账户id使用，当填写企业共同账户id时，此字段必填。
    String enterpriseId = "2088000194958956"; // String | 企业ID
    String institutionId = "2022071800152609780000004052"; // String | 制度id
    try {
      AlipayEbppInvoiceInstitutionDetailinfoQueryResponseModel result = apiInstance.query(accountId, agreementNo, enterpriseId, institutionId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AlipayEbppInvoiceInstitutionDetailinfoApi#query");
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
| **accountId** | **String**| 企业共同账户id，和授权签约协议号共同使用。 | [optional] |
| **agreementNo** | **String**| 授权签约协议号，可通过签约消息获取。配合企业共同账户id使用，当填写企业共同账户id时，此字段必填。 | [optional] |
| **enterpriseId** | **String**| 企业ID | [optional] |
| **institutionId** | **String**| 制度id | [optional] |

### Return type

**AlipayEbppInvoiceInstitutionDetailinfoQueryResponseModel**

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

