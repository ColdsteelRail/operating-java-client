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
 * Poll is the polling to query url.
 */
@ApiModel(description = "Poll is the polling to query url.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-22T06:52:16.042Z[Etc/UTC]")
public class V1alpha1PodTransitionRuleSpecWebhookClientConfigPoll {
  public static final String SERIALIZED_NAME_CA_BUNDLE = "caBundle";
  @SerializedName(SERIALIZED_NAME_CA_BUNDLE)
  private String caBundle;

  public static final String SERIALIZED_NAME_INTERVAL_SECONDS = "intervalSeconds";
  @SerializedName(SERIALIZED_NAME_INTERVAL_SECONDS)
  private Long intervalSeconds;

  public static final String SERIALIZED_NAME_RAW_QUERY_KEY = "rawQueryKey";
  @SerializedName(SERIALIZED_NAME_RAW_QUERY_KEY)
  private String rawQueryKey;

  public static final String SERIALIZED_NAME_TIMEOUT_SECONDS = "timeoutSeconds";
  @SerializedName(SERIALIZED_NAME_TIMEOUT_SECONDS)
  private Long timeoutSeconds;

  public static final String SERIALIZED_NAME_URL = "url";
  @SerializedName(SERIALIZED_NAME_URL)
  private String url;


  public V1alpha1PodTransitionRuleSpecWebhookClientConfigPoll caBundle(String caBundle) {
    
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


  public V1alpha1PodTransitionRuleSpecWebhookClientConfigPoll intervalSeconds(Long intervalSeconds) {
    
    this.intervalSeconds = intervalSeconds;
    return this;
  }

   /**
   * Interval give the request time interval, default 5s
   * @return intervalSeconds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Interval give the request time interval, default 5s")

  public Long getIntervalSeconds() {
    return intervalSeconds;
  }


  public void setIntervalSeconds(Long intervalSeconds) {
    this.intervalSeconds = intervalSeconds;
  }


  public V1alpha1PodTransitionRuleSpecWebhookClientConfigPoll rawQueryKey(String rawQueryKey) {
    
    this.rawQueryKey = rawQueryKey;
    return this;
  }

   /**
   * ReplaceRawQuery used to replace raw key. QueryUrl&#x3D;URL?rawQueryKey&#x3D;&lt;task-id&gt;, default is task-id
   * @return rawQueryKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ReplaceRawQuery used to replace raw key. QueryUrl=URL?rawQueryKey=<task-id>, default is task-id")

  public String getRawQueryKey() {
    return rawQueryKey;
  }


  public void setRawQueryKey(String rawQueryKey) {
    this.rawQueryKey = rawQueryKey;
  }


  public V1alpha1PodTransitionRuleSpecWebhookClientConfigPoll timeoutSeconds(Long timeoutSeconds) {
    
    this.timeoutSeconds = timeoutSeconds;
    return this;
  }

   /**
   * TimeoutSeconds give the request time timeout, default 60s
   * @return timeoutSeconds
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "TimeoutSeconds give the request time timeout, default 60s")

  public Long getTimeoutSeconds() {
    return timeoutSeconds;
  }


  public void setTimeoutSeconds(Long timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
  }


  public V1alpha1PodTransitionRuleSpecWebhookClientConfigPoll url(String url) {
    
    this.url = url;
    return this;
  }

   /**
   * URL gives the location of the webhook, URL?task-id&#x3D;&lt;task-id&gt;
   * @return url
  **/
  @ApiModelProperty(required = true, value = "URL gives the location of the webhook, URL?task-id=<task-id>")

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
    V1alpha1PodTransitionRuleSpecWebhookClientConfigPoll v1alpha1PodTransitionRuleSpecWebhookClientConfigPoll = (V1alpha1PodTransitionRuleSpecWebhookClientConfigPoll) o;
    return Objects.equals(this.caBundle, v1alpha1PodTransitionRuleSpecWebhookClientConfigPoll.caBundle) &&
        Objects.equals(this.intervalSeconds, v1alpha1PodTransitionRuleSpecWebhookClientConfigPoll.intervalSeconds) &&
        Objects.equals(this.rawQueryKey, v1alpha1PodTransitionRuleSpecWebhookClientConfigPoll.rawQueryKey) &&
        Objects.equals(this.timeoutSeconds, v1alpha1PodTransitionRuleSpecWebhookClientConfigPoll.timeoutSeconds) &&
        Objects.equals(this.url, v1alpha1PodTransitionRuleSpecWebhookClientConfigPoll.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(caBundle, intervalSeconds, rawQueryKey, timeoutSeconds, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1PodTransitionRuleSpecWebhookClientConfigPoll {\n");
    sb.append("    caBundle: ").append(toIndentedString(caBundle)).append("\n");
    sb.append("    intervalSeconds: ").append(toIndentedString(intervalSeconds)).append("\n");
    sb.append("    rawQueryKey: ").append(toIndentedString(rawQueryKey)).append("\n");
    sb.append("    timeoutSeconds: ").append(toIndentedString(timeoutSeconds)).append("\n");
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

