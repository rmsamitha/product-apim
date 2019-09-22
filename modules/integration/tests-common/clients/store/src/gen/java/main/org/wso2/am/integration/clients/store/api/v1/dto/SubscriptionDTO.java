/*
 * WSO2 API Manager - Store
 * This document specifies a **RESTful API** for WSO2 **API Manager** - Store.  It is written with [swagger 2](http://swagger.io/). 
 *
 * OpenAPI spec version: v1.0
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.wso2.am.integration.clients.store.api.v1.dto;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.wso2.am.integration.clients.store.api.v1.dto.APIInfoDTO;
import org.wso2.am.integration.clients.store.api.v1.dto.APIProductInfoDTO;
import org.wso2.am.integration.clients.store.api.v1.dto.ApplicationInfoDTO;

/**
 * SubscriptionDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-22T15:12:21.329+05:30")
public class SubscriptionDTO {
  @SerializedName("subscriptionId")
  private String subscriptionId = null;

  @SerializedName("applicationId")
  private String applicationId = null;

  @SerializedName("apiId")
  private String apiId = null;

  @SerializedName("apiInfo")
  private APIInfoDTO apiInfo = null;

  @SerializedName("apiProductId")
  private String apiProductId = null;

  @SerializedName("apiProductInfo")
  private APIProductInfoDTO apiProductInfo = null;

  @SerializedName("applicationInfo")
  private ApplicationInfoDTO applicationInfo = null;

  @SerializedName("throttlingPolicy")
  private String throttlingPolicy = null;

  /**
   * Gets or Sets type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    API("API"),
    
    API_PRODUCT("API_PRODUCT");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  /**
   * Gets or Sets status
   */
  @JsonAdapter(StatusEnum.Adapter.class)
  public enum StatusEnum {
    BLOCKED("BLOCKED"),
    
    PROD_ONLY_BLOCKED("PROD_ONLY_BLOCKED"),
    
    UNBLOCKED("UNBLOCKED"),
    
    ON_HOLD("ON_HOLD"),
    
    REJECTED("REJECTED");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<StatusEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final StatusEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public StatusEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return StatusEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("status")
  private StatusEnum status = null;

  public SubscriptionDTO subscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
    return this;
  }

   /**
   * The UUID of the subscription
   * @return subscriptionId
  **/
  @ApiModelProperty(example = "faae5fcc-cbae-40c4-bf43-89931630d313", value = "The UUID of the subscription")
  public String getSubscriptionId() {
    return subscriptionId;
  }

  public void setSubscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
  }

  public SubscriptionDTO applicationId(String applicationId) {
    this.applicationId = applicationId;
    return this;
  }

   /**
   * The UUID of the application
   * @return applicationId
  **/
  @ApiModelProperty(example = "b3ade481-30b0-4b38-9a67-498a40873a6d", required = true, value = "The UUID of the application")
  public String getApplicationId() {
    return applicationId;
  }

  public void setApplicationId(String applicationId) {
    this.applicationId = applicationId;
  }

  public SubscriptionDTO apiId(String apiId) {
    this.apiId = apiId;
    return this;
  }

   /**
   * The unique identifier of the API.
   * @return apiId
  **/
  @ApiModelProperty(value = "The unique identifier of the API.")
  public String getApiId() {
    return apiId;
  }

  public void setApiId(String apiId) {
    this.apiId = apiId;
  }

  public SubscriptionDTO apiInfo(APIInfoDTO apiInfo) {
    this.apiInfo = apiInfo;
    return this;
  }

   /**
   * Get apiInfo
   * @return apiInfo
  **/
  @ApiModelProperty(value = "")
  public APIInfoDTO getApiInfo() {
    return apiInfo;
  }

  public void setApiInfo(APIInfoDTO apiInfo) {
    this.apiInfo = apiInfo;
  }

  public SubscriptionDTO apiProductId(String apiProductId) {
    this.apiProductId = apiProductId;
    return this;
  }

   /**
   * The unique identifier of the API Product.
   * @return apiProductId
  **/
  @ApiModelProperty(value = "The unique identifier of the API Product.")
  public String getApiProductId() {
    return apiProductId;
  }

  public void setApiProductId(String apiProductId) {
    this.apiProductId = apiProductId;
  }

  public SubscriptionDTO apiProductInfo(APIProductInfoDTO apiProductInfo) {
    this.apiProductInfo = apiProductInfo;
    return this;
  }

   /**
   * Get apiProductInfo
   * @return apiProductInfo
  **/
  @ApiModelProperty(value = "")
  public APIProductInfoDTO getApiProductInfo() {
    return apiProductInfo;
  }

  public void setApiProductInfo(APIProductInfoDTO apiProductInfo) {
    this.apiProductInfo = apiProductInfo;
  }

  public SubscriptionDTO applicationInfo(ApplicationInfoDTO applicationInfo) {
    this.applicationInfo = applicationInfo;
    return this;
  }

   /**
   * Get applicationInfo
   * @return applicationInfo
  **/
  @ApiModelProperty(value = "")
  public ApplicationInfoDTO getApplicationInfo() {
    return applicationInfo;
  }

  public void setApplicationInfo(ApplicationInfoDTO applicationInfo) {
    this.applicationInfo = applicationInfo;
  }

  public SubscriptionDTO throttlingPolicy(String throttlingPolicy) {
    this.throttlingPolicy = throttlingPolicy;
    return this;
  }

   /**
   * Get throttlingPolicy
   * @return throttlingPolicy
  **/
  @ApiModelProperty(example = "Unlimited", required = true, value = "")
  public String getThrottlingPolicy() {
    return throttlingPolicy;
  }

  public void setThrottlingPolicy(String throttlingPolicy) {
    this.throttlingPolicy = throttlingPolicy;
  }

  public SubscriptionDTO type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public SubscriptionDTO status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(example = "UNBLOCKED", value = "")
  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SubscriptionDTO subscription = (SubscriptionDTO) o;
    return Objects.equals(this.subscriptionId, subscription.subscriptionId) &&
        Objects.equals(this.applicationId, subscription.applicationId) &&
        Objects.equals(this.apiId, subscription.apiId) &&
        Objects.equals(this.apiInfo, subscription.apiInfo) &&
        Objects.equals(this.apiProductId, subscription.apiProductId) &&
        Objects.equals(this.apiProductInfo, subscription.apiProductInfo) &&
        Objects.equals(this.applicationInfo, subscription.applicationInfo) &&
        Objects.equals(this.throttlingPolicy, subscription.throttlingPolicy) &&
        Objects.equals(this.type, subscription.type) &&
        Objects.equals(this.status, subscription.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriptionId, applicationId, apiId, apiInfo, apiProductId, apiProductInfo, applicationInfo, throttlingPolicy, type, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SubscriptionDTO {\n");
    
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    apiId: ").append(toIndentedString(apiId)).append("\n");
    sb.append("    apiInfo: ").append(toIndentedString(apiInfo)).append("\n");
    sb.append("    apiProductId: ").append(toIndentedString(apiProductId)).append("\n");
    sb.append("    apiProductInfo: ").append(toIndentedString(apiProductInfo)).append("\n");
    sb.append("    applicationInfo: ").append(toIndentedString(applicationInfo)).append("\n");
    sb.append("    throttlingPolicy: ").append(toIndentedString(throttlingPolicy)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

