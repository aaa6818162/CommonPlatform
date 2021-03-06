/*
 * Web API Swagger specification
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PermissionSet
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-04T14:36:42.044Z")
public class PermissionSet {
  @SerializedName("id")
  private String id = null;

  @SerializedName("trashed")
  private Boolean trashed = null;

  public PermissionSet id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The permission set id.
   * @return id
  **/
  @ApiModelProperty(value = "The permission set id.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PermissionSet trashed(Boolean trashed) {
    this.trashed = trashed;
    return this;
  }

   /**
   * Get trashed
   * @return trashed
  **/
  @ApiModelProperty(required = true, value = "")
  public Boolean getTrashed() {
    return trashed;
  }

  public void setTrashed(Boolean trashed) {
    this.trashed = trashed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PermissionSet permissionSet = (PermissionSet) o;
    return Objects.equals(this.id, permissionSet.id) &&
        Objects.equals(this.trashed, permissionSet.trashed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, trashed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PermissionSet {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    trashed: ").append(toIndentedString(trashed)).append("\n");
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

