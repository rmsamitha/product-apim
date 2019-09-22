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
import org.wso2.am.integration.clients.publisher.api.v1.dto.CertificateValidityDTO;

/**
 * CertificateInfoDTO
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-09-22T15:12:13.756+05:30")
public class CertificateInfoDTO {
  @SerializedName("status")
  private String status = null;

  @SerializedName("validity")
  private CertificateValidityDTO validity = null;

  @SerializedName("version")
  private String version = null;

  @SerializedName("subject")
  private String subject = null;

  public CertificateInfoDTO status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(example = "Active", value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public CertificateInfoDTO validity(CertificateValidityDTO validity) {
    this.validity = validity;
    return this;
  }

   /**
   * Get validity
   * @return validity
  **/
  @ApiModelProperty(value = "")
  public CertificateValidityDTO getValidity() {
    return validity;
  }

  public void setValidity(CertificateValidityDTO validity) {
    this.validity = validity;
  }

  public CertificateInfoDTO version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @ApiModelProperty(example = "V3", value = "")
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public CertificateInfoDTO subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * Get subject
   * @return subject
  **/
  @ApiModelProperty(example = "CN=wso2.com, OU=wso2, O=wso2, L=Colombo, ST=Western, C=LK", value = "")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CertificateInfoDTO certificateInfo = (CertificateInfoDTO) o;
    return Objects.equals(this.status, certificateInfo.status) &&
        Objects.equals(this.validity, certificateInfo.validity) &&
        Objects.equals(this.version, certificateInfo.version) &&
        Objects.equals(this.subject, certificateInfo.subject);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, validity, version, subject);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CertificateInfoDTO {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    validity: ").append(toIndentedString(validity)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
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

