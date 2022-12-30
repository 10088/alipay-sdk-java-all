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


import com.alipay.v3.model.AlipayOfflineMarketShopBatchqueryDefaultResponse;
import com.alipay.v3.model.AlipayOfflineMarketShopBatchqueryModel;
import com.alipay.v3.model.AlipayOfflineMarketShopBatchqueryResponseModel;
import com.alipay.v3.model.AlipayOfflineMarketShopCreateDefaultResponse;
import com.alipay.v3.model.AlipayOfflineMarketShopCreateModel;
import com.alipay.v3.model.AlipayOfflineMarketShopCreateResponseModel;
import com.alipay.v3.model.AlipayOfflineMarketShopModifyDefaultResponse;
import com.alipay.v3.model.AlipayOfflineMarketShopModifyModel;
import com.alipay.v3.model.AlipayOfflineMarketShopModifyResponseModel;
import com.alipay.v3.model.AlipayOfflineMarketShopQuerydetailDefaultResponse;
import com.alipay.v3.model.AlipayOfflineMarketShopQuerydetailResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayOfflineMarketShopApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayOfflineMarketShopApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayOfflineMarketShopApi(ApiClient apiClient) {
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
     * Build call for batchquery
     * @param alipayOfflineMarketShopBatchqueryModel  (optional)
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
    public okhttp3.Call batchqueryCall(AlipayOfflineMarketShopBatchqueryModel alipayOfflineMarketShopBatchqueryModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayOfflineMarketShopBatchqueryModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/offline/market/shop/batchquery";

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
    private okhttp3.Call batchqueryValidateBeforeCall(AlipayOfflineMarketShopBatchqueryModel alipayOfflineMarketShopBatchqueryModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = batchqueryCall(alipayOfflineMarketShopBatchqueryModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 查询商户的门店编号列表
     * 系统商通过该接口可以查询对应APPID下所有的门店编号（支付宝口碑门店编号）
     * @param alipayOfflineMarketShopBatchqueryModel  (optional)
     * @return AlipayOfflineMarketShopBatchqueryResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayOfflineMarketShopBatchqueryResponseModel batchquery(AlipayOfflineMarketShopBatchqueryModel alipayOfflineMarketShopBatchqueryModel) throws ApiException {
        ApiResponse<AlipayOfflineMarketShopBatchqueryResponseModel> localVarResp = batchqueryWithHttpInfo(alipayOfflineMarketShopBatchqueryModel, null);
        return localVarResp.getData();
    }

    public AlipayOfflineMarketShopBatchqueryResponseModel batchquery(AlipayOfflineMarketShopBatchqueryModel alipayOfflineMarketShopBatchqueryModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayOfflineMarketShopBatchqueryResponseModel> localVarResp = batchqueryWithHttpInfo(alipayOfflineMarketShopBatchqueryModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 查询商户的门店编号列表
     * 系统商通过该接口可以查询对应APPID下所有的门店编号（支付宝口碑门店编号）
     * @param alipayOfflineMarketShopBatchqueryModel  (optional)
     * @return ApiResponse&lt;AlipayOfflineMarketShopBatchqueryResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayOfflineMarketShopBatchqueryResponseModel> batchqueryWithHttpInfo(AlipayOfflineMarketShopBatchqueryModel alipayOfflineMarketShopBatchqueryModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = batchqueryValidateBeforeCall(alipayOfflineMarketShopBatchqueryModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayOfflineMarketShopBatchqueryResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayOfflineMarketShopBatchqueryDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 查询商户的门店编号列表 (asynchronously)
     * 系统商通过该接口可以查询对应APPID下所有的门店编号（支付宝口碑门店编号）
     * @param alipayOfflineMarketShopBatchqueryModel  (optional)
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
    public okhttp3.Call batchqueryAsync(AlipayOfflineMarketShopBatchqueryModel alipayOfflineMarketShopBatchqueryModel, final ApiCallback<AlipayOfflineMarketShopBatchqueryResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = batchqueryValidateBeforeCall(alipayOfflineMarketShopBatchqueryModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayOfflineMarketShopBatchqueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call batchqueryAsync(AlipayOfflineMarketShopBatchqueryModel alipayOfflineMarketShopBatchqueryModel, final ApiCallback<AlipayOfflineMarketShopBatchqueryResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = batchqueryValidateBeforeCall(alipayOfflineMarketShopBatchqueryModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayOfflineMarketShopBatchqueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for create
     * @param alipayOfflineMarketShopCreateModel  (optional)
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
    public okhttp3.Call createCall(AlipayOfflineMarketShopCreateModel alipayOfflineMarketShopCreateModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayOfflineMarketShopCreateModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/offline/market/shop/create";

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
    private okhttp3.Call createValidateBeforeCall(AlipayOfflineMarketShopCreateModel alipayOfflineMarketShopCreateModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = createCall(alipayOfflineMarketShopCreateModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 创建门店信息
     * 系统商需要通过该接口在口碑平台帮助商户创建门店信息。
     * @param alipayOfflineMarketShopCreateModel  (optional)
     * @return AlipayOfflineMarketShopCreateResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayOfflineMarketShopCreateResponseModel create(AlipayOfflineMarketShopCreateModel alipayOfflineMarketShopCreateModel) throws ApiException {
        ApiResponse<AlipayOfflineMarketShopCreateResponseModel> localVarResp = createWithHttpInfo(alipayOfflineMarketShopCreateModel, null);
        return localVarResp.getData();
    }

    public AlipayOfflineMarketShopCreateResponseModel create(AlipayOfflineMarketShopCreateModel alipayOfflineMarketShopCreateModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayOfflineMarketShopCreateResponseModel> localVarResp = createWithHttpInfo(alipayOfflineMarketShopCreateModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 创建门店信息
     * 系统商需要通过该接口在口碑平台帮助商户创建门店信息。
     * @param alipayOfflineMarketShopCreateModel  (optional)
     * @return ApiResponse&lt;AlipayOfflineMarketShopCreateResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayOfflineMarketShopCreateResponseModel> createWithHttpInfo(AlipayOfflineMarketShopCreateModel alipayOfflineMarketShopCreateModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = createValidateBeforeCall(alipayOfflineMarketShopCreateModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayOfflineMarketShopCreateResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayOfflineMarketShopCreateDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 创建门店信息 (asynchronously)
     * 系统商需要通过该接口在口碑平台帮助商户创建门店信息。
     * @param alipayOfflineMarketShopCreateModel  (optional)
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
    public okhttp3.Call createAsync(AlipayOfflineMarketShopCreateModel alipayOfflineMarketShopCreateModel, final ApiCallback<AlipayOfflineMarketShopCreateResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = createValidateBeforeCall(alipayOfflineMarketShopCreateModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayOfflineMarketShopCreateResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call createAsync(AlipayOfflineMarketShopCreateModel alipayOfflineMarketShopCreateModel, final ApiCallback<AlipayOfflineMarketShopCreateResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = createValidateBeforeCall(alipayOfflineMarketShopCreateModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayOfflineMarketShopCreateResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for modify
     * @param alipayOfflineMarketShopModifyModel  (optional)
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
    public okhttp3.Call modifyCall(AlipayOfflineMarketShopModifyModel alipayOfflineMarketShopModifyModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayOfflineMarketShopModifyModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/offline/market/shop/modify";

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
    private okhttp3.Call modifyValidateBeforeCall(AlipayOfflineMarketShopModifyModel alipayOfflineMarketShopModifyModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = modifyCall(alipayOfflineMarketShopModifyModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 修改门店信息
     * 系统商需要通过该接口在口碑平台帮助商户修改门店信息，所有的选项都为非必填项，需要修改什么信息就传入什么参数，不传入的参数，则保持不变。修改门店名、品牌名、品牌logo、首图、门店图片、营业执照、营业执照编号、营业执照名称、经营许可证、经营许可证有效期、门店授权函、是否在其它平台开店、在其它平台开店照片，会重新触发风控审核，修改其他字段不会触发风控审核。
     * @param alipayOfflineMarketShopModifyModel  (optional)
     * @return AlipayOfflineMarketShopModifyResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayOfflineMarketShopModifyResponseModel modify(AlipayOfflineMarketShopModifyModel alipayOfflineMarketShopModifyModel) throws ApiException {
        ApiResponse<AlipayOfflineMarketShopModifyResponseModel> localVarResp = modifyWithHttpInfo(alipayOfflineMarketShopModifyModel, null);
        return localVarResp.getData();
    }

    public AlipayOfflineMarketShopModifyResponseModel modify(AlipayOfflineMarketShopModifyModel alipayOfflineMarketShopModifyModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayOfflineMarketShopModifyResponseModel> localVarResp = modifyWithHttpInfo(alipayOfflineMarketShopModifyModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 修改门店信息
     * 系统商需要通过该接口在口碑平台帮助商户修改门店信息，所有的选项都为非必填项，需要修改什么信息就传入什么参数，不传入的参数，则保持不变。修改门店名、品牌名、品牌logo、首图、门店图片、营业执照、营业执照编号、营业执照名称、经营许可证、经营许可证有效期、门店授权函、是否在其它平台开店、在其它平台开店照片，会重新触发风控审核，修改其他字段不会触发风控审核。
     * @param alipayOfflineMarketShopModifyModel  (optional)
     * @return ApiResponse&lt;AlipayOfflineMarketShopModifyResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayOfflineMarketShopModifyResponseModel> modifyWithHttpInfo(AlipayOfflineMarketShopModifyModel alipayOfflineMarketShopModifyModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = modifyValidateBeforeCall(alipayOfflineMarketShopModifyModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayOfflineMarketShopModifyResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayOfflineMarketShopModifyDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 修改门店信息 (asynchronously)
     * 系统商需要通过该接口在口碑平台帮助商户修改门店信息，所有的选项都为非必填项，需要修改什么信息就传入什么参数，不传入的参数，则保持不变。修改门店名、品牌名、品牌logo、首图、门店图片、营业执照、营业执照编号、营业执照名称、经营许可证、经营许可证有效期、门店授权函、是否在其它平台开店、在其它平台开店照片，会重新触发风控审核，修改其他字段不会触发风控审核。
     * @param alipayOfflineMarketShopModifyModel  (optional)
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
    public okhttp3.Call modifyAsync(AlipayOfflineMarketShopModifyModel alipayOfflineMarketShopModifyModel, final ApiCallback<AlipayOfflineMarketShopModifyResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = modifyValidateBeforeCall(alipayOfflineMarketShopModifyModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayOfflineMarketShopModifyResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call modifyAsync(AlipayOfflineMarketShopModifyModel alipayOfflineMarketShopModifyModel, final ApiCallback<AlipayOfflineMarketShopModifyResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = modifyValidateBeforeCall(alipayOfflineMarketShopModifyModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayOfflineMarketShopModifyResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for querydetail
     * @param shopId 支付宝门店ID (optional)
     * @param opRole 服务商及商户调用情况下务必传递。操作人角色，默认商户操作:MERCHANT；服务商操作：PROVIDER；ISV: 不需要填写 (optional)
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
    public okhttp3.Call querydetailCall(String shopId, String opRole, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
        String localVarPath = "/v3/alipay/offline/market/shop/querydetail";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (shopId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("shop_id", shopId));
        }

        if (opRole != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("op_role", opRole));
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
    private okhttp3.Call querydetailValidateBeforeCall(String shopId, String opRole, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = querydetailCall(shopId, opRole, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 查询单个门店信息接口
     * 系统商通过该接口可以查询单个门店的详细信息，包括门店基础信息，门店状态等信息
     * @param shopId 支付宝门店ID (optional)
     * @param opRole 服务商及商户调用情况下务必传递。操作人角色，默认商户操作:MERCHANT；服务商操作：PROVIDER；ISV: 不需要填写 (optional)
     * @return AlipayOfflineMarketShopQuerydetailResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayOfflineMarketShopQuerydetailResponseModel querydetail(String shopId, String opRole) throws ApiException {
        ApiResponse<AlipayOfflineMarketShopQuerydetailResponseModel> localVarResp = querydetailWithHttpInfo(shopId, opRole, null);
        return localVarResp.getData();
    }

    public AlipayOfflineMarketShopQuerydetailResponseModel querydetail(String shopId, String opRole, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayOfflineMarketShopQuerydetailResponseModel> localVarResp = querydetailWithHttpInfo(shopId, opRole, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 查询单个门店信息接口
     * 系统商通过该接口可以查询单个门店的详细信息，包括门店基础信息，门店状态等信息
     * @param shopId 支付宝门店ID (optional)
     * @param opRole 服务商及商户调用情况下务必传递。操作人角色，默认商户操作:MERCHANT；服务商操作：PROVIDER；ISV: 不需要填写 (optional)
     * @return ApiResponse&lt;AlipayOfflineMarketShopQuerydetailResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayOfflineMarketShopQuerydetailResponseModel> querydetailWithHttpInfo(String shopId, String opRole, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = querydetailValidateBeforeCall(shopId, opRole, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayOfflineMarketShopQuerydetailResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayOfflineMarketShopQuerydetailDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 查询单个门店信息接口 (asynchronously)
     * 系统商通过该接口可以查询单个门店的详细信息，包括门店基础信息，门店状态等信息
     * @param shopId 支付宝门店ID (optional)
     * @param opRole 服务商及商户调用情况下务必传递。操作人角色，默认商户操作:MERCHANT；服务商操作：PROVIDER；ISV: 不需要填写 (optional)
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
    public okhttp3.Call querydetailAsync(String shopId, String opRole, final ApiCallback<AlipayOfflineMarketShopQuerydetailResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = querydetailValidateBeforeCall(shopId, opRole, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayOfflineMarketShopQuerydetailResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call querydetailAsync(String shopId, String opRole, final ApiCallback<AlipayOfflineMarketShopQuerydetailResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = querydetailValidateBeforeCall(shopId, opRole, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayOfflineMarketShopQuerydetailResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
