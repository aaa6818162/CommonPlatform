/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package foobar.models;

import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The FileTransfer2ContentCreateRequest model.
 */
public class FileTransfer2ContentCreateRequest {
    /**
     * The transferId property.
     */
    @JsonProperty(value = "transferId")
    private String transferId;

    /**
     * An optional id list of schemas with type layer.
     */
    @JsonProperty(value = "layerSchemaIds")
    private List<String> layerSchemaIds;

    /**
     * The metadata property.
     */
    @JsonProperty(value = "metadata")
    private Map<String, Object> metadata;

    /**
     * An optional id list of content permission sets. Controls content
     * accessibility outside of content ownership.
     */
    @JsonProperty(value = "contentPermissionSetIds")
    private List<String> contentPermissionSetIds;

    /**
     * Get the transferId value.
     *
     * @return the transferId value
     */
    public String transferId() {
        return this.transferId;
    }

    /**
     * Set the transferId value.
     *
     * @param transferId the transferId value to set
     * @return the FileTransfer2ContentCreateRequest object itself.
     */
    public FileTransfer2ContentCreateRequest withTransferId(String transferId) {
        this.transferId = transferId;
        return this;
    }

    /**
     * Get the layerSchemaIds value.
     *
     * @return the layerSchemaIds value
     */
    public List<String> layerSchemaIds() {
        return this.layerSchemaIds;
    }

    /**
     * Set the layerSchemaIds value.
     *
     * @param layerSchemaIds the layerSchemaIds value to set
     * @return the FileTransfer2ContentCreateRequest object itself.
     */
    public FileTransfer2ContentCreateRequest withLayerSchemaIds(List<String> layerSchemaIds) {
        this.layerSchemaIds = layerSchemaIds;
        return this;
    }

    /**
     * Get the metadata value.
     *
     * @return the metadata value
     */
    public Map<String, Object> metadata() {
        return this.metadata;
    }

    /**
     * Set the metadata value.
     *
     * @param metadata the metadata value to set
     * @return the FileTransfer2ContentCreateRequest object itself.
     */
    public FileTransfer2ContentCreateRequest withMetadata(Map<String, Object> metadata) {
        this.metadata = metadata;
        return this;
    }

    /**
     * Get the contentPermissionSetIds value.
     *
     * @return the contentPermissionSetIds value
     */
    public List<String> contentPermissionSetIds() {
        return this.contentPermissionSetIds;
    }

    /**
     * Set the contentPermissionSetIds value.
     *
     * @param contentPermissionSetIds the contentPermissionSetIds value to set
     * @return the FileTransfer2ContentCreateRequest object itself.
     */
    public FileTransfer2ContentCreateRequest withContentPermissionSetIds(List<String> contentPermissionSetIds) {
        this.contentPermissionSetIds = contentPermissionSetIds;
        return this;
    }

}
