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


import com.alipay.v3.model.AlipayOpenMiniQrcodeBindDefaultResponse;
import com.alipay.v3.model.AlipayOpenMiniQrcodeBindModel;
import com.alipay.v3.model.AlipayOpenMiniQrcodeBindResponseModel;
import com.alipay.v3.model.AlipayOpenMiniQrcodeQueryDefaultResponse;
import com.alipay.v3.model.AlipayOpenMiniQrcodeQueryResponseModel;
import com.alipay.v3.model.AlipayOpenMiniQrcodeUnbindDefaultResponse;
import com.alipay.v3.model.AlipayOpenMiniQrcodeUnbindModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayOpenMiniQrcodeApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayOpenMiniQrcodeApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayOpenMiniQrcodeApi(ApiClient apiClient) {
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
     * Build call for bind
     * @param alipayOpenMiniQrcodeBindModel  (optional)
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
    public okhttp3.Call bindCall(AlipayOpenMiniQrcodeBindModel alipayOpenMiniQrcodeBindModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayOpenMiniQrcodeBindModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/open/mini/qrcode/bind";

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
    private okhttp3.Call bindValidateBeforeCall(AlipayOpenMiniQrcodeBindModel alipayOpenMiniQrcodeBindModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = bindCall(alipayOpenMiniQrcodeBindModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 关联普通二维码
     * 商户可不需更换线下二维码，通过该接口完成配置后，用户用支付宝扫描普通二维码时打开小程序并跳转到指定页面，普通二维码关联小程序最多可设置20条规则。
     * @param alipayOpenMiniQrcodeBindModel  (optional)
     * @return AlipayOpenMiniQrcodeBindResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayOpenMiniQrcodeBindResponseModel bind(AlipayOpenMiniQrcodeBindModel alipayOpenMiniQrcodeBindModel) throws ApiException {
        ApiResponse<AlipayOpenMiniQrcodeBindResponseModel> localVarResp = bindWithHttpInfo(alipayOpenMiniQrcodeBindModel, null);
        return localVarResp.getData();
    }

    public AlipayOpenMiniQrcodeBindResponseModel bind(AlipayOpenMiniQrcodeBindModel alipayOpenMiniQrcodeBindModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayOpenMiniQrcodeBindResponseModel> localVarResp = bindWithHttpInfo(alipayOpenMiniQrcodeBindModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 关联普通二维码
     * 商户可不需更换线下二维码，通过该接口完成配置后，用户用支付宝扫描普通二维码时打开小程序并跳转到指定页面，普通二维码关联小程序最多可设置20条规则。
     * @param alipayOpenMiniQrcodeBindModel  (optional)
     * @return ApiResponse&lt;AlipayOpenMiniQrcodeBindResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayOpenMiniQrcodeBindResponseModel> bindWithHttpInfo(AlipayOpenMiniQrcodeBindModel alipayOpenMiniQrcodeBindModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = bindValidateBeforeCall(alipayOpenMiniQrcodeBindModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayOpenMiniQrcodeBindResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayOpenMiniQrcodeBindDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 关联普通二维码 (asynchronously)
     * 商户可不需更换线下二维码，通过该接口完成配置后，用户用支付宝扫描普通二维码时打开小程序并跳转到指定页面，普通二维码关联小程序最多可设置20条规则。
     * @param alipayOpenMiniQrcodeBindModel  (optional)
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
    public okhttp3.Call bindAsync(AlipayOpenMiniQrcodeBindModel alipayOpenMiniQrcodeBindModel, final ApiCallback<AlipayOpenMiniQrcodeBindResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = bindValidateBeforeCall(alipayOpenMiniQrcodeBindModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayOpenMiniQrcodeBindResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call bindAsync(AlipayOpenMiniQrcodeBindModel alipayOpenMiniQrcodeBindModel, final ApiCallback<AlipayOpenMiniQrcodeBindResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = bindValidateBeforeCall(alipayOpenMiniQrcodeBindModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayOpenMiniQrcodeBindResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for query
     * @param pageNo 页码 (optional)
     * @param pageSize 每页条数，最大为10 (optional)
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
    public okhttp3.Call queryCall(Integer pageNo, Integer pageSize, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
        String localVarPath = "/v3/alipay/open/mini/qrcode/query";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (pageNo != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_no", pageNo));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_size", pageSize));
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
    private okhttp3.Call queryValidateBeforeCall(Integer pageNo, Integer pageSize, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = queryCall(pageNo, pageSize, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 查询普通二维码
     * 通过appId查询商户关联的普通二维码路由信息
     * @param pageNo 页码 (optional)
     * @param pageSize 每页条数，最大为10 (optional)
     * @return AlipayOpenMiniQrcodeQueryResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayOpenMiniQrcodeQueryResponseModel query(Integer pageNo, Integer pageSize) throws ApiException {
        ApiResponse<AlipayOpenMiniQrcodeQueryResponseModel> localVarResp = queryWithHttpInfo(pageNo, pageSize, null);
        return localVarResp.getData();
    }

    public AlipayOpenMiniQrcodeQueryResponseModel query(Integer pageNo, Integer pageSize, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayOpenMiniQrcodeQueryResponseModel> localVarResp = queryWithHttpInfo(pageNo, pageSize, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 查询普通二维码
     * 通过appId查询商户关联的普通二维码路由信息
     * @param pageNo 页码 (optional)
     * @param pageSize 每页条数，最大为10 (optional)
     * @return ApiResponse&lt;AlipayOpenMiniQrcodeQueryResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayOpenMiniQrcodeQueryResponseModel> queryWithHttpInfo(Integer pageNo, Integer pageSize, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = queryValidateBeforeCall(pageNo, pageSize, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayOpenMiniQrcodeQueryResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayOpenMiniQrcodeQueryDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 查询普通二维码 (asynchronously)
     * 通过appId查询商户关联的普通二维码路由信息
     * @param pageNo 页码 (optional)
     * @param pageSize 每页条数，最大为10 (optional)
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
    public okhttp3.Call queryAsync(Integer pageNo, Integer pageSize, final ApiCallback<AlipayOpenMiniQrcodeQueryResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(pageNo, pageSize, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayOpenMiniQrcodeQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call queryAsync(Integer pageNo, Integer pageSize, final ApiCallback<AlipayOpenMiniQrcodeQueryResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(pageNo, pageSize, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayOpenMiniQrcodeQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for unbind
     * @param alipayOpenMiniQrcodeUnbindModel  (optional)
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
    public okhttp3.Call unbindCall(AlipayOpenMiniQrcodeUnbindModel alipayOpenMiniQrcodeUnbindModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayOpenMiniQrcodeUnbindModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/open/mini/qrcode/unbind";

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
    private okhttp3.Call unbindValidateBeforeCall(AlipayOpenMiniQrcodeUnbindModel alipayOpenMiniQrcodeUnbindModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = unbindCall(alipayOpenMiniQrcodeUnbindModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 删除已关联普通二维码
     * 删除已关联普通二维码
     * @param alipayOpenMiniQrcodeUnbindModel  (optional)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public Object unbind(AlipayOpenMiniQrcodeUnbindModel alipayOpenMiniQrcodeUnbindModel) throws ApiException {
        ApiResponse<Object> localVarResp = unbindWithHttpInfo(alipayOpenMiniQrcodeUnbindModel, null);
        return localVarResp.getData();
    }

    public Object unbind(AlipayOpenMiniQrcodeUnbindModel alipayOpenMiniQrcodeUnbindModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<Object> localVarResp = unbindWithHttpInfo(alipayOpenMiniQrcodeUnbindModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 删除已关联普通二维码
     * 删除已关联普通二维码
     * @param alipayOpenMiniQrcodeUnbindModel  (optional)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Object> unbindWithHttpInfo(AlipayOpenMiniQrcodeUnbindModel alipayOpenMiniQrcodeUnbindModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = unbindValidateBeforeCall(alipayOpenMiniQrcodeUnbindModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<Object>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayOpenMiniQrcodeUnbindDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 删除已关联普通二维码 (asynchronously)
     * 删除已关联普通二维码
     * @param alipayOpenMiniQrcodeUnbindModel  (optional)
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
    public okhttp3.Call unbindAsync(AlipayOpenMiniQrcodeUnbindModel alipayOpenMiniQrcodeUnbindModel, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = unbindValidateBeforeCall(alipayOpenMiniQrcodeUnbindModel, _callback, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call unbindAsync(AlipayOpenMiniQrcodeUnbindModel alipayOpenMiniQrcodeUnbindModel, final ApiCallback<Object> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = unbindValidateBeforeCall(alipayOpenMiniQrcodeUnbindModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
