package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.Address;
import org.openapitools.model.OrderAddress;
import org.openapitools.model.OrderSummary;
import org.openapitools.model.Product;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * DemoOfAnyOf200Response
 */

@JsonTypeName("demoOfAnyOf_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-02T14:53:37.611695398Z[Etc/UTC]", comments = "Generator version: 7.28.0-SNAPSHOT")
public class DemoOfAnyOf200Response {

  private List<@Valid Product> products = new ArrayList<>();

  private @Nullable Address address;

  public DemoOfAnyOf200Response products(List<@Valid Product> products) {
    this.products = products;
    return this;
  }

  public DemoOfAnyOf200Response addProductsItem(Product productsItem) {
    if (this.products == null) {
      this.products = new ArrayList<>();
    }
    this.products.add(productsItem);
    return this;
  }

  /**
   * Get products
   * @return products
   */
  
  @Schema(name = "products", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("products")
  public List<@Valid Product> getProducts() {
    return products;
  }

  @JsonProperty("products")
  public void setProducts(List<@Valid Product> products) {
    this.products = products;
  }

  public DemoOfAnyOf200Response address(@Nullable Address address) {
    this.address = address;
    return this;
  }

  /**
   * Get address
   * @return address
   */
  @Valid 
  @Schema(name = "address", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("address")
  public @Nullable Address getAddress() {
    return address;
  }

  @JsonProperty("address")
  public void setAddress(@Nullable Address address) {
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
    DemoOfAnyOf200Response demoOfAnyOf200Response = (DemoOfAnyOf200Response) o;
    return Objects.equals(this.products, demoOfAnyOf200Response.products) &&
        Objects.equals(this.address, demoOfAnyOf200Response.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(products, address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DemoOfAnyOf200Response {\n");
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

