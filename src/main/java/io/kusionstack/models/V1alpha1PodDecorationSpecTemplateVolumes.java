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
import io.kusionstack.models.V1alpha1PodDecorationSpecTemplateAwsElasticBlockStore;
import io.kusionstack.models.V1alpha1PodDecorationSpecTemplateAzureDisk;
import io.kusionstack.models.V1alpha1PodDecorationSpecTemplateAzureFile;
import io.kusionstack.models.V1alpha1PodDecorationSpecTemplateCephfs;
import io.kusionstack.models.V1alpha1PodDecorationSpecTemplateCinder;
import io.kusionstack.models.V1alpha1PodDecorationSpecTemplateConfigMap;
import io.kusionstack.models.V1alpha1PodDecorationSpecTemplateCsi;
import io.kusionstack.models.V1alpha1PodDecorationSpecTemplateDownwardAPI;
import io.kusionstack.models.V1alpha1PodDecorationSpecTemplateEmptyDir;
import io.kusionstack.models.V1alpha1PodDecorationSpecTemplateEphemeral;
import io.kusionstack.models.V1alpha1PodDecorationSpecTemplateFc;
import io.kusionstack.models.V1alpha1PodDecorationSpecTemplateFlexVolume;
import io.kusionstack.models.V1alpha1PodDecorationSpecTemplateFlocker;
import io.kusionstack.models.V1alpha1PodDecorationSpecTemplateGcePersistentDisk;
import io.kusionstack.models.V1alpha1PodDecorationSpecTemplateGitRepo;
import io.kusionstack.models.V1alpha1PodDecorationSpecTemplateGlusterfs;
import io.kusionstack.models.V1alpha1PodDecorationSpecTemplateHostPath;
import io.kusionstack.models.V1alpha1PodDecorationSpecTemplateIscsi;
import io.kusionstack.models.V1alpha1PodDecorationSpecTemplateNfs;
import io.kusionstack.models.V1alpha1PodDecorationSpecTemplatePersistentVolumeClaim;
import io.kusionstack.models.V1alpha1PodDecorationSpecTemplatePhotonPersistentDisk;
import io.kusionstack.models.V1alpha1PodDecorationSpecTemplatePortworxVolume;
import io.kusionstack.models.V1alpha1PodDecorationSpecTemplateProjected;
import io.kusionstack.models.V1alpha1PodDecorationSpecTemplateQuobyte;
import io.kusionstack.models.V1alpha1PodDecorationSpecTemplateRbd;
import io.kusionstack.models.V1alpha1PodDecorationSpecTemplateScaleIO;
import io.kusionstack.models.V1alpha1PodDecorationSpecTemplateSecret;
import io.kusionstack.models.V1alpha1PodDecorationSpecTemplateStorageos;
import io.kusionstack.models.V1alpha1PodDecorationSpecTemplateVsphereVolume;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Volume represents a named volume in a pod that may be accessed by any container in the pod.
 */
@ApiModel(description = "Volume represents a named volume in a pod that may be accessed by any container in the pod.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-07-22T06:24:47.231Z[Etc/UTC]")
public class V1alpha1PodDecorationSpecTemplateVolumes {
  public static final String SERIALIZED_NAME_AWS_ELASTIC_BLOCK_STORE = "awsElasticBlockStore";
  @SerializedName(SERIALIZED_NAME_AWS_ELASTIC_BLOCK_STORE)
  private V1alpha1PodDecorationSpecTemplateAwsElasticBlockStore awsElasticBlockStore;

  public static final String SERIALIZED_NAME_AZURE_DISK = "azureDisk";
  @SerializedName(SERIALIZED_NAME_AZURE_DISK)
  private V1alpha1PodDecorationSpecTemplateAzureDisk azureDisk;

  public static final String SERIALIZED_NAME_AZURE_FILE = "azureFile";
  @SerializedName(SERIALIZED_NAME_AZURE_FILE)
  private V1alpha1PodDecorationSpecTemplateAzureFile azureFile;

  public static final String SERIALIZED_NAME_CEPHFS = "cephfs";
  @SerializedName(SERIALIZED_NAME_CEPHFS)
  private V1alpha1PodDecorationSpecTemplateCephfs cephfs;

  public static final String SERIALIZED_NAME_CINDER = "cinder";
  @SerializedName(SERIALIZED_NAME_CINDER)
  private V1alpha1PodDecorationSpecTemplateCinder cinder;

  public static final String SERIALIZED_NAME_CONFIG_MAP = "configMap";
  @SerializedName(SERIALIZED_NAME_CONFIG_MAP)
  private V1alpha1PodDecorationSpecTemplateConfigMap configMap;

  public static final String SERIALIZED_NAME_CSI = "csi";
  @SerializedName(SERIALIZED_NAME_CSI)
  private V1alpha1PodDecorationSpecTemplateCsi csi;

  public static final String SERIALIZED_NAME_DOWNWARD_A_P_I = "downwardAPI";
  @SerializedName(SERIALIZED_NAME_DOWNWARD_A_P_I)
  private V1alpha1PodDecorationSpecTemplateDownwardAPI downwardAPI;

  public static final String SERIALIZED_NAME_EMPTY_DIR = "emptyDir";
  @SerializedName(SERIALIZED_NAME_EMPTY_DIR)
  private V1alpha1PodDecorationSpecTemplateEmptyDir emptyDir;

  public static final String SERIALIZED_NAME_EPHEMERAL = "ephemeral";
  @SerializedName(SERIALIZED_NAME_EPHEMERAL)
  private V1alpha1PodDecorationSpecTemplateEphemeral ephemeral;

  public static final String SERIALIZED_NAME_FC = "fc";
  @SerializedName(SERIALIZED_NAME_FC)
  private V1alpha1PodDecorationSpecTemplateFc fc;

  public static final String SERIALIZED_NAME_FLEX_VOLUME = "flexVolume";
  @SerializedName(SERIALIZED_NAME_FLEX_VOLUME)
  private V1alpha1PodDecorationSpecTemplateFlexVolume flexVolume;

  public static final String SERIALIZED_NAME_FLOCKER = "flocker";
  @SerializedName(SERIALIZED_NAME_FLOCKER)
  private V1alpha1PodDecorationSpecTemplateFlocker flocker;

  public static final String SERIALIZED_NAME_GCE_PERSISTENT_DISK = "gcePersistentDisk";
  @SerializedName(SERIALIZED_NAME_GCE_PERSISTENT_DISK)
  private V1alpha1PodDecorationSpecTemplateGcePersistentDisk gcePersistentDisk;

  public static final String SERIALIZED_NAME_GIT_REPO = "gitRepo";
  @SerializedName(SERIALIZED_NAME_GIT_REPO)
  private V1alpha1PodDecorationSpecTemplateGitRepo gitRepo;

  public static final String SERIALIZED_NAME_GLUSTERFS = "glusterfs";
  @SerializedName(SERIALIZED_NAME_GLUSTERFS)
  private V1alpha1PodDecorationSpecTemplateGlusterfs glusterfs;

  public static final String SERIALIZED_NAME_HOST_PATH = "hostPath";
  @SerializedName(SERIALIZED_NAME_HOST_PATH)
  private V1alpha1PodDecorationSpecTemplateHostPath hostPath;

  public static final String SERIALIZED_NAME_ISCSI = "iscsi";
  @SerializedName(SERIALIZED_NAME_ISCSI)
  private V1alpha1PodDecorationSpecTemplateIscsi iscsi;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NFS = "nfs";
  @SerializedName(SERIALIZED_NAME_NFS)
  private V1alpha1PodDecorationSpecTemplateNfs nfs;

  public static final String SERIALIZED_NAME_PERSISTENT_VOLUME_CLAIM = "persistentVolumeClaim";
  @SerializedName(SERIALIZED_NAME_PERSISTENT_VOLUME_CLAIM)
  private V1alpha1PodDecorationSpecTemplatePersistentVolumeClaim persistentVolumeClaim;

  public static final String SERIALIZED_NAME_PHOTON_PERSISTENT_DISK = "photonPersistentDisk";
  @SerializedName(SERIALIZED_NAME_PHOTON_PERSISTENT_DISK)
  private V1alpha1PodDecorationSpecTemplatePhotonPersistentDisk photonPersistentDisk;

  public static final String SERIALIZED_NAME_PORTWORX_VOLUME = "portworxVolume";
  @SerializedName(SERIALIZED_NAME_PORTWORX_VOLUME)
  private V1alpha1PodDecorationSpecTemplatePortworxVolume portworxVolume;

  public static final String SERIALIZED_NAME_PROJECTED = "projected";
  @SerializedName(SERIALIZED_NAME_PROJECTED)
  private V1alpha1PodDecorationSpecTemplateProjected projected;

  public static final String SERIALIZED_NAME_QUOBYTE = "quobyte";
  @SerializedName(SERIALIZED_NAME_QUOBYTE)
  private V1alpha1PodDecorationSpecTemplateQuobyte quobyte;

  public static final String SERIALIZED_NAME_RBD = "rbd";
  @SerializedName(SERIALIZED_NAME_RBD)
  private V1alpha1PodDecorationSpecTemplateRbd rbd;

  public static final String SERIALIZED_NAME_SCALE_I_O = "scaleIO";
  @SerializedName(SERIALIZED_NAME_SCALE_I_O)
  private V1alpha1PodDecorationSpecTemplateScaleIO scaleIO;

  public static final String SERIALIZED_NAME_SECRET = "secret";
  @SerializedName(SERIALIZED_NAME_SECRET)
  private V1alpha1PodDecorationSpecTemplateSecret secret;

  public static final String SERIALIZED_NAME_STORAGEOS = "storageos";
  @SerializedName(SERIALIZED_NAME_STORAGEOS)
  private V1alpha1PodDecorationSpecTemplateStorageos storageos;

  public static final String SERIALIZED_NAME_VSPHERE_VOLUME = "vsphereVolume";
  @SerializedName(SERIALIZED_NAME_VSPHERE_VOLUME)
  private V1alpha1PodDecorationSpecTemplateVsphereVolume vsphereVolume;


  public V1alpha1PodDecorationSpecTemplateVolumes awsElasticBlockStore(V1alpha1PodDecorationSpecTemplateAwsElasticBlockStore awsElasticBlockStore) {
    
    this.awsElasticBlockStore = awsElasticBlockStore;
    return this;
  }

   /**
   * Get awsElasticBlockStore
   * @return awsElasticBlockStore
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1PodDecorationSpecTemplateAwsElasticBlockStore getAwsElasticBlockStore() {
    return awsElasticBlockStore;
  }


  public void setAwsElasticBlockStore(V1alpha1PodDecorationSpecTemplateAwsElasticBlockStore awsElasticBlockStore) {
    this.awsElasticBlockStore = awsElasticBlockStore;
  }


  public V1alpha1PodDecorationSpecTemplateVolumes azureDisk(V1alpha1PodDecorationSpecTemplateAzureDisk azureDisk) {
    
    this.azureDisk = azureDisk;
    return this;
  }

   /**
   * Get azureDisk
   * @return azureDisk
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1PodDecorationSpecTemplateAzureDisk getAzureDisk() {
    return azureDisk;
  }


  public void setAzureDisk(V1alpha1PodDecorationSpecTemplateAzureDisk azureDisk) {
    this.azureDisk = azureDisk;
  }


  public V1alpha1PodDecorationSpecTemplateVolumes azureFile(V1alpha1PodDecorationSpecTemplateAzureFile azureFile) {
    
    this.azureFile = azureFile;
    return this;
  }

   /**
   * Get azureFile
   * @return azureFile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1PodDecorationSpecTemplateAzureFile getAzureFile() {
    return azureFile;
  }


  public void setAzureFile(V1alpha1PodDecorationSpecTemplateAzureFile azureFile) {
    this.azureFile = azureFile;
  }


  public V1alpha1PodDecorationSpecTemplateVolumes cephfs(V1alpha1PodDecorationSpecTemplateCephfs cephfs) {
    
    this.cephfs = cephfs;
    return this;
  }

   /**
   * Get cephfs
   * @return cephfs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1PodDecorationSpecTemplateCephfs getCephfs() {
    return cephfs;
  }


  public void setCephfs(V1alpha1PodDecorationSpecTemplateCephfs cephfs) {
    this.cephfs = cephfs;
  }


  public V1alpha1PodDecorationSpecTemplateVolumes cinder(V1alpha1PodDecorationSpecTemplateCinder cinder) {
    
    this.cinder = cinder;
    return this;
  }

   /**
   * Get cinder
   * @return cinder
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1PodDecorationSpecTemplateCinder getCinder() {
    return cinder;
  }


  public void setCinder(V1alpha1PodDecorationSpecTemplateCinder cinder) {
    this.cinder = cinder;
  }


  public V1alpha1PodDecorationSpecTemplateVolumes configMap(V1alpha1PodDecorationSpecTemplateConfigMap configMap) {
    
    this.configMap = configMap;
    return this;
  }

   /**
   * Get configMap
   * @return configMap
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1PodDecorationSpecTemplateConfigMap getConfigMap() {
    return configMap;
  }


  public void setConfigMap(V1alpha1PodDecorationSpecTemplateConfigMap configMap) {
    this.configMap = configMap;
  }


  public V1alpha1PodDecorationSpecTemplateVolumes csi(V1alpha1PodDecorationSpecTemplateCsi csi) {
    
    this.csi = csi;
    return this;
  }

   /**
   * Get csi
   * @return csi
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1PodDecorationSpecTemplateCsi getCsi() {
    return csi;
  }


  public void setCsi(V1alpha1PodDecorationSpecTemplateCsi csi) {
    this.csi = csi;
  }


  public V1alpha1PodDecorationSpecTemplateVolumes downwardAPI(V1alpha1PodDecorationSpecTemplateDownwardAPI downwardAPI) {
    
    this.downwardAPI = downwardAPI;
    return this;
  }

   /**
   * Get downwardAPI
   * @return downwardAPI
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1PodDecorationSpecTemplateDownwardAPI getDownwardAPI() {
    return downwardAPI;
  }


  public void setDownwardAPI(V1alpha1PodDecorationSpecTemplateDownwardAPI downwardAPI) {
    this.downwardAPI = downwardAPI;
  }


  public V1alpha1PodDecorationSpecTemplateVolumes emptyDir(V1alpha1PodDecorationSpecTemplateEmptyDir emptyDir) {
    
    this.emptyDir = emptyDir;
    return this;
  }

   /**
   * Get emptyDir
   * @return emptyDir
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1PodDecorationSpecTemplateEmptyDir getEmptyDir() {
    return emptyDir;
  }


  public void setEmptyDir(V1alpha1PodDecorationSpecTemplateEmptyDir emptyDir) {
    this.emptyDir = emptyDir;
  }


  public V1alpha1PodDecorationSpecTemplateVolumes ephemeral(V1alpha1PodDecorationSpecTemplateEphemeral ephemeral) {
    
    this.ephemeral = ephemeral;
    return this;
  }

   /**
   * Get ephemeral
   * @return ephemeral
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1PodDecorationSpecTemplateEphemeral getEphemeral() {
    return ephemeral;
  }


  public void setEphemeral(V1alpha1PodDecorationSpecTemplateEphemeral ephemeral) {
    this.ephemeral = ephemeral;
  }


  public V1alpha1PodDecorationSpecTemplateVolumes fc(V1alpha1PodDecorationSpecTemplateFc fc) {
    
    this.fc = fc;
    return this;
  }

   /**
   * Get fc
   * @return fc
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1PodDecorationSpecTemplateFc getFc() {
    return fc;
  }


  public void setFc(V1alpha1PodDecorationSpecTemplateFc fc) {
    this.fc = fc;
  }


  public V1alpha1PodDecorationSpecTemplateVolumes flexVolume(V1alpha1PodDecorationSpecTemplateFlexVolume flexVolume) {
    
    this.flexVolume = flexVolume;
    return this;
  }

   /**
   * Get flexVolume
   * @return flexVolume
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1PodDecorationSpecTemplateFlexVolume getFlexVolume() {
    return flexVolume;
  }


  public void setFlexVolume(V1alpha1PodDecorationSpecTemplateFlexVolume flexVolume) {
    this.flexVolume = flexVolume;
  }


  public V1alpha1PodDecorationSpecTemplateVolumes flocker(V1alpha1PodDecorationSpecTemplateFlocker flocker) {
    
    this.flocker = flocker;
    return this;
  }

   /**
   * Get flocker
   * @return flocker
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1PodDecorationSpecTemplateFlocker getFlocker() {
    return flocker;
  }


  public void setFlocker(V1alpha1PodDecorationSpecTemplateFlocker flocker) {
    this.flocker = flocker;
  }


  public V1alpha1PodDecorationSpecTemplateVolumes gcePersistentDisk(V1alpha1PodDecorationSpecTemplateGcePersistentDisk gcePersistentDisk) {
    
    this.gcePersistentDisk = gcePersistentDisk;
    return this;
  }

   /**
   * Get gcePersistentDisk
   * @return gcePersistentDisk
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1PodDecorationSpecTemplateGcePersistentDisk getGcePersistentDisk() {
    return gcePersistentDisk;
  }


  public void setGcePersistentDisk(V1alpha1PodDecorationSpecTemplateGcePersistentDisk gcePersistentDisk) {
    this.gcePersistentDisk = gcePersistentDisk;
  }


  public V1alpha1PodDecorationSpecTemplateVolumes gitRepo(V1alpha1PodDecorationSpecTemplateGitRepo gitRepo) {
    
    this.gitRepo = gitRepo;
    return this;
  }

   /**
   * Get gitRepo
   * @return gitRepo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1PodDecorationSpecTemplateGitRepo getGitRepo() {
    return gitRepo;
  }


  public void setGitRepo(V1alpha1PodDecorationSpecTemplateGitRepo gitRepo) {
    this.gitRepo = gitRepo;
  }


  public V1alpha1PodDecorationSpecTemplateVolumes glusterfs(V1alpha1PodDecorationSpecTemplateGlusterfs glusterfs) {
    
    this.glusterfs = glusterfs;
    return this;
  }

   /**
   * Get glusterfs
   * @return glusterfs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1PodDecorationSpecTemplateGlusterfs getGlusterfs() {
    return glusterfs;
  }


  public void setGlusterfs(V1alpha1PodDecorationSpecTemplateGlusterfs glusterfs) {
    this.glusterfs = glusterfs;
  }


  public V1alpha1PodDecorationSpecTemplateVolumes hostPath(V1alpha1PodDecorationSpecTemplateHostPath hostPath) {
    
    this.hostPath = hostPath;
    return this;
  }

   /**
   * Get hostPath
   * @return hostPath
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1PodDecorationSpecTemplateHostPath getHostPath() {
    return hostPath;
  }


  public void setHostPath(V1alpha1PodDecorationSpecTemplateHostPath hostPath) {
    this.hostPath = hostPath;
  }


  public V1alpha1PodDecorationSpecTemplateVolumes iscsi(V1alpha1PodDecorationSpecTemplateIscsi iscsi) {
    
    this.iscsi = iscsi;
    return this;
  }

   /**
   * Get iscsi
   * @return iscsi
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1PodDecorationSpecTemplateIscsi getIscsi() {
    return iscsi;
  }


  public void setIscsi(V1alpha1PodDecorationSpecTemplateIscsi iscsi) {
    this.iscsi = iscsi;
  }


  public V1alpha1PodDecorationSpecTemplateVolumes name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Volume&#39;s name. Must be a DNS_LABEL and unique within the pod. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Volume's name. Must be a DNS_LABEL and unique within the pod. More info: https://kubernetes.io/docs/concepts/overview/working-with-objects/names/#names")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public V1alpha1PodDecorationSpecTemplateVolumes nfs(V1alpha1PodDecorationSpecTemplateNfs nfs) {
    
    this.nfs = nfs;
    return this;
  }

   /**
   * Get nfs
   * @return nfs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1PodDecorationSpecTemplateNfs getNfs() {
    return nfs;
  }


  public void setNfs(V1alpha1PodDecorationSpecTemplateNfs nfs) {
    this.nfs = nfs;
  }


  public V1alpha1PodDecorationSpecTemplateVolumes persistentVolumeClaim(V1alpha1PodDecorationSpecTemplatePersistentVolumeClaim persistentVolumeClaim) {
    
    this.persistentVolumeClaim = persistentVolumeClaim;
    return this;
  }

   /**
   * Get persistentVolumeClaim
   * @return persistentVolumeClaim
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1PodDecorationSpecTemplatePersistentVolumeClaim getPersistentVolumeClaim() {
    return persistentVolumeClaim;
  }


  public void setPersistentVolumeClaim(V1alpha1PodDecorationSpecTemplatePersistentVolumeClaim persistentVolumeClaim) {
    this.persistentVolumeClaim = persistentVolumeClaim;
  }


  public V1alpha1PodDecorationSpecTemplateVolumes photonPersistentDisk(V1alpha1PodDecorationSpecTemplatePhotonPersistentDisk photonPersistentDisk) {
    
    this.photonPersistentDisk = photonPersistentDisk;
    return this;
  }

   /**
   * Get photonPersistentDisk
   * @return photonPersistentDisk
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1PodDecorationSpecTemplatePhotonPersistentDisk getPhotonPersistentDisk() {
    return photonPersistentDisk;
  }


  public void setPhotonPersistentDisk(V1alpha1PodDecorationSpecTemplatePhotonPersistentDisk photonPersistentDisk) {
    this.photonPersistentDisk = photonPersistentDisk;
  }


  public V1alpha1PodDecorationSpecTemplateVolumes portworxVolume(V1alpha1PodDecorationSpecTemplatePortworxVolume portworxVolume) {
    
    this.portworxVolume = portworxVolume;
    return this;
  }

   /**
   * Get portworxVolume
   * @return portworxVolume
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1PodDecorationSpecTemplatePortworxVolume getPortworxVolume() {
    return portworxVolume;
  }


  public void setPortworxVolume(V1alpha1PodDecorationSpecTemplatePortworxVolume portworxVolume) {
    this.portworxVolume = portworxVolume;
  }


  public V1alpha1PodDecorationSpecTemplateVolumes projected(V1alpha1PodDecorationSpecTemplateProjected projected) {
    
    this.projected = projected;
    return this;
  }

   /**
   * Get projected
   * @return projected
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1PodDecorationSpecTemplateProjected getProjected() {
    return projected;
  }


  public void setProjected(V1alpha1PodDecorationSpecTemplateProjected projected) {
    this.projected = projected;
  }


  public V1alpha1PodDecorationSpecTemplateVolumes quobyte(V1alpha1PodDecorationSpecTemplateQuobyte quobyte) {
    
    this.quobyte = quobyte;
    return this;
  }

   /**
   * Get quobyte
   * @return quobyte
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1PodDecorationSpecTemplateQuobyte getQuobyte() {
    return quobyte;
  }


  public void setQuobyte(V1alpha1PodDecorationSpecTemplateQuobyte quobyte) {
    this.quobyte = quobyte;
  }


  public V1alpha1PodDecorationSpecTemplateVolumes rbd(V1alpha1PodDecorationSpecTemplateRbd rbd) {
    
    this.rbd = rbd;
    return this;
  }

   /**
   * Get rbd
   * @return rbd
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1PodDecorationSpecTemplateRbd getRbd() {
    return rbd;
  }


  public void setRbd(V1alpha1PodDecorationSpecTemplateRbd rbd) {
    this.rbd = rbd;
  }


  public V1alpha1PodDecorationSpecTemplateVolumes scaleIO(V1alpha1PodDecorationSpecTemplateScaleIO scaleIO) {
    
    this.scaleIO = scaleIO;
    return this;
  }

   /**
   * Get scaleIO
   * @return scaleIO
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1PodDecorationSpecTemplateScaleIO getScaleIO() {
    return scaleIO;
  }


  public void setScaleIO(V1alpha1PodDecorationSpecTemplateScaleIO scaleIO) {
    this.scaleIO = scaleIO;
  }


  public V1alpha1PodDecorationSpecTemplateVolumes secret(V1alpha1PodDecorationSpecTemplateSecret secret) {
    
    this.secret = secret;
    return this;
  }

   /**
   * Get secret
   * @return secret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1PodDecorationSpecTemplateSecret getSecret() {
    return secret;
  }


  public void setSecret(V1alpha1PodDecorationSpecTemplateSecret secret) {
    this.secret = secret;
  }


  public V1alpha1PodDecorationSpecTemplateVolumes storageos(V1alpha1PodDecorationSpecTemplateStorageos storageos) {
    
    this.storageos = storageos;
    return this;
  }

   /**
   * Get storageos
   * @return storageos
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1PodDecorationSpecTemplateStorageos getStorageos() {
    return storageos;
  }


  public void setStorageos(V1alpha1PodDecorationSpecTemplateStorageos storageos) {
    this.storageos = storageos;
  }


  public V1alpha1PodDecorationSpecTemplateVolumes vsphereVolume(V1alpha1PodDecorationSpecTemplateVsphereVolume vsphereVolume) {
    
    this.vsphereVolume = vsphereVolume;
    return this;
  }

   /**
   * Get vsphereVolume
   * @return vsphereVolume
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public V1alpha1PodDecorationSpecTemplateVsphereVolume getVsphereVolume() {
    return vsphereVolume;
  }


  public void setVsphereVolume(V1alpha1PodDecorationSpecTemplateVsphereVolume vsphereVolume) {
    this.vsphereVolume = vsphereVolume;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1PodDecorationSpecTemplateVolumes v1alpha1PodDecorationSpecTemplateVolumes = (V1alpha1PodDecorationSpecTemplateVolumes) o;
    return Objects.equals(this.awsElasticBlockStore, v1alpha1PodDecorationSpecTemplateVolumes.awsElasticBlockStore) &&
        Objects.equals(this.azureDisk, v1alpha1PodDecorationSpecTemplateVolumes.azureDisk) &&
        Objects.equals(this.azureFile, v1alpha1PodDecorationSpecTemplateVolumes.azureFile) &&
        Objects.equals(this.cephfs, v1alpha1PodDecorationSpecTemplateVolumes.cephfs) &&
        Objects.equals(this.cinder, v1alpha1PodDecorationSpecTemplateVolumes.cinder) &&
        Objects.equals(this.configMap, v1alpha1PodDecorationSpecTemplateVolumes.configMap) &&
        Objects.equals(this.csi, v1alpha1PodDecorationSpecTemplateVolumes.csi) &&
        Objects.equals(this.downwardAPI, v1alpha1PodDecorationSpecTemplateVolumes.downwardAPI) &&
        Objects.equals(this.emptyDir, v1alpha1PodDecorationSpecTemplateVolumes.emptyDir) &&
        Objects.equals(this.ephemeral, v1alpha1PodDecorationSpecTemplateVolumes.ephemeral) &&
        Objects.equals(this.fc, v1alpha1PodDecorationSpecTemplateVolumes.fc) &&
        Objects.equals(this.flexVolume, v1alpha1PodDecorationSpecTemplateVolumes.flexVolume) &&
        Objects.equals(this.flocker, v1alpha1PodDecorationSpecTemplateVolumes.flocker) &&
        Objects.equals(this.gcePersistentDisk, v1alpha1PodDecorationSpecTemplateVolumes.gcePersistentDisk) &&
        Objects.equals(this.gitRepo, v1alpha1PodDecorationSpecTemplateVolumes.gitRepo) &&
        Objects.equals(this.glusterfs, v1alpha1PodDecorationSpecTemplateVolumes.glusterfs) &&
        Objects.equals(this.hostPath, v1alpha1PodDecorationSpecTemplateVolumes.hostPath) &&
        Objects.equals(this.iscsi, v1alpha1PodDecorationSpecTemplateVolumes.iscsi) &&
        Objects.equals(this.name, v1alpha1PodDecorationSpecTemplateVolumes.name) &&
        Objects.equals(this.nfs, v1alpha1PodDecorationSpecTemplateVolumes.nfs) &&
        Objects.equals(this.persistentVolumeClaim, v1alpha1PodDecorationSpecTemplateVolumes.persistentVolumeClaim) &&
        Objects.equals(this.photonPersistentDisk, v1alpha1PodDecorationSpecTemplateVolumes.photonPersistentDisk) &&
        Objects.equals(this.portworxVolume, v1alpha1PodDecorationSpecTemplateVolumes.portworxVolume) &&
        Objects.equals(this.projected, v1alpha1PodDecorationSpecTemplateVolumes.projected) &&
        Objects.equals(this.quobyte, v1alpha1PodDecorationSpecTemplateVolumes.quobyte) &&
        Objects.equals(this.rbd, v1alpha1PodDecorationSpecTemplateVolumes.rbd) &&
        Objects.equals(this.scaleIO, v1alpha1PodDecorationSpecTemplateVolumes.scaleIO) &&
        Objects.equals(this.secret, v1alpha1PodDecorationSpecTemplateVolumes.secret) &&
        Objects.equals(this.storageos, v1alpha1PodDecorationSpecTemplateVolumes.storageos) &&
        Objects.equals(this.vsphereVolume, v1alpha1PodDecorationSpecTemplateVolumes.vsphereVolume);
  }

  @Override
  public int hashCode() {
    return Objects.hash(awsElasticBlockStore, azureDisk, azureFile, cephfs, cinder, configMap, csi, downwardAPI, emptyDir, ephemeral, fc, flexVolume, flocker, gcePersistentDisk, gitRepo, glusterfs, hostPath, iscsi, name, nfs, persistentVolumeClaim, photonPersistentDisk, portworxVolume, projected, quobyte, rbd, scaleIO, secret, storageos, vsphereVolume);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1PodDecorationSpecTemplateVolumes {\n");
    sb.append("    awsElasticBlockStore: ").append(toIndentedString(awsElasticBlockStore)).append("\n");
    sb.append("    azureDisk: ").append(toIndentedString(azureDisk)).append("\n");
    sb.append("    azureFile: ").append(toIndentedString(azureFile)).append("\n");
    sb.append("    cephfs: ").append(toIndentedString(cephfs)).append("\n");
    sb.append("    cinder: ").append(toIndentedString(cinder)).append("\n");
    sb.append("    configMap: ").append(toIndentedString(configMap)).append("\n");
    sb.append("    csi: ").append(toIndentedString(csi)).append("\n");
    sb.append("    downwardAPI: ").append(toIndentedString(downwardAPI)).append("\n");
    sb.append("    emptyDir: ").append(toIndentedString(emptyDir)).append("\n");
    sb.append("    ephemeral: ").append(toIndentedString(ephemeral)).append("\n");
    sb.append("    fc: ").append(toIndentedString(fc)).append("\n");
    sb.append("    flexVolume: ").append(toIndentedString(flexVolume)).append("\n");
    sb.append("    flocker: ").append(toIndentedString(flocker)).append("\n");
    sb.append("    gcePersistentDisk: ").append(toIndentedString(gcePersistentDisk)).append("\n");
    sb.append("    gitRepo: ").append(toIndentedString(gitRepo)).append("\n");
    sb.append("    glusterfs: ").append(toIndentedString(glusterfs)).append("\n");
    sb.append("    hostPath: ").append(toIndentedString(hostPath)).append("\n");
    sb.append("    iscsi: ").append(toIndentedString(iscsi)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nfs: ").append(toIndentedString(nfs)).append("\n");
    sb.append("    persistentVolumeClaim: ").append(toIndentedString(persistentVolumeClaim)).append("\n");
    sb.append("    photonPersistentDisk: ").append(toIndentedString(photonPersistentDisk)).append("\n");
    sb.append("    portworxVolume: ").append(toIndentedString(portworxVolume)).append("\n");
    sb.append("    projected: ").append(toIndentedString(projected)).append("\n");
    sb.append("    quobyte: ").append(toIndentedString(quobyte)).append("\n");
    sb.append("    rbd: ").append(toIndentedString(rbd)).append("\n");
    sb.append("    scaleIO: ").append(toIndentedString(scaleIO)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    storageos: ").append(toIndentedString(storageos)).append("\n");
    sb.append("    vsphereVolume: ").append(toIndentedString(vsphereVolume)).append("\n");
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

