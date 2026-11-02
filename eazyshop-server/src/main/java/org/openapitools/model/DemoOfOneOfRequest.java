package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.model.Address;
import org.openapitools.model.DemoOfOneOfRequestProducts;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * DemoOfOneOfRequest
 */

@JsonTypeName("demoOfOneOf_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-02T14:53:37.611695398Z[Etc/UTC]", comments = "Generator version: 7.28.0-SNAPSHOT")
public class DemoOfOneOfRequest {

  private DemoOfOneOfRequestProducts products;

  private Address address;

  public DemoOfOneOfRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public DemoOfOneOfRequest(DemoOfOneOfRequestProducts products, Address address) {
    this.products = products;
    this.address = address;
  }

  public DemoOfOneOfRequest products(DemoOfOneOfRequestProducts products) {
    this.products = products;
    return this;
  }

  /**
   * Get products
   * @return products
   */
  @NotNull @Valid 
  @Schema(name = "products", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("products")
  public DemoOfOneOfRequestProducts getProducts() {
    return products;
  }

  @JsonProperty("products")
  public void setProducts(DemoOfOneOfRequestProducts products) {
    this.products = products;
  }

  public DemoOfOneOfRequest address(Address address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
   */
  @NotNull @Valid 
  @Schema(name = "address", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("address")
  public Address getAddress() {
    return address;
  }

  @JsonProperty("address")
  public void setAddress(Address address) {
    this.address = address;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DemoOfOneOfRequest demoOfOneOfRequest = (DemoOfOneOfRequest) o;
    return Objects.equals(this.products, demoOfOneOfRequest.products) &&
        Objects.equals(this.address, demoOfOneOfRequest.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(products, address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DemoOfOneOfRequest {\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(@Nullable Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}

