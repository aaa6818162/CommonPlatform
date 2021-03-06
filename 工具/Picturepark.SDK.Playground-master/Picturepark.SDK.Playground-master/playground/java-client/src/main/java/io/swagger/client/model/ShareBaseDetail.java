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
import io.swagger.client.model.ContentDetail2;
import io.swagger.client.model.EntityType;
import io.swagger.client.model.OutputAccess;
import io.swagger.client.model.StoreAudit;
import io.swagger.client.model.TemplateBase;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;

/**
 * ShareBaseDetail
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-10-04T14:36:42.044Z")

public class ShareBaseDetail {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("audit")
  private StoreAudit audit = null;

  @SerializedName("entityType")
  private EntityType entityType = null;

  @SerializedName("contentSelections")
  private List<ContentDetail2> contentSelections = null;

  @SerializedName("layerSchemaIds")
  private List<String> layerSchemaIds = null;

  @SerializedName("mailTemplateId")
  private String mailTemplateId = null;

  @SerializedName("expirationDate")
  private DateTime expirationDate = null;

  @SerializedName("template")
  private TemplateBase template = null;

  @SerializedName("outputAccess")
  private OutputAccess outputAccess = null;

  @SerializedName("kind")
  private String kind = null;

  public ShareBaseDetail id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ShareBaseDetail name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public ShareBaseDetail description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ShareBaseDetail audit(StoreAudit audit) {
    this.audit = audit;
    return this;
  }

   /**
   * Get audit
   * @return audit
  **/
  @ApiModelProperty(value = "")
  public StoreAudit getAudit() {
    return audit;
  }

  public void setAudit(StoreAudit audit) {
    this.audit = audit;
  }

  public ShareBaseDetail entityType(EntityType entityType) {
    this.entityType = entityType;
    return this;
  }

   /**
   * Get entityType
   * @return entityType
  **/
  @ApiModelProperty(required = true, value = "")
  public EntityType getEntityType() {
    return entityType;
  }

  public void setEntityType(EntityType entityType) {
    this.entityType = entityType;
  }

  public ShareBaseDetail contentSelections(List<ContentDetail2> contentSelections) {
    this.contentSelections = contentSelections;
    return this;
  }

  public ShareBaseDetail addContentSelectionsItem(ContentDetail2 contentSelectionsItem) {
    if (this.contentSelections == null) {
      this.contentSelections = new ArrayList<ContentDetail2>();
    }
    this.contentSelections.add(contentSelectionsItem);
    return this;
  }

   /**
   * Get contentSelections
   * @return contentSelections
  **/
  @ApiModelProperty(value = "")
  public List<ContentDetail2> getContentSelections() {
    return contentSelections;
  }

  public void setContentSelections(List<ContentDetail2> contentSelections) {
    this.contentSelections = contentSelections;
  }

  public ShareBaseDetail layerSchemaIds(List<String> layerSchemaIds) {
    this.layerSchemaIds = layerSchemaIds;
    return this;
  }

  public ShareBaseDetail addLayerSchemaIdsItem(String layerSchemaIdsItem) {
    if (this.layerSchemaIds == null) {
      this.layerSchemaIds = new ArrayList<String>();
    }
    this.layerSchemaIds.add(layerSchemaIdsItem);
    return this;
  }

   /**
   * Get layerSchemaIds
   * @return layerSchemaIds
  **/
  @ApiModelProperty(value = "")
  public List<String> getLayerSchemaIds() {
    return layerSchemaIds;
  }

  public void setLayerSchemaIds(List<String> layerSchemaIds) {
    this.layerSchemaIds = layerSchemaIds;
  }

  public ShareBaseDetail mailTemplateId(String mailTemplateId) {
    this.mailTemplateId = mailTemplateId;
    return this;
  }

   /**
   * Get mailTemplateId
   * @return mailTemplateId
  **/
  @ApiModelProperty(value = "")
  public String getMailTemplateId() {
    return mailTemplateId;
  }

  public void setMailTemplateId(String mailTemplateId) {
    this.mailTemplateId = mailTemplateId;
  }

  public ShareBaseDetail expirationDate(DateTime expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

   /**
   * Get expirationDate
   * @return expirationDate
  **/
  @ApiModelProperty(value = "")
  public DateTime getExpirationDate() {
    return expirationDate;
  }

  public void setExpirationDate(DateTime expirationDate) {
    this.expirationDate = expirationDate;
  }

  public ShareBaseDetail template(TemplateBase template) {
    this.template = template;
    return this;
  }

   /**
   * Get template
   * @return template
  **/
  @ApiModelProperty(value = "")
  public TemplateBase getTemplate() {
    return template;
  }

  public void setTemplate(TemplateBase template) {
    this.template = template;
  }

  public ShareBaseDetail outputAccess(OutputAccess outputAccess) {
    this.outputAccess = outputAccess;
    return this;
  }

   /**
   * Get outputAccess
   * @return outputAccess
  **/
  @ApiModelProperty(required = true, value = "")
  public OutputAccess getOutputAccess() {
    return outputAccess;
  }

  public void setOutputAccess(OutputAccess outputAccess) {
    this.outputAccess = outputAccess;
  }

  public ShareBaseDetail kind(String kind) {
    this.kind = kind;
    return this;
  }

   /**
   * Get kind
   * @return kind
  **/
  @ApiModelProperty(required = true, value = "")
  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShareBaseDetail shareBaseDetail = (ShareBaseDetail) o;
    return Objects.equals(this.id, shareBaseDetail.id) &&
        Objects.equals(this.name, shareBaseDetail.name) &&
        Objects.equals(this.description, shareBaseDetail.description) &&
        Objects.equals(this.audit, shareBaseDetail.audit) &&
        Objects.equals(this.entityType, shareBaseDetail.entityType) &&
        Objects.equals(this.contentSelections, shareBaseDetail.contentSelections) &&
        Objects.equals(this.layerSchemaIds, shareBaseDetail.layerSchemaIds) &&
        Objects.equals(this.mailTemplateId, shareBaseDetail.mailTemplateId) &&
        Objects.equals(this.expirationDate, shareBaseDetail.expirationDate) &&
        Objects.equals(this.template, shareBaseDetail.template) &&
        Objects.equals(this.outputAccess, shareBaseDetail.outputAccess) &&
        Objects.equals(this.kind, shareBaseDetail.kind);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, description, audit, entityType, contentSelections, layerSchemaIds, mailTemplateId, expirationDate, template, outputAccess, kind);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShareBaseDetail {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    audit: ").append(toIndentedString(audit)).append("\n");
    sb.append("    entityType: ").append(toIndentedString(entityType)).append("\n");
    sb.append("    contentSelections: ").append(toIndentedString(contentSelections)).append("\n");
    sb.append("    layerSchemaIds: ").append(toIndentedString(layerSchemaIds)).append("\n");
    sb.append("    mailTemplateId: ").append(toIndentedString(mailTemplateId)).append("\n");
    sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    outputAccess: ").append(toIndentedString(outputAccess)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
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

