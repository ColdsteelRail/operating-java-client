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

/**
 * AzureFile represents an Azure File Service mount on the host and bind mount to the pod.
 */
@ApiModel(description = "AzureFile represents an Azure File Service mount on the host and bind mount to the pod.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-22T06:24:47.231Z[Etc/UTC]")
public class V1alpha1PodDecorationSpecTemplateAzureFile {
  public static final String SERIALIZED_NAME_READ_ONLY = "readOnly";
  @SerializedName(SERIALIZED_NAME_READ_ONLY)
  private Boolean readOnly;

  public static final String SERIALIZED_NAME_SECRET_NAME = "secretName";
  @SerializedName(SERIALIZED_NAME_SECRET_NAME)
  private String secretName;

  public static final String SERIALIZED_NAME_SHARE_NAME = "shareName";
  @SerializedName(SERIALIZED_NAME_SHARE_NAME)
  private String shareName;


  public V1alpha1PodDecorationSpecTemplateAzureFile readOnly(Boolean readOnly) {
    
    this.readOnly = readOnly;
    return this;
  }

   /**
   * Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
   * @return readOnly
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.")

  public Boolean getReadOnly() {
    return readOnly;
  }


  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }


  public V1alpha1PodDecorationSpecTemplateAzureFile secretName(String secretName) {
    
    this.secretName = secretName;
    return this;
  }

   /**
   * the name of secret that contains Azure Storage Account Name and Key
   * @return secretName
  **/
  @ApiModelProperty(required = true, value = "the name of secret that contains Azure Storage Account Name and Key")

  public String getSecretName() {
    return secretName;
  }


  public void setSecretName(String secretName) {
    this.secretName = secretName;
  }


  public V1alpha1PodDecorationSpecTemplateAzureFile shareName(String shareName) {
    
    this.shareName = shareName;
    return this;
  }

   /**
   * Share Name
   * @return shareName
  **/
  @ApiModelProperty(required = true, value = "Share Name")

  public String getShareName() {
    return shareName;
  }


  public void setShareName(String shareName) {
    this.shareName = shareName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1PodDecorationSpecTemplateAzureFile v1alpha1PodDecorationSpecTemplateAzureFile = (V1alpha1PodDecorationSpecTemplateAzureFile) o;
    return Objects.equals(this.readOnly, v1alpha1PodDecorationSpecTemplateAzureFile.readOnly) &&
        Objects.equals(this.secretName, v1alpha1PodDecorationSpecTemplateAzureFile.secretName) &&
        Objects.equals(this.shareName, v1alpha1PodDecorationSpecTemplateAzureFile.shareName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(readOnly, secretName, shareName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1PodDecorationSpecTemplateAzureFile {\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    secretName: ").append(toIndentedString(secretName)).append("\n");
    sb.append("    shareName: ").append(toIndentedString(shareName)).append("\n");
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

