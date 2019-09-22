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

/**
 * MonetizationAttributeDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-22T15:12:13.756+05:30")
public class MonetizationAttributeDTO {
  @SerializedName("required")
  private Boolean required = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("displayName")
  private String displayName = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("hidden")
  private Boolean hidden = null;

  @SerializedName("default")
  private String _default = null;

  public MonetizationAttributeDTO required(Boolean required) {
    this.required = required;
    return this;
  }

   /**
   * Is attribute required 
   * @return required
  **/
  @ApiModelProperty(example = "true", value = "Is attribute required ")
  public Boolean isRequired() {
    return required;
  }

  public void setRequired(Boolean required) {
    this.required = required;
  }

  public MonetizationAttributeDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the attribute 
   * @return name
  **/
  @ApiModelProperty(value = "Name of the attribute ")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MonetizationAttributeDTO displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Display name of the attribute 
   * @return displayName
  **/
  @ApiModelProperty(value = "Display name of the attribute ")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public MonetizationAttributeDTO description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of the attribute 
   * @return description
  **/
  @ApiModelProperty(value = "Description of the attribute ")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public MonetizationAttributeDTO hidden(Boolean hidden) {
    this.hidden = hidden;
    return this;
  }

   /**
   * Is attribute hidden 
   * @return hidden
  **/
  @ApiModelProperty(value = "Is attribute hidden ")
  public Boolean isHidden() {
    return hidden;
  }

  public void setHidden(Boolean hidden) {
    this.hidden = hidden;
  }

  public MonetizationAttributeDTO _default(String _default) {
    this._default = _default;
    return this;
  }

   /**
   * Default value of the attribute 
   * @return _default
  **/
  @ApiModelProperty(value = "Default value of the attribute ")
  public String getDefault() {
    return _default;
  }

  public void setDefault(String _default) {
    this._default = _default;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MonetizationAttributeDTO monetizationAttribute = (MonetizationAttributeDTO) o;
    return Objects.equals(this.required, monetizationAttribute.required) &&
        Objects.equals(this.name, monetizationAttribute.name) &&
        Objects.equals(this.displayName, monetizationAttribute.displayName) &&
        Objects.equals(this.description, monetizationAttribute.description) &&
        Objects.equals(this.hidden, monetizationAttribute.hidden) &&
        Objects.equals(this._default, monetizationAttribute._default);
  }

  @Override
  public int hashCode() {
    return Objects.hash(required, name, displayName, description, hidden, _default);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MonetizationAttributeDTO {\n");
    
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    hidden: ").append(toIndentedString(hidden)).append("\n");
    sb.append("    _default: ").append(toIndentedString(_default)).append("\n");
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

