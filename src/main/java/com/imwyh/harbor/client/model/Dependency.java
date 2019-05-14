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
 * Another chart the chart depends on
 */
@Schema(description = "Another chart the chart depends on")
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-05-14T14:29:11.153+08:00[Asia/Shanghai]")public class Dependency {

  @SerializedName("name")
  private String name = null;

  @SerializedName("version")
  private String version = null;

  @SerializedName("repository")
  private String repository = null;
  public Dependency name(String name) {
    this.name = name;
    return this;
  }

  

  /**
  * The name of the chart denpendency
  * @return name
  **/
  @Schema(required = true, description = "The name of the chart denpendency")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public Dependency version(String version) {
    this.version = version;
    return this;
  }

  

  /**
  * The version of the chart dependency
  * @return version
  **/
  @Schema(required = true, description = "The version of the chart dependency")
  public String getVersion() {
    return version;
  }
  public void setVersion(String version) {
    this.version = version;
  }
  public Dependency repository(String repository) {
    this.repository = repository;
    return this;
  }

  

  /**
  * The URL to the repository
  * @return repository
  **/
  @Schema(description = "The URL to the repository")
  public String getRepository() {
    return repository;
  }
  public void setRepository(String repository) {
    this.repository = repository;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dependency dependency = (Dependency) o;
    return Objects.equals(this.name, dependency.name) &&
        Objects.equals(this.version, dependency.version) &&
        Objects.equals(this.repository, dependency.repository);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(name, version, repository);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dependency {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
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
