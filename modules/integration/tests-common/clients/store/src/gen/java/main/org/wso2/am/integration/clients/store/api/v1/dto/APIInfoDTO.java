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
import java.util.ArrayList;
import java.util.List;

/**
 * APIInfoDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-22T15:12:21.329+05:30")
public class APIInfoDTO {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("context")
  private String context = null;

  @SerializedName("version")
  private String version = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("provider")
  private String provider = null;

  @SerializedName("lifeCycleStatus")
  private String lifeCycleStatus = null;

  @SerializedName("thumbnailUri")
  private String thumbnailUri = null;

  @SerializedName("avgRating")
  private String avgRating = null;

  @SerializedName("throttlingPolicies")
  private List<String> throttlingPolicies = null;

  public APIInfoDTO id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "01234567-0123-0123-0123-012345678901", value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public APIInfoDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "CalculatorAPI", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public APIInfoDTO description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "A calculator API that supports basic operations", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public APIInfoDTO context(String context) {
    this.context = context;
    return this;
  }

   /**
   * Get context
   * @return context
  **/
  @ApiModelProperty(example = "CalculatorAPI", value = "")
  public String getContext() {
    return context;
  }

  public void setContext(String context) {
    this.context = context;
  }

  public APIInfoDTO version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @ApiModelProperty(example = "1.0.0", value = "")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public APIInfoDTO type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "WS", value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public APIInfoDTO provider(String provider) {
    this.provider = provider;
    return this;
  }

   /**
   * If the provider value is not given, the user invoking the API will be used as the provider. 
   * @return provider
  **/
  @ApiModelProperty(example = "admin", value = "If the provider value is not given, the user invoking the API will be used as the provider. ")
  public String getProvider() {
    return provider;
  }

  public void setProvider(String provider) {
    this.provider = provider;
  }

  public APIInfoDTO lifeCycleStatus(String lifeCycleStatus) {
    this.lifeCycleStatus = lifeCycleStatus;
    return this;
  }

   /**
   * Get lifeCycleStatus
   * @return lifeCycleStatus
  **/
  @ApiModelProperty(example = "PUBLISHED", value = "")
  public String getLifeCycleStatus() {
    return lifeCycleStatus;
  }

  public void setLifeCycleStatus(String lifeCycleStatus) {
    this.lifeCycleStatus = lifeCycleStatus;
  }

  public APIInfoDTO thumbnailUri(String thumbnailUri) {
    this.thumbnailUri = thumbnailUri;
    return this;
  }

   /**
   * Get thumbnailUri
   * @return thumbnailUri
  **/
  @ApiModelProperty(example = "/apis/01234567-0123-0123-0123-012345678901/thumbnail", value = "")
  public String getThumbnailUri() {
    return thumbnailUri;
  }

  public void setThumbnailUri(String thumbnailUri) {
    this.thumbnailUri = thumbnailUri;
  }

  public APIInfoDTO avgRating(String avgRating) {
    this.avgRating = avgRating;
    return this;
  }

   /**
   * Average rating of the API
   * @return avgRating
  **/
  @ApiModelProperty(example = "4.5", value = "Average rating of the API")
  public String getAvgRating() {
    return avgRating;
  }

  public void setAvgRating(String avgRating) {
    this.avgRating = avgRating;
  }

  public APIInfoDTO throttlingPolicies(List<String> throttlingPolicies) {
    this.throttlingPolicies = throttlingPolicies;
    return this;
  }

  public APIInfoDTO addThrottlingPoliciesItem(String throttlingPoliciesItem) {
    if (this.throttlingPolicies == null) {
      this.throttlingPolicies = new ArrayList<>();
    }
    this.throttlingPolicies.add(throttlingPoliciesItem);
    return this;
  }

   /**
   * List of throttling policies of the API
   * @return throttlingPolicies
  **/
  @ApiModelProperty(example = "[\"Unlimited\",\"Bronze\"]", value = "List of throttling policies of the API")
  public List<String> getThrottlingPolicies() {
    return throttlingPolicies;
  }

  public void setThrottlingPolicies(List<String> throttlingPolicies) {
    this.throttlingPolicies = throttlingPolicies;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIInfoDTO apIInfo = (APIInfoDTO) o;
    return Objects.equals(this.id, apIInfo.id) &&
        Objects.equals(this.name, apIInfo.name) &&
        Objects.equals(this.description, apIInfo.description) &&
        Objects.equals(this.context, apIInfo.context) &&
        Objects.equals(this.version, apIInfo.version) &&
        Objects.equals(this.type, apIInfo.type) &&
        Objects.equals(this.provider, apIInfo.provider) &&
        Objects.equals(this.lifeCycleStatus, apIInfo.lifeCycleStatus) &&
        Objects.equals(this.thumbnailUri, apIInfo.thumbnailUri) &&
        Objects.equals(this.avgRating, apIInfo.avgRating) &&
        Objects.equals(this.throttlingPolicies, apIInfo.throttlingPolicies);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, context, version, type, provider, lifeCycleStatus, thumbnailUri, avgRating, throttlingPolicies);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIInfoDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    lifeCycleStatus: ").append(toIndentedString(lifeCycleStatus)).append("\n");
    sb.append("    thumbnailUri: ").append(toIndentedString(thumbnailUri)).append("\n");
    sb.append("    avgRating: ").append(toIndentedString(avgRating)).append("\n");
    sb.append("    throttlingPolicies: ").append(toIndentedString(throttlingPolicies)).append("\n");
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

