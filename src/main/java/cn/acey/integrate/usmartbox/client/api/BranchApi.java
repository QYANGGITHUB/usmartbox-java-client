/*
 * 电商对接API参考文档
 * 电商对接API参考文档
 *
 * OpenAPI spec version: 2.2.2
 * Contact: qyang@yicksolutions.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package cn.acey.integrate.usmartbox.client.api;

import cn.acey.integrate.usmartbox.client.*;
import cn.acey.integrate.usmartbox.client.model.BranchSearchResponse;
import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BranchApi {
    private ApiClient apiClient;

    public BranchApi() {
        this(Configuration.getDefaultApiClient());
    }

    public BranchApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for searchBranch
     * @param apikey key (required)
     * @param nonce 32位随机数 (required)
     * @param sign 用于校验 (required)
     * @param city 城市编号 (optional)
     * @param district 区号编号 (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call searchBranchCall(String apikey, String nonce, String sign, String city, String district, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/ec/branch.json";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (apikey != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("apikey", apikey));
        if (nonce != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("nonce", nonce));
        if (sign != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sign", sign));
        if (city != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("city", city));
        if (district != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("district", district));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "applicaiton/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call searchBranchValidateBeforeCall(String apikey, String nonce, String sign, String city, String district, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'apikey' is set
        if (apikey == null) {
            throw new ApiException("Missing the required parameter 'apikey' when calling searchBranch(Async)");
        }
        // verify the required parameter 'nonce' is set
        if (nonce == null) {
            throw new ApiException("Missing the required parameter 'nonce' when calling searchBranch(Async)");
        }
        // verify the required parameter 'sign' is set
        if (sign == null) {
            throw new ApiException("Missing the required parameter 'sign' when calling searchBranch(Async)");
        }
        
        com.squareup.okhttp.Call call = searchBranchCall(apikey, nonce, sign, city, district, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 根据城市及区号查询下属网点
     * 
     * @param apikey key (required)
     * @param nonce 32位随机数 (required)
     * @param sign 用于校验 (required)
     * @param city 城市编号 (optional)
     * @param district 区号编号 (optional)
     * @return BranchSearchResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public BranchSearchResponse searchBranch(String apikey, String nonce, String sign, String city, String district) throws ApiException {
        ApiResponse<BranchSearchResponse> resp = searchBranchWithHttpInfo(apikey, nonce, sign, city, district);
        return resp.getData();
    }

    /**
     * 根据城市及区号查询下属网点
     * 
     * @param apikey key (required)
     * @param nonce 32位随机数 (required)
     * @param sign 用于校验 (required)
     * @param city 城市编号 (optional)
     * @param district 区号编号 (optional)
     * @return ApiResponse&lt;BranchSearchResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<BranchSearchResponse> searchBranchWithHttpInfo(String apikey, String nonce, String sign, String city, String district) throws ApiException {
        com.squareup.okhttp.Call call = searchBranchValidateBeforeCall(apikey, nonce, sign, city, district, null, null);
        Type localVarReturnType = new TypeToken<BranchSearchResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * 根据城市及区号查询下属网点 (asynchronously)
     * 
     * @param apikey key (required)
     * @param nonce 32位随机数 (required)
     * @param sign 用于校验 (required)
     * @param city 城市编号 (optional)
     * @param district 区号编号 (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call searchBranchAsync(String apikey, String nonce, String sign, String city, String district, final ApiCallback<BranchSearchResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = searchBranchValidateBeforeCall(apikey, nonce, sign, city, district, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<BranchSearchResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}