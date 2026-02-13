package com.example.account_master.area.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * AreaRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-12T23:58:14.789635710+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
public class AreaRequest {

  private String areaName;

  private String stateCode;

  public AreaRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public AreaRequest(String areaName, String stateCode) {
    this.areaName = areaName;
    this.stateCode = stateCode;
  }

  public AreaRequest areaName(String areaName) {
    this.areaName = areaName;
    return this;
  }

  /**
   * Get areaName
   * @return areaName
  */
  @NotNull 
  @Schema(name = "areaName", example = "Kanpur", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("areaName")
  public String getAreaName() {
    return areaName;
  }

  public void setAreaName(String areaName) {
    this.areaName = areaName;
  }

  public AreaRequest stateCode(String stateCode) {
    this.stateCode = stateCode;
    return this;
  }

  /**
   * Get stateCode
   * @return stateCode
  */
  @NotNull 
  @Schema(name = "stateCode", example = "UP", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("stateCode")
  public String getStateCode() {
    return stateCode;
  }

  public void setStateCode(String stateCode) {
    this.stateCode = stateCode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AreaRequest areaRequest = (AreaRequest) o;
    return Objects.equals(this.areaName, areaRequest.areaName) &&
        Objects.equals(this.stateCode, areaRequest.stateCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(areaName, stateCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AreaRequest {\n");
    sb.append("    areaName: ").append(toIndentedString(areaName)).append("\n");
    sb.append("    stateCode: ").append(toIndentedString(stateCode)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

