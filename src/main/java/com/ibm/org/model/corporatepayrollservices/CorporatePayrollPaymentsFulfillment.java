package com.ibm.org.model.corporatepayrollservices;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CorporatePayrollPaymentsFulfillment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:38:01.096Z[GMT]")

public class CorporatePayrollPaymentsFulfillment   {
  @JsonProperty("Preconditions")
  private Object preconditions;

  @JsonProperty("Schedule")
  private Object schedule;

  @JsonProperty("BusinessService")
  private Object businessService;

  @JsonProperty("Postconditions")
  private Object postconditions;

  @JsonProperty("EmployeePaymentServicesFacilityReference")
  private String employeePaymentServicesFacilityReference;

  @JsonProperty("CorporatePayrollPaymentsFulfillmentReference")
  private Object corporatePayrollPaymentsFulfillmentReference;

  @JsonProperty("CorporatePayrollPaymentsFulfillmentType")
  private String corporatePayrollPaymentsFulfillmentType;

  public CorporatePayrollPaymentsFulfillment preconditions(Object preconditions) {
    this.preconditions = preconditions;
    return this;
  }

  /**
   * Get preconditions
   * @return preconditions
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getPreconditions() {
    return preconditions;
  }

  public void setPreconditions(Object preconditions) {
    this.preconditions = preconditions;
  }

  public CorporatePayrollPaymentsFulfillment schedule(Object schedule) {
    this.schedule = schedule;
    return this;
  }

  /**
   * Get schedule
   * @return schedule
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getSchedule() {
    return schedule;
  }

  public void setSchedule(Object schedule) {
    this.schedule = schedule;
  }

  public CorporatePayrollPaymentsFulfillment businessService(Object businessService) {
    this.businessService = businessService;
    return this;
  }

  /**
   * Get businessService
   * @return businessService
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getBusinessService() {
    return businessService;
  }

  public void setBusinessService(Object businessService) {
    this.businessService = businessService;
  }

  public CorporatePayrollPaymentsFulfillment postconditions(Object postconditions) {
    this.postconditions = postconditions;
    return this;
  }

  /**
   * Get postconditions
   * @return postconditions
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getPostconditions() {
    return postconditions;
  }

  public void setPostconditions(Object postconditions) {
    this.postconditions = postconditions;
  }

  public CorporatePayrollPaymentsFulfillment employeePaymentServicesFacilityReference(String employeePaymentServicesFacilityReference) {
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

  public CorporatePayrollPaymentsFulfillment corporatePayrollPaymentsFulfillmentReference(Object corporatePayrollPaymentsFulfillmentReference) {
    this.corporatePayrollPaymentsFulfillmentReference = corporatePayrollPaymentsFulfillmentReference;
    return this;
  }

  /**
   * Get corporatePayrollPaymentsFulfillmentReference
   * @return corporatePayrollPaymentsFulfillmentReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getCorporatePayrollPaymentsFulfillmentReference() {
    return corporatePayrollPaymentsFulfillmentReference;
  }

  public void setCorporatePayrollPaymentsFulfillmentReference(Object corporatePayrollPaymentsFulfillmentReference) {
    this.corporatePayrollPaymentsFulfillmentReference = corporatePayrollPaymentsFulfillmentReference;
  }

  public CorporatePayrollPaymentsFulfillment corporatePayrollPaymentsFulfillmentType(String corporatePayrollPaymentsFulfillmentType) {
    this.corporatePayrollPaymentsFulfillmentType = corporatePayrollPaymentsFulfillmentType;
    return this;
  }

  /**
   * Get corporatePayrollPaymentsFulfillmentType
   * @return corporatePayrollPaymentsFulfillmentType
  */
  @ApiModelProperty(value = "")


  public String getCorporatePayrollPaymentsFulfillmentType() {
    return corporatePayrollPaymentsFulfillmentType;
  }

  public void setCorporatePayrollPaymentsFulfillmentType(String corporatePayrollPaymentsFulfillmentType) {
    this.corporatePayrollPaymentsFulfillmentType = corporatePayrollPaymentsFulfillmentType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CorporatePayrollPaymentsFulfillment corporatePayrollPaymentsFulfillment = (CorporatePayrollPaymentsFulfillment) o;
    return Objects.equals(this.preconditions, corporatePayrollPaymentsFulfillment.preconditions) &&
        Objects.equals(this.schedule, corporatePayrollPaymentsFulfillment.schedule) &&
        Objects.equals(this.businessService, corporatePayrollPaymentsFulfillment.businessService) &&
        Objects.equals(this.postconditions, corporatePayrollPaymentsFulfillment.postconditions) &&
        Objects.equals(this.employeePaymentServicesFacilityReference, corporatePayrollPaymentsFulfillment.employeePaymentServicesFacilityReference) &&
        Objects.equals(this.corporatePayrollPaymentsFulfillmentReference, corporatePayrollPaymentsFulfillment.corporatePayrollPaymentsFulfillmentReference) &&
        Objects.equals(this.corporatePayrollPaymentsFulfillmentType, corporatePayrollPaymentsFulfillment.corporatePayrollPaymentsFulfillmentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(preconditions, schedule, businessService, postconditions, employeePaymentServicesFacilityReference, corporatePayrollPaymentsFulfillmentReference, corporatePayrollPaymentsFulfillmentType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CorporatePayrollPaymentsFulfillment {\n");
    
    sb.append("    preconditions: ").append(toIndentedString(preconditions)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    businessService: ").append(toIndentedString(businessService)).append("\n");
    sb.append("    postconditions: ").append(toIndentedString(postconditions)).append("\n");
    sb.append("    employeePaymentServicesFacilityReference: ").append(toIndentedString(employeePaymentServicesFacilityReference)).append("\n");
    sb.append("    corporatePayrollPaymentsFulfillmentReference: ").append(toIndentedString(corporatePayrollPaymentsFulfillmentReference)).append("\n");
    sb.append("    corporatePayrollPaymentsFulfillmentType: ").append(toIndentedString(corporatePayrollPaymentsFulfillmentType)).append("\n");
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

