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


import com.alipay.v3.model.AntMerchantExpandItemCreateDefaultResponse;
import com.alipay.v3.model.AntMerchantExpandItemCreateModel;
import com.alipay.v3.model.AntMerchantExpandItemCreateResponseModel;
import com.alipay.v3.model.AntMerchantExpandItemDeleteDefaultResponse;
import com.alipay.v3.model.AntMerchantExpandItemDeleteResponseModel;
import com.alipay.v3.model.AntMerchantExpandItemModifyDefaultResponse;
import com.alipay.v3.model.AntMerchantExpandItemModifyModel;
import com.alipay.v3.model.AntMerchantExpandItemModifyResponseModel;
import com.alipay.v3.model.AntMerchantExpandItemQueryDefaultResponse;
import com.alipay.v3.model.AntMerchantExpandItemQueryResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AntMerchantExpandItemApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AntMerchantExpandItemApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AntMerchantExpandItemApi(ApiClient apiClient) {
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
     * @param antMerchantExpandItemCreateModel  (optional)
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
    public okhttp3.Call createCall(AntMerchantExpandItemCreateModel antMerchantExpandItemCreateModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : antMerchantExpandItemCreateModel;

        // create path and map variables
        String localVarPath = "/v3/ant/merchant/expand/item/create";

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
    private okhttp3.Call createValidateBeforeCall(AntMerchantExpandItemCreateModel antMerchantExpandItemCreateModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = createCall(antMerchantExpandItemCreateModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 商品创建接口
     * 用于服务商或商户创建商品
     * @param antMerchantExpandItemCreateModel  (optional)
     * @return AntMerchantExpandItemCreateResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AntMerchantExpandItemCreateResponseModel create(AntMerchantExpandItemCreateModel antMerchantExpandItemCreateModel) throws ApiException {
        ApiResponse<AntMerchantExpandItemCreateResponseModel> localVarResp = createWithHttpInfo(antMerchantExpandItemCreateModel, null);
        return localVarResp.getData();
    }

    public AntMerchantExpandItemCreateResponseModel create(AntMerchantExpandItemCreateModel antMerchantExpandItemCreateModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AntMerchantExpandItemCreateResponseModel> localVarResp = createWithHttpInfo(antMerchantExpandItemCreateModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 商品创建接口
     * 用于服务商或商户创建商品
     * @param antMerchantExpandItemCreateModel  (optional)
     * @return ApiResponse&lt;AntMerchantExpandItemCreateResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AntMerchantExpandItemCreateResponseModel> createWithHttpInfo(AntMerchantExpandItemCreateModel antMerchantExpandItemCreateModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = createValidateBeforeCall(antMerchantExpandItemCreateModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AntMerchantExpandItemCreateResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AntMerchantExpandItemCreateDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 商品创建接口 (asynchronously)
     * 用于服务商或商户创建商品
     * @param antMerchantExpandItemCreateModel  (optional)
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
    public okhttp3.Call createAsync(AntMerchantExpandItemCreateModel antMerchantExpandItemCreateModel, final ApiCallback<AntMerchantExpandItemCreateResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = createValidateBeforeCall(antMerchantExpandItemCreateModel, _callback, null);
        Type localVarReturnType = new TypeToken<AntMerchantExpandItemCreateResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call createAsync(AntMerchantExpandItemCreateModel antMerchantExpandItemCreateModel, final ApiCallback<AntMerchantExpandItemCreateResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = createValidateBeforeCall(antMerchantExpandItemCreateModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AntMerchantExpandItemCreateResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for delete
     * @param itemId 商品ID（item_id不为空则以item_id作为删除KEY,item_id为空则以external_item_id作为删除KEY,两者不能同时为空） (optional)
     * @param externalItemId 外部商品ID（item_id不为空则以item_id作为删除KEY,item_id为空则以external_item_id作为删除KEY,两者不能同时为空） (optional)
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
    public okhttp3.Call deleteCall(String itemId, String externalItemId, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
        String localVarPath = "/v3/ant/merchant/expand/item/delete";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (itemId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("item_id", itemId));
        }

        if (externalItemId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("external_item_id", externalItemId));
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
    private okhttp3.Call deleteValidateBeforeCall(String itemId, String externalItemId, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = deleteCall(itemId, externalItemId, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 商品删除接口
     * 用于服务商或商户删除商品
     * @param itemId 商品ID（item_id不为空则以item_id作为删除KEY,item_id为空则以external_item_id作为删除KEY,两者不能同时为空） (optional)
     * @param externalItemId 外部商品ID（item_id不为空则以item_id作为删除KEY,item_id为空则以external_item_id作为删除KEY,两者不能同时为空） (optional)
     * @return AntMerchantExpandItemDeleteResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AntMerchantExpandItemDeleteResponseModel delete(String itemId, String externalItemId) throws ApiException {
        ApiResponse<AntMerchantExpandItemDeleteResponseModel> localVarResp = deleteWithHttpInfo(itemId, externalItemId, null);
        return localVarResp.getData();
    }

    public AntMerchantExpandItemDeleteResponseModel delete(String itemId, String externalItemId, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AntMerchantExpandItemDeleteResponseModel> localVarResp = deleteWithHttpInfo(itemId, externalItemId, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 商品删除接口
     * 用于服务商或商户删除商品
     * @param itemId 商品ID（item_id不为空则以item_id作为删除KEY,item_id为空则以external_item_id作为删除KEY,两者不能同时为空） (optional)
     * @param externalItemId 外部商品ID（item_id不为空则以item_id作为删除KEY,item_id为空则以external_item_id作为删除KEY,两者不能同时为空） (optional)
     * @return ApiResponse&lt;AntMerchantExpandItemDeleteResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AntMerchantExpandItemDeleteResponseModel> deleteWithHttpInfo(String itemId, String externalItemId, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = deleteValidateBeforeCall(itemId, externalItemId, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AntMerchantExpandItemDeleteResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AntMerchantExpandItemDeleteDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 商品删除接口 (asynchronously)
     * 用于服务商或商户删除商品
     * @param itemId 商品ID（item_id不为空则以item_id作为删除KEY,item_id为空则以external_item_id作为删除KEY,两者不能同时为空） (optional)
     * @param externalItemId 外部商品ID（item_id不为空则以item_id作为删除KEY,item_id为空则以external_item_id作为删除KEY,两者不能同时为空） (optional)
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
    public okhttp3.Call deleteAsync(String itemId, String externalItemId, final ApiCallback<AntMerchantExpandItemDeleteResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteValidateBeforeCall(itemId, externalItemId, _callback, null);
        Type localVarReturnType = new TypeToken<AntMerchantExpandItemDeleteResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call deleteAsync(String itemId, String externalItemId, final ApiCallback<AntMerchantExpandItemDeleteResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = deleteValidateBeforeCall(itemId, externalItemId, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AntMerchantExpandItemDeleteResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for modify
     * @param antMerchantExpandItemModifyModel  (optional)
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
    public okhttp3.Call modifyCall(AntMerchantExpandItemModifyModel antMerchantExpandItemModifyModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : antMerchantExpandItemModifyModel;

        // create path and map variables
        String localVarPath = "/v3/ant/merchant/expand/item/modify";

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
    private okhttp3.Call modifyValidateBeforeCall(AntMerchantExpandItemModifyModel antMerchantExpandItemModifyModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = modifyCall(antMerchantExpandItemModifyModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 商品修改接口
     * 用于服务商或商户修改商品
     * @param antMerchantExpandItemModifyModel  (optional)
     * @return AntMerchantExpandItemModifyResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AntMerchantExpandItemModifyResponseModel modify(AntMerchantExpandItemModifyModel antMerchantExpandItemModifyModel) throws ApiException {
        ApiResponse<AntMerchantExpandItemModifyResponseModel> localVarResp = modifyWithHttpInfo(antMerchantExpandItemModifyModel, null);
        return localVarResp.getData();
    }

    public AntMerchantExpandItemModifyResponseModel modify(AntMerchantExpandItemModifyModel antMerchantExpandItemModifyModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AntMerchantExpandItemModifyResponseModel> localVarResp = modifyWithHttpInfo(antMerchantExpandItemModifyModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 商品修改接口
     * 用于服务商或商户修改商品
     * @param antMerchantExpandItemModifyModel  (optional)
     * @return ApiResponse&lt;AntMerchantExpandItemModifyResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AntMerchantExpandItemModifyResponseModel> modifyWithHttpInfo(AntMerchantExpandItemModifyModel antMerchantExpandItemModifyModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = modifyValidateBeforeCall(antMerchantExpandItemModifyModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AntMerchantExpandItemModifyResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AntMerchantExpandItemModifyDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 商品修改接口 (asynchronously)
     * 用于服务商或商户修改商品
     * @param antMerchantExpandItemModifyModel  (optional)
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
    public okhttp3.Call modifyAsync(AntMerchantExpandItemModifyModel antMerchantExpandItemModifyModel, final ApiCallback<AntMerchantExpandItemModifyResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = modifyValidateBeforeCall(antMerchantExpandItemModifyModel, _callback, null);
        Type localVarReturnType = new TypeToken<AntMerchantExpandItemModifyResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call modifyAsync(AntMerchantExpandItemModifyModel antMerchantExpandItemModifyModel, final ApiCallback<AntMerchantExpandItemModifyResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = modifyValidateBeforeCall(antMerchantExpandItemModifyModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AntMerchantExpandItemModifyResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for query
     * @param targetType 商品归属主体类型:  5: 店铺  4: 主站MID  3: 参与者  2: 角色  1: 联系人 (optional)
     * @param targetId 商品归属主体id (optional)
     * @param undefinedCategory 未分类类目: true 的时候 front_category_id 必须不填（null） (optional)
     * @param frontCategoryId 商品前台类目id: null 表示所有分类 (optional)
     * @param status 商品状态：EFFECT、INVALID、PAUSE；不填返回所有状态商品 (optional)
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
    public okhttp3.Call queryCall(String targetType, String targetId, Boolean undefinedCategory, String frontCategoryId, String status, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
        String localVarPath = "/v3/ant/merchant/expand/item/query";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (targetType != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("target_type", targetType));
        }

        if (targetId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("target_id", targetId));
        }

        if (undefinedCategory != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("undefined_category", undefinedCategory));
        }

        if (frontCategoryId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("front_category_id", frontCategoryId));
        }

        if (status != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("status", status));
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
    private okhttp3.Call queryValidateBeforeCall(String targetType, String targetId, Boolean undefinedCategory, String frontCategoryId, String status, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = queryCall(targetType, targetId, undefinedCategory, frontCategoryId, status, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 商品查询接口
     * 用于服务商或商户查询其商品信息
     * @param targetType 商品归属主体类型:  5: 店铺  4: 主站MID  3: 参与者  2: 角色  1: 联系人 (optional)
     * @param targetId 商品归属主体id (optional)
     * @param undefinedCategory 未分类类目: true 的时候 front_category_id 必须不填（null） (optional)
     * @param frontCategoryId 商品前台类目id: null 表示所有分类 (optional)
     * @param status 商品状态：EFFECT、INVALID、PAUSE；不填返回所有状态商品 (optional)
     * @return AntMerchantExpandItemQueryResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AntMerchantExpandItemQueryResponseModel query(String targetType, String targetId, Boolean undefinedCategory, String frontCategoryId, String status) throws ApiException {
        ApiResponse<AntMerchantExpandItemQueryResponseModel> localVarResp = queryWithHttpInfo(targetType, targetId, undefinedCategory, frontCategoryId, status, null);
        return localVarResp.getData();
    }

    public AntMerchantExpandItemQueryResponseModel query(String targetType, String targetId, Boolean undefinedCategory, String frontCategoryId, String status, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AntMerchantExpandItemQueryResponseModel> localVarResp = queryWithHttpInfo(targetType, targetId, undefinedCategory, frontCategoryId, status, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 商品查询接口
     * 用于服务商或商户查询其商品信息
     * @param targetType 商品归属主体类型:  5: 店铺  4: 主站MID  3: 参与者  2: 角色  1: 联系人 (optional)
     * @param targetId 商品归属主体id (optional)
     * @param undefinedCategory 未分类类目: true 的时候 front_category_id 必须不填（null） (optional)
     * @param frontCategoryId 商品前台类目id: null 表示所有分类 (optional)
     * @param status 商品状态：EFFECT、INVALID、PAUSE；不填返回所有状态商品 (optional)
     * @return ApiResponse&lt;AntMerchantExpandItemQueryResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AntMerchantExpandItemQueryResponseModel> queryWithHttpInfo(String targetType, String targetId, Boolean undefinedCategory, String frontCategoryId, String status, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = queryValidateBeforeCall(targetType, targetId, undefinedCategory, frontCategoryId, status, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AntMerchantExpandItemQueryResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AntMerchantExpandItemQueryDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 商品查询接口 (asynchronously)
     * 用于服务商或商户查询其商品信息
     * @param targetType 商品归属主体类型:  5: 店铺  4: 主站MID  3: 参与者  2: 角色  1: 联系人 (optional)
     * @param targetId 商品归属主体id (optional)
     * @param undefinedCategory 未分类类目: true 的时候 front_category_id 必须不填（null） (optional)
     * @param frontCategoryId 商品前台类目id: null 表示所有分类 (optional)
     * @param status 商品状态：EFFECT、INVALID、PAUSE；不填返回所有状态商品 (optional)
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
    public okhttp3.Call queryAsync(String targetType, String targetId, Boolean undefinedCategory, String frontCategoryId, String status, final ApiCallback<AntMerchantExpandItemQueryResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(targetType, targetId, undefinedCategory, frontCategoryId, status, _callback, null);
        Type localVarReturnType = new TypeToken<AntMerchantExpandItemQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call queryAsync(String targetType, String targetId, Boolean undefinedCategory, String frontCategoryId, String status, final ApiCallback<AntMerchantExpandItemQueryResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(targetType, targetId, undefinedCategory, frontCategoryId, status, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AntMerchantExpandItemQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
