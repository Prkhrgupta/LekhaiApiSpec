package com.example.account_master.area.dto;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * AreaResponse
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-02-12T23:58:14.789635710+05:30[Asia/Kolkata]", comments = "Generator version: 7.4.0")
public class AreaResponse {

  private Long id;

  private String areaName;

  private String stateCode;

  private Integer shopCode;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private OffsetDateTime createdAt;

  public AreaResponse id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public AreaResponse areaName(String areaName) {
    this.areaName = areaName;
    return this;
  }

  /**
   * Get areaName
   * @return areaName
  */
  
  @Schema(name = "areaName", example = "Kanpur", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("areaName")
  public String getAreaName() {
    return areaName;
  }

  public void setAreaName(String areaName) {
    this.areaName = areaName;
  }

  public AreaResponse stateCode(String stateCode) {
    this.stateCode = stateCode;
    return this;
  }

  /**
   * Get stateCode
   * @return stateCode
  */
  
  @Schema(name = "stateCode", example = "UP", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("stateCode")
  public String getStateCode() {
    return stateCode;
  }

  public void setStateCode(String stateCode) {
    this.stateCode = stateCode;
  }

  public AreaResponse shopCode(Integer shopCode) {
    this.shopCode = shopCode;
    return this;
  }

  /**
   * Get shopCode
   * @return shopCode
  */
  
  @Schema(name = "shopCode", example = "1234", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("shopCode")
  public Integer getShopCode() {
    return shopCode;
  }

  public void setShopCode(Integer shopCode) {
    this.shopCode = shopCode;
  }

  public AreaResponse createdAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Get createdAt
   * @return createdAt
  */
  @Valid 
  @Schema(name = "createdAt", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("createdAt")
  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AreaResponse areaResponse = (AreaResponse) o;
    return Objects.equals(this.id, areaResponse.id) &&
        Objects.equals(this.areaName, areaResponse.areaName) &&
        Objects.equals(this.stateCode, areaResponse.stateCode) &&
        Objects.equals(this.shopCode, areaResponse.shopCode) &&
        Objects.equals(this.createdAt, areaResponse.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, areaName, stateCode, shopCode, createdAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AreaResponse {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    areaName: ").append(toIndentedString(areaName)).append("\n");
    sb.append("    stateCode: ").append(toIndentedString(stateCode)).append("\n");
    sb.append("    shopCode: ").append(toIndentedString(shopCode)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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

