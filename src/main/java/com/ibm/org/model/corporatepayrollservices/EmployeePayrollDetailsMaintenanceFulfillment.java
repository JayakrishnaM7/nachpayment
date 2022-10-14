package com.ibm.org.model.corporatepayrollservices;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EmployeePayrollDetailsMaintenanceFulfillment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:38:01.096Z[GMT]")

public class EmployeePayrollDetailsMaintenanceFulfillment   {
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

  @JsonProperty("EmployeePayrollDetailsMaintenanceFulfillmentReference")
  private Object employeePayrollDetailsMaintenanceFulfillmentReference;

  @JsonProperty("EmployeePayrollDetailsMaintenanceFulfillmentType")
  private String employeePayrollDetailsMaintenanceFulfillmentType;

  public EmployeePayrollDetailsMaintenanceFulfillment preconditions(Object preconditions) {
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

  public EmployeePayrollDetailsMaintenanceFulfillment schedule(Object schedule) {
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

  public EmployeePayrollDetailsMaintenanceFulfillment businessService(Object businessService) {
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

  public EmployeePayrollDetailsMaintenanceFulfillment postconditions(Object postconditions) {
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

  public EmployeePayrollDetailsMaintenanceFulfillment employeePaymentServicesFacilityReference(String employeePaymentServicesFacilityReference) {
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

  public EmployeePayrollDetailsMaintenanceFulfillment employeePayrollDetailsMaintenanceFulfillmentReference(Object employeePayrollDetailsMaintenanceFulfillmentReference) {
    this.employeePayrollDetailsMaintenanceFulfillmentReference = employeePayrollDetailsMaintenanceFulfillmentReference;
    return this;
  }

  /**
   * Get employeePayrollDetailsMaintenanceFulfillmentReference
   * @return employeePayrollDetailsMaintenanceFulfillmentReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getEmployeePayrollDetailsMaintenanceFulfillmentReference() {
    return employeePayrollDetailsMaintenanceFulfillmentReference;
  }

  public void setEmployeePayrollDetailsMaintenanceFulfillmentReference(Object employeePayrollDetailsMaintenanceFulfillmentReference) {
    this.employeePayrollDetailsMaintenanceFulfillmentReference = employeePayrollDetailsMaintenanceFulfillmentReference;
  }

  public EmployeePayrollDetailsMaintenanceFulfillment employeePayrollDetailsMaintenanceFulfillmentType(String employeePayrollDetailsMaintenanceFulfillmentType) {
    this.employeePayrollDetailsMaintenanceFulfillmentType = employeePayrollDetailsMaintenanceFulfillmentType;
    return this;
  }

  /**
   * Get employeePayrollDetailsMaintenanceFulfillmentType
   * @return employeePayrollDetailsMaintenanceFulfillmentType
  */
  @ApiModelProperty(value = "")


  public String getEmployeePayrollDetailsMaintenanceFulfillmentType() {
    return employeePayrollDetailsMaintenanceFulfillmentType;
  }

  public void setEmployeePayrollDetailsMaintenanceFulfillmentType(String employeePayrollDetailsMaintenanceFulfillmentType) {
    this.employeePayrollDetailsMaintenanceFulfillmentType = employeePayrollDetailsMaintenanceFulfillmentType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EmployeePayrollDetailsMaintenanceFulfillment employeePayrollDetailsMaintenanceFulfillment = (EmployeePayrollDetailsMaintenanceFulfillment) o;
    return Objects.equals(this.preconditions, employeePayrollDetailsMaintenanceFulfillment.preconditions) &&
        Objects.equals(this.schedule, employeePayrollDetailsMaintenanceFulfillment.schedule) &&
        Objects.equals(this.businessService, employeePayrollDetailsMaintenanceFulfillment.businessService) &&
        Objects.equals(this.postconditions, employeePayrollDetailsMaintenanceFulfillment.postconditions) &&
        Objects.equals(this.employeePaymentServicesFacilityReference, employeePayrollDetailsMaintenanceFulfillment.employeePaymentServicesFacilityReference) &&
        Objects.equals(this.employeePayrollDetailsMaintenanceFulfillmentReference, employeePayrollDetailsMaintenanceFulfillment.employeePayrollDetailsMaintenanceFulfillmentReference) &&
        Objects.equals(this.employeePayrollDetailsMaintenanceFulfillmentType, employeePayrollDetailsMaintenanceFulfillment.employeePayrollDetailsMaintenanceFulfillmentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(preconditions, schedule, businessService, postconditions, employeePaymentServicesFacilityReference, employeePayrollDetailsMaintenanceFulfillmentReference, employeePayrollDetailsMaintenanceFulfillmentType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EmployeePayrollDetailsMaintenanceFulfillment {\n");
    
    sb.append("    preconditions: ").append(toIndentedString(preconditions)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    businessService: ").append(toIndentedString(businessService)).append("\n");
    sb.append("    postconditions: ").append(toIndentedString(postconditions)).append("\n");
    sb.append("    employeePaymentServicesFacilityReference: ").append(toIndentedString(employeePaymentServicesFacilityReference)).append("\n");
    sb.append("    employeePayrollDetailsMaintenanceFulfillmentReference: ").append(toIndentedString(employeePayrollDetailsMaintenanceFulfillmentReference)).append("\n");
    sb.append("    employeePayrollDetailsMaintenanceFulfillmentType: ").append(toIndentedString(employeePayrollDetailsMaintenanceFulfillmentType)).append("\n");
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

