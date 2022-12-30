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


package com.alipay.v3.model;

import java.util.Objects;
import java.util.Arrays;
import com.alipay.v3.model.AlipayEcoMycarParkingOvertimecharginginfoSyncErrorResponseModel;
import com.alipay.v3.model.CommonErrorType;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.io.Serializable;

import javax.ws.rs.core.GenericType;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.JsonPrimitive;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;

import com.alipay.v3.JSON;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AlipayEcoMycarParkingOvertimecharginginfoSyncDefaultResponse extends AbstractOpenApiSchema {
    private static final Logger log = Logger.getLogger(AlipayEcoMycarParkingOvertimecharginginfoSyncDefaultResponse.class.getName());

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!AlipayEcoMycarParkingOvertimecharginginfoSyncDefaultResponse.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'AlipayEcoMycarParkingOvertimecharginginfoSyncDefaultResponse' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<AlipayEcoMycarParkingOvertimecharginginfoSyncErrorResponseModel> adapterAlipayEcoMycarParkingOvertimecharginginfoSyncErrorResponseModel = gson.getDelegateAdapter(this, TypeToken.get(AlipayEcoMycarParkingOvertimecharginginfoSyncErrorResponseModel.class));
            final TypeAdapter<CommonErrorType> adapterCommonErrorType = gson.getDelegateAdapter(this, TypeToken.get(CommonErrorType.class));

            return (TypeAdapter<T>) new TypeAdapter<AlipayEcoMycarParkingOvertimecharginginfoSyncDefaultResponse>() {
                @Override
                public void write(JsonWriter out, AlipayEcoMycarParkingOvertimecharginginfoSyncDefaultResponse value) throws IOException {
                    if (value == null || value.getActualInstance() == null) {
                        elementAdapter.write(out, null);
                        return;
                    }

                    // check if the actual instance is of the type `AlipayEcoMycarParkingOvertimecharginginfoSyncErrorResponseModel`
                    if (value.getActualInstance() instanceof AlipayEcoMycarParkingOvertimecharginginfoSyncErrorResponseModel) {
                        JsonObject obj = adapterAlipayEcoMycarParkingOvertimecharginginfoSyncErrorResponseModel.toJsonTree((AlipayEcoMycarParkingOvertimecharginginfoSyncErrorResponseModel)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    // check if the actual instance is of the type `CommonErrorType`
                    if (value.getActualInstance() instanceof CommonErrorType) {
                        JsonObject obj = adapterCommonErrorType.toJsonTree((CommonErrorType)value.getActualInstance()).getAsJsonObject();
                        elementAdapter.write(out, obj);
                        return;
                    }

                    throw new IOException("Failed to serialize as the type doesn't match anyOf schemas: AlipayEcoMycarParkingOvertimecharginginfoSyncErrorResponseModel, CommonErrorType");
                }

                @Override
                public AlipayEcoMycarParkingOvertimecharginginfoSyncDefaultResponse read(JsonReader in) throws IOException {
                    Object deserialized = null;
                    JsonObject jsonObject = elementAdapter.read(in).getAsJsonObject();

                    // deserialize AlipayEcoMycarParkingOvertimecharginginfoSyncErrorResponseModel
                    try {
                        // validate the JSON object to see if any exception is thrown
                        AlipayEcoMycarParkingOvertimecharginginfoSyncErrorResponseModel.validateJsonObject(jsonObject);
                        log.log(Level.FINER, "Input data matches schema 'AlipayEcoMycarParkingOvertimecharginginfoSyncErrorResponseModel'");
                        AlipayEcoMycarParkingOvertimecharginginfoSyncDefaultResponse ret = new AlipayEcoMycarParkingOvertimecharginginfoSyncDefaultResponse();
                        ret.setActualInstance(adapterAlipayEcoMycarParkingOvertimecharginginfoSyncErrorResponseModel.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'AlipayEcoMycarParkingOvertimecharginginfoSyncErrorResponseModel'", e);
                    }

                    // deserialize CommonErrorType
                    try {
                        // validate the JSON object to see if any exception is thrown
                        CommonErrorType.validateJsonObject(jsonObject);
                        log.log(Level.FINER, "Input data matches schema 'CommonErrorType'");
                        AlipayEcoMycarParkingOvertimecharginginfoSyncDefaultResponse ret = new AlipayEcoMycarParkingOvertimecharginginfoSyncDefaultResponse();
                        ret.setActualInstance(adapterCommonErrorType.fromJsonTree(jsonObject));
                        return ret;
                    } catch (Exception e) {
                        // deserialization failed, continue
                        log.log(Level.FINER, "Input data does not match schema 'CommonErrorType'", e);
                    }


                    throw new IOException(String.format("Failed deserialization for AlipayEcoMycarParkingOvertimecharginginfoSyncDefaultResponse: no class matched. JSON: %s", jsonObject.toString()));
                }
            }.nullSafe();
        }
    }

    // store a list of schema names defined in anyOf
    public static final Map<String, GenericType> schemas = new HashMap<String, GenericType>();

    public AlipayEcoMycarParkingOvertimecharginginfoSyncDefaultResponse() {
        super("anyOf", Boolean.FALSE);
    }

    public AlipayEcoMycarParkingOvertimecharginginfoSyncDefaultResponse(AlipayEcoMycarParkingOvertimecharginginfoSyncErrorResponseModel o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    public AlipayEcoMycarParkingOvertimecharginginfoSyncDefaultResponse(CommonErrorType o) {
        super("anyOf", Boolean.FALSE);
        setActualInstance(o);
    }

    static {
        schemas.put("AlipayEcoMycarParkingOvertimecharginginfoSyncErrorResponseModel", new GenericType<AlipayEcoMycarParkingOvertimecharginginfoSyncErrorResponseModel>() {
        });
        schemas.put("CommonErrorType", new GenericType<CommonErrorType>() {
        });
    }

    @Override
    public Map<String, GenericType> getSchemas() {
        return AlipayEcoMycarParkingOvertimecharginginfoSyncDefaultResponse.schemas;
    }

    /**
     * Set the instance that matches the anyOf child schema, check
     * the instance parameter is valid against the anyOf child schemas:
     * AlipayEcoMycarParkingOvertimecharginginfoSyncErrorResponseModel, CommonErrorType
     *
     * It could be an instance of the 'anyOf' schemas.
     * The anyOf child schemas may themselves be a composed schema (allOf, anyOf, anyOf).
     */
    @Override
    public void setActualInstance(Object instance) {
        if (instance instanceof AlipayEcoMycarParkingOvertimecharginginfoSyncErrorResponseModel) {
            super.setActualInstance(instance);
            return;
        }

        if (instance instanceof CommonErrorType) {
            super.setActualInstance(instance);
            return;
        }

        throw new RuntimeException("Invalid instance type. Must be AlipayEcoMycarParkingOvertimecharginginfoSyncErrorResponseModel, CommonErrorType");
    }

    /**
     * Get the actual instance, which can be the following:
     * AlipayEcoMycarParkingOvertimecharginginfoSyncErrorResponseModel, CommonErrorType
     *
     * @return The actual instance (AlipayEcoMycarParkingOvertimecharginginfoSyncErrorResponseModel, CommonErrorType)
     */
    @Override
    public Object getActualInstance() {
        return super.getActualInstance();
    }

    /**
     * Get the actual instance of `AlipayEcoMycarParkingOvertimecharginginfoSyncErrorResponseModel`. If the actual instance is not `AlipayEcoMycarParkingOvertimecharginginfoSyncErrorResponseModel`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `AlipayEcoMycarParkingOvertimecharginginfoSyncErrorResponseModel`
     * @throws ClassCastException if the instance is not `AlipayEcoMycarParkingOvertimecharginginfoSyncErrorResponseModel`
     */
    public AlipayEcoMycarParkingOvertimecharginginfoSyncErrorResponseModel getAlipayEcoMycarParkingOvertimecharginginfoSyncErrorResponseModel() throws ClassCastException {
        return (AlipayEcoMycarParkingOvertimecharginginfoSyncErrorResponseModel)super.getActualInstance();
    }

    /**
     * Get the actual instance of `CommonErrorType`. If the actual instance is not `CommonErrorType`,
     * the ClassCastException will be thrown.
     *
     * @return The actual instance of `CommonErrorType`
     * @throws ClassCastException if the instance is not `CommonErrorType`
     */
    public CommonErrorType getCommonErrorType() throws ClassCastException {
        return (CommonErrorType)super.getActualInstance();
    }


 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to AlipayEcoMycarParkingOvertimecharginginfoSyncDefaultResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    // validate anyOf schemas one by one
    int validCount = 0;
    // validate the json string with AlipayEcoMycarParkingOvertimecharginginfoSyncErrorResponseModel
    try {
      AlipayEcoMycarParkingOvertimecharginginfoSyncErrorResponseModel.validateJsonObject(jsonObj);
      return; // return earlier as at least one schema is valid with respect to the Json object
      //validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    // validate the json string with CommonErrorType
    try {
      CommonErrorType.validateJsonObject(jsonObj);
      return; // return earlier as at least one schema is valid with respect to the Json object
      //validCount++;
    } catch (Exception e) {
      // continue to the next one
    }
    if (validCount == 0) {
      throw new IOException(String.format("The JSON string is invalid for AlipayEcoMycarParkingOvertimecharginginfoSyncDefaultResponse with anyOf schemas: AlipayEcoMycarParkingOvertimecharginginfoSyncErrorResponseModel, CommonErrorType. JSON: %s", jsonObj.toString()));
    }
  }

 /**
  * Create an instance of AlipayEcoMycarParkingOvertimecharginginfoSyncDefaultResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of AlipayEcoMycarParkingOvertimecharginginfoSyncDefaultResponse
  * @throws IOException if the JSON string is invalid with respect to AlipayEcoMycarParkingOvertimecharginginfoSyncDefaultResponse
  */
  public static AlipayEcoMycarParkingOvertimecharginginfoSyncDefaultResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AlipayEcoMycarParkingOvertimecharginginfoSyncDefaultResponse.class);
  }

 /**
  * Convert an instance of AlipayEcoMycarParkingOvertimecharginginfoSyncDefaultResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

