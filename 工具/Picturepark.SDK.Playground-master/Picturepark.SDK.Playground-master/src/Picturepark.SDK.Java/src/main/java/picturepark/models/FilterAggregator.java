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
 * The FilterAggregator is a single bucket aggregation of documents that match
 * a specified filter.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "kind")
@JsonTypeName("FilterAggregator")
public class FilterAggregator extends AggregatorBase {
    /**
     * Limits the result set.
     */
    @JsonProperty(value = "filter")
    private FilterBase filter;

    /**
     * Get the filter value.
     *
     * @return the filter value
     */
    public FilterBase filter() {
        return this.filter;
    }

    /**
     * Set the filter value.
     *
     * @param filter the filter value to set
     * @return the FilterAggregator object itself.
     */
    public FilterAggregator withFilter(FilterBase filter) {
        this.filter = filter;
        return this;
    }

}
