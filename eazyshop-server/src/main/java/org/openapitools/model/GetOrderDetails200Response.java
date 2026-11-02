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
 * GetOrderDetails200Response
 */

@JsonTypeName("getOrderDetails_200_response")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-02T14:53:37.611695398Z[Etc/UTC]", comments = "Generator version: 7.28.0-SNAPSHOT")
public class GetOrderDetails200Response {

  private @Nullable Integer orderId;

  private List<@Valid Product> products = new ArrayList<>();

  private @Nullable Address address;

  public GetOrderDetails200Response orderId(@Nullable Integer orderId) {
    this.orderId = orderId;
    return this;
  }

  /**
   * Get orderId
   * @return orderId
   */
  
  @Schema(name = "orderId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("orderId")
  public @Nullable Integer getOrderId() {
    return orderId;
  }

  @JsonProperty("orderId")
  public void setOrderId(@Nullable Integer orderId) {
    this.orderId = orderId;
  }

  public GetOrderDetails200Response products(List<@Valid Product> products) {
    this.products = products;
    return this;
  }

  public GetOrderDetails200Response addProductsItem(Product productsItem) {
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

  public GetOrderDetails200Response address(@Nullable Address address) {
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
    GetOrderDetails200Response getOrderDetails200Response = (GetOrderDetails200Response) o;
    return Objects.equals(this.orderId, getOrderDetails200Response.orderId) &&
        Objects.equals(this.products, getOrderDetails200Response.products) &&
        Objects.equals(this.address, getOrderDetails200Response.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, products, address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetOrderDetails200Response {\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
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

