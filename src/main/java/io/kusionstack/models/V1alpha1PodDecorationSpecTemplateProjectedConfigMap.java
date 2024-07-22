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
import io.kusionstack.models.V1alpha1PodDecorationSpecTemplateConfigMapItems;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * information about the configMap data to project
 */
@ApiModel(description = "information about the configMap data to project")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-22T06:24:47.231Z[Etc/UTC]")
public class V1alpha1PodDecorationSpecTemplateProjectedConfigMap {
  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<V1alpha1PodDecorationSpecTemplateConfigMapItems> items = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OPTIONAL = "optional";
  @SerializedName(SERIALIZED_NAME_OPTIONAL)
  private Boolean optional;


  public V1alpha1PodDecorationSpecTemplateProjectedConfigMap items(List<V1alpha1PodDecorationSpecTemplateConfigMapItems> items) {
    
    this.items = items;
    return this;
  }

  public V1alpha1PodDecorationSpecTemplateProjectedConfigMap addItemsItem(V1alpha1PodDecorationSpecTemplateConfigMapItems itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * If unspecified, each key-value pair in the Data field of the referenced ConfigMap will be projected into the volume as a file whose name is the key and content is the value. If specified, the listed keys will be projected into the specified paths, and unlisted keys will not be present. If a key is specified which is not present in the ConfigMap, the volume setup will error unless it is marked optional. Paths must be relative and may not contain the &#39;..&#39; path or start with &#39;..&#39;.
   * @return items
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "If unspecified, each key-value pair in the Data field of the referenced ConfigMap will be projected into the volume as a file whose name is the key and content is the value. If specified, the listed keys will be projected into the specified paths, and unlisted keys will not be present. If a key is specified which is not present in the ConfigMap, the volume setup will error unless it is marked optional. Paths must be relative and may not contain the '..' path or start with '..'.")

  public List<V1alpha1PodDecorationSpecTemplateConfigMapItems> getItems() {
    return items;
  }


  public void setItems(List<V1alpha1PodDecorationSpecTemplateConfigMapItems> items) {
    this.items = items;
  }


  public V1alpha1PodDecorationSpecTemplateProjectedConfigMap name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Name of the referent. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names TODO: Add other useful fields. apiVersion, kind, uid?")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1alpha1PodDecorationSpecTemplateProjectedConfigMap optional(Boolean optional) {
    
    this.optional = optional;
    return this;
  }

   /**
   * Specify whether the ConfigMap or its keys must be defined
   * @return optional
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Specify whether the ConfigMap or its keys must be defined")

  public Boolean getOptional() {
    return optional;
  }


  public void setOptional(Boolean optional) {
    this.optional = optional;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1PodDecorationSpecTemplateProjectedConfigMap v1alpha1PodDecorationSpecTemplateProjectedConfigMap = (V1alpha1PodDecorationSpecTemplateProjectedConfigMap) o;
    return Objects.equals(this.items, v1alpha1PodDecorationSpecTemplateProjectedConfigMap.items) &&
        Objects.equals(this.name, v1alpha1PodDecorationSpecTemplateProjectedConfigMap.name) &&
        Objects.equals(this.optional, v1alpha1PodDecorationSpecTemplateProjectedConfigMap.optional);
  }

  @Override
  public int hashCode() {
    return Objects.hash(items, name, optional);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1PodDecorationSpecTemplateProjectedConfigMap {\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    optional: ").append(toIndentedString(optional)).append("\n");
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

