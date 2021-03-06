/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package foobar.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The FailedToLockException model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("FailedToLockException")
public class FailedToLockException extends PictureparkBusinessException {
    /**
     * The resourceId property.
     */
    @JsonProperty(value = "resourceId")
    private String resourceId;

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
     * @return the FailedToLockException object itself.
     */
    public FailedToLockException withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

}
