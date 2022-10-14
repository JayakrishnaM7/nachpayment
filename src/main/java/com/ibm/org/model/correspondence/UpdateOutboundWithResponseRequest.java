package com.ibm.org.model.correspondence;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.ibm.org.model.correspondence.InitiateOutboundRequestCorrespondenceOperatingSession;
import com.ibm.org.model.correspondence.InitiateOutboundWithResponseRequestOutbound;
import com.ibm.org.model.correspondence.InitiateOutboundWithResponseRequestOutboundWithResponse;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * UpdateOutboundWithResponseRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:38:04.194Z[GMT]")

public class UpdateOutboundWithResponseRequest   {
  @JsonProperty("CorrespondenceOperatingSession")
  private InitiateOutboundRequestCorrespondenceOperatingSession correspondenceOperatingSession;

  @JsonProperty("Outbound")
  private InitiateOutboundWithResponseRequestOutbound outbound;

  @JsonProperty("OutboundWithResponse")
  private InitiateOutboundWithResponseRequestOutboundWithResponse outboundWithResponse;

  public UpdateOutboundWithResponseRequest correspondenceOperatingSession(InitiateOutboundRequestCorrespondenceOperatingSession correspondenceOperatingSession) {
    this.correspondenceOperatingSession = correspondenceOperatingSession;
    return this;
  }

  /**
   * Get correspondenceOperatingSession
   * @return correspondenceOperatingSession
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateOutboundRequestCorrespondenceOperatingSession getCorrespondenceOperatingSession() {
    return correspondenceOperatingSession;
  }

  public void setCorrespondenceOperatingSession(InitiateOutboundRequestCorrespondenceOperatingSession correspondenceOperatingSession) {
    this.correspondenceOperatingSession = correspondenceOperatingSession;
  }

  public UpdateOutboundWithResponseRequest outbound(InitiateOutboundWithResponseRequestOutbound outbound) {
    this.outbound = outbound;
    return this;
  }

  /**
   * Get outbound
   * @return outbound
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateOutboundWithResponseRequestOutbound getOutbound() {
    return outbound;
  }

  public void setOutbound(InitiateOutboundWithResponseRequestOutbound outbound) {
    this.outbound = outbound;
  }

  public UpdateOutboundWithResponseRequest outboundWithResponse(InitiateOutboundWithResponseRequestOutboundWithResponse outboundWithResponse) {
    this.outboundWithResponse = outboundWithResponse;
    return this;
  }

  /**
   * Get outboundWithResponse
   * @return outboundWithResponse
  */
  @ApiModelProperty(value = "")

  @Valid

  public InitiateOutboundWithResponseRequestOutboundWithResponse getOutboundWithResponse() {
    return outboundWithResponse;
  }

  public void setOutboundWithResponse(InitiateOutboundWithResponseRequestOutboundWithResponse outboundWithResponse) {
    this.outboundWithResponse = outboundWithResponse;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateOutboundWithResponseRequest updateOutboundWithResponseRequest = (UpdateOutboundWithResponseRequest) o;
    return Objects.equals(this.correspondenceOperatingSession, updateOutboundWithResponseRequest.correspondenceOperatingSession) &&
        Objects.equals(this.outbound, updateOutboundWithResponseRequest.outbound) &&
        Objects.equals(this.outboundWithResponse, updateOutboundWithResponseRequest.outboundWithResponse);
  }

  @Override
  public int hashCode() {
    return Objects.hash(correspondenceOperatingSession, outbound, outboundWithResponse);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateOutboundWithResponseRequest {\n");
    
    sb.append("    correspondenceOperatingSession: ").append(toIndentedString(correspondenceOperatingSession)).append("\n");
    sb.append("    outbound: ").append(toIndentedString(outbound)).append("\n");
    sb.append("    outboundWithResponse: ").append(toIndentedString(outboundWithResponse)).append("\n");
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

