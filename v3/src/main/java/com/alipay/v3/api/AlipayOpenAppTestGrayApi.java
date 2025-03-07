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


import com.alipay.v3.model.AlipayOpenAppTestGrayCreateDefaultResponse;
import com.alipay.v3.model.AlipayOpenAppTestGrayCreateModel;
import com.alipay.v3.model.AlipayOpenAppTestGrayCreateResponseModel;
import com.alipay.v3.model.AlipayOpenAppTestGrayQueryDefaultResponse;
import com.alipay.v3.model.AlipayOpenAppTestGrayQueryResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayOpenAppTestGrayApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayOpenAppTestGrayApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayOpenAppTestGrayApi(ApiClient apiClient) {
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
     * Build call for create
     * @param a a (optional)
     * @param b 生 (optional)
     * @param c c1 (optional)
     * @param alipayOpenAppTestGrayCreateModel  (optional)
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
    public okhttp3.Call createCall(String a, String b, String c, AlipayOpenAppTestGrayCreateModel alipayOpenAppTestGrayCreateModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayOpenAppTestGrayCreateModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/open/app/test/gray/create";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (a != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("a", a));
        }

        if (b != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("b", b));
        }

        if (c != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("c", c));
        }

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
    private okhttp3.Call createValidateBeforeCall(String a, String b, String c, AlipayOpenAppTestGrayCreateModel alipayOpenAppTestGrayCreateModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = createCall(a, b, c, alipayOpenAppTestGrayCreateModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * openapi-oas3.0灰度
     * openapi，oas3.0灰度
     * @param a a (optional)
     * @param b 生 (optional)
     * @param c c1 (optional)
     * @param alipayOpenAppTestGrayCreateModel  (optional)
     * @return AlipayOpenAppTestGrayCreateResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayOpenAppTestGrayCreateResponseModel create(String a, String b, String c, AlipayOpenAppTestGrayCreateModel alipayOpenAppTestGrayCreateModel) throws ApiException {
        ApiResponse<AlipayOpenAppTestGrayCreateResponseModel> localVarResp = createWithHttpInfo(a, b, c, alipayOpenAppTestGrayCreateModel, null);
        return localVarResp.getData();
    }

    public AlipayOpenAppTestGrayCreateResponseModel create(String a, String b, String c, AlipayOpenAppTestGrayCreateModel alipayOpenAppTestGrayCreateModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayOpenAppTestGrayCreateResponseModel> localVarResp = createWithHttpInfo(a, b, c, alipayOpenAppTestGrayCreateModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * openapi-oas3.0灰度
     * openapi，oas3.0灰度
     * @param a a (optional)
     * @param b 生 (optional)
     * @param c c1 (optional)
     * @param alipayOpenAppTestGrayCreateModel  (optional)
     * @return ApiResponse&lt;AlipayOpenAppTestGrayCreateResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayOpenAppTestGrayCreateResponseModel> createWithHttpInfo(String a, String b, String c, AlipayOpenAppTestGrayCreateModel alipayOpenAppTestGrayCreateModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = createValidateBeforeCall(a, b, c, alipayOpenAppTestGrayCreateModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayOpenAppTestGrayCreateResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayOpenAppTestGrayCreateDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * openapi-oas3.0灰度 (asynchronously)
     * openapi，oas3.0灰度
     * @param a a (optional)
     * @param b 生 (optional)
     * @param c c1 (optional)
     * @param alipayOpenAppTestGrayCreateModel  (optional)
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
    public okhttp3.Call createAsync(String a, String b, String c, AlipayOpenAppTestGrayCreateModel alipayOpenAppTestGrayCreateModel, final ApiCallback<AlipayOpenAppTestGrayCreateResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = createValidateBeforeCall(a, b, c, alipayOpenAppTestGrayCreateModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayOpenAppTestGrayCreateResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call createAsync(String a, String b, String c, AlipayOpenAppTestGrayCreateModel alipayOpenAppTestGrayCreateModel, final ApiCallback<AlipayOpenAppTestGrayCreateResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = createValidateBeforeCall(a, b, c, alipayOpenAppTestGrayCreateModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayOpenAppTestGrayCreateResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for query
     * @param cityId 1 (optional)
     * @param uid 1 (optional)
     * @param buyOpenId 1 (optional)
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
    public okhttp3.Call queryCall(String cityId, String uid, String buyOpenId, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
        String localVarPath = "/v3/alipay/open/app/test/gray/query";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (cityId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("city_id", cityId));
        }

        if (uid != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("uid", uid));
        }

        if (buyOpenId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("buy_open_id", buyOpenId));
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
    private okhttp3.Call queryValidateBeforeCall(String cityId, String uid, String buyOpenId, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = queryCall(cityId, uid, buyOpenId, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * get
     * oas get
     * @param cityId 1 (optional)
     * @param uid 1 (optional)
     * @param buyOpenId 1 (optional)
     * @return AlipayOpenAppTestGrayQueryResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayOpenAppTestGrayQueryResponseModel query(String cityId, String uid, String buyOpenId) throws ApiException {
        ApiResponse<AlipayOpenAppTestGrayQueryResponseModel> localVarResp = queryWithHttpInfo(cityId, uid, buyOpenId, null);
        return localVarResp.getData();
    }

    public AlipayOpenAppTestGrayQueryResponseModel query(String cityId, String uid, String buyOpenId, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayOpenAppTestGrayQueryResponseModel> localVarResp = queryWithHttpInfo(cityId, uid, buyOpenId, customizedParams);
        return localVarResp.getData();
    }

    /**
     * get
     * oas get
     * @param cityId 1 (optional)
     * @param uid 1 (optional)
     * @param buyOpenId 1 (optional)
     * @return ApiResponse&lt;AlipayOpenAppTestGrayQueryResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayOpenAppTestGrayQueryResponseModel> queryWithHttpInfo(String cityId, String uid, String buyOpenId, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = queryValidateBeforeCall(cityId, uid, buyOpenId, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayOpenAppTestGrayQueryResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayOpenAppTestGrayQueryDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * get (asynchronously)
     * oas get
     * @param cityId 1 (optional)
     * @param uid 1 (optional)
     * @param buyOpenId 1 (optional)
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
    public okhttp3.Call queryAsync(String cityId, String uid, String buyOpenId, final ApiCallback<AlipayOpenAppTestGrayQueryResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(cityId, uid, buyOpenId, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayOpenAppTestGrayQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call queryAsync(String cityId, String uid, String buyOpenId, final ApiCallback<AlipayOpenAppTestGrayQueryResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(cityId, uid, buyOpenId, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayOpenAppTestGrayQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
