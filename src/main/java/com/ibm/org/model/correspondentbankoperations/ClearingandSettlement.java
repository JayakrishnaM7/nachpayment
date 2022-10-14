package com.ibm.org.model.correspondentbankoperations;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ClearingandSettlement
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2022-10-14T11:37:36.394Z[GMT]")

public class ClearingandSettlement   {
  @JsonProperty("CorrespondentBankClearingArrangementReference")
  private Object correspondentBankClearingArrangementReference;

  @JsonProperty("CorrespondentBankClearingArrangementClearingInstructions")
  private String correspondentBankClearingArrangementClearingInstructions;

  @JsonProperty("CorrespondentBankClearingArrangementSettlementInstructions")
  private String correspondentBankClearingArrangementSettlementInstructions;

  @JsonProperty("MirrorNostroAccountReference")
  private Object mirrorNostroAccountReference;

  @JsonProperty("ClearingTransaction")
  private String clearingTransaction;

  @JsonProperty("SettlementTransaction")
  private String settlementTransaction;

  public ClearingandSettlement correspondentBankClearingArrangementReference(Object correspondentBankClearingArrangementReference) {
    this.correspondentBankClearingArrangementReference = correspondentBankClearingArrangementReference;
    return this;
  }

  /**
   * Get correspondentBankClearingArrangementReference
   * @return correspondentBankClearingArrangementReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getCorrespondentBankClearingArrangementReference() {
    return correspondentBankClearingArrangementReference;
  }

  public void setCorrespondentBankClearingArrangementReference(Object correspondentBankClearingArrangementReference) {
    this.correspondentBankClearingArrangementReference = correspondentBankClearingArrangementReference;
  }

  public ClearingandSettlement correspondentBankClearingArrangementClearingInstructions(String correspondentBankClearingArrangementClearingInstructions) {
    this.correspondentBankClearingArrangementClearingInstructions = correspondentBankClearingArrangementClearingInstructions;
    return this;
  }

  /**
   * Get correspondentBankClearingArrangementClearingInstructions
   * @return correspondentBankClearingArrangementClearingInstructions
  */
  @ApiModelProperty(value = "")


  public String getCorrespondentBankClearingArrangementClearingInstructions() {
    return correspondentBankClearingArrangementClearingInstructions;
  }

  public void setCorrespondentBankClearingArrangementClearingInstructions(String correspondentBankClearingArrangementClearingInstructions) {
    this.correspondentBankClearingArrangementClearingInstructions = correspondentBankClearingArrangementClearingInstructions;
  }

  public ClearingandSettlement correspondentBankClearingArrangementSettlementInstructions(String correspondentBankClearingArrangementSettlementInstructions) {
    this.correspondentBankClearingArrangementSettlementInstructions = correspondentBankClearingArrangementSettlementInstructions;
    return this;
  }

  /**
   * Get correspondentBankClearingArrangementSettlementInstructions
   * @return correspondentBankClearingArrangementSettlementInstructions
  */
  @ApiModelProperty(value = "")


  public String getCorrespondentBankClearingArrangementSettlementInstructions() {
    return correspondentBankClearingArrangementSettlementInstructions;
  }

  public void setCorrespondentBankClearingArrangementSettlementInstructions(String correspondentBankClearingArrangementSettlementInstructions) {
    this.correspondentBankClearingArrangementSettlementInstructions = correspondentBankClearingArrangementSettlementInstructions;
  }

  public ClearingandSettlement mirrorNostroAccountReference(Object mirrorNostroAccountReference) {
    this.mirrorNostroAccountReference = mirrorNostroAccountReference;
    return this;
  }

  /**
   * Get mirrorNostroAccountReference
   * @return mirrorNostroAccountReference
  */
  @ApiModelProperty(value = "")

  @Valid

  public Object getMirrorNostroAccountReference() {
    return mirrorNostroAccountReference;
  }

  public void setMirrorNostroAccountReference(Object mirrorNostroAccountReference) {
    this.mirrorNostroAccountReference = mirrorNostroAccountReference;
  }

  public ClearingandSettlement clearingTransaction(String clearingTransaction) {
    this.clearingTransaction = clearingTransaction;
    return this;
  }

  /**
   * Get clearingTransaction
   * @return clearingTransaction
  */
  @ApiModelProperty(value = "")


  public String getClearingTransaction() {
    return clearingTransaction;
  }

  public void setClearingTransaction(String clearingTransaction) {
    this.clearingTransaction = clearingTransaction;
  }

  public ClearingandSettlement settlementTransaction(String settlementTransaction) {
    this.settlementTransaction = settlementTransaction;
    return this;
  }

  /**
   * Get settlementTransaction
   * @return settlementTransaction
  */
  @ApiModelProperty(value = "")


  public String getSettlementTransaction() {
    return settlementTransaction;
  }

  public void setSettlementTransaction(String settlementTransaction) {
    this.settlementTransaction = settlementTransaction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClearingandSettlement clearingandSettlement = (ClearingandSettlement) o;
    return Objects.equals(this.correspondentBankClearingArrangementReference, clearingandSettlement.correspondentBankClearingArrangementReference) &&
        Objects.equals(this.correspondentBankClearingArrangementClearingInstructions, clearingandSettlement.correspondentBankClearingArrangementClearingInstructions) &&
        Objects.equals(this.correspondentBankClearingArrangementSettlementInstructions, clearingandSettlement.correspondentBankClearingArrangementSettlementInstructions) &&
        Objects.equals(this.mirrorNostroAccountReference, clearingandSettlement.mirrorNostroAccountReference) &&
        Objects.equals(this.clearingTransaction, clearingandSettlement.clearingTransaction) &&
        Objects.equals(this.settlementTransaction, clearingandSettlement.settlementTransaction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(correspondentBankClearingArrangementReference, correspondentBankClearingArrangementClearingInstructions, correspondentBankClearingArrangementSettlementInstructions, mirrorNostroAccountReference, clearingTransaction, settlementTransaction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClearingandSettlement {\n");
    
    sb.append("    correspondentBankClearingArrangementReference: ").append(toIndentedString(correspondentBankClearingArrangementReference)).append("\n");
    sb.append("    correspondentBankClearingArrangementClearingInstructions: ").append(toIndentedString(correspondentBankClearingArrangementClearingInstructions)).append("\n");
    sb.append("    correspondentBankClearingArrangementSettlementInstructions: ").append(toIndentedString(correspondentBankClearingArrangementSettlementInstructions)).append("\n");
    sb.append("    mirrorNostroAccountReference: ").append(toIndentedString(mirrorNostroAccountReference)).append("\n");
    sb.append("    clearingTransaction: ").append(toIndentedString(clearingTransaction)).append("\n");
    sb.append("    settlementTransaction: ").append(toIndentedString(settlementTransaction)).append("\n");
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

