/*
 * Harbor API
 * These APIs provide services for manipulating Harbor project.
 *
 * OpenAPI spec version: 1.7.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package com.imwyh.harbor.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;

/**
 * Replication
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-05-14T14:29:11.153+08:00[Asia/Shanghai]")public class Replication {

  @SerializedName("policy_id")
  private Integer policyId = null;
  public Replication policyId(Integer policyId) {
    this.policyId = policyId;
    return this;
  }

  

  /**
  * The ID of replication policy
  * @return policyId
  **/
  @Schema(description = "The ID of replication policy")
  public Integer getPolicyId() {
    return policyId;
  }
  public void setPolicyId(Integer policyId) {
    this.policyId = policyId;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Replication replication = (Replication) o;
    return Objects.equals(this.policyId, replication.policyId);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(policyId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Replication {\n");
    
    sb.append("    policyId: ").append(toIndentedString(policyId)).append("\n");
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
