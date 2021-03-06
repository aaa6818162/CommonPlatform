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
 * The UpdateContentMetadataRequest model.
 */
public class UpdateContentMetadataRequest {
    /**
     * The content id.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * An id list of schemas with schema type content or layer.
     */
    @JsonProperty(value = "schemaIds")
    private List<String> schemaIds;

    /**
     * The metadata property.
     */
    @JsonProperty(value = "metadata")
    private Map<String, Object> metadata;

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set
     * @return the UpdateContentMetadataRequest object itself.
     */
    public UpdateContentMetadataRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the schemaIds value.
     *
     * @return the schemaIds value
     */
    public List<String> schemaIds() {
        return this.schemaIds;
    }

    /**
     * Set the schemaIds value.
     *
     * @param schemaIds the schemaIds value to set
     * @return the UpdateContentMetadataRequest object itself.
     */
    public UpdateContentMetadataRequest withSchemaIds(List<String> schemaIds) {
        this.schemaIds = schemaIds;
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
     * @return the UpdateContentMetadataRequest object itself.
     */
    public UpdateContentMetadataRequest withMetadata(Map<String, Object> metadata) {
        this.metadata = metadata;
        return this;
    }

}
