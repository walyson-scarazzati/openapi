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
 * Laptop
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-02T14:53:37.611695398Z[Etc/UTC]", comments = "Generator version: 7.28.0-SNAPSHOT")
public class Laptop implements DemoOfOneOfRequestProducts {

  private @Nullable Integer productId;

  private @Nullable String name;

  private @Nullable Float price;

  private JsonNullable<String> categoryName = JsonNullable.<String>undefined();

  private @Nullable Integer quantity;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
  private @Nullable LocalDate releaseDate;

  /**
   * Gets or Sets ram
   */
  public enum RamEnum {
    _8_GB("8 GB"),
    
    _16_GB("16 GB"),
    
    _32_GB("32 GB");

    private final String value;

    RamEnum(String value) {
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
    public static RamEnum fromValue(String value) {
      for (RamEnum b : RamEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private RamEnum ram;

  public Laptop() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Laptop(RamEnum ram) {
    this.ram = ram;
  }

  public Laptop productId(@Nullable Integer productId) {
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

  public Laptop name(@Nullable String name) {
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

  public Laptop price(@Nullable Float price) {
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

  public Laptop categoryName(String categoryName) {
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

  public Laptop quantity(@Nullable Integer quantity) {
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

  public Laptop releaseDate(@Nullable LocalDate releaseDate) {
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

  public Laptop ram(RamEnum ram) {
    this.ram = ram;
    return this;
  }

  /**
   * Get ram
   * @return ram
   */
  @NotNull 
  @Schema(name = "ram", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("ram")
  public RamEnum getRam() {
    return ram;
  }

  @JsonProperty("ram")
  public void setRam(RamEnum ram) {
    this.ram = ram;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Laptop laptop = (Laptop) o;
    return Objects.equals(this.productId, laptop.productId) &&
        Objects.equals(this.name, laptop.name) &&
        Objects.equals(this.price, laptop.price) &&
        equalsNullable(this.categoryName, laptop.categoryName) &&
        Objects.equals(this.quantity, laptop.quantity) &&
        Objects.equals(this.releaseDate, laptop.releaseDate) &&
        Objects.equals(this.ram, laptop.ram);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, name, price, hashCodeNullable(categoryName), quantity, releaseDate, ram);
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
    sb.append("class Laptop {\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    categoryName: ").append(toIndentedString(categoryName)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    releaseDate: ").append(toIndentedString(releaseDate)).append("\n");
    sb.append("    ram: ").append(toIndentedString(ram)).append("\n");
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

