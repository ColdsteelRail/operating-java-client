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
import io.kusionstack.models.V1alpha1PodTransitionRuleSpecWebhookClientConfigPoll;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * ClientConfig is the configuration for accessing webhook.
 */
@ApiModel(description = "ClientConfig is the configuration for accessing webhook.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-22T06:52:16.042Z[Etc/UTC]")
public class V1alpha1PodTransitionRuleSpecWebhookClientConfig {
  public static final String SERIALIZED_NAME_CA_BUNDLE = "caBundle";
  @SerializedName(SERIALIZED_NAME_CA_BUNDLE)
  private String caBundle;

  public static final String SERIALIZED_NAME_POLL = "poll";
  @SerializedName(SERIALIZED_NAME_POLL)
  private V1alpha1PodTransitionRuleSpecWebhookClientConfigPoll poll;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;


  public V1alpha1PodTransitionRuleSpecWebhookClientConfig caBundle(String caBundle) {
    
    this.caBundle = caBundle;
    return this;
  }

   /**
   * CABundle is a PEM encoded CA bundle which will be used to validate the webhook&#39;s server certificate.
   * @return caBundle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "CABundle is a PEM encoded CA bundle which will be used to validate the webhook's server certificate.")

  public String getCaBundle() {
    return caBundle;
  }


  public void setCaBundle(String caBundle) {
    this.caBundle = caBundle;
  }


  public V1alpha1PodTransitionRuleSpecWebhookClientConfig poll(V1alpha1PodTransitionRuleSpecWebhookClientConfigPoll poll) {
    
    this.poll = poll;
    return this;
  }

   /**
   * Get poll
   * @return poll
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1PodTransitionRuleSpecWebhookClientConfigPoll getPoll() {
    return poll;
  }


  public void setPoll(V1alpha1PodTransitionRuleSpecWebhookClientConfigPoll poll) {
    this.poll = poll;
  }


  public V1alpha1PodTransitionRuleSpecWebhookClientConfig url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * URL gives the location of the webhook.
   * @return url
  **/
  @ApiModelProperty(required = true, value = "URL gives the location of the webhook.")

  public String getUrl() {
    return url;
  }


  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1PodTransitionRuleSpecWebhookClientConfig v1alpha1PodTransitionRuleSpecWebhookClientConfig = (V1alpha1PodTransitionRuleSpecWebhookClientConfig) o;
    return Objects.equals(this.caBundle, v1alpha1PodTransitionRuleSpecWebhookClientConfig.caBundle) &&
        Objects.equals(this.poll, v1alpha1PodTransitionRuleSpecWebhookClientConfig.poll) &&
        Objects.equals(this.url, v1alpha1PodTransitionRuleSpecWebhookClientConfig.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(caBundle, poll, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1PodTransitionRuleSpecWebhookClientConfig {\n");
    sb.append("    caBundle: ").append(toIndentedString(caBundle)).append("\n");
    sb.append("    poll: ").append(toIndentedString(poll)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

