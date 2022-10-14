package com.ibm.org.model.corporatepayrollservices;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ProductionServiceReportingFulfillment
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:38:01.096Z[GMT]")

public class ProductionServiceReportingFulfillment   {
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

  @JsonProperty("ProductionServiceReportingFulfillmentReference")
  private Object productionServiceReportingFulfillmentReference;

  @JsonProperty("ProductionServiceReportingFulfillmentType")
  private String productionServiceReportingFulfillmentType;

  public ProductionServiceReportingFulfillment preconditions(Object preconditions) {
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

  public ProductionServiceReportingFulfillment schedule(Object schedule) {
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

  public ProductionServiceReportingFulfillment businessService(Object businessService) {
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

  public ProductionServiceReportingFulfillment postconditions(Object postconditions) {
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

  public ProductionServiceReportingFulfillment employeePaymentServicesFacilityReference(String employeePaymentServicesFacilityReference) {
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

  public ProductionServiceReportingFulfillment productionServiceReportingFulfillmentReference(Object productionServiceReportingFulfillmentReference) {
    this.productionServiceReportingFulfillmentReference = productionServiceReportingFulfillmentReference;
    return this;
  }

  /**
   * Get productionServiceReportingFulfillmentReference
   * @return productionServiceReportingFulfillmentReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getProductionServiceReportingFulfillmentReference() {
    return productionServiceReportingFulfillmentReference;
  }

  public void setProductionServiceReportingFulfillmentReference(Object productionServiceReportingFulfillmentReference) {
    this.productionServiceReportingFulfillmentReference = productionServiceReportingFulfillmentReference;
  }

  public ProductionServiceReportingFulfillment productionServiceReportingFulfillmentType(String productionServiceReportingFulfillmentType) {
    this.productionServiceReportingFulfillmentType = productionServiceReportingFulfillmentType;
    return this;
  }

  /**
   * Get productionServiceReportingFulfillmentType
   * @return productionServiceReportingFulfillmentType
  */
  @ApiModelProperty(value = "")


  public String getProductionServiceReportingFulfillmentType() {
    return productionServiceReportingFulfillmentType;
  }

  public void setProductionServiceReportingFulfillmentType(String productionServiceReportingFulfillmentType) {
    this.productionServiceReportingFulfillmentType = productionServiceReportingFulfillmentType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductionServiceReportingFulfillment productionServiceReportingFulfillment = (ProductionServiceReportingFulfillment) o;
    return Objects.equals(this.preconditions, productionServiceReportingFulfillment.preconditions) &&
        Objects.equals(this.schedule, productionServiceReportingFulfillment.schedule) &&
        Objects.equals(this.businessService, productionServiceReportingFulfillment.businessService) &&
        Objects.equals(this.postconditions, productionServiceReportingFulfillment.postconditions) &&
        Objects.equals(this.employeePaymentServicesFacilityReference, productionServiceReportingFulfillment.employeePaymentServicesFacilityReference) &&
        Objects.equals(this.productionServiceReportingFulfillmentReference, productionServiceReportingFulfillment.productionServiceReportingFulfillmentReference) &&
        Objects.equals(this.productionServiceReportingFulfillmentType, productionServiceReportingFulfillment.productionServiceReportingFulfillmentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(preconditions, schedule, businessService, postconditions, employeePaymentServicesFacilityReference, productionServiceReportingFulfillmentReference, productionServiceReportingFulfillmentType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductionServiceReportingFulfillment {\n");
    
    sb.append("    preconditions: ").append(toIndentedString(preconditions)).append("\n");
    sb.append("    schedule: ").append(toIndentedString(schedule)).append("\n");
    sb.append("    businessService: ").append(toIndentedString(businessService)).append("\n");
    sb.append("    postconditions: ").append(toIndentedString(postconditions)).append("\n");
    sb.append("    employeePaymentServicesFacilityReference: ").append(toIndentedString(employeePaymentServicesFacilityReference)).append("\n");
    sb.append("    productionServiceReportingFulfillmentReference: ").append(toIndentedString(productionServiceReportingFulfillmentReference)).append("\n");
    sb.append("    productionServiceReportingFulfillmentType: ").append(toIndentedString(productionServiceReportingFulfillmentType)).append("\n");
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

