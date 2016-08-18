package com.mg.api.resources.carriers;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;




/**
 * Carrier
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2016-08-09T18:35:46.725-04:00")

public class Carrier   {
  private String carrierId = null;

  private String description = null;

  private String capacity = null;

  private String image = null;

  public Carrier carrierId(String carrierId) {
    this.carrierId = carrierId;
    return this;
  }

   /**
   * Unique identifier representing a specific carrier for a given latitude & longitude.
   * @return carrierId
  **/
  @ApiModelProperty(value = "Unique identifier representing a specific carrier for a given latitude & longitude.")
  public String getCarrierId() {
    return carrierId;
  }

  public void setCarrierId(String carrierId) {
    this.carrierId = carrierId;
  }

  public Carrier description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of carrier.
   * @return description
  **/
  @ApiModelProperty(value = "Description of carrier.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Carrier capacity(String capacity) {
    this.capacity = capacity;
    return this;
  }

   /**
   * Capacity of carrier.
   * @return capacity
  **/
  @ApiModelProperty(value = "Capacity of carrier.")
  public String getCapacity() {
    return capacity;
  }

  public void setCapacity(String capacity) {
    this.capacity = capacity;
  }

  public Carrier image(String image) {
    this.image = image;
    return this;
  }

   /**
   * Image URL representing the carrier.
   * @return image
  **/
  @ApiModelProperty(value = "Image URL representing the carrier.")
  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Carrier carrier = (Carrier) o;
    return Objects.equals(this.carrierId, carrier.carrierId) &&
        Objects.equals(this.description, carrier.description) &&
        Objects.equals(this.capacity, carrier.capacity) &&
        Objects.equals(this.image, carrier.image);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carrierId, description, capacity, image);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Carrier {\n");
    
    sb.append("    carrierId: ").append(toIndentedString(carrierId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    capacity: ").append(toIndentedString(capacity)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
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

