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


import com.alipay.v3.model.DatadigitalFincloudGeneralsaasOcrServerDetectDefaultResponse;
import com.alipay.v3.model.DatadigitalFincloudGeneralsaasOcrServerDetectModel;
import com.alipay.v3.model.DatadigitalFincloudGeneralsaasOcrServerDetectResponseModel;
import java.io.File;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class DatadigitalFincloudGeneralsaasOcrServerApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public DatadigitalFincloudGeneralsaasOcrServerApi() {
        this(Configuration.getDefaultApiClient());
    }

    public DatadigitalFincloudGeneralsaasOcrServerApi(ApiClient apiClient) {
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
     * Build call for detect
     * @param data  (optional)
     * @param fileContent  (optional)
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
    public okhttp3.Call detectCall(DatadigitalFincloudGeneralsaasOcrServerDetectModel data, File fileContent, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
        String localVarPath = "/v3/datadigital/fincloud/generalsaas/ocr/server/detect";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (data != null) {
            localVarFormParams.put("data", data);
        }
        //自定义body内容
        if (customizedParams != null && !Strings.isNullOrEmpty(customizedParams.getBodyContent())) {
            localVarFormParams.put("data", customizedParams.getBodyContent());
        }

        if (fileContent != null) {
            localVarFormParams.put("file_content", fileContent);
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "multipart/form-data"
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
    private okhttp3.Call detectValidateBeforeCall(DatadigitalFincloudGeneralsaasOcrServerDetectModel data, File fileContent, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = detectCall(data, fileContent, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 服务端OCR
     * 纯服务端OCR对接
     * @param data  (optional)
     * @param fileContent  (optional)
     * @return DatadigitalFincloudGeneralsaasOcrServerDetectResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public DatadigitalFincloudGeneralsaasOcrServerDetectResponseModel detect(DatadigitalFincloudGeneralsaasOcrServerDetectModel data, File fileContent) throws ApiException {
        ApiResponse<DatadigitalFincloudGeneralsaasOcrServerDetectResponseModel> localVarResp = detectWithHttpInfo(data, fileContent, null);
        return localVarResp.getData();
    }

    public DatadigitalFincloudGeneralsaasOcrServerDetectResponseModel detect(DatadigitalFincloudGeneralsaasOcrServerDetectModel data, File fileContent, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<DatadigitalFincloudGeneralsaasOcrServerDetectResponseModel> localVarResp = detectWithHttpInfo(data, fileContent, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 服务端OCR
     * 纯服务端OCR对接
     * @param data  (optional)
     * @param fileContent  (optional)
     * @return ApiResponse&lt;DatadigitalFincloudGeneralsaasOcrServerDetectResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DatadigitalFincloudGeneralsaasOcrServerDetectResponseModel> detectWithHttpInfo(DatadigitalFincloudGeneralsaasOcrServerDetectModel data, File fileContent, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = detectValidateBeforeCall(data, fileContent, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<DatadigitalFincloudGeneralsaasOcrServerDetectResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<DatadigitalFincloudGeneralsaasOcrServerDetectDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 服务端OCR (asynchronously)
     * 纯服务端OCR对接
     * @param data  (optional)
     * @param fileContent  (optional)
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
    public okhttp3.Call detectAsync(DatadigitalFincloudGeneralsaasOcrServerDetectModel data, File fileContent, final ApiCallback<DatadigitalFincloudGeneralsaasOcrServerDetectResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = detectValidateBeforeCall(data, fileContent, _callback, null);
        Type localVarReturnType = new TypeToken<DatadigitalFincloudGeneralsaasOcrServerDetectResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call detectAsync(DatadigitalFincloudGeneralsaasOcrServerDetectModel data, File fileContent, final ApiCallback<DatadigitalFincloudGeneralsaasOcrServerDetectResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = detectValidateBeforeCall(data, fileContent, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<DatadigitalFincloudGeneralsaasOcrServerDetectResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
