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
import io.kusionstack.models.V1alpha1PodTransitionRuleSpecLabelCheckRequires;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * LabelCheck is the rule to check labels on pods.
 */
@ApiModel(description = "LabelCheck is the rule to check labels on pods.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-22T06:52:16.042Z[Etc/UTC]")
public class V1alpha1PodTransitionRuleSpecLabelCheck {
  public static final String SERIALIZED_NAME_REQUIRES = "requires";
  @SerializedName(SERIALIZED_NAME_REQUIRES)
  private V1alpha1PodTransitionRuleSpecLabelCheckRequires requires;


  public V1alpha1PodTransitionRuleSpecLabelCheck requires(V1alpha1PodTransitionRuleSpecLabelCheckRequires requires) {
    
    this.requires = requires;
    return this;
  }

   /**
   * Get requires
   * @return requires
  **/
  @ApiModelProperty(required = true, value = "")

  public V1alpha1PodTransitionRuleSpecLabelCheckRequires getRequires() {
    return requires;
  }


  public void setRequires(V1alpha1PodTransitionRuleSpecLabelCheckRequires requires) {
    this.requires = requires;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1PodTransitionRuleSpecLabelCheck v1alpha1PodTransitionRuleSpecLabelCheck = (V1alpha1PodTransitionRuleSpecLabelCheck) o;
    return Objects.equals(this.requires, v1alpha1PodTransitionRuleSpecLabelCheck.requires);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requires);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1PodTransitionRuleSpecLabelCheck {\n");
    sb.append("    requires: ").append(toIndentedString(requires)).append("\n");
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

