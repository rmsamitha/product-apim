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

/**
 * APIProductBusinessInformationDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-22T15:12:21.329+05:30")
public class APIProductBusinessInformationDTO {
  @SerializedName("businessOwner")
  private String businessOwner = null;

  @SerializedName("businessOwnerEmail")
  private String businessOwnerEmail = null;

  public APIProductBusinessInformationDTO businessOwner(String businessOwner) {
    this.businessOwner = businessOwner;
    return this;
  }

   /**
   * Get businessOwner
   * @return businessOwner
  **/
  @ApiModelProperty(example = "businessowner", value = "")
  public String getBusinessOwner() {
    return businessOwner;
  }

  public void setBusinessOwner(String businessOwner) {
    this.businessOwner = businessOwner;
  }

  public APIProductBusinessInformationDTO businessOwnerEmail(String businessOwnerEmail) {
    this.businessOwnerEmail = businessOwnerEmail;
    return this;
  }

   /**
   * Get businessOwnerEmail
   * @return businessOwnerEmail
  **/
  @ApiModelProperty(example = "businessowner@wso2.com", value = "")
  public String getBusinessOwnerEmail() {
    return businessOwnerEmail;
  }

  public void setBusinessOwnerEmail(String businessOwnerEmail) {
    this.businessOwnerEmail = businessOwnerEmail;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIProductBusinessInformationDTO apIProductBusinessInformation = (APIProductBusinessInformationDTO) o;
    return Objects.equals(this.businessOwner, apIProductBusinessInformation.businessOwner) &&
        Objects.equals(this.businessOwnerEmail, apIProductBusinessInformation.businessOwnerEmail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessOwner, businessOwnerEmail);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIProductBusinessInformationDTO {\n");
    
    sb.append("    businessOwner: ").append(toIndentedString(businessOwner)).append("\n");
    sb.append("    businessOwnerEmail: ").append(toIndentedString(businessOwnerEmail)).append("\n");
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

