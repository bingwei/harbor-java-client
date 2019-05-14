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
 * RetagReq
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-05-14T14:29:11.153+08:00[Asia/Shanghai]")public class RetagReq {

  @SerializedName("tag")
  private String tag = null;

  @SerializedName("src_image")
  private String srcImage = null;

  @SerializedName("override")
  private Boolean override = null;
  public RetagReq tag(String tag) {
    this.tag = tag;
    return this;
  }

  

  /**
  * new tag to be created
  * @return tag
  **/
  @Schema(description = "new tag to be created")
  public String getTag() {
    return tag;
  }
  public void setTag(String tag) {
    this.tag = tag;
  }
  public RetagReq srcImage(String srcImage) {
    this.srcImage = srcImage;
    return this;
  }

  

  /**
  * Source image to be retagged, e.g. &#x27;stage/app:v1.0&#x27;
  * @return srcImage
  **/
  @Schema(description = "Source image to be retagged, e.g. 'stage/app:v1.0'")
  public String getSrcImage() {
    return srcImage;
  }
  public void setSrcImage(String srcImage) {
    this.srcImage = srcImage;
  }
  public RetagReq override(Boolean override) {
    this.override = override;
    return this;
  }

  

  /**
  * If target tag already exists, whether to override it
  * @return override
  **/
  @Schema(description = "If target tag already exists, whether to override it")
  public Boolean isOverride() {
    return override;
  }
  public void setOverride(Boolean override) {
    this.override = override;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RetagReq retagReq = (RetagReq) o;
    return Objects.equals(this.tag, retagReq.tag) &&
        Objects.equals(this.srcImage, retagReq.srcImage) &&
        Objects.equals(this.override, retagReq.override);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(tag, srcImage, override);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RetagReq {\n");
    
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    srcImage: ").append(toIndentedString(srcImage)).append("\n");
    sb.append("    override: ").append(toIndentedString(override)).append("\n");
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
