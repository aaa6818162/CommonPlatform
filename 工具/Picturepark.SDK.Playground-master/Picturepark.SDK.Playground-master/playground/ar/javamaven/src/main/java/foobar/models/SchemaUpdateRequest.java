/**
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package foobar.models;

import java.util.Map;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The SchemaUpdateRequest model.
 */
public class SchemaUpdateRequest {
    /**
     * The names property.
     */
    @JsonProperty(value = "names")
    private Map<String, String> names;

    /**
     * The descriptions property.
     */
    @JsonProperty(value = "descriptions")
    private Map<String, String> descriptions;

    /**
     * Language specific DotLiquid templates. These templates will be resolved
     * into display values in content documents and/or list items.
     */
    @JsonProperty(value = "displayPatterns")
    private List<DisplayPattern> displayPatterns;

    /**
     * The schema fields.
     */
    @JsonProperty(value = "fields")
    private List<FieldBase> fields;

    /**
     * An optional list of aggregations to group content documents and list
     * items.
     */
    @JsonProperty(value = "aggregations")
    private List<AggregatorBase> aggregations;

    /**
     * A simple ordering property for schemas.
     */
    @JsonProperty(value = "sortOrder", required = true)
    private int sortOrder;

    /**
     * Sorts content documents and/or list items.
     */
    @JsonProperty(value = "sort")
    private List<SortInfo> sort;

    /**
     * Opens schema accessibility.
     */
    @JsonProperty(value = "public", required = true)
    private boolean publicProperty;

    /**
     * An optional id list of schema permission sets which control list item
     * permissions. When not empty Public must be false.
     */
    @JsonProperty(value = "schemaPermissionSetIds")
    private List<String> schemaPermissionSetIds;

    /**
     * An optional id list of schemas with type layer.
     */
    @JsonProperty(value = "layerSchemaIds")
    private List<String> layerSchemaIds;

    /**
     * An optional id list of schemas with type content for a schema with type
     * layer.
     */
    @JsonProperty(value = "referencedInContentSchemaIds")
    private List<String> referencedInContentSchemaIds;

    /**
     * Types control schema usage. Schema types can only be added, but not
     * removed.
     */
    @JsonProperty(value = "types")
    private List<String> types;

    /**
     * Get the names value.
     *
     * @return the names value
     */
    public Map<String, String> names() {
        return this.names;
    }

    /**
     * Set the names value.
     *
     * @param names the names value to set
     * @return the SchemaUpdateRequest object itself.
     */
    public SchemaUpdateRequest withNames(Map<String, String> names) {
        this.names = names;
        return this;
    }

    /**
     * Get the descriptions value.
     *
     * @return the descriptions value
     */
    public Map<String, String> descriptions() {
        return this.descriptions;
    }

    /**
     * Set the descriptions value.
     *
     * @param descriptions the descriptions value to set
     * @return the SchemaUpdateRequest object itself.
     */
    public SchemaUpdateRequest withDescriptions(Map<String, String> descriptions) {
        this.descriptions = descriptions;
        return this;
    }

    /**
     * Get the displayPatterns value.
     *
     * @return the displayPatterns value
     */
    public List<DisplayPattern> displayPatterns() {
        return this.displayPatterns;
    }

    /**
     * Set the displayPatterns value.
     *
     * @param displayPatterns the displayPatterns value to set
     * @return the SchemaUpdateRequest object itself.
     */
    public SchemaUpdateRequest withDisplayPatterns(List<DisplayPattern> displayPatterns) {
        this.displayPatterns = displayPatterns;
        return this;
    }

    /**
     * Get the fields value.
     *
     * @return the fields value
     */
    public List<FieldBase> fields() {
        return this.fields;
    }

    /**
     * Set the fields value.
     *
     * @param fields the fields value to set
     * @return the SchemaUpdateRequest object itself.
     */
    public SchemaUpdateRequest withFields(List<FieldBase> fields) {
        this.fields = fields;
        return this;
    }

    /**
     * Get the aggregations value.
     *
     * @return the aggregations value
     */
    public List<AggregatorBase> aggregations() {
        return this.aggregations;
    }

    /**
     * Set the aggregations value.
     *
     * @param aggregations the aggregations value to set
     * @return the SchemaUpdateRequest object itself.
     */
    public SchemaUpdateRequest withAggregations(List<AggregatorBase> aggregations) {
        this.aggregations = aggregations;
        return this;
    }

    /**
     * Get the sortOrder value.
     *
     * @return the sortOrder value
     */
    public int sortOrder() {
        return this.sortOrder;
    }

    /**
     * Set the sortOrder value.
     *
     * @param sortOrder the sortOrder value to set
     * @return the SchemaUpdateRequest object itself.
     */
    public SchemaUpdateRequest withSortOrder(int sortOrder) {
        this.sortOrder = sortOrder;
        return this;
    }

    /**
     * Get the sort value.
     *
     * @return the sort value
     */
    public List<SortInfo> sort() {
        return this.sort;
    }

    /**
     * Set the sort value.
     *
     * @param sort the sort value to set
     * @return the SchemaUpdateRequest object itself.
     */
    public SchemaUpdateRequest withSort(List<SortInfo> sort) {
        this.sort = sort;
        return this;
    }

    /**
     * Get the publicProperty value.
     *
     * @return the publicProperty value
     */
    public boolean publicProperty() {
        return this.publicProperty;
    }

    /**
     * Set the publicProperty value.
     *
     * @param publicProperty the publicProperty value to set
     * @return the SchemaUpdateRequest object itself.
     */
    public SchemaUpdateRequest withPublicProperty(boolean publicProperty) {
        this.publicProperty = publicProperty;
        return this;
    }

    /**
     * Get the schemaPermissionSetIds value.
     *
     * @return the schemaPermissionSetIds value
     */
    public List<String> schemaPermissionSetIds() {
        return this.schemaPermissionSetIds;
    }

    /**
     * Set the schemaPermissionSetIds value.
     *
     * @param schemaPermissionSetIds the schemaPermissionSetIds value to set
     * @return the SchemaUpdateRequest object itself.
     */
    public SchemaUpdateRequest withSchemaPermissionSetIds(List<String> schemaPermissionSetIds) {
        this.schemaPermissionSetIds = schemaPermissionSetIds;
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
     * @return the SchemaUpdateRequest object itself.
     */
    public SchemaUpdateRequest withLayerSchemaIds(List<String> layerSchemaIds) {
        this.layerSchemaIds = layerSchemaIds;
        return this;
    }

    /**
     * Get the referencedInContentSchemaIds value.
     *
     * @return the referencedInContentSchemaIds value
     */
    public List<String> referencedInContentSchemaIds() {
        return this.referencedInContentSchemaIds;
    }

    /**
     * Set the referencedInContentSchemaIds value.
     *
     * @param referencedInContentSchemaIds the referencedInContentSchemaIds value to set
     * @return the SchemaUpdateRequest object itself.
     */
    public SchemaUpdateRequest withReferencedInContentSchemaIds(List<String> referencedInContentSchemaIds) {
        this.referencedInContentSchemaIds = referencedInContentSchemaIds;
        return this;
    }

    /**
     * Get the types value.
     *
     * @return the types value
     */
    public List<String> types() {
        return this.types;
    }

    /**
     * Set the types value.
     *
     * @param types the types value to set
     * @return the SchemaUpdateRequest object itself.
     */
    public SchemaUpdateRequest withTypes(List<String> types) {
        this.types = types;
        return this;
    }

}
