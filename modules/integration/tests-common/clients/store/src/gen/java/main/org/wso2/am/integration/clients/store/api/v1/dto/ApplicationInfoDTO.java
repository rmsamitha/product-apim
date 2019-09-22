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
 * ApplicationInfoDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-22T15:12:21.329+05:30")
public class ApplicationInfoDTO {
  @SerializedName("applicationId")
  private String applicationId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("throttlingPolicy")
  private String throttlingPolicy = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("status")
  private String status = "";

  @SerializedName("groups")
  private List<String> groups = null;

  @SerializedName("subscriptionCount")
  private Integer subscriptionCount = null;

  @SerializedName("attributes")
  private Object attributes = null;

  @SerializedName("owner")
  private String owner = null;

  public ApplicationInfoDTO applicationId(String applicationId) {
    this.applicationId = applicationId;
    return this;
  }

   /**
   * Get applicationId
   * @return applicationId
  **/
  @ApiModelProperty(example = "01234567-0123-0123-0123-012345678901", value = "")
  public String getApplicationId() {
    return applicationId;
  }

  public void setApplicationId(String applicationId) {
    this.applicationId = applicationId;
  }

  public ApplicationInfoDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "CalculatorApp", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ApplicationInfoDTO throttlingPolicy(String throttlingPolicy) {
    this.throttlingPolicy = throttlingPolicy;
    return this;
  }

   /**
   * Get throttlingPolicy
   * @return throttlingPolicy
  **/
  @ApiModelProperty(example = "Unlimited", value = "")
  public String getThrottlingPolicy() {
    return throttlingPolicy;
  }

  public void setThrottlingPolicy(String throttlingPolicy) {
    this.throttlingPolicy = throttlingPolicy;
  }

  public ApplicationInfoDTO description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "Sample calculator application", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ApplicationInfoDTO status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(example = "APPROVED", value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ApplicationInfoDTO groups(List<String> groups) {
    this.groups = groups;
    return this;
  }

  public ApplicationInfoDTO addGroupsItem(String groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * Get groups
   * @return groups
  **/
  @ApiModelProperty(example = "\"\"", value = "")
  public List<String> getGroups() {
    return groups;
  }

  public void setGroups(List<String> groups) {
    this.groups = groups;
  }

  public ApplicationInfoDTO subscriptionCount(Integer subscriptionCount) {
    this.subscriptionCount = subscriptionCount;
    return this;
  }

   /**
   * Get subscriptionCount
   * @return subscriptionCount
  **/
  @ApiModelProperty(value = "")
  public Integer getSubscriptionCount() {
    return subscriptionCount;
  }

  public void setSubscriptionCount(Integer subscriptionCount) {
    this.subscriptionCount = subscriptionCount;
  }

  public ApplicationInfoDTO attributes(Object attributes) {
    this.attributes = attributes;
    return this;
  }

   /**
   * Get attributes
   * @return attributes
  **/
  @ApiModelProperty(example = "\"External Reference ID, Billing Tier\"", value = "")
  public Object getAttributes() {
    return attributes;
  }

  public void setAttributes(Object attributes) {
    this.attributes = attributes;
  }

  public ApplicationInfoDTO owner(String owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @ApiModelProperty(example = "admin", value = "")
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplicationInfoDTO applicationInfo = (ApplicationInfoDTO) o;
    return Objects.equals(this.applicationId, applicationInfo.applicationId) &&
        Objects.equals(this.name, applicationInfo.name) &&
        Objects.equals(this.throttlingPolicy, applicationInfo.throttlingPolicy) &&
        Objects.equals(this.description, applicationInfo.description) &&
        Objects.equals(this.status, applicationInfo.status) &&
        Objects.equals(this.groups, applicationInfo.groups) &&
        Objects.equals(this.subscriptionCount, applicationInfo.subscriptionCount) &&
        Objects.equals(this.attributes, applicationInfo.attributes) &&
        Objects.equals(this.owner, applicationInfo.owner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(applicationId, name, throttlingPolicy, description, status, groups, subscriptionCount, attributes, owner);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplicationInfoDTO {\n");
    
    sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    throttlingPolicy: ").append(toIndentedString(throttlingPolicy)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    subscriptionCount: ").append(toIndentedString(subscriptionCount)).append("\n");
    sb.append("    attributes: ").append(toIndentedString(attributes)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
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

