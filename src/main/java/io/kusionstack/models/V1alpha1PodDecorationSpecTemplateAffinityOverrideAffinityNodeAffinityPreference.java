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
import io.kusionstack.models.V1alpha1PodDecorationSpecTemplateAffinityMatchExpressions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A node selector term, associated with the corresponding weight.
 */
@ApiModel(description = "A node selector term, associated with the corresponding weight.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-22T06:24:47.231Z[Etc/UTC]")
public class V1alpha1PodDecorationSpecTemplateAffinityOverrideAffinityNodeAffinityPreference {
  public static final String SERIALIZED_NAME_MATCH_EXPRESSIONS = "matchExpressions";
  @SerializedName(SERIALIZED_NAME_MATCH_EXPRESSIONS)
  private List<V1alpha1PodDecorationSpecTemplateAffinityMatchExpressions> matchExpressions = null;

  public static final String SERIALIZED_NAME_MATCH_FIELDS = "matchFields";
  @SerializedName(SERIALIZED_NAME_MATCH_FIELDS)
  private List<V1alpha1PodDecorationSpecTemplateAffinityMatchExpressions> matchFields = null;


  public V1alpha1PodDecorationSpecTemplateAffinityOverrideAffinityNodeAffinityPreference matchExpressions(List<V1alpha1PodDecorationSpecTemplateAffinityMatchExpressions> matchExpressions) {
    
    this.matchExpressions = matchExpressions;
    return this;
  }

  public V1alpha1PodDecorationSpecTemplateAffinityOverrideAffinityNodeAffinityPreference addMatchExpressionsItem(V1alpha1PodDecorationSpecTemplateAffinityMatchExpressions matchExpressionsItem) {
    if (this.matchExpressions == null) {
      this.matchExpressions = new ArrayList<>();
    }
    this.matchExpressions.add(matchExpressionsItem);
    return this;
  }

   /**
   * A list of node selector requirements by node&#39;s labels.
   * @return matchExpressions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of node selector requirements by node's labels.")

  public List<V1alpha1PodDecorationSpecTemplateAffinityMatchExpressions> getMatchExpressions() {
    return matchExpressions;
  }


  public void setMatchExpressions(List<V1alpha1PodDecorationSpecTemplateAffinityMatchExpressions> matchExpressions) {
    this.matchExpressions = matchExpressions;
  }


  public V1alpha1PodDecorationSpecTemplateAffinityOverrideAffinityNodeAffinityPreference matchFields(List<V1alpha1PodDecorationSpecTemplateAffinityMatchExpressions> matchFields) {
    
    this.matchFields = matchFields;
    return this;
  }

  public V1alpha1PodDecorationSpecTemplateAffinityOverrideAffinityNodeAffinityPreference addMatchFieldsItem(V1alpha1PodDecorationSpecTemplateAffinityMatchExpressions matchFieldsItem) {
    if (this.matchFields == null) {
      this.matchFields = new ArrayList<>();
    }
    this.matchFields.add(matchFieldsItem);
    return this;
  }

   /**
   * A list of node selector requirements by node&#39;s fields.
   * @return matchFields
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of node selector requirements by node's fields.")

  public List<V1alpha1PodDecorationSpecTemplateAffinityMatchExpressions> getMatchFields() {
    return matchFields;
  }


  public void setMatchFields(List<V1alpha1PodDecorationSpecTemplateAffinityMatchExpressions> matchFields) {
    this.matchFields = matchFields;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1PodDecorationSpecTemplateAffinityOverrideAffinityNodeAffinityPreference v1alpha1PodDecorationSpecTemplateAffinityOverrideAffinityNodeAffinityPreference = (V1alpha1PodDecorationSpecTemplateAffinityOverrideAffinityNodeAffinityPreference) o;
    return Objects.equals(this.matchExpressions, v1alpha1PodDecorationSpecTemplateAffinityOverrideAffinityNodeAffinityPreference.matchExpressions) &&
        Objects.equals(this.matchFields, v1alpha1PodDecorationSpecTemplateAffinityOverrideAffinityNodeAffinityPreference.matchFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchExpressions, matchFields);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1PodDecorationSpecTemplateAffinityOverrideAffinityNodeAffinityPreference {\n");
    sb.append("    matchExpressions: ").append(toIndentedString(matchExpressions)).append("\n");
    sb.append("    matchFields: ").append(toIndentedString(matchFields)).append("\n");
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

