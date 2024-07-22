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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * May contain labels and annotations that will be copied into the PVC when creating it. No other fields are allowed and will be rejected during validation.
 */
@ApiModel(description = "May contain labels and annotations that will be copied into the PVC when creating it. No other fields are allowed and will be rejected during validation.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-22T06:24:47.231Z[Etc/UTC]")
public class V1alpha1PodDecorationSpecTemplateEphemeralVolumeClaimTemplateMetadata {
  public static final String SERIALIZED_NAME_ANNOTATIONS = "annotations";
  @SerializedName(SERIALIZED_NAME_ANNOTATIONS)
  private Map<String, String> annotations = null;

  public static final String SERIALIZED_NAME_FINALIZERS = "finalizers";
  @SerializedName(SERIALIZED_NAME_FINALIZERS)
  private List<String> finalizers = null;

  public static final String SERIALIZED_NAME_LABELS = "labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private Map<String, String> labels = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NAMESPACE = "namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;


  public V1alpha1PodDecorationSpecTemplateEphemeralVolumeClaimTemplateMetadata annotations(Map<String, String> annotations) {
    
    this.annotations = annotations;
    return this;
  }

  public V1alpha1PodDecorationSpecTemplateEphemeralVolumeClaimTemplateMetadata putAnnotationsItem(String key, String annotationsItem) {
    if (this.annotations == null) {
      this.annotations = new HashMap<>();
    }
    this.annotations.put(key, annotationsItem);
    return this;
  }

   /**
   * Get annotations
   * @return annotations
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, String> getAnnotations() {
    return annotations;
  }


  public void setAnnotations(Map<String, String> annotations) {
    this.annotations = annotations;
  }


  public V1alpha1PodDecorationSpecTemplateEphemeralVolumeClaimTemplateMetadata finalizers(List<String> finalizers) {
    
    this.finalizers = finalizers;
    return this;
  }

  public V1alpha1PodDecorationSpecTemplateEphemeralVolumeClaimTemplateMetadata addFinalizersItem(String finalizersItem) {
    if (this.finalizers == null) {
      this.finalizers = new ArrayList<>();
    }
    this.finalizers.add(finalizersItem);
    return this;
  }

   /**
   * Get finalizers
   * @return finalizers
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getFinalizers() {
    return finalizers;
  }


  public void setFinalizers(List<String> finalizers) {
    this.finalizers = finalizers;
  }


  public V1alpha1PodDecorationSpecTemplateEphemeralVolumeClaimTemplateMetadata labels(Map<String, String> labels) {
    
    this.labels = labels;
    return this;
  }

  public V1alpha1PodDecorationSpecTemplateEphemeralVolumeClaimTemplateMetadata putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

   /**
   * Get labels
   * @return labels
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Map<String, String> getLabels() {
    return labels;
  }


  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }


  public V1alpha1PodDecorationSpecTemplateEphemeralVolumeClaimTemplateMetadata name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1alpha1PodDecorationSpecTemplateEphemeralVolumeClaimTemplateMetadata namespace(String namespace) {
    
    this.namespace = namespace;
    return this;
  }

   /**
   * Get namespace
   * @return namespace
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getNamespace() {
    return namespace;
  }


  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1PodDecorationSpecTemplateEphemeralVolumeClaimTemplateMetadata v1alpha1PodDecorationSpecTemplateEphemeralVolumeClaimTemplateMetadata = (V1alpha1PodDecorationSpecTemplateEphemeralVolumeClaimTemplateMetadata) o;
    return Objects.equals(this.annotations, v1alpha1PodDecorationSpecTemplateEphemeralVolumeClaimTemplateMetadata.annotations) &&
        Objects.equals(this.finalizers, v1alpha1PodDecorationSpecTemplateEphemeralVolumeClaimTemplateMetadata.finalizers) &&
        Objects.equals(this.labels, v1alpha1PodDecorationSpecTemplateEphemeralVolumeClaimTemplateMetadata.labels) &&
        Objects.equals(this.name, v1alpha1PodDecorationSpecTemplateEphemeralVolumeClaimTemplateMetadata.name) &&
        Objects.equals(this.namespace, v1alpha1PodDecorationSpecTemplateEphemeralVolumeClaimTemplateMetadata.namespace);
  }

  @Override
  public int hashCode() {
    return Objects.hash(annotations, finalizers, labels, name, namespace);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1PodDecorationSpecTemplateEphemeralVolumeClaimTemplateMetadata {\n");
    sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
    sb.append("    finalizers: ").append(toIndentedString(finalizers)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
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

