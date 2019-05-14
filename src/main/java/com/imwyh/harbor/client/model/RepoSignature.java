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
 * RepoSignature
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-05-14T14:29:11.153+08:00[Asia/Shanghai]")public class RepoSignature {

  @SerializedName("tag")
  private String tag = null;

  @SerializedName("hashes")
  private Object hashes = null;
  public RepoSignature tag(String tag) {
    this.tag = tag;
    return this;
  }

  

  /**
  * The tag of image.
  * @return tag
  **/
  @Schema(description = "The tag of image.")
  public String getTag() {
    return tag;
  }
  public void setTag(String tag) {
    this.tag = tag;
  }
  public RepoSignature hashes(Object hashes) {
    this.hashes = hashes;
    return this;
  }

  

  /**
  * The JSON object of the hash of the image.
  * @return hashes
  **/
  @Schema(description = "The JSON object of the hash of the image.")
  public Object getHashes() {
    return hashes;
  }
  public void setHashes(Object hashes) {
    this.hashes = hashes;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RepoSignature repoSignature = (RepoSignature) o;
    return Objects.equals(this.tag, repoSignature.tag) &&
        Objects.equals(this.hashes, repoSignature.hashes);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(tag, hashes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RepoSignature {\n");
    
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    hashes: ").append(toIndentedString(hashes)).append("\n");
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
