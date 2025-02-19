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
import io.kusionstack.models.V1alpha1CollaSetSpecUpdateStrategyRollingUpdate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * UpdateStrategy indicates the CollaSetUpdateStrategy that will be employed to update Pods in the CollaSet when a revision is made to Template.
 */
@ApiModel(description = "UpdateStrategy indicates the CollaSetUpdateStrategy that will be employed to update Pods in the CollaSet when a revision is made to Template.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-22T06:19:56.968Z[Etc/UTC]")
public class V1alpha1CollaSetSpecUpdateStrategy {
  public static final String SERIALIZED_NAME_OPERATION_DELAY_SECONDS = "operationDelaySeconds";
  @SerializedName(SERIALIZED_NAME_OPERATION_DELAY_SECONDS)
  private Integer operationDelaySeconds;

  public static final String SERIALIZED_NAME_POD_UPGRADE_POLICY = "podUpgradePolicy";
  @SerializedName(SERIALIZED_NAME_POD_UPGRADE_POLICY)
  private String podUpgradePolicy;

  public static final String SERIALIZED_NAME_ROLLING_UPDATE = "rollingUpdate";
  @SerializedName(SERIALIZED_NAME_ROLLING_UPDATE)
  private V1alpha1CollaSetSpecUpdateStrategyRollingUpdate rollingUpdate;


  public V1alpha1CollaSetSpecUpdateStrategy operationDelaySeconds(Integer operationDelaySeconds) {
    
    this.operationDelaySeconds = operationDelaySeconds;
    return this;
  }

   /**
   * OperationDelaySeconds indicates how many seconds it should delay before operating update.
   * @return operationDelaySeconds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "OperationDelaySeconds indicates how many seconds it should delay before operating update.")

  public Integer getOperationDelaySeconds() {
    return operationDelaySeconds;
  }


  public void setOperationDelaySeconds(Integer operationDelaySeconds) {
    this.operationDelaySeconds = operationDelaySeconds;
  }


  public V1alpha1CollaSetSpecUpdateStrategy podUpgradePolicy(String podUpgradePolicy) {
    
    this.podUpgradePolicy = podUpgradePolicy;
    return this;
  }

   /**
   * PodUpdatePolicy indicates the policy by to update pods.
   * @return podUpgradePolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "PodUpdatePolicy indicates the policy by to update pods.")

  public String getPodUpgradePolicy() {
    return podUpgradePolicy;
  }


  public void setPodUpgradePolicy(String podUpgradePolicy) {
    this.podUpgradePolicy = podUpgradePolicy;
  }


  public V1alpha1CollaSetSpecUpdateStrategy rollingUpdate(V1alpha1CollaSetSpecUpdateStrategyRollingUpdate rollingUpdate) {
    
    this.rollingUpdate = rollingUpdate;
    return this;
  }

   /**
   * Get rollingUpdate
   * @return rollingUpdate
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1CollaSetSpecUpdateStrategyRollingUpdate getRollingUpdate() {
    return rollingUpdate;
  }


  public void setRollingUpdate(V1alpha1CollaSetSpecUpdateStrategyRollingUpdate rollingUpdate) {
    this.rollingUpdate = rollingUpdate;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1CollaSetSpecUpdateStrategy v1alpha1CollaSetSpecUpdateStrategy = (V1alpha1CollaSetSpecUpdateStrategy) o;
    return Objects.equals(this.operationDelaySeconds, v1alpha1CollaSetSpecUpdateStrategy.operationDelaySeconds) &&
        Objects.equals(this.podUpgradePolicy, v1alpha1CollaSetSpecUpdateStrategy.podUpgradePolicy) &&
        Objects.equals(this.rollingUpdate, v1alpha1CollaSetSpecUpdateStrategy.rollingUpdate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operationDelaySeconds, podUpgradePolicy, rollingUpdate);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1CollaSetSpecUpdateStrategy {\n");
    sb.append("    operationDelaySeconds: ").append(toIndentedString(operationDelaySeconds)).append("\n");
    sb.append("    podUpgradePolicy: ").append(toIndentedString(podUpgradePolicy)).append("\n");
    sb.append("    rollingUpdate: ").append(toIndentedString(rollingUpdate)).append("\n");
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

