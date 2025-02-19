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
import io.kusionstack.models.V1alpha1PodDecorationSpecTemplateEnv;
import io.kusionstack.models.V1alpha1PodDecorationSpecTemplateEnvFrom;
import io.kusionstack.models.V1alpha1PodDecorationSpecTemplateLifecycle;
import io.kusionstack.models.V1alpha1PodDecorationSpecTemplateLivenessProbe;
import io.kusionstack.models.V1alpha1PodDecorationSpecTemplatePorts;
import io.kusionstack.models.V1alpha1PodDecorationSpecTemplateReadinessProbe;
import io.kusionstack.models.V1alpha1PodDecorationSpecTemplateResources;
import io.kusionstack.models.V1alpha1PodDecorationSpecTemplateSecurityContext;
import io.kusionstack.models.V1alpha1PodDecorationSpecTemplateStartupProbe;
import io.kusionstack.models.V1alpha1PodDecorationSpecTemplateVolumeDevices;
import io.kusionstack.models.V1alpha1PodDecorationSpecTemplateVolumeMounts;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * A single application container that you want to run within a pod.
 */
@ApiModel(description = "A single application container that you want to run within a pod.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-22T06:24:47.231Z[Etc/UTC]")
public class V1alpha1PodDecorationSpecTemplateInitContainers {
  public static final String SERIALIZED_NAME_ARGS = "args";
  @SerializedName(SERIALIZED_NAME_ARGS)
  private List<String> args = null;

  public static final String SERIALIZED_NAME_COMMAND = "command";
  @SerializedName(SERIALIZED_NAME_COMMAND)
  private List<String> command = null;

  public static final String SERIALIZED_NAME_ENV = "env";
  @SerializedName(SERIALIZED_NAME_ENV)
  private List<V1alpha1PodDecorationSpecTemplateEnv> env = null;

  public static final String SERIALIZED_NAME_ENV_FROM = "envFrom";
  @SerializedName(SERIALIZED_NAME_ENV_FROM)
  private List<V1alpha1PodDecorationSpecTemplateEnvFrom> envFrom = null;

  public static final String SERIALIZED_NAME_IMAGE = "image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  private String image;

  public static final String SERIALIZED_NAME_IMAGE_PULL_POLICY = "imagePullPolicy";
  @SerializedName(SERIALIZED_NAME_IMAGE_PULL_POLICY)
  private String imagePullPolicy;

  public static final String SERIALIZED_NAME_LIFECYCLE = "lifecycle";
  @SerializedName(SERIALIZED_NAME_LIFECYCLE)
  private V1alpha1PodDecorationSpecTemplateLifecycle lifecycle;

  public static final String SERIALIZED_NAME_LIVENESS_PROBE = "livenessProbe";
  @SerializedName(SERIALIZED_NAME_LIVENESS_PROBE)
  private V1alpha1PodDecorationSpecTemplateLivenessProbe livenessProbe;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PORTS = "ports";
  @SerializedName(SERIALIZED_NAME_PORTS)
  private List<V1alpha1PodDecorationSpecTemplatePorts> ports = null;

  public static final String SERIALIZED_NAME_READINESS_PROBE = "readinessProbe";
  @SerializedName(SERIALIZED_NAME_READINESS_PROBE)
  private V1alpha1PodDecorationSpecTemplateReadinessProbe readinessProbe;

  public static final String SERIALIZED_NAME_RESOURCES = "resources";
  @SerializedName(SERIALIZED_NAME_RESOURCES)
  private V1alpha1PodDecorationSpecTemplateResources resources;

  public static final String SERIALIZED_NAME_SECURITY_CONTEXT = "securityContext";
  @SerializedName(SERIALIZED_NAME_SECURITY_CONTEXT)
  private V1alpha1PodDecorationSpecTemplateSecurityContext securityContext;

  public static final String SERIALIZED_NAME_STARTUP_PROBE = "startupProbe";
  @SerializedName(SERIALIZED_NAME_STARTUP_PROBE)
  private V1alpha1PodDecorationSpecTemplateStartupProbe startupProbe;

  public static final String SERIALIZED_NAME_STDIN = "stdin";
  @SerializedName(SERIALIZED_NAME_STDIN)
  private Boolean stdin;

  public static final String SERIALIZED_NAME_STDIN_ONCE = "stdinOnce";
  @SerializedName(SERIALIZED_NAME_STDIN_ONCE)
  private Boolean stdinOnce;

  public static final String SERIALIZED_NAME_TERMINATION_MESSAGE_PATH = "terminationMessagePath";
  @SerializedName(SERIALIZED_NAME_TERMINATION_MESSAGE_PATH)
  private String terminationMessagePath;

  public static final String SERIALIZED_NAME_TERMINATION_MESSAGE_POLICY = "terminationMessagePolicy";
  @SerializedName(SERIALIZED_NAME_TERMINATION_MESSAGE_POLICY)
  private String terminationMessagePolicy;

  public static final String SERIALIZED_NAME_TTY = "tty";
  @SerializedName(SERIALIZED_NAME_TTY)
  private Boolean tty;

  public static final String SERIALIZED_NAME_VOLUME_DEVICES = "volumeDevices";
  @SerializedName(SERIALIZED_NAME_VOLUME_DEVICES)
  private List<V1alpha1PodDecorationSpecTemplateVolumeDevices> volumeDevices = null;

  public static final String SERIALIZED_NAME_VOLUME_MOUNTS = "volumeMounts";
  @SerializedName(SERIALIZED_NAME_VOLUME_MOUNTS)
  private List<V1alpha1PodDecorationSpecTemplateVolumeMounts> volumeMounts = null;

  public static final String SERIALIZED_NAME_WORKING_DIR = "workingDir";
  @SerializedName(SERIALIZED_NAME_WORKING_DIR)
  private String workingDir;


  public V1alpha1PodDecorationSpecTemplateInitContainers args(List<String> args) {
    
    this.args = args;
    return this;
  }

  public V1alpha1PodDecorationSpecTemplateInitContainers addArgsItem(String argsItem) {
    if (this.args == null) {
      this.args = new ArrayList<>();
    }
    this.args.add(argsItem);
    return this;
  }

   /**
   * Arguments to the entrypoint. The docker image&#39;s CMD is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container&#39;s environment. If a variable cannot be resolved, the reference in the input string will be unchanged. Double $$ are reduced to a single $, which allows for escaping the $(VAR_NAME) syntax: i.e. \&quot;$$(VAR_NAME)\&quot; will produce the string literal \&quot;$(VAR_NAME)\&quot;. Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
   * @return args
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Arguments to the entrypoint. The docker image's CMD is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be unchanged. Double $$ are reduced to a single $, which allows for escaping the $(VAR_NAME) syntax: i.e. \"$$(VAR_NAME)\" will produce the string literal \"$(VAR_NAME)\". Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell")

  public List<String> getArgs() {
    return args;
  }


  public void setArgs(List<String> args) {
    this.args = args;
  }


  public V1alpha1PodDecorationSpecTemplateInitContainers command(List<String> command) {
    
    this.command = command;
    return this;
  }

  public V1alpha1PodDecorationSpecTemplateInitContainers addCommandItem(String commandItem) {
    if (this.command == null) {
      this.command = new ArrayList<>();
    }
    this.command.add(commandItem);
    return this;
  }

   /**
   * Entrypoint array. Not executed within a shell. The docker image&#39;s ENTRYPOINT is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container&#39;s environment. If a variable cannot be resolved, the reference in the input string will be unchanged. Double $$ are reduced to a single $, which allows for escaping the $(VAR_NAME) syntax: i.e. \&quot;$$(VAR_NAME)\&quot; will produce the string literal \&quot;$(VAR_NAME)\&quot;. Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
   * @return command
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Entrypoint array. Not executed within a shell. The docker image's ENTRYPOINT is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be unchanged. Double $$ are reduced to a single $, which allows for escaping the $(VAR_NAME) syntax: i.e. \"$$(VAR_NAME)\" will produce the string literal \"$(VAR_NAME)\". Escaped references will never be expanded, regardless of whether the variable exists or not. Cannot be updated. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell")

  public List<String> getCommand() {
    return command;
  }


  public void setCommand(List<String> command) {
    this.command = command;
  }


  public V1alpha1PodDecorationSpecTemplateInitContainers env(List<V1alpha1PodDecorationSpecTemplateEnv> env) {
    
    this.env = env;
    return this;
  }

  public V1alpha1PodDecorationSpecTemplateInitContainers addEnvItem(V1alpha1PodDecorationSpecTemplateEnv envItem) {
    if (this.env == null) {
      this.env = new ArrayList<>();
    }
    this.env.add(envItem);
    return this;
  }

   /**
   * List of environment variables to set in the container. Cannot be updated.
   * @return env
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of environment variables to set in the container. Cannot be updated.")

  public List<V1alpha1PodDecorationSpecTemplateEnv> getEnv() {
    return env;
  }


  public void setEnv(List<V1alpha1PodDecorationSpecTemplateEnv> env) {
    this.env = env;
  }


  public V1alpha1PodDecorationSpecTemplateInitContainers envFrom(List<V1alpha1PodDecorationSpecTemplateEnvFrom> envFrom) {
    
    this.envFrom = envFrom;
    return this;
  }

  public V1alpha1PodDecorationSpecTemplateInitContainers addEnvFromItem(V1alpha1PodDecorationSpecTemplateEnvFrom envFromItem) {
    if (this.envFrom == null) {
      this.envFrom = new ArrayList<>();
    }
    this.envFrom.add(envFromItem);
    return this;
  }

   /**
   * List of sources to populate environment variables in the container. The keys defined within a source must be a C_IDENTIFIER. All invalid keys will be reported as an event when the container is starting. When a key exists in multiple sources, the value associated with the last source will take precedence. Values defined by an Env with a duplicate key will take precedence. Cannot be updated.
   * @return envFrom
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of sources to populate environment variables in the container. The keys defined within a source must be a C_IDENTIFIER. All invalid keys will be reported as an event when the container is starting. When a key exists in multiple sources, the value associated with the last source will take precedence. Values defined by an Env with a duplicate key will take precedence. Cannot be updated.")

  public List<V1alpha1PodDecorationSpecTemplateEnvFrom> getEnvFrom() {
    return envFrom;
  }


  public void setEnvFrom(List<V1alpha1PodDecorationSpecTemplateEnvFrom> envFrom) {
    this.envFrom = envFrom;
  }


  public V1alpha1PodDecorationSpecTemplateInitContainers image(String image) {
    
    this.image = image;
    return this;
  }

   /**
   * Docker image name. More info: https://kubernetes.io/docs/concepts/containers/images This field is optional to allow higher level config management to default or override container images in workload controllers like Deployments and StatefulSets.
   * @return image
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Docker image name. More info: https://kubernetes.io/docs/concepts/containers/images This field is optional to allow higher level config management to default or override container images in workload controllers like Deployments and StatefulSets.")

  public String getImage() {
    return image;
  }


  public void setImage(String image) {
    this.image = image;
  }


  public V1alpha1PodDecorationSpecTemplateInitContainers imagePullPolicy(String imagePullPolicy) {
    
    this.imagePullPolicy = imagePullPolicy;
    return this;
  }

   /**
   * Image pull policy. One of Always, Never, IfNotPresent. Defaults to Always if :latest tag is specified, or IfNotPresent otherwise. Cannot be updated. More info: https://kubernetes.io/docs/concepts/containers/images#updating-images
   * @return imagePullPolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Image pull policy. One of Always, Never, IfNotPresent. Defaults to Always if :latest tag is specified, or IfNotPresent otherwise. Cannot be updated. More info: https://kubernetes.io/docs/concepts/containers/images#updating-images")

  public String getImagePullPolicy() {
    return imagePullPolicy;
  }


  public void setImagePullPolicy(String imagePullPolicy) {
    this.imagePullPolicy = imagePullPolicy;
  }


  public V1alpha1PodDecorationSpecTemplateInitContainers lifecycle(V1alpha1PodDecorationSpecTemplateLifecycle lifecycle) {
    
    this.lifecycle = lifecycle;
    return this;
  }

   /**
   * Get lifecycle
   * @return lifecycle
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1PodDecorationSpecTemplateLifecycle getLifecycle() {
    return lifecycle;
  }


  public void setLifecycle(V1alpha1PodDecorationSpecTemplateLifecycle lifecycle) {
    this.lifecycle = lifecycle;
  }


  public V1alpha1PodDecorationSpecTemplateInitContainers livenessProbe(V1alpha1PodDecorationSpecTemplateLivenessProbe livenessProbe) {
    
    this.livenessProbe = livenessProbe;
    return this;
  }

   /**
   * Get livenessProbe
   * @return livenessProbe
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1PodDecorationSpecTemplateLivenessProbe getLivenessProbe() {
    return livenessProbe;
  }


  public void setLivenessProbe(V1alpha1PodDecorationSpecTemplateLivenessProbe livenessProbe) {
    this.livenessProbe = livenessProbe;
  }


  public V1alpha1PodDecorationSpecTemplateInitContainers name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Name of the container specified as a DNS_LABEL. Each container in a pod must have a unique name (DNS_LABEL). Cannot be updated.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the container specified as a DNS_LABEL. Each container in a pod must have a unique name (DNS_LABEL). Cannot be updated.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1alpha1PodDecorationSpecTemplateInitContainers ports(List<V1alpha1PodDecorationSpecTemplatePorts> ports) {
    
    this.ports = ports;
    return this;
  }

  public V1alpha1PodDecorationSpecTemplateInitContainers addPortsItem(V1alpha1PodDecorationSpecTemplatePorts portsItem) {
    if (this.ports == null) {
      this.ports = new ArrayList<>();
    }
    this.ports.add(portsItem);
    return this;
  }

   /**
   * List of ports to expose from the container. Exposing a port here gives the system additional information about the network connections a container uses, but is primarily informational. Not specifying a port here DOES NOT prevent that port from being exposed. Any port which is listening on the default \&quot;0.0.0.0\&quot; address inside a container will be accessible from the network. Cannot be updated.
   * @return ports
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of ports to expose from the container. Exposing a port here gives the system additional information about the network connections a container uses, but is primarily informational. Not specifying a port here DOES NOT prevent that port from being exposed. Any port which is listening on the default \"0.0.0.0\" address inside a container will be accessible from the network. Cannot be updated.")

  public List<V1alpha1PodDecorationSpecTemplatePorts> getPorts() {
    return ports;
  }


  public void setPorts(List<V1alpha1PodDecorationSpecTemplatePorts> ports) {
    this.ports = ports;
  }


  public V1alpha1PodDecorationSpecTemplateInitContainers readinessProbe(V1alpha1PodDecorationSpecTemplateReadinessProbe readinessProbe) {
    
    this.readinessProbe = readinessProbe;
    return this;
  }

   /**
   * Get readinessProbe
   * @return readinessProbe
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1PodDecorationSpecTemplateReadinessProbe getReadinessProbe() {
    return readinessProbe;
  }


  public void setReadinessProbe(V1alpha1PodDecorationSpecTemplateReadinessProbe readinessProbe) {
    this.readinessProbe = readinessProbe;
  }


  public V1alpha1PodDecorationSpecTemplateInitContainers resources(V1alpha1PodDecorationSpecTemplateResources resources) {
    
    this.resources = resources;
    return this;
  }

   /**
   * Get resources
   * @return resources
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1PodDecorationSpecTemplateResources getResources() {
    return resources;
  }


  public void setResources(V1alpha1PodDecorationSpecTemplateResources resources) {
    this.resources = resources;
  }


  public V1alpha1PodDecorationSpecTemplateInitContainers securityContext(V1alpha1PodDecorationSpecTemplateSecurityContext securityContext) {
    
    this.securityContext = securityContext;
    return this;
  }

   /**
   * Get securityContext
   * @return securityContext
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1PodDecorationSpecTemplateSecurityContext getSecurityContext() {
    return securityContext;
  }


  public void setSecurityContext(V1alpha1PodDecorationSpecTemplateSecurityContext securityContext) {
    this.securityContext = securityContext;
  }


  public V1alpha1PodDecorationSpecTemplateInitContainers startupProbe(V1alpha1PodDecorationSpecTemplateStartupProbe startupProbe) {
    
    this.startupProbe = startupProbe;
    return this;
  }

   /**
   * Get startupProbe
   * @return startupProbe
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1PodDecorationSpecTemplateStartupProbe getStartupProbe() {
    return startupProbe;
  }


  public void setStartupProbe(V1alpha1PodDecorationSpecTemplateStartupProbe startupProbe) {
    this.startupProbe = startupProbe;
  }


  public V1alpha1PodDecorationSpecTemplateInitContainers stdin(Boolean stdin) {
    
    this.stdin = stdin;
    return this;
  }

   /**
   * Whether this container should allocate a buffer for stdin in the container runtime. If this is not set, reads from stdin in the container will always result in EOF. Default is false.
   * @return stdin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether this container should allocate a buffer for stdin in the container runtime. If this is not set, reads from stdin in the container will always result in EOF. Default is false.")

  public Boolean getStdin() {
    return stdin;
  }


  public void setStdin(Boolean stdin) {
    this.stdin = stdin;
  }


  public V1alpha1PodDecorationSpecTemplateInitContainers stdinOnce(Boolean stdinOnce) {
    
    this.stdinOnce = stdinOnce;
    return this;
  }

   /**
   * Whether the container runtime should close the stdin channel after it has been opened by a single attach. When stdin is true the stdin stream will remain open across multiple attach sessions. If stdinOnce is set to true, stdin is opened on container start, is empty until the first client attaches to stdin, and then remains open and accepts data until the client disconnects, at which time stdin is closed and remains closed until the container is restarted. If this flag is false, a container processes that reads from stdin will never receive an EOF. Default is false
   * @return stdinOnce
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether the container runtime should close the stdin channel after it has been opened by a single attach. When stdin is true the stdin stream will remain open across multiple attach sessions. If stdinOnce is set to true, stdin is opened on container start, is empty until the first client attaches to stdin, and then remains open and accepts data until the client disconnects, at which time stdin is closed and remains closed until the container is restarted. If this flag is false, a container processes that reads from stdin will never receive an EOF. Default is false")

  public Boolean getStdinOnce() {
    return stdinOnce;
  }


  public void setStdinOnce(Boolean stdinOnce) {
    this.stdinOnce = stdinOnce;
  }


  public V1alpha1PodDecorationSpecTemplateInitContainers terminationMessagePath(String terminationMessagePath) {
    
    this.terminationMessagePath = terminationMessagePath;
    return this;
  }

   /**
   * Optional: Path at which the file to which the container&#39;s termination message will be written is mounted into the container&#39;s filesystem. Message written is intended to be brief final status, such as an assertion failure message. Will be truncated by the node if greater than 4096 bytes. The total message length across all containers will be limited to 12kb. Defaults to /dev/termination-log. Cannot be updated.
   * @return terminationMessagePath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Optional: Path at which the file to which the container's termination message will be written is mounted into the container's filesystem. Message written is intended to be brief final status, such as an assertion failure message. Will be truncated by the node if greater than 4096 bytes. The total message length across all containers will be limited to 12kb. Defaults to /dev/termination-log. Cannot be updated.")

  public String getTerminationMessagePath() {
    return terminationMessagePath;
  }


  public void setTerminationMessagePath(String terminationMessagePath) {
    this.terminationMessagePath = terminationMessagePath;
  }


  public V1alpha1PodDecorationSpecTemplateInitContainers terminationMessagePolicy(String terminationMessagePolicy) {
    
    this.terminationMessagePolicy = terminationMessagePolicy;
    return this;
  }

   /**
   * Indicate how the termination message should be populated. File will use the contents of terminationMessagePath to populate the container status message on both success and failure. FallbackToLogsOnError will use the last chunk of container log output if the termination message file is empty and the container exited with an error. The log output is limited to 2048 bytes or 80 lines, whichever is smaller. Defaults to File. Cannot be updated.
   * @return terminationMessagePolicy
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Indicate how the termination message should be populated. File will use the contents of terminationMessagePath to populate the container status message on both success and failure. FallbackToLogsOnError will use the last chunk of container log output if the termination message file is empty and the container exited with an error. The log output is limited to 2048 bytes or 80 lines, whichever is smaller. Defaults to File. Cannot be updated.")

  public String getTerminationMessagePolicy() {
    return terminationMessagePolicy;
  }


  public void setTerminationMessagePolicy(String terminationMessagePolicy) {
    this.terminationMessagePolicy = terminationMessagePolicy;
  }


  public V1alpha1PodDecorationSpecTemplateInitContainers tty(Boolean tty) {
    
    this.tty = tty;
    return this;
  }

   /**
   * Whether this container should allocate a TTY for itself, also requires &#39;stdin&#39; to be true. Default is false.
   * @return tty
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Whether this container should allocate a TTY for itself, also requires 'stdin' to be true. Default is false.")

  public Boolean getTty() {
    return tty;
  }


  public void setTty(Boolean tty) {
    this.tty = tty;
  }


  public V1alpha1PodDecorationSpecTemplateInitContainers volumeDevices(List<V1alpha1PodDecorationSpecTemplateVolumeDevices> volumeDevices) {
    
    this.volumeDevices = volumeDevices;
    return this;
  }

  public V1alpha1PodDecorationSpecTemplateInitContainers addVolumeDevicesItem(V1alpha1PodDecorationSpecTemplateVolumeDevices volumeDevicesItem) {
    if (this.volumeDevices == null) {
      this.volumeDevices = new ArrayList<>();
    }
    this.volumeDevices.add(volumeDevicesItem);
    return this;
  }

   /**
   * volumeDevices is the list of block devices to be used by the container.
   * @return volumeDevices
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "volumeDevices is the list of block devices to be used by the container.")

  public List<V1alpha1PodDecorationSpecTemplateVolumeDevices> getVolumeDevices() {
    return volumeDevices;
  }


  public void setVolumeDevices(List<V1alpha1PodDecorationSpecTemplateVolumeDevices> volumeDevices) {
    this.volumeDevices = volumeDevices;
  }


  public V1alpha1PodDecorationSpecTemplateInitContainers volumeMounts(List<V1alpha1PodDecorationSpecTemplateVolumeMounts> volumeMounts) {
    
    this.volumeMounts = volumeMounts;
    return this;
  }

  public V1alpha1PodDecorationSpecTemplateInitContainers addVolumeMountsItem(V1alpha1PodDecorationSpecTemplateVolumeMounts volumeMountsItem) {
    if (this.volumeMounts == null) {
      this.volumeMounts = new ArrayList<>();
    }
    this.volumeMounts.add(volumeMountsItem);
    return this;
  }

   /**
   * Pod volumes to mount into the container&#39;s filesystem. Cannot be updated.
   * @return volumeMounts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Pod volumes to mount into the container's filesystem. Cannot be updated.")

  public List<V1alpha1PodDecorationSpecTemplateVolumeMounts> getVolumeMounts() {
    return volumeMounts;
  }


  public void setVolumeMounts(List<V1alpha1PodDecorationSpecTemplateVolumeMounts> volumeMounts) {
    this.volumeMounts = volumeMounts;
  }


  public V1alpha1PodDecorationSpecTemplateInitContainers workingDir(String workingDir) {
    
    this.workingDir = workingDir;
    return this;
  }

   /**
   * Container&#39;s working directory. If not specified, the container runtime&#39;s default will be used, which might be configured in the container image. Cannot be updated.
   * @return workingDir
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Container's working directory. If not specified, the container runtime's default will be used, which might be configured in the container image. Cannot be updated.")

  public String getWorkingDir() {
    return workingDir;
  }


  public void setWorkingDir(String workingDir) {
    this.workingDir = workingDir;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1PodDecorationSpecTemplateInitContainers v1alpha1PodDecorationSpecTemplateInitContainers = (V1alpha1PodDecorationSpecTemplateInitContainers) o;
    return Objects.equals(this.args, v1alpha1PodDecorationSpecTemplateInitContainers.args) &&
        Objects.equals(this.command, v1alpha1PodDecorationSpecTemplateInitContainers.command) &&
        Objects.equals(this.env, v1alpha1PodDecorationSpecTemplateInitContainers.env) &&
        Objects.equals(this.envFrom, v1alpha1PodDecorationSpecTemplateInitContainers.envFrom) &&
        Objects.equals(this.image, v1alpha1PodDecorationSpecTemplateInitContainers.image) &&
        Objects.equals(this.imagePullPolicy, v1alpha1PodDecorationSpecTemplateInitContainers.imagePullPolicy) &&
        Objects.equals(this.lifecycle, v1alpha1PodDecorationSpecTemplateInitContainers.lifecycle) &&
        Objects.equals(this.livenessProbe, v1alpha1PodDecorationSpecTemplateInitContainers.livenessProbe) &&
        Objects.equals(this.name, v1alpha1PodDecorationSpecTemplateInitContainers.name) &&
        Objects.equals(this.ports, v1alpha1PodDecorationSpecTemplateInitContainers.ports) &&
        Objects.equals(this.readinessProbe, v1alpha1PodDecorationSpecTemplateInitContainers.readinessProbe) &&
        Objects.equals(this.resources, v1alpha1PodDecorationSpecTemplateInitContainers.resources) &&
        Objects.equals(this.securityContext, v1alpha1PodDecorationSpecTemplateInitContainers.securityContext) &&
        Objects.equals(this.startupProbe, v1alpha1PodDecorationSpecTemplateInitContainers.startupProbe) &&
        Objects.equals(this.stdin, v1alpha1PodDecorationSpecTemplateInitContainers.stdin) &&
        Objects.equals(this.stdinOnce, v1alpha1PodDecorationSpecTemplateInitContainers.stdinOnce) &&
        Objects.equals(this.terminationMessagePath, v1alpha1PodDecorationSpecTemplateInitContainers.terminationMessagePath) &&
        Objects.equals(this.terminationMessagePolicy, v1alpha1PodDecorationSpecTemplateInitContainers.terminationMessagePolicy) &&
        Objects.equals(this.tty, v1alpha1PodDecorationSpecTemplateInitContainers.tty) &&
        Objects.equals(this.volumeDevices, v1alpha1PodDecorationSpecTemplateInitContainers.volumeDevices) &&
        Objects.equals(this.volumeMounts, v1alpha1PodDecorationSpecTemplateInitContainers.volumeMounts) &&
        Objects.equals(this.workingDir, v1alpha1PodDecorationSpecTemplateInitContainers.workingDir);
  }

  @Override
  public int hashCode() {
    return Objects.hash(args, command, env, envFrom, image, imagePullPolicy, lifecycle, livenessProbe, name, ports, readinessProbe, resources, securityContext, startupProbe, stdin, stdinOnce, terminationMessagePath, terminationMessagePolicy, tty, volumeDevices, volumeMounts, workingDir);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1PodDecorationSpecTemplateInitContainers {\n");
    sb.append("    args: ").append(toIndentedString(args)).append("\n");
    sb.append("    command: ").append(toIndentedString(command)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    envFrom: ").append(toIndentedString(envFrom)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    imagePullPolicy: ").append(toIndentedString(imagePullPolicy)).append("\n");
    sb.append("    lifecycle: ").append(toIndentedString(lifecycle)).append("\n");
    sb.append("    livenessProbe: ").append(toIndentedString(livenessProbe)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
    sb.append("    readinessProbe: ").append(toIndentedString(readinessProbe)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    securityContext: ").append(toIndentedString(securityContext)).append("\n");
    sb.append("    startupProbe: ").append(toIndentedString(startupProbe)).append("\n");
    sb.append("    stdin: ").append(toIndentedString(stdin)).append("\n");
    sb.append("    stdinOnce: ").append(toIndentedString(stdinOnce)).append("\n");
    sb.append("    terminationMessagePath: ").append(toIndentedString(terminationMessagePath)).append("\n");
    sb.append("    terminationMessagePolicy: ").append(toIndentedString(terminationMessagePolicy)).append("\n");
    sb.append("    tty: ").append(toIndentedString(tty)).append("\n");
    sb.append("    volumeDevices: ").append(toIndentedString(volumeDevices)).append("\n");
    sb.append("    volumeMounts: ").append(toIndentedString(volumeMounts)).append("\n");
    sb.append("    workingDir: ").append(toIndentedString(workingDir)).append("\n");
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

