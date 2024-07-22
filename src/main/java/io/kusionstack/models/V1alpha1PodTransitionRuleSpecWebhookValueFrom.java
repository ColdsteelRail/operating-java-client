/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.21.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.kusionstack.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kusionstack.models.V1alpha1PodTransitionRuleSpecWebhookValueFromFieldRef;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Source for the parameter&#39;s value. Cannot be used if value is not empty.
 */
@ApiModel(description = "Source for the parameter's value. Cannot be used if value is not empty.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-22T06:52:16.042Z[Etc/UTC]")
public class V1alpha1PodTransitionRuleSpecWebhookValueFrom {
  public static final String SERIALIZED_NAME_FIELD_REF = "fieldRef";
  @SerializedName(SERIALIZED_NAME_FIELD_REF)
  private V1alpha1PodTransitionRuleSpecWebhookValueFromFieldRef fieldRef;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;


  public V1alpha1PodTransitionRuleSpecWebhookValueFrom fieldRef(V1alpha1PodTransitionRuleSpecWebhookValueFromFieldRef fieldRef) {
    
    this.fieldRef = fieldRef;
    return this;
  }

   /**
   * Get fieldRef
   * @return fieldRef
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1PodTransitionRuleSpecWebhookValueFromFieldRef getFieldRef() {
    return fieldRef;
  }


  public void setFieldRef(V1alpha1PodTransitionRuleSpecWebhookValueFromFieldRef fieldRef) {
    this.fieldRef = fieldRef;
  }


  public V1alpha1PodTransitionRuleSpecWebhookValueFrom type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * Type defines target pod type.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Type defines target pod type.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1PodTransitionRuleSpecWebhookValueFrom v1alpha1PodTransitionRuleSpecWebhookValueFrom = (V1alpha1PodTransitionRuleSpecWebhookValueFrom) o;
    return Objects.equals(this.fieldRef, v1alpha1PodTransitionRuleSpecWebhookValueFrom.fieldRef) &&
        Objects.equals(this.type, v1alpha1PodTransitionRuleSpecWebhookValueFrom.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fieldRef, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1PodTransitionRuleSpecWebhookValueFrom {\n");
    sb.append("    fieldRef: ").append(toIndentedString(fieldRef)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

