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


package com.alipay.v3.api;

import com.alipay.v3.ApiCallback;
import com.alipay.v3.ApiClient;
import com.alipay.v3.ApiException;
import com.alipay.v3.ApiResponse;
import com.alipay.v3.Configuration;
import com.alipay.v3.Pair;
import com.alipay.v3.ProgressRequestBody;
import com.alipay.v3.ProgressResponseBody;
import com.alipay.v3.util.AlipayLogger;
import com.alipay.v3.util.model.CustomizedParams;

import com.google.common.base.Strings;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.alipay.v3.model.AlipayFundEnterprisepayGroupAddDefaultResponse;
import com.alipay.v3.model.AlipayFundEnterprisepayGroupAddModel;
import com.alipay.v3.model.AlipayFundEnterprisepayGroupAddResponseModel;
import com.alipay.v3.model.AlipayFundEnterprisepayGroupDeleteDefaultResponse;
import com.alipay.v3.model.AlipayFundEnterprisepayGroupModifyDefaultResponse;
import com.alipay.v3.model.AlipayFundEnterprisepayGroupModifyModel;
import com.alipay.v3.model.AlipayFundEnterprisepayGroupQueryDefaultResponse;
import com.alipay.v3.model.AlipayFundEnterprisepayGroupQueryResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayFundEnterprisepayGroupApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayFundEnterprisepayGroupApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayFundEnterprisepayGroupApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for add
     * @param alipayFundEnterprisepayGroupAddModel  (optional)
     * @param _callback Callback for upload/download progress
     * @param customizedParams
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addCall(AlipayFundEnterprisepayGroupAddModel alipayFundEnterprisepayGroupAddModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = (customizedParams != null && !Strings.isNullOrEmpty(customizedParams.getBodyContent()))
                ? customizedParams.getBodyContent() : alipayFundEnterprisepayGroupAddModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/fund/enterprisepay/group/add";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        if (customizedParams != null) {
            //额外query参数
            if (customizedParams.getQueryParams() != null && customizedParams.getQueryParams().size() > 0) {
                for (Map.Entry<String, String> entry : customizedParams.getQueryParams().entrySet()) {
                    localVarQueryParams.addAll(localVarApiClient.parameterToPair(entry.getKey(), entry.getValue()));
                }
            }

            if (!Strings.isNullOrEmpty(customizedParams.getAppAuthToken())) {
                localVarHeaderParams.put("alipay-app-auth-token", customizedParams.getAppAuthToken());
            }

            //额外非全局header参数
            if (customizedParams.getHeaderParams() != null && customizedParams.getHeaderParams().size() > 0) {
                localVarHeaderParams.putAll(customizedParams.getHeaderParams());
            }
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call addValidateBeforeCall(AlipayFundEnterprisepayGroupAddModel alipayFundEnterprisepayGroupAddModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = addCall(alipayFundEnterprisepayGroupAddModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 因公付新增账户下群组
     * 创建因公付群组，包含群组信息和出资信息
     * @param alipayFundEnterprisepayGroupAddModel  (optional)
     * @return AlipayFundEnterprisepayGroupAddResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayFundEnterprisepayGroupAddResponseModel add(AlipayFundEnterprisepayGroupAddModel alipayFundEnterprisepayGroupAddModel) throws ApiException {
        ApiResponse<AlipayFundEnterprisepayGroupAddResponseModel> localVarResp = addWithHttpInfo(alipayFundEnterprisepayGroupAddModel, null);
        return localVarResp.getData();
    }

    public AlipayFundEnterprisepayGroupAddResponseModel add(AlipayFundEnterprisepayGroupAddModel alipayFundEnterprisepayGroupAddModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayFundEnterprisepayGroupAddResponseModel> localVarResp = addWithHttpInfo(alipayFundEnterprisepayGroupAddModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 因公付新增账户下群组
     * 创建因公付群组，包含群组信息和出资信息
     * @param alipayFundEnterprisepayGroupAddModel  (optional)
     * @return ApiResponse&lt;AlipayFundEnterprisepayGroupAddResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayFundEnterprisepayGroupAddResponseModel> addWithHttpInfo(AlipayFundEnterprisepayGroupAddModel alipayFundEnterprisepayGroupAddModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = addValidateBeforeCall(alipayFundEnterprisepayGroupAddModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayFundEnterprisepayGroupAddResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayFundEnterprisepayGroupAddDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 因公付新增账户下群组 (asynchronously)
     * 创建因公付群组，包含群组信息和出资信息
     * @param alipayFundEnterprisepayGroupAddModel  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call addAsync(AlipayFundEnterprisepayGroupAddModel alipayFundEnterprisepayGroupAddModel, final ApiCallback<AlipayFundEnterprisepayGroupAddResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = addValidateBeforeCall(alipayFundEnterprisepayGroupAddModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayFundEnterprisepayGroupAddResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call addAsync(AlipayFundEnterprisepayGroupAddModel alipayFundEnterprisepayGroupAddModel, final ApiCallback<AlipayFundEnterprisepayGroupAddResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = addValidateBeforeCall(alipayFundEnterprisepayGroupAddModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayFundEnterprisepayGroupAddResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for delete
     * @param productCode 产品码，默认值 ENTERPRISE_PAY (optional)
     * @param bizScene 场景码，联系支付宝分配 (optional)
     * @param accountId 企业签约账户ID (optional)
     * @param agreementNo 平台和企业的三方授权协议号 (optional)
     * @param outBizNo 外部业务号 (optional)
     * @param _callback Callback for upload/download progress
     * @param customizedParams
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteCall(String productCode, String bizScene, String accountId, String agreementNo, String outBizNo, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v3/alipay/fund/enterprisepay/group/delete";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (productCode != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("product_code", productCode));
        }

        if (bizScene != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("biz_scene", bizScene));
        }

        if (accountId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("account_id", accountId));
        }

        if (agreementNo != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("agreement_no", agreementNo));
        }

        if (outBizNo != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("out_biz_no", outBizNo));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        if (customizedParams != null) {
            //额外query参数
            if (customizedParams.getQueryParams() != null && customizedParams.getQueryParams().size() > 0) {
                for (Map.Entry<String, String> entry : customizedParams.getQueryParams().entrySet()) {
                    localVarQueryParams.addAll(localVarApiClient.parameterToPair(entry.getKey(), entry.getValue()));
                }
            }

            if (!Strings.isNullOrEmpty(customizedParams.getAppAuthToken())) {
                localVarHeaderParams.put("alipay-app-auth-token", customizedParams.getAppAuthToken());
            }

            //额外非全局header参数
            if (customizedParams.getHeaderParams() != null && customizedParams.getHeaderParams().size() > 0) {
                localVarHeaderParams.putAll(customizedParams.getHeaderParams());
            }
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteValidateBeforeCall(String productCode, String bizScene, String accountId, String agreementNo, String outBizNo, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = deleteCall(productCode, bizScene, accountId, agreementNo, outBizNo, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 因公付删除账户下群组
     * 因公付删除账户下群组
     * @param productCode 产品码，默认值 ENTERPRISE_PAY (optional)
     * @param bizScene 场景码，联系支付宝分配 (optional)
     * @param accountId 企业签约账户ID (optional)
     * @param agreementNo 平台和企业的三方授权协议号 (optional)
     * @param outBizNo 外部业务号 (optional)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public Object delete(String productCode, String bizScene, String accountId, String agreementNo, String outBizNo) throws ApiException {
        ApiResponse<Object> localVarResp = deleteWithHttpInfo(productCode, bizScene, accountId, agreementNo, outBizNo, null);
        return localVarResp.getData();
    }

    public Object delete(String productCode, String bizScene, String accountId, String agreementNo, String outBizNo, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<Object> localVarResp = deleteWithHttpInfo(productCode, bizScene, accountId, agreementNo, outBizNo, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 因公付删除账户下群组
     * 因公付删除账户下群组
     * @param productCode 产品码，默认值 ENTERPRISE_PAY (optional)
     * @param bizScene 场景码，联系支付宝分配 (optional)
     * @param accountId 企业签约账户ID (optional)
     * @param agreementNo 平台和企业的三方授权协议号 (optional)
     * @param outBizNo 外部业务号 (optional)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Object> deleteWithHttpInfo(String productCode, String bizScene, String accountId, String agreementNo, String outBizNo, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = deleteValidateBeforeCall(productCode, bizScene, accountId, agreementNo, outBizNo, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<Object>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayFundEnterprisepayGroupDeleteDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 因公付删除账户下群组 (asynchronously)
     * 因公付删除账户下群组
     * @param productCode 产品码，默认值 ENTERPRISE_PAY (optional)
     * @param bizScene 场景码，联系支付宝分配 (optional)
     * @param accountId 企业签约账户ID (optional)
     * @param agreementNo 平台和企业的三方授权协议号 (optional)
     * @param outBizNo 外部业务号 (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteAsync(String productCode, String bizScene, String accountId, String agreementNo, String outBizNo, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteValidateBeforeCall(productCode, bizScene, accountId, agreementNo, outBizNo, _callback, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call deleteAsync(String productCode, String bizScene, String accountId, String agreementNo, String outBizNo, final ApiCallback<Object> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = deleteValidateBeforeCall(productCode, bizScene, accountId, agreementNo, outBizNo, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for modify
     * @param alipayFundEnterprisepayGroupModifyModel  (optional)
     * @param _callback Callback for upload/download progress
     * @param customizedParams
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call modifyCall(AlipayFundEnterprisepayGroupModifyModel alipayFundEnterprisepayGroupModifyModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = (customizedParams != null && !Strings.isNullOrEmpty(customizedParams.getBodyContent()))
                ? customizedParams.getBodyContent() : alipayFundEnterprisepayGroupModifyModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/fund/enterprisepay/group/modify";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        if (customizedParams != null) {
            //额外query参数
            if (customizedParams.getQueryParams() != null && customizedParams.getQueryParams().size() > 0) {
                for (Map.Entry<String, String> entry : customizedParams.getQueryParams().entrySet()) {
                    localVarQueryParams.addAll(localVarApiClient.parameterToPair(entry.getKey(), entry.getValue()));
                }
            }

            if (!Strings.isNullOrEmpty(customizedParams.getAppAuthToken())) {
                localVarHeaderParams.put("alipay-app-auth-token", customizedParams.getAppAuthToken());
            }

            //额外非全局header参数
            if (customizedParams.getHeaderParams() != null && customizedParams.getHeaderParams().size() > 0) {
                localVarHeaderParams.putAll(customizedParams.getHeaderParams());
            }
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call modifyValidateBeforeCall(AlipayFundEnterprisepayGroupModifyModel alipayFundEnterprisepayGroupModifyModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = modifyCall(alipayFundEnterprisepayGroupModifyModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 因公付更新账户下群组
     * 因公付更新账户下群组
     * @param alipayFundEnterprisepayGroupModifyModel  (optional)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public Object modify(AlipayFundEnterprisepayGroupModifyModel alipayFundEnterprisepayGroupModifyModel) throws ApiException {
        ApiResponse<Object> localVarResp = modifyWithHttpInfo(alipayFundEnterprisepayGroupModifyModel, null);
        return localVarResp.getData();
    }

    public Object modify(AlipayFundEnterprisepayGroupModifyModel alipayFundEnterprisepayGroupModifyModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<Object> localVarResp = modifyWithHttpInfo(alipayFundEnterprisepayGroupModifyModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 因公付更新账户下群组
     * 因公付更新账户下群组
     * @param alipayFundEnterprisepayGroupModifyModel  (optional)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Object> modifyWithHttpInfo(AlipayFundEnterprisepayGroupModifyModel alipayFundEnterprisepayGroupModifyModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = modifyValidateBeforeCall(alipayFundEnterprisepayGroupModifyModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<Object>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayFundEnterprisepayGroupModifyDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 因公付更新账户下群组 (asynchronously)
     * 因公付更新账户下群组
     * @param alipayFundEnterprisepayGroupModifyModel  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call modifyAsync(AlipayFundEnterprisepayGroupModifyModel alipayFundEnterprisepayGroupModifyModel, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = modifyValidateBeforeCall(alipayFundEnterprisepayGroupModifyModel, _callback, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call modifyAsync(AlipayFundEnterprisepayGroupModifyModel alipayFundEnterprisepayGroupModifyModel, final ApiCallback<Object> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = modifyValidateBeforeCall(alipayFundEnterprisepayGroupModifyModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for query
     * @param productCode 产品码，默认值 ENTERPRISE_PAY (optional)
     * @param bizScene 场景码，联系支付宝分配 (optional)
     * @param accountId 企业签约账户ID (optional)
     * @param agreementNo 平台和企业的三方授权协议号 (optional)
     * @param outBizNo 外部业务号，外部群组号 (optional)
     * @param _callback Callback for upload/download progress
     * @param customizedParams
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call queryCall(String productCode, String bizScene, String accountId, String agreementNo, String outBizNo, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v3/alipay/fund/enterprisepay/group/query";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (productCode != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("product_code", productCode));
        }

        if (bizScene != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("biz_scene", bizScene));
        }

        if (accountId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("account_id", accountId));
        }

        if (agreementNo != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("agreement_no", agreementNo));
        }

        if (outBizNo != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("out_biz_no", outBizNo));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        if (customizedParams != null) {
            //额外query参数
            if (customizedParams.getQueryParams() != null && customizedParams.getQueryParams().size() > 0) {
                for (Map.Entry<String, String> entry : customizedParams.getQueryParams().entrySet()) {
                    localVarQueryParams.addAll(localVarApiClient.parameterToPair(entry.getKey(), entry.getValue()));
                }
            }

            if (!Strings.isNullOrEmpty(customizedParams.getAppAuthToken())) {
                localVarHeaderParams.put("alipay-app-auth-token", customizedParams.getAppAuthToken());
            }

            //额外非全局header参数
            if (customizedParams.getHeaderParams() != null && customizedParams.getHeaderParams().size() > 0) {
                localVarHeaderParams.putAll(customizedParams.getHeaderParams());
            }
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call queryValidateBeforeCall(String productCode, String bizScene, String accountId, String agreementNo, String outBizNo, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = queryCall(productCode, bizScene, accountId, agreementNo, outBizNo, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 因公付查询账户下群组
     * 查询因公付群组，包含群组信息和对应的出资主体
     * @param productCode 产品码，默认值 ENTERPRISE_PAY (optional)
     * @param bizScene 场景码，联系支付宝分配 (optional)
     * @param accountId 企业签约账户ID (optional)
     * @param agreementNo 平台和企业的三方授权协议号 (optional)
     * @param outBizNo 外部业务号，外部群组号 (optional)
     * @return AlipayFundEnterprisepayGroupQueryResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayFundEnterprisepayGroupQueryResponseModel query(String productCode, String bizScene, String accountId, String agreementNo, String outBizNo) throws ApiException {
        ApiResponse<AlipayFundEnterprisepayGroupQueryResponseModel> localVarResp = queryWithHttpInfo(productCode, bizScene, accountId, agreementNo, outBizNo, null);
        return localVarResp.getData();
    }

    public AlipayFundEnterprisepayGroupQueryResponseModel query(String productCode, String bizScene, String accountId, String agreementNo, String outBizNo, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayFundEnterprisepayGroupQueryResponseModel> localVarResp = queryWithHttpInfo(productCode, bizScene, accountId, agreementNo, outBizNo, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 因公付查询账户下群组
     * 查询因公付群组，包含群组信息和对应的出资主体
     * @param productCode 产品码，默认值 ENTERPRISE_PAY (optional)
     * @param bizScene 场景码，联系支付宝分配 (optional)
     * @param accountId 企业签约账户ID (optional)
     * @param agreementNo 平台和企业的三方授权协议号 (optional)
     * @param outBizNo 外部业务号，外部群组号 (optional)
     * @return ApiResponse&lt;AlipayFundEnterprisepayGroupQueryResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayFundEnterprisepayGroupQueryResponseModel> queryWithHttpInfo(String productCode, String bizScene, String accountId, String agreementNo, String outBizNo, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = queryValidateBeforeCall(productCode, bizScene, accountId, agreementNo, outBizNo, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayFundEnterprisepayGroupQueryResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayFundEnterprisepayGroupQueryDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 因公付查询账户下群组 (asynchronously)
     * 查询因公付群组，包含群组信息和对应的出资主体
     * @param productCode 产品码，默认值 ENTERPRISE_PAY (optional)
     * @param bizScene 场景码，联系支付宝分配 (optional)
     * @param accountId 企业签约账户ID (optional)
     * @param agreementNo 平台和企业的三方授权协议号 (optional)
     * @param outBizNo 外部业务号，外部群组号 (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call queryAsync(String productCode, String bizScene, String accountId, String agreementNo, String outBizNo, final ApiCallback<AlipayFundEnterprisepayGroupQueryResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(productCode, bizScene, accountId, agreementNo, outBizNo, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayFundEnterprisepayGroupQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call queryAsync(String productCode, String bizScene, String accountId, String agreementNo, String outBizNo, final ApiCallback<AlipayFundEnterprisepayGroupQueryResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(productCode, bizScene, accountId, agreementNo, outBizNo, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayFundEnterprisepayGroupQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
