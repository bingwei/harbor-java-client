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
 * Label
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-05-14T14:29:11.153+08:00[Asia/Shanghai]")public class Label {

  @SerializedName("id")
  private Integer id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("color")
  private String color = null;

  @SerializedName("scope")
  private String scope = null;

  @SerializedName("project_id")
  private Integer projectId = null;

  @SerializedName("creation_time")
  private String creationTime = null;

  @SerializedName("update_time")
  private String updateTime = null;

  @SerializedName("deleted")
  private Boolean deleted = null;
  public Label id(Integer id) {
    this.id = id;
    return this;
  }

  

  /**
  * The ID of label.
  * @return id
  **/
  @Schema(description = "The ID of label.")
  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }
  public Label name(String name) {
    this.name = name;
    return this;
  }

  

  /**
  * The name of label.
  * @return name
  **/
  @Schema(description = "The name of label.")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public Label description(String description) {
    this.description = description;
    return this;
  }

  

  /**
  * The description of label.
  * @return description
  **/
  @Schema(description = "The description of label.")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }
  public Label color(String color) {
    this.color = color;
    return this;
  }

  

  /**
  * The color of label.
  * @return color
  **/
  @Schema(description = "The color of label.")
  public String getColor() {
    return color;
  }
  public void setColor(String color) {
    this.color = color;
  }
  public Label scope(String scope) {
    this.scope = scope;
    return this;
  }

  

  /**
  * The scope of label, g for global labels and p for project labels.
  * @return scope
  **/
  @Schema(description = "The scope of label, g for global labels and p for project labels.")
  public String getScope() {
    return scope;
  }
  public void setScope(String scope) {
    this.scope = scope;
  }
  public Label projectId(Integer projectId) {
    this.projectId = projectId;
    return this;
  }

  

  /**
  * The project ID if the label is a project label.
  * @return projectId
  **/
  @Schema(description = "The project ID if the label is a project label.")
  public Integer getProjectId() {
    return projectId;
  }
  public void setProjectId(Integer projectId) {
    this.projectId = projectId;
  }
  public Label creationTime(String creationTime) {
    this.creationTime = creationTime;
    return this;
  }

  

  /**
  * The creation time of label.
  * @return creationTime
  **/
  @Schema(description = "The creation time of label.")
  public String getCreationTime() {
    return creationTime;
  }
  public void setCreationTime(String creationTime) {
    this.creationTime = creationTime;
  }
  public Label updateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  

  /**
  * The update time of label.
  * @return updateTime
  **/
  @Schema(description = "The update time of label.")
  public String getUpdateTime() {
    return updateTime;
  }
  public void setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
  }
  public Label deleted(Boolean deleted) {
    this.deleted = deleted;
    return this;
  }

  

  /**
  * The label is deleted or not.
  * @return deleted
  **/
  @Schema(description = "The label is deleted or not.")
  public Boolean isDeleted() {
    return deleted;
  }
  public void setDeleted(Boolean deleted) {
    this.deleted = deleted;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Label label = (Label) o;
    return Objects.equals(this.id, label.id) &&
        Objects.equals(this.name, label.name) &&
        Objects.equals(this.description, label.description) &&
        Objects.equals(this.color, label.color) &&
        Objects.equals(this.scope, label.scope) &&
        Objects.equals(this.projectId, label.projectId) &&
        Objects.equals(this.creationTime, label.creationTime) &&
        Objects.equals(this.updateTime, label.updateTime) &&
        Objects.equals(this.deleted, label.deleted);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, name, description, color, scope, projectId, creationTime, updateTime, deleted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Label {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
    sb.append("    creationTime: ").append(toIndentedString(creationTime)).append("\n");
    sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
    sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
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
