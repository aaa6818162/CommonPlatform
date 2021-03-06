/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package foobar.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The StorageRootCause model.
 */
public class StorageRootCause {
    /**
     * The index property.
     */
    @JsonProperty(value = "index")
    private String index;

    /**
     * The reason property.
     */
    @JsonProperty(value = "reason")
    private String reason;

    /**
     * The resourceId property.
     */
    @JsonProperty(value = "resourceId")
    private String resourceId;

    /**
     * The resourceType property.
     */
    @JsonProperty(value = "resourceType")
    private String resourceType;

    /**
     * The type property.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * Get the index value.
     *
     * @return the index value
     */
    public String index() {
        return this.index;
    }

    /**
     * Set the index value.
     *
     * @param index the index value to set
     * @return the StorageRootCause object itself.
     */
    public StorageRootCause withIndex(String index) {
        this.index = index;
        return this;
    }

    /**
     * Get the reason value.
     *
     * @return the reason value
     */
    public String reason() {
        return this.reason;
    }

    /**
     * Set the reason value.
     *
     * @param reason the reason value to set
     * @return the StorageRootCause object itself.
     */
    public StorageRootCause withReason(String reason) {
        this.reason = reason;
        return this;
    }

    /**
     * Get the resourceId value.
     *
     * @return the resourceId value
     */
    public String resourceId() {
        return this.resourceId;
    }

    /**
     * Set the resourceId value.
     *
     * @param resourceId the resourceId value to set
     * @return the StorageRootCause object itself.
     */
    public StorageRootCause withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * Get the resourceType value.
     *
     * @return the resourceType value
     */
    public String resourceType() {
        return this.resourceType;
    }

    /**
     * Set the resourceType value.
     *
     * @param resourceType the resourceType value to set
     * @return the StorageRootCause object itself.
     */
    public StorageRootCause withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * Get the type value.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type value.
     *
     * @param type the type value to set
     * @return the StorageRootCause object itself.
     */
    public StorageRootCause withType(String type) {
        this.type = type;
        return this;
    }

}
