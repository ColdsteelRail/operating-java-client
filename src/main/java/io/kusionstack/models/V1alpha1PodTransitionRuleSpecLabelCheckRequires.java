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
import io.kusionstack.models.V1alpha1PodTransitionRuleSpecFilterLabelSelectorMatchExpressions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Requires is the expected labels on pods
 */
@ApiModel(description = "Requires is the expected labels on pods")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-22T06:52:16.042Z[Etc/UTC]")
public class V1alpha1PodTransitionRuleSpecLabelCheckRequires {
  public static final String SERIALIZED_NAME_MATCH_EXPRESSIONS = "matchExpressions";
  @SerializedName(SERIALIZED_NAME_MATCH_EXPRESSIONS)
  private List<V1alpha1PodTransitionRuleSpecFilterLabelSelectorMatchExpressions> matchExpressions = null;

  public static final String SERIALIZED_NAME_MATCH_LABELS = "matchLabels";
  @SerializedName(SERIALIZED_NAME_MATCH_LABELS)
  private Map<String, String> matchLabels = null;


  public V1alpha1PodTransitionRuleSpecLabelCheckRequires matchExpressions(List<V1alpha1PodTransitionRuleSpecFilterLabelSelectorMatchExpressions> matchExpressions) {
    
    this.matchExpressions = matchExpressions;
    return this;
  }

  public V1alpha1PodTransitionRuleSpecLabelCheckRequires addMatchExpressionsItem(V1alpha1PodTransitionRuleSpecFilterLabelSelectorMatchExpressions matchExpressionsItem) {
    if (this.matchExpressions == null) {
      this.matchExpressions = new ArrayList<>();
    }
    this.matchExpressions.add(matchExpressionsItem);
    return this;
  }

   /**
   * matchExpressions is a list of label selector requirements. The requirements are ANDed.
   * @return matchExpressions
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "matchExpressions is a list of label selector requirements. The requirements are ANDed.")

  public List<V1alpha1PodTransitionRuleSpecFilterLabelSelectorMatchExpressions> getMatchExpressions() {
    return matchExpressions;
  }


  public void setMatchExpressions(List<V1alpha1PodTransitionRuleSpecFilterLabelSelectorMatchExpressions> matchExpressions) {
    this.matchExpressions = matchExpressions;
  }


  public V1alpha1PodTransitionRuleSpecLabelCheckRequires matchLabels(Map<String, String> matchLabels) {
    
    this.matchLabels = matchLabels;
    return this;
  }

  public V1alpha1PodTransitionRuleSpecLabelCheckRequires putMatchLabelsItem(String key, String matchLabelsItem) {
    if (this.matchLabels == null) {
      this.matchLabels = new HashMap<>();
    }
    this.matchLabels.put(key, matchLabelsItem);
    return this;
  }

   /**
   * matchLabels is a map of {key,value} pairs. A single {key,value} in the matchLabels map is equivalent to an element of matchExpressions, whose key field is \&quot;key\&quot;, the operator is \&quot;In\&quot;, and the values array contains only \&quot;value\&quot;. The requirements are ANDed.
   * @return matchLabels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "matchLabels is a map of {key,value} pairs. A single {key,value} in the matchLabels map is equivalent to an element of matchExpressions, whose key field is \"key\", the operator is \"In\", and the values array contains only \"value\". The requirements are ANDed.")

  public Map<String, String> getMatchLabels() {
    return matchLabels;
  }


  public void setMatchLabels(Map<String, String> matchLabels) {
    this.matchLabels = matchLabels;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1PodTransitionRuleSpecLabelCheckRequires v1alpha1PodTransitionRuleSpecLabelCheckRequires = (V1alpha1PodTransitionRuleSpecLabelCheckRequires) o;
    return Objects.equals(this.matchExpressions, v1alpha1PodTransitionRuleSpecLabelCheckRequires.matchExpressions) &&
        Objects.equals(this.matchLabels, v1alpha1PodTransitionRuleSpecLabelCheckRequires.matchLabels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(matchExpressions, matchLabels);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1PodTransitionRuleSpecLabelCheckRequires {\n");
    sb.append("    matchExpressions: ").append(toIndentedString(matchExpressions)).append("\n");
    sb.append("    matchLabels: ").append(toIndentedString(matchLabels)).append("\n");
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

