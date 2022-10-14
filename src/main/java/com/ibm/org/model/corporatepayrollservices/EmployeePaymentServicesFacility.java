package com.ibm.org.model.corporatepayrollservices;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EmployeePaymentServicesFacility
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:38:01.096Z[GMT]")

public class EmployeePaymentServicesFacility   {
  @JsonProperty("EmployeePaymentServicesFacilityParameterType")
  private String employeePaymentServicesFacilityParameterType;

  @JsonProperty("EmployeePaymentServicesFacilitySelectedOption")
  private String employeePaymentServicesFacilitySelectedOption;

  @JsonProperty("EmployeePaymentServicesFacilityType")
  private Object employeePaymentServicesFacilityType;

  @JsonProperty("EmployeePaymentServicesFacilityCalendarReference")
  private String employeePaymentServicesFacilityCalendarReference;

  @JsonProperty("EmployeePaymentServicesFacilityStatus")
  private String employeePaymentServicesFacilityStatus;

  @JsonProperty("EmployeePaymentServicesFacilityAssociatedParty")
  private Object employeePaymentServicesFacilityAssociatedParty;

  @JsonProperty("EmployeePaymentServicesFacilityCurrency")
  private String employeePaymentServicesFacilityCurrency;

  @JsonProperty("EmployeePaymentServicesFacilityRegulationReference")
  private Object employeePaymentServicesFacilityRegulationReference;

  @JsonProperty("EmployeePaymentServicesFacilityRegulationType")
  private String employeePaymentServicesFacilityRegulationType;

  @JsonProperty("EmployeePaymentServicesFacilityJurisdiction")
  private Object employeePaymentServicesFacilityJurisdiction;

  @JsonProperty("EmployeePaymentServicesFacilityBookingLocation")
  private Object employeePaymentServicesFacilityBookingLocation;

  @JsonProperty("EmployeePaymentServicesFacilityAccountType")
  private String employeePaymentServicesFacilityAccountType;

  @JsonProperty("EmployeePaymentServicesFacilityAccountReference")
  private String employeePaymentServicesFacilityAccountReference;

  @JsonProperty("EmployeePaymentServicesFacilityCustomerReference")
  private Object employeePaymentServicesFacilityCustomerReference;

  @JsonProperty("EmployeePaymentServicesFacilityPosition")
  private String employeePaymentServicesFacilityPosition;

  @JsonProperty("EmployeePaymentServicesFacilityProductReference")
  private Object employeePaymentServicesFacilityProductReference;

  @JsonProperty("EmployeePaymentServicesFacilityPositionLimit")
  private String employeePaymentServicesFacilityPositionLimit;

  @JsonProperty("EmployeePaymentServicesFacilityReference")
  private String employeePaymentServicesFacilityReference;

  public EmployeePaymentServicesFacility employeePaymentServicesFacilityParameterType(String employeePaymentServicesFacilityParameterType) {
    this.employeePaymentServicesFacilityParameterType = employeePaymentServicesFacilityParameterType;
    return this;
  }

  /**
   * Get employeePaymentServicesFacilityParameterType
   * @return employeePaymentServicesFacilityParameterType
  */
  @ApiModelProperty(value = "")


  public String getEmployeePaymentServicesFacilityParameterType() {
    return employeePaymentServicesFacilityParameterType;
  }

  public void setEmployeePaymentServicesFacilityParameterType(String employeePaymentServicesFacilityParameterType) {
    this.employeePaymentServicesFacilityParameterType = employeePaymentServicesFacilityParameterType;
  }

  public EmployeePaymentServicesFacility employeePaymentServicesFacilitySelectedOption(String employeePaymentServicesFacilitySelectedOption) {
    this.employeePaymentServicesFacilitySelectedOption = employeePaymentServicesFacilitySelectedOption;
    return this;
  }

  /**
   * Get employeePaymentServicesFacilitySelectedOption
   * @return employeePaymentServicesFacilitySelectedOption
  */
  @ApiModelProperty(value = "")


  public String getEmployeePaymentServicesFacilitySelectedOption() {
    return employeePaymentServicesFacilitySelectedOption;
  }

  public void setEmployeePaymentServicesFacilitySelectedOption(String employeePaymentServicesFacilitySelectedOption) {
    this.employeePaymentServicesFacilitySelectedOption = employeePaymentServicesFacilitySelectedOption;
  }

  public EmployeePaymentServicesFacility employeePaymentServicesFacilityType(Object employeePaymentServicesFacilityType) {
    this.employeePaymentServicesFacilityType = employeePaymentServicesFacilityType;
    return this;
  }

  /**
   * Get employeePaymentServicesFacilityType
   * @return employeePaymentServicesFacilityType
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getEmployeePaymentServicesFacilityType() {
    return employeePaymentServicesFacilityType;
  }

  public void setEmployeePaymentServicesFacilityType(Object employeePaymentServicesFacilityType) {
    this.employeePaymentServicesFacilityType = employeePaymentServicesFacilityType;
  }

  public EmployeePaymentServicesFacility employeePaymentServicesFacilityCalendarReference(String employeePaymentServicesFacilityCalendarReference) {
    this.employeePaymentServicesFacilityCalendarReference = employeePaymentServicesFacilityCalendarReference;
    return this;
  }

  /**
   * Get employeePaymentServicesFacilityCalendarReference
   * @return employeePaymentServicesFacilityCalendarReference
  */
  @ApiModelProperty(value = "")


  public String getEmployeePaymentServicesFacilityCalendarReference() {
    return employeePaymentServicesFacilityCalendarReference;
  }

  public void setEmployeePaymentServicesFacilityCalendarReference(String employeePaymentServicesFacilityCalendarReference) {
    this.employeePaymentServicesFacilityCalendarReference = employeePaymentServicesFacilityCalendarReference;
  }

  public EmployeePaymentServicesFacility employeePaymentServicesFacilityStatus(String employeePaymentServicesFacilityStatus) {
    this.employeePaymentServicesFacilityStatus = employeePaymentServicesFacilityStatus;
    return this;
  }

  /**
   * Get employeePaymentServicesFacilityStatus
   * @return employeePaymentServicesFacilityStatus
  */
  @ApiModelProperty(value = "")


  public String getEmployeePaymentServicesFacilityStatus() {
    return employeePaymentServicesFacilityStatus;
  }

  public void setEmployeePaymentServicesFacilityStatus(String employeePaymentServicesFacilityStatus) {
    this.employeePaymentServicesFacilityStatus = employeePaymentServicesFacilityStatus;
  }

  public EmployeePaymentServicesFacility employeePaymentServicesFacilityAssociatedParty(Object employeePaymentServicesFacilityAssociatedParty) {
    this.employeePaymentServicesFacilityAssociatedParty = employeePaymentServicesFacilityAssociatedParty;
    return this;
  }

  /**
   * Get employeePaymentServicesFacilityAssociatedParty
   * @return employeePaymentServicesFacilityAssociatedParty
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getEmployeePaymentServicesFacilityAssociatedParty() {
    return employeePaymentServicesFacilityAssociatedParty;
  }

  public void setEmployeePaymentServicesFacilityAssociatedParty(Object employeePaymentServicesFacilityAssociatedParty) {
    this.employeePaymentServicesFacilityAssociatedParty = employeePaymentServicesFacilityAssociatedParty;
  }

  public EmployeePaymentServicesFacility employeePaymentServicesFacilityCurrency(String employeePaymentServicesFacilityCurrency) {
    this.employeePaymentServicesFacilityCurrency = employeePaymentServicesFacilityCurrency;
    return this;
  }

  /**
   * Get employeePaymentServicesFacilityCurrency
   * @return employeePaymentServicesFacilityCurrency
  */
  @ApiModelProperty(value = "")


  public String getEmployeePaymentServicesFacilityCurrency() {
    return employeePaymentServicesFacilityCurrency;
  }

  public void setEmployeePaymentServicesFacilityCurrency(String employeePaymentServicesFacilityCurrency) {
    this.employeePaymentServicesFacilityCurrency = employeePaymentServicesFacilityCurrency;
  }

  public EmployeePaymentServicesFacility employeePaymentServicesFacilityRegulationReference(Object employeePaymentServicesFacilityRegulationReference) {
    this.employeePaymentServicesFacilityRegulationReference = employeePaymentServicesFacilityRegulationReference;
    return this;
  }

  /**
   * Get employeePaymentServicesFacilityRegulationReference
   * @return employeePaymentServicesFacilityRegulationReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getEmployeePaymentServicesFacilityRegulationReference() {
    return employeePaymentServicesFacilityRegulationReference;
  }

  public void setEmployeePaymentServicesFacilityRegulationReference(Object employeePaymentServicesFacilityRegulationReference) {
    this.employeePaymentServicesFacilityRegulationReference = employeePaymentServicesFacilityRegulationReference;
  }

  public EmployeePaymentServicesFacility employeePaymentServicesFacilityRegulationType(String employeePaymentServicesFacilityRegulationType) {
    this.employeePaymentServicesFacilityRegulationType = employeePaymentServicesFacilityRegulationType;
    return this;
  }

  /**
   * Get employeePaymentServicesFacilityRegulationType
   * @return employeePaymentServicesFacilityRegulationType
  */
  @ApiModelProperty(value = "")


  public String getEmployeePaymentServicesFacilityRegulationType() {
    return employeePaymentServicesFacilityRegulationType;
  }

  public void setEmployeePaymentServicesFacilityRegulationType(String employeePaymentServicesFacilityRegulationType) {
    this.employeePaymentServicesFacilityRegulationType = employeePaymentServicesFacilityRegulationType;
  }

  public EmployeePaymentServicesFacility employeePaymentServicesFacilityJurisdiction(Object employeePaymentServicesFacilityJurisdiction) {
    this.employeePaymentServicesFacilityJurisdiction = employeePaymentServicesFacilityJurisdiction;
    return this;
  }

  /**
   * Get employeePaymentServicesFacilityJurisdiction
   * @return employeePaymentServicesFacilityJurisdiction
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getEmployeePaymentServicesFacilityJurisdiction() {
    return employeePaymentServicesFacilityJurisdiction;
  }

  public void setEmployeePaymentServicesFacilityJurisdiction(Object employeePaymentServicesFacilityJurisdiction) {
    this.employeePaymentServicesFacilityJurisdiction = employeePaymentServicesFacilityJurisdiction;
  }

  public EmployeePaymentServicesFacility employeePaymentServicesFacilityBookingLocation(Object employeePaymentServicesFacilityBookingLocation) {
    this.employeePaymentServicesFacilityBookingLocation = employeePaymentServicesFacilityBookingLocation;
    return this;
  }

  /**
   * Get employeePaymentServicesFacilityBookingLocation
   * @return employeePaymentServicesFacilityBookingLocation
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getEmployeePaymentServicesFacilityBookingLocation() {
    return employeePaymentServicesFacilityBookingLocation;
  }

  public void setEmployeePaymentServicesFacilityBookingLocation(Object employeePaymentServicesFacilityBookingLocation) {
    this.employeePaymentServicesFacilityBookingLocation = employeePaymentServicesFacilityBookingLocation;
  }

  public EmployeePaymentServicesFacility employeePaymentServicesFacilityAccountType(String employeePaymentServicesFacilityAccountType) {
    this.employeePaymentServicesFacilityAccountType = employeePaymentServicesFacilityAccountType;
    return this;
  }

  /**
   * Get employeePaymentServicesFacilityAccountType
   * @return employeePaymentServicesFacilityAccountType
  */
  @ApiModelProperty(value = "")


  public String getEmployeePaymentServicesFacilityAccountType() {
    return employeePaymentServicesFacilityAccountType;
  }

  public void setEmployeePaymentServicesFacilityAccountType(String employeePaymentServicesFacilityAccountType) {
    this.employeePaymentServicesFacilityAccountType = employeePaymentServicesFacilityAccountType;
  }

  public EmployeePaymentServicesFacility employeePaymentServicesFacilityAccountReference(String employeePaymentServicesFacilityAccountReference) {
    this.employeePaymentServicesFacilityAccountReference = employeePaymentServicesFacilityAccountReference;
    return this;
  }

  /**
   * Get employeePaymentServicesFacilityAccountReference
   * @return employeePaymentServicesFacilityAccountReference
  */
  @ApiModelProperty(value = "")


  public String getEmployeePaymentServicesFacilityAccountReference() {
    return employeePaymentServicesFacilityAccountReference;
  }

  public void setEmployeePaymentServicesFacilityAccountReference(String employeePaymentServicesFacilityAccountReference) {
    this.employeePaymentServicesFacilityAccountReference = employeePaymentServicesFacilityAccountReference;
  }

  public EmployeePaymentServicesFacility employeePaymentServicesFacilityCustomerReference(Object employeePaymentServicesFacilityCustomerReference) {
    this.employeePaymentServicesFacilityCustomerReference = employeePaymentServicesFacilityCustomerReference;
    return this;
  }

  /**
   * Get employeePaymentServicesFacilityCustomerReference
   * @return employeePaymentServicesFacilityCustomerReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getEmployeePaymentServicesFacilityCustomerReference() {
    return employeePaymentServicesFacilityCustomerReference;
  }

  public void setEmployeePaymentServicesFacilityCustomerReference(Object employeePaymentServicesFacilityCustomerReference) {
    this.employeePaymentServicesFacilityCustomerReference = employeePaymentServicesFacilityCustomerReference;
  }

  public EmployeePaymentServicesFacility employeePaymentServicesFacilityPosition(String employeePaymentServicesFacilityPosition) {
    this.employeePaymentServicesFacilityPosition = employeePaymentServicesFacilityPosition;
    return this;
  }

  /**
   * Get employeePaymentServicesFacilityPosition
   * @return employeePaymentServicesFacilityPosition
  */
  @ApiModelProperty(value = "")


  public String getEmployeePaymentServicesFacilityPosition() {
    return employeePaymentServicesFacilityPosition;
  }

  public void setEmployeePaymentServicesFacilityPosition(String employeePaymentServicesFacilityPosition) {
    this.employeePaymentServicesFacilityPosition = employeePaymentServicesFacilityPosition;
  }

  public EmployeePaymentServicesFacility employeePaymentServicesFacilityProductReference(Object employeePaymentServicesFacilityProductReference) {
    this.employeePaymentServicesFacilityProductReference = employeePaymentServicesFacilityProductReference;
    return this;
  }

  /**
   * Get employeePaymentServicesFacilityProductReference
   * @return employeePaymentServicesFacilityProductReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getEmployeePaymentServicesFacilityProductReference() {
    return employeePaymentServicesFacilityProductReference;
  }

  public void setEmployeePaymentServicesFacilityProductReference(Object employeePaymentServicesFacilityProductReference) {
    this.employeePaymentServicesFacilityProductReference = employeePaymentServicesFacilityProductReference;
  }

  public EmployeePaymentServicesFacility employeePaymentServicesFacilityPositionLimit(String employeePaymentServicesFacilityPositionLimit) {
    this.employeePaymentServicesFacilityPositionLimit = employeePaymentServicesFacilityPositionLimit;
    return this;
  }

  /**
   * Get employeePaymentServicesFacilityPositionLimit
   * @return employeePaymentServicesFacilityPositionLimit
  */
  @ApiModelProperty(value = "")


  public String getEmployeePaymentServicesFacilityPositionLimit() {
    return employeePaymentServicesFacilityPositionLimit;
  }

  public void setEmployeePaymentServicesFacilityPositionLimit(String employeePaymentServicesFacilityPositionLimit) {
    this.employeePaymentServicesFacilityPositionLimit = employeePaymentServicesFacilityPositionLimit;
  }

  public EmployeePaymentServicesFacility employeePaymentServicesFacilityReference(String employeePaymentServicesFacilityReference) {
    this.employeePaymentServicesFacilityReference = employeePaymentServicesFacilityReference;
    return this;
  }

  /**
   * Get employeePaymentServicesFacilityReference
   * @return employeePaymentServicesFacilityReference
  */
  @ApiModelProperty(value = "")


  public String getEmployeePaymentServicesFacilityReference() {
    return employeePaymentServicesFacilityReference;
  }

  public void setEmployeePaymentServicesFacilityReference(String employeePaymentServicesFacilityReference) {
    this.employeePaymentServicesFacilityReference = employeePaymentServicesFacilityReference;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployeePaymentServicesFacility employeePaymentServicesFacility = (EmployeePaymentServicesFacility) o;
    return Objects.equals(this.employeePaymentServicesFacilityParameterType, employeePaymentServicesFacility.employeePaymentServicesFacilityParameterType) &&
        Objects.equals(this.employeePaymentServicesFacilitySelectedOption, employeePaymentServicesFacility.employeePaymentServicesFacilitySelectedOption) &&
        Objects.equals(this.employeePaymentServicesFacilityType, employeePaymentServicesFacility.employeePaymentServicesFacilityType) &&
        Objects.equals(this.employeePaymentServicesFacilityCalendarReference, employeePaymentServicesFacility.employeePaymentServicesFacilityCalendarReference) &&
        Objects.equals(this.employeePaymentServicesFacilityStatus, employeePaymentServicesFacility.employeePaymentServicesFacilityStatus) &&
        Objects.equals(this.employeePaymentServicesFacilityAssociatedParty, employeePaymentServicesFacility.employeePaymentServicesFacilityAssociatedParty) &&
        Objects.equals(this.employeePaymentServicesFacilityCurrency, employeePaymentServicesFacility.employeePaymentServicesFacilityCurrency) &&
        Objects.equals(this.employeePaymentServicesFacilityRegulationReference, employeePaymentServicesFacility.employeePaymentServicesFacilityRegulationReference) &&
        Objects.equals(this.employeePaymentServicesFacilityRegulationType, employeePaymentServicesFacility.employeePaymentServicesFacilityRegulationType) &&
        Objects.equals(this.employeePaymentServicesFacilityJurisdiction, employeePaymentServicesFacility.employeePaymentServicesFacilityJurisdiction) &&
        Objects.equals(this.employeePaymentServicesFacilityBookingLocation, employeePaymentServicesFacility.employeePaymentServicesFacilityBookingLocation) &&
        Objects.equals(this.employeePaymentServicesFacilityAccountType, employeePaymentServicesFacility.employeePaymentServicesFacilityAccountType) &&
        Objects.equals(this.employeePaymentServicesFacilityAccountReference, employeePaymentServicesFacility.employeePaymentServicesFacilityAccountReference) &&
        Objects.equals(this.employeePaymentServicesFacilityCustomerReference, employeePaymentServicesFacility.employeePaymentServicesFacilityCustomerReference) &&
        Objects.equals(this.employeePaymentServicesFacilityPosition, employeePaymentServicesFacility.employeePaymentServicesFacilityPosition) &&
        Objects.equals(this.employeePaymentServicesFacilityProductReference, employeePaymentServicesFacility.employeePaymentServicesFacilityProductReference) &&
        Objects.equals(this.employeePaymentServicesFacilityPositionLimit, employeePaymentServicesFacility.employeePaymentServicesFacilityPositionLimit) &&
        Objects.equals(this.employeePaymentServicesFacilityReference, employeePaymentServicesFacility.employeePaymentServicesFacilityReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(employeePaymentServicesFacilityParameterType, employeePaymentServicesFacilitySelectedOption, employeePaymentServicesFacilityType, employeePaymentServicesFacilityCalendarReference, employeePaymentServicesFacilityStatus, employeePaymentServicesFacilityAssociatedParty, employeePaymentServicesFacilityCurrency, employeePaymentServicesFacilityRegulationReference, employeePaymentServicesFacilityRegulationType, employeePaymentServicesFacilityJurisdiction, employeePaymentServicesFacilityBookingLocation, employeePaymentServicesFacilityAccountType, employeePaymentServicesFacilityAccountReference, employeePaymentServicesFacilityCustomerReference, employeePaymentServicesFacilityPosition, employeePaymentServicesFacilityProductReference, employeePaymentServicesFacilityPositionLimit, employeePaymentServicesFacilityReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeePaymentServicesFacility {\n");
    
    sb.append("    employeePaymentServicesFacilityParameterType: ").append(toIndentedString(employeePaymentServicesFacilityParameterType)).append("\n");
    sb.append("    employeePaymentServicesFacilitySelectedOption: ").append(toIndentedString(employeePaymentServicesFacilitySelectedOption)).append("\n");
    sb.append("    employeePaymentServicesFacilityType: ").append(toIndentedString(employeePaymentServicesFacilityType)).append("\n");
    sb.append("    employeePaymentServicesFacilityCalendarReference: ").append(toIndentedString(employeePaymentServicesFacilityCalendarReference)).append("\n");
    sb.append("    employeePaymentServicesFacilityStatus: ").append(toIndentedString(employeePaymentServicesFacilityStatus)).append("\n");
    sb.append("    employeePaymentServicesFacilityAssociatedParty: ").append(toIndentedString(employeePaymentServicesFacilityAssociatedParty)).append("\n");
    sb.append("    employeePaymentServicesFacilityCurrency: ").append(toIndentedString(employeePaymentServicesFacilityCurrency)).append("\n");
    sb.append("    employeePaymentServicesFacilityRegulationReference: ").append(toIndentedString(employeePaymentServicesFacilityRegulationReference)).append("\n");
    sb.append("    employeePaymentServicesFacilityRegulationType: ").append(toIndentedString(employeePaymentServicesFacilityRegulationType)).append("\n");
    sb.append("    employeePaymentServicesFacilityJurisdiction: ").append(toIndentedString(employeePaymentServicesFacilityJurisdiction)).append("\n");
    sb.append("    employeePaymentServicesFacilityBookingLocation: ").append(toIndentedString(employeePaymentServicesFacilityBookingLocation)).append("\n");
    sb.append("    employeePaymentServicesFacilityAccountType: ").append(toIndentedString(employeePaymentServicesFacilityAccountType)).append("\n");
    sb.append("    employeePaymentServicesFacilityAccountReference: ").append(toIndentedString(employeePaymentServicesFacilityAccountReference)).append("\n");
    sb.append("    employeePaymentServicesFacilityCustomerReference: ").append(toIndentedString(employeePaymentServicesFacilityCustomerReference)).append("\n");
    sb.append("    employeePaymentServicesFacilityPosition: ").append(toIndentedString(employeePaymentServicesFacilityPosition)).append("\n");
    sb.append("    employeePaymentServicesFacilityProductReference: ").append(toIndentedString(employeePaymentServicesFacilityProductReference)).append("\n");
    sb.append("    employeePaymentServicesFacilityPositionLimit: ").append(toIndentedString(employeePaymentServicesFacilityPositionLimit)).append("\n");
    sb.append("    employeePaymentServicesFacilityReference: ").append(toIndentedString(employeePaymentServicesFacilityReference)).append("\n");
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

