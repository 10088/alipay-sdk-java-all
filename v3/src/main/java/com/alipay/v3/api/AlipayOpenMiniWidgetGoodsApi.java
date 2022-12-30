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


import com.alipay.v3.model.AlipayOpenMiniWidgetGoodsModifyDefaultResponse;
import com.alipay.v3.model.AlipayOpenMiniWidgetGoodsModifyModel;
import com.alipay.v3.model.AlipayOpenMiniWidgetGoodsModifyResponseModel;
import com.alipay.v3.model.AlipayOpenMiniWidgetGoodsQueryDefaultResponse;
import com.alipay.v3.model.AlipayOpenMiniWidgetGoodsQueryResponseModel;
import com.alipay.v3.model.AlipayOpenMiniWidgetGoodsUploadDefaultResponse;
import com.alipay.v3.model.AlipayOpenMiniWidgetGoodsUploadModel;
import com.alipay.v3.model.AlipayOpenMiniWidgetGoodsUploadResponseModel;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AlipayOpenMiniWidgetGoodsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AlipayOpenMiniWidgetGoodsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AlipayOpenMiniWidgetGoodsApi(ApiClient apiClient) {
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
     * Build call for modify
     * @param alipayOpenMiniWidgetGoodsModifyModel  (optional)
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
    public okhttp3.Call modifyCall(AlipayOpenMiniWidgetGoodsModifyModel alipayOpenMiniWidgetGoodsModifyModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayOpenMiniWidgetGoodsModifyModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/open/mini/widget/goods/modify";

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
        return localVarApiClient.buildCall(basePath, localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call modifyValidateBeforeCall(AlipayOpenMiniWidgetGoodsModifyModel alipayOpenMiniWidgetGoodsModifyModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = modifyCall(alipayOpenMiniWidgetGoodsModifyModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 小部件商品修改
     * 面向商品售卖类的小部件，提供的商品信息修改能力，修改后会进行文本和图片信息审核，审核完成后通知结果通过openmq消息通知
     * @param alipayOpenMiniWidgetGoodsModifyModel  (optional)
     * @return AlipayOpenMiniWidgetGoodsModifyResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayOpenMiniWidgetGoodsModifyResponseModel modify(AlipayOpenMiniWidgetGoodsModifyModel alipayOpenMiniWidgetGoodsModifyModel) throws ApiException {
        ApiResponse<AlipayOpenMiniWidgetGoodsModifyResponseModel> localVarResp = modifyWithHttpInfo(alipayOpenMiniWidgetGoodsModifyModel, null);
        return localVarResp.getData();
    }

    public AlipayOpenMiniWidgetGoodsModifyResponseModel modify(AlipayOpenMiniWidgetGoodsModifyModel alipayOpenMiniWidgetGoodsModifyModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayOpenMiniWidgetGoodsModifyResponseModel> localVarResp = modifyWithHttpInfo(alipayOpenMiniWidgetGoodsModifyModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 小部件商品修改
     * 面向商品售卖类的小部件，提供的商品信息修改能力，修改后会进行文本和图片信息审核，审核完成后通知结果通过openmq消息通知
     * @param alipayOpenMiniWidgetGoodsModifyModel  (optional)
     * @return ApiResponse&lt;AlipayOpenMiniWidgetGoodsModifyResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayOpenMiniWidgetGoodsModifyResponseModel> modifyWithHttpInfo(AlipayOpenMiniWidgetGoodsModifyModel alipayOpenMiniWidgetGoodsModifyModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = modifyValidateBeforeCall(alipayOpenMiniWidgetGoodsModifyModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayOpenMiniWidgetGoodsModifyResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayOpenMiniWidgetGoodsModifyDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 小部件商品修改 (asynchronously)
     * 面向商品售卖类的小部件，提供的商品信息修改能力，修改后会进行文本和图片信息审核，审核完成后通知结果通过openmq消息通知
     * @param alipayOpenMiniWidgetGoodsModifyModel  (optional)
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
    public okhttp3.Call modifyAsync(AlipayOpenMiniWidgetGoodsModifyModel alipayOpenMiniWidgetGoodsModifyModel, final ApiCallback<AlipayOpenMiniWidgetGoodsModifyResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = modifyValidateBeforeCall(alipayOpenMiniWidgetGoodsModifyModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayOpenMiniWidgetGoodsModifyResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call modifyAsync(AlipayOpenMiniWidgetGoodsModifyModel alipayOpenMiniWidgetGoodsModifyModel, final ApiCallback<AlipayOpenMiniWidgetGoodsModifyResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = modifyValidateBeforeCall(alipayOpenMiniWidgetGoodsModifyModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayOpenMiniWidgetGoodsModifyResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for query
     * @param miniAppId 根据承接品的商家小程序ID查询 (optional)
     * @param pid 根据承接该品的小程序背后的商家查询 (optional)
     * @param goodsId 根据商品的唯一标识查询 (optional)
     * @param pageNum 查询第几页，最小值为1 (optional)
     * @param pageSize 查询页面数量，最大值为50 (optional)
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
    public okhttp3.Call queryCall(String miniAppId, String pid, String goodsId, Integer pageNum, Integer pageSize, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
        String localVarPath = "/v3/alipay/open/mini/widget/goods/query";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (miniAppId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("mini_app_id", miniAppId));
        }

        if (pid != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("pid", pid));
        }

        if (goodsId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("goods_id", goodsId));
        }

        if (pageNum != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_num", pageNum));
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
    private okhttp3.Call queryValidateBeforeCall(String miniAppId, String pid, String goodsId, Integer pageNum, Integer pageSize, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = queryCall(miniAppId, pid, goodsId, pageNum, pageSize, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 小部件商品查询
     * 面向商品售卖类的小部件，提供商品信息查询能力，返回审核通过的商品信息
     * @param miniAppId 根据承接品的商家小程序ID查询 (optional)
     * @param pid 根据承接该品的小程序背后的商家查询 (optional)
     * @param goodsId 根据商品的唯一标识查询 (optional)
     * @param pageNum 查询第几页，最小值为1 (optional)
     * @param pageSize 查询页面数量，最大值为50 (optional)
     * @return AlipayOpenMiniWidgetGoodsQueryResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayOpenMiniWidgetGoodsQueryResponseModel query(String miniAppId, String pid, String goodsId, Integer pageNum, Integer pageSize) throws ApiException {
        ApiResponse<AlipayOpenMiniWidgetGoodsQueryResponseModel> localVarResp = queryWithHttpInfo(miniAppId, pid, goodsId, pageNum, pageSize, null);
        return localVarResp.getData();
    }

    public AlipayOpenMiniWidgetGoodsQueryResponseModel query(String miniAppId, String pid, String goodsId, Integer pageNum, Integer pageSize, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayOpenMiniWidgetGoodsQueryResponseModel> localVarResp = queryWithHttpInfo(miniAppId, pid, goodsId, pageNum, pageSize, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 小部件商品查询
     * 面向商品售卖类的小部件，提供商品信息查询能力，返回审核通过的商品信息
     * @param miniAppId 根据承接品的商家小程序ID查询 (optional)
     * @param pid 根据承接该品的小程序背后的商家查询 (optional)
     * @param goodsId 根据商品的唯一标识查询 (optional)
     * @param pageNum 查询第几页，最小值为1 (optional)
     * @param pageSize 查询页面数量，最大值为50 (optional)
     * @return ApiResponse&lt;AlipayOpenMiniWidgetGoodsQueryResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayOpenMiniWidgetGoodsQueryResponseModel> queryWithHttpInfo(String miniAppId, String pid, String goodsId, Integer pageNum, Integer pageSize, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = queryValidateBeforeCall(miniAppId, pid, goodsId, pageNum, pageSize, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayOpenMiniWidgetGoodsQueryResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayOpenMiniWidgetGoodsQueryDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 小部件商品查询 (asynchronously)
     * 面向商品售卖类的小部件，提供商品信息查询能力，返回审核通过的商品信息
     * @param miniAppId 根据承接品的商家小程序ID查询 (optional)
     * @param pid 根据承接该品的小程序背后的商家查询 (optional)
     * @param goodsId 根据商品的唯一标识查询 (optional)
     * @param pageNum 查询第几页，最小值为1 (optional)
     * @param pageSize 查询页面数量，最大值为50 (optional)
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
    public okhttp3.Call queryAsync(String miniAppId, String pid, String goodsId, Integer pageNum, Integer pageSize, final ApiCallback<AlipayOpenMiniWidgetGoodsQueryResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(miniAppId, pid, goodsId, pageNum, pageSize, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayOpenMiniWidgetGoodsQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call queryAsync(String miniAppId, String pid, String goodsId, Integer pageNum, Integer pageSize, final ApiCallback<AlipayOpenMiniWidgetGoodsQueryResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = queryValidateBeforeCall(miniAppId, pid, goodsId, pageNum, pageSize, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayOpenMiniWidgetGoodsQueryResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for upload
     * @param alipayOpenMiniWidgetGoodsUploadModel  (optional)
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
    public okhttp3.Call uploadCall(AlipayOpenMiniWidgetGoodsUploadModel alipayOpenMiniWidgetGoodsUploadModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
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
                ? customizedParams.getBodyContent() : alipayOpenMiniWidgetGoodsUploadModel;

        // create path and map variables
        String localVarPath = "/v3/alipay/open/mini/widget/goods/upload";

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
    private okhttp3.Call uploadValidateBeforeCall(AlipayOpenMiniWidgetGoodsUploadModel alipayOpenMiniWidgetGoodsUploadModel, final ApiCallback _callback, CustomizedParams customizedParams) throws ApiException {
        

        okhttp3.Call localVarCall = uploadCall(alipayOpenMiniWidgetGoodsUploadModel, _callback, customizedParams);
        return localVarCall;

    }

    /**
     * 小部件商品上传
     * 面向商品售卖类的小部件，提供的商品信息上传能力，上传后会进行文本和图片信息审核，审核完成后通知结果通过openmq消息通知
     * @param alipayOpenMiniWidgetGoodsUploadModel  (optional)
     * @return AlipayOpenMiniWidgetGoodsUploadResponseModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public AlipayOpenMiniWidgetGoodsUploadResponseModel upload(AlipayOpenMiniWidgetGoodsUploadModel alipayOpenMiniWidgetGoodsUploadModel) throws ApiException {
        ApiResponse<AlipayOpenMiniWidgetGoodsUploadResponseModel> localVarResp = uploadWithHttpInfo(alipayOpenMiniWidgetGoodsUploadModel, null);
        return localVarResp.getData();
    }

    public AlipayOpenMiniWidgetGoodsUploadResponseModel upload(AlipayOpenMiniWidgetGoodsUploadModel alipayOpenMiniWidgetGoodsUploadModel, CustomizedParams customizedParams) throws ApiException {
        ApiResponse<AlipayOpenMiniWidgetGoodsUploadResponseModel> localVarResp = uploadWithHttpInfo(alipayOpenMiniWidgetGoodsUploadModel, customizedParams);
        return localVarResp.getData();
    }

    /**
     * 小部件商品上传
     * 面向商品售卖类的小部件，提供的商品信息上传能力，上传后会进行文本和图片信息审核，审核完成后通知结果通过openmq消息通知
     * @param alipayOpenMiniWidgetGoodsUploadModel  (optional)
     * @return ApiResponse&lt;AlipayOpenMiniWidgetGoodsUploadResponseModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> common response </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> 请求失败 </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<AlipayOpenMiniWidgetGoodsUploadResponseModel> uploadWithHttpInfo(AlipayOpenMiniWidgetGoodsUploadModel alipayOpenMiniWidgetGoodsUploadModel, CustomizedParams customizedParams) throws ApiException {
        okhttp3.Call localVarCall = uploadValidateBeforeCall(alipayOpenMiniWidgetGoodsUploadModel, null, customizedParams);
        try {
            Type localVarReturnType = new TypeToken<AlipayOpenMiniWidgetGoodsUploadResponseModel>(){}.getType();
            return localVarApiClient.execute(localVarCall, localVarReturnType);
        } catch (ApiException e) {
            try {
                e.setErrorObject(localVarApiClient.getJSON().getGson().fromJson(e.getResponseBody(), new TypeToken<AlipayOpenMiniWidgetGoodsUploadDefaultResponse>(){}.getType()));
            } catch (Exception ex) {
                AlipayLogger.logBizWarn(ex);
            }
            throw e;
        }
    }

    /**
     * 小部件商品上传 (asynchronously)
     * 面向商品售卖类的小部件，提供的商品信息上传能力，上传后会进行文本和图片信息审核，审核完成后通知结果通过openmq消息通知
     * @param alipayOpenMiniWidgetGoodsUploadModel  (optional)
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
    public okhttp3.Call uploadAsync(AlipayOpenMiniWidgetGoodsUploadModel alipayOpenMiniWidgetGoodsUploadModel, final ApiCallback<AlipayOpenMiniWidgetGoodsUploadResponseModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = uploadValidateBeforeCall(alipayOpenMiniWidgetGoodsUploadModel, _callback, null);
        Type localVarReturnType = new TypeToken<AlipayOpenMiniWidgetGoodsUploadResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public okhttp3.Call uploadAsync(AlipayOpenMiniWidgetGoodsUploadModel alipayOpenMiniWidgetGoodsUploadModel, final ApiCallback<AlipayOpenMiniWidgetGoodsUploadResponseModel> _callback, CustomizedParams customizedParams) throws ApiException {

        okhttp3.Call localVarCall = uploadValidateBeforeCall(alipayOpenMiniWidgetGoodsUploadModel, _callback, customizedParams);
        Type localVarReturnType = new TypeToken<AlipayOpenMiniWidgetGoodsUploadResponseModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
