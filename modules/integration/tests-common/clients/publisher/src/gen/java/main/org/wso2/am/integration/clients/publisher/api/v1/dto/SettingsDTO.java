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
import org.wso2.am.integration.clients.publisher.api.v1.dto.EnvironmentDTO;
import org.wso2.am.integration.clients.publisher.api.v1.dto.MonetizationAttributeDTO;

/**
 * SettingsDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-22T15:12:13.756+05:30")
public class SettingsDTO {
  @SerializedName("environment")
  private List<EnvironmentDTO> environment = null;

  @SerializedName("scopes")
  private List<String> scopes = null;

  @SerializedName("monetizationAttributes")
  private List<MonetizationAttributeDTO> monetizationAttributes = null;

  @SerializedName("externalStoresEnabled")
  private Boolean externalStoresEnabled = null;

  public SettingsDTO environment(List<EnvironmentDTO> environment) {
    this.environment = environment;
    return this;
  }

  public SettingsDTO addEnvironmentItem(EnvironmentDTO environmentItem) {
    if (this.environment == null) {
      this.environment = new ArrayList<>();
    }
    this.environment.add(environmentItem);
    return this;
  }

   /**
   * Get environment
   * @return environment
  **/
  @ApiModelProperty(value = "")
  public List<EnvironmentDTO> getEnvironment() {
    return environment;
  }

  public void setEnvironment(List<EnvironmentDTO> environment) {
    this.environment = environment;
  }

  public SettingsDTO scopes(List<String> scopes) {
    this.scopes = scopes;
    return this;
  }

  public SettingsDTO addScopesItem(String scopesItem) {
    if (this.scopes == null) {
      this.scopes = new ArrayList<>();
    }
    this.scopes.add(scopesItem);
    return this;
  }

   /**
   * Get scopes
   * @return scopes
  **/
  @ApiModelProperty(value = "")
  public List<String> getScopes() {
    return scopes;
  }

  public void setScopes(List<String> scopes) {
    this.scopes = scopes;
  }

  public SettingsDTO monetizationAttributes(List<MonetizationAttributeDTO> monetizationAttributes) {
    this.monetizationAttributes = monetizationAttributes;
    return this;
  }

  public SettingsDTO addMonetizationAttributesItem(MonetizationAttributeDTO monetizationAttributesItem) {
    if (this.monetizationAttributes == null) {
      this.monetizationAttributes = new ArrayList<>();
    }
    this.monetizationAttributes.add(monetizationAttributesItem);
    return this;
  }

   /**
   * Get monetizationAttributes
   * @return monetizationAttributes
  **/
  @ApiModelProperty(value = "")
  public List<MonetizationAttributeDTO> getMonetizationAttributes() {
    return monetizationAttributes;
  }

  public void setMonetizationAttributes(List<MonetizationAttributeDTO> monetizationAttributes) {
    this.monetizationAttributes = monetizationAttributes;
  }

  public SettingsDTO externalStoresEnabled(Boolean externalStoresEnabled) {
    this.externalStoresEnabled = externalStoresEnabled;
    return this;
  }

   /**
   * Is External Stores configuration enabled 
   * @return externalStoresEnabled
  **/
  @ApiModelProperty(example = "true", value = "Is External Stores configuration enabled ")
  public Boolean isExternalStoresEnabled() {
    return externalStoresEnabled;
  }

  public void setExternalStoresEnabled(Boolean externalStoresEnabled) {
    this.externalStoresEnabled = externalStoresEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SettingsDTO settings = (SettingsDTO) o;
    return Objects.equals(this.environment, settings.environment) &&
        Objects.equals(this.scopes, settings.scopes) &&
        Objects.equals(this.monetizationAttributes, settings.monetizationAttributes) &&
        Objects.equals(this.externalStoresEnabled, settings.externalStoresEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(environment, scopes, monetizationAttributes, externalStoresEnabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SettingsDTO {\n");
    
    sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
    sb.append("    scopes: ").append(toIndentedString(scopes)).append("\n");
    sb.append("    monetizationAttributes: ").append(toIndentedString(monetizationAttributes)).append("\n");
    sb.append("    externalStoresEnabled: ").append(toIndentedString(externalStoresEnabled)).append("\n");
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

