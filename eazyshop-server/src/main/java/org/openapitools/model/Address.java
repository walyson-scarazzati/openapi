package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.springframework.lang.Nullable;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Address
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2026-11-02T14:53:37.611695398Z[Etc/UTC]", comments = "Generator version: 7.28.0-SNAPSHOT")
public class Address {

  private String addressLine;

  private String city;

  /**
   * Gets or Sets state
   */
  public enum StateEnum {
    CALIFORNIA("California"),
    
    TEXAS("Texas"),
    
    FLORIDA("Florida");

    private final String value;

    StateEnum(String value) {
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
    public static StateEnum fromValue(String value) {
      for (StateEnum b : StateEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  private StateEnum state;

  private String zipcode;

  private @Nullable Boolean isOfficeAddress;

  public Address() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Address(String addressLine, String city, StateEnum state, String zipcode) {
    this.addressLine = addressLine;
    this.city = city;
    this.state = state;
    this.zipcode = zipcode;
  }

  public Address addressLine(String addressLine) {
    this.addressLine = addressLine;
    return this;
  }

  /**
   * Get addressLine
   * @return addressLine
   */
  @NotNull 
  @Schema(name = "addressLine", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("addressLine")
  public String getAddressLine() {
    return addressLine;
  }

  @JsonProperty("addressLine")
  public void setAddressLine(String addressLine) {
    this.addressLine = addressLine;
  }

  public Address city(String city) {
    this.city = city;
    return this;
  }

  /**
   * Get city
   * @return city
   */
  @NotNull 
  @Schema(name = "city", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("city")
  public String getCity() {
    return city;
  }

  @JsonProperty("city")
  public void setCity(String city) {
    this.city = city;
  }

  public Address state(StateEnum state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
   */
  @NotNull 
  @Schema(name = "state", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("state")
  public StateEnum getState() {
    return state;
  }

  @JsonProperty("state")
  public void setState(StateEnum state) {
    this.state = state;
  }

  public Address zipcode(String zipcode) {
    this.zipcode = zipcode;
    return this;
  }

  /**
   * Get zipcode
   * @return zipcode
   */
  @NotNull 
  @Schema(name = "zipcode", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("zipcode")
  public String getZipcode() {
    return zipcode;
  }

  @JsonProperty("zipcode")
  public void setZipcode(String zipcode) {
    this.zipcode = zipcode;
  }

  public Address isOfficeAddress(@Nullable Boolean isOfficeAddress) {
    this.isOfficeAddress = isOfficeAddress;
    return this;
  }

  /**
   * Get isOfficeAddress
   * @return isOfficeAddress
   */
  
  @Schema(name = "isOfficeAddress", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("isOfficeAddress")
  public @Nullable Boolean getIsOfficeAddress() {
    return isOfficeAddress;
  }

  @JsonProperty("isOfficeAddress")
  public void setIsOfficeAddress(@Nullable Boolean isOfficeAddress) {
    this.isOfficeAddress = isOfficeAddress;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Address address = (Address) o;
    return Objects.equals(this.addressLine, address.addressLine) &&
        Objects.equals(this.city, address.city) &&
        Objects.equals(this.state, address.state) &&
        Objects.equals(this.zipcode, address.zipcode) &&
        Objects.equals(this.isOfficeAddress, address.isOfficeAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressLine, city, state, zipcode, isOfficeAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Address {\n");
    sb.append("    addressLine: ").append(toIndentedString(addressLine)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    zipcode: ").append(toIndentedString(zipcode)).append("\n");
    sb.append("    isOfficeAddress: ").append(toIndentedString(isOfficeAddress)).append("\n");
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

