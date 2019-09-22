/*
 * WSO2 API Manager - Publisher API
 * This specifies a **RESTful API** for WSO2 **API Manager** - Publisher.  Please see [full swagger definition](https://raw.githubusercontent.com/wso2/carbon-apimgt/v6.0.4/components/apimgt/org.wso2.carbon.apimgt.rest.api.publisher/src/main/resources/publisher-api.yaml) of the API which is written using [swagger 2.0](http://swagger.io/) specification. 
 *
 * OpenAPI spec version: v1.0
 * Contact: architecture@wso2.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package org.wso2.am.integration.clients.publisher.api.v1.dto;

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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-22T15:12:13.756+05:30")
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

  @SerializedName("provider")
  private String provider = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("lifeCycleStatus")
  private String lifeCycleStatus = null;

  @SerializedName("workflowStatus")
  private String workflowStatus = null;

  @SerializedName("hasThumbnail")
  private Boolean hasThumbnail = null;

  @SerializedName("securityScheme")
  private List<String> securityScheme = null;

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

  public APIInfoDTO type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "HTTP", value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public APIInfoDTO lifeCycleStatus(String lifeCycleStatus) {
    this.lifeCycleStatus = lifeCycleStatus;
    return this;
  }

   /**
   * Get lifeCycleStatus
   * @return lifeCycleStatus
  **/
  @ApiModelProperty(example = "CREATED", value = "")
  public String getLifeCycleStatus() {
    return lifeCycleStatus;
  }

  public void setLifeCycleStatus(String lifeCycleStatus) {
    this.lifeCycleStatus = lifeCycleStatus;
  }

  public APIInfoDTO workflowStatus(String workflowStatus) {
    this.workflowStatus = workflowStatus;
    return this;
  }

   /**
   * Get workflowStatus
   * @return workflowStatus
  **/
  @ApiModelProperty(example = "APPROVED", value = "")
  public String getWorkflowStatus() {
    return workflowStatus;
  }

  public void setWorkflowStatus(String workflowStatus) {
    this.workflowStatus = workflowStatus;
  }

  public APIInfoDTO hasThumbnail(Boolean hasThumbnail) {
    this.hasThumbnail = hasThumbnail;
    return this;
  }

   /**
   * Get hasThumbnail
   * @return hasThumbnail
  **/
  @ApiModelProperty(example = "true", value = "")
  public Boolean isHasThumbnail() {
    return hasThumbnail;
  }

  public void setHasThumbnail(Boolean hasThumbnail) {
    this.hasThumbnail = hasThumbnail;
  }

  public APIInfoDTO securityScheme(List<String> securityScheme) {
    this.securityScheme = securityScheme;
    return this;
  }

  public APIInfoDTO addSecuritySchemeItem(String securitySchemeItem) {
    if (this.securityScheme == null) {
      this.securityScheme = new ArrayList<>();
    }
    this.securityScheme.add(securitySchemeItem);
    return this;
  }

   /**
   * Get securityScheme
   * @return securityScheme
  **/
  @ApiModelProperty(value = "")
  public List<String> getSecurityScheme() {
    return securityScheme;
  }

  public void setSecurityScheme(List<String> securityScheme) {
    this.securityScheme = securityScheme;
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
        Objects.equals(this.provider, apIInfo.provider) &&
        Objects.equals(this.type, apIInfo.type) &&
        Objects.equals(this.lifeCycleStatus, apIInfo.lifeCycleStatus) &&
        Objects.equals(this.workflowStatus, apIInfo.workflowStatus) &&
        Objects.equals(this.hasThumbnail, apIInfo.hasThumbnail) &&
        Objects.equals(this.securityScheme, apIInfo.securityScheme);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, context, version, provider, type, lifeCycleStatus, workflowStatus, hasThumbnail, securityScheme);
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
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    lifeCycleStatus: ").append(toIndentedString(lifeCycleStatus)).append("\n");
    sb.append("    workflowStatus: ").append(toIndentedString(workflowStatus)).append("\n");
    sb.append("    hasThumbnail: ").append(toIndentedString(hasThumbnail)).append("\n");
    sb.append("    securityScheme: ").append(toIndentedString(securityScheme)).append("\n");
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

