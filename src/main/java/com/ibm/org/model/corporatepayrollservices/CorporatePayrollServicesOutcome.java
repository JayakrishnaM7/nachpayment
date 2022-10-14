package com.ibm.org.model.corporatepayrollservices;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CorporatePayrollServicesOutcome
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:38:01.096Z[GMT]")

public class CorporatePayrollServicesOutcome   {
  @JsonProperty("CorporatePayrollServicesFinancialFacility")
  private String corporatePayrollServicesFinancialFacility;

  @JsonProperty("CorporatePayrollServicesWorkProduct")
  private Object corporatePayrollServicesWorkProduct;

  public CorporatePayrollServicesOutcome corporatePayrollServicesFinancialFacility(String corporatePayrollServicesFinancialFacility) {
    this.corporatePayrollServicesFinancialFacility = corporatePayrollServicesFinancialFacility;
    return this;
  }

  /**
   * Get corporatePayrollServicesFinancialFacility
   * @return corporatePayrollServicesFinancialFacility
  */
  @ApiModelProperty(value = "")


  public String getCorporatePayrollServicesFinancialFacility() {
    return corporatePayrollServicesFinancialFacility;
  }

  public void setCorporatePayrollServicesFinancialFacility(String corporatePayrollServicesFinancialFacility) {
    this.corporatePayrollServicesFinancialFacility = corporatePayrollServicesFinancialFacility;
  }

  public CorporatePayrollServicesOutcome corporatePayrollServicesWorkProduct(Object corporatePayrollServicesWorkProduct) {
    this.corporatePayrollServicesWorkProduct = corporatePayrollServicesWorkProduct;
    return this;
  }

  /**
   * Get corporatePayrollServicesWorkProduct
   * @return corporatePayrollServicesWorkProduct
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getCorporatePayrollServicesWorkProduct() {
    return corporatePayrollServicesWorkProduct;
  }

  public void setCorporatePayrollServicesWorkProduct(Object corporatePayrollServicesWorkProduct) {
    this.corporatePayrollServicesWorkProduct = corporatePayrollServicesWorkProduct;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CorporatePayrollServicesOutcome corporatePayrollServicesOutcome = (CorporatePayrollServicesOutcome) o;
    return Objects.equals(this.corporatePayrollServicesFinancialFacility, corporatePayrollServicesOutcome.corporatePayrollServicesFinancialFacility) &&
        Objects.equals(this.corporatePayrollServicesWorkProduct, corporatePayrollServicesOutcome.corporatePayrollServicesWorkProduct);
  }

  @Override
  public int hashCode() {
    return Objects.hash(corporatePayrollServicesFinancialFacility, corporatePayrollServicesWorkProduct);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CorporatePayrollServicesOutcome {\n");
    
    sb.append("    corporatePayrollServicesFinancialFacility: ").append(toIndentedString(corporatePayrollServicesFinancialFacility)).append("\n");
    sb.append("    corporatePayrollServicesWorkProduct: ").append(toIndentedString(corporatePayrollServicesWorkProduct)).append("\n");
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

