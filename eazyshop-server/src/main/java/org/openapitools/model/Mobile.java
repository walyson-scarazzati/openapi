package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.LocalDate;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.Nullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Mobile
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-02T14:53:37.611695398Z[Etc/UTC]", comments = "Generator version: 7.28.0-SNAPSHOT")
public class Mobile implements DemoOfOneOfRequestProducts {

  private @Nullable Integer productId;

  private @Nullable String name;

  private @Nullable Float price;

  private JsonNullable<String> categoryName = JsonNullable.<String>undefined();

  private @Nullable Integer quantity;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private @Nullable LocalDate releaseDate;

  /**
   * Gets or Sets networkType
   */
  public enum NetworkTypeEnum {
    _4_G("4G"),
    
    _5_G("5G");

    private final String value;

    NetworkTypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static NetworkTypeEnum fromValue(String value) {
      for (NetworkTypeEnum b : NetworkTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private NetworkTypeEnum networkType;

  public Mobile() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Mobile(NetworkTypeEnum networkType) {
    this.networkType = networkType;
  }

  public Mobile productId(@Nullable Integer productId) {
    this.productId = productId;
    return this;
  }

  /**
   * Get productId
   * @return productId
   */
  
  @Schema(name = "productId", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("productId")
  public @Nullable Integer getProductId() {
    return productId;
  }

  @JsonProperty("productId")
  public void setProductId(@Nullable Integer productId) {
    this.productId = productId;
  }

  public Mobile name(@Nullable String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  
  @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
  public @Nullable String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(@Nullable String name) {
    this.name = name;
  }

  public Mobile price(@Nullable Float price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * @return price
   */
  
  @Schema(name = "price", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("price")
  public @Nullable Float getPrice() {
    return price;
  }

  @JsonProperty("price")
  public void setPrice(@Nullable Float price) {
    this.price = price;
  }

  public Mobile categoryName(String categoryName) {
    this.categoryName = JsonNullable.of(categoryName);
    return this;
  }

  /**
   * Get categoryName
   * @return categoryName
   */
  
  @Schema(name = "categoryName", requiredMode = Schema.RequiredMode.NOT_REQUIRED, nullable = true)
  @JsonProperty("categoryName")
  public JsonNullable<String> getCategoryName() {
    return categoryName;
  }

  public void setCategoryName(JsonNullable<String> categoryName) {
    this.categoryName = categoryName;
  }

  public Mobile quantity(@Nullable Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Get quantity
   * @return quantity
   */
  
  @Schema(name = "quantity", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("quantity")
  public @Nullable Integer getQuantity() {
    return quantity;
  }

  @JsonProperty("quantity")
  public void setQuantity(@Nullable Integer quantity) {
    this.quantity = quantity;
  }

  public Mobile releaseDate(@Nullable LocalDate releaseDate) {
    this.releaseDate = releaseDate;
    return this;
  }

  /**
   * Get releaseDate
   * @return releaseDate
   */
  @Valid 
  @Schema(name = "releaseDate", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("releaseDate")
  public @Nullable LocalDate getReleaseDate() {
    return releaseDate;
  }

  @JsonProperty("releaseDate")
  public void setReleaseDate(@Nullable LocalDate releaseDate) {
    this.releaseDate = releaseDate;
  }

  public Mobile networkType(NetworkTypeEnum networkType) {
    this.networkType = networkType;
    return this;
  }

  /**
   * Get networkType
   * @return networkType
   */
  @NotNull 
  @Schema(name = "networkType", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("networkType")
  public NetworkTypeEnum getNetworkType() {
    return networkType;
  }

  @JsonProperty("networkType")
  public void setNetworkType(NetworkTypeEnum networkType) {
    this.networkType = networkType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Mobile mobile = (Mobile) o;
    return Objects.equals(this.productId, mobile.productId) &&
        Objects.equals(this.name, mobile.name) &&
        Objects.equals(this.price, mobile.price) &&
        equalsNullable(this.categoryName, mobile.categoryName) &&
        Objects.equals(this.quantity, mobile.quantity) &&
        Objects.equals(this.releaseDate, mobile.releaseDate) &&
        Objects.equals(this.networkType, mobile.networkType);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, name, price, hashCodeNullable(categoryName), quantity, releaseDate, networkType);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Mobile {\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    categoryName: ").append(toIndentedString(categoryName)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    releaseDate: ").append(toIndentedString(releaseDate)).append("\n");
    sb.append("    networkType: ").append(toIndentedString(networkType)).append("\n");
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

