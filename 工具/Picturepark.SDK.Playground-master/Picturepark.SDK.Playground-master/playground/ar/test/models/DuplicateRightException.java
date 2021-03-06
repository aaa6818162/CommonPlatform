/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package picturepark.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * The DuplicateRightException model.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("DuplicateRightException")
public class DuplicateRightException extends PictureparkBusinessException {
    /**
     * The permissionSetId property.
     */
    @JsonProperty(value = "permissionSetId")
    private String permissionSetId;

    /**
     * Get the permissionSetId value.
     *
     * @return the permissionSetId value
     */
    public String permissionSetId() {
        return this.permissionSetId;
    }

    /**
     * Set the permissionSetId value.
     *
     * @param permissionSetId the permissionSetId value to set
     * @return the DuplicateRightException object itself.
     */
    public DuplicateRightException withPermissionSetId(String permissionSetId) {
        this.permissionSetId = permissionSetId;
        return this;
    }

}
